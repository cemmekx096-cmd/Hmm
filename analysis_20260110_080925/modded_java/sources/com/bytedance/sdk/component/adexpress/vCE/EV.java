package com.bytedance.sdk.component.adexpress.vCE;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.EO.IlO;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class EV extends FrameLayout {
    private final rp EO;
    private final TextView IlO;
    private final ImageView MY;
    private final RotateAnimation tV;

    @Override // android.view.ViewGroup, android.view.View
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

    public EV(Context context) {
        super(context);
        addView(IlO.tV(context));
        this.IlO = (TextView) findViewById(2097610742);
        this.MY = (ImageView) findViewById(2097610745);
        this.EO = findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.tV = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.IlO;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void IlO() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void MY() {
        this.tV.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vCE.EV.1
            @Override // java.lang.Runnable
            public void run() {
                EV.this.MY.startAnimation(EV.this.tV);
                EV.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vCE.EV.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EV.this.EO.IlO(4);
                    }
                }, 100L);
                EV.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vCE.EV.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        EV.this.EO.IlO(4);
                    }
                }, 300L);
                EV ev = EV.this;
                ev.postDelayed(ev.getHaloAnimation(), 1200L);
            }
        };
    }
}
