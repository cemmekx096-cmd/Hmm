package com.bytedance.sdk.openadsdk.component.reward.MY;

import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.model.vAh;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class Bc {
    public static MY IlO(com.bytedance.sdk.openadsdk.component.reward.IlO.IlO ilO) {
        vAh vah = ilO.MY;
        if ((vah instanceof vAh) && vah.dvD()) {
            return new vCE(ilO);
        }
        if (OOq.cL(vah)) {
            return new NV(ilO);
        }
        if (lEW.IlO(vah) && !EO.IlO((oeT) vah)) {
            return new lEW(ilO);
        }
        if (DmF.IlO(vah)) {
            return new DmF(ilO);
        }
        if (NV.IlO((oeT) vah)) {
            return new NV(ilO);
        }
        if (tV.IlO(vah)) {
            return new tV(ilO);
        }
        if (EO.IlO((oeT) vah)) {
            return new EO(ilO);
        }
        return new Cc(ilO);
    }
}
