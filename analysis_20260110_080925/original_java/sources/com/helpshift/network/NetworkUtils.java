package com.helpshift.network;

import com.helpshift.network.HSRequest;
import com.helpshift.network.exception.HSRootApiException;
import com.helpshift.network.exception.NetworkException;
import com.helpshift.platform.Device;
import com.helpshift.storage.HSPersistentStorage;
import com.helpshift.user.UserWithIdentity;
import com.helpshift.util.Utils;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NetworkUtils {
    private static final String API_VERSION_HEADER = "application/vnd+hsapi-v2+json";
    private static final String CRASH_LOG_PATH = "/sdkx/crash-log";
    private static final String EVENTS_PATH = "/events/v1/";
    private static final String HTTPS_API_PREFIX = "https://api.";
    private static final String IDENTITIES_PATH = "/identity";
    private static final String LOGOUT = "/logout";
    private static final String ROTATE_TOKEN = "/rotate-tokens";
    public static final String SOURCE = "android";
    private static final String WEBSDK_PATH = "/websdk/";
    public static final String X_HS_ACCESS_TOKEN = "x-hs-access-token";

    private NetworkUtils() {
    }

    public static String getAnalyticsAPIRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + EVENTS_PATH + hSPersistentStorage.getDomain() + WEBSDK_PATH;
    }

    public static String getCrashLogsRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + EVENTS_PATH + hSPersistentStorage.getDomain() + CRASH_LOG_PATH;
    }

    public static String getLoginWithIdentityRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + IDENTITIES_PATH;
    }

    public static String getSyncIdentitiesRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + IDENTITIES_PATH;
    }

    public static String getRotateTokenRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + ROTATE_TOKEN;
    }

    public static String getLogoutRoute(HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + LOGOUT;
    }

    public static Map<String, String> buildHeaderMap(Device device, String str) {
        HashMap map = new HashMap();
        map.put(HttpRequest.HEADER_AUTHORIZATION, "Basic " + device.encodeBase64(str + ":"));
        map.put(HttpRequest.HEADER_ACCEPT, API_VERSION_HEADER);
        return map;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.helpshift.network.exception.HSRootApiException */
    public static String getBodyForPostMethod(Map<String, String> map) throws HSRootApiException {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                arrayList.add(URLEncoder.encode(entry.getKey(), HttpRequest.CHARSET_UTF8) + "=" + URLEncoder.encode(entry.getValue(), HttpRequest.CHARSET_UTF8));
            } catch (UnsupportedEncodingException e) {
                throw HSRootApiException.wrap(e, NetworkException.UNSUPPORTED_ENCODING_EXCEPTION);
            }
        }
        return Utils.join("&", arrayList);
    }

    public static Map<String, String> cleanDataForNetworkBody(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                map2.put(key, value);
            }
        }
        return map2;
    }

    public static HSRequest getRequestBodyForRotatingToken(HSPersistentStorage hSPersistentStorage, Device device, Map<String, String> map) {
        return new HSRequest(HSRequest.Method.POST, getRotateTokenRoute(hSPersistentStorage), buildHeaderMap(device, hSPersistentStorage.getPlatformId()), getBodyForPostMethod(cleanDataForNetworkBody(map)), 5000);
    }

    public static HSRequestData getRequestDataForLogout(HSPersistentStorage hSPersistentStorage, UserWithIdentity userWithIdentity, Device device) {
        String currentPushToken = hSPersistentStorage.getCurrentPushToken();
        String refreshToken = userWithIdentity.getRefreshToken();
        String accessToken = userWithIdentity.getAccessToken();
        String platformId = hSPersistentStorage.getPlatformId();
        String deviceId = device.getDeviceId();
        Map<String, String> mapBuildHeaderMap = buildHeaderMap(device, platformId);
        mapBuildHeaderMap.put(X_HS_ACCESS_TOKEN, accessToken);
        HashMap map = new HashMap();
        map.put("did", deviceId);
        map.put("push_token", currentPushToken);
        map.put("refresh_token", refreshToken);
        return new HSRequestData(mapBuildHeaderMap, map);
    }
}
