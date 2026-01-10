package com.bytedance.sdk.openadsdk.tV.IlO;

import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.vCE.IlO.tV.IlO.IlO;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.ea.EO.MY;
import com.bytedance.sdk.openadsdk.ea.IlO.EO;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.bytedance.sdk.openadsdk.utils.pP;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class rp implements MY {
    public static final rp IlO = new rp();

    private rp() {
    }

    public void IlO(com.bytedance.sdk.openadsdk.ea.MY my) {
        IlO(my, false);
    }

    public void IlO(final com.bytedance.sdk.openadsdk.ea.MY my, final boolean z) {
        IlO(new lEW("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.tV.IlO.rp.1
            public void run() {
                try {
                    EO logStats = my.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    IlO ilO = new IlO(pP.IlO(), logStats.IlO());
                    ilO.EO((byte) 0);
                    ilO.MY(z ? (byte) 2 : (byte) 3);
                    ilO.IlO((byte) 1);
                    if (com.bytedance.sdk.component.vCE.IlO.MY.MY()) {
                        tV.IlO(cl.IlO(), com.bytedance.sdk.openadsdk.multipro.MY.EO());
                    }
                    com.bytedance.sdk.component.vCE.IlO.MY.IlO(ilO);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void IlO(lEW lew) {
        if (lew == null) {
            return;
        }
        if (!mmj.Bc()) {
            mmj.MY(lew, 5);
        } else {
            lew.run();
        }
    }
}
