package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class dh extends cz implements ck {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f204 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f205 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f208 = 5;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private hn f209;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private hn f210;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f207 = {'g', 'e', 't', 'S', 'o', 'u', 'r', 'c', 'U', 'l', GMTDateParser.SECONDS, 'E', 'n', GMTDateParser.DAY_OF_MONTH, 'C', 'a', 'i', 'v', 'T', 'y', 'p', 'I', GMTDateParser.MINUTES, 'V', 'J'};

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f206 = {'q', 225, 231, 217, 214, 226, 223, 225, 216, 222, 234, 234, '>', 'x', 'x', 'l', 'k', GMTDateParser.SECONDS, GMTDateParser.MINUTES, 'o', GMTDateParser.HOURS, 'n', 'u', 'o', '2', 'f', GMTDateParser.MINUTES, 'o', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'Q', 168, 178, 164, 154, 171, 173, 172, 168, 161, 169, 152, 153, 170, 164, '8', 'r', 't', GMTDateParser.DAY_OF_MONTH, 'i', 'y', 'c', 'b', 'y', '{', 'l', GMTDateParser.SECONDS, 127, '2', 'f', GMTDateParser.HOURS, 'a', 'c', 'j', GMTDateParser.HOURS, 'n', 'f', 'g', GMTDateParser.SECONDS, 'A', 129, 135, 144, 143, '~', '|', 140, 128, GMTDateParser.ZONE, 131, 129, 132, 'x', '{', 137, 137, '2', GMTDateParser.DAY_OF_MONTH, 'j', GMTDateParser.SECONDS, 'r', 'a', '_', 'o', 'c', 'b', 'j', GMTDateParser.DAY_OF_MONTH, 'f', '_', 'e', 'l', 'l', '9', 'l', 'l', '^', 'V', 'i', 'n', 'a', 'c', 'o', '_', 'a', 'r', GMTDateParser.SECONDS, 'j', GMTDateParser.DAY_OF_MONTH, '2', GMTDateParser.DAY_OF_MONTH, 'j', GMTDateParser.SECONDS, 'r', 'a', '_', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'l', 'f', '6', '_', 'a', 'r', GMTDateParser.SECONDS, 'j', GMTDateParser.DAY_OF_MONTH, 'f', 'f', 'l', '\\', GMTDateParser.YEAR, 'i', 'S', 'R', 'i', 'k', '\\', 'c', 132, 273, 277, 278, 276, 259, 264, 281, 282, 273, 267, 254, 261, 280, 277, 273, 269, 275, 258, 257, 274, 'H', 143, 137, 132, 138, GMTDateParser.ZONE, '=', 145, 167, 167, 162, 162, 'o', 213, 207, 214, 213, 213, 198, 194, 216, 218, 217, 213, 206, 214, 197};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f212 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f215 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f214 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f216 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f213 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f211 = IronSourceNetworkBridge.jsonObjectInit();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m626() {
        int i = f205 + 43;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f204 = i2;
        int i3 = i % 2;
        List<String> list = this.f212;
        int i4 = i2 + 103;
        f205 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? '2' : 'N') == 'N') {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m621() {
        int i = f205 + 93;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f204 = i2;
        int i3 = i % 2;
        List<String> list = this.f215;
        int i4 = i2 + 95;
        f205 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 == 0) {
            throw null;
        }
        return list;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m607() {
        int i = f204;
        int i2 = i + 111;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        List<String> list = this.f214;
        int i4 = i + 59;
        f205 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? 'V' : '#') != 'V') {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> m616() {
        int i = f204 + 1;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return this.f216;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m610() {
        int i = f205 + 95;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return this.f213;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private hn m603() {
        int i = f204;
        int i2 = i + 79;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        hn hnVar = this.f210;
        int i4 = i + 107;
        f205 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? 'C' : '!') != 'C') {
            return hnVar;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private hn m605() {
        int i = f204;
        int i2 = i + 9;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        hn hnVar = this.f209;
        int i4 = i + 31;
        f205 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 == 0)) {
            return hnVar;
        }
        int i5 = 63 / 0;
        return hnVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m608(String str) {
        int i = f204 + 57;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m619(str, this.f212);
        int i3 = f204 + 17;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? '=' : 'G') == 'G') {
        } else {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m609(List<String> list) {
        int i = f204 + 19;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m613(list, this.f212);
        int i3 = f205 + 89;
        f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '!' : 'F') != 'F') {
            int i4 = 84 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m611(String str) {
        int i = f204 + 43;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m619(str, this.f215);
        int i3 = f204 + 11;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? (char) 18 : (char) 31) != 18) {
        } else {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m612(List<String> list) {
        int i = f204 + 77;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m613(list, this.f215);
        int i3 = f204 + 47;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m627(String str) {
        int i = f205 + 19;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 5 : 'D') != 5) {
            m619(str, this.f214);
        } else {
            m619(str, this.f214);
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m628(List<String> list) {
        int i = f205 + 29;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 29 : 'N') != 29) {
            m613(list, this.f214);
            return;
        }
        m613(list, this.f214);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m618(String str) {
        int i = f205 + 61;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m619(str, this.f216);
        int i3 = f204 + 9;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? (char) 7 : 'E') != 7) {
            return;
        }
        int i4 = 75 / 0;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m624(List<String> list) {
        int i = f205 + 3;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m613(list, this.f216);
        int i3 = f204 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m623(String str) {
        int i = f204 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m619(str, this.f213);
        int i3 = f204 + 63;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m620(List<String> list) {
        int i = f205 + 5;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m613(list, this.f213);
        int i3 = f204 + R.styleable.AppCompatTheme_windowActionBar;
        f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m622(hn hnVar) {
        if (hnVar != null) {
            int i = f205 + 39;
            f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            boolean z = i % 2 == 0;
            this.f210 = hnVar;
            if (!z) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        int i2 = f204 + 101;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m617(hn hnVar) {
        int i = f204 + 9;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f205 = i2;
        Object obj = null;
        if (!(i % 2 != 0)) {
            throw null;
        }
        if (hnVar != null) {
            int i3 = i2 + 53;
            f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i3 % 2 != 0 ? 'I' : (char) 22) == 'I') {
                this.f209 = hnVar;
                super.hashCode();
                throw null;
            }
            this.f209 = hnVar;
        }
        int i4 = i2 + 93;
        f204 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m601() {
        int i = f204 + 41;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return this.f211.optString(ik.丫);
        }
        this.f211.optString(ik.丫);
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m598(String str) throws JSONException {
        int i = f204 + 21;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            if (!(i % 2 == 0)) {
                this.f211.put(ik.丫, str);
                int i2 = f205 + R.styleable.AppCompatTheme_tooltipFrameBackground;
                f204 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                return;
            }
            this.f211.put(ik.丫, str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m597() {
        String strOptString;
        int i = f205 + 33;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'A' : (char) 27) != 27) {
            strOptString = this.f211.optString(ik.リ);
            int i2 = 70 / 0;
        } else {
            strOptString = this.f211.optString(ik.リ);
        }
        int i3 = f205 + 75;
        f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strOptString;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m602(String str) throws JSONException {
        int i = f205 + 25;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            this.f211.put(ik.リ, str);
            int i3 = f205 + 67;
            f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m599() {
        int i = f205 + 61;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'V' : 'G') != 'G') {
            this.f211.optString(ik.ゥ);
            throw null;
        }
        String strOptString = this.f211.optString(ik.ゥ);
        int i2 = f204 + 83;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return strOptString;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m604(String str) throws JSONException {
        int i = f204 + 21;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        try {
            if (i % 2 != 0) {
                this.f211.put(ik.ゥ, str);
                int i2 = f204 + 35;
                f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i2 % 2 == 0 ? 'G' : '6') == '6') {
                    return;
                } else {
                    throw null;
                }
            }
            this.f211.put(ik.ゥ, str);
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private String m593() {
        int i = f205 + 77;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strOptString = this.f211.optString(ik.ヮ);
        int i3 = f205 + 21;
        f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return strOptString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m600(String str) throws JSONException {
        int i = f204 + 31;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            if (!(i % 2 == 0)) {
                this.f211.put(ik.ヮ, str);
                return;
            }
            this.f211.put(ik.ヮ, str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private String m592() {
        int i = f204 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strOptString = this.f211.optString(ik.っ);
        int i3 = f205 + 97;
        f204 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strOptString;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m606(String str) throws JSONException {
        int i = f205 + 71;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            if ((i % 2 != 0 ? 'V' : '0') != 'V') {
                this.f211.put(ik.っ, str);
            } else {
                this.f211.put(ik.っ, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m591() {
        int i = f205 + 39;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 30 : (char) 28) != 30) {
            return this.f211;
        }
        int i2 = 26 / 0;
        return this.f211;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m614(JSONObject jSONObject) {
        int i = f204 + 31;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        this.f211 = kc.ｋ(jSONObject);
        if (z) {
            int i2 = 62 / 0;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m595(String str) throws JSONException {
        int i = f205 + 53;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        try {
            if ((i % 2 != 0 ? '#' : '?') == '?') {
                this.f211.put(ik.Ⅽ, str);
                int i2 = f205 + 101;
                f204 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i2 % 2 != 0 ? '7' : (char) 20) != '7') {
                    return;
                } else {
                    throw null;
                }
            }
            this.f211.put(ik.Ⅽ, str);
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String m594() {
        int i = f205 + 17;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 != 0) {
            this.f211.optString(ik.Ⅽ);
            throw null;
        }
        String strOptString = this.f211.optString(ik.Ⅽ);
        int i2 = f204 + R.styleable.AppCompatTheme_toolbarStyle;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m619(String str, List<String> list) {
        int i = f205 + 73;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            if ((list != null) && !TextUtils.isEmpty(str)) {
                int i2 = f205 + 91;
                f204 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                if (list.contains(str)) {
                    return;
                }
                list.add(str);
                return;
            }
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m613(List<String> list, List<String> list2) {
        int i = f205 + 67;
        f204 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            throw null;
        }
        if (!(list == null)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i2 = f205 + 81;
                f204 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i2 % 2 != 0) {
                    m619(it.next(), list2);
                    int i3 = 57 / 0;
                } else {
                    m619(it.next(), list2);
                }
            }
        }
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private Object m596() {
        int i = f204 + 55;
        f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            this.f212.size();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf((this.f212.size() <= 0 ? (char) 28 : 'b') != 28 || this.f215.size() > 0 || this.f213.size() > 0);
        int i2 = f204 + 107;
        f205 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private JSONObject m590() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if ((this.f210 != null ? '$' : GMTDateParser.ANY) == '$') {
                jSONObjectJsonObjectInit.put(ik.爫, this.f210.ﾇ());
            }
            if (this.f209 != null) {
                jSONObjectJsonObjectInit.put(ik.ヶ, this.f209.ﾇ());
            }
            if (this.f212.size() > 0) {
                jSONObjectJsonObjectInit.put(ik.丫, new JSONArray((Collection) this.f212));
                int i = f204 + 51;
                f205 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
            }
            if (this.f215.size() > 0) {
                jSONObjectJsonObjectInit.put(ik.ゥ, new JSONArray((Collection) this.f215));
            }
            if (this.f214.size() > 0) {
                jSONObjectJsonObjectInit.put(ik.っ, new JSONArray((Collection) this.f214));
            }
            if (this.f216.size() > 0) {
                jSONObjectJsonObjectInit.put(ik.ヮ, new JSONArray((Collection) this.f216));
            }
            if (this.f213.size() > 0) {
                jSONObjectJsonObjectInit.put(ik.リ, new JSONArray((Collection) this.f213));
            }
            if (this.f211.length() > 0) {
                jSONObjectJsonObjectInit.putOpt(ik.乁, this.f211.toString());
                int i3 = f204 + 99;
                f205 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo418(java.lang.String r19, java.util.List<java.lang.Object> r20, com.ironsource.adqualitysdk.sdk.i.ch r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dh.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m625(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f207;
            char c = f208;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                i.ﾒ = 0;
                while (i.ﾒ < i) {
                    i.ﾇ = cArr[i.ﾒ];
                    i.ﻛ = cArr[i.ﾒ + 1];
                    if (i.ﾇ == i.ﻛ) {
                        cArr3[i.ﾒ] = (char) (i.ﾇ - b);
                        cArr3[i.ﾒ + 1] = (char) (i.ﻛ - b);
                    } else {
                        i.ｋ = i.ﾇ / c;
                        i.ﱟ = i.ﾇ % c;
                        i.ﻐ = i.ﻛ / c;
                        i.ﮐ = i.ﻛ % c;
                        if (i.ﱟ == i.ﮐ) {
                            i.ｋ = ((i.ｋ + c) - 1) % c;
                            i.ﻐ = ((i.ﻐ + c) - 1) % c;
                            int i2 = (i.ｋ * c) + i.ﱟ;
                            int i3 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i2];
                            cArr3[i.ﾒ + 1] = cArr2[i3];
                        } else if (i.ｋ == i.ﻐ) {
                            i.ﱟ = ((i.ﱟ + c) - 1) % c;
                            i.ﮐ = ((i.ﮐ + c) - 1) % c;
                            int i4 = (i.ｋ * c) + i.ﱟ;
                            int i5 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i4];
                            cArr3[i.ﾒ + 1] = cArr2[i5];
                        } else {
                            int i6 = (i.ｋ * c) + i.ﮐ;
                            int i7 = (i.ﻐ * c) + i.ﱟ;
                            cArr3[i.ﾒ] = cArr2[i6];
                            cArr3[i.ﾒ + 1] = cArr2[i7];
                        }
                    }
                    i.ﾒ += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m615(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f206, i, cArr, 0, i2);
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
