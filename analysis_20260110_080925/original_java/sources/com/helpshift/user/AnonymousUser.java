package com.helpshift.user;

import com.crashlytics.android.BuildConfig;
import com.helpshift.storage.HSPersistentStorage;
import com.helpshift.util.JsonUtils;
import com.helpshift.util.Utils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class AnonymousUser extends BaseUser {
    private static final String ANON_USER_DATA = "anon_user_data";

    protected void cleanupUser() {
    }

    protected boolean isUserDataNeededForNetworkCall() {
        return true;
    }

    public AnonymousUser(HSPersistentStorage hSPersistentStorage) {
        super(hSPersistentStorage);
    }

    protected boolean isUserSame(Map<String, Object> map) {
        Map mapJsonStringToStringMap = JsonUtils.jsonStringToStringMap(this.persistentStorage.getAnonymousUserIdMap());
        return Utils.isNotEmpty(mapJsonStringToStringMap) && mapJsonStringToStringMap.equals(map);
    }

    protected Map<String, String> getUserLoginInfo() {
        return JsonUtils.jsonStringToStringMap(this.persistentStorage.getAnonymousUserIdMap());
    }

    protected JSONObject getUserData() {
        String string = this.persistentStorage.getString(ANON_USER_DATA);
        if (Utils.isEmpty(string) || !JsonUtils.isValidJsonString(string)) {
            string = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        return new JSONObject(string);
    }

    protected void setUserData(JSONObject jSONObject) {
        this.persistentStorage.putString(ANON_USER_DATA, jSONObject.toString());
    }

    public void removeAnonymousUser() {
        this.persistentStorage.removeAnonymousUserIdMap();
        this.persistentStorage.putString(ANON_USER_DATA, com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
        this.persistentStorage.setFailedAnalyticsEvents(new JSONArray());
    }

    public boolean userDataExists() {
        return Utils.isNotEmpty(getUserLoginInfo());
    }

    public void saveAnonUserData(JSONObject jSONObject) {
        this.persistentStorage.storeAnonymousUserIdMap(jSONObject.toString());
    }

    protected boolean isUserDataValidForNetworkCall() {
        return Utils.validateUserIdEmailForLogin(getUserLoginInfo().get("userId"), BuildConfig.FLAVOR);
    }
}
