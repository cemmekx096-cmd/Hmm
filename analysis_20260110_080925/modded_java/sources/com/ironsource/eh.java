package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.crashlytics.android.BuildConfig;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.zh;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class eh implements zh {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "eh";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private ch d;
    private xg e;
    private Context f;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (eh.this.c != null) {
                ph.a(ir.q, new kh().a("callfailreason", eh.g).a());
            }
            try {
                eh.this.b(this.a);
                IronSourceNetworkBridge.webviewLoadUrl(eh.this.c, eh.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", eh.this.a);
                eh.this.d.a(this.c, jSONObjectJsonObjectInit);
            } catch (Exception e) {
                n9.d().a(e);
                eh.this.b(this.a, e.getMessage());
                ph.a(ir.q, new kh().a("callfailreason", e.getMessage()).a());
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (eh.this.c != null) {
                    eh.this.c.destroy();
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", eh.this.a);
                if (eh.this.d != null) {
                    eh.this.d.a(this.a, jSONObjectJsonObjectInit);
                    eh.this.d.b();
                }
                eh.this.d = null;
                eh.this.f = null;
            } catch (Exception e) {
                n9.d().a(e);
                Log.e(eh.h, "performCleanup | could not destroy ISNAdView webView ID: " + eh.this.a);
                ph.a(ir.r, new kh().a("callfailreason", e.getMessage()).a());
                eh.this.b(this.b, e.getMessage());
            }
        }
    }

    class c implements zh.a {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        public void a(String str) {
            Logger.i(eh.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            eh.this.b(this.a, str);
        }

        public void b(String str) {
            Logger.i(eh.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) eh.this.c.getParent()).removeView(eh.this.c);
            } catch (Exception e) {
                n9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            eh.this.e();
        }
    }

    private class d extends WebChromeClient {
        private d() {
        }

        /* synthetic */ d(eh ehVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/eh$d;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
            boolean zSafedk_eh$d_onCreateWindow_6e58eb6bcf527a1a55af0e15d630e324 = safedk_eh$d_onCreateWindow_6e58eb6bcf527a1a55af0e15d630e324(webView, z, z2, message);
            BrandSafetyUtils.onWebChromeClientCreateWindow("com.supersonicads", webView, message, zSafedk_eh$d_onCreateWindow_6e58eb6bcf527a1a55af0e15d630e324);
            return zSafedk_eh$d_onCreateWindow_6e58eb6bcf527a1a55af0e15d630e324;
        }

        public boolean safedk_eh$d_onCreateWindow_6e58eb6bcf527a1a55af0e15d630e324(WebView p0, boolean p1, boolean p2, Message p3) {
            WebView webView = new WebView(p0.getContext());
            webView.setWebChromeClient(eh.this.new d());
            webView.setWebViewClient(new e(eh.this, null));
            ((WebView.WebViewTransport) p3.obj).setWebView(webView);
            p3.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    private class e extends WebViewClient {
        private e() {
        }

        /* synthetic */ e(eh ehVar, a aVar) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, "com.supersonicads");
            p0.startActivity(p1);
        }

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
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(eh.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_eh$e_shouldOverrideUrlLoading_15196d83206a29a107c467e504dc4d5b(WebView p0, String p1) {
            Context context = p0.getContext();
            Intent intentA = new OpenUrlActivity.e(new k.b()).a(p1).b(false).a(context);
            intentA.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.supersonicads", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/eh$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_eh$e_shouldOverrideUrlLoading_15196d83206a29a107c467e504dc4d5b = safedk_eh$e_shouldOverrideUrlLoading_15196d83206a29a107c467e504dc4d5b(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.supersonicads", webView, str, zSafedk_eh$e_shouldOverrideUrlLoading_15196d83206a29a107c467e504dc4d5b);
            return zSafedk_eh$e_shouldOverrideUrlLoading_15196d83206a29a107c467e504dc4d5b;
        }
    }

    public eh(ah ahVar, Context context, String str, xg xgVar) {
        this.f = context;
        ch chVar = new ch();
        this.d = chVar;
        chVar.g(str);
        this.a = str;
        this.d.a(ahVar);
        this.e = xgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return c(str) ? i + this.b + d(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, new bh(this), "containerMsgHandler");
        this.c.setWebViewClient(new dh(new c(str)));
        this.c.setWebChromeClient(new d(this, null));
        tw.a(this.c);
        this.d.a(this.c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        lg.a.d(new b(str, str2));
    }

    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.c.onPause();
            } else {
                if (!str.equals("onResume")) {
                    b(str3, "action not supported");
                    return;
                }
                this.c.onResume();
            }
            this.d.f(str2);
        } catch (Exception e2) {
            n9.d().a(e2);
            b(str3, "failed to perform action");
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            n9.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    public String b() {
        return this.a;
    }

    public void b(String str, String str2) {
        ch chVar = this.d;
        if (chVar != null) {
            chVar.a(str, str2);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) {
        lg.a.d(new a(str2, jSONObject, str));
    }

    public ch c() {
        return this.d;
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            n9.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    public xg d() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }
}
