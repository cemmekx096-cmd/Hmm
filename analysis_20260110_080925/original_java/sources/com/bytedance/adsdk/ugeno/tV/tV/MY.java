package com.bytedance.adsdk.ugeno.tV.tV;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.tV.IlO.EO;
import com.bytedance.adsdk.ugeno.tV.IlO.IlO;
import com.bytedance.adsdk.ugeno.tV.IlO.tV;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MY extends IlO implements tV {
    private EO EV;

    public MY(Context context) {
        super(context);
    }

    public boolean IlO(Object... objArr) {
        IlO ilOZLG = this.MY.zLG();
        if (ilOZLG == null) {
            return false;
        }
        EO eoIlO = ilOZLG.IlO(this.vCE);
        this.EV = eoIlO;
        if (eoIlO != null) {
            eoIlO.IlO(this);
            return false;
        }
        ilOZLG.IlO(this.vCE, new com.bytedance.adsdk.ugeno.tV.IlO.MY());
        return false;
    }

    public void IlO(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.IlO.IlO(this.MY, this.vCE, this.EO.MY());
    }
}
