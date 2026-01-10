package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import io.ktor.util.date.GMTDateParser;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cb extends bg {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f7 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f8;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f13 = {':', 'n', 'e', 'f', 'V', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'q', 'l', 'N', 'O', 'q', 'k', 'l', 'j', GMTDateParser.DAY_OF_MONTH, 'f', 'I', 'K', 'k', 'q', 'l', 'k', 'r', GMTDateParser.SECONDS, 'n', 'n', 'n', 'e', 'f', GMTDateParser.MONTH, ';', '[', 'q', 'l', 'k', 'r', GMTDateParser.SECONDS, 'n', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', GMTDateParser.SECONDS, 'r', 'k', 'l', 'q', '[', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', GMTDateParser.SECONDS, 'r', 'k', 'l', 'q', '[', GMTDateParser.YEAR, '_', '0', 'j', 'l', 'k', 'a', 'Z', 'f', ')', '\\', 'f', GMTDateParser.DAY_OF_MONTH, 'j', 'l', 'k', 'a', ']', 'g', '7', GMTDateParser.YEAR, 'S', 'R', 'T', GMTDateParser.HOURS, 'g', 'j', '9', GMTDateParser.SECONDS, 'j', 'g', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, 'f', 'f', 'l', 'b', 'a', 'k', 'l', 'j', GMTDateParser.DAY_OF_MONTH, 'f', 'W', '[', '5', 'o', 'l', 'l', '^', '[', 'q', 'l', 'k', 'r', GMTDateParser.SECONDS, 'n', 'n', 'n', 'e', 'f', 'W', 'R', 'f', 'l', 'g', 'a', 'b', '9', 'l', 'l', 'a', '_', 'r', 'n', 'k', 'b', '_', 'f', GMTDateParser.DAY_OF_MONTH, 'j', GMTDateParser.YEAR, 'R', 'f', 'l', 'g', 'a', 'b', 'g', '0'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f9 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f11 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f12 = 97;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f10 = {202, 208, 143, 209, 211, 198, 212, 194, 200, 207, 213, 205, 214, 170, 162, 196, 215, 218, 176, 177, 164, 195, 204, 183, 197, 179, 216, 206, 142, 199, 201, 165, 174};

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Presage m254() {
        int i = f8 + 65;
        f7 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'W' : '6') == '6') {
            return m255();
        }
        m255();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m259(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = f8 + 99;
        f7 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m257(presageInterstitial, presageInterstitialCallback);
        int i3 = f8 + 83;
        f7 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m261(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = f7 + 9;
        f8 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? (char) 24 : '\t';
        m260(presageOptinVideo, presageOptinVideoCallback);
        if (c != '\t') {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        int i2 = f7 + 27;
        f8 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? 'L' : (char) 23) != 23) {
            int i3 = 46 / 0;
        }
    }

    public cb(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m263(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cb.m263(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m262() {
        HashMap map = new HashMap();
        map.put(m256(false, new int[]{111, 18, 0, 6}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m266(List<Object> list, ch chVar) {
                return cb.m254();
            }
        });
        map.put(m256(false, new int[]{129, 23, 0, 1}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m267(List<Object> list, ch chVar) {
                cb.m259((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m256(false, new int[]{152, 21, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m268(List<Object> list, ch chVar) {
                cb.m261((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i = f8 + R.styleable.AppCompatTheme_windowActionBar;
        f7 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? (char) 21 : '<') == '<') {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m265() {
        int i = f7 + 77;
        f8 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String str = ﾇ();
        if ((str != null ? '_' : (char) 14) == 14) {
            return null;
        }
        int i3 = f8 + 39;
        f7 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return (i3 % 2 == 0 ? 'B' : 'O') != 'O' ? str.split(m258(null, null, (-16777089) >> Color.rgb(0, 1, 1), "\u009d").intern())[0] : str.split(m258(null, null, (-16777089) - Color.rgb(0, 0, 0), "\u009d").intern())[0];
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m264() {
        int i = f8 + 7;
        f7 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            try {
                String str = (String) Class.forName(m258(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + R.styleable.AppCompatTheme_windowNoTitle, "\u0085\u0093\u0099\u008b\u008a\u0082¡\u0087\u0096\u008d\u0082 \u008b\u008d\u0088\u009f\u008d\u0099\u008a\u0081\u0085\u0086\u009f\u0090\u0088\u0098\u0083\u009e\u0081\u0083\u008a\u0082\u009c\u009c\u0082\u0090\u0083\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()).getMethod(m256(false, new int[]{173, 1, 0, 1}, "\u0001").intern(), new Class[0]).invoke(null, new Object[0]);
                int i3 = f8 + 51;
                f7 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                return str;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Presage m255() {
        int i = f8 + 51;
        f7 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '8' : '&') != '&') {
            Presage.getInstance();
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        Presage presage = Presage.getInstance();
        int i2 = f7 + R.styleable.AppCompatTheme_windowActionBar;
        f8 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return presage;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m257(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = f7 + 95;
        f8 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        int i3 = f8 + 61;
        f7 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m260(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = f7 + 99;
        f8 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (!z) {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        int i2 = f7 + 61;
        f8 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m256(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f13, i, cArr, 0, i2);
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m258(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f10;
            int i2 = f12;
            if (f11) {
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
            if (f9) {
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
