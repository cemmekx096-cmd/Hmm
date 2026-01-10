package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cr extends cz {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f137 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f138 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f139 = {'e', 136, 'u', 153, 133, 144, 141, 152, 157, 'w', GMTDateParser.HOURS, 'o'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f140 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f141 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f142 = 36;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m491(cp cpVar, List<Object> list) {
        int i = f137 + 61;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        cpVar.ﾇ((String) m528(list, 0, String.class), (JSONObject) m528(list, 1, JSONObject.class));
        int i3 = f140 + 29;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m499(final cp cpVar, List<Object> list, final dr drVar) {
        final dt dtVar = (dt) m528(list, 0, dt.class);
        if (dtVar != null) {
            cpVar.ﻐ(new in() { // from class: com.ironsource.adqualitysdk.sdk.i.cr.2
                /* renamed from: ﻛ, reason: contains not printable characters */
                public final JSONObject m500(String str, JSONObject jSONObject) {
                    return (JSONObject) dtVar.m721(drVar, cpVar, Arrays.asList(str, jSONObject)).m728();
                }
            });
            int i = f140 + 107;
            f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
        }
        int i3 = f140 + 87;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m494(cp cpVar) {
        int i = f137 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        cn cnVar = cpVar.ﻐ();
        int i3 = f137 + 79;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 26 : (char) 20) == 20) {
            return cnVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m490(cp cpVar) {
        int i = f140 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Context context = cpVar.ｋ();
        int i3 = f140 + 71;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return context;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static long m489() {
        int i = f137 + 109;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        long j = ju.ﾇ();
        int i3 = f137 + 53;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return j;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m488() {
        int i = f140 + 9;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '8' : 'H') == 'H') {
            ig igVarM469 = m469();
            JSONObject jSONObject = kc.ｋ(igVarM469.ﾒ(), igVarM469.ﻐ(), igVarM469.ﾇ(), igVarM469.ｋ());
            int i2 = f140 + 21;
            f137 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i2 % 2 == 0)) {
                return jSONObject;
            }
            int i3 = 24 / 0;
            return jSONObject;
        }
        ig igVarM4692 = m469();
        kc.ｋ(igVarM4692.ﾒ(), igVarM4692.ﻐ(), igVarM4692.ﾇ(), igVarM4692.ｋ());
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static long m493() {
        int i = f137 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        long j = m469().ﾇ();
        int i3 = f140 + 85;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return j;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Activity m483() {
        int i = f137 + 45;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '\t' : 'U') == 'U') {
            return ji.ｋ().ﾒ();
        }
        ji.ｋ().ﾒ();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static dh m495() {
        dh dhVar = new dh();
        int i = f137 + 107;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return dhVar;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static dg m476() {
        dg dgVar = new dg();
        int i = f137 + 25;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return dgVar;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static di m480() {
        di diVar = new di();
        int i = f140 + 109;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return diVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static dk m475() {
        dk dkVar = new dk();
        int i = f137 + 3;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return dkVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m486(cp cpVar) {
        int i = f140 + 51;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM442 = cpVar.ﻐ().m442();
        int i3 = f137 + 61;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM442;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m496(cp cpVar) {
        int i = f137 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM445 = cpVar.ﻐ().m445();
        int i3 = f140 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? 'D' : (char) 23) != 'D') {
            return strM445;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String m478() {
        int i = f140 + 81;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? ' ' : '`') == ' ') {
            IronSourceAdQuality.getSDKVersion();
            throw null;
        }
        String sDKVersion = IronSourceAdQuality.getSDKVersion();
        int i2 = f140 + 81;
        f137 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? ')' : (char) 28) == 28) {
            return sDKVersion;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static JSONObject m482() {
        int i = f137 + 103;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '>' : (char) 18) == '>') {
            kc.ｋ(as.ﻐ().ゥ());
            throw null;
        }
        JSONObject jSONObject = kc.ｋ(as.ﻐ().ゥ());
        int i2 = f137 + 43;
        f140 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m498(List<Object> list) {
        String str;
        List<Object> list2;
        ax axVar;
        int i = f137 + 55;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? ';' : 'Y') != 'Y') {
            str = (String) m528(list, 1, String.class);
            list2 = m529(list, 0);
            axVar = r.ﻛ().ﺙ();
            if (axVar == null) {
                return null;
            }
        } else {
            str = (String) m528(list, 0, String.class);
            list2 = m529(list, 1);
            axVar = r.ﻛ().ﺙ();
            if (axVar == null) {
                return null;
            }
        }
        axVar.ﻛ(str, list2);
        int i2 = f140 + 25;
        f137 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m485(cp cpVar) {
        int i = f137 + 79;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        JSONObject jSONObject = cpVar.ﻏ();
        int i3 = f137 + 75;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 28 : (char) 2) == 2) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String m479(cp cpVar) {
        int i = f137 + 55;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM447 = cpVar.ﻐ().m447();
        int i3 = f140 + 65;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM447;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m484(List<Object> list) {
        int i = f140 + 1;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        n.ﻛ(m487(null, null, Color.blue(0) + 127, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), (String) m528(list, 0, String.class));
        int i3 = f140 + 85;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static boolean m473() {
        int i = f140 + 13;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        boolean z = as.ﻐ().ﮐ();
        int i3 = f137 + 87;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m497(List<Object> list) {
        int i = f137 + R.styleable.AppCompatTheme_windowActionBar;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
        }
        return ISAdQualityAdType.fromInt(((Integer) m528(list, 0, Integer.class)).intValue()).name().toLowerCase();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String m481(cp cpVar) {
        int i = f140 + 3;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? '_' : (char) 11;
        cn cnVar = cpVar.ﻐ();
        if (c != 11) {
            cnVar.m452();
            throw null;
        }
        String strM452 = cnVar.m452();
        int i2 = f137 + 93;
        f140 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            return strM452;
        }
        int i3 = 73 / 0;
        return strM452;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static String m477(cp cpVar) {
        int i = f137 + 59;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String str = cpVar.ﾒ().ﾒ();
        int i3 = f140 + 17;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m474() {
        int i = f137 + 41;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        boolean z = as.ﻐ().ﻛ();
        int i3 = f137 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static double m472() {
        int i = f140 + 63;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        double d = as.ﻐ().ﱟ();
        int i3 = f137 + 71;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return d;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static JSONObject m471() {
        int i = f137 + 51;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 30 : 'A') != 30) {
            return as.ﻐ().ﭴ().ゥ();
        }
        as.ﻐ().ﭴ().ゥ();
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String m470() {
        int i = f137 + 71;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 != 0) {
            as.ﻐ().ﭴ().ｋ();
            super.hashCode();
            throw null;
        }
        String str = as.ﻐ().ﭴ().ｋ();
        int i2 = f137 + 101;
        f140 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public static JSONObject m468() {
        int i = f140 + 13;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        JSONObject jSONObject = as.ﻐ().ﭴ().ﻛ();
        int i3 = f137 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f140 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return jSONObject;
        }
        int i4 = 58 / 0;
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m492(List<Object> list) {
        int i = f140 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f137 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
        }
        return as.ﻐ().ﭴ().ﻐ((String) m528(list, 0, String.class));
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private static ig m469() {
        int i = f137 + 37;
        f140 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        ig igVar = jg.ﻛ().ﻐ();
        int i3 = f140 + 57;
        f137 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? 'E' : 'Q') == 'Q') {
            return igVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m487(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f139;
            int i2 = f142;
            if (f141) {
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
            if (f138) {
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
