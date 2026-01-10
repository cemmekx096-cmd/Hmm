package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ex extends en {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f465 = {'%'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f466 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f467 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f468 = 1;

    public ex(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾇ */
    public final Number mo788(Number number, Number number2) {
        int i = f467 + 107;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f468 = i2;
        int i3 = i % 2;
        if (!(number instanceof Double)) {
            int i4 = i2 + R.styleable.AppCompatTheme_tooltipFrameBackground;
            f467 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 != 0) {
                boolean z = number2 instanceof Double;
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if ((!(number instanceof Long) ? '_' : 'V') != 'V') {
                    int i5 = i2 + 95;
                    f467 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i6 = i5 % 2;
                    if ((number2 instanceof Long ? '\"' : (char) 25) != '\"') {
                        return Integer.valueOf(number.intValue() % number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() % number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() % number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f468 + 37;
        f467 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m797((byte) (113 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0095", -ImageFormat.getBitsPerPixel(0)).intern();
        int i3 = f468 + 99;
        f467 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '^' : '*') == '*') {
            return strIntern;
        }
        int i4 = 21 / 0;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m797(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f465;
            char c = f466;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                i.ﾒ = 0;
                while (i.ﾒ < i) {
                    i.ﾇ = cArr[i.ﾒ];
                    i.ﻛ = cArr[i.ﾒ + 1];
                    if (i.ﾇ == i.ﻛ) {
                        cArr3[i.ﾒ] = (char) (i.ﾇ - b);
                        cArr3[i.ﾒ + 1] = (char) (i.ﻛ - b);
                    } else {
                        i.ｋ = i.ﾇ / c;
                        i.ﱟ = i.ﾇ % c;
                        i.ﻐ = i.ﻛ / c;
                        i.ﮐ = i.ﻛ % c;
                        if (i.ﱟ == i.ﮐ) {
                            i.ｋ = ((i.ｋ + c) - 1) % c;
                            i.ﻐ = ((i.ﻐ + c) - 1) % c;
                            int i2 = (i.ｋ * c) + i.ﱟ;
                            int i3 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i2];
                            cArr3[i.ﾒ + 1] = cArr2[i3];
                        } else if (i.ｋ == i.ﻐ) {
                            i.ﱟ = ((i.ﱟ + c) - 1) % c;
                            i.ﮐ = ((i.ﮐ + c) - 1) % c;
                            int i4 = (i.ｋ * c) + i.ﱟ;
                            int i5 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i4];
                            cArr3[i.ﾒ + 1] = cArr2[i5];
                        } else {
                            int i6 = (i.ｋ * c) + i.ﮐ;
                            int i7 = (i.ﻐ * c) + i.ﱟ;
                            cArr3[i.ﾒ] = cArr2[i6];
                            cArr3[i.ﾒ + 1] = cArr2[i7];
                        }
                    }
                    i.ﾒ += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
