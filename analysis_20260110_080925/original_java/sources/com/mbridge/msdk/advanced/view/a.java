package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import org.slf4j.Marker;

/* compiled from: NativeAdvancedWebViewClient.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class a extends b {
    private final String c = "NativeAdvancedWebViewClient";
    private final String d;
    private final String e;
    String f;
    com.mbridge.msdk.advanced.middle.a g;
    private c h;

    /* compiled from: NativeAdvancedWebViewClient.java */
    /* renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    class C0038a implements ValueCallback<String> {
        C0038a() {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.c;
        this.d = e.b(cVar2) != null ? e.b(cVar2) : i0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.e = i0.a("Y+xgWkl2");
        this.f = str;
        this.g = aVar;
        this.h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.h != null) {
            try {
                boolean zStartsWith = str.startsWith("file");
                String strA = BuildConfig.FLAVOR;
                if (zStartsWith && str.startsWith(this.d)) {
                    strA = str.replace("file://", BuildConfig.FLAVOR);
                }
                if (a(str)) {
                    strA = this.h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.d)) {
                    o0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
                        WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, "utf-8", new FileInputStream(strA));
                        if (Build.VERSION.SDK_INT >= 21) {
                            webResourceResponse.setResponseHeaders(map);
                        }
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th) {
                o0.b("NativeAdvancedWebViewClient", th.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.h != null) {
            this.h = null;
        }
    }

    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.mintegral.msdk", view, url);
    }

    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        BrandSafetyUtils.onWebViewPageFinished("com.mintegral.msdk", view, url);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted("com.mintegral.msdk", webView, str);
        safedk_a_onPageStarted_0d1a3c6a21900a20a8eabbc7d3b03e91(webView, str, bitmap);
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError("com.mintegral.msdk", view, errorCode, description, failingUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void safedk_a_onPageStarted_0d1a3c6a21900a20a8eabbc7d3b03e91(WebView p0, String p1, Bitmap p2) {
        super/*android.webkit.WebViewClient*/.onPageStarted(p0, p1, p2);
        try {
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append(com.mbridge.msdk.setting.util.a.a().b());
            if (Build.VERSION.SDK_INT <= 19) {
                String p12 = sb.toString();
                MintegralNetworkBridge.webviewLoadUrl(p0, p12);
            } else {
                String p13 = sb.toString();
                p0.evaluateJavascript(p13, new C0038a());
            }
        } catch (Throwable th) {
            o0.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    public WebResourceResponse safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(WebView p0, String p1) {
        return a(p0, p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.webkit.WebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView] */
    public boolean safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(WebView webView, String p1) {
        try {
            try {
                ?? r7 = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - ((BaseWebView) r7).lastTouchTime > com.mbridge.msdk.click.utils.a.c) {
                    if (com.mbridge.msdk.click.utils.a.a((CampaignEx) ((com.mbridge.msdk.advanced.signal.b) r7.getObject()).a().get(0), r7.getUrl(), com.mbridge.msdk.click.utils.a.b)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                o0.b("NativeAdvancedWebViewClient", e.getMessage());
            }
            o0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, p1);
            return true;
        } catch (Throwable th) {
            o0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.mintegral.msdk", webView, webResourceRequest, safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(webView, webResourceRequest));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("com.mintegral.msdk", webView, str, safedk_a_shouldInterceptRequest_f98edc53b84eb6cd8b74482c601d3e96(webView, str));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/advanced/view/a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee = safedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.mintegral.msdk", webView, str, zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee);
        return zSafedk_a_shouldOverrideUrlLoading_1bf5980e67d7970818001cd10d413aee;
    }

    public WebResourceResponse safedk_a_shouldInterceptRequest_760d8c02192100f041c6f359c7ace52c(WebView p0, WebResourceRequest p1) {
        return a(p0, Build.VERSION.SDK_INT >= 21 ? p1.getUrl().toString() : BuildConfig.FLAVOR);
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.e) || scheme.equals("mb-h5");
    }
}
