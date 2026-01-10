package com.bytedance.sdk.component.adexpress.vCE;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.tV.Bc;
import com.bytedance.sdk.component.utils.pP;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class ea extends FrameLayout {
    private boolean Cc;
    private kBB EO;
    private Context IlO;
    private ImageView MY;
    private AnimatorSet tV;

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

    public ea(Context context) {
        super(context);
        this.Cc = true;
        this.IlO = context;
        this.tV = new AnimatorSet();
        EO();
        tV();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vCE.ea.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ea.this.MY.getLayoutParams();
                layoutParams.topMargin = (int) ((ea.this.EO.getMeasuredHeight() / 2.0f) - Bc.IlO(ea.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((ea.this.EO.getMeasuredWidth() / 2.0f) - Bc.IlO(ea.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-ea.this.EO.getMeasuredHeight()) / 2.0f) + Bc.IlO(ea.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-ea.this.EO.getMeasuredWidth()) / 2.0f) + Bc.IlO(ea.this.getContext(), 5.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(layoutParams.leftMargin);
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
                ea.this.MY.setLayoutParams(layoutParams);
            }
        });
    }

    private void EO() {
        this.EO = new kBB(this.IlO);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) Bc.IlO(this.IlO, 40.0f), (int) Bc.IlO(this.IlO, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.EO, layoutParams);
        this.MY = new ImageView(this.IlO);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) Bc.IlO(this.IlO, 62.0f), (int) Bc.IlO(this.IlO, 62.0f));
        layoutParams2.gravity = 16;
        this.MY.setImageResource(pP.tV(this.IlO, "tt_splash_hand"));
        addView(this.MY, layoutParams2);
    }

    private void tV() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.MY, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vCE.ea.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ea.this.MY, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                ea.this.MY.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (ea.this.Cc) {
                    ea.this.EO.IlO();
                }
                ea.this.Cc = !r2.Cc;
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.MY, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.tV.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void IlO() {
        this.tV.start();
    }

    public void MY() {
        AnimatorSet animatorSet = this.tV;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        kBB kbb = this.EO;
        if (kbb != null) {
            kbb.MY();
        }
        ImageView imageView = this.MY;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
