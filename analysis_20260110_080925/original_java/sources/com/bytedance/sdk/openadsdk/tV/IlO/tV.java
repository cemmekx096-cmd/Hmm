package com.bytedance.sdk.openadsdk.tV.IlO;

import android.content.Context;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.component.vCE.IlO.IlO;
import com.bytedance.sdk.component.vCE.IlO.MY;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.tV.EO;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tV {
    public static AtomicInteger IlO = new AtomicInteger(0);
    public static final AtomicBoolean MY = new AtomicBoolean(false);

    public static void IlO(Context context, boolean z) {
        if (MY.compareAndSet(false, true)) {
            MY.IlO(new IlO.IlO().IlO(new NV()).MY(com.bytedance.sdk.component.vCE.IlO.tV.MY.IlO.EO()).EO(com.bytedance.sdk.component.vCE.IlO.tV.MY.IlO.Cc()).IlO(com.bytedance.sdk.component.vCE.IlO.tV.MY.IlO.tV()).IlO(z).IlO(new EV()).IlO(lEW.IlO).MY(cl.tV().hp()).IlO(cl.tV().bWL()).IlO(cl.tV().Hg()).IlO(), context);
            MY();
        }
    }

    public static void IlO(com.bytedance.sdk.openadsdk.tV.IlO ilO) {
        com.bytedance.sdk.component.vCE.IlO.tV.IlO.IlO ilO2 = new com.bytedance.sdk.component.vCE.IlO.tV.IlO.IlO(ilO.tV(), ilO);
        ilO2.MY(ilO.Cc() ? (byte) 1 : (byte) 2);
        ilO2.IlO((byte) 0);
        if (MY.MY()) {
            IlO(cl.IlO(), com.bytedance.sdk.openadsdk.multipro.MY.EO());
        }
        MY.IlO(ilO2);
    }

    public static com.bytedance.sdk.openadsdk.ea.EO.MY IlO() {
        return rp.IlO;
    }

    public static void IlO(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        EO.IlO(new lEW("track") { // from class: com.bytedance.sdk.openadsdk.tV.IlO.tV.1
            public void run() {
                if (MY.MY()) {
                    tV.IlO(cl.IlO(), com.bytedance.sdk.openadsdk.multipro.MY.EO());
                }
                MY.IlO(com.bytedance.sdk.openadsdk.core.rp.IlO(cl.IlO()), list, true, i, str);
            }
        });
    }

    public static void IlO(String str) {
        IlO(str, false);
    }

    public static void IlO(String str, boolean z) {
        if (MY.MY()) {
            IlO(cl.IlO(), com.bytedance.sdk.openadsdk.multipro.MY.EO());
        }
        MY.IlO(str, z);
    }

    public static void MY() {
        MY.EO();
    }

    public static void EO() {
        try {
            MY.tV();
            MY.Cc();
        } catch (Throwable th) {
            oeT.EO("AdLogSwitchUtils", th.getMessage());
        }
    }
}
