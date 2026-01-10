package com.bytedance.sdk.openadsdk.core.lEW;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.MY.Bc;
import com.bytedance.sdk.component.adexpress.MY.hp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.openadsdk.core.bWL;
import com.bytedance.sdk.openadsdk.utils.mmj;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class vCE extends com.bytedance.sdk.component.adexpress.dynamic.IlO.IlO {
    private final lEW EO;
    private final hp IlO;
    private Bc MY;
    private final Runnable tV;

    public vCE(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Cc.lEW lew, hp hpVar, com.bytedance.sdk.component.adexpress.dynamic.vCE.IlO ilO) {
        super(context, themeStatusBroadcastReceiver, z, lew, hpVar, ilO);
        this.EO = new lEW("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.lEW.vCE.1
            public void run() {
                vCE.this.IlO.EO();
                bWL.EO().post(vCE.this.tV);
            }
        };
        this.tV = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lEW.vCE.2
            @Override // java.lang.Runnable
            public void run() {
                if (vCE.this.MY != null) {
                    vCE vce = vCE.this;
                    vCE.super.IlO(vce.MY);
                }
            }
        };
        this.IlO = hpVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.IlO.IlO
    public void IlO(Bc bc) {
        this.MY = bc;
        mmj.MY(this.EO);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.IlO.IlO
    public void MY() {
        super.MY();
        bWL.EO().removeCallbacks(this.tV);
    }
}
