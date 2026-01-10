package com.tiktok.appevents;

import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.offline.DownloadService;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {
    private static final String TAG = "com.tiktok.appevents.TTActivityLifecycleCallbacksListener";
    private static final TTLogger logger = new TTLogger(TTActivityLifecycleCallbacksListener.class.getCanonicalName(), TikTokBusinessSdk.getLogLevel());
    private final TTAppEventLogger appEventLogger;
    private boolean isPaused = false;
    private long bgStart = 0;
    private long fgStart = System.currentTimeMillis();

    public TTActivityLifecycleCallbacksListener(TTAppEventLogger appEventLogger) {
        this.appEventLogger = appEventLogger;
    }

    public void onResume(LifecycleOwner owner) throws JSONException {
        if (this.isPaused) {
            reportBackground(this.bgStart);
            this.fgStart = System.currentTimeMillis();
            this.appEventLogger.fetchGlobalConfig(0);
            this.appEventLogger.restartScheduler();
            this.appEventLogger.autoEventsManager.track2DayRetentionEvent();
        }
    }

    public void onPause(LifecycleOwner owner) throws JSONException {
        reportForeground(this.fgStart);
        this.bgStart = System.currentTimeMillis();
        this.appEventLogger.stopScheduler();
        this.isPaused = true;
        if (TikTokBusinessSdk.enableAutoIapTrack()) {
            TTInAppPurchaseWrapper.startBillingClient();
        }
    }

    public void onStop(LifecycleOwner owner) {
        this.appEventLogger.persistEvents();
        this.appEventLogger.persistMonitor();
    }

    public void onDestroy(LifecycleOwner owner) {
        this.appEventLogger.stopScheduler();
    }

    private void reportForeground(long ts) throws JSONException {
        try {
            this.appEventLogger.monitorMetric(DownloadService.KEY_FOREGROUND, TTUtil.getMetaWithTS(Long.valueOf(ts)).put("latency", System.currentTimeMillis() - ts), (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    private void reportBackground(long ts) throws JSONException {
        try {
            this.appEventLogger.monitorMetric("background", TTUtil.getMetaWithTS(Long.valueOf(ts)).put("latency", System.currentTimeMillis() - ts), (JSONObject) null);
        } catch (Exception unused) {
        }
    }
}
