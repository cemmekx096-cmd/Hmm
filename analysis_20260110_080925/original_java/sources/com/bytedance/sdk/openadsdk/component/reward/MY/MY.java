package com.bytedance.sdk.openadsdk.component.reward.MY;

import android.content.Context;
import android.graphics.Paint;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.component.utils.vSq;
import com.bytedance.sdk.openadsdk.activity.MY;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.hp;
import com.bytedance.sdk.openadsdk.component.reward.IlO.lEW;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.Cc.tV;
import com.bytedance.sdk.openadsdk.core.MY.Cc;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.es;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.rp.vCE;
import com.bytedance.sdk.openadsdk.tV.MY;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.zPa;
import com.crashlytics.android.BuildConfig;
import com.google.android.material.badge.BadgeDrawable;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class MY extends com.bytedance.sdk.openadsdk.component.reward.MY.IlO {
    protected String EV;
    public LinearLayout bWL;
    private vCE ea;
    public com.bytedance.sdk.openadsdk.core.widget.MY hp;
    protected Cc rp;

    public interface IlO {
        void IlO(boolean z);
    }

    public abstract void Bc();

    public abstract boolean Cc();

    public abstract void IlO(FrameLayout frameLayout);

    public void es() {
    }

    public void hp() {
    }

    public IlO tV() {
        return null;
    }

    public abstract boolean vCE();

    protected boolean wPn() {
        return true;
    }

    public MY(com.bytedance.sdk.openadsdk.component.reward.IlO.IlO ilO) {
        super(ilO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.IlO
    public void IlO(com.bytedance.sdk.openadsdk.core.rp.tV.MY my, vSq vsq) {
        super.IlO(my, vsq);
        if (this.IlO.MY.vCE() && this.IlO.qvT) {
            this.IlO.lMM.IlO(false);
        }
        if (OOq.cL(this.IlO.MY)) {
            this.IlO.pP.rp();
        }
    }

    public void IlO(com.bytedance.sdk.openadsdk.component.reward.view.Bc bc) {
        IlO((FrameLayout) bc, this.IlO);
    }

    public RFEndCardBackUpLayout lEW() {
        return new RFEndCardBackUpLayout(this.IlO.gQ);
    }

    public View DmF() {
        com.bytedance.sdk.openadsdk.core.Cc.EO eo = new com.bytedance.sdk.openadsdk.core.Cc.EO(this.IlO.BS);
        eo.setId(zPa.Ei);
        tV tVVarMY = com.bytedance.sdk.openadsdk.core.widget.vCE.MY(this.IlO.BS);
        tVVarMY.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.topMargin = BS.MY(this.IlO.BS, 20.0f);
        layoutParams.rightMargin = BS.MY(this.IlO.BS, 16.0f);
        tVVarMY.setLayoutParams(layoutParams);
        tVVarMY.setContentDescription(pP.IlO(this.IlO.BS, "tt_ad_close_text"));
        tVVarMY.setVisibility(8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.IlO.BS, this.IlO.MY);
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, BS.MY(this.IlO.BS, 14.0f));
        layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
        pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        tV tVVar = new tV(this.IlO.BS);
        tVVar.setId(zPa.fHv);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(BS.MY(this.IlO.BS, 32.0f), BS.MY(this.IlO.BS, 14.0f));
        layoutParams3.gravity = BadgeDrawable.BOTTOM_END;
        tVVar.setLayoutParams(layoutParams3);
        tVVar.setPadding(BS.MY(this.IlO.BS, 9.0f), 0, BS.MY(this.IlO.BS, 9.0f), 0);
        tVVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.bytedance.sdk.openadsdk.core.widget.NV nv = new com.bytedance.sdk.openadsdk.core.widget.NV(this.IlO.BS);
        nv.setId(zPa.jk);
        nv.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nv.setClickable(true);
        nv.setFocusable(true);
        eo.addView(pAGLogoViewCreatePAGLogoViewByMaterial);
        eo.addView(tVVar);
        eo.addView(nv);
        if (!this.IlO.MY.WIv() || !this.IlO.BO || this.IlO.IlO != 1) {
            com.bytedance.sdk.openadsdk.component.reward.top.EO eo2 = new com.bytedance.sdk.openadsdk.component.reward.top.EO(this.IlO.BS);
            eo2.setId(zPa.Kn);
            eo2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            eo.addView(eo2);
        }
        eo.addView(tVVarMY);
        return eo;
    }

    public View NV() {
        com.bytedance.sdk.openadsdk.core.Cc.Bc bc;
        if (this.MY.zLG() != 5) {
            bc = new com.bytedance.sdk.openadsdk.core.Cc.Bc(this.IlO.BS);
            bc.setId(zPa.OyN);
        } else {
            bc = null;
        }
        new StringBuilder("getLoadingFrameView").append(bc);
        return bc;
    }

    public void EV() {
        this.IlO.OOq.IlO(this.IlO.tV);
        this.IlO.DM.MY();
        this.IlO.mmj.IlO();
        if (!this.IlO.MY.xJ()) {
            if (this.IlO.Bc && TextUtils.isEmpty(oeT.IlO(this.IlO.gQ, this.MY))) {
                rp();
            }
            this.IlO.lMM.IlO();
            this.IlO.nvX.IlO();
        }
        this.IlO.pP.ea();
        this.IlO.YA.IlO();
        if (OOq.Bc(this.IlO.MY)) {
            com.bytedance.sdk.component.DmF.vCE vceNV = this.IlO.lMM.NV();
            if (vceNV != null) {
                vceNV.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.IlO.lMM.EV().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.IlO.YA.EO(true);
            if (OOq.cL(this.IlO.MY)) {
                this.IlO.DM.tV();
                BS.IlO(vceNV, 4);
                BS.IlO(this.IlO.lMM.EV(), 0);
            }
        }
        if (OOq.vCE(this.IlO.MY)) {
            this.IlO.DM.tV();
            BS.IlO(this.IlO.lMM.NV(), 4);
        }
        if (es.tV(this.IlO.MY) || es.MY(this.IlO.MY) || es.Cc(this.IlO.MY)) {
            return;
        }
        this.IlO.DM.IlO(BS.MY(this.IlO.gQ, this.IlO.Jz), BS.MY(this.IlO.gQ, this.IlO.wD));
        this.IlO.kBB.IlO();
        if (OOq.cL(this.IlO.MY)) {
            this.IlO.lMM.IlO(true);
            this.IlO.lMM.Cc();
            IlO(false, false, false, MY.C0023MY.EO);
        } else if (this.IlO.Hg) {
            this.IlO.DM.IlO(0);
        }
    }

    public void rp() {
        LinearLayout linearLayout = (LinearLayout) this.IlO.zLG.findViewById(zPa.hp);
        this.bWL = linearLayout;
        BS.IlO(linearLayout, 8);
        this.IlO.pFe = new hp(this.IlO.BS, this.IlO.MY, "landingpage_endcard");
        this.IlO.pFe.EO().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.MY.MY.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/MY/MY$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_MY$1_onClick_f72d917035b8c019fd9249ea087d7c28(view);
            }

            public void safedk_MY$1_onClick_f72d917035b8c019fd9249ea087d7c28(View p0) {
                View p02 = MY.this.IlO.DM.NV();
                p02.performClick();
            }
        });
        this.bWL.addView(this.IlO.pFe.Cc(), new LinearLayout.LayoutParams(-1, -1));
        this.IlO.lMM.IlO(this.IlO.pFe);
    }

    public void IlO(boolean z, boolean z2, boolean z3, int i) {
        this.IlO.mmj.IlO(z, z2, z3, this, i);
    }

    public void bWL() {
        com.bytedance.sdk.openadsdk.core.widget.MY my = this.hp;
        if (my == null || !my.isShowing()) {
            return;
        }
        this.hp.dismiss();
    }

    public void ea() {
        if (this.IlO.Bc) {
            return;
        }
        this.IlO.YA.Cc();
        if (!this.IlO.tV() || this.IlO.ED == null || this.IlO.ED.kBB()) {
            if (this.IlO.BO && (this.IlO.ED instanceof com.bytedance.sdk.openadsdk.activity.IlO)) {
                return;
            }
            this.IlO.DM.Cc(0);
        }
    }

    public void zPa() {
        this.NV.removeMessages(300);
    }

    public void cl() {
        if (!OOq.NV(this.MY) || this.IlO.lMM.zLG()) {
            cL();
        }
        if (this.IlO == null) {
            return;
        }
        if (this.IlO.ts != null) {
            this.IlO.ts.IlO();
        }
        this.IlO.IlO();
    }

    protected void cL() {
        if (this.IlO.NV.get() && !this.IlO.Bc && this.IlO.AXM.getAndSet(false) && (this.IlO.lEW >= 0 || this.IlO.lEW == -1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            messageObtain.arg1 = this.IlO.lEW;
            this.IlO.HSR.sendMessage(messageObtain);
        }
        if (this.IlO.DmF <= 0 || !this.IlO.oeT.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        messageObtain2.arg1 = this.IlO.DmF;
        this.IlO.HSR.sendMessage(messageObtain2);
    }

    public void xF() {
        if (this.IlO == null) {
            return;
        }
        this.IlO.KC = false;
        new StringBuilder("onPause mIsActivityShow=").append(this.IlO.KC).append(" mIsMute=").append(this.IlO.uvo);
        if (!this.IlO.EV.get()) {
            this.IlO.vAh.bWL();
        }
        zPa();
        this.IlO.lMM.AXM();
        this.IlO.pP.zPa();
        this.IlO.oeT.set(true);
        if (this.IlO.NV.get()) {
            this.IlO.AXM.set(true);
        }
        if (this.IlO.ts != null) {
            this.IlO.ts.MY();
        }
        this.IlO.MY();
    }

    public void AXM() {
        if (this.IlO == null) {
            return;
        }
        if (this.IlO.DM != null) {
            this.IlO.DM.zPa();
        }
        new StringBuilder("onStop mIsMute=").append(this.IlO.uvo).append(" mLast=").append(this.IlO.dY.IlO()).append(" mVolume=").append(DeviceUtils.Bc());
        this.IlO.lMM.xF();
        if (this.IlO.uvo) {
            this.IlO.BS.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.MY.MY.2
                @Override // java.lang.Runnable
                public void run() {
                    if (MY.this.IlO.dY.IlO() > 0) {
                        MY.this.IlO.dY.IlO(false);
                    }
                }
            });
        }
    }

    public void oeT() {
        if (this.IlO.tl != null) {
            this.IlO.tl.vCE();
        }
        if (this.IlO.DM != null) {
            this.IlO.DM.bWL();
        }
        this.IlO.vAh.dY();
        if (!Cc()) {
            this.IlO.NV.get();
        }
        if (this.IlO.lMM != null) {
            this.IlO.lMM.zPa();
        }
        if (this.IlO.pP != null) {
            this.IlO.pP.Bc(lEW.IlO);
        }
        if (this.IlO.DM != null) {
            this.IlO.DM.rp();
        }
        if (this.IlO.mmj != null) {
            this.IlO.mmj.EO();
        }
        if (this.IlO.OOq != null) {
            this.IlO.OOq.MY();
        }
        if (this.IlO.ts != null) {
            this.IlO.ts.EO();
        }
    }

    public void vAh() {
        int iIlO;
        if (cl.tV().xF(String.valueOf(this.IlO.vCE)) == 1) {
            if (this.IlO.tV) {
                if (OOq.EO(this.IlO.MY)) {
                    iIlO = cl.tV().IlO(String.valueOf(this.IlO.vCE), true);
                } else {
                    iIlO = this.IlO.MY.MY();
                }
            } else if (OOq.EO(this.IlO.MY)) {
                iIlO = cl.tV().IlO(String.valueOf(this.IlO.vCE), false);
            } else {
                iIlO = this.IlO.MY.IlO();
            }
            if (this.IlO.DM != null && this.IlO.DM.DmF()) {
                if (this.IlO.DM != null) {
                    this.IlO.DM.NV().performClick();
                }
            } else if ((!this.IlO.NV.get() || OOq.EO(this.IlO.MY)) && iIlO != -1) {
                if (((this.IlO.vAh == null || this.IlO.vAh.rp() < iIlO * 1000) && (this.IlO.pP == null || !this.IlO.pP.tV(iIlO))) || this.IlO.YA == null) {
                    return;
                }
                this.IlO.YA.tV();
            }
        }
    }

    public void kBB() {
        this.IlO.YA.EO();
        this.IlO.YA.Cc(true);
    }

    public void pP() {
        this.rp = this.IlO.wPn.EO();
    }

    public void tl() {
        if (!vCE() && ((this instanceof lEW) || (this instanceof DmF))) {
            this.IlO.wPn.MY();
            return;
        }
        if (!this.DmF.IlO(this.Cc.hp(), false)) {
            this.NV.removeMessages(300);
            if (this.IlO.BO && (this.IlO.ED instanceof com.bytedance.sdk.openadsdk.activity.IlO)) {
                this.IlO.ED.AXM();
            } else {
                IlO(MY.C0023MY.IlO);
                this.Cc.IlO(!this.Cc.nvX() ? 1 : 0, 4);
            }
        }
        if (this.IlO == null || this.IlO.MY == null || this.IlO.ts == null || !this.IlO.MY.pS()) {
            return;
        }
        this.IlO.ts.IlO(this.IlO.vAh.pP());
    }

    public void IlO(int i) {
        this.Cc.cL();
        IlO(false, true, false, i);
        if (this.IlO.tV) {
            this.DmF.IlO(10000);
        }
    }

    public void IlO(vCE vce) {
        this.ea = vce;
        EO();
        if (!this.IlO.MY.xJ() && wPn()) {
            OOq();
        }
        if (wPn()) {
            this.IlO.mmj.MY();
        }
        if (es.tV(this.IlO.MY) || es.Cc(this.IlO.MY)) {
            this.NV.sendEmptyMessageDelayed(500, 100L);
        }
        this.IlO.DM.IlO(this.IlO.hL == 100.0f);
        pP();
        Bc();
    }

    public final void OOq() {
        if (this.IlO.BS.isFinishing()) {
            return;
        }
        this.IlO.lMM.ea();
        String str = this.IlO.tV ? "reward_endcard" : "fullscreen_endcard";
        this.IlO.lMM.IlO(this.ea, str, this.IlO.ssS);
        this.IlO.pP.IlO(this.ea, this.IlO.uvo);
        this.IlO.lMM.IlO(str, this.IlO.ssS);
        this.IlO.lMM.Cc();
    }

    public void IlO(Message message) {
        new StringBuilder("handleMsg: ").append(message.what);
        int i = message.what;
        if (i == 1) {
            kBB();
            return;
        }
        if (i == 300) {
            if (this.IlO.BO && (this.IlO.ED instanceof com.bytedance.sdk.openadsdk.activity.IlO)) {
                this.IlO.ED.AXM();
            } else {
                IlO(MY.C0023MY.MY);
                this.IlO.vAh.IlO(!this.IlO.vAh.nvX() ? 1 : 0, 1 ^ (this.IlO.vAh.nvX() ? 1 : 0));
            }
            if (this.IlO.MY.QfH() != null && this.IlO.MY.QfH().IlO() != null) {
                this.IlO.MY.QfH().IlO().IlO(com.bytedance.sdk.openadsdk.core.EV.IlO.IlO.GENERAL_LINEAR_AD_ERROR);
            }
            if (this.IlO.DM.ea != null) {
                this.IlO.DM.ea.NV();
                return;
            }
            return;
        }
        if (i == 400) {
            this.IlO.vAh.cL();
            IlO(false, true, false, 3);
            return;
        }
        if (i == 500) {
            if (!OOq.Bc(this.IlO.MY)) {
                this.IlO.YA.EO(false);
            }
            com.bytedance.sdk.component.DmF.vCE vceNV = this.IlO.lMM.NV();
            if (vceNV != null && vceNV.getWebView() != null) {
                vceNV.hp();
                vceNV.getWebView().resumeTimers();
            }
            if (this.IlO.lMM.NV() != null) {
                this.IlO.lMM.IlO(1.0f);
                this.IlO.DM.IlO(1.0f);
            }
            if (!this.IlO.MY.EJ() && this.IlO.vAh.vCE() && this.IlO.cL.get()) {
                this.IlO.vAh.cL();
                return;
            }
            return;
        }
        if (i == 600) {
            ea();
            return;
        }
        if (i == 700) {
            int i2 = message.arg1;
            if (this.IlO.AXM.get()) {
                return;
            }
            if (i2 > 0) {
                this.IlO.YA.MY();
                this.IlO.YA.IlO((CharSequence) ((i2 / VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD) + "s"));
                this.IlO.YA.Cc(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = i2 - 1000;
                com.bytedance.sdk.openadsdk.component.reward.IlO.IlO ilO = this.IlO;
                ilO.lEW -= 1000;
                this.NV.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.NV.removeMessages(700);
            if (OOq.DmF(this.MY)) {
                if (this.IlO.pP.Bc() || !this.IlO.lMM.cL()) {
                    ea();
                    return;
                } else {
                    kBB();
                    return;
                }
            }
            ea();
            return;
        }
        if (i == 800) {
            if (!OOq.Bc(this.IlO.MY)) {
                this.IlO.YA.EO(false);
            }
            this.IlO.DM.IlO(1.0f);
            if (!this.IlO.MY.EJ() && this.IlO.vAh.vCE() && this.IlO.cL.get()) {
                this.IlO.vAh.cL();
                return;
            }
            return;
        }
        if (i == 900 && !this.IlO.oeT.get()) {
            int i3 = message.arg1;
            double dYA = this.IlO.vAh.YA();
            IlO(i3, (long) (1000.0d * dYA));
            if (i3 > 0) {
                this.IlO.YA.MY();
                this.IlO.YA.IlO((CharSequence) ((i3 / VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD) + "s"));
                this.IlO.YA.Cc(false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 900;
                messageObtain2.arg1 = i3 - 1000;
                this.IlO.DmF = messageObtain2.arg1;
                this.NV.sendMessageDelayed(messageObtain2, 1000L);
                if (this.IlO.BO && (this.IlO.ED instanceof com.bytedance.sdk.openadsdk.activity.IlO) && dYA > 0.0d) {
                    this.IlO.ED.IlO((float) (1.0d - ((i3 / 1000.0f) / dYA)));
                    return;
                }
                return;
            }
            this.NV.removeMessages(900);
            ea();
            com.bytedance.sdk.openadsdk.activity.vCE vce = this.IlO.ED;
            if (this.IlO.BO && (vce instanceof com.bytedance.sdk.openadsdk.activity.IlO)) {
                vce.pP().IlO(vce, new MY.Cc(5, this.IlO));
            }
        }
    }

    private void IlO(long j, long j2) {
        long j3 = j2 - j;
        if (this.IlO.BS instanceof TTRewardVideoActivity) {
            this.IlO.BS.MY(j3, j2);
        } else if (this.IlO.ssS instanceof com.bytedance.sdk.openadsdk.activity.Cc) {
            this.IlO.ssS.IlO(j3, j2);
        }
    }

    static void IlO(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.IlO.IlO ilO) {
        final tV tVVar;
        Context context = frameLayout.getContext();
        if (ilO.qvT) {
            com.bytedance.sdk.openadsdk.core.Cc.EO eo = new com.bytedance.sdk.openadsdk.core.Cc.EO(context);
            eo.setId(zPa.NV);
            frameLayout.addView((View) eo, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutIlO = IlO(context);
            String strIlO = BuildConfig.FLAVOR;
            if (oeT.Cc(ilO.MY)) {
                com.bykv.vk.openvk.IlO.IlO.IlO.EO.MY myFdM = ilO.MY.fdM();
                if (myFdM != null) {
                    strIlO = myFdM.NV();
                }
            } else {
                List listHg = ilO.MY.Hg();
                if (listHg != null && !listHg.isEmpty()) {
                    strIlO = ((com.bytedance.sdk.openadsdk.core.model.zPa) listHg.get(0)).IlO();
                }
            }
            if (TextUtils.isEmpty(strIlO)) {
                tVVar = null;
            } else {
                tVVar = new tV(context);
                tVVar.setId(zPa.VC);
                tVVar.setTag(zPa.VC, strIlO);
                tVVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutIlO.addView(tVVar);
            }
            eo.addView(frameLayoutIlO);
            View eo2 = new com.bytedance.sdk.openadsdk.component.reward.view.EO(context);
            eo2.setId(zPa.rp);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(eo2, layoutParams);
            eo2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.MY.MY.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = ilO.zLG.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = ilO.zLG.findViewById(zPa.fHv);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = ilO.zLG.findViewById(zPa.hjY);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    tV tVVar2 = tVVar;
                    if (tVVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = tVVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            tVVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.Cc.Cc cc = new com.bytedance.sdk.openadsdk.core.Cc.Cc(context);
            cc.setId(zPa.hp);
            cc.setOrientation(1);
            cc.setVisibility(8);
            frameLayout.addView((View) cc, new FrameLayout.LayoutParams(-1, -1));
        }
        if (ilO.AK) {
            View vce = new com.bytedance.sdk.component.DmF.vCE(context, true);
            vce.setId(zPa.bWL);
            vce.setLayerType(2, (Paint) null);
            vce.setVisibility(4);
            frameLayout.addView(vce, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(zPa.ea);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (OOq.MY(ilO.MY)) {
                View eo3 = new com.bytedance.sdk.openadsdk.core.Cc.EO(context);
                eo3.setId(zPa.bYL);
                eo3.setVisibility(4);
                frameLayout.addView(eo3, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        View vce2 = new com.bytedance.sdk.component.DmF.vCE(context, true);
        vce2.setId(zPa.zPa);
        vce2.setVisibility(8);
        frameLayout.addView(vce2, new FrameLayout.LayoutParams(-1, -1));
    }

    protected static FrameLayout IlO(Context context) {
        com.bytedance.sdk.openadsdk.core.Cc.EO eo = new com.bytedance.sdk.openadsdk.core.Cc.EO(context);
        eo.setId(zPa.EV);
        eo.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        eo.setLayoutParams(layoutParams);
        return eo;
    }
}
