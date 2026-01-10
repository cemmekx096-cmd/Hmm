package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.utils.Cc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long IlO;
    private long MY;

    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.bytedance.sdk", me);
        return super.dispatchTouchEvent(me);
    }

    protected void onResume() {
        super.onResume();
        if (Cc.EO()) {
            this.MY = SystemClock.elapsedRealtime();
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.MY > 0) {
            this.IlO += SystemClock.elapsedRealtime() - this.MY;
            this.MY = 0L;
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        long j = this.IlO;
        if (j > 0) {
            Cc.IlO(j);
        }
    }
}
