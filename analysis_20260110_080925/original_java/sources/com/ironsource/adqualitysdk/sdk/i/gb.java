package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.amazon.device.ads.DTBAdRequest;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class gb extends gi {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f579 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f580 = 2000707303426420125L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f581;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m846() {
        int i = f581 + 59;
        f579 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m845("俰侓\ufb07ꗾͥᛵ纩쮜痢彻㐱籔⍷ꇬ\uedf2㚾泉\ueb88嬁\uef35际㱄႕ꆦ\udfc7蛈컄娪ऊ켓葨ಸ늹ᆿ緭씃ﰣ婎", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i3 = f581 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f579 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m848() {
        int i = f579 + 63;
        f581 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? ']' : '\\') == '\\') {
            return DTBAdRequest.class;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m849() {
        bj bjVar = new bj(ﻛ());
        int i = f579 + 41;
        f581 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '7' : 'B') != '7') {
            return bjVar;
        }
        int i2 = 62 / 0;
        return bjVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m847() {
        int i = f579 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f581 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
        }
        return m845("㋎㊯顃࿉᠒疳풒킿蓕㰼鸆朩幕", -ImageFormat.getBitsPerPixel(0)).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m845(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f580, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f580));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
