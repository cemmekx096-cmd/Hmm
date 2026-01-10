package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fa extends en {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f475 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f476 = {';'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f477 = 17;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f478 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f479 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f480 = true;

    public fa(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾇ */
    public final Number mo788(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i = f479;
            int i2 = i + 77;
            f475 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i4 = i + 97;
                    f475 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i5 = i4 % 2;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() * number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() * number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() * number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f479 + 35;
        f475 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = m799(null, null, !(i % 2 == 0) ? TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + RendererCapabilities.DECODER_SUPPORT_PRIMARY : 17744 % TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, (char) 31), "\u0081").intern();
        int i2 = f475 + R.styleable.AppCompatTheme_toolbarStyle;
        f479 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '^' : 'J') == 'J') {
            return strIntern;
        }
        int i3 = 61 / 0;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m799(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f476;
            int i2 = f477;
            if (f478) {
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
            if (f480) {
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
