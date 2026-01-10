package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fc extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f485 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f486 = {'!'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f487 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f488;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f489;

    public fc(ee eeVar, dm dmVar) {
        super(dmVar);
        this.f489 = eeVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        return new du(Boolean.valueOf(!this.f489.m769(drVar, cpVar).m732()));
    }

    public final String toString() {
        String string = new StringBuilder().append(m801((byte) (22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), "7", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()).append(this.f489).toString();
        int i = f488 + 45;
        f487 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m801(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f486;
            char c = f485;
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
