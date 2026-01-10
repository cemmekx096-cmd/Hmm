package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ga extends gi {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f573 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f574 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f575 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f576 = 259;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f577;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f578 = {358, 370, 368, 305, 364, 373, 369, 374, 376, 360, 356, 359, 372, 367, 375, 380, 366, 332, 342, 324, 340, 363};

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m841() {
        int i = f577 + 55;
        f573 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m840(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i3 = f577 + 83;
        f573 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m843() {
        Class<IronSourceAdQuality> cls;
        int i = f577 + 3;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f573 = i2;
        if ((i % 2 == 0 ? '\t' : 'F') != 'F') {
            cls = IronSourceAdQuality.class;
            int i3 = 92 / 0;
        } else {
            cls = IronSourceAdQuality.class;
        }
        int i4 = i2 + 7;
        f577 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return cls;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m844() {
        bd bdVar = new bd(ﻛ());
        int i = f573 + 51;
        f577 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return bdVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m842() {
        int i = f573 + 53;
        f577 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Object obj = null;
        String strIntern = m840(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + R.styleable.AppCompatTheme_windowNoTitle, "\u008c\u008a\u0086\u008b\u0096\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b").intern();
        int i3 = f573 + R.styleable.AppCompatTheme_toolbarStyle;
        f577 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m840(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.ｋ) {
            char[] cArr2 = f578;
            int i2 = f576;
            if (f574) {
                int length = bArr.length;
                o.ﾇ = length;
                char[] cArr3 = new char[length];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr3[o.ﾒ] = (char) (cArr2[bArr[(o.ﾇ - 1) - o.ﾒ] + i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr3);
            }
            if (f575) {
                int length2 = cArr.length;
                o.ﾇ = length2;
                char[] cArr4 = new char[length2];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr4[o.ﾒ] = (char) (cArr2[cArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            o.ﾇ = length3;
            char[] cArr5 = new char[length3];
            o.ﾒ = 0;
            while (o.ﾒ < o.ﾇ) {
                cArr5[o.ﾒ] = (char) (cArr2[iArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                o.ﾒ++;
            }
            return new String(cArr5);
        }
    }
}
