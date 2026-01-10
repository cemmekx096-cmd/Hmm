package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.ay;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fx extends gi {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f561 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f562 = 24744;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f563;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f564;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f565;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m826() {
        int gidForName;
        int absoluteGravity;
        int i = f561 + 5;
        f564 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            gidForName = (-1) - Process.getGidForName(BuildConfig.FLAVOR);
            absoluteGravity = Gravity.getAbsoluteGravity(1, 0);
        } else {
            gidForName = (-1) - Process.getGidForName(BuildConfig.FLAVOR);
            absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
        }
        String strIntern = m825(gidForName, (char) absoluteGravity, "ﵷ巫疅ኲ", "ᶇ\u0095◹鐞全뮡葅혩浽紿潪⨄\uf039鉸碛Ṁ垚省\ue17e뜷䗆髎⧂\uf80f\uf05e蜞鋵僘魇蘋Ａ띞饛\uf349ꈏ添", "\u0000\u0000\u0000\u0000").intern();
        int i2 = f561 + 27;
        f564 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '5' : '>') != '5') {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m828() {
        int i = f561 + 97;
        f564 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 26 : (char) 23) != 26) {
            return MobileAds.class;
        }
        int i2 = 94 / 0;
        return MobileAds.class;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m829() {
        int i = f564 + 31;
        f561 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'W' : (char) 19) == 19) {
            if (!m824()) {
                return new ay(ﻛ());
            }
            ay.d dVar = new ay.d(ﻛ());
            int i2 = f564 + 85;
            f561 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return dVar;
        }
        m824();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m824() {
        int i = f564 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f561 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            if ((Prode.ﻐ() ? 'Q' : '7') == '7') {
                Class.forName(m825(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1, (char) View.getDefaultSize(0, 0), "싙䴏\u0e85岪", "눯꜊版㾿萻㏅\u1aefꌧ䉓뎴❩氊鵹졌ᄆ\uf38dᆿᩂ릵☪\uf63e\ud9f9杜\uda00㟢Ꙭ\udeed䢋ၺ륪灕獘鱇搋䉴喕ﳭ\u2efe", "\u0000\u0000\u0000\u0000").intern());
                return true;
            }
            int i3 = f561 + 69;
            f564 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m827() {
        int i = f564 + 39;
        f561 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m825(11823 - AndroidCharacter.getMirror('0'), (char) (46605 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), "ￅꜭค\u07b6", "৹偉࿋鱞䗴", "\u0000\u0000\u0000\u0000").intern();
        int i3 = f564 + 61;
        f561 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m825(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f565) ^ f563) ^ f562);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
