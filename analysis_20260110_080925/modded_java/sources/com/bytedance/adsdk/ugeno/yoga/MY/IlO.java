package com.bytedance.adsdk.ugeno.yoga.MY;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.Bc.lEW;
import com.bytedance.adsdk.ugeno.IlO;
import com.bytedance.adsdk.ugeno.MY.IlO;
import com.bytedance.adsdk.ugeno.yoga.Cc;
import com.bytedance.adsdk.ugeno.yoga.MY.EO;
import com.bytedance.adsdk.ugeno.yoga.NV;
import com.bytedance.adsdk.ugeno.yoga.bWL;
import com.bytedance.adsdk.ugeno.yoga.hp;
import com.bytedance.adsdk.ugeno.yoga.tV;
import com.bytedance.adsdk.ugeno.yoga.vCE;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class IlO extends com.bytedance.adsdk.ugeno.MY.IlO<EO> {
    private com.bytedance.adsdk.ugeno.yoga.IlO Aw;
    private bWL BES;
    private vCE La;
    private NV eDn;
    private Cc eeU;
    private com.bytedance.adsdk.ugeno.yoga.IlO uF;

    public IlO(Context context) {
        super(context);
        this.eeU = Cc.EO;
        this.BES = bWL.IlO;
        this.La = vCE.IlO;
        this.Aw = com.bytedance.adsdk.ugeno.yoga.IlO.Cc;
        this.uF = com.bytedance.adsdk.ugeno.yoga.IlO.Cc;
    }

    /* renamed from: EO, reason: merged with bridge method [inline-methods] */
    public EO IlO() {
        EO eo = new EO(this.MY);
        eo.IlO(this);
        this.eDn = eo.getYogaNode();
        return eo;
    }

    protected void tl() {
        if (this.gQ) {
            com.bytedance.adsdk.ugeno.Cc.IlO().MY().IlO(this.DmF, this.zLG, new IlO.IlO() { // from class: com.bytedance.adsdk.ugeno.yoga.MY.IlO.1
                public void IlO(Bitmap bitmap) {
                    final Bitmap bitmapIlO;
                    if (bitmap == null || (bitmapIlO = lEW.IlO(IlO.this.MY, bitmap, (int) IlO.this.ssS)) == null) {
                        return;
                    }
                    lEW.IlO(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.MY.IlO.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            IlO.this.IlO(new BitmapDrawable(bitmapIlO));
                        }
                    });
                }
            });
            return;
        }
        ImageView imageView = new ImageView(this.MY);
        com.bytedance.adsdk.ugeno.Cc.IlO().MY().IlO(this.DmF, this.zLG, imageView, this.Cc.getWidth(), this.Cc.getHeight());
        if (!this.HSR || this.BS == ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(this.BS);
        }
        EO.IlO ilO = new EO.IlO(-1, -1);
        ilO.vCE(hp.EO.IlO());
        if (this.Cc instanceof EO) {
            this.Cc.addView(imageView, 0, ilO);
            IlO(imageView);
        }
    }

    protected void IlO(Drawable drawable) {
        ImageView imageView = new ImageView(this.MY);
        imageView.setImageDrawable(drawable);
        if (!this.HSR || this.BS == ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(this.BS);
        }
        EO.IlO ilO = new EO.IlO(-1, -1);
        ilO.vCE(hp.EO.IlO());
        if (this.Cc instanceof EO) {
            this.Cc.addView(imageView, 0, ilO);
            IlO(imageView);
        }
    }

    private void IlO(final ImageView imageView) {
        this.Cc.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.MY.IlO.2
            @Override // java.lang.Runnable
            public void run() {
                NV nvIlO;
                if (IlO.this.Cc == null || (nvIlO = IlO.this.Cc.IlO(imageView)) == null) {
                    return;
                }
                nvIlO.tV(IlO.this.Cc.getWidth());
                nvIlO.vCE(IlO.this.Cc.getHeight());
                IlO.this.Cc.requestLayout();
            }
        });
    }

    public void MY() {
        super.MY();
        this.eDn.IlO(this.eeU);
        this.eDn.IlO(this.BES);
        this.eDn.IlO(this.La);
        this.eDn.IlO(this.Aw);
        this.eDn.EO(this.uF);
        this.eDn.IlO(true);
    }

    protected void hp() {
        if (this.dY) {
            this.eDn.MY(tV.DmF, this.tl);
        }
        if (this.lMM) {
            this.eDn.MY(tV.IlO, this.OOq);
        }
        if (this.nvX) {
            this.eDn.MY(tV.EO, this.wPn);
        }
        if (this.YA) {
            this.eDn.MY(tV.MY, this.oc);
        }
        if (this.mmj) {
            this.eDn.MY(tV.tV, this.vSq);
        }
    }

    public void IlO(com.bytedance.adsdk.ugeno.MY.EO eo) {
        super.IlO(eo);
    }

    public void IlO(com.bytedance.adsdk.ugeno.MY.EO eo, ViewGroup.LayoutParams layoutParams) {
        if (eo == null) {
            return;
        }
        this.IlO.add(eo);
        View viewEV = eo.EV();
        if (viewEV != null) {
            this.Cc.addView(viewEV, layoutParams);
        }
    }

    /* renamed from: tV, reason: merged with bridge method [inline-methods] */
    public C0014IlO NV() {
        return new C0014IlO(this);
    }

    public void IlO(String str, String str2) {
        super.IlO(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.Aw = com.bytedance.adsdk.ugeno.yoga.IlO.IlO(str2);
                break;
            case "flexDirection":
                this.eeU = Cc.IlO(str2);
                break;
            case "alignContent":
                this.uF = com.bytedance.adsdk.ugeno.yoga.IlO.IlO(str2);
                break;
            case "flexWrap":
                this.BES = bWL.IlO(str2);
                break;
            case "justifyContent":
                this.La = vCE.IlO(str2);
                break;
        }
    }

    public Cc Ea() {
        return this.eeU;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.MY.IlO$IlO, reason: collision with other inner class name */
    public static class C0014IlO extends IlO.IlO {
        private boolean AK;
        private boolean BS;
        public float DM;
        private boolean HSR;
        public float OOq;
        public int YA;
        public int dY;
        private boolean gQ;
        public int lMM;
        public int mmj;
        public int nvX;
        public int oc;
        private boolean ssS;
        public int tl;
        public float vSq;
        public float wPn;
        private boolean zLG;

        public C0014IlO(com.bytedance.adsdk.ugeno.MY.IlO ilO) {
            super(ilO);
            this.tl = 1;
            this.OOq = 0.0f;
            this.wPn = 1.0f;
            this.oc = com.bytedance.adsdk.ugeno.yoga.IlO.IlO.IlO();
            this.vSq = -1.0f;
            this.dY = hp.MY.IlO();
        }

        public void IlO(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.IlO(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.zLG = true;
                    float fIlO = com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, -1.0f);
                    this.vSq = fIlO;
                    this.vSq = lEW.IlO(context, fIlO);
                    break;
                case "bottom":
                    this.ssS = true;
                    this.nvX = (int) lEW.IlO(context, com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0));
                    break;
                case "top":
                    this.BS = true;
                    this.lMM = (int) lEW.IlO(context, com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0));
                    break;
                case "left":
                    this.gQ = true;
                    this.YA = (int) lEW.IlO(context, com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0));
                    break;
                case "order":
                    this.tl = com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 1);
                    break;
                case "ratio":
                    this.AK = true;
                    this.DM = com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0.0f);
                    break;
                case "right":
                    this.HSR = true;
                    this.mmj = (int) lEW.IlO(context, com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0));
                    break;
                case "position":
                    this.dY = hp.IlO(str2).IlO();
                    break;
                case "flexShrink":
                    this.wPn = com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.OOq = com.bytedance.adsdk.ugeno.Bc.EO.IlO(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.oc = com.bytedance.adsdk.ugeno.yoga.IlO.IlO(str2).IlO();
                    break;
            }
        }

        /* renamed from: MY, reason: merged with bridge method [inline-methods] */
        public EO.IlO IlO() {
            tV();
            EO.IlO ilO = new EO.IlO((int) this.IlO, (int) this.MY);
            ilO.rp((int) (this.xF ? this.vCE : this.Cc));
            ilO.bWL((int) (this.AXM ? this.Bc : this.Cc));
            ilO.EV((int) (this.oeT ? this.lEW : this.Cc));
            ilO.hp((int) (this.vAh ? this.DmF : this.Cc));
            ilO.IlO(this.tl);
            ilO.Cc(this.oc);
            ilO.MY(this.OOq);
            ilO.EO(this.wPn);
            ilO.zPa(this.EO);
            ilO.cl(this.tV);
            if (this.zLG) {
                ilO.tV(this.vSq);
            }
            ilO.vCE(this.dY);
            if (this.BS) {
                ilO.Bc(this.lMM);
            }
            if (this.ssS) {
                ilO.DmF(this.nvX);
            }
            if (this.gQ) {
                ilO.lEW(this.YA);
            }
            if (this.HSR) {
                ilO.NV(this.mmj);
            }
            if (this.AK && EO()) {
                float f = this.DM;
                if (f > 0.0f) {
                    ilO.ea(f);
                    ilO.EO(0.0f);
                    ilO.MY(0.0f);
                }
            }
            return ilO;
        }

        public boolean EO() {
            if (this.IlO == -1.0f && this.MY == -1.0f) {
                return false;
            }
            return this.IlO == -2.0f || this.MY == -2.0f;
        }

        private void tV() {
            if (this.pP instanceof IlO) {
                if (((IlO) this.pP).Ea() == Cc.EO && this.pP.nvX() == -2 && this.IlO == -1.0f && !this.pP.gQ()) {
                    this.IlO = -2.0f;
                    this.wPn = 1.0f;
                    this.OOq = 1.0f;
                    this.zLG = true;
                    this.vSq = -1.0f;
                }
                if (((IlO) this.pP).Ea() == Cc.IlO && this.pP.YA() == -2 && this.MY == -1.0f && !this.pP.gQ()) {
                    this.MY = -2.0f;
                    this.wPn = 1.0f;
                    this.OOq = 1.0f;
                    this.zLG = true;
                    this.vSq = -1.0f;
                }
            }
        }

        public String toString() {
            return "LayoutParams{mOrder=" + this.tl + ", mFlexGrow=" + this.OOq + ", mFlexShrink=" + this.wPn + ", mAlignSelf=" + this.oc + ", mFlexBasis=" + this.vSq + ", mPosition=" + this.dY + ", mTop=" + this.lMM + ", mBottom=" + this.nvX + ", mLeft=" + this.YA + ", mRight=" + this.mmj + '}';
        }
    }
}
