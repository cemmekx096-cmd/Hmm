package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ep extends eo {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f439 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f440 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f441 = 1647880768321327986L;

    public ep(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo782(int i) {
        int i2 = f440;
        int i3 = i2 + 53;
        f439 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            throw null;
        }
        if ((i > 0 ? ']' : '4') == '4') {
            return false;
        }
        int i4 = i2 + 101;
        f439 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f439 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f440 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m790("ꈍꈳ읔曞脘", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern();
        int i3 = f440 + 45;
        f439 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m790(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f441, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f441));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
