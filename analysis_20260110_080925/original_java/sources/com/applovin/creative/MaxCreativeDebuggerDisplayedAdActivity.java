package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.j1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends j1 {
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.applovin", me);
        return super.dispatchTouchEvent(me);
    }
}
