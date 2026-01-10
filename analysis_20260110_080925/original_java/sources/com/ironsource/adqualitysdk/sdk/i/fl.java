package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fl extends ff<String> {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f502 = 4527750729700833870L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f503 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f504 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f505 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f506 = 1;

    public fl(String str, dm dmVar) {
        super(dw.m736(str), dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ff
    public final String toString() {
        String string = new StringBuilder().append(m806(((byte) KeyEvent.getModifierMetaStateMask()) + 2027554257, (char) (14876 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕").intern()).append(super.toString()).append(m806(2027554256 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (14875 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), "퀟\uda05᭸ᠺ", "\ue945", "穎덕쵌㻕").intern()).toString();
        int i = f506 + 27;
        f505 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return string;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m806(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f502) ^ f504) ^ f503);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
