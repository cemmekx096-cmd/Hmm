package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class cg extends bg {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f77 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f78 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f79 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f81 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f83 = 108;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f82 = {179, 176, 192, 173, 208, 191, 215, 207, 219, 217, 154, 221, 209, 205, 223, 224, 213, 226, 229, 184, 218, 220, 190, 227, 222, 188, 193, 210, 181, 216, 194, 174, 225, 211, 185, 177, 228};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f80 = -1208578363341381770L;

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ IGDTAdManager m368() {
        int i = f78 + 107;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 == 0) {
            m367();
            throw null;
        }
        IGDTAdManager iGDTAdManagerM367 = m367();
        int i2 = f78 + 73;
        f77 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 17 : 'I') == 17) {
            return iGDTAdManagerM367;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m369(LiteAbstractAD liteAbstractAD) {
        int i = f77 + 73;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Map<String, Object> mapM378 = m378(liteAbstractAD);
        int i3 = f77 + 45;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? 'T' : 'A') == 'A') {
            return mapM378;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m370(RewardVideoAD rewardVideoAD) {
        int i = f77 + 65;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Map<String, String> mapM380 = m380(rewardVideoAD);
        int i3 = f77 + 11;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? 'H' : 'K') == 'K') {
            return mapM380;
        }
        int i4 = 39 / 0;
        return mapM380;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m371(RewardVideoAD rewardVideoAD) {
        int i = f78 + 23;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int iM374 = m374(rewardVideoAD);
        int i3 = f77 + 95;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '8' : '+') != '8') {
            return iM374;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m377(APPStatus aPPStatus) {
        int i = f78 + 91;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM375 = m375(aPPStatus);
        int i3 = f78 + 35;
        f77 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM375;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m379(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = f78 + 11;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Map mapM373 = m373(unifiedInterstitialAD);
        int i3 = f77 + 87;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 17 : (char) 6) != 17) {
            return mapM373;
        }
        throw null;
    }

    public cg(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m383() {
        int i = f77 + R.styleable.AppCompatTheme_toolbarStyle;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i3 = f77 + 23;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return integrationSDKVersion;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034f  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m382(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cg.m382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m381() {
        HashMap map = new HashMap();
        map.put(m376(null, null, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 127, "\u0099\u008d¢\u0095\u008e£\u0085\u0084\u0083\u0082\u0081\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m388(List<Object> list, ch chVar) {
                return cg.m368();
            }
        });
        map.put(m372("弑䜦潨ឨ㿒☏츁\uf661", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 6198).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m385(List<Object> list, ch chVar) {
                return cg.m377((APPStatus) list.get(0));
            }
        });
        map.put(m376(null, null, 127 - Color.blue(0), "\u0089\u009c\u0095\u009d\u008e\u0099\u0090¥¤\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m384(List<Object> list, ch chVar) {
                return cg.m369((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m372("弑潪㿰칏黷굜緁ో\udcda\ueb76뮨䨑᪣⤣轢", 12409 - KeyEvent.normalizeMetaState(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m386(List<Object> list, ch chVar) {
                return Integer.valueOf(cg.m371((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m376(null, null, View.MeasureSpec.getMode(0) + 127, "\u008f\u0090¥¤\u0085\u008d\u0085\u0099\u008e\u0098\u008d\u0097\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m387(List<Object> list, ch chVar) {
                return cg.m370((RewardVideoAD) list.get(0));
            }
        });
        map.put(m372("弑䋦擨۠⣌쫋\uecad躷낭功璍ᚅ㡣\uda66ﱼ鹨聞ꉇ", 7669 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m389(List<Object> list, ch chVar) {
                return cg.m379((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i = f77 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return map;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static IGDTAdManager m367() {
        int i = f78 + 69;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? ';' : '(') == '(') {
            return GDTAdSdk.getGDTAdManger();
        }
        GDTAdSdk.getGDTAdManger();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m375(APPStatus aPPStatus) {
        int i = f77 + 1;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String appid = aPPStatus.getAPPID();
        int i3 = f77 + 93;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 4 : '^') == '^') {
            return appid;
        }
        int i4 = 26 / 0;
        return appid;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> m378(LiteAbstractAD liteAbstractAD) {
        int i = f77 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        if (!z) {
            int i2 = 97 / 0;
        }
        int i3 = f77 + 23;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return extraInfo;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int m374(RewardVideoAD rewardVideoAD) {
        int i = f77 + 45;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        int i3 = f78 + 35;
        f77 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return rewardAdType;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, String> m380(RewardVideoAD rewardVideoAD) {
        int i = f78 + 39;
        f77 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'Q' : 'W') != 'Q') {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Map m373(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = f77 + 13;
        f78 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Map ext = unifiedInterstitialAD.getExt();
        int i3 = f77 + 17;
        f78 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return ext;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m376(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f82;
            int i2 = f83;
            if (f81) {
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
            if (f79) {
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m372(String str, int i) {
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
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f80);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
