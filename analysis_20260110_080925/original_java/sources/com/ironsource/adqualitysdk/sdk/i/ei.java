package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ei extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f416 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f417 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f418 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f419 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f420 = -9076982150857276290L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee f421;

    public ei(ee eeVar, dm dmVar) {
        super(dmVar);
        this.f421 = eeVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        int i = f416 + 45;
        f417 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return this.f421.m769(drVar, cpVar);
        }
        this.f421.m769(drVar, cpVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final String toString() {
        String string = new StringBuilder().append(m778(47264702 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 655), "뾕턳輂砂", "\uf3b0", "䑾憗ᓓ興").intern()).append(this.f421).append(m778(298434062 - Color.red(0), (char) (16179 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), "ຉ즾㐑䰿", "\uf09b", "䑾憗ᓓ興").intern()).toString();
        int i = f417 + 35;
        f416 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return string;
        }
        int i2 = 2 / 0;
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            int i = f417 + R.styleable.AppCompatTheme_tooltipFrameBackground;
            f416 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return true;
        }
        if (obj != null) {
            if (!(getClass() != obj.getClass())) {
                ei eiVar = (ei) obj;
                ee eeVar = this.f421;
                if (eeVar != null) {
                    int i3 = f416 + 5;
                    f417 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    boolean z = i3 % 2 != 0;
                    boolean zEquals = eeVar.equals(eiVar.f421);
                    if (z) {
                        int i4 = 50 / 0;
                    }
                    return zEquals;
                }
                if ((eiVar.f421 == null ? '!' : 'W') != '!') {
                    int i5 = f417 + 69;
                    f416 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = f417 + 29;
                f416 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = f416;
        int i2 = i + 51;
        f417 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ee eeVar = this.f421;
        Object obj = null;
        if (eeVar == null) {
            int i4 = i + 11;
            f417 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 != 0) {
                throw null;
            }
            return 0;
        }
        int i5 = i + 5;
        f417 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i5 % 2 != 0) {
            eeVar.hashCode();
            super.hashCode();
            throw null;
        }
        int iHashCode = eeVar.hashCode();
        int i6 = f416 + 27;
        f417 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i6 % 2 != 0)) {
            return iHashCode;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m778(int i, char c, String str, String str2, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (j.ﾒ) {
            char[] cArr4 = (char[]) cArr3.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr6 = new char[length];
            j.ﻐ = 0;
            while (j.ﻐ < length) {
                int i2 = (j.ﻐ + 2) % 4;
                int i3 = (j.ﻐ + 3) % 4;
                j.ｋ = (char) (((cArr4[j.ﻐ % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = j.ｋ;
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f420) ^ f418) ^ f419);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
