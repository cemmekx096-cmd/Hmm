package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.fyber.FairBid;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class gd extends gi {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f588 = {'g', 186, 191, 210, 202, 184, 159, 181, 208, 200, 210, 212, 175, 178, 211, 206, 200, '8', 'r', 'p', 'r', GMTDateParser.ZONE, 'w', 'r'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f589 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f590 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m856() {
        int i = f590 + 47;
        f589 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = ((i % 2 != 0 ? '`' : 'a') != '`' ? m855(true, new int[]{0, 17, 101, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001") : m855(false, new int[]{0, 17, 101, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001")).intern();
        int i2 = f589 + 29;
        f590 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? '^' : 'Q') == 'Q') {
            return strIntern;
        }
        int i3 = 76 / 0;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m858() {
        int i = f590 + R.styleable.AppCompatTheme_windowActionBar;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f589 = i2;
        if ((i % 2 != 0 ? (char) 5 : (char) 17) == 5) {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        int i3 = i2 + 3;
        f590 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? 'K' : '*') == '*') {
            return FairBid.class;
        }
        int i4 = 65 / 0;
        return FairBid.class;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m859() {
        bq bqVar = new bq(ﻛ());
        int i = f590 + 31;
        f589 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            throw null;
        }
        return bqVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m857() {
        int i = f590 + 25;
        f589 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return ((i % 2 != 0 ? (char) 20 : 'H') != 20 ? m855(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001") : m855(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001")).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m855(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f588, i, cArr, 0, i2);
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
