package com.bytedance.adsdk.MY.EO.EO;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.MY.DmF;
import com.bytedance.adsdk.MY.EO.MY.IlO;
import com.bytedance.adsdk.MY.EO.MY.zPa;
import com.bytedance.adsdk.MY.IlO.IlO.tV;
import java.util.Collections;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class Bc extends IlO {
    private final tV Bc;
    private final MY lEW;

    Bc(DmF dmF, Cc cc, MY my, com.bytedance.adsdk.MY.Bc bc) {
        super(dmF, cc);
        this.lEW = my;
        tV tVVar = new tV(dmF, this, new zPa("__container", cc.bWL(), false), bc);
        this.Bc = tVVar;
        tVVar.IlO(Collections.emptyList(), Collections.emptyList());
    }

    public void MY(Canvas canvas, Matrix matrix, int i) {
        super.MY(canvas, matrix, i);
        this.Bc.IlO(canvas, matrix, i);
    }

    public void IlO(RectF rectF, Matrix matrix, boolean z) {
        super.IlO(rectF, matrix, z);
        this.Bc.IlO(rectF, this.IlO, z);
    }

    public IlO NV() {
        IlO ilONV = super.NV();
        return ilONV != null ? ilONV : this.lEW.NV();
    }

    public com.bytedance.adsdk.MY.Cc.NV EV() {
        com.bytedance.adsdk.MY.Cc.NV nvEV = super.EV();
        return nvEV != null ? nvEV : this.lEW.EV();
    }
}
