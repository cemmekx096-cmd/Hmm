package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class dz extends ee {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f362 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f363 = 47089;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f364;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f365;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f366;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f367;

    public dz(String str, dm dmVar) {
        super(dmVar);
        this.f367 = dw.m736(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        du duVar = new du(cpVar.ﻛ().ﾒ(kd.ｋ(this.f367, m755(TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 16879), "捭ꔮ\uee30\uf341", "摻㽾땘톈䪯휓", "\u0000\u0000\u0000\u0000").intern())));
        int i = f366 + 109;
        f362 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return duVar;
    }

    public final String toString() {
        int i = f362;
        int i2 = i + 65;
        f366 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f367;
        int i4 = i + 73;
        f366 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            int i = f362 + 101;
            f366 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return true;
        }
        if ((obj == null) || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f367;
        String str2 = ((dz) obj).f367;
        if (str != null) {
            return str.equals(str2);
        }
        if (!(str2 == null)) {
            return false;
        }
        int i3 = f366 + 11;
        f362 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return true;
    }

    public final int hashCode() {
        int i = f362 + 53;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f366 = i2;
        int i3 = i % 2;
        String str = this.f367;
        if (!(str != null)) {
            return 0;
        }
        int i4 = i2 + 73;
        f362 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m755(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f364) ^ f365) ^ f363);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
