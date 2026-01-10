package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ft extends fq {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f543 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f544 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f545 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f546 = 260;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f547 = {378, 357, 374, 292, 304, 319};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f548 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<ee> f549;

    public ft(List<ee> list) {
        this.f549 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        Iterator<ee> it;
        int i = f543 + 101;
        f544 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '3' : (char) 11) != '3') {
            it = this.f549.iterator();
        } else {
            it = this.f549.iterator();
            int i2 = 83 / 0;
        }
        while (true) {
            el elVarM738 = null;
            if (!it.hasNext()) {
                return new du(null);
            }
            ee next = it.next();
            if (next instanceof el) {
                elVarM738 = (el) next;
                int i3 = f544 + 91;
                f543 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            } else {
                if (next instanceof dx) {
                    elVarM738 = ((dx) next).m738();
                }
            }
            if (elVarM738 != null) {
                int i5 = f544 + 43;
                f543 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i6 = i5 % 2;
                drVar.m715(Arrays.asList(elVarM738.m786()));
            }
            next.mo735(drVar, cpVar);
        }
    }

    public final String toString() {
        int i = f544 + 87;
        f543 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (this.f549 != null) {
            return new StringBuilder().append(m817(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u0083\u0082\u0081").intern()).append(TextUtils.join(m817(null, null, 127 - Color.blue(0), "\u0084\u0085").intern(), this.f549)).append(m817(null, null, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 127, "\u0086").intern()).toString();
        }
        String strIntern = m817(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0086\u0084\u0083\u0082\u0081").intern();
        int i3 = f544 + 9;
        f543 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return strIntern;
        }
        int i4 = 2 / 0;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m817(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f547;
            int i2 = f546;
            if (f545) {
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
            if (f548) {
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
