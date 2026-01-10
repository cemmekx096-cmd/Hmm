package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.chartboost.sdk.Chartboost;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class gf extends gi {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f591 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f592 = {-434099454, -1457314231, -771968179, 2109500617, 2083488763, 70541128, -1564886261, 1065077304, 2146015993, 1994559323, 413903266, -11670557, 1987381323, -1999253732, 504038993, 1866668567, -297737277, -1383919022};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f593;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m861() {
        int i = f593 + 93;
        f591 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = (!(i % 2 == 0) ? m860(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 29 - (ViewConfiguration.getFadingEdgeLength() >> 16)) : m860(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 85 / (ViewConfiguration.getFadingEdgeLength() * 109))).intern();
        int i2 = f593 + 57;
        f591 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m863() {
        int i = f591 + 33;
        f593 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return Chartboost.class;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m864() {
        bk bkVar = new bk(ﻛ());
        int i = f591 + 27;
        f593 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 3 : (char) 22) == 22) {
            return bkVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m862() {
        int i = f593 + 107;
        f591 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = (i % 2 != 0 ? m860(new int[]{1046953025, 1122549119, -774843644, -118747119, 469757485, 948759487}, 10 - (KeyEvent.getMaxKeyCode() >> 16)) : m860(new int[]{1046953025, 1122549119, -774843644, -118747119, 469757485, 948759487}, 2 >>> (KeyEvent.getMaxKeyCode() % 96))).intern();
        int i2 = f593 + 5;
        f591 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m860(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f592.clone();
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
