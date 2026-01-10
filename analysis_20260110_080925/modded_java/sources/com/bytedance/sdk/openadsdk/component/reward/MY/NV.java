package com.bytedance.sdk.openadsdk.component.reward.MY;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.IlO.lEW;
import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class NV extends MY {
    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void Bc() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public boolean Cc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void IlO(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public boolean vCE() {
        return true;
    }

    public NV(com.bytedance.sdk.openadsdk.component.reward.IlO.IlO ilO) {
        super(ilO);
    }

    public static boolean IlO(oeT oet) {
        return OOq.Bc(oet) || OOq.cL(oet);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void cl() {
        if (OOq.lEW(this.MY) && this.IlO.lMM.zLG() && !this.IlO.lMM.gQ()) {
            cL();
        }
        if (OOq.Bc(this.IlO.MY)) {
            if (DeviceUtils.Bc() == 0) {
                this.IlO.uvo = true;
            }
            if (this.IlO.uvo) {
                this.IlO.YA.MY(true);
                this.IlO.pP.Cc(true);
            }
        }
        this.IlO.ts.IlO();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void es() {
        if (this.IlO.pP.lEW(lEW.EO) && OOq.cL(this.IlO.MY)) {
            this.IlO.pP.EO("return_foreground");
            if ((this.hp == null || !this.hp.isShowing()) && this.IlO.pP.MY() >= 0.0f) {
                this.IlO.pP.Cc(0);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void xF() {
        super.xF();
        if (OOq.cL(this.IlO.MY)) {
            this.NV.removeMessages(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT);
            this.IlO.pP.EO("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.MY.MY
    public void AXM() {
        super.AXM();
        if (OOq.cL(this.IlO.MY)) {
            this.NV.removeMessages(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT);
            this.IlO.pP.EO("go_background");
        }
    }
}
