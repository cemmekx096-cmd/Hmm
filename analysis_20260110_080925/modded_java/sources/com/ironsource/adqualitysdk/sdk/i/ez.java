package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ez extends ek {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f470 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f471 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f472 = 47057;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f473 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f474;

    public ez(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo782(int i) {
        int i2 = f474 + 97;
        int i3 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f473 = i3;
        int i4 = i2 % 2;
        if (i == 0) {
            return false;
        }
        int i5 = i3 + 17;
        f474 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﾇ */
    final boolean mo784(String str, String str2) {
        if ((!str.equals(str2) ? '?' : '4') != '4') {
            int i = f474 + 29;
            f473 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return i % 2 != 0;
        }
        int i2 = f473 + 9;
        f474 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '(' : (char) 18) != '(') {
            return false;
        }
        int i3 = 98 / 0;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo783(Object obj, Object obj2) {
        int i = f473 + 15;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f474 = i2;
        if (!(i % 2 == 0)) {
            throw null;
        }
        if (obj != obj2) {
            return true;
        }
        int i3 = i2 + 65;
        f473 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f473 + 33;
        f474 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m798(TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25534), "䈿ꕒ뺞鹣", "뉸\ue07b", "\u0000\u0000\u0000\u0000").intern();
        int i3 = f473 + 27;
        f474 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        int i4 = 47 / 0;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m798(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f470) ^ f471) ^ f472);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
