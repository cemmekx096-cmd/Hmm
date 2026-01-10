package com.bytedance.adsdk.ugeno.tV.tV;

import android.content.Context;
import com.bytedance.adsdk.ugeno.Bc.EO;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class Cc extends IlO {
    public Cc(Context context) {
        super(context);
    }

    public boolean IlO(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iIlO = EO.IlO(String.valueOf(objArr[0]), 0);
            if (this.Cc == null || this.Cc.isEmpty() || iIlO == EO.IlO((String) this.Cc.get("type"), 0)) {
                this.IlO.IlO(this.MY, this.vCE, this.EO.MY());
            }
        }
        return false;
    }
}
