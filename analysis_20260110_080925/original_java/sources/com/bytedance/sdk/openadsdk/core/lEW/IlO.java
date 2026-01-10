package com.bytedance.sdk.openadsdk.core.lEW;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.xF;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.MY.MY;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.model.bWL;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.rp.MY.vCE;
import com.bytedance.sdk.openadsdk.core.tl;
import com.bytedance.sdk.openadsdk.tV.Bc;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.zLG;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class IlO extends com.bytedance.sdk.openadsdk.core.Cc.EO {
    protected int Bc;
    protected TTDislikeDialogAbstract Cc;
    protected int DmF;
    protected oeT EO;
    protected boolean EV;
    private Bc IlO;
    protected Context MY;
    protected boolean NV;
    protected int lEW;
    protected String rp;
    protected com.bytedance.sdk.openadsdk.EO.EO tV;
    protected String vCE;

    protected abstract void IlO(View view, int i, bWL bwl);

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
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

    public IlO(Context context) {
        super(context);
        this.vCE = "embeded_ad";
        this.NV = true;
        this.EV = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public IlO(Context context, String str) {
        super(context);
        this.vCE = "embeded_ad";
        this.NV = true;
        this.EV = true;
        this.rp = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(tl tlVar) {
        if (tlVar instanceof com.bytedance.sdk.openadsdk.EO.EO) {
            this.tV = (com.bytedance.sdk.openadsdk.EO.EO) tlVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        oeT oet;
        if (tTDislikeDialogAbstract != null && (oet = this.EO) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(oet.KT(), this.EO.cJK());
        }
        this.Cc = tTDislikeDialogAbstract;
    }

    public void IlO() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Cc;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.EO.EO eo = this.tV;
        if (eo != null) {
            eo.IlO();
        } else {
            TTDelegateActivity.IlO(this.EO, (String) null);
        }
    }

    protected String getNameOrSource() {
        oeT oet = this.EO;
        if (oet == null) {
            return BuildConfig.FLAVOR;
        }
        if (oet.VH() == null || TextUtils.isEmpty(this.EO.VH().MY())) {
            return !TextUtils.isEmpty(this.EO.hL()) ? this.EO.hL() : BuildConfig.FLAVOR;
        }
        return this.EO.VH().MY();
    }

    protected String getTitle() {
        if (this.EO.VH() != null && !TextUtils.isEmpty(this.EO.VH().MY())) {
            return this.EO.VH().MY();
        }
        if (TextUtils.isEmpty(this.EO.hL())) {
            return !TextUtils.isEmpty(this.EO.dm()) ? this.EO.dm() : BuildConfig.FLAVOR;
        }
        return this.EO.hL();
    }

    protected String getDescription() {
        if (TextUtils.isEmpty(this.EO.dm())) {
            return !TextUtils.isEmpty(this.EO.gm()) ? this.EO.gm() : BuildConfig.FLAVOR;
        }
        return this.EO.dm();
    }

    public float getRealWidth() {
        return BS.EO(this.MY, this.Bc);
    }

    public float getRealHeight() {
        return BS.EO(this.MY, this.lEW);
    }

    protected void IlO(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.MY.IlO my;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.MY;
            oeT oet = this.EO;
            String str = this.vCE;
            my = new com.bytedance.sdk.openadsdk.core.MY.IlO(context, oet, str, zLG.IlO(str));
        } else {
            Context context2 = this.MY;
            oeT oet2 = this.EO;
            String str2 = this.vCE;
            my = new MY(context2, oet2, str2, zLG.IlO(str2));
        }
        view.setOnTouchListener(my);
        view.setOnClickListener(my);
        my.IlO(new MY() { // from class: com.bytedance.sdk.openadsdk.core.lEW.IlO.1
            public void IlO(View view2, int i, bWL bwl) {
                IlO.this.IlO(view2, i, bwl);
            }
        });
    }

    protected com.bytedance.sdk.openadsdk.core.rp.MY.vCE getVideoView() {
        com.bytedance.sdk.openadsdk.core.rp.MY.vCE vce;
        oeT oet = this.EO;
        if (oet != null && this.MY != null) {
            if (oeT.Cc(oet)) {
                try {
                    vce = new com.bytedance.sdk.openadsdk.core.rp.MY.vCE(this.MY, this.EO, this.vCE, true, false, this.IlO);
                    vce.setVideoCacheUrl(this.rp);
                    vce.setControllerStatusCallBack(new vCE.MY() { // from class: com.bytedance.sdk.openadsdk.core.lEW.IlO.2
                        public void IlO(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    vce.setIsAutoPlay(this.NV);
                    vce.IlO(this.EV, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!oeT.Cc(this.EO) && vce != null && vce.IlO(0L, true, false)) {
                    return vce;
                }
            } else {
                vce = null;
                if (!oeT.Cc(this.EO)) {
                }
            }
        }
        return null;
    }

    protected void IlO(int i) {
        this.EV = cl.tV().MY(String.valueOf(this.DmF));
        int iMY = cl.tV().MY(i);
        if (3 == iMY) {
            this.NV = false;
            return;
        }
        int iEO = xF.EO(cl.IlO());
        if (1 != iMY || !zLG.tV(iEO)) {
            if (2 == iMY) {
                if (zLG.Cc(iEO) || zLG.tV(iEO) || zLG.vCE(iEO)) {
                    this.NV = true;
                    return;
                }
                return;
            }
            if (5 != iMY) {
                return;
            }
            if (!zLG.tV(iEO) && !zLG.vCE(iEO)) {
                return;
            }
        }
        this.NV = true;
    }

    protected void IlO(View view) {
        oeT oet = this.EO;
        if (oet == null || oet.fdM() == null || view == null) {
            return;
        }
        IlO(view, this.EO.lMM() == 1 && this.NV);
    }
}
