package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class kh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f649 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static d f650 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f651 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static d f652;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f653;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f654;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f655;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f656;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f657;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f658;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m960() {
        f649 = 71;
    }

    static {
        m960();
        f655 = true;
        f654 = true;
        f657 = true;
        byte b = 0;
        f658 = false;
        f656 = false;
        f650 = new d(b);
        f652 = new d(b);
        int i = f653 + 107;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? ':' : '=') != '=') {
            int i2 = 44 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static synchronized av m967() {
        av avVar;
        int i = f653 + 43;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        avVar = as.ﻐ().ﭸ();
        int i3 = f653 + 61;
        f651 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return avVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m965(WebView webView, String str) {
        int i = f653;
        int i2 = i + 105;
        f651 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        if (!(webView == null)) {
            int i4 = i + 11;
            f651 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            if ((webView.getHandler() != null) || webView.getRootView() != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, new StringBuilder().append(m964((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, 22 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 166, "\r\u0002\u0017\u0006ￛ\u0015\u0011\n\u0013\u0004\u0014\u0002\u0017\u0002\u000bￃ\uffc9\u0003\u0010\u0015\u0002\uffc9", true).intern()).append(str).append(m964(3 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + R.styleable.AppCompatTheme_toolbarStyle, "\ufffe\ufffe\ufff7\u0010", true).intern()).toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebViewClient m966(android.webkit.WebView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L54
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f653
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f651 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            com.ironsource.adqualitysdk.sdk.i.av r0 = m967()
            boolean r0 = r0.ﾒ()
            r1 = 57
            int r1 = r1 / r2
            r1 = 84
            if (r0 == 0) goto L25
            r0 = 95
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == r1) goto L54
            goto L3b
        L29:
            r7 = move-exception
            throw r7
        L2b:
            com.ironsource.adqualitysdk.sdk.i.av r0 = m967()
            boolean r0 = r0.ﾒ()
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L37:
            r0 = 1
        L38:
            if (r0 == 0) goto L3b
            goto L54
        L3b:
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f651
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f653 = r1
            int r0 = r0 % 2
            android.content.Context r0 = r7.getContext()
            boolean r0 = m957(r0)
            if (r0 == 0) goto L54
            android.webkit.WebViewClient r7 = r7.getWebViewClient()
            goto L60
        L54:
            com.ironsource.adqualitysdk.sdk.i.ht r7 = m959(r7)
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r7.ｋ()
            android.webkit.WebViewClient r7 = (android.webkit.WebViewClient) r7
        L60:
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f653
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f651 = r1
            int r0 = r0 % 2
            return r7
        L6b:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r0 = 48
            java.lang.String r1 = ""
            int r0 = android.text.TextUtils.lastIndexOf(r1, r0, r2)
            int r0 = 11 - r0
            int r1 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r1 = r1 >> 8
            int r1 = 33 - r1
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 165 - r3
            java.lang.String r4 = "￦\u000f\f\b\u0011\u0017ￃ\t\f\b\u000f\u0007￦\u0012\u0018\u000f\u0007\u0011ￊ\u0017ￃ\t\f\u0011\u0007ￃ\ufffa\b\u0005\ufff9\f\b\u001a"
            java.lang.String r0 = m964(r0, r1, r3, r4, r2)
            java.lang.String r0 = r0.intern()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kh.m966(android.webkit.WebView):android.webkit.WebViewClient");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebChromeClient m961(android.webkit.WebView r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f651
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f653 = r1
            int r0 = r0 % 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L3b
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f651
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f653 = r1
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.av r0 = m967()
            boolean r0 = r0.ﱟ()
            if (r0 == 0) goto L3b
            android.content.Context r0 = r5.getContext()
            boolean r0 = m973(r0)
            if (r0 == 0) goto L32
            r0 = r2
            goto L33
        L32:
            r0 = r3
        L33:
            if (r0 == r2) goto L36
            goto L3b
        L36:
            android.webkit.WebChromeClient r5 = r5.getWebChromeClient()
            goto L47
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ht r5 = m969(r5)
            if (r5 == 0) goto L62
            java.lang.Object r5 = r5.ｋ()
            android.webkit.WebChromeClient r5 = (android.webkit.WebChromeClient) r5
        L47:
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f653
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f651 = r1
            int r0 = r0 % 2
            r1 = 43
            if (r0 != 0) goto L57
            r0 = r1
            goto L59
        L57:
            r0 = 48
        L59:
            if (r0 == r1) goto L5c
            return r5
        L5c:
            r0 = 87
            int r0 = r0 / r3
            return r5
        L60:
            r5 = move-exception
            throw r5
        L62:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r0 = r0 + 29
            int r1 = android.view.KeyEvent.getDeadChar(r3, r3)
            int r1 = r1 + 35
            java.lang.String r3 = ""
            int r3 = android.os.Process.getGidForName(r3)
            int r3 = r3 + 166
            java.lang.String r4 = "\u0016\u0010\u0007\u000b\u000e￥\u0007\u000f\u0011\u0014\n￥\u0004\u0007\ufff9ￂ\u0006\u0010\u000b\bￂ\u0016\uffc9\u0010\u0006\u000e\u0017\u0011￥\u0006\u000e\u0007\u000b\bￂ"
            java.lang.String r0 = m964(r0, r1, r3, r4, r2)
            java.lang.String r0 = r0.intern()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kh.m961(android.webkit.WebView):android.webkit.WebChromeClient");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m958(WebView webView) {
        int i = f651 + 51;
        f653 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        boolean z = m966(webView) instanceof hh;
        int i3 = f651 + 25;
        f653 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '!' : 'F') == 'F') {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ht<WebViewClient> m959(WebView webView) {
        int i = f651 + 91;
        f653 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m968(webView.getContext());
        ht<WebViewClient> htVarM970 = m970(webView, m955(), f650);
        int i3 = f651 + 47;
        f653 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            throw null;
        }
        return htVarM970;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static ht<WebChromeClient> m969(WebView webView) {
        int i = f653 + 15;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            m968(webView.getContext());
            return m970(webView, m963(), f652);
        }
        m968(webView.getContext());
        m970(webView, m963(), f652);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m968(Context context) {
        int i = f653 + 67;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (f655) {
            f655 = false;
            try {
                WebView webView = new WebView(context);
                hh hhVar = new hh((WebViewClient) null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.3
                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded("com.supersonicads", view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        BrandSafetyUtils.onWebViewPageFinished("com.supersonicads", view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        super.onPageStarted(view, url, favicon);
                        BrandSafetyUtils.onWebViewPageStarted("com.supersonicads", view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                        super.onReceivedError(view, errorCode, description, failingUrl);
                        BrandSafetyUtils.onWebViewReceivedError("com.supersonicads", view, errorCode, description, failingUrl);
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders("com.supersonicads", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                        BrandSafetyUtils.onShouldOverrideUrlLoading("com.supersonicads", view, url, zShouldOverrideUrlLoading);
                        return zShouldOverrideUrlLoading;
                    }
                });
                webView.setWebViewClient(hhVar);
                hl hlVar = new hl((WebChromeClient) null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.1
                });
                webView.setWebChromeClient(hlVar);
                f650 = m956(webView, hhVar, m955());
                f652 = m956(webView, hlVar, m963());
                int i3 = f653 + 43;
                f651 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                kb.ﾇ(m964(5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarSize() >> 8) + 12, ImageFormat.getBitsPerPixel(0) + 174, "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m964((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, Gravity.getAbsoluteGravity(0, 0) + 167, "\u000b\u0003\u0005\b\u0003\uffc0\u0012\u000f\u0012\u0012￥\u0013\u0014\u000e\u0005\t\f\u0003\uffc0\u0012\u0005\u000e\u000e\t\uffc0\u0012\u000f\u0006\uffc0\u0007\u000e\t", true).intern(), th, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m957(android.content.Context r9) {
        /*
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.kh.f654
            if (r0 == 0) goto L89
            r0 = 1
            r1 = 8
            r2 = 0
            com.ironsource.adqualitysdk.sdk.i.kh.f654 = r2     // Catch: java.lang.Throwable -> L40
            android.webkit.WebView r3 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L40
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L40
            com.ironsource.adqualitysdk.sdk.i.hh r9 = new com.ironsource.adqualitysdk.sdk.i.hh     // Catch: java.lang.Throwable -> L40
            r4 = 0
            com.ironsource.adqualitysdk.sdk.i.kh$4 r5 = new com.ironsource.adqualitysdk.sdk.i.kh$4     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L40
            r3.setWebViewClient(r9)     // Catch: java.lang.Throwable -> L40
            android.webkit.WebViewClient r3 = r3.getWebViewClient()     // Catch: java.lang.Throwable -> L40
            if (r9 != r3) goto L25
            r9 = r2
            goto L26
        L25:
            r9 = r0
        L26:
            if (r9 == 0) goto L2a
        L28:
            r9 = r2
            goto L3d
        L2a:
            int r9 = com.ironsource.adqualitysdk.sdk.i.kh.f651
            int r9 = r9 + 95
            int r3 = r9 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f653 = r3
            int r9 = r9 % 2
            if (r9 == 0) goto L38
            r9 = r1
            goto L3a
        L38:
            r9 = 61
        L3a:
            if (r9 == r1) goto L28
            r9 = r0
        L3d:
            com.ironsource.adqualitysdk.sdk.i.kh.f658 = r9     // Catch: java.lang.Throwable -> L40
            goto L89
        L40:
            r9 = move-exception
            int r3 = android.graphics.ImageFormat.getBitsPerPixel(r2)
            int r3 = 4 - r3
            int r4 = android.view.ViewConfiguration.getTouchSlop()
            int r1 = r4 >> 8
            int r1 = 12 - r1
            float r4 = android.media.AudioTrack.getMaxVolume()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = 174 - r4
            java.lang.String r5 = "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011"
            java.lang.String r1 = m964(r3, r1, r4, r5, r2)
            java.lang.String r1 = r1.intern()
            int r3 = android.os.Process.getThreadPriority(r2)
            int r3 = r3 + 20
            int r3 = r3 >> 6
            int r3 = r3 + 24
            r4 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r6 = r6 + 36
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r4 = r4 + 164
            java.lang.String r5 = "\ufff9ￂ\u0007\u000f\u0003\u0015ￂ\b\u000bￂ\t\u0010\u000b\r\u0005\u0007\n\u0005ￂ\u0014\u0011\u0014\u0014\uffe7\u0016\u0010\u0007\u000b\u000e￥\u0019\u0007\u000b\ufff8\u0004\u0007"
            java.lang.String r0 = m964(r3, r6, r4, r5, r0)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.i.kb.ﾇ(r1, r0, r9, r2)
        L89:
            boolean r9 = com.ironsource.adqualitysdk.sdk.i.kh.f658
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f651
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kh.f653 = r1
            int r0 = r0 % 2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kh.m957(android.content.Context):boolean");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m973(Context context) {
        if (f657) {
            boolean z = false;
            f657 = false;
            WebView webView = new WebView(context);
            WebChromeClient hlVar = new hl((WebChromeClient) null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.2
            });
            webView.setWebChromeClient(hlVar);
            if ((hlVar == webView.getWebChromeClient() ? (char) 15 : '0') != 15) {
                int i = f653 + 85;
                f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
            } else {
                int i3 = f651 + 21;
                f653 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                z = true;
            }
            f656 = z;
        }
        return f656;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> d m956(WebView webView, T t, hy hyVar) {
        d dVar = new d((byte) 0);
        ht htVarM971 = m971(webView, hyVar, (List<String>) m967().ﾇ(), m967().ﻛ());
        if (htVarM971 != null) {
            int i = f653 + 59;
            f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            Object obj = htVarM971.ｋ();
            if (obj != t) {
                ht htVarM962 = m962(obj, hyVar, m967().ｋ(), m967().ﻐ());
                if (htVarM962 != null) {
                    if ((htVarM962.ｋ() == t ? (char) 19 : ']') == 19) {
                        int i3 = f653 + 89;
                        f651 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        int i4 = i3 % 2;
                        dVar.m981();
                    }
                }
            } else {
                int i5 = f651 + 95;
                f653 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                byte b = i5 % 2 != 0 ? (byte) 1 : (byte) 0;
                dVar.m978();
                if (b != 0) {
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
            }
        }
        return dVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m970(WebView webView, hy hyVar, d dVar) {
        int i = f653 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kb.ﾇ(m964((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, 12 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 173 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m964(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - (ViewConfiguration.getTouchSlop() >> 8), 169 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "￤\u0003\u000b\u0004\b\u0005\uffbf\u0013\r\u0004\b\u000b\u0002\uffbf\u0006\r\b\u0013\u0013\u0004\u0006\uffbf\u0011\u000e\u0011\u0011", true).intern(), th, false);
        }
        if (i % 2 != 0) {
            if (dVar.m980()) {
                int i2 = f651 + 107;
                f653 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i2 % 2 == 0) {
                    ht<T> htVarM971 = m971(webView, hyVar, (List<String>) m967().ﾇ(), m967().ﻛ());
                    if ((dVar.m979() ? (char) 28 : '[') != '[' && htVarM971 != null) {
                        Object obj2 = htVarM971.ｋ();
                        if (obj2 != null) {
                            if ((obj2.getClass().equals(htVarM971.ﾇ().getType()) ? 'a' : (char) 6) != 'a') {
                                htVarM971 = m962(obj2, hyVar, m967().ｋ(), m967().ﻐ());
                            }
                        }
                        return htVarM971;
                    }
                    int i3 = f651 + 71;
                    f653 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if (i3 % 2 == 0) {
                        return htVarM971;
                    }
                    throw null;
                }
                m971(webView, hyVar, (List<String>) m967().ﾇ(), m967().ﻛ());
                dVar.m979();
                super.hashCode();
                throw null;
            }
            int i4 = f651 + 37;
            f653 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        dVar.m980();
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m971(WebView webView, hy hyVar, List<String> list, int i) {
        int i2 = f653 + 77;
        f651 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ht<T> htVarM972 = m972((Object) webView, hyVar, list, i);
        int i4 = f651 + 89;
        f653 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 == 0) {
            return htVarM972;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> ht<T> m962(T t, hy hyVar, List<String> list, int i) {
        int i2 = f651 + 87;
        f653 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ht<T> htVarM972 = m972(t, hyVar, list, i);
        int i4 = f653 + 57;
        f651 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            return htVarM972;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> ht<T> m972(Object obj, hy hyVar, final List<String> list, int i) {
        ht<T> htVar = hr.ﻛ().ﾒ().ｋ(obj, hyVar, new hq() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.5
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final Field[] m974(Object obj2) {
                hr.ﻛ().ｋ();
                return ho.ﾒ(obj2.getClass(), true, -1, list);
            }
        }, list, i);
        int i2 = f653 + 55;
        f651 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return htVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static hy m955() {
        hy hyVar = new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.6
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final boolean m975(ht htVar) {
                return WebViewClient.class.equals(htVar.ﾇ().getType());
            }
        };
        int i = f651 + 67;
        f653 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return hyVar;
        }
        int i2 = 38 / 0;
        return hyVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static hy m963() {
        hy hyVar = new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.9
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final boolean m976(ht htVar) {
                return WebChromeClient.class.equals(htVar.ﾇ().getType());
            }
        };
        int i = f653 + 65;
        f651 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return hyVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static class d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f660;

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f661;

        private d() {
            this.f661 = false;
            this.f660 = false;
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean m977() {
            return this.f661;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        final void m978() {
            this.f661 = true;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        final boolean m979() {
            return this.f660;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        final void m981() {
            this.f660 = true;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        final boolean m980() {
            return m977() || m979();
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m964(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (b.ﻛ) {
            char[] cArr2 = new char[i2];
            b.ｋ = 0;
            while (b.ｋ < i2) {
                b.ﻐ = cArr[b.ｋ];
                cArr2[b.ｋ] = (char) (b.ﻐ + i3);
                int i4 = b.ｋ;
                cArr2[i4] = (char) (cArr2[i4] - f649);
                b.ｋ++;
            }
            if (i > 0) {
                b.ﾇ = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - b.ﾇ, b.ﾇ);
                System.arraycopy(cArr3, b.ﾇ, cArr2, 0, i2 - b.ﾇ);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                b.ｋ = 0;
                while (b.ｋ < i2) {
                    cArr4[b.ｋ] = cArr2[(i2 - b.ｋ) - 1];
                    b.ｋ++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
