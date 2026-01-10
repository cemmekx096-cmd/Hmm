package com.mbridge.msdk.mbbanner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MBBannerWebView extends WindVaneWebView {
    public MBBannerWebView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.mintegral.msdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public MBBannerWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBBannerWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
