package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class di extends cz implements ck {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f217 = 1;

    /* renamed from: טּ, reason: contains not printable characters */
    private static boolean f218 = true;

    /* renamed from: סּ, reason: contains not printable characters */
    private static int f219 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f222 = 129;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f223 = true;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private String f224;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private String f225;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f226;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String f227;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f228;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String f229;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f230;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f231;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f232;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f233;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f234;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f235;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f221 = {244, 230, 245, 194, 229, 202, 232, 196, 226, 238, 241, 234, 239, 213, 250, 243, 247, 200, 240, 246, 197, 195, 209, 228};

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int[] f220 = {397840558, -848912179, -1161627843, -1440092716, 101894395, 1037589517, 946665512, -1717674113, -1294099560, 1802945914, 1337466841, 1785425051, -235973602, -422241588, 512745907, 959406423, -651906807, -29446400};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m653(String str) {
        int i = f217 + 41;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f219 = i2;
        int i3 = i % 2;
        this.f232 = str;
        int i4 = i2 + 1;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? '\"' : '2') != '\"') {
        } else {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m651() {
        int i = f217 + 11;
        f219 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? GMTDateParser.YEAR : 'P') == 'P') {
            return this.f232;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m650(String str) {
        int i = f217;
        int i2 = i + R.styleable.AppCompatTheme_toolbarStyle;
        f219 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f234 = str;
        int i4 = i + 85;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? (char) 6 : 'K') == 'K') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m654() {
        int i = f217 + 67;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f219 = i2;
        int i3 = i % 2;
        String str = this.f234;
        int i4 = i2 + 55;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m655(String str) {
        int i = f217 + 93;
        f219 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        this.f235 = str;
        if (!z) {
            return;
        }
        int i2 = 53 / 0;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m649() {
        int i = f219;
        int i2 = i + 33;
        f217 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f235;
        int i4 = i + 21;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m646(String str) {
        int i = f217;
        int i2 = i + 55;
        f219 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f231 = str;
        int i4 = i + 61;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Object m644() {
        int i = f217;
        int i2 = i + 73;
        f219 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f231;
        int i4 = i + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m648(String str) {
        int i = f217 + 9;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f219 = i2;
        boolean z = i % 2 == 0;
        Object obj = null;
        this.f233 = str;
        if (!z) {
            throw null;
        }
        int i3 = i2 + 21;
        f217 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m647() {
        int i = f219;
        int i2 = i + 1;
        f217 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f233;
        int i4 = i + 11;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? 'K' : ' ') == ' ') {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m641(String str) {
        int i = f219 + 71;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f217 = i2;
        int i3 = i % 2;
        this.f226 = str;
        int i4 = i2 + 57;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m642() {
        int i = f219 + 85;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f217 = i2;
        int i3 = i % 2;
        String str = this.f226;
        int i4 = i2 + 75;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 != 0)) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m635(String str) {
        int i = f217 + 61;
        f219 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? '[' : '\r';
        this.f230 = str;
        if (c != '\r') {
            int i2 = 33 / 0;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m636() {
        int i = f219;
        int i2 = i + 81;
        f217 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f230;
        int i4 = i + 89;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m637(String str) {
        int i = f219 + 45;
        f217 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        this.f227 = str;
        if (!z) {
            return;
        }
        int i2 = 21 / 0;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m634() {
        int i = f219 + 99;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f217 = i2;
        int i3 = i % 2;
        String str = this.f227;
        int i4 = i2 + 73;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m639(String str) {
        int i = f217 + 109;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f219 = i2;
        int i3 = i % 2;
        this.f228 = str;
        int i4 = i2 + 101;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? '\n' : '<') == '<') {
        } else {
            throw null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m640() {
        int i = f219;
        int i2 = i + 3;
        f217 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? (char) 6 : '5') != '5') {
            throw null;
        }
        String str = this.f228;
        int i3 = i + 85;
        f217 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m643(String str) {
        int i = f217 + 11;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f219 = i2;
        int i3 = i % 2;
        this.f229 = str;
        int i4 = i2 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f217 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m638() {
        int i = f219 + 15;
        f217 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return this.f229;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m631(String str) {
        int i = f217 + 31;
        f219 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? '4' : '@';
        this.f225 = str;
        if (c == '@') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Object m630() {
        int i = f219 + 49;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f217 = i2;
        int i3 = i % 2;
        String str = this.f225;
        int i4 = i2 + 37;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? (char) 23 : 'Z') != 23) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m633(String str) {
        int i = f219 + 21;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f217 = i2;
        int i3 = i % 2;
        this.f224 = str;
        int i4 = i2 + 63;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private Object m629() {
        String str;
        int i = f217;
        int i2 = i + 73;
        f219 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            str = this.f224;
        } else {
            str = this.f224;
            int i3 = 56 / 0;
        }
        int i4 = i + 63;
        f219 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private JSONObject m632() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.putOpt(ik.K, this.f232);
            jSONObjectJsonObjectInit.putOpt(ik.Ↄ, this.f234);
            jSONObjectJsonObjectInit.putOpt(ik.ト, this.f235);
            jSONObjectJsonObjectInit.putOpt(ik.へ, this.f233);
            jSONObjectJsonObjectInit.putOpt(ik.く, this.f226);
            jSONObjectJsonObjectInit.putOpt(ik.Ύ, this.f230);
            jSONObjectJsonObjectInit.putOpt(ik.Ⅽ, this.f227);
            jSONObjectJsonObjectInit.putOpt(ik.Ὺ, this.f228);
            jSONObjectJsonObjectInit.putOpt(ik.Ῠ, this.f229);
            int i = f217 + 37;
            f219 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234 A[PHI: r5
      0x0234: PHI (r5v8 char) = (r5v0 char), (r5v9 char) binds: [B:120:0x0374, B:75:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo418(java.lang.String r19, java.util.List<java.lang.Object> r20, com.ironsource.adqualitysdk.sdk.i.ch r21) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m645(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f221;
            int i2 = f222;
            if (f218) {
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
            if (f223) {
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m652(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f220.clone();
            d.ﻛ = 0;
            while (d.ﻛ < iArr.length) {
                cArr[0] = (char) (iArr[d.ﻛ] >> 16);
                cArr[1] = (char) iArr[d.ﻛ];
                cArr[2] = (char) (iArr[d.ﻛ + 1] >> 16);
                cArr[3] = (char) iArr[d.ﻛ + 1];
                d.ﾒ = (cArr[0] << 16) + cArr[1];
                d.ｋ = (cArr[2] << 16) + cArr[3];
                d.ﾒ(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = d.ﾒ ^ iArr2[i2];
                    d.ﾒ = i3;
                    d.ｋ = d.ｋ(i3) ^ d.ｋ;
                    int i4 = d.ﾒ;
                    d.ﾒ = d.ｋ;
                    d.ｋ = i4;
                }
                int i5 = d.ﾒ;
                d.ﾒ = d.ｋ;
                d.ｋ = i5;
                d.ｋ = i5 ^ iArr2[16];
                d.ﾒ ^= iArr2[17];
                int i6 = d.ﾒ;
                int i7 = d.ｋ;
                cArr[0] = (char) (d.ﾒ >>> 16);
                cArr[1] = (char) d.ﾒ;
                cArr[2] = (char) (d.ｋ >>> 16);
                cArr[3] = (char) d.ｋ;
                d.ﾒ(iArr2);
                cArr2[d.ﻛ << 1] = cArr[0];
                cArr2[(d.ﻛ << 1) + 1] = cArr[1];
                cArr2[(d.ﻛ << 1) + 2] = cArr[2];
                cArr2[(d.ﻛ << 1) + 3] = cArr[3];
                d.ﻛ += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
