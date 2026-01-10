package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class fs extends fq {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f537 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f538 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f539 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f540 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f541 = -6269926821851505975L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f542;

    public fs(ee eeVar) {
        this.f542 = eeVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final ee m816() {
        int i = f538 + 69;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f537 = i2;
        int i3 = i % 2;
        ee eeVar = this.f542;
        int i4 = i2 + 57;
        f538 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return eeVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public du mo804(dr drVar, cp cpVar) {
        int i = f538 + 83;
        f537 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (!(i % 2 == 0)) {
            ee eeVar = this.f542;
            if (eeVar == null) {
                return new du(null);
            }
            du duVarM769 = eeVar.m769(drVar, cpVar);
            int i2 = f538 + 25;
            f537 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return duVarM769;
        }
        super.hashCode();
        throw null;
    }

    public String toString() {
        int i = f538 + 61;
        f537 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            if (this.f542 != null) {
                String string = new StringBuilder().append(this.f542).append(m815((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 868038612, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 64750), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼").intern()).toString();
                int i2 = f538 + 91;
                f537 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i2 % 2 != 0) {
                    return string;
                }
                int i3 = 48 / 0;
                return string;
            }
            return m815((ViewConfiguration.getJumpTapTimeout() >> 16) - 868038611, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64749), "ⵅ䋈\ueecc㋼", "ꛈ", "\udac9柘뻆꣼").intern();
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = f538 + 35;
            f537 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return (i % 2 == 0 ? 'V' : '(') == '(';
        }
        if (obj != null) {
            int i2 = f537 + R.styleable.AppCompatTheme_toolbarStyle;
            f538 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            if ((getClass() != obj.getClass() ? '8' : (char) 1) != '8') {
                fs fsVar = (fs) obj;
                ee eeVar = this.f542;
                char c = eeVar != null ? (char) 15 : (char) 23;
                ee eeVar2 = fsVar.f542;
                return c != 15 ? eeVar2 == null : eeVar.equals(eeVar2);
            }
        }
        return false;
    }

    public int hashCode() {
        int i = f537 + 63;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f538 = i2;
        if (!(i % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ee eeVar = this.f542;
        if (eeVar == null) {
            return 0;
        }
        int i3 = i2 + 23;
        f537 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i3 % 2 == 0 ? (char) 31 : 'O';
        int iHashCode = eeVar.hashCode();
        if (c != 31) {
            return iHashCode;
        }
        int i4 = 77 / 0;
        return iHashCode;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m815(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f541) ^ f540) ^ f539);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
