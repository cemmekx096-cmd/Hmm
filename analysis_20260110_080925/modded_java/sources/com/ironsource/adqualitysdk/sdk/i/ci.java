package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ci extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f90 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f91 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f92 = 6;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f93 = {'A', GMTDateParser.DAY_OF_MONTH, GMTDateParser.SECONDS, 'e', 't', 'P', 'a', 'y', 'l', 'o', 'p', 'N', 'B', 'n', 'r', 'L', 'i', 'c', GMTDateParser.MINUTES, '.', 'v', 'u', 'g', 'V', 'w', 'C', GMTDateParser.HOURS, 'b', 'R', 'F', 'I', 'U', 'T', 'S', 'D', 'E'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f94 = -8851093706496144865L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m391(AdPayload.AdUnit adUnit) {
        int i = f90 + 11;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM397 = m397(adUnit);
        int i3 = f90 + 13;
        f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return strM397;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m392(Placement placement) {
        int i = f90 + 41;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM399 = m399(placement);
        int i3 = f91 + 35;
        f90 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM399;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.TemplateSettings m393(AdPayload.AdUnit adUnit) {
        int i = f91 + 73;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        AdPayload.TemplateSettings templateSettingsM400 = m400(adUnit);
        int i3 = f90 + 61;
        f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return templateSettingsM400;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m394(AppNode appNode) {
        int i = f90 + 73;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM403 = m403(appNode);
        int i3 = f90 + 41;
        f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM403;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m402(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = f90 + 51;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        String strM398 = m398(cacheableReplacement);
        if (z) {
            int i2 = 41 / 0;
        }
        int i3 = f90 + 15;
        f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM398;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m404(Placement placement) {
        int i = f90 + 73;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 15 : 'U') == 'U') {
            return m406(placement);
        }
        m406(placement);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.AdUnit m405(AdPayload adPayload) {
        int i = f90 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 16 : (char) 21) != 16) {
            return m396(adPayload);
        }
        m396(adPayload);
        throw null;
    }

    public ci(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final String m410() {
        int i = f90 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            return !(i % 2 != 0) ? ﾇ().split(m395("쇓馿乕壪쇾", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())[0] : ﾇ().split(m395("쇓馿乕壪쇾", (ViewConfiguration.getWindowTouchSlop() / 71) + 1).intern())[1];
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m409() {
        int i = f91 + 31;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        try {
            String str = hr.ﻛ().ﾒ().ｋ(BuildConfig.class, m395("塊䎥鈒誔堔䧦虈钒灪煚꺆찐࢙ᣮ\uf740\ue5ef℔쀒", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            int i3 = f90 + 43;
            f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ed A[PHI: r3
      0x02ed: PHI (r3v4 char) = (r3v0 char), (r3v3 char), (r3v5 char) binds: [B:120:0x03cc, B:94:0x0308, B:91:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m408(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ci.m408(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m407() {
        HashMap map = new HashMap();
        map.put(m401((byte) (120 - TextUtils.indexOf(com.crashlytics.android.BuildConfig.FLAVOR, com.crashlytics.android.BuildConfig.FLAVOR, 0)), "\u0015\u0004\u0005\u0001\u0007\u0001\u000e\u0011ì", (KeyEvent.getMaxKeyCode() >> 16) + 9).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m412(List<Object> list, ch chVar) {
                return ci.m405((AdPayload) list.get(0));
            }
        });
        map.put(m395("\ue4cfኮ첈烹\ue4a8ᣔ\ud8c2滥쳃⁅\uf07b㙄", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.4
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m414(List<Object> list, ch chVar) {
                return ci.m394((AppNode) list.get(0));
            }
        });
        map.put(m401((byte) (MotionEvent.axisFromString(com.crashlytics.android.BuildConfig.FLAVOR) + 67), "\u0015\u0004\u0001\u001c\u000b\f\u001b\u0002\t\u0018\t\u0002\u001b\u0004\u000b\t\u000b\f\u0000\u0015\u0001\u000f\u0001\"\u0014\u000e", TextUtils.getTrimmedLength(com.crashlytics.android.BuildConfig.FLAVOR) + 26).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m415(List<Object> list, ch chVar) {
                return ci.m402((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m395("⢃呆郙쏾⣤帼蒓\udde0\u009e暰갓蕆砒༶\uf581", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.3
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m413(List<Object> list, ch chVar) {
                return ci.m391((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m401((byte) (44 - TextUtils.indexOf((CharSequence) com.crashlytics.android.BuildConfig.FLAVOR, '0', 0)), "\u0015\u0004\u0005\u0000\t\u0007\u000f\u0005\u0015\u0000\u0010\u0001\u001f\u0000", TextUtils.getOffsetAfter(com.crashlytics.android.BuildConfig.FLAVOR, 0) + 14).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m411(List<Object> list, ch chVar) {
                return ci.m392((Placement) list.get(0));
            }
        });
        map.put(m401((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + R.styleable.AppCompatTheme_windowActionModeOverlay), "\u0015\u0004\u0002\"\u0000\u0015\u000b\t\n\u0000\t\u0003\u0004\u0005\n\u0016\u0010\u0013ê", 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.6
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m416(List<Object> list, ch chVar) {
                return ci.m393((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m401((byte) (112 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u000e\u0004\u001b\u0004\u001e\f\r\u0002\u0004\u0002\u0016\u0011\u0002\u0004ß", (ViewConfiguration.getWindowTouchSlop() >> 8) + 15).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.9
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m417(List<Object> list, ch chVar) {
                return Boolean.valueOf(ci.m404((Placement) list.get(0)));
            }
        });
        int i = f90 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'a' : (char) 30) != 'a') {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static AdPayload.AdUnit m396(AdPayload adPayload) {
        int i = f91 + 7;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        int i3 = f90 + 93;
        f91 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return adUnit;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m403(AppNode appNode) {
        int i = f90 + 81;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? (char) 14 : 'P';
        String appId = appNode.getAppId();
        if (c == 14) {
            int i2 = 49 / 0;
        }
        return appId;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m398(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = f91 + 51;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        String url = cacheableReplacement.getUrl();
        if (z) {
            int i2 = 49 / 0;
        }
        return url;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m397(AdPayload.AdUnit adUnit) {
        int i = f91 + 109;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 == 0) {
            adUnit.getCampaign();
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        String campaign = adUnit.getCampaign();
        int i2 = f90 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f91 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '!' : 'F') == 'F') {
            return campaign;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m399(Placement placement) {
        int i = f91 + 11;
        f90 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String referenceId = placement.getReferenceId();
        int i3 = f91 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f90 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return referenceId;
        }
        int i4 = 80 / 0;
        return referenceId;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m400(AdPayload.AdUnit adUnit) {
        int i = f90 + 53;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return adUnit.getTemplateSettings();
        }
        adUnit.getTemplateSettings();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m406(Placement placement) {
        int i = f90 + 1;
        f91 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        Object obj = null;
        if (!z) {
            placement.isRewardedVideo();
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i2 = f90 + 103;
        f91 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '`' : ';') == ';') {
            return zIsRewardedVideo;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m395(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f94, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f94));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m401(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f93;
            char c = f92;
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
}
