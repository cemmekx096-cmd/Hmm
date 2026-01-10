package com.helpshift.user;

import com.crashlytics.android.BuildConfig;
import com.helpshift.chat.HSEventProxy;
import com.helpshift.log.HSLogger;
import com.helpshift.platform.Device;
import com.helpshift.util.JsonUtils;
import com.helpshift.util.Utils;
import com.helpshift.util.ValuePair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IdentityValidationUtil {
    private static final String TAG = "IdentityValidationUtils";

    private IdentityValidationUtil() {
    }

    static void addUserIdentities(BaseUser baseUser, Device device, String str, HSEventProxy hSEventProxy) {
        if ((baseUser instanceof AnonymousUserWithIdentity) || !(baseUser instanceof UserWithIdentity)) {
            HSLogger.d(TAG, "API call not allowed for user type other than Identity user");
            return;
        }
        if (!Utils.isJWTValid(str, device)) {
            HSLogger.d(TAG, "Bad identity token.Can't add user identities");
            hSEventProxy.sendEvent("identityTokenInvalid", (Map) null);
            return;
        }
        UserWithIdentity userWithIdentity = (UserWithIdentity) baseUser;
        if (Utils.getSignatureFromJwtToken(str).equals(userWithIdentity.getSignature())) {
            HSLogger.d(TAG, "Skipping call since current user has same identities");
            return;
        }
        JSONObject jsonObjectFromJwt = Utils.getJsonObjectFromJwt(device, str);
        if (JsonUtils.isEmpty(jsonObjectFromJwt)) {
            HSLogger.d(TAG, "Empty json object in token");
            hSEventProxy.sendEvent("identityTokenInvalid", (Map) null);
            return;
        }
        if (jsonObjectFromJwt.optLong("iat", 0L) == 0) {
            HSLogger.d(TAG, "iat is mandatory in token");
            hSEventProxy.sendEvent("iatIsMandatory", (Map) null);
        } else if (userWithIdentity.getUnSyncIdentitiesList().size() > 1000) {
            HSLogger.d(TAG, "UnSync storage limit for identities exceeded");
        } else if (!validateAddIdentitiesData(jsonObjectFromJwt, hSEventProxy)) {
            HSLogger.d(TAG, "Invalid Data.Failing addUserIdentities call");
        } else {
            userWithIdentity.addUnSyncIdentities(str);
        }
    }

    private static boolean validateAddIdentitiesData(JSONObject jSONObject, HSEventProxy hSEventProxy) {
        List<InternalIdentity> identitiesFromTokenJsonObject = getIdentitiesFromTokenJsonObject(jSONObject);
        if (Utils.isEmpty(identitiesFromTokenJsonObject)) {
            HSLogger.d(TAG, "Identity data is empty or invalid");
            hSEventProxy.sendEvent("identityTokenInvalid", (Map) null);
            return false;
        }
        if (identitiesFromTokenJsonObject.size() > 100) {
            HSLogger.d(TAG, "Identity data exceeds limit");
            hSEventProxy.sendEvent("identityDataLimitExceeded", (Map) null);
            return false;
        }
        ArrayList arrayList = new ArrayList(validateIdentityList(identitiesFromTokenJsonObject));
        if (arrayList.isEmpty()) {
            return true;
        }
        HSLogger.d(TAG, "Identity data contains invalid data");
        IdentityAttributesUtil.sendUserIdentityAttributeFailureEvent("identityDataInvalid", arrayList, hSEventProxy);
        return false;
    }

    private static List<ValuePair<String, String>> validateIdentityList(List<InternalIdentity> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            InternalIdentity internalIdentity = list.get(i);
            String strValidateIdentity = validateIdentity(internalIdentity);
            if (!Utils.isEmpty(strValidateIdentity)) {
                arrayList.add(ValuePair.from(internalIdentity.identityKey, strValidateIdentity));
            }
        }
        return arrayList;
    }

    private static String validateIdentity(InternalIdentity internalIdentity) {
        return (Utils.isEmpty(internalIdentity.identityKey) || Utils.isEmpty(internalIdentity.identityValue)) ? "emptyData" : internalIdentity.identityKey.length() > 1000 ? "exceededKeyLengthLimit" : internalIdentity.identityValue.length() > 10000 ? "exceededValueLengthLimit" : validateIdentityMetaDataMap(internalIdentity.metaData);
    }

    private static String validateIdentityMetaDataMap(Map<String, String> map) {
        if (map.size() > 100) {
            return "metadataExceededCountLimit";
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (Utils.isEmpty(key) || value == null) {
                return "metadataEmptyKeyOrValue";
            }
            if (key.length() > 1000) {
                return "metadataExceededKeyLengthLimit";
            }
            if (value.length() > 10000) {
                return "metadataExceededValueLengthLimit";
            }
        }
        return BuildConfig.FLAVOR;
    }

    static ValuePair<String, Map<String, String>> validateIdentitiesForLogin(List<InternalIdentity> list, boolean z) {
        if (list == null) {
            HSLogger.d(TAG, "Identity data is empty or contains null entries");
            return ValuePair.from("identitiesDataInvalid", (Object) null);
        }
        if (list.size() > 100) {
            HSLogger.d(TAG, "Identity data exceeded limit");
            return ValuePair.from("identitiesSizeLimitExceeded", (Object) null);
        }
        List<ValuePair<String, String>> listValidateIdentityList = validateIdentityList(list);
        if (!listValidateIdentityList.isEmpty()) {
            return ValuePair.from("identitiesDataInvalid", getErrorMapFromValuePair(listValidateIdentityList));
        }
        if (list.isEmpty() || z || isUidOrEmailPresent(list)) {
            return null;
        }
        return ValuePair.from("uidOrEmailIsMandatory", (Object) null);
    }

    private static Map<String, String> getErrorMapFromValuePair(List<ValuePair<String, String>> list) {
        HashMap map = new HashMap();
        for (ValuePair<String, String> valuePair : list) {
            map.put((String) valuePair.first, (String) valuePair.second);
        }
        return map;
    }

    static ValuePair<String, Map<String, String>> validateLoginConfig(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        map.remove(null);
        map.remove(BuildConfig.FLAVOR);
        if (map.size() > 100) {
            HSLogger.d(TAG, "Login Config exceeded limit");
            return ValuePair.from("loginConfigSizeLimitExceeded", (Object) null);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value == null) {
                arrayList.add(ValuePair.from(key, "emptyData"));
            } else if (key.length() > 1000) {
                arrayList.add(ValuePair.from(key, "exceededKeyLengthLimit"));
            } else if (!(value instanceof Number) && !(value instanceof Boolean) && !(value instanceof String)) {
                arrayList.add(ValuePair.from(key, "invalidValueType"));
            } else if ((value instanceof String) && ((String) value).length() > 10000) {
                arrayList.add(ValuePair.from(key, "exceededValueLengthLimit"));
            }
        }
        if (Utils.isEmpty(arrayList)) {
            return null;
        }
        return ValuePair.from("loginConfigInvalid", getErrorMapFromValuePair(arrayList));
    }

    private static boolean isUidOrEmailPresent(List<InternalIdentity> list) {
        return list.isEmpty() || InternalIdentityUtils.isIdentifierPresent(list, "uid") || InternalIdentityUtils.isIdentifierPresent(list, "email");
    }

    static List<InternalIdentity> getIdentitiesFromTokenJsonObject(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("identities");
            return JsonUtils.isEmpty(jSONArrayOptJSONArray) ? arrayList : InternalIdentityUtils.getIdentityFromJsonArrayString(jSONArrayOptJSONArray.toString());
        } catch (Exception e) {
            HSLogger.e(TAG, "Error in getting identities fromm  JWT json object", e);
            return arrayList;
        }
    }

    static boolean isNewIdentityUserSame(Map<String, Object> map, Map<String, Object> map2) {
        boolean zBooleanValue = ((Boolean) Utils.getOrDefault(map2, "full_privacy_enabled", false)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) Utils.getOrDefault(map, "full_privacy_enabled", false)).booleanValue();
        String str = (String) Utils.getOrDefault(map2, "identitiesSignature", BuildConfig.FLAVOR);
        String str2 = (String) Utils.getOrDefault(map, "identitiesSignature", BuildConfig.FLAVOR);
        String str3 = (String) Utils.getOrDefault(map2, "identities_hash_list", BuildConfig.FLAVOR);
        String str4 = (String) Utils.getOrDefault(map, "identities_hash_list", BuildConfig.FLAVOR);
        if (zBooleanValue != zBooleanValue2 || !str.equals(str2)) {
            return false;
        }
        List listListFromJsonArrayString = JsonUtils.listFromJsonArrayString(str3);
        Iterator it = JsonUtils.listFromJsonArrayString(str4).iterator();
        while (it.hasNext()) {
            if (!listListFromJsonArrayString.contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
