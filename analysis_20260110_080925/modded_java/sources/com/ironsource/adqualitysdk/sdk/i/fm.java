package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fm extends fq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f507 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f508 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f509 = 6840138081520209287L;

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        du duVar = new du(null);
        duVar.m726();
        int i = f507 + 97;
        f508 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return duVar;
    }

    public final String toString() {
        int i = f508 + 13;
        f507 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m807("䷥헎綔蕗ⴀ뒛", TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 38971).intern();
        int i3 = f507 + 15;
        f508 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m807(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (g.ﾇ) {
            g.ﾒ = i;
            char[] cArr2 = new char[cArr.length];
            g.ｋ = 0;
            while (g.ｋ < cArr.length) {
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f509);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
