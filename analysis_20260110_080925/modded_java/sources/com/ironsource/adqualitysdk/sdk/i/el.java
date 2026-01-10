package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class el extends ee {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f428 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f429 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f430 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f431 = 286;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f432 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f433 = {355, 400, 397, 318, 387, 404, 383, 394, 403, 402, 391, 396, 389, 406, 398, 401};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f434;

    public el(String str, dm dmVar) {
        super(dmVar);
        this.f434 = dw.m736(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m786() {
        int i = f428;
        int i2 = i + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f429 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f434;
        int i4 = i + 85;
        f429 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        try {
            return new du(drVar.m717(m786()));
        } catch (Exception e) {
            dt dtVar = cpVar.ｋ(m786());
            Object obj = null;
            if (dtVar != null) {
                du duVar = new du(dtVar);
                int i = f428 + 29;
                f429 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i % 2 == 0) {
                    return duVar;
                }
                super.hashCode();
                throw null;
            }
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m785(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0084\u008c\u0083\u008b\u0090\u0090\u0085\u0082\u008f\u008e\u0085\u0084\u008d\u008c\u008b\u008a\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern()).append(this).append(m768()).toString(), e);
            return new du(null);
        }
    }

    public final String toString() {
        int i = f429 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f428 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM786 = m786();
        int i3 = f429 + 7;
        f428 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return strM786;
        }
        int i4 = 60 / 0;
        return strM786;
    }

    public final boolean equals(Object obj) {
        int i = f429;
        int i2 = i + 77;
        f428 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i3 = i + R.styleable.AppCompatTheme_windowActionModeOverlay;
            f428 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            if (!(getClass() != obj.getClass())) {
                boolean zEquals = this.f434.equals(((el) obj).f434);
                int i5 = f429 + 33;
                f428 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i6 = i5 % 2;
                return zEquals;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = f428 + 77;
        f429 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            throw null;
        }
        String str = this.f434;
        if ((str != null ? '.' : 'V') != '.') {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i2 = f428 + 57;
        f429 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return iHashCode;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m785(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.ｋ) {
            char[] cArr2 = f433;
            int i2 = f431;
            if (f432) {
                int length = bArr.length;
                o.ﾇ = length;
                char[] cArr3 = new char[length];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr3[o.ﾒ] = (char) (cArr2[bArr[(o.ﾇ - 1) - o.ﾒ] + i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr3);
            }
            if (f430) {
                int length2 = cArr.length;
                o.ﾇ = length2;
                char[] cArr4 = new char[length2];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr4[o.ﾒ] = (char) (cArr2[cArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            o.ﾇ = length3;
            char[] cArr5 = new char[length3];
            o.ﾒ = 0;
            while (o.ﾒ < o.ﾇ) {
                cArr5[o.ﾒ] = (char) (cArr2[iArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                o.ﾒ++;
            }
            return new String(cArr5);
        }
    }
}
