package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.openadsdk.core.Cc.Cc;
import com.bytedance.sdk.openadsdk.core.Cc.lEW;
import com.bytedance.sdk.openadsdk.core.Cc.tV;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.es;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.bytedance.sdk.openadsdk.core.widget.vCE;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.EV;
import com.bytedance.sdk.openadsdk.utils.zPa;
import com.crashlytics.android.BuildConfig;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class TopLayoutDislike2 extends Cc implements IlO<TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private tV mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private MY mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public void clickDislike() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = BuildConfig.FLAVOR;
        setOrientation(0);
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    public TopLayoutDislike2 load(oeT oet) {
        initView();
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(pP.tV(cl.IlO(), "tt_reward_full_feedback"));
        if (!hp.aP().hp(String.valueOf(oet.hFV())) || oet.vAh() == 5 || oet.vAh() == 6) {
            this.mSkipIV.setImageResource(pP.tV(cl.IlO(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(pP.tV(cl.IlO(), "tt_skip_btn"));
        }
        if (Build.VERSION.SDK_INT >= 19 && this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = oet.fdM() == null ? 0 : ((int) oet.fdM().vCE()) * oet.fdM().oeT();
        if (es.tV(oet) && oet.ea() != null) {
            this.videoDuration = (int) oet.ea().MY();
        } else if (es.Cc(oet) && oet.ea() != null) {
            this.videoDuration = (int) oet.ea().tV();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (oet.OyN() == 8 && oet.ssS() != null) {
            this.skipTime = oet.IlO();
        } else {
            this.skipTime = oet.MY();
        }
        if (OOq.EO(oet)) {
            this.skipTime = cl.tV().IlO(String.valueOf(oet.hFV()), oet.EJ());
            this.videoDuration = oet.XvI();
        }
        int i = this.skipTime;
        this.shouldShowSkipTime = i == -1 || i >= this.videoDuration;
        if (oet.xJ()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText(BuildConfig.FLAVOR);
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    private ImageView getCommonRingBGImageView() {
        tV tVVar = new tV(getContext());
        int iMY = BS.MY(getContext(), 5.0f);
        tVVar.setPadding(iMY, iMY, iMY, iMY);
        tVVar.setScaleType(ImageView.ScaleType.CENTER);
        tVVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.tV.IlO());
        return tVVar;
    }

    private void initView() {
        int iMY = BS.MY(getContext(), 16.0f);
        int iMY2 = BS.MY(getContext(), 20.0f);
        int iMY3 = BS.MY(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMY3, iMY3);
        layoutParams.leftMargin = iMY;
        layoutParams.topMargin = iMY2;
        this.mImgSound.setId(zPa.gYU);
        this.mImgSound.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMY3, iMY3);
        layoutParams2.topMargin = iMY2;
        layoutParams2.leftMargin = iMY;
        this.mImgDislike.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        lEW lew = new lEW(getContext());
        this.mTextViewCountDown = lew;
        lew.setBackground(com.bytedance.sdk.openadsdk.core.widget.tV.MY());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, BS.MY(getContext(), 28.0f));
        layoutParams4.topMargin = BS.MY(getContext(), 20.0f);
        int iMY4 = BS.MY(getContext(), 16.0f);
        layoutParams2.rightMargin = iMY4;
        layoutParams4.rightMargin = iMY4;
        int iMY5 = BS.MY(getContext(), 12.0f);
        BS.MY(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(iMY5, 0, iMY5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iMY3, iMY3);
        layoutParams5.topMargin = iMY2;
        layoutParams5.rightMargin = iMY;
        this.mSkipIV.setLayoutParams(layoutParams5);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tV tVVarMY = vCE.MY(getContext());
        this.mCloseBtn = tVVarMY;
        tVVarMY.setId(520093708);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = BadgeDrawable.TOP_END;
        layoutParams6.topMargin = BS.MY(getContext(), 20.0f);
        layoutParams6.rightMargin = BS.MY(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams6);
        this.mCloseBtn.setContentDescription(pP.IlO(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(view2);
                }

                public void safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.MY(p0);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(view2);
                }

                public void safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(View p0) {
                    Drawable drawableIlO;
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        drawableIlO = TopLayoutDislike2.this.mIsSoundMute ? pP.EO(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : pP.EO(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableIlO = TopLayoutDislike2.this.mIsSoundMute ? EV.IlO(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : EV.IlO(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableIlO);
                    if (Build.VERSION.SDK_INT >= 19 && TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.IlO(p0, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(view2);
                }

                public void safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.IlO(p0);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$4;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                        safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(view2);
                    }

                    public void safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(View p0) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.IlO(p0);
                        }
                    }
                });
            }
        }
        tV tVVar = this.mCloseBtn;
        if (tVVar != null) {
            tVVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(view2);
                }

                public void safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.EO(p0);
                    }
                }
            });
        }
    }

    public void setShowSkip(boolean z) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText(BuildConfig.FLAVOR);
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    public void setShowSound(boolean z) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setSoundMute(boolean z) {
        Drawable drawableIlO;
        this.mIsSoundMute = z;
        if (this.mSkipIV != null) {
            if (z) {
                drawableIlO = pP.EO(getContext(), "tt_reward_full_mute");
            } else {
                drawableIlO = pP.EO(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            drawableIlO = EV.IlO(getContext(), "tt_mute_wrapper");
        } else {
            drawableIlO = EV.IlO(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableIlO);
        if (Build.VERSION.SDK_INT < 19 || this.mImgSound.getDrawable() == null) {
            return;
        }
        this.mImgSound.getDrawable().setAutoMirrored(true);
    }

    public void setTime(CharSequence charSequence, CharSequence charSequence2) throws NumberFormatException {
        int i;
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i2 = this.skipTime;
            if (i2 == 0) {
                i = Integer.parseInt(str);
            } else {
                i = i2 - (this.videoDuration - Integer.parseInt(str));
            }
            if (i > 0) {
                if (this.skipTime == 0) {
                    updateTime(false);
                    return;
                } else {
                    this.mTextViewCountDown.setText(i + "s");
                    updateTime(true);
                    return;
                }
            }
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
        } catch (Exception unused) {
        }
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void setShowDislike(boolean z) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    public void setListener(MY my) {
        this.mTopListener = my;
    }

    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }
}
