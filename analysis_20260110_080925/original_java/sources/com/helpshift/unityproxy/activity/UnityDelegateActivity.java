package com.helpshift.unityproxy.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.helpshift.core.HSContext;
import com.helpshift.unityproxy.utils.InstallUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class UnityDelegateActivity extends Activity {
    private static final String TAG = "Helpshft_DelgteActvty";

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.helpshift", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (!InstallUtils.installWithCachedValues(getApplicationContext())) {
                finish();
                return;
            }
            HSContext.getInstance().getHsThreadingService().awaitForSyncExecution();
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("delegateIntent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException e) {
                    Log.e(TAG, "Error in sending pending intent : " + e);
                }
            }
        } finally {
            finish();
        }
    }
}
