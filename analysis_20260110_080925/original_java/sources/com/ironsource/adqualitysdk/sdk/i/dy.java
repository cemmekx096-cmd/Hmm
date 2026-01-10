package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dy {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f343 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f344 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f345 = {':'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f346 = -370601061070029443L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f347;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private e f348;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f349;

    public enum e {
        f359,
        f358,
        f361,
        f360,
        f357,
        f352,
        f355,
        f353;


        /* renamed from: ﭸ, reason: contains not printable characters */
        private static int f350 = 1;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f351;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f354;

        /* renamed from: ﾇ, reason: contains not printable characters */
        static void m754() {
            f354 = new char[]{')', 'P', 'S', 'X', 'O', 'H', 'G', 'B', 130, 128, 133, 141, 138, 131, 131, 131, 135, 140, 277, 276, 276, 275, 270, 271, 269, 141, 282, 276, 274, 273, 276, '#', 'F', 'K', GMTDateParser.MONTH, 'K', 'Q', 'L', '4', 'n', 'o', 'k', 'p', 'y', 129, 252, 248, 253, 258, 260, 253, 'b', 191, 195, 203, 194};
        }

        public static e valueOf(String str) {
            int i = f350 + 53;
            f351 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i3 = f351 + 97;
            f350 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return eVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArr;
            int i = f350 + 49;
            f351 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i % 2 == 0) {
                eVarArr = (e[]) values().clone();
            } else {
                eVarArr = (e[]) values().clone();
                int i2 = 37 / 0;
            }
            int i3 = f351 + 45;
            f350 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i3 % 2 != 0) {
                return eVarArr;
            }
            throw null;
        }

        static {
            m754();
            int i = f350 + 107;
            f351 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i % 2 != 0)) {
            } else {
                throw null;
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m753(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f354, i, cArr, 0, i2);
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

    public dy(e eVar, String str, int i) {
        this.f348 = eVar;
        this.f349 = str;
        this.f347 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final e m750() {
        int i = f343;
        int i2 = i + 105;
        f344 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        e eVar = this.f348;
        int i4 = i + 21;
        f344 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? (char) 14 : 'a') == 'a') {
            return eVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m752() {
        int i = f343;
        int i2 = i + 55;
        f344 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? ' ' : '$') == ' ') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f349;
        int i3 = i + 19;
        f344 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return str;
        }
        int i4 = 8 / 0;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m749() {
        int i = f344 + 53;
        f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return this.f347;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m748(String str) {
        int i = f344 + 5;
        f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        boolean zEquals = this.f349.equals(str);
        int i3 = f344 + 89;
        f343 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return zEquals;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m751() {
        int i = f343 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f344 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            m747();
            throw null;
        }
        if (m747()) {
            return true;
        }
        if ((!m742() ? 'c' : 'K') == 'K') {
            return true;
        }
        int i2 = f343 + 25;
        f344 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? '`' : 'Z') == 'Z') {
            return m746() || m745();
        }
        m746();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m747() {
        int i = f343 + 63;
        f344 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (m750() == e.f360) {
            return true;
        }
        int i3 = f343 + 49;
        f344 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m742() {
        int i = f343 + 75;
        f344 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if ((m750() == e.f357 ? (char) 5 : (char) 2) == 5) {
            int i3 = f343 + 15;
            f344 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return (i3 % 2 == 0 ? 'Q' : (char) 18) != 'Q';
        }
        int i4 = f344 + 47;
        f343 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return false;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m746() {
        if (!(m750() == e.f352)) {
            return false;
        }
        int i = f344 + 55;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f343 = i2;
        int i3 = i % 2;
        int i4 = i2 + 37;
        f344 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? 'F' : '#') == '#') {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m745() {
        int i = f343 + 53;
        f344 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (m750() != e.f355) {
            return false;
        }
        int i3 = f344 + 33;
        f343 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return !(i3 % 2 != 0);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m744() {
        if ((m750() == e.f361 ? GMTDateParser.ANY : 'L') != 'L') {
            int i = f344 + 35;
            f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return !(i % 2 != 0);
        }
        int i2 = f344 + 35;
        f343 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '\r' : ':') == ':') {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m743() {
        int i = f344 + 39;
        f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'H' : 'N') != 'N') {
            int i2 = 55 / 0;
            if ((m750() == e.f353 ? (char) 11 : (char) 20) != 20) {
                return true;
            }
        } else {
            if ((m750() == e.f353 ? 'T' : '\f') != '\f') {
                return true;
            }
        }
        int i3 = f343 + 71;
        f344 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final boolean m740() {
        if (m750() != e.f358) {
            int i = f344 + 17;
            f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return false;
        }
        int i3 = f344 + 13;
        f343 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? 'U' : 'O') == 'O') {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m741() {
        int i = f343 + 63;
        f344 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if ((m750() == e.f359 ? '5' : (char) 28) == '5') {
            int i3 = f343 + 43;
            f344 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return (i3 % 2 == 0 ? '9' : (char) 1) != '9';
        }
        int i4 = f344 + 9;
        f343 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        String string = new StringBuilder().append(this.f348).append(m739((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern()).append(this.f349).toString();
        int i = f344 + 87;
        f343 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '<' : ':') != '<') {
            return string;
        }
        int i2 = 21 / 0;
        return string;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m739(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f345[a.ｋ + i2] ^ (a.ｋ * f346)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
