package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ce extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f64 = 6;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f66 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f68 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f67 = {'T', 'J', 'A', GMTDateParser.DAY_OF_MONTH, 'U', 'n', 'i', 't', 'c', 'v', 'y', 'o', GMTDateParser.MINUTES, '.', 'a', 'p', 'j', 'C', 'e', 'P', 'l', 'D', 'B', 'r', 'w', GMTDateParser.SECONDS, GMTDateParser.MONTH, 'V', 'W', 'b', 'L', 'u', 'S', 'g', 'X', GMTDateParser.YEAR};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f65 = {-1832991700, -1271061845, -1256523278, -800769962, 2144407180, 1758547183, -17435220, -876523492, 833547339, -54632056, -545200866, -1000302033, 590793179, -1817785845, 927544906, -1422408457, -1403340660, 874454846};

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m342(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = f66 + 23;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        m355(tJPlacement, tJPlacementVideoListener);
        if (z) {
            return;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m343(TJPlacement tJPlacement) {
        int i = f66 + 81;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM345 = m345(tJPlacement);
        int i3 = f68 + 47;
        f66 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM345;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m344(TJPlacementData tJPlacementData) {
        int i = f68 + 13;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM339 = m339(tJPlacementData);
        int i3 = f68 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f66 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            throw null;
        }
        return strM339;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m346(TJPlacementData tJPlacementData) {
        int i = f68 + 105;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM353 = m353(tJPlacementData);
        int i3 = f66 + 71;
        f68 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM353;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m347(TJSplitWebView tJSplitWebView) {
        int i = f68 + 109;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '/' : 'P') != '/') {
            return m354(tJSplitWebView);
        }
        m354(tJSplitWebView);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementListener m348(TJPlacement tJPlacement) {
        int i = f68 + 57;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        TJPlacementListener tJPlacementListenerM340 = m340(tJPlacement);
        int i3 = f68 + 21;
        f66 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return tJPlacementListenerM340;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m350(TJPlacementData tJPlacementData) {
        int i = f68 + 71;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM341 = m341(tJPlacementData);
        int i3 = f66 + 81;
        f68 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM341;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementVideoListener m352(TJPlacement tJPlacement) {
        int i = f66 + 95;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '!' : 'M') != 'M') {
            m338(tJPlacement);
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        TJPlacementVideoListener tJPlacementVideoListenerM338 = m338(tJPlacement);
        int i2 = f68 + 45;
        f66 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 25 : 'D') == 'D') {
            return tJPlacementVideoListenerM338;
        }
        int i3 = 55 / 0;
        return tJPlacementVideoListenerM338;
    }

    public ce(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040c  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Class m357(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.m357(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m358() {
        int i = f66 + 111;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? (char) 3 : (char) 30) != 30) {
            Tapjoy.getVersion();
            throw null;
        }
        String version = Tapjoy.getVersion();
        int i2 = f68 + 67;
        f66 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 1 : '\t') != 1) {
            return version;
        }
        int i3 = 58 / 0;
        return version;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m356() {
        HashMap map = new HashMap();
        map.put(m351(new int[]{459920644, -1422124477, -65989670, -112633383, -1408402046, -649397006, -1038326330, -248712669}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m360(List<Object> list, ch chVar) {
                return ce.m350((TJPlacementData) list.get(0));
            }
        });
        map.put(m349((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + R.styleable.AppCompatTheme_windowMinWidthMajor), "\u001e\u0015\n\u0001\u0012\u0015", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 6).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m363(List<Object> list, ch chVar) {
                return ce.m346((TJPlacementData) list.get(0));
            }
        });
        map.put(m351(new int[]{1313902396, -103693904, 270934848, 855532280, 808278591, 418902013, 444695141, 1214535014}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m359(List<Object> list, ch chVar) {
                return ce.m344((TJPlacementData) list.get(0));
            }
        });
        map.put(m351(new int[]{843312343, 66431621, 389096977, 175060994}, Gravity.getAbsoluteGravity(0, 0) + 7).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m361(List<Object> list, ch chVar) {
                return ce.m343((TJPlacement) list.get(0));
            }
        });
        map.put(m349((byte) (55 - ImageFormat.getBitsPerPixel(0)), "\u001e\u0015\u0006\u001f\u0007\u0018\u0006\u0013\u0000\u0017ª", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m362(List<Object> list, ch chVar) {
                return ce.m348((TJPlacement) list.get(0));
            }
        });
        map.put(m351(new int[]{-1493386152, 1708884378, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m366(List<Object> list, ch chVar) {
                return ce.m352((TJPlacement) list.get(0));
            }
        });
        map.put(m351(new int[]{-1416007910, 396799033, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m365(List<Object> list, ch chVar) {
                ce.m342((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m349((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 53), "\u001e\u0015\u0006\u001f\r\u001a\n\u0001\u0012\u0015", 10 - KeyEvent.getDeadChar(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m364(List<Object> list, ch chVar) {
                return ce.m347((TJSplitWebView) list.get(0));
            }
        });
        int i = f66 + 49;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m341(TJPlacementData tJPlacementData) {
        int i = f68 + 15;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String placementName = tJPlacementData.getPlacementName();
        int i3 = f66 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f68 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? '0' : '5') == '5') {
            return placementName;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m353(TJPlacementData tJPlacementData) {
        int i = f68 + 39;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return tJPlacementData.getUrl();
        }
        tJPlacementData.getUrl();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m339(TJPlacementData tJPlacementData) {
        int i = f68 + 65;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i3 = f68 + 37;
        f66 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? 'B' : (char) 19) == 19) {
            return httpResponse;
        }
        int i4 = 75 / 0;
        return httpResponse;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m345(TJPlacement tJPlacement) {
        int i = f66 + 69;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return tJPlacement.getName();
        }
        tJPlacement.getName();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static TJPlacementListener m340(TJPlacement tJPlacement) {
        int i = f66 + R.styleable.AppCompatTheme_windowActionBar;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if ((i % 2 == 0 ? '[' : 'N') != 'N') {
            tJPlacement.getListener();
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        TJPlacementListener listener = tJPlacement.getListener();
        int i2 = f68 + 27;
        f66 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            return listener;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static TJPlacementVideoListener m338(TJPlacement tJPlacement) {
        int i = f68 + 109;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i3 = f68 + 69;
        f66 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return videoListener;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m355(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = f68 + 5;
        f66 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 != 0 ? 'L' : 'b';
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (c != 'b') {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        int i2 = f68 + 31;
        f66 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m354(TJSplitWebView tJSplitWebView) {
        int i = f66 + 27;
        f68 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '9' : (char) 4) != '9') {
            return tJSplitWebView.getLastUrl();
        }
        tJSplitWebView.getLastUrl();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m349(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f67;
            char c = f64;
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m351(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f65.clone();
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
