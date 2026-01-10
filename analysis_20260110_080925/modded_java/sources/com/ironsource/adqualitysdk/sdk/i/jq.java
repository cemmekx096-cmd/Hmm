package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.bb;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class jq implements jk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, jq> f628 = new WeakHashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f629;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set<jk> f630 = new HashSet();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private js f631;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static jq m920(WebView webView, String str) {
        jq jqVar = f628.get(webView);
        if (jqVar != null) {
            return jqVar;
        }
        jq jqVar2 = new jq(webView, str);
        f628.put(webView, jqVar2);
        return jqVar2;
    }

    private jq(WebView webView, String str) {
        this.f629 = str;
        js jsVar = new js(webView);
        this.f631 = jsVar;
        jsVar.ﻐ(new AnonymousClass3());
        this.f631.ﾒ(new AnonymousClass4());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m925() {
        this.f631.ﻐ(new AnonymousClass3());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m931() {
        this.f631.ﾒ(new AnonymousClass4());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m929(jk jkVar) {
        this.f630.add(jkVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m924(jk jkVar) {
        this.f630.remove(jkVar);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m930() {
        return this.f631.ｋ();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final WebView m926() {
        return this.f631.ﾇ();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final bb.e m922() {
        return this.f631.ﻐ();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m927(WebView webView) {
        for (jk jkVar : new HashSet(this.f630)) {
            if (jkVar != null) {
                jkVar.ﾇ(webView);
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m928(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f630)) {
            if (jkVar != null) {
                jkVar.ﾇ(webView, str, str2);
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m923(WebView webView, String str, boolean z) {
        for (jk jkVar : new HashSet(this.f630)) {
            if (jkVar != null) {
                jkVar.ﻐ(webView, str, z);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m932(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f630)) {
            if (jkVar != null) {
                jkVar.ﾒ(webView, str);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jq$3, reason: invalid class name */
    final class AnonymousClass3 extends WebViewClient {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f633 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f634 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f635 = null;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.supersonicads", view, url);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/jq$3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewPageFinished("com.supersonicads", webView, str);
            safedk_jq$3_onPageFinished_9b75a423c708f3b67bd53fb506c3caa3(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/jq$3;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted("com.supersonicads", webView, str);
            safedk_jq$3_onPageStarted_0509c0f45e3f9ae3a8c86eca4be710b3(webView, str, bitmap);
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
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/jq$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean zSafedk_jq$3_shouldOverrideUrlLoading_353412f924ee1dd0ca925295de94f956 = safedk_jq$3_shouldOverrideUrlLoading_353412f924ee1dd0ca925295de94f956(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.supersonicads", webView, webResourceRequest, zSafedk_jq$3_shouldOverrideUrlLoading_353412f924ee1dd0ca925295de94f956);
            return zSafedk_jq$3_shouldOverrideUrlLoading_353412f924ee1dd0ca925295de94f956;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/jq$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_jq$3_shouldOverrideUrlLoading_14a21079a609a9332ab84f12404c40ec = safedk_jq$3_shouldOverrideUrlLoading_14a21079a609a9332ab84f12404c40ec(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.supersonicads", webView, str, zSafedk_jq$3_shouldOverrideUrlLoading_14a21079a609a9332ab84f12404c40ec);
            return zSafedk_jq$3_shouldOverrideUrlLoading_14a21079a609a9332ab84f12404c40ec;
        }

        AnonymousClass3() {
        }

        public void safedk_jq$3_onPageStarted_0509c0f45e3f9ae3a8c86eca4be710b3(WebView p0, String p1, Bitmap p2) {
            jq.this.m927(p0);
            this.f633 = true;
        }

        public void safedk_jq$3_onPageFinished_9b75a423c708f3b67bd53fb506c3caa3(WebView p0, String p1) {
            jq.this.m927(p0);
            this.f633 = false;
            this.f634 = true;
            String p12 = this.f635;
            if (p12 == null) {
                this.f635 = p0.getOriginalUrl();
            }
        }

        public boolean safedk_jq$3_shouldOverrideUrlLoading_14a21079a609a9332ab84f12404c40ec(WebView p0, String p1) {
            if (m934(p0, p1)) {
                return true;
            }
            if (this.f635 == null) {
                this.f635 = p0.getOriginalUrl();
            }
            jq.this.m923(p0, p1, m933(p0));
            this.f634 = true;
            this.f633 = false;
            return false;
        }

        public boolean safedk_jq$3_shouldOverrideUrlLoading_353412f924ee1dd0ca925295de94f956(WebView p0, WebResourceRequest p1) {
            return shouldOverrideUrlLoading(p0, p1.getUrl().toString());
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean m933(WebView webView) {
            if (this.f633 && this.f634) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f635 == null || webView.getOriginalUrl().equals(this.f635)) ? false : true;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean m934(WebView webView, String str) {
            if (!str.startsWith(jq.this.f629)) {
                return false;
            }
            this.f635 = webView.getOriginalUrl();
            String strSubstring = str.substring(jq.this.f629.length());
            jq jqVar = jq.this;
            jqVar.m928(webView, jqVar.f629, strSubstring);
            return true;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jq$4, reason: invalid class name */
    final class AnonymousClass4 extends WebChromeClient {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean f637 = false;

        AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jq.this.m932(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i != 100 || this.f637) {
                return;
            }
            this.f637 = true;
            jq.this.m927(webView);
        }
    }
}
