package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.common.c;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MBSplashNativeView extends BaseMBSplashNativeView {

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBSplashNativeView.this.a(0);
        }
    }

    class b extends com.mbridge.msdk.shake.b {
        b(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            MBSplashNativeView mBSplashNativeView = MBSplashNativeView.this;
            if (((BaseMBSplashNativeView) mBSplashNativeView).J || ((BaseMBSplashNativeView) mBSplashNativeView).I) {
                return;
            }
            mBSplashNativeView.a(4);
            com.mbridge.msdk.shake.a.a().b(this);
        }
    }

    public MBSplashNativeView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b() {
        if (((BaseMBSplashNativeView) this).x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            ((BaseMBSplashNativeView) this).O = mBShakeView;
            mBShakeView.initView(((BaseMBSplashNativeView) this).N.getAdCall());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((BaseMBSplashNativeView) this).O.setLayoutParams(layoutParams);
            addView(((BaseMBSplashNativeView) this).O);
            ((BaseMBSplashNativeView) this).r.setVisibility(4);
            ((BaseMBSplashNativeView) this).r.setEnabled(false);
            ((BaseMBSplashNativeView) this).O.setOnClickListener(new a());
            ((BaseMBSplashNativeView) this).S = new b(((BaseMBSplashNativeView) this).y, ((BaseMBSplashNativeView) this).z * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.mintegral.msdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    protected void e() {
        ((BaseMBSplashNativeView) this).m.setVisibility(8);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBSplashNativeView(Context context, MBSplashView mBSplashView, c cVar) {
        super(context, mBSplashView, cVar);
    }
}
