package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fj extends fq {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f494 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f495 = 1808670216826910144L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f496;

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ, reason: contains not printable characters */
    public final du mo804(dr drVar, cp cpVar) {
        Object obj = null;
        du duVar = new du(null);
        duVar.m727();
        int i = f496 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f494 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return duVar;
        }
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = f496 + 101;
        f494 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m803("䩽뢅ቝᎩ䨞䴪靈\uf29d鴔琫킨ꮌ\ue446", ViewConfiguration.getKeyRepeatDelay() >> 16).intern();
        int i3 = f496 + 67;
        f494 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m803(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f495, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f495));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
