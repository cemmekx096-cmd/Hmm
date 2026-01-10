package com.bytedance.sdk.openadsdk.core.lEW;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.MY.Bc;
import com.bytedance.sdk.component.adexpress.MY.bWL;
import com.bytedance.sdk.component.adexpress.MY.ea;
import com.bytedance.sdk.component.adexpress.MY.tV;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.lEW.Cc;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.tl;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.bytedance.sdk.openadsdk.utils.zPa;
import com.google.android.material.badge.BadgeDrawable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class EO {
    private int Bc;
    private xF Cc;
    private int DmF;
    private IlO EO;
    oeT IlO;
    private final Context MY;
    private ScheduledFuture<?> lEW;
    private ea tV;
    private int vCE;

    /* renamed from: com.bytedance.sdk.openadsdk.core.lEW.EO$EO, reason: collision with other inner class name */
    interface InterfaceC0021EO {
        void IlO();

        void IlO(int i, int i2);

        void IlO(String str);

        void MY(String str);
    }

    public EO(Context context, xF xFVar, oeT oet, String str) {
        this.IlO = oet;
        this.MY = context;
        this.Cc = xFVar;
        IlO(xFVar);
        this.EO = new IlO(context, oet, this.vCE, this.Bc, str, this.DmF);
    }

    private void IlO(xF xFVar) {
        oeT oet = this.IlO;
        if (oet != null && oet.pS()) {
            this.vCE = -1;
            this.Bc = -1;
            return;
        }
        cl clVarIlO = com.bytedance.sdk.openadsdk.core.EO.MY.IlO(xFVar.getExpectExpressWidth(), xFVar.getExpectExpressHeight());
        this.DmF = clVarIlO.IlO;
        if (xFVar.getExpectExpressWidth() > 0 && xFVar.getExpectExpressHeight() > 0) {
            this.vCE = BS.MY(this.MY, xFVar.getExpectExpressWidth());
            this.Bc = BS.MY(this.MY, xFVar.getExpectExpressHeight());
        } else {
            int iEO = BS.EO(this.MY);
            this.vCE = iEO;
            this.Bc = Float.valueOf(iEO / clVarIlO.MY).intValue();
        }
        int i = this.vCE;
        if (i <= 0 || i <= BS.EO(this.MY)) {
            return;
        }
        this.vCE = BS.EO(this.MY);
        this.Bc = Float.valueOf(this.Bc * (BS.EO(this.MY) / this.vCE)).intValue();
    }

    public void IlO(ea eaVar) {
        this.tV = eaVar;
    }

    public void IlO() {
        oeT oet = this.IlO;
        if (oet != null && oet.pS()) {
            this.lEW = mmj.IlO().schedule(new MY(this.EO.rp), cl.tV().pP(), TimeUnit.MILLISECONDS);
        }
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.IlO(new Bc() { // from class: com.bytedance.sdk.openadsdk.core.lEW.EO.1
                public void IlO(View view, bWL bwl) {
                    if (EO.this.Cc == null || view == null) {
                        if (EO.this.tV != null) {
                            EO.this.tV.a_(106);
                        }
                    } else if (EO.this.tV != null) {
                        EO.this.tV.IlO(EO.this.EO, bwl);
                    }
                    EO.this.EO();
                }

                public void IlO(int i, String str) {
                    if (EO.this.tV != null) {
                        EO.this.tV.a_(106);
                    }
                    EO.this.EO();
                }
            });
            View viewCc = this.EO.Cc();
            this.Cc.removeView(viewCc);
            if (viewCc.getParent() != null) {
                ((ViewGroup) viewCc.getParent()).removeView(viewCc);
            }
            this.Cc.addView(viewCc, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        ea eaVar = this.tV;
        if (eaVar != null) {
            eaVar.a_(106);
        }
    }

    public void MY() {
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.tV();
            this.EO = null;
        }
        EO();
        this.tV = null;
        this.Cc = null;
    }

    public void IlO(tl tlVar) {
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.IlO(tlVar);
        }
    }

    public void IlO(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.IlO(tTDislikeDialogAbstract);
        }
    }

    public void IlO(String str) {
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.IlO(str);
        }
    }

    public void IlO(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        IlO ilO = this.EO;
        if (ilO != null) {
            ilO.IlO(pAGExpressAdWrapperListener);
        }
    }

    public static class IlO implements tV<View>, Cc.MY {
        private final int Bc;
        private final Context Cc;
        private oeT DmF;
        private TTDislikeDialogAbstract EO;
        private String EV;
        AtomicBoolean IlO = new AtomicBoolean(false);
        private com.bytedance.sdk.openadsdk.EO.EO MY;
        private final int NV;
        private Bc bWL;
        private PAGExpressAdWrapperListener ea;
        private int hp;
        private FrameLayout lEW;
        private Cc rp;
        private String tV;
        private final int vCE;

        public int EO() {
            return 5;
        }

        public View IlO() {
            return null;
        }

        public IlO(Context context, oeT oet, int i, int i2, String str, int i3) {
            this.EV = str;
            if (oet != null && oet.pS()) {
                this.EV = "fullscreen_interstitial_ad";
            }
            this.Cc = context;
            this.vCE = i;
            this.Bc = i2;
            this.DmF = oet;
            this.NV = BS.MY(context, 3.0f);
            this.hp = i3;
            vCE();
        }

        private void vCE() {
            FrameLayout frameLayout = new FrameLayout(this.Cc);
            this.lEW = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.vCE, this.Bc);
            }
            layoutParams.width = this.vCE;
            layoutParams.height = this.Bc;
            layoutParams.gravity = 17;
            this.lEW.setLayoutParams(layoutParams);
            View viewLEW = lEW();
            this.lEW.addView(viewLEW);
            View viewBc = Bc();
            this.lEW.addView(viewBc);
            oeT oet = this.DmF;
            if (oet != null && oet.pS()) {
                viewLEW.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                viewLEW.IlO(((Activity) this.Cc).findViewById(zPa.pS), FriendlyObstructionPurpose.OTHER);
            }
            viewLEW.IlO(viewBc, FriendlyObstructionPurpose.OTHER);
            Context context = this.Cc;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(zPa.Ei);
            if (viewFindViewById != null) {
                viewLEW.IlO(viewFindViewById, FriendlyObstructionPurpose.OTHER);
            }
            View viewFindViewById2 = ((Activity) this.Cc).findViewById(zPa.OyN);
            if (viewFindViewById2 != null) {
                viewLEW.IlO(viewFindViewById2, FriendlyObstructionPurpose.OTHER);
            }
        }

        public void IlO(Bc bc) {
            oeT oet;
            if (this.IlO.get()) {
                return;
            }
            if (this.Cc == null || (oet = this.DmF) == null) {
                bc.IlO(106, "material null");
                return;
            }
            this.bWL = bc;
            if (TextUtils.isEmpty(oet.KS())) {
                bc.IlO(106, "dsp data is null");
            } else {
                this.rp.xF();
            }
        }

        private View Bc() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.Cc, this.DmF);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            oeT oet = this.DmF;
            if (oet != null && oet.pS()) {
                layoutParams.leftMargin = BS.MY(this.Cc, 20.0f);
                layoutParams.bottomMargin = BS.MY(this.Cc, 20.0f);
                layoutParams.gravity = BadgeDrawable.BOTTOM_START;
            } else {
                layoutParams.topMargin = this.NV;
                layoutParams.leftMargin = this.NV;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lEW.EO.IlO.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lEW/EO$IlO$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                    safedk_EO$IlO$1_onClick_b9b1afef22db9d4cc21637479780d82f(view);
                }

                public void safedk_EO$IlO$1_onClick_b9b1afef22db9d4cc21637479780d82f(View p0) {
                    TTWebsiteActivity.IlO(IlO.this.Cc, IlO.this.DmF, IlO.this.EV);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        private Cc lEW() {
            Cc ccMY = tV.IlO().MY();
            this.rp = ccMY;
            if (ccMY == null) {
                this.rp = new Cc(this.Cc);
            }
            tV.IlO().EO(this.rp);
            this.rp.IlO(this.DmF, this, this.EV);
            this.rp.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.rp;
        }

        public View Cc() {
            return this.lEW;
        }

        public void tV() {
            this.lEW = null;
            this.MY = null;
            this.EO = null;
            this.bWL = null;
            this.DmF = null;
            Cc cc = this.rp;
            if (cc != null) {
                cc.zPa();
                tV.IlO().IlO(this.rp);
            }
            this.IlO.set(true);
        }

        public void IlO(tl tlVar) {
            if (tlVar instanceof com.bytedance.sdk.openadsdk.EO.EO) {
                this.MY = (com.bytedance.sdk.openadsdk.EO.EO) tlVar;
            }
        }

        public void IlO(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            oeT oet;
            if (tTDislikeDialogAbstract != null && (oet = this.DmF) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(oet.KT(), this.DmF.cJK());
            }
            this.EO = tTDislikeDialogAbstract;
        }

        public void IlO(String str) {
            this.tV = str;
        }

        public View MY() {
            FrameLayout frameLayout = this.lEW;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        public void IlO(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.ea;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        public void i_() {
            if (this.bWL != null) {
                bWL bwl = new bWL();
                bwl.IlO(true);
                bwl.IlO(BS.EO(this.Cc, this.vCE));
                bwl.MY(BS.EO(this.Cc, this.Bc));
                this.bWL.IlO(this.lEW, bwl);
            }
        }

        public void IlO(int i, int i2) {
            Bc bc = this.bWL;
            if (bc != null) {
                bc.IlO(i, "render fail");
            }
        }

        public void IlO(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.ea = pAGExpressAdWrapperListener;
        }
    }

    private static class MY implements Runnable {
        InterfaceC0021EO IlO;

        public MY(InterfaceC0021EO interfaceC0021EO) {
            this.IlO = interfaceC0021EO;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0021EO interfaceC0021EO = this.IlO;
            if (interfaceC0021EO != null) {
                interfaceC0021EO.IlO(107, 107);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EO() {
        try {
            ScheduledFuture<?> scheduledFuture = this.lEW;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.lEW.cancel(false);
            this.lEW = null;
        } catch (Throwable unused) {
        }
    }
}
