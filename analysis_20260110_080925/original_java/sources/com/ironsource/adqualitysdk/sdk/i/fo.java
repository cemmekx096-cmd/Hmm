package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fo extends fs {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f514 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f515 = 15483;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f516 = 25611;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f517 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f518 = 24013;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f519 = 64362;

    public fo(ee eeVar) {
        super(eeVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fs, com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        int i = f514 + 85;
        f517 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        du duVarMo804 = super.mo804(drVar, cpVar);
        duVarMo804.m730(true);
        int i3 = f517 + 71;
        f514 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return duVarMo804;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fs
    public final String toString() {
        int i = f514 + 31;
        f517 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (m816() == null) {
            return m811("\uf343篝㦏雏蚷\ud884蓗⻁", 7 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)).intern();
        }
        String string = new StringBuilder().append(m811("\uf343篝㦏雏蚷\ud884\u009f\ue5f2", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern()).append(super.toString()).toString();
        int i3 = f517 + 95;
        f514 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m811(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.ﾒ) {
            char[] cArr2 = new char[cArr.length];
            m.ﾇ = 0;
            char[] cArr3 = new char[2];
            while (m.ﾇ < cArr.length) {
                cArr3[0] = cArr[m.ﾇ];
                cArr3[1] = cArr[m.ﾇ + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f516)) ^ ((c2 >>> 5) + f518)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f515) ^ ((c3 + i2) ^ ((c3 << 4) + f519))));
                    i2 -= 40503;
                }
                cArr2[m.ﾇ] = cArr3[0];
                cArr2[m.ﾇ + 1] = cArr3[1];
                m.ﾇ += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
