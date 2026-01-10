package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.o6;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MaxDebuggerTcfStringActivity extends o6 {
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.applovin", me);
        return super.dispatchTouchEvent(me);
    }
}
