package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import androidx.media3.exoplayer.RendererCapabilities;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class et extends en {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f450 = -6617615807080026943L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f451 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f452;

    public et(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾇ */
    public final Number mo788(Number number, Number number2) {
        int i = f451 + 53;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f452 = i2;
        int i3 = i % 2;
        if (!(number instanceof Double)) {
            int i4 = i2 + 59;
            f451 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            if ((number2 instanceof Double ? (char) 30 : 'F') != 30) {
                if (!(number instanceof Long) && !(number2 instanceof Long)) {
                    return Integer.valueOf(number.intValue() / number2.intValue());
                }
                Long lValueOf = Long.valueOf(number.longValue() / number2.longValue());
                int i6 = f451 + 99;
                f452 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i7 = i6 % 2;
                return lValueOf;
            }
        }
        return Double.valueOf(number.doubleValue() / number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f452 + 25;
        f451 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m793("\ueecd\ueee2汮ᇻ\udefa", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
        int i3 = f451 + 27;
        f452 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m793(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f450, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f450));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
