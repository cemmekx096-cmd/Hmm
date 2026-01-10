package com.bytedance.sdk.component.adexpress.MY;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.MY.NV;
import com.bytedance.sdk.component.adexpress.dynamic.Cc.Bc;
import com.bytedance.sdk.component.adexpress.dynamic.Cc.lEW;
import com.bytedance.sdk.component.adexpress.dynamic.IlO.IlO;
import com.bytedance.sdk.component.adexpress.dynamic.tV;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MY implements NV {
    private hp Cc;
    private ThemeStatusBroadcastReceiver EO;
    private Context IlO;
    private IlO MY;
    private lEW tV;
    private int vCE;

    public MY(Context context, hp hpVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, lEW lew, lEW lew2, com.bytedance.sdk.component.adexpress.dynamic.vCE.IlO ilO, IlO ilO2) {
        this.IlO = context;
        this.Cc = hpVar;
        this.EO = themeStatusBroadcastReceiver;
        this.tV = lew2;
        if (ilO2 != null) {
            this.MY = ilO2;
        } else {
            this.MY = new IlO(this.IlO, this.EO, z, lew, this.Cc, ilO);
        }
        this.MY.IlO(this.tV);
        if (lew instanceof Bc) {
            this.vCE = 3;
        } else {
            this.vCE = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.MY.NV
    public boolean IlO(final NV.IlO ilO) {
        this.Cc.Cc().IlO(this.vCE);
        this.MY.IlO(new Bc() { // from class: com.bytedance.sdk.component.adexpress.MY.MY.1
            public void IlO(View view, bWL bwl) {
                if (ilO.EO()) {
                    return;
                }
                MY.this.Cc.Cc().Cc(MY.this.vCE);
                MY.this.Cc.Cc().vCE(MY.this.vCE);
                MY.this.Cc.Cc().NV();
                ea eaVarMY = ilO.MY();
                if (eaVarMY == null) {
                    return;
                }
                eaVarMY.IlO(MY.this.MY, bwl);
                ilO.IlO(true);
            }

            public void IlO(int i, String str) {
                MY.this.Cc.Cc().IlO(MY.this.vCE, i, str, ilO.MY(MY.this));
                if (ilO.MY(MY.this)) {
                    ilO.IlO(MY.this);
                    return;
                }
                ea eaVarMY = ilO.MY();
                if (eaVarMY == null) {
                    return;
                }
                eaVarMY.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.MY.NV
    public void IlO() {
        IlO ilO = this.MY;
        if (ilO != null) {
            ilO.MY();
        }
    }

    public tV MY() {
        IlO ilO = this.MY;
        if (ilO != null) {
            return ilO.tV();
        }
        return null;
    }
}
