package com.bytedance.adsdk.MY.IlO.IlO;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.MY.DmF;
import com.bytedance.adsdk.MY.EO.MY.NV;
import com.bytedance.adsdk.MY.EO.MY.xF;
import com.bytedance.adsdk.MY.IlO.MY.IlO;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class bWL implements EV, hp, IlO.IlO {
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> Bc;
    private final boolean Cc;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> DmF;
    private final DmF EO;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> EV;
    private final String MY;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> NV;
    private boolean ea;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> hp;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, PointF> lEW;
    private final com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> rp;
    private final NV.IlO tV;
    private final boolean vCE;
    private final Path IlO = new Path();
    private final MY bWL = new MY();

    public bWL(DmF dmF, com.bytedance.adsdk.MY.EO.EO.IlO ilO, NV nv) {
        this.EO = dmF;
        this.MY = nv.IlO();
        NV.IlO ilOMY = nv.MY();
        this.tV = ilOMY;
        this.Cc = nv.NV();
        this.vCE = nv.EV();
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> IlO = nv.EO().IlO();
        this.Bc = IlO;
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, PointF> IlO2 = nv.tV().IlO();
        this.lEW = IlO2;
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> IlO3 = nv.Cc().IlO();
        this.DmF = IlO3;
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> IlO4 = nv.Bc().IlO();
        this.EV = IlO4;
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> IlO5 = nv.DmF().IlO();
        this.hp = IlO5;
        if (ilOMY == NV.IlO.IlO) {
            this.NV = nv.vCE().IlO();
            this.rp = nv.lEW().IlO();
        } else {
            this.NV = null;
            this.rp = null;
        }
        ilO.IlO(IlO);
        ilO.IlO(IlO2);
        ilO.IlO(IlO3);
        ilO.IlO(IlO4);
        ilO.IlO(IlO5);
        if (ilOMY == NV.IlO.IlO) {
            ilO.IlO(this.NV);
            ilO.IlO(this.rp);
        }
        IlO.IlO(this);
        IlO2.IlO(this);
        IlO3.IlO(this);
        IlO4.IlO(this);
        IlO5.IlO(this);
        if (ilOMY == NV.IlO.IlO) {
            this.NV.IlO(this);
            this.rp.IlO(this);
        }
    }

    public void IlO() {
        MY();
    }

    private void MY() {
        this.ea = false;
        this.EO.invalidateSelf();
    }

    public void IlO(List<EO> list, List<EO> list2) {
        for (int i = 0; i < list.size(); i++) {
            oeT oet = (EO) list.get(i);
            if (oet instanceof oeT) {
                oeT oet2 = oet;
                if (oet2.MY() == xF.IlO.IlO) {
                    this.bWL.IlO(oet2);
                    oet2.IlO(this);
                }
            }
        }
    }

    public Path tV() {
        if (this.ea) {
            return this.IlO;
        }
        this.IlO.reset();
        if (this.Cc) {
            this.ea = true;
            return this.IlO;
        }
        int i = AnonymousClass1.IlO[this.tV.ordinal()];
        if (i == 1) {
            EO();
        } else if (i == 2) {
            Cc();
        }
        this.IlO.close();
        this.bWL.IlO(this.IlO);
        this.ea = true;
        return this.IlO;
    }

    /* renamed from: com.bytedance.adsdk.MY.IlO.IlO.bWL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IlO;

        static {
            int[] iArr = new int[NV.IlO.values().length];
            IlO = iArr;
            try {
                iArr[NV.IlO.IlO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IlO[NV.IlO.MY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void EO() {
        double d;
        int i;
        double d2;
        float fCos;
        float fSin;
        float f;
        float f2;
        float f3;
        float f4;
        double d3;
        float f5;
        float f6;
        float f7;
        float fFloatValue = ((Float) this.Bc.Bc()).floatValue();
        double radians = Math.toRadians((this.DmF == null ? 0.0d : ((Float) r2.Bc()).floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f8 = (float) (6.283185307179586d / d4);
        if (this.vCE) {
            f8 *= -1.0f;
        }
        float f9 = f8 / 2.0f;
        float f10 = fFloatValue - ((int) fFloatValue);
        int i2 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f10) * f9;
        }
        float fFloatValue2 = ((Float) this.EV.Bc()).floatValue();
        float fFloatValue3 = ((Float) this.NV.Bc()).floatValue();
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> ilO = this.rp;
        float fFloatValue4 = ilO != null ? ((Float) ilO.Bc()).floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.MY.IlO.MY.IlO<?, Float> ilO2 = this.hp;
        float fFloatValue5 = ilO2 != null ? ((Float) ilO2.Bc()).floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((fFloatValue2 - fFloatValue3) * f10) + fFloatValue3;
            i = i2;
            double d5 = f;
            d = d4;
            fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.IlO.moveTo(fCos, fSin);
            d2 = radians + ((f8 * f10) / 2.0f);
        } else {
            d = d4;
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.IlO.moveTo(fCos2, fSin2);
            d2 = radians + f9;
            fCos = fCos2;
            fSin = fSin2;
            f = 0.0f;
        }
        double dCeil = Math.ceil(d) * 2.0d;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < dCeil) {
                float f11 = z ? fFloatValue2 : fFloatValue3;
                if (f == 0.0f || d7 != dCeil - 2.0d) {
                    f2 = f8;
                    f3 = f9;
                } else {
                    f2 = f8;
                    f3 = (f8 * f10) / 2.0f;
                }
                if (f == 0.0f || d7 != dCeil - 1.0d) {
                    f4 = f9;
                    d3 = d7;
                    f5 = f11;
                } else {
                    f4 = f9;
                    d3 = d7;
                    f5 = f;
                }
                double d8 = f5;
                double d9 = dCeil;
                float fCos3 = (float) (d8 * Math.cos(d2));
                float fSin3 = (float) (d8 * Math.sin(d2));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.IlO.lineTo(fCos3, fSin3);
                    f6 = fFloatValue4;
                    f7 = f;
                } else {
                    f6 = fFloatValue4;
                    f7 = f;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f12 = z ? f6 : fFloatValue5;
                    float f13 = z ? fFloatValue5 : f6;
                    float f14 = (z ? fFloatValue3 : fFloatValue2) * f12 * 0.47829f;
                    float f15 = fCos4 * f14;
                    float f16 = f14 * fSin4;
                    float f17 = (z ? fFloatValue2 : fFloatValue3) * f13 * 0.47829f;
                    float f18 = fCos5 * f17;
                    float f19 = f17 * fSin5;
                    if (i != 0) {
                        if (i3 == 0) {
                            f15 *= f10;
                            f16 *= f10;
                        } else if (d3 == d9 - 1.0d) {
                            f18 *= f10;
                            f19 *= f10;
                        }
                    }
                    this.IlO.cubicTo(fCos - f15, fSin - f16, fCos3 + f18, fSin3 + f19, fCos3, fSin3);
                }
                d2 += f3;
                z = !z;
                i3++;
                fCos = fCos3;
                fSin = fSin3;
                fFloatValue4 = f6;
                f = f7;
                f9 = f4;
                f8 = f2;
                dCeil = d9;
            } else {
                PointF pointF = (PointF) this.lEW.Bc();
                this.IlO.offset(pointF.x, pointF.y);
                this.IlO.close();
                return;
            }
        }
    }

    private void Cc() {
        double d;
        double d2;
        double d3;
        int i;
        int iFloor = (int) Math.floor(((Float) this.Bc.Bc()).floatValue());
        double radians = Math.toRadians((this.DmF == null ? 0.0d : ((Float) r2.Bc()).floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = ((Float) this.hp.Bc()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.EV.Bc()).floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.IlO.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double dCeil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < dCeil) {
            float fCos2 = (float) (Math.cos(d7) * d5);
            double d8 = dCeil;
            float fSin2 = (float) (d5 * Math.sin(d7));
            if (fFloatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d3 = d6;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.IlO.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.IlO.lineTo(fCos2, fSin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF pointF = (PointF) this.lEW.Bc();
        this.IlO.offset(pointF.x, pointF.y);
        this.IlO.close();
    }
}
