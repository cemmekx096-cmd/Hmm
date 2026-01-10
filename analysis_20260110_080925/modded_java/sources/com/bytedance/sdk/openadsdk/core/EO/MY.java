package com.bytedance.sdk.openadsdk.core.EO;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.cL.Bc;
import com.bytedance.sdk.openadsdk.core.lEW.cl;
import com.bytedance.sdk.openadsdk.core.lEW.es;
import com.bytedance.sdk.openadsdk.core.lEW.lEW;
import com.bytedance.sdk.openadsdk.core.lEW.xF;
import com.bytedance.sdk.openadsdk.core.model.bWL;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.model.zPa;
import com.bytedance.sdk.openadsdk.core.rp.MY.vCE;
import com.bytedance.sdk.openadsdk.core.widget.EV;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ea;
import com.bytedance.sdk.openadsdk.core.widget.rp;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY extends com.bytedance.sdk.openadsdk.core.lEW.IlO {
    public static cl[] IlO = {new cl(1, 6.4f, 320, 50), new cl(4, 1.2f, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)};
    private xF bWL;
    private String ea;
    private IlO hp;
    private PAGBannerAdWrapperListener zPa;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.lEW.IlO
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.lEW.IlO
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setClosedListenerKey(String str) {
        this.ea = str;
    }

    public MY(Context context) {
        super(context);
        this.MY = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lEW.IlO
    protected void IlO(View view, int i, bWL bwl) {
        xF xFVar = this.bWL;
        if (xFVar != null) {
            xFVar.IlO(view, i, bwl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void IlO(oeT oet, xF xFVar, com.bytedance.sdk.openadsdk.es.IlO.IlO.vCE vce) {
        setBackgroundColor(-1);
        this.EO = oet;
        this.bWL = xFVar;
        this.vCE = "banner_ad";
        this.bWL.addView(this, new ViewGroup.LayoutParams(-2, -2));
        MY();
    }

    private void MY() {
        cl clVarIlO = IlO(this.bWL.getExpectExpressWidth(), this.bWL.getExpectExpressHeight());
        if (this.bWL.getExpectExpressWidth() > 0 && this.bWL.getExpectExpressHeight() > 0) {
            this.Bc = BS.MY(this.MY, this.bWL.getExpectExpressWidth());
            this.lEW = BS.MY(this.MY, this.bWL.getExpectExpressHeight());
        } else {
            this.Bc = BS.EO(this.MY);
            this.lEW = Float.valueOf(this.Bc / clVarIlO.MY).intValue();
        }
        if (this.Bc > 0 && this.Bc > BS.EO(this.MY)) {
            this.Bc = BS.EO(this.MY);
            this.lEW = Float.valueOf(this.lEW * (BS.EO(this.MY) / this.Bc)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.Bc, this.lEW);
        }
        layoutParams.width = this.Bc;
        layoutParams.height = this.lEW;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (this.EO != null) {
            int iUI = this.EO.uI();
            if (iUI == 1010 || iUI == 1011 || iUI == 1012) {
                tV();
            } else {
                IlO(clVarIlO);
            }
        }
    }

    private void IlO(cl clVar) {
        if (clVar.IlO == 1) {
            EO();
        } else {
            Cc();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void EO() {
        BS.MY(this.MY, 50.0f);
        IlO ilOBc = Bc();
        this.hp = ilOBc;
        ImageView imageView = ilOBc.EO;
        TextView textView = this.hp.MY;
        ea eaVar = this.hp.tV;
        TextView textView2 = this.hp.Bc;
        View view = this.hp.vCE;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.EO.MY.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/EO/MY$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_MY$1_onClick_090beaaedcee7ae9b698c4c1e4abc54d(view2);
                }

                public void safedk_MY$1_onClick_090beaaedcee7ae9b698c4c1e4abc54d(View p0) {
                    TTWebsiteActivity.IlO(MY.this.MY, MY.this.EO, MY.this.vCE);
                }
            });
        }
        if (this.EO.HTA() != null && !TextUtils.isEmpty(this.EO.HTA().IlO())) {
            Bc.IlO().IlO(this.EO.HTA().IlO(), this.EO.HTA().MY(), this.EO.HTA().EO(), imageView, this.EO);
        }
        textView.setText(this.EO.dm());
        if (!TextUtils.isEmpty(this.EO.aa())) {
            textView2.setText(this.EO.aa());
        } else {
            textView2.setVisibility(8);
        }
        BS.IlO((TextView) null, eaVar, this.EO);
        IlO((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        IlO((View) this, true);
        IlO((View) textView2, true);
    }

    private void tV() {
        IlO ilOVCE = vCE();
        this.hp = ilOVCE;
        View view = ilOVCE.vCE;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.EO.MY.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/EO/MY$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                    safedk_MY$2_onClick_a7c672d315e9b470d210ec494141c039(view2);
                }

                public void safedk_MY$2_onClick_a7c672d315e9b470d210ec494141c039(View p0) {
                    TTWebsiteActivity.IlO(MY.this.MY, MY.this.EO, MY.this.vCE);
                }
            });
        }
        rp rpVar = this.hp.IlO;
        if (rpVar != null) {
            List listHg = this.EO.Hg();
            if (listHg != null && !listHg.isEmpty()) {
                Bc.IlO().IlO((zPa) listHg.get(0), rpVar, this.EO);
            }
            IlO((View) rpVar, true);
            rpVar.setTag(520093762, Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Cc() {
        TextView textView;
        TextView textView2;
        if (this.EO != null) {
            int iUI = this.EO.uI();
            if (this.EO.fdM() == null) {
                IlO ilOLEW = lEW();
                this.hp = ilOLEW;
                rp rpVar = ilOLEW.IlO;
                ImageView imageView = this.hp.EO;
                TextView textView3 = this.hp.MY;
                TextView textView4 = this.hp.Bc;
                View view = this.hp.vCE;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.EO.MY.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/EO/MY$3;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked("com.bytedance.sdk", view2);
                            safedk_MY$3_onClick_57f3472ae937ba4ea2911443a1f61b5b(view2);
                        }

                        public void safedk_MY$3_onClick_57f3472ae937ba4ea2911443a1f61b5b(View p0) {
                            TTWebsiteActivity.IlO(MY.this.MY, MY.this.EO, MY.this.vCE);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = rpVar.getLayoutParams();
                if (this.Bc - (BS.MY(this.MY, 8.0f) * 2) >= ((this.lEW - BS.MY(this.MY, 8.0f)) - (BS.MY(this.MY, 21.0f) * 2)) - BS.MY(this.MY, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                rpVar.setLayoutParams(layoutParams);
                if (iUI == 33) {
                    rpVar.setRatio(1.0f);
                } else {
                    rpVar.setRatio(1.91f);
                }
                List listHg = this.EO.Hg();
                if (listHg != null && !listHg.isEmpty()) {
                    Bc.IlO().IlO((zPa) listHg.get(0), rpVar, this.EO);
                    Bc.IlO().IlO(((zPa) listHg.get(0)).IlO(), this.hp.Cc);
                }
                if (this.EO.HTA() == null || TextUtils.isEmpty(this.EO.HTA().IlO())) {
                    textView = textView4;
                    textView2 = textView3;
                } else {
                    textView = textView4;
                    textView2 = textView3;
                    Bc.IlO().IlO(this.EO.HTA().IlO(), this.EO.HTA().MY(), this.EO.HTA().EO(), imageView, this.EO);
                }
                textView2.setText(this.EO.dm());
                if (!TextUtils.isEmpty(this.EO.aa())) {
                    textView.setText(this.EO.aa());
                } else {
                    textView.setVisibility(8);
                }
                BS.IlO((TextView) null, this.hp.tV, this.EO);
                IlO((View) rpVar, true);
                rpVar.setTag(520093762, Boolean.TRUE);
                IlO((View) this, true);
                IlO((View) textView, true);
                return;
            }
            IlO ilODmF = DmF();
            this.hp = ilODmF;
            TextView textView5 = ilODmF.MY;
            TextView textView6 = this.hp.Bc;
            EV ev = this.hp.lEW;
            Bc.IlO().IlO(this.EO.fdM().NV(), this.hp.Cc);
            View view2 = this.hp.vCE;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.EO.MY.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/EO/MY$4;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked("com.bytedance.sdk", view3);
                        safedk_MY$4_onClick_d339ec49d4ba81591435a9072eec94c0(view3);
                    }

                    public void safedk_MY$4_onClick_d339ec49d4ba81591435a9072eec94c0(View p0) {
                        TTWebsiteActivity.IlO(MY.this.MY, MY.this.EO, MY.this.vCE);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = ev.getLayoutParams();
            if (iUI == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                ev.setLayoutParams(layoutParams2);
                ev.setRatio(0.5625f);
            } else if (iUI == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                ev.setLayoutParams(layoutParams2);
                ev.setRatio(1.7777778f);
            } else {
                if (this.Bc - (BS.MY(this.MY, 8.0f) * 2) >= ((this.lEW - BS.MY(this.MY, 8.0f)) - (BS.MY(this.MY, 21.0f) * 2)) - BS.MY(this.MY, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                ev.setLayoutParams(layoutParams2);
                ev.setRatio(1.0f);
            }
            ev.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.rp.MY.vCE videoView = getVideoView();
            if (videoView != null) {
                if (this.bWL instanceof es) {
                    videoView.setNeedSelfManagerVideo(!r7.lEW());
                    this.bWL.setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener(this.bWL);
                }
                ev.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new vCE.IlO() { // from class: com.bytedance.sdk.openadsdk.core.EO.MY.5
                    public void IlO(View view3, int i) {
                        if (MY.this.zPa != null) {
                            MY.this.zPa.onAdClicked();
                        }
                    }
                });
                lEW clickCreativeListener = this.bWL.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.IlO(videoView.getNativeVideoController());
                }
            }
            if (this.EO.HTA() != null && !TextUtils.isEmpty(this.EO.HTA().IlO())) {
                Bc.IlO().IlO(this.EO.HTA().IlO(), this.EO.HTA().MY(), this.EO.HTA().EO(), this.hp.EO, this.EO);
            }
            textView5.setText(this.EO.dm());
            BS.IlO((TextView) null, this.hp.tV, this.EO);
            if (!TextUtils.isEmpty(this.EO.aa())) {
                textView6.setText(this.EO.aa());
            } else {
                textView6.setVisibility(8);
            }
            IlO((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            IlO((View) this, true);
            IlO((View) textView6, true);
            IlO((View) ev);
        }
    }

    public static cl IlO(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? IlO[1] : IlO[0];
        } catch (Throwable unused) {
            return IlO[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lEW.IlO
    public void IlO() {
        if (this.Cc != null) {
            this.Cc.show();
        } else if (this.tV != null) {
            this.tV.IlO();
        } else {
            TTDelegateActivity.IlO(this.EO, this.ea);
        }
    }

    private IlO vCE() {
        int iMY = BS.MY(this.MY, 8.0f);
        View rpVar = new rp(this.MY);
        rpVar.setId(520093736);
        rpVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(rpVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.MY, this.EO);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iMY, iMY, 0, 0);
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new IlO(viewCreatePAGLogoViewByMaterial, rpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.widget.ImageView, com.bytedance.sdk.openadsdk.core.widget.zPa] */
    private IlO Bc() {
        int iMY = BS.MY(this.MY, 38.0f);
        int iMY2 = (int) (BS.MY(this.MY, 25.0f) / 5.0d);
        int iMY3 = BS.MY(this.MY, 10.0f);
        int iMY4 = BS.MY(this.MY, 2.0f);
        int iMY5 = BS.MY(this.MY, 6.0f);
        int iMY6 = BS.MY(this.MY, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.MY);
        addView(relativeLayout, -1, -1);
        ?? zpa = new com.bytedance.sdk.openadsdk.core.widget.zPa(this.MY);
        zpa.setId(520093738);
        TextView textView = new TextView(this.MY);
        textView.setId(520093730);
        View eaVar = new ea(this.MY);
        eaVar.setId(520093735);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.MY, this.EO);
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.MY);
        textView2.setId(520093703);
        IlO ilO = new IlO(zpa, textView, eaVar, pAGLogoViewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMY, iMY);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(20);
            layoutParams.setMarginStart(iMY5);
        }
        layoutParams.setMargins(iMY5, 0, 0, 0);
        zpa.setLayoutParams(layoutParams);
        zpa.setBackgroundColor(-1);
        zpa.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(zpa);
        LinearLayout linearLayout = new LinearLayout(this.MY);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.addRule(16, textView2.getId());
            layoutParams2.addRule(17, zpa.getId());
            layoutParams2.setMarginStart(iMY6);
            layoutParams2.setMarginEnd(iMY6);
        }
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, zpa.getId());
        layoutParams2.setMargins(iMY6, 0, iMY6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextDirection(5);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iMY4;
        eaVar.setLayoutParams(layoutParams4);
        linearLayout.addView(eaVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams5.addRule(20);
        }
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoViewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginEnd(iMY5);
            layoutParams6.addRule(21);
        }
        layoutParams6.rightMargin = iMY5;
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.EV.IlO(this.MY, 12));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iMY3, iMY2, iMY3, iMY2);
        textView2.setText(pP.IlO(this.MY, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return ilO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.widget.ImageView, com.bytedance.sdk.openadsdk.core.widget.zPa] */
    private IlO lEW() {
        int iMY = BS.MY(this.MY, 8.0f);
        int iMY2 = BS.MY(this.MY, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.MY);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iMY, iMY, iMY, iMY2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.MY);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        ?? zpa = new com.bytedance.sdk.openadsdk.core.widget.zPa(this.MY);
        zpa.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(BS.MY(this.MY, 52.0f), BS.MY(this.MY, 52.0f));
        zpa.setScaleType(ImageView.ScaleType.FIT_XY);
        zpa.setLayoutParams(layoutParams3);
        linearLayout.addView(zpa);
        LinearLayout linearLayout2 = new LinearLayout(this.MY);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iMY;
        layoutParams4.rightMargin = iMY;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(iMY);
            layoutParams4.setMarginEnd(iMY);
        }
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.MY);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        View eaVar = new ea(this.MY);
        eaVar.setId(520093735);
        linearLayout2.addView(eaVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.MY);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(BS.MY(this.MY, 76.0f), BS.MY(this.MY, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.EV.IlO(this.MY, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(pP.IlO(this.MY, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.MY);
        if (Build.VERSION.SDK_INT >= 17) {
            frameLayout.setLayoutDirection(3);
        }
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iMY2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        View rpVar = new rp(this.MY);
        rpVar.setId(520093736);
        rpVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(rpVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.MY, this.EO);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iMY, iMY, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new IlO((ImageView) zpa, viewCreatePAGLogoViewByMaterial, textView2, textView, (rp) rpVar, (ea) eaVar, frameLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.widget.ImageView, com.bytedance.sdk.openadsdk.core.widget.zPa] */
    private IlO DmF() {
        int iMY = BS.MY(this.MY, 8.0f);
        int iMY2 = BS.MY(this.MY, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.MY);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iMY, iMY, iMY, iMY2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.MY);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        ?? zpa = new com.bytedance.sdk.openadsdk.core.widget.zPa(this.MY);
        zpa.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(BS.MY(this.MY, 52.0f), BS.MY(this.MY, 52.0f));
        zpa.setScaleType(ImageView.ScaleType.FIT_XY);
        zpa.setLayoutParams(layoutParams3);
        linearLayout.addView(zpa);
        LinearLayout linearLayout2 = new LinearLayout(this.MY);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iMY;
        layoutParams4.rightMargin = iMY;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart(iMY);
            layoutParams4.setMarginEnd(iMY);
        }
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.MY);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        View eaVar = new ea(this.MY);
        eaVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = BS.MY(this.MY, 4.0f);
        linearLayout2.addView(eaVar, layoutParams6);
        TextView textView2 = new TextView(this.MY);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(BS.MY(this.MY, 76.0f), BS.MY(this.MY, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.EV.IlO(this.MY, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(pP.IlO(this.MY, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.MY);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iMY2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        View ev = new EV(this.MY);
        ev.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        ev.setLayoutParams(layoutParams9);
        frameLayout.addView(ev);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.MY, this.EO);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iMY, iMY, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new IlO((ImageView) zpa, viewCreatePAGLogoViewByMaterial, textView2, textView, (EV) ev, (ea) eaVar, frameLayout);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.zPa = pAGBannerAdWrapperListener;
    }

    private static class IlO {
        TextView Bc;
        FrameLayout Cc;
        ImageView EO;
        public rp IlO;
        public TextView MY;
        private EV lEW;
        ea tV;
        View vCE;

        IlO(ImageView imageView, TextView textView, ea eaVar, View view, TextView textView2) {
            this.EO = imageView;
            this.MY = textView;
            this.tV = eaVar;
            this.vCE = view;
            this.Bc = textView2;
        }

        public IlO(ImageView imageView, View view, TextView textView, TextView textView2, rp rpVar, ea eaVar, FrameLayout frameLayout) {
            this.EO = imageView;
            this.vCE = view;
            this.Bc = textView;
            this.MY = textView2;
            this.IlO = rpVar;
            this.tV = eaVar;
            this.Cc = frameLayout;
        }

        public IlO(ImageView imageView, View view, TextView textView, TextView textView2, EV ev, ea eaVar, FrameLayout frameLayout) {
            this.EO = imageView;
            this.vCE = view;
            this.Bc = textView;
            this.MY = textView2;
            this.lEW = ev;
            this.tV = eaVar;
            this.Cc = frameLayout;
        }

        public IlO(View view, rp rpVar) {
            this.vCE = view;
            this.IlO = rpVar;
        }
    }
}
