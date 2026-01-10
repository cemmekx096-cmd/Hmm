package com.helpshift.network;

import com.crashlytics.android.BuildConfig;
import com.helpshift.log.HSLogger;
import com.helpshift.network.exception.HSRootApiException;
import com.helpshift.network.exception.NetworkException;
import com.helpshift.util.Utils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class RetryNetworkWithNewToken implements HSNetwork {
    static final String ERROR = "error";
    static String INVALID_ACCESS_TOKEN = "Invalid access token";
    static String MISSING_ACCESS_TOKEN = "Missing access token";
    static String USER_IDENTITY_FEATURE_NOT_ENABLED = "Access to feature User identity is disallowed. Reason: Feature not enabled";
    private final String TAG = "RetryNetworkWithNewToken";
    private final HTTPTransport httpTransport;
    private final boolean isUserWithIdentity;
    private final HSNetwork network;
    private final Map<String, String> tokenMap;
    private final UserManagerProxy userManagerProxy;

    public RetryNetworkWithNewToken(HSNetwork hSNetwork, UserManagerProxy userManagerProxy, HTTPTransport hTTPTransport, boolean z, Map<String, String> map) {
        this.network = hSNetwork;
        this.userManagerProxy = userManagerProxy;
        this.httpTransport = hTTPTransport;
        this.tokenMap = map;
        this.isUserWithIdentity = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.helpshift.network.exception.HSRootApiException */
    public HSResponse makeRequest(HSRequestData hSRequestData) throws HSRootApiException {
        String strRotateAndGetNewToken;
        if (!this.isUserWithIdentity) {
            return this.network.makeRequest(hSRequestData);
        }
        addTokenAccessTokenInHeaders(hSRequestData);
        HSResponse hSResponseMakeRequest = this.network.makeRequest(hSRequestData);
        if (isFeatureDisabled(hSResponseMakeRequest)) {
            HSLogger.e("RetryNetworkWithNewToken", "Received 403.Feature is not enabled");
            throw HSRootApiException.wrap((Exception) null, NetworkException.IDENTITY_FEATURE_NOT_ENABLED);
        }
        if (!shouldRotateToken(hSResponseMakeRequest) || (strRotateAndGetNewToken = rotateAndGetNewToken()) == null) {
            return hSResponseMakeRequest;
        }
        updateTokenInHeaders(hSRequestData.headers, strRotateAndGetNewToken);
        HSResponse hSResponseMakeRequest2 = this.network.makeRequest(hSRequestData);
        if (shouldRotateToken(hSResponseMakeRequest2)) {
            throw HSRootApiException.wrap((Exception) null, NetworkException.SESSION_EXPIRED);
        }
        return hSResponseMakeRequest2;
    }

    private void addTokenAccessTokenInHeaders(HSRequestData hSRequestData) {
        if (this.isUserWithIdentity) {
            updateTokenInHeaders(hSRequestData.headers, (String) Utils.getOrDefault(this.tokenMap, "access_token", BuildConfig.FLAVOR));
        }
    }

    private void updateTokenInHeaders(Map<String, String> map, String str) {
        map.put(NetworkUtils.X_HS_ACCESS_TOKEN, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.helpshift.network.exception.HSRootApiException */
    private String rotateAndGetNewToken() throws HSRootApiException {
        try {
            HSResponse hSResponseMakeRequest = this.httpTransport.makeRequest(this.userManagerProxy.getRequestBodyForRotatingToken((String) Utils.getOrDefault(this.tokenMap, "refresh_token", BuildConfig.FLAVOR)));
            if (!hSResponseMakeRequest.isNetworkCallSuccess()) {
                if (hSResponseMakeRequest.getStatus() >= 400 && hSResponseMakeRequest.getStatus() < 500) {
                    HSLogger.d("RetryNetworkWithNewToken", "Rotating token network call failed");
                    throw HSRootApiException.wrap((Exception) null, NetworkException.SESSION_EXPIRED);
                }
                return null;
            }
            JSONObject jSONObject = new JSONObject(hSResponseMakeRequest.getResponseString());
            String strOptString = jSONObject.optString("access_token", BuildConfig.FLAVOR);
            String strOptString2 = jSONObject.optString("refresh_token", BuildConfig.FLAVOR);
            long jOptLong = jSONObject.optLong("refresh_token_expiry", 0L);
            if (Utils.isEmpty(strOptString) || Utils.isEmpty(strOptString2)) {
                HSLogger.d("RetryNetworkWithNewToken", "new token is empty, failing the call");
                throw HSRootApiException.wrap((Exception) null, NetworkException.SESSION_EXPIRED);
            }
            this.userManagerProxy.updateNewTokensInStorage(strOptString, strOptString2, jOptLong);
            return strOptString;
        } catch (Exception e) {
            HSLogger.e("RetryNetworkWithNewToken", "Error in rotating token", e);
            return null;
        } catch (HSRootApiException e2) {
            if (e2.exceptionType == NetworkException.SESSION_EXPIRED) {
                throw e2;
            }
            HSLogger.e("RetryNetworkWithNewToken", "HSRoot error in rotating token", e2);
            return null;
        }
    }

    private boolean shouldRotateToken(HSResponse hSResponse) {
        return isTokenMissing(hSResponse) || isAccessTokenInvalid(hSResponse);
    }

    private boolean isFeatureDisabled(HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 403) {
                return false;
            }
            return new JSONObject(hSResponse.getResponseString()).optString("error", BuildConfig.FLAVOR).equals(USER_IDENTITY_FEATURE_NOT_ENABLED);
        } catch (Exception e) {
            HSLogger.e("RetryNetworkWithNewToken", "Error in checking if feature is disabled", e);
            return false;
        }
    }

    private boolean isTokenMissing(HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 400) {
                return false;
            }
            return new JSONObject(hSResponse.getResponseString()).optString("error", BuildConfig.FLAVOR).equals(MISSING_ACCESS_TOKEN);
        } catch (Exception e) {
            HSLogger.e("RetryNetworkWithNewToken", "Error in checking  if token is missing", e);
            return false;
        }
    }

    private boolean isAccessTokenInvalid(HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 401) {
                return false;
            }
            return new JSONObject(hSResponse.getResponseString()).optString("error", BuildConfig.FLAVOR).equals(INVALID_ACCESS_TOKEN);
        } catch (Exception e) {
            HSLogger.e("RetryNetworkWithNewToken", "Error in checking if access token is invalid", e);
            return false;
        }
    }
}
