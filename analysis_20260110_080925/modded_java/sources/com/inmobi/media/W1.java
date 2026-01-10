package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.W1$;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class W1 extends WebViewClient {
    public final f5 a;
    public boolean c;
    public boolean d;
    public int b = -1;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public W1(f5 f5Var) {
        this.a = f5Var;
    }

    public final void a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "view");
        this.e.set(true);
        webView.postDelayed(new W1$.ExternalSyntheticLambda0(this), 1000L);
    }

    public final void b(WebView webView) {
        Y y;
        String strB;
        String str;
        Y y2;
        String strM;
        R0 r0;
        int i = this.b;
        if (-1 != i) {
            if (i > 0) {
                this.b = i - 1;
                return;
            }
            if (this.c) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new g9(webView));
            this.c = true;
            if (webView instanceof Ya) {
                Ya ya = (Ya) webView;
                g5 g5Var = ya.i;
                if (g5Var != null) {
                    String str2 = Ya.P0;
                    g5Var.a(str2, Wa.a(ya, str2, "TAG", "sendTelemetryEventForNetworkLoad "));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String creativeId = ya.getCreativeId();
                if (creativeId != null) {
                    linkedHashMap.put("creativeId", creativeId);
                }
                String impressionId = ya.getImpressionId();
                if (impressionId != null) {
                    linkedHashMap.put("impressionId", impressionId);
                }
                linkedHashMap.put("errorCode", Short.valueOf(ya.m0 ? (short) 2212 : (short) 2211));
                bb bbVar = ya.h;
                if (bbVar != null && (r0 = bbVar.i) != null) {
                    linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - r0.a.c));
                }
                bb bbVar2 = ya.h;
                if (bbVar2 != null && (y2 = bbVar2.a) != null && (strM = y2.m()) != null) {
                    linkedHashMap.put("plType", strM);
                }
                bb bbVar3 = ya.h;
                if (bbVar3 != null) {
                    linkedHashMap.put("creativeType", bbVar3.e);
                }
                bb bbVar4 = ya.h;
                if (bbVar4 != null && (str = bbVar4.b) != null) {
                    linkedHashMap.put("markupType", str);
                }
                bb bbVar5 = ya.h;
                if (bbVar5 != null && (y = bbVar5.a) != null && (strB = y.b()) != null) {
                    linkedHashMap.put("adType", strB);
                }
                bb bbVar6 = ya.h;
                if (bbVar6 != null) {
                    linkedHashMap.put("metadataBlob", bbVar6.c);
                }
                bb bbVar7 = ya.h;
                if (bbVar7 != null) {
                    linkedHashMap.put("isRewarded", Boolean.valueOf(bbVar7.g));
                }
                g5 g5Var2 = ya.i;
                if (g5Var2 != null) {
                    String str3 = Ya.P0;
                    g5Var2.a(str3, Wa.a(ya, str3, "TAG", "processTelemetryEvent "));
                }
                ya.getListener().a("NetworkLoadLimitExceeded", linkedHashMap);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.inmobi", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/W1;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewPageFinished("com.inmobi", webView, str);
        safedk_W1_onPageFinished_6b187dd8b613b1d8677945dee9898d34(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted("com.inmobi", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError("com.inmobi", view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(renderProcessGoneDetail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        I6.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        webView.destroy();
        return true;
    }

    public void safedk_W1_onPageFinished_6b187dd8b613b1d8677945dee9898d34(WebView p0, String p1) {
        if (this.d) {
            this.d = false;
            if (p0 != null) {
                p0.clearHistory();
            }
        }
        super.onPageFinished(p0, p1);
    }

    public WebResourceResponse safedk_W1_shouldInterceptRequest_af73339a2e902eca4d35a98fd8637679(WebView p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "view");
        Intrinsics.checkNotNullParameter(p1, "url");
        if (Build.VERSION.SDK_INT < 21) {
            b(p0);
        }
        WebResourceResponse webResourceResponseA = Dd.a(p1, this.a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(p0, p1) : webResourceResponseA;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/W1;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.inmobi", webView, webResourceRequest, safedk_W1_shouldInterceptRequest_bd722b1839990434175093f82cfab268(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/W1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse("com.inmobi", webView, str, safedk_W1_shouldInterceptRequest_af73339a2e902eca4d35a98fd8637679(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.inmobi", view, url, zShouldOverrideUrlLoading);
        return zShouldOverrideUrlLoading;
    }

    public static final void a(W1 w1) {
        Intrinsics.checkNotNullParameter(w1, "this$0");
        w1.e.set(false);
    }

    public WebResourceResponse safedk_W1_shouldInterceptRequest_bd722b1839990434175093f82cfab268(WebView p0, WebResourceRequest p1) {
        WebResourceResponse webResourceResponseA;
        Intrinsics.checkNotNullParameter(p0, "view");
        Intrinsics.checkNotNullParameter(p1, AdActivity.REQUEST_KEY_EXTRA);
        b(p0);
        f5 f5Var = this.a;
        Intrinsics.checkNotNullParameter(p1, AdActivity.REQUEST_KEY_EXTRA);
        Intrinsics.checkNotNullParameter(p1, "<this>");
        if (StringsKt.equals(HttpRequest.METHOD_GET, p1.getMethod(), true)) {
            String string = p1.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            webResourceResponseA = Dd.a(string, f5Var);
        } else {
            webResourceResponseA = null;
        }
        return webResourceResponseA == null ? super.shouldInterceptRequest(p0, p1) : webResourceResponseA;
    }
}
