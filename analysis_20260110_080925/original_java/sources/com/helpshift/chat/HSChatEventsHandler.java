package com.helpshift.chat;

import com.crashlytics.android.BuildConfig;
import com.helpshift.cache.HelpshiftResourceCacheManager;
import com.helpshift.concurrency.HSThreadingService;
import com.helpshift.config.HSConfigManager;
import com.helpshift.log.HSLogger;
import com.helpshift.migrator.NativeToSdkxMigrator;
import com.helpshift.storage.HSGenericDataManager;
import com.helpshift.user.UserManager;
import com.helpshift.user.UserWithIdentity;
import com.helpshift.util.Utils;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class HSChatEventsHandler {
    private static final String ACTION_AUTH_TOKEN_UPDATE = "authTokenUpdate";
    private static final String ACTION_REFRESH_TOKEN_EXPIRED = "refreshTokenExpired";
    private static final String ACTION_TYPE = "actionType";
    private static final String TAG = "wbEvntHndlr";
    private final HSConfigManager configManager;
    private final HSGenericDataManager genericDataManager;
    private final NativeToSdkxMigrator nativeToSdkxMigrator;
    private final HelpshiftResourceCacheManager resourceCacheManager;
    private final HSThreadingService threadingService;
    private WeakReference<HSWebchatToUiCallback> uiCallback;
    private final UserManager userManager;

    public HSChatEventsHandler(UserManager userManager, HSThreadingService hSThreadingService, HSConfigManager hSConfigManager, HelpshiftResourceCacheManager helpshiftResourceCacheManager, HSGenericDataManager hSGenericDataManager, NativeToSdkxMigrator nativeToSdkxMigrator) {
        this.threadingService = hSThreadingService;
        this.userManager = userManager;
        this.configManager = hSConfigManager;
        this.resourceCacheManager = helpshiftResourceCacheManager;
        this.genericDataManager = hSGenericDataManager;
        this.nativeToSdkxMigrator = nativeToSdkxMigrator;
    }

    public void setUiEventsListener(HSWebchatToUiCallback hSWebchatToUiCallback) {
        this.uiCallback = new WeakReference<>(hSWebchatToUiCallback);
    }

    public void sdkxMigrationLogSynced(boolean z) {
        this.nativeToSdkxMigrator.setErrorLogsSyncedWithWebchat(z);
    }

    public void onSetLocalStorage(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.1
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.configManager.setLocalStorageData(str);
            }
        });
    }

    public void onRemoveLocalStorage(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.2
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.configManager.removeLocalStorageData(str);
            }
        });
    }

    public void getHelpcenterData() {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.setHelpcenterData();
        }
    }

    public void onReceivePushTokenSyncRequestData(String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.3
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.userManager.setPushTokenSynced(true);
            }
        });
    }

    public void onRemoveAnonymousUser() {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.4
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.userManager.removeAnonymousUser();
            }
        });
    }

    void setPollingStatus(String str) {
        try {
            this.userManager.setShouldPollFlag(new JSONObject(str).optBoolean("shouldPoll", false));
        } catch (Exception e) {
            HSLogger.e(TAG, "Error getting polling status", e);
        }
    }

    void setGenericSdkData(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.5
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.genericDataManager.saveGenericSdkData(str);
            }
        });
    }

    void setIssueExistsForUser(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean zOptBoolean = new JSONObject(str).optBoolean("issueExists", false);
                    HSChatEventsHandler.this.userManager.setShowChatIconInHelpcenter(zOptBoolean);
                    if (zOptBoolean) {
                        HSChatEventsHandler.this.userManager.removeUserFromErrorList(HSChatEventsHandler.this.userManager.getHashForActiveUser());
                    }
                } catch (Exception e) {
                    HSLogger.e(HSChatEventsHandler.TAG, "error in getting the issue exist flag", e);
                }
            }
        });
    }

    void onWebchatClosed() {
        this.threadingService.runOnUIThread(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.7
            @Override // java.lang.Runnable
            public void run() {
                HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.uiCallback.get();
                if (hSWebchatToUiCallback != null) {
                    hSWebchatToUiCallback.onWebchatClosed();
                }
            }
        });
    }

    void onWebchatLoaded() {
        this.threadingService.runOnUIThread(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.8
            @Override // java.lang.Runnable
            public void run() {
                HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.uiCallback.get();
                if (hSWebchatToUiCallback != null) {
                    hSWebchatToUiCallback.onWebchatLoaded();
                }
            }
        });
    }

    void onWebchatError(final String str) {
        deleteAllCachedFilesOfWebchat();
        this.threadingService.runOnUIThread(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.9
            @Override // java.lang.Runnable
            public void run() {
                HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.uiCallback.get();
                if (hSWebchatToUiCallback != null) {
                    hSWebchatToUiCallback.onWebchatError(str);
                }
            }
        });
    }

    void onUserAuthenticationFailure() {
        deleteAllCachedFilesOfWebchat();
        this.threadingService.runOnUIThread(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.10
            @Override // java.lang.Runnable
            public void run() {
                HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.uiCallback.get();
                if (hSWebchatToUiCallback != null) {
                    hSWebchatToUiCallback.onUserAuthenticationFailure();
                }
            }
        });
    }

    private void deleteAllCachedFilesOfWebchat() {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.11
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.resourceCacheManager.deleteAllCachedFiles();
            }
        });
    }

    void onUiConfigChange(final String str) {
        saveUiConfigDataForWebchat(str);
        this.threadingService.runOnUIThread(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.12
            @Override // java.lang.Runnable
            public void run() {
                HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.uiCallback.get();
                if (hSWebchatToUiCallback != null) {
                    hSWebchatToUiCallback.onUiConfigChange(str);
                }
            }
        });
    }

    private void saveUiConfigDataForWebchat(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.13
            @Override // java.lang.Runnable
            public void run() {
                HSChatEventsHandler.this.configManager.saveUiConfigDataOfWebchat(str);
            }
        });
    }

    void requestConversationMetadata(String str) {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.requestConversationMetadata(str);
        }
    }

    void webchatJsFileLoaded() {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.webchatJsFileLoaded();
        }
    }

    void wcActionSync(final String str) {
        this.threadingService.runSerial(new Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler.14
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString(HSChatEventsHandler.ACTION_TYPE);
                        HSLogger.d(HSChatEventsHandler.TAG, "Received action type " + string);
                        if (HSChatEventsHandler.ACTION_AUTH_TOKEN_UPDATE.equalsIgnoreCase(string)) {
                            HSChatEventsHandler.this.storeAuthTokens(jSONObject);
                        } else if (HSChatEventsHandler.ACTION_REFRESH_TOKEN_EXPIRED.equalsIgnoreCase(string)) {
                            HSChatEventsHandler.this.userManager.sessionExpiryLogoutWhenSDKIsOpen();
                        }
                    }
                } catch (Exception e) {
                    HSLogger.e(HSChatEventsHandler.TAG, "Error in executing action updates from Webchat", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeAuthTokens(JSONObject jSONObject) {
        if (this.userManager.getCurrentUser() instanceof UserWithIdentity) {
            UserWithIdentity currentUser = this.userManager.getCurrentUser();
            String strOptString = jSONObject.optString("accessToken", BuildConfig.FLAVOR);
            String strOptString2 = jSONObject.optString("refreshToken", BuildConfig.FLAVOR);
            long jOptLong = jSONObject.optLong("refreshTokenExpiry", 0L);
            currentUser.setAccessToken(strOptString);
            currentUser.setRefreshToken(strOptString2);
            currentUser.setRefreshTokenExpiry(jOptLong);
            HSLogger.d(TAG, "Stored new tokens for user from WebChat: " + Utils.isEmpty(strOptString) + " " + Utils.isEmpty(strOptString2));
            return;
        }
        HSLogger.e(TAG, "Received tokens for non-identity user");
    }
}
