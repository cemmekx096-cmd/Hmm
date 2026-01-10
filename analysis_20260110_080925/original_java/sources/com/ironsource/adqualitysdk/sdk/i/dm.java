package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dm {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f257 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f258;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f259 = {')'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f260;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f261;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static dm m678(String str, int i) {
        int i2 = f257 + 73;
        f258 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (!(i2 % 2 != 0)) {
            if (!r.ﻛ().ﾒ()) {
                return null;
            }
            dm dmVar = new dm(str, i);
            int i3 = f257 + 11;
            f258 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i3 % 2 != 0)) {
                return dmVar;
            }
            super.hashCode();
            throw null;
        }
        r.ﻛ().ﾒ();
        throw null;
    }

    private dm(String str, int i) {
        this.f261 = str;
        this.f260 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m680() {
        int i = f257 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f258 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            throw null;
        }
        return this.f260;
    }

    public final String toString() {
        String string = new StringBuilder().append(this.f261).append(m679(false, new int[]{0, 1, 25, 0}, "\u0001").intern()).append(this.f260).toString();
        int i = f258 + 25;
        f257 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return string;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m679(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f259, i, cArr, 0, i2);
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
