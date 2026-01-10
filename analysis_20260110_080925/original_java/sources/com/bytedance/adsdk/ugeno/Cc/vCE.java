package com.bytedance.adsdk.ugeno.Cc;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.Cc.Cc;
import com.bytedance.adsdk.ugeno.MY.IlO;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class vCE extends com.bytedance.adsdk.ugeno.MY.IlO<Cc> {
    private int Aw;
    private int BES;
    private int La;
    private int eeU;
    private int uF;

    public vCE(Context context) {
        super(context);
    }

    /* renamed from: EO, reason: merged with bridge method [inline-methods] */
    public Cc IlO() {
        Cc cc = new Cc(this.MY);
        cc.IlO(this);
        return cc;
    }

    public void MY() {
        super.MY();
        this.Cc.setFlexDirection(this.eeU);
        this.Cc.setFlexWrap(this.BES);
        this.Cc.setJustifyContent(this.La);
        this.Cc.setAlignItems(this.Aw);
        this.Cc.setAlignContent(this.uF);
    }

    public IlO.IlO NV() {
        return new IlO(this);
    }

    public static class IlO extends IlO.IlO {
        public float OOq;
        public int YA;
        public int dY;
        public int lMM;
        public int nvX;
        public int oc;
        public int tl;
        public float vSq;
        public float wPn;

        public IlO(com.bytedance.adsdk.ugeno.MY.IlO ilO) {
            super(ilO);
            this.tl = 1;
            this.OOq = 0.0f;
            this.wPn = 0.0f;
            this.oc = -1;
            this.vSq = -1.0f;
            this.dY = -1;
            this.lMM = -1;
            this.nvX = ViewCompat.MEASURED_SIZE_MASK;
            this.YA = ViewCompat.MEASURED_SIZE_MASK;
        }

        public void IlO(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.IlO(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.vSq = tV(str2);
                    break;
                case "order":
                    this.tl = IlO(str2);
                    break;
                case "flexShrink":
                    this.wPn = EO(str2);
                    break;
                case "flexGrow":
                    this.OOq = MY(str2);
                    break;
                case "alignSelf":
                    this.oc = Cc(str2);
                    break;
            }
        }

        private int IlO(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        private float MY(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float EO(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float tV(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int Cc(java.lang.String r8) {
            /*
                r7 = this;
                r8.hashCode()
                int r0 = r8.hashCode()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = -1
                switch(r0) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = r6
                goto L48
            L12:
                java.lang.String r0 = "flex_end"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = r1
                goto L48
            L1d:
                java.lang.String r0 = "flex_start"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = r2
                goto L48
            L28:
                java.lang.String r0 = "center"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = r3
                goto L48
            L33:
                java.lang.String r0 = "baseline"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = r4
                goto L48
            L3e:
                java.lang.String r0 = "stretch"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = r5
            L48:
                switch(r8) {
                    case 0: goto L54;
                    case 1: goto L53;
                    case 2: goto L51;
                    case 3: goto L4f;
                    case 4: goto L4d;
                    default: goto L4b;
                }
            L4b:
                r1 = r6
                goto L54
            L4d:
                r1 = r4
                goto L54
            L4f:
                r1 = r5
                goto L54
            L51:
                r1 = r3
                goto L54
            L53:
                r1 = r2
            L54:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Cc.vCE.IlO.Cc(java.lang.String):int");
        }

        /* renamed from: MY, reason: merged with bridge method [inline-methods] */
        public Cc.IlO IlO() {
            Cc.IlO ilO = new Cc.IlO((int) this.IlO, (int) this.MY);
            ilO.leftMargin = (int) this.vCE;
            ilO.rightMargin = (int) this.Bc;
            ilO.topMargin = (int) this.lEW;
            ilO.bottomMargin = (int) this.DmF;
            ilO.EO(this.tl);
            ilO.tV(this.oc);
            ilO.IlO(this.OOq);
            ilO.MY(this.wPn);
            ilO.EO(this.vSq);
            return ilO;
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.IlO + ", mHeight=" + this.MY + ", mMargin=" + this.Cc + ", mMarginLeft=" + this.vCE + ", mMarginRight=" + this.Bc + ", mMarginTop=" + this.lEW + ", mMarginBottom=" + this.DmF + ", mParams=" + this.kBB + ", mOrder=" + this.tl + ", mFlexGrow=" + this.OOq + ", mFlexShrink=" + this.wPn + ", mAlignSelf=" + this.oc + ", mFlexBasisPercent=" + this.vSq + ", mMinWidth=" + this.dY + ", mMinHeight=" + this.lMM + ", mMaxWidth=" + this.nvX + ", mMaxHeight=" + this.YA + "} " + super.toString();
        }
    }

    public void IlO(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.IlO(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.Aw = NV(str2);
                break;
            case "flexDirection":
                this.eeU = Bc(str2);
                break;
            case "alignContent":
                this.uF = EV(str2);
                break;
            case "flexWrap":
                this.BES = lEW(str2);
                break;
            case "justifyContent":
                this.La = DmF(str2);
                break;
        }
    }

    int Bc(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    private int lEW(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int DmF(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int NV(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1881872635: goto L35;
                case -1720785339: goto L2b;
                case -1364013995: goto L21;
                case 1384876188: goto L17;
                case 1744442261: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r5
            goto L40
        L17:
            java.lang.String r0 = "flex_start"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r2
            goto L40
        L21:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r4
            goto L40
        L2b:
            java.lang.String r0 = "baseline"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r3
            goto L40
        L35:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r1
            goto L40
        L3f:
            r7 = -1
        L40:
            if (r7 == 0) goto L4c
            if (r7 == r5) goto L4b
            if (r7 == r4) goto L4a
            if (r7 == r3) goto L49
            return r1
        L49:
            return r3
        L4a:
            return r4
        L4b:
            return r5
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Cc.vCE.NV(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int EV(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1881872635: goto L40;
                case -1364013995: goto L36;
                case -932331738: goto L2c;
                case 1384876188: goto L22;
                case 1682480591: goto L18;
                case 1744442261: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "flex_end"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r6
            goto L4b
        L18:
            java.lang.String r0 = "space_between"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r3
            goto L4b
        L22:
            java.lang.String r0 = "flex_start"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r2
            goto L4b
        L2c:
            java.lang.String r0 = "space_around"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r4
            goto L4b
        L36:
            java.lang.String r0 = "center"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r5
            goto L4b
        L40:
            java.lang.String r0 = "stretch"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto L5a
            if (r8 == r6) goto L59
            if (r8 == r5) goto L58
            if (r8 == r4) goto L57
            if (r8 == r3) goto L56
            return r1
        L56:
            return r4
        L57:
            return r3
        L58:
            return r5
        L59:
            return r6
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Cc.vCE.EV(java.lang.String):int");
    }
}
