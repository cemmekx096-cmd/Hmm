package com.bytedance.adsdk.MY.EO.MY;

import android.graphics.Path;
import com.bytedance.adsdk.MY.Bc;
import com.bytedance.adsdk.MY.EO.IlO.IlO;
import com.bytedance.adsdk.MY.EO.IlO.tV;
import com.bytedance.adsdk.MY.IlO.IlO.EO;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class ea implements EO {
    private final tV Cc;
    private final String EO;
    private final boolean IlO;
    private final Path.FillType MY;
    private final IlO tV;
    private final boolean vCE;

    public ea(String str, boolean z, Path.FillType fillType, IlO ilO, tV tVVar, boolean z2) {
        this.EO = str;
        this.IlO = z;
        this.MY = fillType;
        this.tV = ilO;
        this.Cc = tVVar;
        this.vCE = z2;
    }

    public String IlO() {
        return this.EO;
    }

    public IlO MY() {
        return this.tV;
    }

    public tV EO() {
        return this.Cc;
    }

    public Path.FillType tV() {
        return this.MY;
    }

    public boolean Cc() {
        return this.vCE;
    }

    public EO IlO(com.bytedance.adsdk.MY.DmF dmF, Bc bc, com.bytedance.adsdk.MY.EO.EO.IlO ilO) {
        return new com.bytedance.adsdk.MY.IlO.IlO.Bc(dmF, ilO, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.IlO + '}';
    }
}
