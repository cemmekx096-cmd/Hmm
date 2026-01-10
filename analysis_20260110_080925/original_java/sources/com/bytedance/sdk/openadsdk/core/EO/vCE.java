package com.bytedance.sdk.openadsdk.core.EO;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.vSq;
import com.bytedance.sdk.openadsdk.core.bWL;
import com.bytedance.sdk.openadsdk.core.dY;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class vCE extends com.bytedance.adsdk.ugeno.vCE.IlO<View> implements vSq.IlO {
    private boolean Bc;
    private long Cc;
    private IlO DmF;
    private final ViewTreeObserver.OnScrollChangedListener EV;
    private final Runnable NV;
    private MY lEW;
    private final Handler tV;
    private boolean vCE;

    public interface IlO {
        void IlO(boolean z);
    }

    public interface MY {
        void IlO(boolean z);
    }

    @Override // com.bytedance.adsdk.ugeno.vCE.IlO, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void IlO(Message message) {
        if (message.what == 1) {
            Bc();
        }
    }

    private void Bc() {
        boolean zIlO = dY.IlO(this, 50, -1, false);
        this.Bc = zIlO;
        if (zIlO == this.vCE) {
            return;
        }
        this.vCE = zIlO;
        mmj.IlO(this.NV);
    }

    public vCE(Context context) {
        super(context);
        this.tV = new vSq(bWL.MY().getLooper(), this);
        this.vCE = true;
        this.Bc = true;
        this.NV = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EO.vCE.1
            @Override // java.lang.Runnable
            public void run() {
                if (vCE.this.DmF != null) {
                    vCE.this.DmF.IlO(vCE.this.Bc);
                }
            }
        };
        this.EV = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.EO.vCE.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - vCE.this.Cc > 500) {
                    vCE.this.Cc = jElapsedRealtime;
                    vCE.this.tV.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.EV);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.EV);
        }
    }

    public void setSwiperWindowFocusChangedListener(MY my) {
        this.lEW = my;
    }

    public void setSwiperVisibleChangeListener(IlO ilO) {
        this.DmF = ilO;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        MY my = this.lEW;
        if (my != null) {
            my.IlO(z);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vCE.IlO
    public View NV(int i) {
        return (View) this.IlO.get(i);
    }
}
