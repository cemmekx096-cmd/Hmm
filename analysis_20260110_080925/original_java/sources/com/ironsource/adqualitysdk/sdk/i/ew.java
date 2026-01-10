package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ew extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f462 = {30, '<'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f463 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f464 = 1;

    public ew(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo782(int i) {
        if (i <= 0) {
            int i2 = f463 + 99;
            f464 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f464 + 33;
        f463 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 != 0)) {
            return false;
        }
        int i5 = 80 / 0;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f463 + 39;
        f464 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m796(true, new int[]{0, 2, 0, 0}, "\u0001\u0001").intern();
        int i3 = f463 + 13;
        f464 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? ')' : '+') != ')') {
            return strIntern;
        }
        int i4 = 66 / 0;
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m796(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (h.ﾒ) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f462, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                h.ﾇ = 0;
                char c = 0;
                while (h.ﾇ < i2) {
                    if (bArr[h.ﾇ] == 1) {
                        cArr2[h.ﾇ] = (char) (((cArr[h.ﾇ] << 1) + 1) - c);
                    } else {
                        cArr2[h.ﾇ] = (char) ((cArr[h.ﾇ] << 1) - c);
                    }
                    c = cArr2[h.ﾇ];
                    h.ﾇ++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr4[h.ﾇ] = cArr[(i2 - h.ﾇ) - 1];
                    h.ﾇ++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr[h.ﾇ] = (char) (cArr[h.ﾇ] - iArr[2]);
                    h.ﾇ++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
