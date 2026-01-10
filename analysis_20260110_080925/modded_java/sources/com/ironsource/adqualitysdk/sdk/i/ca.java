package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ca extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f4 = {'T', 172, 171, 167, 172, 149, 145, 144, 143, 172, 144, 141, GMTDateParser.SECONDS, 223, 218, 216, 219, 219, 203, 212, 224, 218, 224, 221, 206, 218, 215, '2', ']', 'e', 'l', 'f', 'l', 'i', 'Z', 'f', 'c', ']', 'n', 'l', 'n', 'r', '?', 130, 132, 129, 131, 'r', 'x', 143, 135, 136, 136, 135, 132, 'k', 'Q', 172, 172, 148, 155, 172, 166, 168, 161, 'R', 147, 151, 167, 166, 175, 175, 175, 180, 179, 172, 173, 178, 156, 152, 173, 171, 146, 152, 283, 279, 283, 288, 310, 305, 304, 311, 312, 307, 307, 307, 298, 'v', 229, 227, 227, 230, 237, 232, 212, 210, 204, 208, 224, 223, 232, 232, 232, 237, 236, 229, 230, 235, 213, 'u', 217, 217, 226, 226, 245, 243, 240, 242, 235, 'J', 160, 162, 143, 150, 159, 157, 157, 160, 167, 162, 142, 140, 134, 134, 152, 152, 159, 134, 261, 259, 259, 262, 269, 264, 244, 251, 264, 257, 249, 255, 262, 256, 262, 259, 244, 256, 253, 135, 263, 273, 287, 277, 273, 273, 279, 270, 262, 281, 279, 276};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f5 = -9112507224635534966L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m248(Reward reward) {
        int i = f2 + 95;
        f3 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM246 = m246(reward);
        int i3 = f3 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f2 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM246;
    }

    public ca(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m252() {
        int i = f2 + 87;
        f3 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Object obj = null;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m247("눾뉨愆烉ࢱ嶛⯷楖\uf45f㛻懃", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).get(null);
                int i3 = f2 + 19;
                f3 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i3 % 2 == 0 ? (char) 24 : 'S') == 'S') {
                    return str;
                }
                super/*java.lang.Object*/.hashCode();
                throw null;
            } catch (Exception unused) {
                return hr.ﻛ().ﾒ().ｋ(MyTargetVersion.class, m249(false, new int[]{0, 12, 76, 11}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000").intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m251(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.m251(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m250() {
        HashMap map = new HashMap();
        map.put(m249(false, new int[]{167, 13, 171, 5}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m253(List<Object> list, ch chVar) {
                return ca.m248((Reward) list.get(0));
            }
        });
        int i = f3 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m246(Reward reward) {
        int i = f3 + 87;
        f2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String str = reward.type;
        int i3 = f2 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f3 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m247(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f5, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f5));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m249(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f4, i, cArr, 0, i2);
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
