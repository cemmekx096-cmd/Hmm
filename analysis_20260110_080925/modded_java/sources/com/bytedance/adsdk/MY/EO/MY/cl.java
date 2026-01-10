package com.bytedance.adsdk.MY.EO.MY;

import com.bytedance.adsdk.MY.Bc;
import com.bytedance.adsdk.MY.EO.EO.IlO;
import com.bytedance.adsdk.MY.EO.IlO.lEW;
import com.bytedance.adsdk.MY.IlO.IlO.EO;
import com.bytedance.adsdk.MY.IlO.IlO.es;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class cl implements EO {
    private final lEW EO;
    private final String IlO;
    private final int MY;
    private final boolean tV;

    public cl(String str, int i, lEW lew, boolean z) {
        this.IlO = str;
        this.MY = i;
        this.EO = lew;
        this.tV = z;
    }

    public String IlO() {
        return this.IlO;
    }

    public lEW MY() {
        return this.EO;
    }

    public EO IlO(com.bytedance.adsdk.MY.DmF dmF, Bc bc, IlO ilO) {
        return new es(dmF, ilO, this);
    }

    public boolean EO() {
        return this.tV;
    }

    public String toString() {
        return "ShapePath{name=" + this.IlO + ", index=" + this.MY + '}';
    }
}
