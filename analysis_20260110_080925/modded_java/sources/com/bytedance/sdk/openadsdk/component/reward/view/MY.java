package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.DmF.vCE;
import com.bytedance.sdk.component.adexpress.MY.EO;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.IlO.IlO;
import com.bytedance.sdk.openadsdk.core.NV.tV;
import com.bytedance.sdk.openadsdk.core.lEW.bWL;
import com.bytedance.sdk.openadsdk.core.lEW.kBB;
import com.bytedance.sdk.openadsdk.core.lEW.xF;
import com.bytedance.sdk.openadsdk.core.lEW.zPa;
import com.bytedance.sdk.openadsdk.core.model.es;
import com.bytedance.sdk.openadsdk.core.model.vAh;
import com.bytedance.sdk.openadsdk.kBB.MY.Cc;
import com.bytedance.sdk.openadsdk.rp.Bc;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY extends xF {
    public static float IlO = 100.0f;
    private final IlO Cc;
    zPa EO;
    bWL MY;
    public int tV;
    private float vCE;

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/MY;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, motionEvent);
        return safedk_MY_dispatchTouchEvent_77ab57c6bd83e34bb1391db86a3b85f9(motionEvent);
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

    public MY(IlO ilO, AdSlot adSlot, String str) {
        super(ilO.BS, ilO.MY, adSlot, str, ilO.uvo, !ilO.BO);
        this.tV = 1;
        this.vCE = -1.0f;
        this.Cc = ilO;
        setVideoBusiness(ilO.ssS);
    }

    protected void Bc() {
        this.ea = true;
        this.hp = new FrameLayout(this.DmF);
        if (!tV.IlO(this.rp) && !tV.MY(this.rp)) {
            addView(this.hp, new FrameLayout.LayoutParams(-1, -1));
        }
        super.Bc();
        vCE webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        lEW();
        setVideoFrameChangeListener(new Bc() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.MY.1
            public void IlO(com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
                MY.this.MY(bwl);
            }
        });
    }

    private void lEW() {
        setBackupListener(new EO() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.MY.2
            public boolean IlO(ViewGroup viewGroup, int i) {
                try {
                    ((xF) viewGroup).cl();
                    MY.this.EO = new zPa(viewGroup.getContext());
                    MY.this.EO.IlO(MY.this.rp, (xF) viewGroup, MY.this.Cc.zLG);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    public void IlO(com.bytedance.sdk.component.adexpress.MY.tV<? extends View> tVVar, com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
        this.vSq = tVVar;
        if (this.rp != null && this.rp.pS()) {
            super.IlO(tVVar, bwl);
            return;
        }
        if (tVVar instanceof kBB) {
            kBB kbb = (kBB) tVVar;
            if (kbb.zPa() != null) {
                kbb.zPa().IlO(this);
            }
        }
        if (bwl != null && bwl.EO()) {
            MY(bwl);
            this.tV = tVVar.EO();
        }
        super.IlO(tVVar, bwl);
    }

    protected boolean IlO(com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
        if ((this.rp instanceof vAh) && this.rp.dvD() && bwl.EO() && bwl.MY() == 1) {
            return false;
        }
        return super.IlO(bwl);
    }

    public void setExpressVideoListenerProxy(bWL bwl) {
        this.MY = bwl;
    }

    public void MY(final com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
        if (bwl == null) {
            return;
        }
        mmj.IlO(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.MY.3
            @Override // java.lang.Runnable
            public void run() {
                MY.this.EO(bwl);
            }
        });
    }

    public void IlO(String str, JSONObject jSONObject) {
        super.IlO(str, jSONObject);
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.IlO(str, jSONObject);
        }
    }

    public boolean safedk_MY_dispatchTouchEvent_77ab57c6bd83e34bb1391db86a3b85f9(MotionEvent p0) {
        NV nv = this.Cc.DM;
        if (nv != null && nv.ea != null) {
            es esVar = nv.ea;
            if (esVar.DmF()) {
                int action = p0.getAction();
                if (action == 0) {
                    this.vCE = p0.getY();
                } else if (action == 1) {
                }
                if (BS.IlO(this.vCE, p0.getY(), this.DmF)) {
                    esVar.IlO(5);
                }
            }
        }
        return super.dispatchTouchEvent(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EO(com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
        if (bwl == null) {
            return;
        }
        double dVCE = bwl.vCE();
        double dBc = bwl.Bc();
        double dLEW = bwl.lEW();
        double dDmF = bwl.DmF();
        int iMY = BS.MY(this.DmF, (float) dVCE);
        int iMY2 = BS.MY(this.DmF, (float) dBc);
        int iMY3 = BS.MY(this.DmF, (float) dLEW);
        int iMY4 = BS.MY(this.DmF, (float) dDmF);
        new StringBuilder("vW x vH =").append(dLEW).append("x").append(dDmF);
        if ((dDmF != 0.0d && dLEW != 0.0d) || this.vSq.EO() == 7 || this.vSq.EO() == 10) {
            if ((this.vSq.EO() == 7 || this.vSq.EO() == 10) && (bwl instanceof com.bytedance.sdk.openadsdk.core.NV.Cc.MY)) {
                FrameLayout frameLayoutZPa = ((com.bytedance.sdk.openadsdk.core.NV.Cc.MY) bwl).zPa();
                if (frameLayoutZPa != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutZPa.addView(this.hp, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.hp.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iMY3, iMY4);
            }
            layoutParams2.width = iMY3;
            layoutParams2.height = iMY4;
            layoutParams2.topMargin = iMY2;
            layoutParams2.leftMargin = iMY;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(layoutParams2.leftMargin);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            }
            this.hp.setLayoutParams(layoutParams2);
        }
    }

    public void IlO(boolean z, String str) {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.IlO(z, str);
        }
        setSoundMute(z);
    }

    public boolean IlO(JSONObject jSONObject) {
        new StringBuilder("setPlaybackSpeed,params:").append(jSONObject);
        bWL bwl = this.MY;
        if (bwl != null) {
            return bwl.IlO(jSONObject);
        }
        return super.IlO(jSONObject);
    }

    public void IlO() {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.IlO();
        }
    }

    public void MY() {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.MY();
        }
    }

    public void IlO(int i) {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.IlO(i);
        }
    }

    public long EO() {
        bWL bwl = this.MY;
        if (bwl != null) {
            return bwl.EO();
        }
        return 0L;
    }

    public long tV() {
        bWL bwl = this.MY;
        if (bwl != null) {
            return bwl.tV();
        }
        return 0L;
    }

    public int Cc() {
        bWL bwl = this.MY;
        if (bwl != null) {
            return bwl.Cc();
        }
        return 0;
    }

    public void vCE() {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.vCE();
        }
    }

    public void IlO(int i, com.bytedance.sdk.component.adexpress.MY.bWL bwl) {
        bWL bwl2 = this.MY;
        if (bwl2 != null) {
            bwl2.IlO(i, bwl);
        }
    }

    public void IlO(View view, int i, com.bytedance.sdk.component.adexpress.EO eo) {
        if (i != -1 && eo != null && i == 3) {
            vCE();
        } else {
            super.IlO(view, i, eo);
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (cL()) {
            return this.EO.getVideoContainer();
        }
        return this.hp;
    }

    public View getBackupContainerBackgroundView() {
        if (cL()) {
            return this.EO.getBackupContainerBackgroundView();
        }
        return null;
    }

    public void MY(int i) {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.MY(i);
        }
    }

    public void IlO(int i, String str) {
        bWL bwl = this.MY;
        if (bwl != null) {
            bwl.IlO(i, str);
        }
    }

    protected Cc.IlO EO(int i) {
        Cc.IlO ilOEO = super.EO(i);
        if (this.Cc.BO && this.Cc.ED != null) {
            ilOEO.MY = this.Cc.ED.NV;
        }
        return ilOEO;
    }
}
