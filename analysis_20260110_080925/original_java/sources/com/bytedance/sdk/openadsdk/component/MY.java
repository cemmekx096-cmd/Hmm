package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.MY.EO;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.DmF.Bc;
import com.bytedance.sdk.openadsdk.core.MY.MY;
import com.bytedance.sdk.openadsdk.core.lEW.DmF;
import com.bytedance.sdk.openadsdk.core.lEW.lEW;
import com.bytedance.sdk.openadsdk.core.lEW.xF;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.crashlytics.android.BuildConfig;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MY extends EO {
    private com.bytedance.sdk.openadsdk.component.DmF.MY bWL;
    private boolean ea;
    private final com.bytedance.sdk.openadsdk.component.vCE.MY hp;
    private Bc zPa;

    public MY(Activity activity, oeT oet, FrameLayout frameLayout, IlO ilO, int i, boolean z, com.bytedance.sdk.openadsdk.component.lEW.IlO ilO2, com.bytedance.sdk.openadsdk.component.vCE.MY my) {
        super(activity, oet, frameLayout, ilO, i, z, ilO2);
        this.hp = my;
    }

    public void IlO(ViewGroup viewGroup) {
        Pair pairIlO = com.bytedance.sdk.openadsdk.core.lEW.IlO.IlO.IlO(this.IlO.getWindow(), this.Bc);
        com.bytedance.sdk.openadsdk.component.DmF.MY my = new com.bytedance.sdk.openadsdk.component.DmF.MY(this.IlO, this.MY, new AdSlot.Builder().setCodeId(String.valueOf(this.MY.hFV())).setExpressViewAcceptedSize(((Float) pairIlO.first).floatValue(), ((Float) pairIlO.second).floatValue()).build(), "open_ad", this.Cc, this.hp, this.rp);
        this.bWL = my;
        my.setTopListener(this.Cc);
        this.bWL.setExpressVideoListenerProxy(this.Cc);
        this.bWL.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.MY.1
            public void onAdClicked() {
            }

            public void onAdDismissed() {
            }

            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
                MY.this.Cc.tV();
            }

            public void onRenderSuccess(View view, float f, float f2) {
                if (MY.this.bWL.cL()) {
                    MY.this.ea = true;
                    if (MY.this.zPa != null && MY.this.tV == MY.this.zPa.getParent()) {
                        MY.this.tV.removeView(MY.this.zPa);
                    }
                    MY my2 = MY.this;
                    MY.super.IlO((MY) my2.tV);
                    MY.super.IlO();
                    MY.super.MY();
                    return;
                }
                if (MY.this.MY.mV()) {
                    MY.this.Cc.EO();
                    return;
                }
                if (MY.this.EO) {
                    MY my3 = MY.this;
                    if (my3.IlO(my3.bWL.getVideoFrameLayout())) {
                        MY.this.bWL.setVideoManager(MY.this.Bc());
                        MY.this.Cc.EO();
                        return;
                    } else {
                        MY.this.Cc.tV();
                        return;
                    }
                }
                MY.this.Cc.EO();
            }
        });
        this.MY.rp(1);
        this.tV.addView((View) this.bWL, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        this.zPa = new Bc(this.IlO);
        this.tV.addView(this.zPa);
        this.DmF = this.zPa.getTopDislike();
        this.NV = this.zPa.getTopSkip();
        this.EV = this.zPa.getTopCountDown();
    }

    public void IlO() {
        DmF dmFIlO = com.bytedance.sdk.openadsdk.component.IlO.MY.IlO(this.MY, this.IlO, this.rp, this.bWL);
        dmFIlO.IlO(new MY.IlO() { // from class: com.bytedance.sdk.openadsdk.component.MY.2
            public void IlO(View view, int i) {
                MY.this.Cc.Cc();
            }
        });
        this.bWL.setClickListener(dmFIlO);
        lEW lewMY = com.bytedance.sdk.openadsdk.component.IlO.MY.MY(this.MY, this.IlO, this.rp, this.bWL);
        this.bWL.setClickCreativeListener(lewMY);
        lewMY.IlO(new MY.IlO() { // from class: com.bytedance.sdk.openadsdk.component.MY.3
            public void IlO(View view, int i) {
                MY.this.Cc.Cc();
            }
        });
        super.vCE();
        this.bWL.setBackupListener(new EO() { // from class: com.bytedance.sdk.openadsdk.component.MY.4
            public boolean IlO(ViewGroup viewGroup, int i) {
                Object[] objArr = new Object[2];
                String str = "isUseBackup() called with: view = [" + viewGroup + "], errCode = [" + i + "]";
                try {
                    ((xF) viewGroup).cl();
                    new com.bytedance.sdk.openadsdk.component.DmF.IlO(MY.this.IlO).IlO(MY.this.bWL);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", BuildConfig.FLAVOR, e);
                    return false;
                }
            }
        });
    }

    public void MY() {
        this.bWL.bWL();
    }

    public void IlO(int i, boolean z) {
        super.IlO(i, z);
    }

    public void EO() {
        super.EO();
        com.bytedance.sdk.openadsdk.component.DmF.MY my = this.bWL;
        if (my != null) {
            my.zPa();
        }
    }

    public int tV() {
        return this.bWL.getDynamicShowType();
    }

    public JSONObject IlO(JSONObject jSONObject) {
        return this.bWL.IlO(jSONObject, this.MY);
    }

    public void Cc() {
        com.bytedance.sdk.openadsdk.component.DmF.MY my = this.bWL;
        if (my != null) {
            my.hp();
        }
    }
}
