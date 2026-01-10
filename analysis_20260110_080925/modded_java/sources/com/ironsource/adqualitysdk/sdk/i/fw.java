package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fw extends gi {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f558 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f559 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f560 = 157260195039371603L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m820() {
        int i = f559 + 89;
        f558 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m819("愰겯礼ৄ坶拾끎︸ම嬗暘둰쏔ᅁ彷檯렇쟡ᕰ⃛湃밵쮅\u191fⓨ牬臖쿼ᴴ⢐瘂薰퍺ỒⲺ稤覬휃\ue2f4い翈趽\udb0c\ue686㑆䏱酘\udcc2\ueaaa㠄䞜", 52627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        int i3 = f558 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f559 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m822() {
        int i = f559 + 41;
        f558 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 23 : 'W') != 23) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m823() {
        bh bhVar = new bh(ﻛ());
        int i = f558 + 53;
        f559 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return bhVar;
        }
        int i2 = 95 / 0;
        return bhVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m821() {
        int i = f558 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f559 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m819("愲ᇰ肬㍵ꈧ勑얋瑇\ue70f韍۱릨⡤\udb3c䯇", 28919 - AndroidCharacter.getMirror('0')).intern();
        int i3 = f559 + 59;
        f558 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m819(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (g.ﾇ) {
            g.ﾒ = i;
            char[] cArr2 = new char[cArr.length];
            g.ｋ = 0;
            while (g.ｋ < cArr.length) {
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f560);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
