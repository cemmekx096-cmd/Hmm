package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class eu extends en {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f453 = 5534326972105450709L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f454 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f455 = 1;

    public eu(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾇ */
    public final Number mo788(Number number, Number number2) {
        int i = f454 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f455 = i2;
        int i3 = i % 2;
        if ((!(number instanceof Double) ? '4' : '%') == '4') {
            int i4 = i2 + 97;
            f454 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i6 = i2 + 77;
                    f454 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if (i6 % 2 != 0) {
                        boolean z = number2 instanceof Long;
                        throw null;
                    }
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
                        int i7 = f455 + 75;
                        f454 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i7 % 2 == 0) {
                            return numValueOf;
                        }
                        throw null;
                    }
                }
                return Long.valueOf(number.longValue() - number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() - number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f455 + 35;
        f454 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return m794("擸", i % 2 != 0 ? 24862 << TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) : TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 6637).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m794(String str, int i) {
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
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f453);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
