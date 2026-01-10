package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class dk extends cz implements ck {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f236 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f237 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f244;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f246;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f247;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f239 = {'f', 53865, 42068, 30264, 18435, 6895, 60634, 48801, 36997, 25234, '.', 17597, 38563, 57494, 13005, 3269, 24120, 43036, 64123, 54361, 9810, 29101, 17308, 40388, 61399, 14655, 2843, GMTDateParser.SECONDS, 53881, 42060, 30233, 18453, 6888, 60609, 48805, 37012, 25241, 13692, 1914, 55605, 43800, 32255, 20427, 8626, 62391, 50614, 39029, 27229, 15401, 28972, 41778, 54535, 1874, 14686, 27555, 40330, 53230, 57823, 5074, 17463, 30257, 43134, 55891, 3252, 16000, 20729, 33532, 46333, 59710, 6934, 19810, 37087, 17109, 13536, 59065, 55480, 35442, 31841, 11806, ')', 62014, 42433, 38909, 30172, 42946, 53751, 942, 15791, 28517, 39286, 51977, 58686, 5929, 16598, 29418, 21727, 34517, 61664, 8872, 7344, 20033, 47207, 59917, 50209, 13877, 25050, 21484, 36277, 65444, 'g', 53881, 42060, 30212, 18460, 6893, 60619, 48801, 37005, 25241, 13686, 1856, 55577, 43784, GMTDateParser.SECONDS, 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30230, 18434, 6883, 60617, 48800, 36995, 25245, 13675, 1856, 55573, 43802, 32237, 20426, 8628, 62354, 50585, 39033, 27221, 't', 53875, 42098, 30247, 18463, 6882};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f241 = -4450221366886739428L;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f242 = -920228695133017383L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f240 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f238 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f245 = BuildConfig.FLAVOR;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private double f248 = -1.0d;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean f243 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m670(String str) {
        int i = f237 + 101;
        f236 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        this.f246 = str;
        if (z) {
            int i2 = 65 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m659() {
        int i = f237 + 63;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f236 = i2;
        int i3 = i % 2;
        String str = this.f246;
        int i4 = i2 + 59;
        f237 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? (char) 11 : (char) 18) == 18) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m662(String str) {
        int i = f237 + 97;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f236 = i2;
        boolean z = i % 2 == 0;
        this.f245 = str;
        if (!z) {
            throw null;
        }
        int i3 = i2 + 103;
        f237 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m660() {
        int i = f237 + 101;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f236 = i2;
        int i3 = i % 2;
        String str = this.f245;
        int i4 = i2 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f237 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m669(Double d) {
        int i = f237 + 79;
        f236 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.f248 = d.doubleValue();
        int i3 = f236 + 3;
        f237 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Double m664() {
        int i = f236 + 95;
        f237 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Double dValueOf = Double.valueOf(this.f248);
        int i3 = f237 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f236 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return dValueOf;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m661(boolean z) {
        int i = f237;
        int i2 = i + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f236 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f244 = z;
        int i4 = i + 83;
        f236 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? 'c' : '^') != 'c') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m671(boolean z) {
        int i = f236;
        int i2 = i + 67;
        f237 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f243 = z;
        int i4 = i + 27;
        f237 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean m663() {
        int i = f236 + 79;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f237 = i2;
        Object obj = null;
        if ((i % 2 == 0 ? 'C' : (char) 31) == 'C') {
            super.hashCode();
            throw null;
        }
        boolean z = this.f243;
        int i3 = i2 + 71;
        f236 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 23 : '/') != 23) {
            return z;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean m656() {
        int i = f236 + 77;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f237 = i2;
        Object obj = null;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.f244;
        int i3 = i2 + 21;
        f236 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return z;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m667(String str) {
        int i = f236 + 3;
        f237 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? '\t' : 'E';
        this.f247 = str;
        if (c == 'E') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m658() {
        int i = f237;
        int i2 = i + 87;
        f236 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f247;
        int i4 = i + 77;
        f236 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 != 0)) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m657() {
        String strIntern;
        int i = f237 + 33;
        f236 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (!(m656())) {
            strIntern = m665((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13623), "ぽ㢽㜂팵", "ƫ婣\uf501ꈭꉓ礈", "\uaad9驹냠\uf33a").intern();
        } else {
            int i3 = f237 + 65;
            f236 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            strIntern = m666(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, (char) (Process.myPid() >> 22)).intern();
        }
        return new StringBuilder().append(m665(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), "쁡ᣳ嘵ி", "坍ᡧ鸆\uda2e뼶昵㠘䗯Țם", "\uaad9驹냠\uf33a").intern()).append(this.f245).append(m666((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)).intern()).append(strIntern).toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m668() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit2.put(ik.ﾇ, this.f246);
            if (!(this.f248 <= -1.0d)) {
                int i = f236 + 53;
                f237 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i % 2 == 0 ? ')' : (char) 7) == ')') {
                    jSONObjectJsonObjectInit2.put(ik.ᕂ, this.f248);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                jSONObjectJsonObjectInit2.put(ik.ᕂ, this.f248);
            }
            jSONObjectJsonObjectInit2.put(ik.ᕆ, this.f247);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObjectJsonObjectInit2.length() > 0) {
                if ((this.f243 ? '&' : '\'') == '&') {
                    int i2 = f236 + 51;
                    f237 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if (i2 % 2 == 0) {
                        jSONObjectJsonObjectInit2.put(ik.ᖅ, false);
                    } else {
                        jSONObjectJsonObjectInit2.put(ik.ᖅ, true);
                    }
                }
                jSONObjectJsonObjectInit.put(ik.ᕄ, jSONObjectJsonObjectInit2);
            }
            int i3 = f236 + 53;
            f237 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } catch (JSONException unused2) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo418(java.lang.String r18, java.util.List<java.lang.Object> r19, com.ironsource.adqualitysdk.sdk.i.ch r20) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m666(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f239[a.ｋ + i2] ^ (a.ｋ * f241)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m665(int i, char c, String str, String str2, String str3) {
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
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f242) ^ f240) ^ f238);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
