package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class em extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f435 = -334442904899499428L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f436 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f437 = 1;

    public em(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        return new du(Boolean.valueOf(m774().m769(drVar, cpVar).m732() && m773().m769(drVar, cpVar).m732()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f436 + 77;
        f437 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = m787("⪅赑⪣䜫牠⮒", (i % 2 == 0 ? 'U' : (char) 26) != 'U' ? ViewConfiguration.getWindowTouchSlop() >> 8 : ViewConfiguration.getWindowTouchSlop() - 95).intern();
        int i2 = f436 + 99;
        f437 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m787(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f435, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f435));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
