package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fb extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f481 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f482 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f483 = {'|'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f484 = 1;

    public fb(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        int i = f484 + 103;
        f482 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 == 0) {
            du duVarM769 = m774().m769(drVar, cpVar);
            if (!duVarM769.m732()) {
                return m773().m769(drVar, cpVar);
            }
            int i2 = f482 + 59;
            f484 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i2 % 2 == 0)) {
                return duVarM769;
            }
            super.hashCode();
            throw null;
        }
        m774().m769(drVar, cpVar).m732();
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        byte windowTouchSlop;
        int iIndexOf;
        int i = f482 + 15;
        f484 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'X' : 'T') != 'X') {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63);
            iIndexOf = 1 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
        } else {
            windowTouchSlop = (byte) ((ViewConfiguration.getWindowTouchSlop() >> 81) + 75);
            iIndexOf = 0 << TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '=');
        }
        return m800(windowTouchSlop, "»»", iIndexOf).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m800(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f483;
            char c = f481;
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
