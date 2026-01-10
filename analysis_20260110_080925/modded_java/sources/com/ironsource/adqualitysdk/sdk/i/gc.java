package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class gc extends gi {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f582 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f583 = 59973;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f584 = 328;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f585 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f586 = 3220;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f587 = 16830;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m851() {
        int i = f582 + 71;
        f585 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        String strIntern = m850("⺤숔頻춨䉱侗糫톫뙐\u1c8f\ua7ef\uf602䧞汽\udc12\ue1f5\udc04嘠乖큤ዚ絛פֿꝅ﹁̙ⱖ计﹁̙ⱖ计퉇끣糫톫酑蝀\ua7ef\uf602䧞汽蝱ꀷ軷쪫瞇麬턣\udbb4ⳤ盔", (i % 2 != 0 ? '/' : 'S') != '/' ? 51 - (ViewConfiguration.getKeyRepeatTimeout() >> 16) : (ViewConfiguration.getKeyRepeatTimeout() << R.styleable.AppCompatTheme_tooltipFrameBackground) * 74).intern();
        int i2 = f582 + 61;
        f585 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? 'T' : '2') != 'T') {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m853() {
        int i = f585 + 73;
        f582 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? (char) 25 : 'M') == 'M') {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m854() {
        bf bfVar = new bf(ﻛ());
        int i = f585 + 107;
        f582 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'a' : 'L') != 'a') {
            return bfVar;
        }
        int i2 = 87 / 0;
        return bfVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m852() {
        int i = f582 + 25;
        f585 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return m850("즻\u008aۘ教\uebe5ધϫ멱楟\u17eeﶅ勹傿শ", (i % 2 != 0 ? 'H' : 'D') != 'D' ? 107 % (ViewConfiguration.getMaximumDrawingCacheSize() + 20) : 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m850(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.ﾒ) {
            char[] cArr2 = new char[cArr.length];
            m.ﾇ = 0;
            char[] cArr3 = new char[2];
            while (m.ﾇ < cArr.length) {
                cArr3[0] = cArr[m.ﾇ];
                cArr3[1] = cArr[m.ﾇ + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f583)) ^ ((c2 >>> 5) + f584)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f586) ^ ((c3 + i2) ^ ((c3 << 4) + f587))));
                    i2 -= 40503;
                }
                cArr2[m.ﾇ] = cArr3[0];
                cArr2[m.ﾇ + 1] = cArr3[1];
                m.ﾇ += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
