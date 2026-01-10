package com.bytedance.adsdk.MY.IlO.IlO;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.MY.Cc;
import com.bytedance.adsdk.MY.DmF;
import com.bytedance.adsdk.MY.EO.IlO.MY;
import com.bytedance.adsdk.MY.EO.IlO.tV;
import com.bytedance.adsdk.MY.IlO.MY.EO;
import com.bytedance.adsdk.MY.IlO.MY.IlO;
import com.bytedance.adsdk.MY.vCE.vCE;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class IlO implements Cc, EV, IlO.IlO {
    float EO;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> EV;
    protected final com.bytedance.adsdk.MY.EO.EO.IlO IlO;
    final Paint MY;
    private final float[] NV;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> bWL;
    private EO cl;
    private com.bytedance.adsdk.MY.IlO.MY.IlO<ColorFilter, ColorFilter> ea;
    private final List<com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float>> hp;
    private final DmF lEW;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Integer> rp;
    private com.bytedance.adsdk.MY.IlO.MY.IlO<Float, Float> zPa;
    private final PathMeasure tV = new PathMeasure();
    private final Path Cc = new Path();
    private final Path vCE = new Path();
    private final RectF Bc = new RectF();
    private final List<C0008IlO> DmF = new ArrayList();

    IlO(DmF dmF, com.bytedance.adsdk.MY.EO.EO.IlO ilO, Paint.Cap cap, Paint.Join join, float f, tV tVVar, MY my, List<MY> list, MY my2) {
        com.bytedance.adsdk.MY.IlO.IlO ilO2 = new com.bytedance.adsdk.MY.IlO.IlO(1);
        this.MY = ilO2;
        this.EO = 0.0f;
        this.lEW = dmF;
        this.IlO = ilO;
        ilO2.setStyle(Paint.Style.STROKE);
        ilO2.setStrokeCap(cap);
        ilO2.setStrokeJoin(join);
        ilO2.setStrokeMiter(f);
        this.rp = tVVar.IlO();
        this.EV = my.IlO();
        if (my2 == null) {
            this.bWL = null;
        } else {
            this.bWL = my2.IlO();
        }
        this.hp = new ArrayList(list.size());
        this.NV = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.hp.add(list.get(i).IlO());
        }
        ilO.IlO(this.rp);
        ilO.IlO(this.EV);
        for (int i2 = 0; i2 < this.hp.size(); i2++) {
            ilO.IlO(this.hp.get(i2));
        }
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> ilO3 = this.bWL;
        if (ilO3 != null) {
            ilO.IlO(ilO3);
        }
        this.rp.IlO(this);
        this.EV.IlO(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.hp.get(i3).IlO(this);
        }
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> ilO4 = this.bWL;
        if (ilO4 != null) {
            ilO4.IlO(this);
        }
        if (ilO.NV() != null) {
            com.bytedance.adsdk.MY.IlO.MY.IlO<Float, Float> IlO = ilO.NV().IlO().IlO();
            this.zPa = IlO;
            IlO.IlO(this);
            ilO.IlO(this.zPa);
        }
        if (ilO.EV() != null) {
            this.cl = new EO(this, ilO, ilO.EV());
        }
    }

    public void IlO() {
        this.lEW.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void IlO(java.util.List<com.bytedance.adsdk.MY.IlO.IlO.EO> r8, java.util.List<com.bytedance.adsdk.MY.IlO.IlO.EO> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.MY.IlO.IlO.EO r3 = (com.bytedance.adsdk.MY.IlO.IlO.EO) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.MY.IlO.IlO.oeT
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.MY.IlO.IlO.oeT r3 = (com.bytedance.adsdk.MY.IlO.IlO.oeT) r3
            com.bytedance.adsdk.MY.EO.MY.xF$IlO r4 = r3.MY()
            com.bytedance.adsdk.MY.EO.MY.xF$IlO r5 = com.bytedance.adsdk.MY.EO.MY.xF.IlO.MY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.IlO(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.MY.IlO.IlO.EO r3 = (com.bytedance.adsdk.MY.IlO.IlO.EO) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.MY.IlO.IlO.oeT
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.MY.IlO.IlO.oeT r4 = (com.bytedance.adsdk.MY.IlO.IlO.oeT) r4
            com.bytedance.adsdk.MY.EO.MY.xF$IlO r5 = r4.MY()
            com.bytedance.adsdk.MY.EO.MY.xF$IlO r6 = com.bytedance.adsdk.MY.EO.MY.xF.IlO.MY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO> r3 = r7.DmF
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO r0 = new com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO
            r0.<init>(r4)
            r4.IlO(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.MY.IlO.IlO.hp
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO r0 = new com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.bytedance.adsdk.MY.IlO.IlO.IlO.C0008IlO.IlO(r0)
            com.bytedance.adsdk.MY.IlO.IlO.hp r3 = (com.bytedance.adsdk.MY.IlO.IlO.hp) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO> r8 = r7.DmF
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.MY.IlO.IlO.IlO.IlO(java.util.List, java.util.List):void");
    }

    public void IlO(Canvas canvas, Matrix matrix, int i) {
        Cc.IlO("StrokeContent#draw");
        if (vCE.MY(matrix)) {
            Cc.MY("StrokeContent#draw");
            return;
        }
        this.MY.setAlpha(com.bytedance.adsdk.MY.vCE.Cc.IlO((int) ((((i / 255.0f) * this.rp.DmF()) / 100.0f) * 255.0f), 0, 255));
        this.MY.setStrokeWidth(this.EV.DmF() * vCE.IlO(matrix));
        if (this.MY.getStrokeWidth() <= 0.0f) {
            Cc.MY("StrokeContent#draw");
            return;
        }
        IlO(matrix);
        com.bytedance.adsdk.MY.IlO.MY.IlO<ColorFilter, ColorFilter> ilO = this.ea;
        if (ilO != null) {
            this.MY.setColorFilter((ColorFilter) ilO.Bc());
        }
        com.bytedance.adsdk.MY.IlO.MY.IlO<Float, Float> ilO2 = this.zPa;
        if (ilO2 != null) {
            float fFloatValue = ((Float) ilO2.Bc()).floatValue();
            if (fFloatValue == 0.0f) {
                this.MY.setMaskFilter(null);
            } else if (fFloatValue != this.EO) {
                this.MY.setMaskFilter(this.IlO.MY(fFloatValue));
            }
            this.EO = fFloatValue;
        }
        EO eo = this.cl;
        if (eo != null) {
            eo.IlO(this.MY);
        }
        for (int i2 = 0; i2 < this.DmF.size(); i2++) {
            C0008IlO c0008IlO = this.DmF.get(i2);
            if (c0008IlO.MY != null) {
                IlO(canvas, c0008IlO, matrix);
            } else {
                Cc.IlO("StrokeContent#buildPath");
                this.Cc.reset();
                for (int size = c0008IlO.IlO.size() - 1; size >= 0; size--) {
                    this.Cc.addPath(((hp) c0008IlO.IlO.get(size)).tV(), matrix);
                }
                Cc.MY("StrokeContent#buildPath");
                Cc.IlO("StrokeContent#drawPath");
                canvas.drawPath(this.Cc, this.MY);
                Cc.MY("StrokeContent#drawPath");
            }
        }
        Cc.MY("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void IlO(android.graphics.Canvas r17, com.bytedance.adsdk.MY.IlO.IlO.IlO.C0008IlO r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.MY.IlO.IlO.IlO.IlO(android.graphics.Canvas, com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO, android.graphics.Matrix):void");
    }

    public void IlO(RectF rectF, Matrix matrix, boolean z) {
        Cc.IlO("StrokeContent#getBounds");
        this.Cc.reset();
        for (int i = 0; i < this.DmF.size(); i++) {
            C0008IlO c0008IlO = this.DmF.get(i);
            for (int i2 = 0; i2 < c0008IlO.IlO.size(); i2++) {
                this.Cc.addPath(((hp) c0008IlO.IlO.get(i2)).tV(), matrix);
            }
        }
        this.Cc.computeBounds(this.Bc, false);
        float fDmF = this.EV.DmF();
        RectF rectF2 = this.Bc;
        float f = fDmF / 2.0f;
        rectF2.set(rectF2.left - f, this.Bc.top - f, this.Bc.right + f, this.Bc.bottom + f);
        rectF.set(this.Bc);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        Cc.MY("StrokeContent#getBounds");
    }

    private void IlO(Matrix matrix) {
        Cc.IlO("StrokeContent#applyDashPattern");
        if (this.hp.isEmpty()) {
            Cc.MY("StrokeContent#applyDashPattern");
            return;
        }
        float fIlO = vCE.IlO(matrix);
        for (int i = 0; i < this.hp.size(); i++) {
            this.NV[i] = ((Float) this.hp.get(i).Bc()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.NV;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.NV;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.NV;
            fArr3[i] = fArr3[i] * fIlO;
        }
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> ilO = this.bWL;
        this.MY.setPathEffect(new DashPathEffect(this.NV, ilO == null ? 0.0f : fIlO * ((Float) ilO.Bc()).floatValue()));
        Cc.MY("StrokeContent#applyDashPattern");
    }

    /* renamed from: com.bytedance.adsdk.MY.IlO.IlO.IlO$IlO, reason: collision with other inner class name */
    private static final class C0008IlO {
        private final List<hp> IlO;
        private final oeT MY;

        private C0008IlO(oeT oet) {
            this.IlO = new ArrayList();
            this.MY = oet;
        }
    }
}
