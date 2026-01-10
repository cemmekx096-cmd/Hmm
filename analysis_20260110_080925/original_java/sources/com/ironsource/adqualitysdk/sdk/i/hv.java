package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.hm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class hv extends hm {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private List<Class> f601 = new ArrayList();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private List<Class> f602;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Class f603;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f604;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private int f605;

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f606;

    public hv() {
        mo870();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hm
    /* renamed from: ﻐ */
    protected final void mo870() {
        super.mo870();
        this.f603 = null;
        this.f606 = 0;
        this.f604 = true;
        this.f601.clear();
        this.f602 = null;
        this.f605 = -1;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Class m886() {
        return this.f603;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final int m883() {
        return this.f606;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m885() {
        return this.f604;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final List<Class> m884() {
        return this.f601;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m882() {
        return this.f602;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final int m881() {
        return this.f605;
    }

    public static class a extends hm.c implements ck {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static long f607 = 1609200948675792367L;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f608 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f609 = {-129357110, 347140254, -552350281, 1622005726, 2062429550, 1505933401, 262872982, -1663125662, 1549923047, -1381309151, -607586045, -1276496287, 1959461654, 134699940, -1118718795, 629247644, -516180928, -1060319385};

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f610 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private hv f611 = new hv();

        /* renamed from: ﻛ, reason: contains not printable characters */
        private a m891(Class cls) {
            int i = f608 + 61;
            f610 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            this.f611.f603 = cls;
            int i3 = f610 + 17;
            f608 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m895(int i) {
            int i2 = f608 + 107;
            f610 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i2 % 2 == 0 ? '@' : (char) 25) != '@') {
                this.f611.f606 = i;
            } else {
                this.f611.f606 = i;
                int i3 = 54 / 0;
            }
            int i4 = f610 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
            f608 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private a m894(boolean z) {
            int i = f608 + 5;
            f610 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? (char) 30 : 'O') != 30) {
                this.f611.f604 = z;
                int i2 = f608 + 21;
                f610 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                return this;
            }
            this.f611.f604 = z;
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private a m890(int i) {
            int i2 = f608 + 3;
            f610 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 == 0) {
            }
            hv hvVar = this.f611;
            hvVar.f599 = i | hvVar.f599;
            int i3 = f608 + 47;
            f610 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m887(int i) {
            hv hvVar;
            int i2;
            int i3 = f608 + R.styleable.AppCompatTheme_toolbarStyle;
            f610 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i3 % 2 == 0)) {
                hvVar = this.f611;
                i2 = i | hvVar.f598;
            } else {
                hvVar = this.f611;
                i2 = i ^ hvVar.f598;
            }
            hvVar.f598 = i2;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m889(boolean z, int i) {
            int i2 = f610 + R.styleable.AppCompatTheme_windowActionModeOverlay;
            f608 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 == 0) {
                this.f611.f597 = z;
                this.f611.f600 = i;
                return this;
            }
            this.f611.f597 = z;
            this.f611.f600 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private a m896(Class cls) {
            int i = f608 + 93;
            f610 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? 'M' : '<') != 'M') {
                this.f611.f601.add(cls);
                return this;
            }
            this.f611.f601.add(cls);
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private a m888(List<Class> list) {
            int i = f608 + 5;
            f610 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? 'W' : '7') != 'W') {
                this.f611.f602 = list;
            } else {
                this.f611.f602 = list;
                int i2 = 20 / 0;
            }
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private a m898(int i) {
            int i2 = f610 + 5;
            f608 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            this.f611.f605 = i;
            int i4 = f608 + 83;
            f610 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i4 % 2 == 0 ? (char) 4 : ' ') != 4) {
                return this;
            }
            int i5 = 17 / 0;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private a m893() {
            int i = f610 + 107;
            f608 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            this.f611.mo870();
            int i3 = f610 + 67;
            f608 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private hv m892() {
            int i = f610 + 3;
            int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            f608 = i2;
            int i3 = i % 2;
            hv hvVar = this.f611;
            int i4 = i2 + 81;
            f610 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i4 % 2 == 0)) {
                return hvVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ck
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo418(java.lang.String r12, java.util.List<java.lang.Object> r13, com.ironsource.adqualitysdk.sdk.i.ch r14) {
            /*
                Method dump skipped, instructions count: 824
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hv.a.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m899(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (f.ﾒ) {
                char[] cArr2 = f.ﾒ(f607, cArr, i);
                f.ﾇ = 4;
                while (f.ﾇ < cArr2.length) {
                    f.ﻛ = f.ﾇ - 4;
                    cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f607));
                    f.ﾇ++;
                }
                str2 = new String(cArr2, 4, cArr2.length - 4);
            }
            return str2;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m897(int[] iArr, int i) {
            String str;
            synchronized (d.ﾇ) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f609.clone();
                d.ﻛ = 0;
                while (d.ﻛ < iArr.length) {
                    cArr[0] = (char) (iArr[d.ﻛ] >> 16);
                    cArr[1] = (char) iArr[d.ﻛ];
                    cArr[2] = (char) (iArr[d.ﻛ + 1] >> 16);
                    cArr[3] = (char) iArr[d.ﻛ + 1];
                    d.ﾒ = (cArr[0] << 16) + cArr[1];
                    d.ｋ = (cArr[2] << 16) + cArr[3];
                    d.ﾒ(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = d.ﾒ ^ iArr2[i2];
                        d.ﾒ = i3;
                        d.ｋ = d.ｋ(i3) ^ d.ｋ;
                        int i4 = d.ﾒ;
                        d.ﾒ = d.ｋ;
                        d.ｋ = i4;
                    }
                    int i5 = d.ﾒ;
                    d.ﾒ = d.ｋ;
                    d.ｋ = i5;
                    d.ｋ = i5 ^ iArr2[16];
                    d.ﾒ ^= iArr2[17];
                    int i6 = d.ﾒ;
                    int i7 = d.ｋ;
                    cArr[0] = (char) (d.ﾒ >>> 16);
                    cArr[1] = (char) d.ﾒ;
                    cArr[2] = (char) (d.ｋ >>> 16);
                    cArr[3] = (char) d.ｋ;
                    d.ﾒ(iArr2);
                    cArr2[d.ﻛ << 1] = cArr[0];
                    cArr2[(d.ﻛ << 1) + 1] = cArr[1];
                    cArr2[(d.ﻛ << 1) + 2] = cArr[2];
                    cArr2[(d.ﻛ << 1) + 3] = cArr[3];
                    d.ﻛ += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }
}
