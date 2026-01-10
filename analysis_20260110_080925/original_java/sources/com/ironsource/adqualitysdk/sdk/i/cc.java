package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class cc extends bg {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f19 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f21 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f22 = 29;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f24 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f26 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f23 = {'J', 'r', 139, 134, 145, 150, '^', 129, 144, 'f', 'i', 130, 143, 'b', 149, 'q', '_', 't', 127, GMTDateParser.SECONDS, 148, 141, 'o', 142, 146, 147, 'j', 140, 151, '~', '`', 138, 128, 'p', 133, 'e', 137, 131, 132, GMTDateParser.MINUTES, 'l', GMTDateParser.DAY_OF_MONTH, 'a', 'v', 'n', 'c'};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f18 = 11262;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f20 = 13939;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f17 = 41215;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f25 = 1009;

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ Object m270() {
        Object objM269;
        int i = f21 + 61;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '\n' : 'R') != '\n') {
            objM269 = m269();
        } else {
            objM269 = m269();
            int i2 = 54 / 0;
        }
        int i3 = f21 + 33;
        f19 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return objM269;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m276(IUnityAdsListener iUnityAdsListener) {
        int i = f21 + 77;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? 'F' : (char) 15;
        Object obj = null;
        m274(iUnityAdsListener);
        if (c != 15) {
            throw null;
        }
        int i2 = f19 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f21 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            return;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m279(IUnityAdsListener iUnityAdsListener) {
        int i = f19 + 25;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m288(iUnityAdsListener);
        int i3 = f19 + 33;
        f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return;
        }
        int i4 = 41 / 0;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m281(IUnityAdsListener iUnityAdsListener) {
        int i = f21 + 69;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? 'Q' : 'Z';
        m286(iUnityAdsListener);
        if (c == 'Z') {
        } else {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ BannerView.IListener m283(BannerView bannerView) {
        int i = f19 + 23;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            m275(bannerView);
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        BannerView.IListener iListenerM275 = m275(bannerView);
        int i2 = f21 + 15;
        f19 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? '8' : '\n') == '\n') {
            return iListenerM275;
        }
        int i3 = 53 / 0;
        return iListenerM275;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m287(BannerView bannerView) {
        int i = f21 + 23;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strM277 = m277(bannerView);
        int i3 = f21 + 63;
        f19 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strM277;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m289(BannerView bannerView, BannerView.IListener iListener) {
        int i = f21 + 63;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m282(bannerView, iListener);
        int i3 = f21 + 109;
        f19 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? (char) 19 : (char) 6) != 19) {
        } else {
            throw null;
        }
    }

    public cc(String str) {
        super(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m293() {
        int i = f19 + 63;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String version = UnityAds.getVersion();
        if (version != null) {
            int i3 = f21 + 105;
            f19 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return (i3 % 2 == 0 ? GMTDateParser.MONTH : 'J') != 'J' ? version.split(m278(null, null, 99 / (ViewConfiguration.getScrollBarFadeDuration() % 75), "\u0081").intern())[0] : version.split(m278(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0081").intern())[0];
        }
        int i4 = f19 + 99;
        f21 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cc  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class m292(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.m292(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final Map<String, bg.b> m291() {
        HashMap map = new HashMap();
        Object obj = null;
        map.put(m278(null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0085\u0083\u008c\u008d\u008d\u0099\u009f\u0085\u008c§").intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m301(List<Object> list, ch chVar) {
                return cc.m273();
            }
        });
        map.put(m278(null, null, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0091\u0090\u008c\u0085\u009e\u008c\u008d¡").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.7
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m304(List<Object> list, ch chVar) {
                return cc.this.m290(list.get(0), chVar);
            }
        });
        map.put(m285("昧ۻׅพⵖ˃箱毁隫뭏⨩治\ud8e3讒各젔Ϫ恎ᆄ㸷", KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 20).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.9
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m306(List<Object> list, ch chVar) {
                cc.m280(list.get(0));
                return null;
            }
        });
        map.put(m278(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0088\u008a\u008c \u009eª\u0085\u008c§").intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.10
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m295(List<Object> list, ch chVar) {
                return cc.m271();
            }
        });
        map.put(m285("䲽៥濪\uf508앇\ude3c⯓澹쉉⨒\ueb3c\ue2f0뿗\uf2a5⺟\ued75錒⫏럗\uda36", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.8
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m305(List<Object> list, ch chVar) {
                return cc.m270();
            }
        });
        map.put(m278(null, null, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0085\u008c\u0089").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.6
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m303(List<Object> list, ch chVar) {
                cc.m281((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m278(null, null, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0088\u0088\u009e").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.11
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m296(List<Object> list, ch chVar) {
                cc.m279((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m278(null, null, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + RendererCapabilities.DECODER_SUPPORT_PRIMARY, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008c\u009a\u009c \u008c\u008d").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.15
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m298(List<Object> list, ch chVar) {
                cc.m276((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m285("䲽៥\uef6f؋鍟ﴫ慗⠧行\uf512竘Ỏ鱳햩ׅพ暳ᨶ㇂嘏㜉⊄풤볬", 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.13
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m297(List<Object> list, ch chVar) {
                return cc.m284((String) list.get(0));
            }
        });
        map.put(m285("䲽៥\uef6f؋鍟ﴫ⟃灜遶甑㘧욞\uf2d8在⩁왥隫뭏", View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern(), new bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m299(List<Object> list, ch chVar) {
                return cc.m272((String) list.get(0));
            }
        });
        map.put(m278(null, null, View.MeasureSpec.getSize(0) + 127, "\u0088\u008a\u0085\u0083\u008c \u008c¡\u009e¥¨\u0085\u008c§").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m300(List<Object> list, ch chVar) {
                return cc.m287((BannerView) list.get(0));
            }
        });
        map.put(m285("䲽៥\u0bc4몵讳ꠌ錒⫏覡\uf60a뿗\uf2a5⺟\ued75錒⫏럗\uda36", 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m302(List<Object> list, ch chVar) {
                return cc.m283((BannerView) list.get(0));
            }
        });
        map.put(m278(null, null, 127 - (Process.myTid() >> 22), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091\u0085\u008c\u0089").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Object m294(List<Object> list, ch chVar) {
                cc.m289((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        int i = f21 + 55;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return map;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static Object m269() {
        int i = f21 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if ((i % 2 == 0 ? '\b' : ')') != ')') {
            UnityAds.getListener();
            throw null;
        }
        IUnityAdsListener listener = UnityAds.getListener();
        int i2 = f19 + 97;
        f21 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 14 : (char) 5) != 14) {
            return listener;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m286(IUnityAdsListener iUnityAdsListener) {
        int i = f19 + 29;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 != 0;
        Object obj = null;
        UnityAds.setListener(iUnityAdsListener);
        if (z) {
            throw null;
        }
        int i2 = f19 + 17;
        f21 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 6 : (char) 3) == 3) {
            return;
        }
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m288(IUnityAdsListener iUnityAdsListener) {
        int i = f21 + 11;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        UnityAds.addListener(iUnityAdsListener);
        int i3 = f19 + 85;
        f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static void m274(IUnityAdsListener iUnityAdsListener) {
        int i = f19 + 81;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        UnityAds.removeListener(iUnityAdsListener);
        if (!z) {
            int i2 = 70 / 0;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static Object m273() {
        int i = f21 + 11;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i3 = f21 + 29;
        f19 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return currentApp;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m290(Object obj, ch chVar) {
        a aVar = new a((WebViewApp) obj, chVar);
        int i = f19 + 47;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return aVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m280(Object obj) {
        int i = f19 + 71;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        boolean z = i % 2 == 0;
        WebViewApp.setCurrentApp((a) obj);
        if (!z) {
            int i2 = 17 / 0;
        }
        int i3 = f19 + 49;
        f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? 'V' : '0') != 'V') {
            return;
        }
        Object obj2 = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String m271() {
        int i = f19 + 79;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return ClientProperties.getGameId();
        }
        ClientProperties.getGameId();
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Enum m284(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(m278(null, null, 127 - View.getDefaultSize(0, 0), "\u008e\u008b\u009f¬\u009f\u008e®\u008a\u008b").intern())) {
                    c = '\b';
                    break;
                }
                break;
            case -1166291365:
                if ((str.equals(m278(null, null, Color.alpha(0) + 127, "\u008eª\u0087\u0097©\u0090¢").intern()) ? '#' : 'R') != 'R') {
                    int i = f21 + 77;
                    f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if (i % 2 != 0) {
                        c = 6;
                        break;
                    } else {
                        c = 'W';
                        break;
                    }
                }
                break;
            case -276710660:
                if (!(str.equals(m278(null, null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + R.styleable.AppCompatTheme_windowNoTitle, "\u0097\u008e¬\u0087\u008b¨©\u008e«\u008a\u0094").intern()) ? false : true)) {
                    int i2 = f19;
                    int i3 = i2 + 37;
                    f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i4 = i3 % 2;
                    int i5 = i2 + 77;
                    f21 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i6 = i5 % 2;
                    c = 1;
                    break;
                }
                break;
            case -54373961:
                if (str.equals(m285("\ueb21쑥ต棔䅼\uf6a4犗贅뀒戍맩\ued7a", 11 - MotionEvent.axisFromString(BuildConfig.FLAVOR)).intern())) {
                    c = 5;
                    break;
                }
                break;
            case 63879010:
                if (str.equals(m285("\udd68䮑姧߮\u0010ꁴ", 5 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    c = 4;
                    break;
                }
                break;
            case 1167718561:
                if ((str.equals(m278(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0090¢\u0087\u009f«\u0087©\u0097\u0091").intern()) ? '?' : (char) 17) == '?') {
                    c = 7;
                    break;
                }
                break;
            case 1813675631:
                if ((str.equals(m278(null, null, Color.blue(0) + 127, "\u0090¢\u008e\u0082\u00ad\u008e\u0097").intern()) ? 'H' : (char) 19) != 19) {
                    int i7 = f19 + 27;
                    f21 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i8 = i7 % 2;
                    c = 2;
                    break;
                }
                break;
            case 1815350732:
                if (str.equals(m285("ꆻᄮᝤశ௴ꑖ\u0010ꁴ", 7 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = 3;
                    break;
                }
                break;
            case 1926303783:
                if (str.equals(m285("ಈ賞鑰\uec05⹃ག", (ViewConfiguration.getFadingEdgeLength() >> 16) + 6).intern())) {
                    int i9 = f19 + 105;
                    f21 = i9 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i10 = i9 % 2;
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case '\b':
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static Enum m272(String str) {
        char c = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode == 183181625) {
            if ((str.equals(m278(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u008e\u0090\u008e\u008b¨\u009b©\u009f").intern()) ? 'V' : '\"') == 'V') {
                int i = f21 + 39;
                f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                c = 0;
            }
        } else if (iHashCode == 2066319421 && str.equals(m278(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "«\u008e\u008b\u008a\u0087®").intern())) {
            int i3 = f19 + 65;
            f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            c = 1;
        }
        if (c == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (c != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m277(BannerView bannerView) {
        int i = f21 + 21;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        char c = i % 2 == 0 ? 'P' : (char) 15;
        String placementId = bannerView.getPlacementId();
        if (c == 'P') {
            int i2 = 69 / 0;
        }
        return placementId;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static BannerView.IListener m275(BannerView bannerView) {
        int i = f21 + 29;
        f19 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        BannerView.IListener listener = bannerView.getListener();
        int i3 = f19 + 3;
        f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return listener;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m282(BannerView bannerView, BannerView.IListener iListener) {
        int i = f19 + 33;
        f21 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        bannerView.setListener(iListener);
        int i3 = f19 + 73;
        f21 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super/*java.lang.Object*/.hashCode();
        throw null;
    }

    class a extends WebViewApp implements hg<WebViewApp> {

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f35 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f36 = 16526;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f37 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f38 = 43528;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f39 = 6;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f40 = {'W', 'e', 'b', 'V', 'i', 'w', 'A', 'p', '.', GMTDateParser.SECONDS, 't', 'F', 'a', 'l', 'u', 'r', GMTDateParser.MONTH, 'g', 'C', 'o', GMTDateParser.DAY_OF_MONTH, 'I', 'n', GMTDateParser.ZONE, 'v', 'k', GMTDateParser.HOURS, 'c', GMTDateParser.MINUTES, 'E', 'S', 'X', GMTDateParser.YEAR, 'Z', '[', '\\'};

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f41 = 58902;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f42 = 5570;

        /* renamed from: ｋ, reason: contains not printable characters */
        private WebViewApp f44;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ch f45;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final /* synthetic */ Object m310() {
            int i = f37 + 39;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            WebViewApp webViewAppM307 = m307();
            int i3 = f37 + 17;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i3 % 2 != 0) {
                return webViewAppM307;
            }
            throw null;
        }

        a(WebViewApp webViewApp, ch chVar) {
            this.f44 = webViewApp;
            this.f45 = chVar;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private WebViewApp m307() {
            int i = f37 + 105;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? 'F' : '%') != 'F') {
                return this.f44;
            }
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }

        public void setWebAppLoaded(boolean z) {
            int i = f37 + 43;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆者뭇䌤\ue822ﭶ\uf891䥙\uf4e2覆⇎ἥ騦", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25).intern(), new Object[]{Boolean.valueOf(z)});
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? '_' : 'Z') != 'Z') {
                webViewApp.setWebAppLoaded(z);
            }
            int i3 = f37 + 23;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i3 % 2 == 0 ? 'L' : '0') != 'L') {
                return;
            }
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }

        public boolean isWebAppLoaded() {
            int i = f37 + 65;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡₤િ䂶频㸂菒曡\uede7", (ViewConfiguration.getLongPressTimeout() >> 16) + 25).intern(), new Object[0]);
            WebViewApp webViewApp = this.f44;
            Object obj = null;
            if (webViewApp == null) {
                int i3 = f35 + 97;
                f37 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i3 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i4 = f37 + 101;
            f35 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i4 % 2 == 0)) {
                boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
                int i5 = f37 + 9;
                f35 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i5 % 2 == 0 ? 'I' : (char) 21) != 'I') {
                    return zIsWebAppLoaded;
                }
                int i6 = 3 / 0;
                return zIsWebAppLoaded;
            }
            webViewApp.isWebAppLoaded();
            super/*java.lang.Object*/.hashCode();
            throw null;
        }

        public void setWebAppFailureMessage(String str) {
            int i = f37 + 105;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (View.combineMeasuredStates(0, 0) + 83), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÃÃ\t\n\u0004\u0007\u0001\u0002\u0000\bÃÃ\u0006\u0011\u0001\u0010\u000f\u0010\u0004\r\u0003\u0007\u0006\u000f\r\u0005", Process.getGidForName(BuildConfig.FLAVOR) + 35).intern(), new Object[]{str});
            WebViewApp webViewApp = this.f44;
            if (!(webViewApp == null)) {
                webViewApp.setWebAppFailureMessage(str);
            }
            int i3 = f37 + 51;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }

        public void setWebAppFailureCode(int i) {
            int i2 = f35 + 13;
            f37 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (17 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0081\u0081\t\n\u0004\u0007\u0001\u0002\u0000\b\u0081\u0081\u0006\u0011\u0001\u0010\u000f\u0010\u0000\u0013\u0014\u0015v", (Process.myTid() >> 22) + 31).intern(), new Object[]{Integer.valueOf(i)});
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? '^' : 'U') != 'U') {
                int i4 = f37 + 61;
                f35 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i5 = i4 % 2;
                webViewApp.setWebAppFailureCode(i);
            }
        }

        public String getWebAppFailureMessage() {
            int i = f37 + 71;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i % 2 == 0) {
                cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", 19 >> Gravity.getAbsoluteGravity(1, 0)).intern(), new Object[1]);
                if (this.f44 == null) {
                    return null;
                }
            } else {
                cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", Gravity.getAbsoluteGravity(0, 0) + 34).intern(), new Object[0]);
                if (this.f44 == null) {
                    return null;
                }
            }
            int i2 = f37 + 45;
            f35 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
                return this.f44.getWebAppFailureMessage();
            }
            return this.f44.getWebAppFailureMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            if ((r6.f44 == null) != true) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (r6.f44 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37 + 39;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            r0 = r0 % 2;
            r0 = r6.f44.getWebAppFailureCode();
            r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35 + 91;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getWebAppFailureCode() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r0 = r0 + 15
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L10
                r0 = r1
                goto L11
            L10:
                r0 = r2
            L11:
                java.lang.String r3 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李贘ȫ\uf7d6\uf4d0\uea28捔"
                if (r0 == r1) goto L38
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r6.f45
                int r5 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r5 = r5 >> 16
                int r5 = 31 - r5
                java.lang.String r3 = m308(r3, r5)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r5 = new java.lang.Object[r2]
                r0.ﻛ(r6, r4, r3, r5)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                if (r0 == 0) goto L34
                r0 = r2
                goto L35
            L34:
                r0 = r1
            L35:
                if (r0 == r1) goto L71
                goto L56
            L38:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r6.f45
                r4 = 41
                int r5 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r5 = r5 >> 10
                int r4 = r4 / r5
                java.lang.String r3 = m308(r3, r4)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.ﻛ(r6, r1, r3, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                if (r0 == 0) goto L71
            L56:
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r0 = r0 + 39
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r1
                int r0 = r0 % 2
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                int r0 = r0.getWebAppFailureCode()
                int r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35
                int r1 = r1 + 91
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r2
                int r1 = r1 % 2
                return r0
            L71:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.getWebAppFailureCode():int");
        }

        public void setWebAppInitialized(boolean z) {
            int i = f35 + 55;
            f37 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 22), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0086\u0086\t\n\u0004\u0007\u0001\u0002\u0000\b\u0086\u0086\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0013\u0005z", 30 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)).intern(), new Object[]{Boolean.valueOf(z)});
            WebViewApp webViewApp = this.f44;
            if (webViewApp == null) {
                return;
            }
            webViewApp.setWebAppInitialized(z);
            int i3 = f37 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }

        public void resetWebViewAppInitialization() {
            int i = f35 + 61;
            f37 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 92), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\t\u000e\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0012\u0011\u0010\n\u0014\u0017", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40).intern(), new Object[0]);
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? GMTDateParser.ANY : (char) 31) != 31) {
                webViewApp.resetWebViewAppInitialization();
                int i3 = f37 + 53;
                f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            if ((r6.f44 == null) != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (r6.f44 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            r0 = r6.f44.isWebAppInitialized();
            r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35 + 111;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if ((r1 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        
            r1 = '1';
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            r1 = 'N';
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r1 != 'N') goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            super/*java.lang.Object*\/.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isWebAppInitialized() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35
                int r0 = r0 + 77
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r1
                int r0 = r0 % 2
                r1 = 74
                if (r0 == 0) goto L11
                r0 = 15
                goto L12
            L11:
                r0 = r1
            L12:
                java.lang.String r2 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡⩍촻\ud84dᾘ澝凒㢆ᥠ棙ₓἥ騦"
                r3 = 0
                if (r0 == r1) goto L39
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r6.f45
                r4 = 24
                int r5 = android.graphics.ImageFormat.getBitsPerPixel(r3)
                int r4 = r4 >>> r5
                java.lang.String r2 = m308(r2, r4)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r0.ﻛ(r6, r1, r2, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                if (r0 == 0) goto L35
                r0 = r3
                goto L36
            L35:
                r0 = 1
            L36:
                if (r0 == 0) goto L54
                goto L76
            L39:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r6.f45
                int r4 = android.graphics.ImageFormat.getBitsPerPixel(r3)
                int r4 = r4 + 31
                java.lang.String r2 = m308(r2, r4)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r0.ﻛ(r6, r1, r2, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                if (r0 == 0) goto L76
            L54:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f44
                boolean r0 = r0.isWebAppInitialized()
                int r1 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35
                int r1 = r1 + 111
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r2
                int r1 = r1 % 2
                r2 = 78
                if (r1 == 0) goto L6b
                r1 = 49
                goto L6c
            L6b:
                r1 = r2
            L6c:
                if (r1 != r2) goto L6f
                return r0
            L6f:
                r0 = 0
                super/*java.lang.Object*/.hashCode()     // Catch: java.lang.Throwable -> L74
                throw r0     // Catch: java.lang.Throwable -> L74
            L74:
                r0 = move-exception
                throw r0
            L76:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.isWebAppInitialized():boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        
            if ((r7.f44 != null) != true) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37 + 13;
            com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if ((r0 % 2) == 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            super/*java.lang.Object*\/.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            return r7.f44.getWebView();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        
            if (r7.f44 != null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.unity3d.services.core.webview.WebView getWebView() {
            /*
                r7 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L10
                r0 = r1
                goto L11
            L10:
                r0 = r2
            L11:
                java.lang.String r3 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bàà\u000b\u000e\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002ç"
                if (r0 == 0) goto L3c
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r7.f45
                float r5 = android.media.AudioTrack.getMaxVolume()
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                int r5 = 105 - r5
                byte r5 = (byte) r5
                int r2 = android.view.KeyEvent.normalizeMetaState(r2)
                int r2 = 96 - r2
                java.lang.String r2 = m309(r5, r3, r2)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.ﻛ(r7, r4, r2, r1)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                if (r0 == 0) goto L64
                goto L78
            L3c:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r7.f45
                float r5 = android.media.AudioTrack.getMaxVolume()
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                int r5 = r5 + 111
                byte r5 = (byte) r5
                int r6 = android.view.KeyEvent.normalizeMetaState(r2)
                int r6 = 21 - r6
                java.lang.String r3 = m309(r5, r3, r6)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r5 = new java.lang.Object[r2]
                r0.ﻛ(r7, r4, r3, r5)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                if (r0 == 0) goto L62
                r2 = r1
            L62:
                if (r2 == r1) goto L78
            L64:
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r0 = r0 + 13
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L72
                return r1
            L72:
                super/*java.lang.Object*/.hashCode()     // Catch: java.lang.Throwable -> L76
                throw r1     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                throw r0
            L78:
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                com.unity3d.services.core.webview.WebView r0 = r0.getWebView()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.getWebView():com.unity3d.services.core.webview.WebView");
        }

        public void setWebView(WebView webView) {
            int i = f37 + 63;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (View.getDefaultSize(0, 0) + 27), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008b\u008b\t\n\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0092", 21 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new Object[]{webView});
            WebViewApp webViewApp = this.f44;
            if (!(webViewApp == null)) {
                int i3 = f35 + 83;
                f37 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                boolean z = i3 % 2 != 0;
                webViewApp.setWebView(webView);
                if (z) {
                    Object obj = null;
                    super/*java.lang.Object*/.hashCode();
                    throw null;
                }
            }
            int i4 = f37 + 45;
            f35 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
        }

        public Configuration getConfiguration() {
            cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥", Color.rgb(0, 0, 0) + 16777243).intern(), new Object[0]);
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? (char) 3 : '@') != '@') {
                int i = f37 + 27;
                f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                return webViewApp.getConfiguration();
            }
            int i3 = f37 + 69;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void setConfiguration(com.unity3d.services.core.configuration.Configuration r8) {
            /*
                r7 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f35
                int r0 = r0 + 123
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f37 = r1
                int r0 = r0 % 2
                r1 = 0
                java.lang.String r2 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥"
                r3 = 1
                if (r0 == 0) goto L35
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r7.f45
                r5 = 116(0x74, float:1.63E-43)
                int r6 = android.view.ViewConfiguration.getJumpTapTimeout()
                int r6 = r6 << 6
                int r5 = r5 << r6
                java.lang.String r2 = m308(r2, r5)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r3] = r8
                r0.ﻛ(r7, r4, r2, r5)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                if (r0 == 0) goto L31
                goto L32
            L31:
                r1 = r3
            L32:
                if (r1 == 0) goto L5c
                goto L61
            L35:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r7.f45
                int r5 = android.view.ViewConfiguration.getJumpTapTimeout()
                r6 = 16
                int r5 = r5 >> r6
                int r5 = 27 - r5
                java.lang.String r2 = m308(r2, r5)
                java.lang.String r2 = r2.intern()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r1] = r8
                r0.ﻛ(r7, r4, r2, r3)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                if (r0 == 0) goto L57
                r0 = r6
                goto L59
            L57:
                r0 = 17
            L59:
                if (r0 == r6) goto L5c
                goto L61
            L5c:
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                r0.setConfiguration(r8)
            L61:
                int r8 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r8 = r8 + 71
                int r0 = r8 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r0
                int r8 = r8 % 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.setConfiguration(com.unity3d.services.core.configuration.Configuration):void");
        }

        public boolean sendEvent(Enum r8, Enum r9, Object... objArr) {
            int i = f37 + 75;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681礃뙰\uf479漨쏎扸ﶳ럥", 20 - Drawable.resolveOpacity(0, 0)).intern(), new Object[]{r8, r9, Arrays.asList(objArr)});
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? 'D' : (char) 29) != 'D') {
                return false;
            }
            boolean zSendEvent = webViewApp.sendEvent(r8, r9, objArr);
            int i3 = f37 + 7;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return zSendEvent;
        }

        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            int i = f35 + 57;
            f37 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (56 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b¨¨\n\u0002\u0012\u001c\u0019\u001f\u0004\r\u0004\u0007\u0019\u0014\u009c", 23 - Color.blue(0)).intern(), new Object[]{str, str2, method, Arrays.asList(objArr)});
            WebViewApp webViewApp = this.f44;
            if ((webViewApp != null ? (char) 1 : (char) 17) != 1) {
                return false;
            }
            int i3 = f37 + 101;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }

        public boolean invokeCallback(Invocation invocation) {
            cc.this.ﻛ(this, this.f45, m309((byte) (13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b||\n\u0002\u0012\u001c\u0019\u001f\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018w", ((byte) KeyEvent.getModifierMetaStateMask()) + 26).intern(), new Object[]{invocation});
            WebViewApp webViewApp = this.f44;
            if (webViewApp == null) {
                return false;
            }
            int i = f37 + R.styleable.AppCompatTheme_toolbarStyle;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i % 2 == 0)) {
                boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
                int i2 = f35 + 85;
                f37 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                return zInvokeCallback;
            }
            webViewApp.invokeCallback(invocation);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void addCallback(com.unity3d.services.core.webview.bridge.NativeCallback r8) {
            /*
                r7 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r0 = r0 + 21
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L10
                r0 = r2
                goto L11
            L10:
                r0 = r1
            L11:
                java.lang.String r3 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bßß\u0006\u000eÓÓ\u0018\u0012ÛÛ\u0000\u000e\u001c\u001a"
                if (r0 == r1) goto L44
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r1 = r7.f45
                r4 = 22
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
                int r4 = r4 << r5
                byte r4 = (byte) r4
                int r5 = android.view.KeyEvent.getModifierMetaStateMask()
                byte r5 = (byte) r5
                int r5 = r5 * 113
                java.lang.String r3 = m309(r4, r3, r5)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r4[r2] = r8
                r0.ﻛ(r7, r1, r3, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                r1 = 61
                if (r0 == 0) goto L3f
                r0 = r1
                goto L41
            L3f:
                r0 = 25
            L41:
                if (r0 == r1) goto L6d
                goto L72
            L44:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.i.cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r4 = r7.f45
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
                int r5 = r5 + 111
                byte r5 = (byte) r5
                int r6 = android.view.KeyEvent.getModifierMetaStateMask()
                byte r6 = (byte) r6
                int r6 = r6 + 23
                java.lang.String r3 = m309(r5, r3, r6)
                java.lang.String r3 = r3.intern()
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r2] = r8
                r0.ﻛ(r7, r4, r3, r5)
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                if (r0 == 0) goto L6a
                goto L6b
            L6a:
                r1 = r2
            L6b:
                if (r1 == 0) goto L72
            L6d:
                com.unity3d.services.core.webview.WebViewApp r0 = r7.f44
                r0.addCallback(r8)
            L72:
                int r8 = com.ironsource.adqualitysdk.sdk.i.cc.a.f37
                int r8 = r8 + 59
                int r0 = r8 % 128
                com.ironsource.adqualitysdk.sdk.i.cc.a.f35 = r0
                int r8 = r8 % 2
                if (r8 == 0) goto L7f
                return
            L7f:
                r8 = 0
                throw r8     // Catch: java.lang.Throwable -> L81
            L81:
                r8 = move-exception
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.a.addCallback(com.unity3d.services.core.webview.bridge.NativeCallback):void");
        }

        public void removeCallback(NativeCallback nativeCallback) {
            int i = f37 + 103;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (125 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bíí\t\u000e\u0004\u0019\u0012\u0019\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018è", 25 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new Object[]{nativeCallback});
            WebViewApp webViewApp = this.f44;
            if (!(webViewApp != null)) {
                return;
            }
            webViewApp.removeCallback(nativeCallback);
            int i3 = f37 + R.styleable.AppCompatTheme_toolbarStyle;
            f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }

        public NativeCallback getCallback(String str) {
            int i = f37 + 25;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? (char) 2 : ':') != 2) {
                cc.this.ﻛ(this, this.f45, m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new Object[]{str});
                if ((this.f44 != null ? '5' : '`') != '5') {
                    return null;
                }
            } else {
                cc ccVar = cc.this;
                ch chVar = this.f45;
                String strIntern = m308("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", R.styleable.AppCompatTheme_windowActionBar / (TypedValue.complexToFloat(0) > 1.0f ? 1 : (TypedValue.complexToFloat(0) == 1.0f ? 0 : -1))).intern();
                Object[] objArr = new Object[1];
                objArr[1] = str;
                ccVar.ﻛ(this, chVar, strIntern, objArr);
                if (this.f44 == null) {
                    return null;
                }
            }
            int i2 = f37 + 93;
            f35 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            NativeCallback callback = this.f44.getCallback(str);
            int i4 = f35 + 51;
            f37 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i4 % 2 != 0 ? '<' : '(') == '(') {
                return callback;
            }
            int i5 = 18 / 0;
            return callback;
        }

        public ErrorState getErrorStateFromWebAppCode() {
            int i = f37 + 51;
            f35 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            cc.this.ﻛ(this, this.f45, m309((byte) (22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0085\u0085\u000b\u000e\u0004\u0007\u001b\u0011\r\u0015\f!\u0006\u0010\u0007\u0004\t\u0011\u0016\u0019\u0001\u0002\u0000\b\u0085\u0085\u0013\u0014\u0013\u0002", 38 - KeyEvent.getDeadChar(0, 0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f44;
            Object obj = null;
            if ((webViewApp != null ? 'I' : 'S') != 'I') {
                int i3 = f37 + 67;
                f35 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (!(i3 % 2 == 0)) {
                    return null;
                }
                super/*java.lang.Object*/.hashCode();
                throw null;
            }
            int i4 = f37 + 17;
            f35 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 != 0) {
                return webViewApp.getErrorStateFromWebAppCode();
            }
            webViewApp.getErrorStateFromWebAppCode();
            super/*java.lang.Object*/.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m308(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (m.ﾒ) {
                char[] cArr2 = new char[cArr.length];
                m.ﾇ = 0;
                char[] cArr3 = new char[2];
                while (m.ﾇ < cArr.length) {
                    cArr3[0] = cArr[m.ﾇ];
                    cArr3[1] = cArr[m.ﾇ + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f38)) ^ ((c2 >>> 5) + f36)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f41) ^ ((c3 + i2) ^ ((c3 << 4) + f42))));
                        i2 -= 40503;
                    }
                    cArr2[m.ﾇ] = cArr3[0];
                    cArr2[m.ﾇ + 1] = cArr3[1];
                    m.ﾇ += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m309(byte b, String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (i.ﻏ) {
                char[] cArr2 = f40;
                char c = f39;
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

    public static class e extends bg {

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f46 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f47 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f48 = 1031895675;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static byte[] f49 = {5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 19, -70, 11, -5, -7, 17, 3, 51, -69, 15, 3, 51, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 18, -4, 19, -28, 13, -9, 0, 13, 31, 18, -4, 19, -28, 13, -9, 0, 13, 31, 20, -69, 1, 13, -9, 0, 13, -1, 52, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 0, 0, 0, 0, 0};

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f50 = 122;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f51 = -2092926391;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static short[] f52;

        public e(String str) {
            super(str);
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final String m314() {
            String version;
            int i = f46 + 79;
            f47 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? '?' : 'R') != 'R') {
                version = UnityAds.getVersion();
                int i2 = 91 / 0;
                if ((version != null ? '\f' : (char) 14) != '\f') {
                    return null;
                }
            } else {
                version = UnityAds.getVersion();
                if (!(version != null)) {
                    return null;
                }
            }
            int i3 = f47 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            f46 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            String str = version.split(m311((byte) Color.green(0), (short) (ImageFormat.getBitsPerPixel(0) + 1), (-121) - (ViewConfiguration.getTouchSlop() >> 8), (-1031895674) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2092926437 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())[0];
            int i5 = f46 + 99;
            f47 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i5 % 2 != 0) {
                return str;
            }
            int i6 = 73 / 0;
            return str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* renamed from: ｋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Class m313(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.e.m313(java.lang.String):java.lang.Class");
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        final Map<String, bg.b> m312() {
            HashMap map = new HashMap();
            int i = f46 + 33;
            f47 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i % 2 != 0) {
                return map;
            }
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m311(byte b, short s, int i, int i2, int i3) {
            String string;
            synchronized (k.ﮐ) {
                StringBuilder sb = new StringBuilder();
                int i4 = f50;
                int i5 = i + i4;
                boolean z = i5 == -1;
                if (z) {
                    byte[] bArr = f49;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f48 + i2] + i4);
                    } else {
                        i5 = (short) (f52[f48 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    k.ｋ = ((i2 + i5) - 2) + f48 + (z ? 1 : 0);
                    k.ﻐ = b;
                    k.ﾇ = (char) (i3 + f51);
                    sb.append(k.ﾇ);
                    k.ﻛ = k.ﾇ;
                    k.ﾒ = 1;
                    while (k.ﾒ < i5) {
                        byte[] bArr2 = f49;
                        if (bArr2 != null) {
                            int i6 = k.ｋ;
                            k.ｋ = i6 - 1;
                            k.ﾇ = (char) (k.ﻛ + (((byte) (bArr2[i6] + s)) ^ k.ﻐ));
                        } else {
                            short[] sArr = f52;
                            int i7 = k.ｋ;
                            k.ｋ = i7 - 1;
                            k.ﾇ = (char) (k.ﻛ + (((short) (sArr[i7] + s)) ^ k.ﻐ));
                        }
                        sb.append(k.ﾇ);
                        k.ﻛ = k.ﾇ;
                        k.ﾒ++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m278(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f23;
            int i2 = f22;
            if (f26) {
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
            if (f24) {
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
    private static String m285(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.ﾒ) {
            char[] cArr2 = new char[cArr.length];
            m.ﾇ = 0;
            char[] cArr3 = new char[2];
            while (m.ﾇ < cArr.length) {
                cArr3[0] = cArr[m.ﾇ];
                cArr3[1] = cArr[m.ﾇ + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f18)) ^ ((c2 >>> 5) + f17)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f20) ^ ((c3 + i2) ^ ((c3 << 4) + f25))));
                    i2 -= 40503;
                }
                cArr2[m.ﾇ] = cArr3[0];
                cArr2[m.ﾇ + 1] = cArr3[1];
                m.ﾇ += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
