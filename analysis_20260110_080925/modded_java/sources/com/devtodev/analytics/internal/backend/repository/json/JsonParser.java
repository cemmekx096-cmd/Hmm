package com.devtodev.analytics.internal.backend.repository.json;

import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.BackendConfig;
import com.devtodev.analytics.internal.backend.BackendUserProperties;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.ConfigJsonError;
import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.BackendUserData;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataJsonError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataRetry;
import com.devtodev.analytics.internal.backend.repository.IJsonParser;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiments;
import com.devtodev.analytics.internal.backend.repository.Parameter;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigJsonError;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.backend.repository.RemoteOfferJsonError;
import com.devtodev.analytics.internal.backend.repository.SummaryBackendData;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.backend.repository.UserIdentifications;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsConditions;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceKeys;
import com.devtodev.analytics.internal.domain.events.abTests.Comparison;
import com.devtodev.analytics.internal.domain.events.abTests.Condition;
import com.devtodev.analytics.internal.domain.events.abTests.ConditionsType;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u0006\u0010!\u001a\u00020\u0017H\u0002J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00152\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¨\u00061"}, d2 = {"Lcom/devtodev/analytics/internal/backend/repository/json/JsonParser;", "Lcom/devtodev/analytics/internal/backend/repository/IJsonParser;", "()V", "createCondition", "Lcom/devtodev/analytics/internal/domain/events/abTests/Condition;", "evenCode", BuildConfig.FLAVOR, JsonParser.KEY, "value", BuildConfig.FLAVOR, "defineCondition", BuildConfig.FLAVOR, "eventCondition", "Lorg/json/JSONObject;", "parentsKey", "parseAbTestOffer", "Lcom/devtodev/analytics/internal/backend/repository/AbTestOffer;", "json", "parseBackendUserData", "Lcom/devtodev/analytics/internal/backend/repository/BackendUserData;", "parseConditionsParamFromBackend", BuildConfig.FLAVOR, "params", "Lorg/json/JSONArray;", "parseConditionsParamFromBase", "parseConditionsParamFromBase$DTDAnalytics_unityRelease", "parseConfig", "Lcom/devtodev/analytics/internal/backend/BackendConfig;", "parseExcludedEvents", "Lcom/devtodev/analytics/internal/backend/ExcludeEvents;", "jsonObject", "parseExperiments", "Lcom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperiment;", JsonParser.EXPERIMENTS, "parseExperimentsParam", "Lcom/devtodev/analytics/internal/backend/repository/Parameter;", "parseExperimentsParam$DTDAnalytics_unityRelease", "parseIdentification", "Lcom/devtodev/analytics/internal/backend/repository/UserIdentifications;", "parseInvolvedExperiments", "Lcom/devtodev/analytics/internal/backend/repository/InvolvedExperiment;", "array", "parseRemoteConfig", "Lcom/devtodev/analytics/internal/backend/repository/RemoteConfigSealedClass;", "parseUserData", "Lcom/devtodev/analytics/internal/backend/repository/UserData;", "searchRetryData", "Lcom/devtodev/analytics/internal/backend/repository/BackendUserDataRetry;", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class JsonParser implements IJsonParser {
    private static final String ALIVE_TIMEOUT = "aliveTimeout";
    public static final String ALL = "all";
    private static final String CAMPAIGN = "campaign";
    private static final String CHANNEL = "channel";
    private static final String COMPLETION_DATE = "completionDate";
    private static final String CONDITIONS = "conditions";
    private static final String COUNTRY = "country";
    private static final String COUNTRY_FROM_AB_TESTS = "country";
    private static final String COUNT_FOR_REQUEST = "countForRequest";
    private static final String CREATED = "created";
    private static final String CREATION_DATE = "creationDate";
    private static final String CURRENCY_AGGREGATION_TIMEOUT = "currencyAggregationTimeout";
    private static final String DEVTODEV_ID_TIMEOUT = "devtodevIdTimeout";
    private static final String EVENT_PARAMS_COUNT = "eventParamsCount";
    private static final String EXCLUDE = "exclude";
    public static final String EXCLUDE_EVENTS = "excludeEvents";
    public static final String EXCLUDE_VERSION = "version";
    private static final String EXPERIMENTS = "experiments";
    private static final String FIRST_VERSION = "firstVersion";
    private static final String GROUP = "group";
    private static final String ID = "id";
    private static final String IDENTIFICATION_CROSS_PLATFORM_ID = "crossPlatformDevtodevId";
    private static final String IDENTIFICATION_DEVICE_ID = "devtodevId";
    private static final String IDENTIFICATION_DEVTODEV_ID_TIMESTAMP = "devtodevIdTimestamp";
    private static final String IDENTIFICATION_RETRY = "retryAfter";
    private static final String ID_EXP = "id";
    private static final String INVOLVED_EXPERIMENTS = "involvedExperiments";
    private static final String IS_NEW_USER = "newUser";
    private static final String IS_TESTING = "isTesting";
    private static final String KEY = "key";
    private static final String NUMBER_OF_CURRENCIES = "numberOfCurrencies";
    private static final String PARAMETERS = "parameters";
    private static final String PAYING_CAPACITY = "pCapacity";
    private static final String PAYMENTS_COUNT = "pCount";
    private static final String PAYMENT_SUM = "pSum";
    private static final String SBS_CONFIG_VERSION = "sbsConfigVersion";
    private static final String SERVER_TIME = "serverTime";
    private static final String SESSION_TIMEOUT = "sessionTimeout";
    private static final String SUBSCRIPTIONS_PAYMENTS_COUNT = "sbsCount";
    private static final String SUBSCRIPTIONS_PAYMENTS_SUM = "sbsSum";
    private static final String SUBSCRIPTION_STATUS = "sbsStatus";
    private static final String TIMER_FOR_REQUEST = "timeForRequest";
    private static final String UPDATE_DATE = "updateDate";
    private static final String USER_CARD_KEYS_COUNT = "userCardKeysCount";
    private static final String USER_COUNTING = "userCounting";
    private static final String USER_PROPERTIES = "userProperties";
    private static final String USER_PROPERTIES_FROM_AB_TESTS = "userProperties";
    private static final String VALUES = "values";
    private static final String VERSION = "version";

    private final Condition createCondition(String evenCode, String key, Object value) {
        Condition condition = new Condition((String) null, (List) null, AudienceKeys.Companion.getConditionType(evenCode) != null ? ConditionsType.BACKEND : ConditionsType.LOCAL, new Comparison(key, value), false, 19, (DefaultConstructorMarker) null);
        condition.setEventCode(evenCode);
        return condition;
    }

    private final List<Condition> defineCondition(String evenCode, JSONObject eventCondition, String parentsKey) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (eventCondition.length() == 1 && !eventCondition.isNull("code")) {
            String string = eventCondition.getString("code");
            String value = AbTestsConditions.EQUALS.getValue();
            Intrinsics.checkNotNullExpressionValue(string, "value");
            Condition conditionCreateCondition = createCondition(evenCode, value, string);
            conditionCreateCondition.getSearchPath().add("code");
            arrayList.add(conditionCreateCondition);
            return arrayList;
        }
        Iterator<String> itKeys = eventCondition.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "eventCondition.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals("code") && !next.equals("type")) {
                AbTestsConditions.Companion companion = AbTestsConditions.Companion;
                Intrinsics.checkNotNullExpressionValue(next, KEY);
                if (companion.contains(next) != null) {
                    Object obj = eventCondition.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "value");
                    arrayList.add(createCondition(evenCode, next, obj));
                } else {
                    Object obj2 = eventCondition.get(next);
                    if (obj2 instanceof JSONObject) {
                        arrayList.addAll(defineCondition(evenCode, (JSONObject) obj2, next));
                    } else if (obj2 instanceof Boolean) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.accumulate(AbTestsConditions.BOOLEAN.getValue(), obj2);
                        arrayList.addAll(defineCondition(evenCode, jSONObject, next));
                    }
                }
            }
        }
        if (parentsKey != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Condition) it.next()).getSearchPath().add(parentsKey);
            }
        }
        return arrayList;
    }

    private final List<Condition> parseConditionsParamFromBackend(JSONArray params) throws JSONException {
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            int length = params.length();
            for (int i = 0; i < length; i++) {
                Object obj = params.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.isNull("code")) {
                    string = jSONObject.getString("code");
                } else if (jSONObject.isNull("type")) {
                    Logger.error$default(Logger.INSTANCE, "not supported condition object!", (Throwable) null, 2, (Object) null);
                } else {
                    string = jSONObject.getString("type");
                }
                Intrinsics.checkNotNullExpressionValue(string, "code");
                for (Condition condition : defineCondition(string, jSONObject, null)) {
                    if (!condition.getSearchPath().isEmpty()) {
                        CollectionsKt.reverse(condition.getSearchPath());
                        arrayList.add(condition);
                    }
                }
            }
        } catch (Exception e) {
            Logger.INSTANCE.error("parseConditionsParam ", e);
        }
        return arrayList;
    }

    private final ExcludeEvents parseExcludedEvents(JSONObject jsonObject) throws JSONException {
        if (jsonObject.isNull(EXCLUDE)) {
            return null;
        }
        JSONObject jSONObject = jsonObject.getJSONObject(EXCLUDE);
        long j = jSONObject.getLong("version");
        HashMap map = new HashMap();
        if (jSONObject.isNull(EXCLUDE_EVENTS)) {
            return new ExcludeEvents(Long.valueOf(j), (Boolean) null, (Map) null, 2, (DefaultConstructorMarker) null);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(EXCLUDE_EVENTS);
        Iterator<String> itKeys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "eventsArray.get(i)");
                arrayList.add(obj);
            }
            Intrinsics.checkNotNullExpressionValue(next, KEY);
            map.put(next, arrayList);
        }
        return new ExcludeEvents(Long.valueOf(j), (Boolean) null, map, 2, (DefaultConstructorMarker) null);
    }

    private final List<AbTestsExperiment> parseExperiments(JSONArray experiments) throws JSONException {
        String str;
        AbTestsExperiment abTestsExperiment;
        String str2 = CREATION_DATE;
        ArrayList arrayList = new ArrayList();
        try {
            int length = experiments.length();
            int i = 0;
            while (i < length) {
                AbTestsExperiment abTestsExperiment2 = abTestsExperiment;
                AbTestsExperiment abTestsExperiment3 = new AbTestsExperiment(0L, 0L, 0L, 0L, 0L, 0L, false, (List) null, (List) null, 511, (DefaultConstructorMarker) null);
                Object obj = experiments.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "experimentJSON).keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null) {
                        switch (next.hashCode()) {
                            case -2002224762:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (next.equals(IS_TESTING)) {
                                    abTestsExperiment.setTesting(jSONObject.getBoolean(IS_TESTING));
                                }
                                abTestsExperiment2 = abTestsExperiment;
                                str2 = str;
                                break;
                            case -930859336:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (next.equals(CONDITIONS)) {
                                    JSONArray jSONArray = jSONObject.getJSONArray(CONDITIONS);
                                    Intrinsics.checkNotNullExpressionValue(jSONArray, "experimentJSON.getJSONArray(CONDITIONS)");
                                    abTestsExperiment.setConditions(parseConditionsParamFromBackend(jSONArray));
                                }
                                abTestsExperiment2 = abTestsExperiment;
                                str2 = str;
                                break;
                            case -296415209:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (!next.equals(UPDATE_DATE)) {
                                    abTestsExperiment2 = abTestsExperiment;
                                    str2 = str;
                                    break;
                                } else {
                                    abTestsExperiment.setUpdateDate(jSONObject.getLong(UPDATE_DATE));
                                    abTestsExperiment2 = abTestsExperiment;
                                    str2 = str;
                                }
                            case 3355:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (next.equals("id")) {
                                    abTestsExperiment.setExperimentId(jSONObject.getLong("id"));
                                }
                                abTestsExperiment2 = abTestsExperiment;
                                str2 = str;
                                break;
                            case 458736106:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (!next.equals(PARAMETERS)) {
                                    abTestsExperiment2 = abTestsExperiment;
                                    str2 = str;
                                    break;
                                } else {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray(PARAMETERS);
                                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "experimentJSON.getJSONArray(PARAMETERS)");
                                    abTestsExperiment.setParameters(parseExperimentsParam$DTDAnalytics_unityRelease(jSONArray2));
                                    abTestsExperiment2 = abTestsExperiment;
                                    str2 = str;
                                }
                            case 1146157482:
                                str = str2;
                                abTestsExperiment = abTestsExperiment2;
                                if (next.equals(COMPLETION_DATE)) {
                                    abTestsExperiment.setCompletionDate(jSONObject.getLong(COMPLETION_DATE));
                                }
                                abTestsExperiment2 = abTestsExperiment;
                                str2 = str;
                                break;
                            case 1585531693:
                                if (!next.equals(str2)) {
                                    break;
                                } else {
                                    long j = jSONObject.getLong(str2);
                                    str = str2;
                                    abTestsExperiment = abTestsExperiment2;
                                    abTestsExperiment.setCreationDate(j);
                                    abTestsExperiment2 = abTestsExperiment;
                                    str2 = str;
                                    break;
                                }
                        }
                    }
                }
                String str3 = str2;
                arrayList.add(abTestsExperiment2);
                i++;
                str2 = str3;
            }
        } catch (Exception e) {
            Logger.INSTANCE.error("parseExperiments ", e);
        }
        return arrayList;
    }

    private final UserIdentifications parseIdentification(String json) {
        JSONObject jSONObject = new JSONObject(json);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                int iHashCode = next.hashCode();
                if (iHashCode != -1998041920) {
                    if (iHashCode != 1621139955) {
                        if (iHashCode == 2071811126 && next.equals(IDENTIFICATION_DEVTODEV_ID_TIMESTAMP)) {
                            Intrinsics.checkNotNullExpressionValue(next, KEY);
                            map.put(next, Long.valueOf(jSONObject.getLong(next)));
                        }
                    } else if (next.equals(IDENTIFICATION_CROSS_PLATFORM_ID)) {
                        Intrinsics.checkNotNullExpressionValue(next, KEY);
                        map.put(next, Long.valueOf(jSONObject.getLong(next)));
                    }
                } else if (next.equals(IDENTIFICATION_DEVICE_ID)) {
                    Intrinsics.checkNotNullExpressionValue(next, KEY);
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        }
        Object obj = map.get(IDENTIFICATION_DEVICE_ID);
        if (obj == null) {
            obj = null;
        }
        Long l = (Long) obj;
        Object obj2 = map.get(IDENTIFICATION_CROSS_PLATFORM_ID);
        if (obj2 == null) {
            obj2 = null;
        }
        Long l2 = (Long) obj2;
        Object obj3 = map.get(IDENTIFICATION_DEVTODEV_ID_TIMESTAMP);
        return new UserIdentifications(l, l2, (Long) (obj3 != null ? obj3 : null));
    }

    private final List<InvolvedExperiment> parseInvolvedExperiments(JSONArray array) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = array.length();
        for (int i = 0; i < length; i++) {
            Object obj = array.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.isNull("id") && !jSONObject.isNull(GROUP)) {
                long j = jSONObject.getLong("id");
                String string = jSONObject.getString(GROUP);
                Intrinsics.checkNotNullExpressionValue(string, GROUP);
                arrayList.add(new InvolvedExperiment(j, string));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final UserData parseUserData(String json) {
        JSONObject jSONObject = new JSONObject(json);
        UserData userData = new UserData((Long) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Double) null, (Long) null, (Double) null, (Long) null, (Long) null, (Long) null, 2047, (DefaultConstructorMarker) null);
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                switch (next.hashCode()) {
                    case -1301575829:
                        if (!next.equals(SUBSCRIPTIONS_PAYMENTS_COUNT)) {
                            break;
                        } else {
                            userData.setSbsPaymentsCount(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case -1232050922:
                        if (!next.equals(SUBSCRIPTION_STATUS)) {
                            break;
                        } else {
                            userData.setSbsStatus(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case -1023203713:
                        if (!next.equals(PAYMENTS_COUNT)) {
                            break;
                        } else {
                            userData.setPaymentsCount(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case -908600409:
                        if (!next.equals(SUBSCRIPTIONS_PAYMENTS_SUM)) {
                            break;
                        } else {
                            userData.setSbsPaymentsSum(Double.valueOf(jSONObject.getDouble(next)));
                            break;
                        }
                    case -574617270:
                        if (!next.equals(PAYING_CAPACITY)) {
                            break;
                        } else {
                            userData.setPayingCapacity(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case -139919088:
                        if (!next.equals("campaign")) {
                            break;
                        } else {
                            userData.setCampaign(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case 3420091:
                        if (!next.equals(PAYMENT_SUM)) {
                            break;
                        } else {
                            userData.setPaymentsSum(Double.valueOf(jSONObject.getDouble(next)));
                            break;
                        }
                    case 272464904:
                        if (!next.equals(FIRST_VERSION)) {
                            break;
                        } else {
                            userData.setFirstVersion(jSONObject.getString(next));
                            break;
                        }
                    case 738950403:
                        if (!next.equals(CHANNEL)) {
                            break;
                        } else {
                            userData.setChannel(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case 1028554472:
                        if (!next.equals(CREATED)) {
                            break;
                        } else {
                            userData.setCreated(Long.valueOf(jSONObject.getLong(next)));
                            break;
                        }
                    case 1845246347:
                        if (!next.equals(IS_NEW_USER)) {
                            break;
                        } else {
                            userData.setNewUser(Boolean.valueOf(jSONObject.getBoolean(next)));
                            break;
                        }
                }
            }
        }
        return userData;
    }

    private final BackendUserDataRetry searchRetryData(String json) {
        JSONObject jSONObject = new JSONObject(json);
        if (jSONObject.isNull(IDENTIFICATION_RETRY)) {
            return null;
        }
        return new BackendUserDataRetry(jSONObject.getLong(IDENTIFICATION_RETRY));
    }

    public AbTestOffer parseAbTestOffer(String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            InvolvedExperiments involvedExperiments = new InvolvedExperiments();
            JSONObject jSONObject = new JSONObject(json);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                if (Intrinsics.areEqual(itKeys.next(), INVOLVED_EXPERIMENTS)) {
                    List mutableList = CollectionsKt.toMutableList(involvedExperiments.getInvolvedExperiments());
                    JSONArray jSONArray = jSONObject.getJSONArray(INVOLVED_EXPERIMENTS);
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObject.getJSONArray(INVOLVED_EXPERIMENTS)");
                    mutableList.addAll(parseInvolvedExperiments(jSONArray));
                    involvedExperiments.setInvolvedExperiments(mutableList);
                }
            }
            return involvedExperiments;
        } catch (Exception e) {
            Logger.INSTANCE.error(json, e);
            return RemoteOfferJsonError.INSTANCE;
        }
    }

    public BackendUserData parseBackendUserData(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            if (Intrinsics.areEqual(json, BuildConfig.FLAVOR)) {
                return BackendUserDataJsonError.INSTANCE;
            }
            BackendUserDataRetry backendUserDataRetrySearchRetryData = searchRetryData(json);
            return backendUserDataRetrySearchRetryData != null ? backendUserDataRetrySearchRetryData : new SummaryBackendData(parseIdentification(json), parseUserData(json));
        } catch (Exception e) {
            Logger.INSTANCE.error("Can't parse response data. Error: " + json, e);
            return BackendUserDataJsonError.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.devtodev.analytics.internal.domain.events.abTests.Condition> parseConditionsParamFromBase$DTDAnalytics_unityRelease(org.json.JSONArray r21) throws org.json.JSONException {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            java.lang.String r3 = "comparison"
            java.lang.String r4 = "conditionsType"
            java.lang.String r5 = "searchPath"
            java.lang.String r6 = "code"
            java.lang.String r7 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r21.length()     // Catch: java.lang.Exception -> Ldf
            r10 = 0
        L1d:
            if (r10 >= r8) goto Le7
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> Ldf
            r13.<init>()     // Catch: java.lang.Exception -> Ldf
            java.lang.Object r11 = r0.get(r10)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r12 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11, r12)     // Catch: java.lang.Exception -> Ldf
            org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch: java.lang.Exception -> Ldf
            boolean r12 = r11.isNull(r6)     // Catch: java.lang.Exception -> Ldf
            if (r12 != 0) goto L3a
            java.lang.String r12 = r11.getString(r6)     // Catch: java.lang.Exception -> Ldf
            goto L3b
        L3a:
            r12 = 0
        L3b:
            boolean r15 = r11.isNull(r5)     // Catch: java.lang.Exception -> Ldf
            if (r15 != 0) goto L6e
            org.json.JSONArray r15 = r11.getJSONArray(r5)     // Catch: java.lang.Exception -> Ldf
            int r9 = r15.length()     // Catch: java.lang.Exception -> Ldf
            r14 = 0
        L4a:
            if (r14 >= r9) goto L6e
            java.lang.Object r0 = r15.get(r14)     // Catch: java.lang.Exception -> Ldf
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> Ldf
            if (r0 == 0) goto L65
            java.lang.Object r0 = r15.get(r14)     // Catch: java.lang.Exception -> Ldf
            r19 = r5
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r5)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Ldf
            r13.add(r0)     // Catch: java.lang.Exception -> Ldf
            goto L67
        L65:
            r19 = r5
        L67:
            int r14 = r14 + 1
            r0 = r21
            r5 = r19
            goto L4a
        L6e:
            r19 = r5
            boolean r0 = r11.isNull(r4)     // Catch: java.lang.Exception -> Ldf
            if (r0 != 0) goto L89
            java.lang.String r0 = r11.getString(r4)     // Catch: java.lang.Exception -> Ldf
            com.devtodev.analytics.internal.domain.events.abTests.ConditionsType$Companion r5 = com.devtodev.analytics.internal.domain.events.abTests.ConditionsType.Companion     // Catch: java.lang.Exception -> Ldf
            java.lang.String r9 = "conditionsTypeStr"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch: java.lang.Exception -> Ldf
            com.devtodev.analytics.internal.domain.events.abTests.ConditionsType r0 = r5.getConditionType(r0)     // Catch: java.lang.Exception -> Ldf
            if (r0 == 0) goto L89
            r14 = r0
            goto L8a
        L89:
            r14 = 0
        L8a:
            boolean r0 = r11.isNull(r3)     // Catch: java.lang.Exception -> Ldf
            if (r0 != 0) goto Lb9
            org.json.JSONObject r0 = r11.getJSONObject(r3)     // Catch: java.lang.Exception -> Ldf
            boolean r5 = r0.isNull(r2)     // Catch: java.lang.Exception -> Ldf
            if (r5 != 0) goto Lb9
            boolean r5 = r0.isNull(r1)     // Catch: java.lang.Exception -> Ldf
            if (r5 != 0) goto Lb9
            com.devtodev.analytics.internal.domain.events.abTests.Comparison r5 = new com.devtodev.analytics.internal.domain.events.abTests.Comparison     // Catch: java.lang.Exception -> Ldf
            java.lang.String r9 = r0.getString(r2)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r11 = "conditionJson.getString(\"key\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> Ldf
            java.lang.String r11 = "conditionJson.getString(\"value\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r11)     // Catch: java.lang.Exception -> Ldf
            r5.<init>(r9, r0)     // Catch: java.lang.Exception -> Ldf
            r15 = r5
            goto Lba
        Lb9:
            r15 = 0
        Lba:
            if (r12 == 0) goto Ld7
            if (r15 == 0) goto Ld7
            if (r14 == 0) goto Ld7
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Exception -> Ldf
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld7
            com.devtodev.analytics.internal.domain.events.abTests.Condition r0 = new com.devtodev.analytics.internal.domain.events.abTests.Condition     // Catch: java.lang.Exception -> Ldf
            r16 = 0
            r17 = 16
            r18 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> Ldf
            r7.add(r0)     // Catch: java.lang.Exception -> Ldf
        Ld7:
            int r10 = r10 + 1
            r0 = r21
            r5 = r19
            goto L1d
        Ldf:
            r0 = move-exception
            com.devtodev.analytics.internal.logger.Logger r1 = com.devtodev.analytics.internal.logger.Logger.INSTANCE
            java.lang.String r2 = "parseConditionsParam "
            r1.error(r2, r0)
        Le7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.internal.backend.repository.json.JsonParser.parseConditionsParamFromBase$DTDAnalytics_unityRelease(org.json.JSONArray):java.util.List");
    }

    public BackendConfig parseConfig(String json) throws JSONException {
        JSONObject jSONObject;
        BackendUserProperties backendUserProperties;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            jSONObject = new JSONObject(json);
        } catch (Exception e) {
            e = e;
        }
        try {
            ExcludeEvents excludedEvents = parseExcludedEvents(jSONObject);
            long j = jSONObject.getLong(TIMER_FOR_REQUEST);
            int i = jSONObject.getInt(COUNT_FOR_REQUEST);
            int i2 = jSONObject.getInt(EVENT_PARAMS_COUNT);
            long j2 = jSONObject.getLong(SESSION_TIMEOUT);
            long j3 = jSONObject.isNull(DEVTODEV_ID_TIMEOUT) ? 86400000L : jSONObject.getLong(DEVTODEV_ID_TIMEOUT);
            long j4 = jSONObject.getLong(SERVER_TIME);
            long j5 = jSONObject.getLong(ALIVE_TIMEOUT);
            boolean z = jSONObject.getBoolean(USER_COUNTING);
            if (jSONObject.isNull("userProperties")) {
                backendUserProperties = null;
            } else {
                String string = jSONObject.getJSONObject("userProperties").getString("country");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getJSONObject…RTIES).getString(COUNTRY)");
                backendUserProperties = new BackendUserProperties(string);
            }
            ConfigEntry configEntry = new ConfigEntry(j, i, i2, j2, j3, j4, j5, z, jSONObject.isNull(CURRENCY_AGGREGATION_TIMEOUT) ? 3600000L : jSONObject.getLong(CURRENCY_AGGREGATION_TIMEOUT), jSONObject.isNull(NUMBER_OF_CURRENCIES) ? 1000L : jSONObject.getLong(NUMBER_OF_CURRENCIES), jSONObject.isNull(USER_CARD_KEYS_COUNT) ? 60L : jSONObject.getLong(USER_CARD_KEYS_COUNT), (ExcludeEvents) null, backendUserProperties, jSONObject.isNull(SBS_CONFIG_VERSION) ? 0L : jSONObject.getLong(SBS_CONFIG_VERSION), RendererCapabilities.AUDIO_OFFLOAD_SPEED_CHANGE_SUPPORTED, (DefaultConstructorMarker) null);
            if (excludedEvents != null) {
                configEntry.setExclude(excludedEvents);
            }
            return configEntry;
        } catch (Exception e2) {
            e = e2;
            Logger.INSTANCE.error("Can't parse response data. Error: " + json, e);
            return ConfigJsonError.INSTANCE;
        }
    }

    public final List<Parameter> parseExperimentsParam$DTDAnalytics_unityRelease(JSONArray params) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        try {
            int length = params.length();
            for (int i = 0; i < length; i++) {
                String string = null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj = params.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "paramsJSON).keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (Intrinsics.areEqual(next, KEY)) {
                        string = jSONObject.getString(KEY);
                    } else if (Intrinsics.areEqual(next, VALUES)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(VALUES);
                        Iterator<String> itKeys2 = jSONObject2.keys();
                        Intrinsics.checkNotNullExpressionValue(itKeys2, "valuesJson.keys()");
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Intrinsics.checkNotNullExpressionValue(next2, "value");
                            Object obj2 = jSONObject2.get(next2);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedHashMap.put(next2, (String) obj2);
                        }
                    }
                }
                if (string != null && (!linkedHashMap.isEmpty())) {
                    arrayList.add(new Parameter(string, linkedHashMap));
                }
            }
        } catch (Exception e) {
            Logger.INSTANCE.error("parseExperimentsParam ", e);
        }
        return arrayList;
    }

    public RemoteConfigSealedClass parseRemoteConfig(String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            RemoteConfig remoteConfig = new RemoteConfig();
            JSONObject jSONObject = new JSONObject(json);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null) {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -171551906) {
                        if (iHashCode != 351608024) {
                            if (iHashCode == 1649517590 && next.equals(EXPERIMENTS)) {
                                JSONArray jSONArray = jSONObject.getJSONArray(EXPERIMENTS);
                                Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObject.getJSONArray(EXPERIMENTS)");
                                remoteConfig.setAbExperiments(parseExperiments(jSONArray));
                            }
                        } else if (next.equals("version")) {
                            remoteConfig.setVersion(jSONObject.getLong("version"));
                        }
                    } else if (next.equals("userProperties")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("userProperties");
                        if (!jSONObject2.isNull("country")) {
                            remoteConfig.setUserProperties(new UserProperties(jSONObject2.getString("country")));
                        }
                    }
                }
            }
            return remoteConfig;
        } catch (Exception e) {
            Logger.INSTANCE.error(json, e);
            return RemoteConfigJsonError.INSTANCE;
        }
    }
}
