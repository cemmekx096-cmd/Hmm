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

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class dg extends cz implements ck {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f190 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f191 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f199;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f200;

    /* renamed from: ｋ, reason: contains not printable characters */
    private hi f201;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f203;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f195 = {'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 'g', 35557, 5492, 40902, 10857, 46318, 16225, 51692, 21589, 57074, 26988, 'a', 35556, 5476, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 7635, 43119, 13045, 48498, 18403, 53861, 43865, 8655, 48734, 13548, 33091, 8132, 37963, 25286, 65407, 30168, 49734, 22777, 54597, 41951, 14424, 46793, 847, GMTDateParser.SECONDS, 35557, 5492, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 32339, 2287, 37749, 7666, 43107, 13029, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2259, 37743, 7669, 43122, 13027, 48485, 18378, 53875, 23791, 59246, 61044, 25839, 64330, 29171, 50287, 23278};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f196 = -3052281562068317568L;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f192 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f193 = true;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f197 = 27;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f194 = {142, 128, 143, '\\', 127, 145, 141, 132, GMTDateParser.DAY_OF_MONTH, 130, 'o', 148, 139, '_', 'p', 135, 'a', 137, '|', 'n', 138, 144, '~', 131, 129};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final JSONObject f202 = IronSourceNetworkBridge.jsonObjectInit();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f198 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m576() {
        int i = f191 + R.styleable.AppCompatTheme_toolbarStyle;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f190 = i2;
        int i3 = i % 2;
        String str = this.f200;
        int i4 = i2 + 15;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m581(String str) {
        int i = f190;
        int i2 = i + 31;
        f191 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f200 = str;
        int i4 = i + R.styleable.AppCompatTheme_toolbarStyle;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? ';' : 'N') != 'N') {
            int i5 = 34 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private hi m584() {
        int i = f190;
        int i2 = i + R.styleable.AppCompatTheme_toolbarStyle;
        f191 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        hi hiVar = this.f201;
        int i4 = i + 103;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            return hiVar;
        }
        int i5 = 99 / 0;
        return hiVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m588(hi hiVar) {
        int i = f191 + 85;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        this.f201 = hiVar;
        if (z) {
        } else {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m580() {
        int i = f190 + 33;
        f191 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return this.f199;
        }
        int i2 = 79 / 0;
        return this.f199;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m585(String str) {
        int i = f191 + 5;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f190 = i2;
        char c = i % 2 != 0 ? '&' : 'K';
        this.f199 = str;
        if (c == '&') {
            int i3 = 3 / 0;
        }
        int i4 = i2 + 25;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m582() {
        int i = f191 + 71;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f190 = i2;
        int i3 = i % 2;
        String str = this.f203;
        int i4 = i2 + 7;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? ' ' : '=') != ' ') {
            return str;
        }
        int i5 = 29 / 0;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m589(String str) {
        int i = f191 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? '^' : (char) 6;
        this.f203 = str;
        if (c == 6) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m587() {
        int i = f190 + 1;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f191 = i2;
        int i3 = i % 2;
        List<String> list = this.f198;
        int i4 = i2 + 49;
        f190 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? (char) 3 : 'Z') == 'Z') {
            return list;
        }
        int i5 = 31 / 0;
        return list;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m583(String str) {
        int i = f191 + R.styleable.AppCompatTheme_toolbarStyle;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            if (TextUtils.isEmpty(str) || this.f198.contains(str)) {
                return;
            }
            this.f198.add(str);
            int i2 = f191 + 99;
            f190 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return;
        }
        TextUtils.isEmpty(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m579(List<String> list) {
        Iterator<String> it = list.iterator();
        int i = f191 + 47;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        while (true) {
            int i2 = i % 2;
            if (!it.hasNext()) {
                return;
            }
            int i3 = f191 + 77;
            f190 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i3 % 2 != 0) {
                m583(it.next());
                throw null;
            }
            m583(it.next());
            i = f191 + R.styleable.AppCompatTheme_tooltipFrameBackground;
            f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m570() {
        int i = f191 + 17;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strOptString = this.f202.optString(ik.ﭴ);
        int i3 = f190 + 45;
        f191 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return strOptString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m578(String str) throws JSONException {
        int i = f190 + 55;
        f191 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            if (i % 2 == 0) {
                this.f202.put(ik.ﭴ, str);
                int i2 = 77 / 0;
            } else {
                this.f202.put(ik.ﭴ, str);
            }
            int i3 = f190 + 91;
            f191 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i3 % 2 == 0 ? (char) 20 : 'E') != 20) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m574() {
        int i = f191 + 11;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return this.f202.optString(ik.ﬤ);
        }
        this.f202.optString(ik.ﬤ);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m571(String str) throws JSONException {
        int i = f191 + 57;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            this.f202.put(ik.ﬤ, str);
            int i3 = f191 + 53;
            f190 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Object m569() {
        int i = f191 + 1;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strOptString = this.f202.optString(ik.ףּ);
        int i3 = f191 + 51;
        f190 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m575(String str) throws JSONException {
        int i = f190 + 103;
        f191 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            this.f202.put(ik.ףּ, str);
            int i3 = f190 + 45;
            f191 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m572() {
        int i = f190 + 11;
        f191 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strOptString = this.f202.optString(ik.丫);
        int i3 = f190 + 33;
        f191 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? '7' : (char) 3) == 3) {
            return strOptString;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m573(String str) throws JSONException {
        int i = f191 + 17;
        f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            this.f202.put(ik.丫, str);
            int i3 = f191 + 73;
            f190 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private JSONObject m568() {
        int i = f191 + 109;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f190 = i2;
        int i3 = i % 2;
        JSONObject jSONObject = this.f202;
        int i4 = i2 + 37;
        f191 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* renamed from: ﭴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m567() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f200
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            int r0 = com.ironsource.adqualitysdk.sdk.i.dg.f191
            int r0 = r0 + 57
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f190 = r3
            int r0 = r0 % 2
            java.lang.String r0 = r4.f199
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == r2) goto L62
            java.lang.String r0 = r4.f203
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 61
            if (r0 == 0) goto L2e
            r0 = 96
            goto L2f
        L2e:
            r0 = r3
        L2f:
            if (r0 == r3) goto L62
            int r0 = com.ironsource.adqualitysdk.sdk.i.dg.f190
            int r0 = r0 + 31
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f191 = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L56
            java.util.List<java.lang.String> r0 = r4.f198
            int r0 = r0.size()
            if (r0 <= 0) goto L47
            r0 = r1
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == r2) goto L4b
            goto L62
        L4b:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dg.f191
            int r0 = r0 + 37
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f190 = r2
            int r0 = r0 % 2
            goto L63
        L56:
            java.util.List<java.lang.String> r0 = r4.f198
            r0.size()
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            throw r0
        L62:
            r1 = r2
        L63:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.m567():java.lang.Object");
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m566() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if ((this.f200 != null ? '(' : '@') == '(') {
                int i = f191 + 29;
                f190 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                if ((this.f201 != null ? (char) 15 : ',') != ',') {
                    jSONObjectJsonObjectInit.putOpt(ik.ﭴ, this.f200);
                    jSONObjectJsonObjectInit.putOpt(ik.ﭸ, Integer.valueOf(this.f201.ﻐ()));
                    int i3 = f191 + 79;
                    f190 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i4 = i3 % 2;
                }
            }
            jSONObjectJsonObjectInit.putOpt(ik.ﬤ, this.f199);
            jSONObjectJsonObjectInit.putOpt(ik.ףּ, this.f203);
            if (this.f198.size() > 0) {
                jSONObjectJsonObjectInit.putOpt(ik.丫, new JSONArray((Collection) this.f198));
            }
            if (this.f202.length() > 0) {
                jSONObjectJsonObjectInit.putOpt(ik.ﭖ, this.f202.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0151, code lost:
    
        if (r20.equals(m577(null, null, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "\u0090\u0087\u008f\u0083\u0081\u0082\u008e\u0083\u0082\u0081").intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f5, code lost:
    
        if (r20.equals(m577(null, null, android.view.KeyEvent.keyCodeFromString(com.crashlytics.android.BuildConfig.FLAVOR) + 127, "\u0082\u008d\u008c\u008b\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern()) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033e A[PHI: r6
      0x033e: PHI (r6v8 char) = (r6v1 char), (r6v2 char), (r6v0 char), (r6v9 char) binds: [B:96:0x033a, B:93:0x0319, B:69:0x0238, B:4:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo418(java.lang.String r20, java.util.List<java.lang.Object> r21, com.ironsource.adqualitysdk.sdk.i.ch r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m586(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f195[a.ｋ + i2] ^ (a.ｋ * f196)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m577(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f194;
            int i2 = f197;
            if (f193) {
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
            if (f192) {
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
