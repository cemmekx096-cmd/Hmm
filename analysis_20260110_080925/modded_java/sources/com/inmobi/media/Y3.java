package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import com.google.firebase.messaging.Constants;
import com.inmobi.commons.core.configs.AdConfig;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Y3 extends V1 implements Aa {
    public long b;
    public final String c;
    public final String d;
    public final String e;
    public final f5 f;
    public final U3 g;
    public final String h;
    public final AdConfig.RenderingConfig i;
    public final Lazy j;
    public t6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Context context, long j, String str, String str2, String str3, f5 f5Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "placementType");
        Intrinsics.checkNotNullParameter(str2, "impressionId");
        Intrinsics.checkNotNullParameter(str3, "creativeId");
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = f5Var;
        this.h = "Y3";
        LinkedHashMap linkedHashMap = K2.a;
        this.i = V4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null).getRendering();
        this.j = LazyKt.lazy(V3.a);
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        U3 u3 = new U3("IN_CUSTOM_EXPAND", new W3(this), new X3(this), f5Var);
        setWebViewClient(u3);
        this.g = u3;
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            if (i >= 21) {
                cookieManager.setAcceptThirdPartyCookies(this, true);
            }
        }
    }

    private final AdConfig getAdConfig() {
        return (AdConfig) this.j.getValue();
    }

    private void safedk_webview_Y3_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p1, String p2, String p3) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/Y3;->safedk_webview_Y3_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + this + ", isSafeDKInitialized = " + z + ", SDK_PACKAGE_NAME = com.inmobi");
        if (z) {
            CreativeInfoManager.a((String) null, p1, this, "com.inmobi");
            SafeDKWebAppInterface.a("com.inmobi", this, p1, true);
        }
        super.loadData(p1, p2, p3);
    }

    private void safedk_webview_Y3_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String p1) {
        Logger.d("InMobiNetwork|SafeDK: Partial-Network> Lcom/inmobi/media/Y3;->safedk_webview_Y3_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + p1 + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = com.inmobi");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(p1) || p1.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : " + p1);
            } else {
                NetworkBridge.logWebviewLoadURLRequest("com.inmobi", this, p1);
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i("com.inmobi");
                if (adNetworkDiscoveryI != null && adNetworkDiscoveryI.d().b(AdNetworkConfiguration.B)) {
                    CreativeInfoManager.a(p1, (String) null, this, "com.inmobi");
                }
                SafeDKWebAppInterface.a("com.inmobi", this, p1, true);
            }
        }
        super.loadUrl(p1);
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.e);
        map.put("trigger", str);
        map.put("impressionId", this.d);
        map.put("adType", this.c);
        ic icVar = ic.a;
        ic.b("BlockAutoRedirection", map, mc.a);
    }

    public final boolean d() {
        Intrinsics.checkNotNullExpressionValue(this.h, "TAG");
        return !this.i.getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > this.i.getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == this.i.getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.V1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.inmobi.media.V1
    public final o6 f() {
        p6 p6Var = new p6(true, "DEFAULT", getAdConfig().isCCTEnabled(), false);
        Context context = getContext();
        f5 f5Var = this.f;
        Intrinsics.checkNotNull(context);
        return new o6(context, p6Var, (c2) null, (Ra) null, this, (u6) null, f5Var);
    }

    public final t6 getLandingPageTelemetryControlInfo() {
        return this.k;
    }

    public long getViewTouchTimestamp() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        safedk_webview_Y3_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        U3 u3 = this.g;
        if (u3 != null) {
            u3.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        safedk_webview_Y3_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
        U3 u3 = this.g;
        if (u3 != null) {
            u3.d = true;
        }
    }

    @Override // com.inmobi.media.V1, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(t6 t6Var) {
        this.k = t6Var;
        U3 u3 = this.g;
        if (u3 == null) {
            return;
        }
        u3.i = t6Var;
        u3.j = new q6(t6Var, u3);
    }

    public void setViewTouchTimestamp(long j) {
        this.b = j;
    }
}
