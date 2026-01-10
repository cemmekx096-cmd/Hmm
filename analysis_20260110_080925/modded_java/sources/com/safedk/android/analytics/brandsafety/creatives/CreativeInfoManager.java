package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import com.android.volley.Response;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.brandsafety.u;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKSource;
import com.safedk.android.internal.SafeDKSourceMBridge;
import com.safedk.android.internal.SafeDKSourceMintegral;
import com.safedk.android.internal.e;
import com.safedk.android.internal.f;
import com.safedk.android.internal.g;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkDependency;
import com.safedk.android.utils.annotations.SDKDependancy;
import com.safedk.android.utils.n;
import com.unity3d.services.core.di.ServiceProvider;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.BufferedSource;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class CreativeInfoManager {
    private static final String A = "ADMOB_BIDDING";
    private static final String B = "ADMOB_NATIVE_NETWORK";
    private static final String C = "GOOGLE_AD_MANAGER_DIRECT_SOLD";
    private static final String D = "MINTEGRAL_NETWORK";
    private static final String E = "MINTEGRAL_BIDDING";
    private static final String F = "MINTEGRAL_NATIVE_BIDDING";
    private static final String G = "FYBER_NETWORK";
    private static final String H = "FYBER_BIDDING";
    private static final String I = "INNERACTIVE_BIDDING";
    private static final String J = "ADCOLONY_NETWORK";
    private static final String K = "ADCOLONY_BIDDING";
    private static final String L = "AMAZON_NETWORK";
    private static final String M = "AMAZON_BIDDING";
    private static final String N = "AMAZON_MARKETPLACE_NETWORK";
    private static final String O = "CHARTBOOST_NETWORK";
    private static final String P = "CHARTBOOST_BIDDING";
    private static final String Q = "GOOGLE_AD_MANAGER_NETWORK";
    private static final String R = "GOOGLE_AD_MANAGER_BIDDING";
    private static final String S = "GOOGLE_AD_MANAGER_NATIVE_NETWORK";
    private static final String T = "INMOBI_NETWORK";
    private static final String U = "INMOBI_BIDDING";
    private static final String V = "INMOBI_NATIVE_BIDDING";
    private static final String W = "MAIO_NETWORK";
    private static final String X = "MAIO_BIDDING";
    private static final String Y = "MYTARGET_NETWORK";
    private static final String Z = "MYTARGET_BIDDING";
    public static final String a = "mime-type";
    private static boolean aC = false;
    private static final String aa = "NEND_NETWORK";
    private static final String ab = "NEND_BIDDING";

    /* renamed from: ac, reason: collision with root package name */
    private static final String f664ac = "OGURY_NETWORK";
    private static final String ad = "OGURY_BIDDING";
    private static final String ae = "OGURY_PRESAGE";
    private static final String af = "TIKTOK_NETWORK";
    private static final String ag = "TIKTOK_BIDDING";
    private static final String ah = "SMAATO_NETWORK";
    private static final String ai = "SMAATO_BIDDING";
    private static final String aj = "SNAP_NETWORK";
    private static final String ak = "SNAP_BIDDING";
    private static final String al = "TAPJOY_NETWORK";
    private static final String am = "TAPJOY_BIDDING";
    private static final String an = "VERIZON_NETWORK";
    private static final String ao = "VERIZON_BIDDING";
    private static final String ap = "YANDEX_NETWORK";
    private static final String aq = "YANDEX_BIDDING";
    private static final String ar = "LINE_NETWORK";
    private static final String as = "LINE_BIDDING";
    private static final String at = "VERVE_NETWORK";
    private static final String au = "VERVE_BIDDING";
    private static final String av = "BIDMACHINE_BIDDING";
    private static final String aw = "MOLOCO_BIDDING";
    private static final String ax = "MOLOCO_NATIVE_BIDDING";
    private static final String ay = "MOBILEFUSE_BIDDING";
    private static final String az = "PUBMATIC_BIDDING";
    public static final String b = "encoding";
    public static final String c = "Content-Type";
    public static final String e = "APPLOVIN_NETWORK";
    public static final String f = "APPLOVIN_EXCHANGE";
    public static final String g = "APPLOVIN_DIRECTSOLD";
    public static final String h = "CUSTOM_NETWORK";
    public static final String i = "/mediate";
    public static final String k = "@!1:ad_fetch@!";
    private static final String m = "CreativeInfoManager";
    private static final String n = "timestamp";
    private static final String o = "urls";
    private static final String s = "IRONSOURCE_NETWORK";
    private static final String t = "IRONSOURCE_BIDDING";
    private static final String u = "VUNGLE_NETWORK";
    private static final String v = "VUNGLE_BIDDING";
    private static final String w = "VUNGLE_NATIVE_BIDDING";
    private static final String x = "UNITY_NETWORK";
    private static final String y = "UNITY_BIDDING";
    private static final String z = "ADMOB_NETWORK";
    private static final List<String> p = new ArrayList();
    private static TreeMap<String, AdNetworkDiscovery> adNetworkDiscoveries = new TreeMap<>();
    private static final Map<String, String> q = new HashMap();
    private static final HashSet<String> r = new HashSet<>();
    public static final Set<String> d = new LinkedHashSetWithItemLimit(10);
    public static final List<String> j = Arrays.asList("ms.applovin.com", "ms.applvn.com", "ms4.applovin.com", "ms4.applvn.com");
    private static final AtomicBoolean aA = new AtomicBoolean(false);
    private static final ExecutorService aB = Executors.newFixedThreadPool(2);
    public static boolean l = false;

    public static HashSet<String> a() {
        return r;
    }

    public static void a(String str, WebView webView, String str2) {
        AdNetworkDiscovery adNetworkDiscoveryI = i(str);
        if (adNetworkDiscoveryI != null && str2 != null && adNetworkDiscoveryI.a(str2)) {
            String strA = BrandSafetyUtils.a(webView);
            if (adNetworkDiscoveryI.b(str2)) {
                Logger.d(m, "handle mraid events : video begin for address = " + strA + ", sdk = " + str + ", url = " + str2);
                a(str, strA, false, "mraid-event");
                return;
            }
            if (adNetworkDiscoveryI.c(str2)) {
                Logger.d(m, "handle mraid events : video end for address = " + strA + ", sdk = " + str + ", url = " + str2);
                a(str, strA, true, "mraid-event");
                return;
            }
            if (adNetworkDiscoveryI.d(str2)) {
                Logger.d(m, "_AD_CAPTURE_ handle mraid events : PP detection for address = " + strA + ", sdk = " + str);
                b.a(strA, "ppl", new l.a[0]);
                a(str, strA);
            }
        }
    }

    public static void a(String str, String str2) {
        List listA;
        List listA2;
        if (SafeDK.getInstance() == null) {
            return;
        }
        if (SafeDK.getInstance().z() == null) {
            listA = null;
        } else {
            listA = SafeDK.getInstance().z().a(str, str2);
        }
        if (SafeDK.getInstance().A() == null) {
            listA2 = null;
        } else {
            listA2 = SafeDK.getInstance().A().a(str, str2);
        }
        List listA3 = SafeDK.getInstance().B() != null ? SafeDK.getInstance().B().a(str, str2) : null;
        if (listA != null && !listA.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling interstitial method, : address = " + str2);
            b(str, str2);
            return;
        }
        if (listA2 != null && !listA2.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling banner method, : address = " + str2);
            a(BrandSafetyUtils.AdType.c, str2);
            return;
        }
        if (listA3 != null && !listA3.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling MREC method, : address = " + str2);
            a(BrandSafetyUtils.AdType.b, str2);
            return;
        }
        Logger.d(m, "request no sampling by address, WebView not found, : address = " + str2);
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar) {
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "handle prefetch started, networkName=" + str + ", url=" + str2);
        String strB = b(str);
        if (strB == null) {
            return;
        }
        if (!h(str2) && !str2.equals(k)) {
            return;
        }
        b bVarJ = j(strB);
        if (bVarJ != null) {
            if (bVarJ.b(AdNetworkConfiguration.a)) {
                b(strB, str2, str3, null, map, aVar, null);
                return;
            }
            return;
        }
        Logger.d(m, "handle prefetch sdkPackage does not exist");
    }

    public static void a(String str, String str2, String str3) {
        AdNetworkDiscovery adNetworkDiscoveryI = i(str);
        if (adNetworkDiscoveryI != null) {
            Logger.d(m, "onVideoKeyAndUrlPairCreated started, sdkPackageName = " + str + ", localFileCacheKey = " + str2 + ", remoteUrl = " + str3);
            adNetworkDiscoveryI.h(str2, str3);
        }
    }

    private static class a {
        ArrayList<String> a = new ArrayList<>();
        long b;

        private a() {
        }
    }

    public static synchronized void b() {
        try {
        } finally {
        }
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (!aA.get()) {
                Logger.d(m, "initCreativeInfoManager started");
                c();
                CreativeInfoManagerInitializer.init(adNetworkDiscoveries);
                Logger.d(m, "Number of adNetworkDiscoveries classes is " + adNetworkDiscoveries.size());
                aA.set(true);
            } else {
                Logger.d(m, "initCreativeInfoManager already executed, skipping");
            }
        }
    }

    private static void init() {
    }

    public static void c() {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        r.add(e);
        r.add(f);
        r.add(g);
        r.add(h);
        q.put(e, "com.applovin");
        q.put(f, "com.applovin");
        q.put(g, "com.applovin");
        q.put(s, "com.supersonicads");
        q.put(t, "com.supersonicads");
        q.put(u, "com.vungle");
        q.put(v, "com.vungle");
        q.put(w, "com.vungle");
        q.put(x, "com.unity3d.ads");
        q.put(y, "com.unity3d.ads");
        q.put(z, "com.google.ads");
        q.put(A, "com.google.ads");
        q.put(B, "com.google.ads");
        q.put(C, "com.google.ads");
        q.put(D, "com.mintegral.msdk");
        q.put(E, "com.mintegral.msdk");
        q.put(F, "com.mintegral.msdk");
        q.put(G, "com.inneractive");
        q.put(H, "com.inneractive");
        q.put(I, "com.inneractive");
        q.put(J, "com.jirbo.adcolony");
        q.put(K, "com.jirbo.adcolony");
        q.put(O, "com.chartboost");
        q.put(P, "com.chartboost");
        q.put(Q, "com.google.ads");
        q.put(R, "com.google.ads");
        q.put(S, "com.google.ads");
        q.put(T, "com.inmobi");
        q.put(U, "com.inmobi");
        q.put(V, "com.inmobi");
        q.put(W, "jp.maio.sdk.android");
        q.put(X, "jp.maio.sdk.android");
        q.put(Y, "com.my.target");
        q.put(Z, "com.my.target");
        q.put(aa, "net.nend.android");
        q.put(ab, "net.nend.android");
        q.put(f664ac, "com.ogury");
        q.put(ad, "com.ogury");
        q.put(ae, "com.ogury");
        q.put(af, "com.bytedance.sdk");
        q.put(ag, "com.bytedance.sdk");
        q.put(ah, "com.smaato");
        q.put(ai, "com.smaato");
        q.put(aj, "com.snap.ads");
        q.put(ak, "com.snap.ads");
        q.put(al, "com.tapjoy");
        q.put(am, "com.tapjoy");
        q.put(an, "com.verizon.ads");
        q.put(ao, "com.verizon.ads");
        q.put(ap, "com.yandex.mobile.ads");
        q.put(aq, "com.yandex.mobile.ads");
        q.put(ar, "com.five_corp.ad");
        q.put(as, "com.five_corp.ad");
        q.put(L, "com.amazon.device.ads");
        q.put(M, "com.amazon.device.ads");
        q.put(N, "com.amazon.device.ads");
        q.put(at, "com.verve");
        q.put(au, "com.verve");
        q.put(av, "io.bidmachine");
        q.put(aw, "com.moloco");
        q.put(ax, "com.moloco");
        q.put(ay, "com.mobilefuse");
        q.put(az, "com.pubmatic");
    }

    public static AdNetworkDiscovery.WebViewResourceMatchingMethod a(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery.b();
    }

    public static String b(String str) {
        String str2 = q.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return null;
    }

    public static void a(boolean z2) {
        aC = z2;
        Logger.d(m, "setting active mode to " + z2);
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Logger.d(m, "on webView response helper - sdk= " + str + ",   webview=" + webView + ",   url= " + str2 + ",   webResourceRequest= " + webResourceRequest + ",    response= " + webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21 && TextUtils.isEmpty(str2) && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            str2 = webResourceRequest.getUrl().toString();
            Logger.d(m, "on webView response helper - url updated to= " + str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            Logger.d(m, "on webView response helper - calling follow webview response if needed, sdk= " + str + ",   url= " + str2);
            webResourceResponse = a(str, webView, str2, webResourceResponse);
        }
        if (webResourceRequest != null) {
            a(str, webView, webResourceRequest, str2);
        }
        AdNetworkDiscovery adNetworkDiscoveryI = i(str);
        if (adNetworkDiscoveryI != null) {
            adNetworkDiscoveryI.b(webView, str2);
        }
        return webResourceResponse;
    }

    public static WebResourceResponse onWebViewResponse(String sdkPackageName, WebView webView, String url, WebResourceResponse response) {
        Logger.d(m, "on webView response " + sdkPackageName + ", webview " + webView + ", url " + url + ", isOnUiThread = " + n.c());
        if (!aC || !aA.get()) {
            return response;
        }
        return a(sdkPackageName, webView, url, (WebResourceRequest) null, response);
    }

    public static WebResourceResponse onWebViewResponseWithHeaders(String sdkPackageName, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse response) {
        Logger.d(m, "on webView response with headers " + sdkPackageName + ", webview " + webView + ", isOnUiThread = " + n.c());
        if (!aC || !aA.get()) {
            return response;
        }
        return a(sdkPackageName, webView, (String) null, webResourceRequest, response);
    }

    public static void a(String str, WebView webView, WebResourceRequest webResourceRequest, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Logger.d(m, "on webView response with headers impl - " + str + ", webview " + webView + ", url " + str2 + ", isOnUiThread = " + n.c());
                if (webResourceRequest != null && webResourceRequest.getRequestHeaders() != null) {
                    if (!webResourceRequest.getRequestHeaders().isEmpty() && webResourceRequest.getRequestHeaders().containsKey(HttpRequest.HEADER_ACCEPT)) {
                        a(str, webView, str2, webResourceRequest.getRequestHeaders());
                        if (adNetworkDiscovery != null) {
                            AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscovery.b();
                            boolean zA = a(str, AdNetworkConfiguration.aH, false);
                            if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.b || zA) {
                                adNetworkDiscovery.a(str2, str2, webView);
                            }
                        }
                        if (adNetworkDiscovery != null && adNetworkDiscovery.d().b(AdNetworkConfiguration.u)) {
                            String str3 = webResourceRequest.getRequestHeaders().get(HttpRequest.HEADER_ACCEPT);
                            if (n.s(str2) || (str3 != null && str3.contains(MimeTypes.BASE_TYPE_VIDEO))) {
                                Logger.d(m, "on webView response with headers impl - set active ad as video ad");
                                f(str, BrandSafetyUtils.a(webView));
                            }
                        }
                    }
                } else {
                    Logger.d(m, "on webView response with headers impl - web resource request is null");
                }
                return;
            }
            Logger.d(m, "on webView response with headers impl - Android SDK version too low.");
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(m, "on webView response with headers impl - exception: ", th);
            } catch (Throwable th2) {
            }
        }
    }

    private static void a(WebResourceResponse webResourceResponse, Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                map2.put(str, list.get(0));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(map2);
        }
    }

    private static WebResourceResponse a(String str, String str2, WebResourceResponse webResourceResponse, Bundle bundle) throws IOException {
        IOException e2;
        WebResourceResponse webResourceResponse2;
        try {
            Logger.d(m, "Wrapping input stream started, sdkPackageName = " + str + ", url = " + str2);
            if (webResourceResponse == null) {
                URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                webResourceResponse2 = new WebResourceResponse(bundle.getString(a, "text/javascript"), bundle.getString(b, HttpRequest.CHARSET_UTF8), new f(str, str2, uRLConnectionOpenConnection.getInputStream(), (Map) null, false));
                try {
                    a(webResourceResponse2, uRLConnectionOpenConnection.getHeaderFields());
                    webResourceResponse = webResourceResponse2;
                } catch (IOException e3) {
                    e2 = e3;
                    Logger.e(m, "Error wrapping input stream for URL: " + str2, e2);
                    return webResourceResponse2;
                }
            } else if (!(webResourceResponse.getData() instanceof f)) {
                webResourceResponse.setData(new f(str, str2, webResourceResponse.getData(), (Map) null, false));
            }
            Logger.d(m, "Wrapping input stream in response: " + webResourceResponse + ", MIME type: " + webResourceResponse.getMimeType() + ", Encoding: " + webResourceResponse.getEncoding());
            return webResourceResponse;
        } catch (IOException e4) {
            WebResourceResponse webResourceResponse3 = webResourceResponse;
            e2 = e4;
            webResourceResponse2 = webResourceResponse3;
        }
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceResponse webResourceResponse) {
        Logger.d(m, "follow WebView response if needed started, sdkPackageName = " + str + ", webView = " + webView + ", URL = " + str2);
        try {
        } catch (Throwable th) {
            Logger.d(m, "following webView response failed: " + th.getMessage(), th);
        }
        if (aC && aA.get()) {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            Bundle bundle = new Bundle();
            if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle)) {
                Logger.d(m, "follow webview response if needed for " + str + ", url " + str2);
                webResourceResponse = a(str, str2, webResourceResponse, bundle);
            }
            return webResourceResponse;
        }
        Logger.d(m, "follow WebView response if needed SafeDK not initialized");
        return webResourceResponse;
    }

    public static InputStream a(String str, String str2, InputStream inputStream, Map<String, List<String>> map) {
        try {
            Logger.d(m, "followInputStreamIfNeeded started for url " + str2);
            if (aC && aA.get()) {
                if (a(str, AdNetworkConfiguration.N, false)) {
                    onResourceLoaded(str, null, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Bundle bundle = new Bundle();
                if (map.containsKey("Content-Type")) {
                    bundle.putStringArrayList("Content-Type", new ArrayList<>(map.get("Content-Type")));
                }
                boolean z2 = adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle);
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("should follow input stream? ");
                    sb.append(adNetworkDiscovery != null ? Boolean.valueOf(z2) : "null");
                    Logger.d(m, sb.toString());
                }
                if (adNetworkDiscovery != null && z2) {
                    boolean zI = adNetworkDiscovery.i(str2);
                    boolean zA = a(str, AdNetworkConfiguration.k, false);
                    boolean zA2 = a(str, AdNetworkConfiguration.l, false);
                    Logger.d(m, "following input stream for url " + str2 + ", enforce close value for sdk " + str + " is " + zA2 + ", enforce close VIV value for sdk = " + zA);
                    return new f(str, str2, inputStream, map, zA2 || (zA && zI));
                }
                return inputStream;
            }
            Logger.d(m, "should follow input stream SafeDK not initialized");
            return inputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, "Exception following input stream : " + th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return inputStream;
        }
    }

    @SDKDependancy(packageName = "okio")
    public static BufferedSource a(String str, String str2, BufferedSource bufferedSource, int i2) {
        try {
            if (aC && aA.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url " + str2);
                    return SafeDKSource.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mintegral.msdk.thrid.okio.BufferedSource")
    public static com.mintegral.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mintegral.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aC && aA.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url " + str2);
                    return SafeDKSourceMintegral.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mbridge.msdk.thrid.okio.BufferedSource")
    public static com.mbridge.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mbridge.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aC && aA.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url " + str2);
                    return SafeDKSourceMBridge.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    public static OutputStream a(String str, String str2, OutputStream outputStream) {
        try {
            if (aC && aA.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(m, "following output stream for url " + str2);
                    return new g(str, str2, outputStream);
                }
                return outputStream;
            }
            Logger.d(m, "following output stream SafeDK not initialized");
            return outputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return outputStream;
        }
    }

    public static FileOutputStream a(String str, String str2, FileOutputStream fileOutputStream) {
        try {
            if (aC && aA.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(m, "follow output file stream if needed sdk = " + str + ", path = " + str2 + ", stream " + fileOutputStream);
                    return new e(str, str2, fileOutputStream);
                }
                return fileOutputStream;
            }
            Logger.d(m, "following output stream for file SafeDK not initialized");
            return fileOutputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return fileOutputStream;
        }
    }

    public static boolean c(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return false;
        }
        return adNetworkDiscovery.a();
    }

    public static void viewOnMeasure(String sdkPackageName, View view, int width, int height) {
        AdNetworkDiscovery adNetworkDiscoveryI = i(sdkPackageName);
        if (adNetworkDiscoveryI != null) {
            adNetworkDiscoveryI.a(view, width, height);
        }
    }

    public static void onResourceLoaded(final String sdkPackageName, final WebView webView, final String resource) {
        try {
            if ((!aC || !aA.get()) && !l) {
                return;
            }
            if (l) {
                c(sdkPackageName, webView, resource);
            } else {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(sdkPackageName, webView, resource);
                    }
                });
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            Logger.e(m, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, WebView webView, String str2) {
        String strA;
        try {
            if (l || (aC && aA.get())) {
                String strZ = n.z(str2);
                if (webView == null) {
                    strA = null;
                } else {
                    strA = BrandSafetyUtils.a(webView);
                    com.safedk.android.analytics.brandsafety.creatives.discoveries.l.a(str, strA, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(strZ, strA)) {
                    adNetworkDiscovery.a(strZ, strZ, webView);
                }
                a(str, webView, strZ, (Map<String, String>) null);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(m, "resource loaded failed", th);
        }
    }

    private static void f(String str, String str2) {
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "set active ad in ad finder as video ad started, sdkPackageName = " + str + ", webViewAddress = " + str2);
        for (b bVar : SafeDK.getInstance().y().values()) {
            if (bVar != null) {
                List<CreativeInfo> listA = bVar.a(str, str2);
                if (listA != null && listA.size() > 0) {
                    for (CreativeInfo creativeInfo : listA) {
                        Logger.d(m, "set active ad in ad finder as video ad, ci: " + creativeInfo.aa());
                        creativeInfo.f(true);
                    }
                } else {
                    Logger.d(m, "set active ad in ad finder as video ad, ci list is null or empty. sdkPackageName = " + str + ", webViewAddress = " + str2);
                }
            }
        }
    }

    public static void onMaxAdViewCreated(MaxAdView maxAdView, MaxAdFormat adFormat, String adUnitId) {
        Logger.d(m, "Max ad view created: " + maxAdView + " ad format: " + adFormat + " ad unit id: " + adUnitId);
        if (maxAdView != null && adFormat != null) {
            if (adFormat == MaxAdFormat.BANNER || adFormat == MaxAdFormat.LEADER || adFormat == MaxAdFormat.MREC) {
                BannerFinder.a(adUnitId, maxAdView, adFormat == MaxAdFormat.MREC ? BrandSafetyUtils.AdType.b : BrandSafetyUtils.AdType.c);
            }
        }
    }

    public static void a(MaxAdView maxAdView) {
        if (maxAdView != null) {
            String strE = n.e(com.safedk.android.utils.g.O(), maxAdView.toString());
            if (strE != null) {
                Logger.d(m, "Max ad view destroyed: " + maxAdView + " ad unit id: " + strE + ", isOnUiThread = " + n.c());
                BannerFinder.a(strE, maxAdView);
                return;
            }
            Logger.d(m, "Max ad view destroyed: " + maxAdView);
            BannerFinder.a(maxAdView);
        }
    }

    public static void onMaxNativeAdLoaded(final MaxNativeAdView maxAdView, final MaxAd ad2) {
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.12
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(maxAdView, ad2);
                }
            });
        } else {
            b(maxAdView, ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (aC && aA.get() && maxAd != null) {
            String adUnitId = maxAd.getAdUnitId();
            Bundle bundleA = c.a(maxAd);
            if (bundleA != null) {
                String string = bundleA.getString("eventId");
                String string2 = bundleA.getString(ServiceProvider.NAMED_SDK);
                String string3 = bundleA.getString("bidResponse");
                Logger.d(m, "Max native ad loaded: " + maxNativeAdView + " ad unit id: " + adUnitId + ", network: " + maxAd.getNetworkName() + ", isOnUiThread = " + n.c());
                NativeFinder nativeFinderC = SafeDK.getInstance().C();
                if (nativeFinderC != null && maxNativeAdView != null) {
                    nativeFinderC.a(string, string2, maxNativeAdView);
                }
                b(string2, string3, maxNativeAdView);
            }
        }
    }

    public static void onMaxNativeAdCreated(MaxNativeAdView maxAdView) {
        NativeFinder nativeFinderC;
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "Max native ad created: " + maxAdView);
        if (maxAdView != null && (nativeFinderC = SafeDK.getInstance().C()) != null) {
            nativeFinderC.a(maxAdView);
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            Logger.d(m, "handle resource attachment if necessary started sdk=" + str + ", webview= " + webView + ", resource=" + str2 + ", headers=" + map + ", matching method for " + str + " is " + adNetworkDiscovery.b().name());
            if (adNetworkDiscovery.p(str2)) {
                Logger.d(m, "handle resource attachment if necessary. should stop collecting resources.  sdk=" + str + ", webview= " + webView + ", resource=" + str2);
                SafeDK.getInstance().z().r(str);
                return;
            }
            if (webView != null) {
                g.a(str, webView, str2, map);
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map) {
        a(str, str2, str3, null, map, null);
    }

    public static void a(final String str, final String str2, final String str3, final byte[] bArr, final Map<String, List<String>> map, final String str4) {
        try {
            if ((!aC || !aA.get()) && !l) {
                return;
            }
            Logger.d(m, "ad fetched package: " + str + " url: " + str2 + " , content size=" + str3.length());
            if (a(str, AdNetworkConfiguration.Q, false)) {
                h.a(str3, d(str), str);
            }
            if (l) {
                Logger.d(m, "ad fetched executor service started " + str + " url: " + str2);
                b(str, str2, str3, bArr, map, null, str4);
                return;
            }
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.16
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(str, str2, str3, bArr, map, null, str4);
                }
            });
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static String[] d(String str) {
        String strA = a(str, AdNetworkConfiguration.aF, (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA.split(",");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, String str3, byte[] bArr, Map<String, List<String>> map, c.a aVar, String str4) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                Logger.d(m, "ad fetched Impl sdk: " + str + " url: " + str2 + " , content size=" + str3.length());
                long jNanoTime = System.nanoTime();
                List<CreativeInfo> listA = adNetworkDiscovery.a(str2, str3, bArr, map, aVar);
                int size = listA != null ? listA.size() : 0;
                if (size > 0) {
                    Logger.d(m, "ad network discovery generate info sdk " + str + " took " + ((System.nanoTime() - jNanoTime) / 1000000) + " ms, number of CIs: " + size);
                    for (CreativeInfo creativeInfo : listA) {
                        if (creativeInfo.L()) {
                            Logger.d(m, "ci is empty");
                        } else if (str4 != null) {
                            creativeInfo.t("isci=(" + str4 + ")");
                        }
                    }
                }
                return;
            }
            Logger.d(m, "no discovery object found for SDK " + str);
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(m, "Exception in ad fetch: " + th.getMessage(), th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final WebView webView, final String str3) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str3);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.a(webView);
            }
            if (aC && aA.get()) {
                if (str2 == null) {
                    Logger.d(m, "data loaded to webView is null for package: " + str3 + " and webview: " + webView);
                    return;
                }
                Logger.d(m, "data loaded to webView " + webView + ", package: " + str3 + ", baseUrl: " + str);
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.17
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery2 = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str3);
                            if (adNetworkDiscovery2 != null) {
                                adNetworkDiscovery2.b(str, str2, webView);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.m, "Exception in data loaded to webView : ", th);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "data loaded to webView SafeDK not initialized for package: " + str3 + " and webview: " + webView);
        } catch (Throwable th) {
            try {
                Logger.d(m, "Exception in data loaded to webView : ", th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        try {
            if (aC && aA.get()) {
                Logger.d(m, "File output stream completed " + str + " , " + str2);
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.18
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                if (adNetworkDiscovery.d().b(AdNetworkConfiguration.x)) {
                                    CreativeInfoManager.b(str, str2, str3, null, null, null, null);
                                } else {
                                    adNetworkDiscovery.d(str2, str3);
                                }
                            } else {
                                Logger.d(CreativeInfoManager.m, "no discovery object for SDK " + str);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "File output stream completed SafeDK not initialized");
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void c(final String str, final String str2, final String str3) {
        try {
            if (aC && aA.get()) {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.19
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                String strE = adNetworkDiscovery.e(str2, str3);
                                if (strE != null) {
                                    for (CreativeInfo creativeInfo : adNetworkDiscovery.s(strE)) {
                                        if (creativeInfo.M() == BrandSafetyUtils.AdType.a || creativeInfo.M() == BrandSafetyUtils.AdType.c || creativeInfo.M() == BrandSafetyUtils.AdType.b) {
                                            CreativeInfoManager.a(creativeInfo, "exact_ad_id");
                                            Logger.d(CreativeInfoManager.m, "set CI in ad finder: " + creativeInfo);
                                        }
                                    }
                                }
                                return;
                            }
                            Logger.d(CreativeInfoManager.m, "no discovery object for SDK " + str);
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "handling output stream SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, "Exception handling output stream : " + th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final BrandSafetyEvent.AdFormatType adFormatType, final Object obj) {
        try {
            if (aC && aA.get()) {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.20
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "handling shown ad by api, sdk: " + str + ", message: " + str2 + ", ad format type: " + adFormatType + ", isOnUiThread = " + n.c());
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.a(str2, str2, adFormatType, obj);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.m, "handling shown ad by api failed", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(m, "Exception handling shown ad by api :" + th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static boolean a(CreativeInfo creativeInfo, String str) {
        return a(creativeInfo, str, (String) null);
    }

    public static boolean a(CreativeInfo creativeInfo, String str, String str2) {
        boolean zA = false;
        if (!aC || !aA.get()) {
            return false;
        }
        if (creativeInfo.Y() != null) {
            n.b(m, "setting creative in ad finder - ci already have matching method. ci: " + creativeInfo);
            return false;
        }
        Logger.d(m, "setting creative in ad finder, ci id =" + creativeInfo.N() + ", ad type: " + creativeInfo.M());
        com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(creativeInfo.M());
        if (aVarA != null) {
            if (a(creativeInfo.S(), AdNetworkConfiguration.U, true)) {
                zA = aVarA.a(new o(creativeInfo, str, str2));
            } else {
                zA = aVarA.a(new o(creativeInfo, str));
            }
            Logger.d(m, "setting creative in ad finder updating ci " + zA + ", matching method=" + str + ", ad id=" + creativeInfo.N() + ", ad type=" + creativeInfo.M());
        } else {
            Logger.d(m, "setting creative in ad finder - cannot update ad finder");
        }
        return zA;
    }

    public static void b(String str, String str2) {
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "request to stop take screenshots from current interstitial impression, package: " + str + ", address: " + str2);
        InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
        if (interstitialFinderZ == null) {
            Logger.d(m, "interstitial finder is null, exiting");
        } else {
            interstitialFinderZ.a(str, str2, false);
        }
    }

    public static void a(BrandSafetyUtils.AdType adType, String str) {
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "request to stop take screenshots from current " + adType.name() + " impression received");
        BannerFinder bannerFinderA = SafeDK.getInstance().a(adType);
        if (bannerFinderA == null) {
            Logger.d(m, adType.name() + " finder is null, exiting");
            return;
        }
        bannerFinderA.o(str);
    }

    public static void a(final String str, final Object obj, final Object obj2) {
        try {
            if (aC && aA.get()) {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.21
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "Media player set data source event received " + obj + ", video file " + obj2);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.b(obj, obj2);
                            } else {
                                Logger.d(CreativeInfoManager.m, "no discovery object found for SDK " + str);
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.e(CreativeInfoManager.m, th.getMessage());
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(m, "Media player set data source event SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final Object obj) {
        try {
            if (aC && aA.get()) {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.22
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "media player start event " + obj);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                String strB = adNetworkDiscovery.b(obj);
                                if (strB != null) {
                                    for (CreativeInfo creativeInfo : adNetworkDiscovery.s(strB)) {
                                        creativeInfo.a(obj);
                                        Logger.d(CreativeInfoManager.m, "calling set creative in ad finder after media player start called. video url: " + creativeInfo.J());
                                        CreativeInfoManager.a(creativeInfo, "exact_video");
                                    }
                                }
                                return;
                            }
                            Logger.d(CreativeInfoManager.m, "no discovery object found for SDK " + str);
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.m, "Media player start event error ", th);
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(m, "media player start SafeDK not initialized");
        } catch (Throwable th) {
            Logger.d(m, "Media player start event error ", th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final Object obj, final Object obj2) {
        try {
            if (aC && aA.get()) {
                aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.m, "Ad Object ready Executor started " + str + " ad instance: " + obj + ", matching object: " + obj2 + ", isOnUiThread = " + n.c());
                        CreativeInfoManager.d(str, obj, obj2);
                    }
                });
                return;
            }
            Logger.d(m, "Ad Object ready SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object obj, Object obj2) {
        try {
            Logger.d(m, "ad object ready impl " + obj);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.d(obj, obj2);
            } else {
                Logger.d(m, "ad object ready impl no discovery object for SDK " + str);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(m, "ad object ready impl error ", th);
        }
    }

    public static void e(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().l(str);
        }
    }

    public static void f(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().m(str);
        }
    }

    public static void g(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().n(str);
        }
    }

    public static void onVideoCompleted(String sdkPackageName, Object source, String originatedBy) {
        if (source == null) {
            onVideoCompleted(sdkPackageName, originatedBy);
        } else {
            a(sdkPackageName, BrandSafetyUtils.a(source), true, originatedBy);
        }
    }

    public static void onVideoStart(String sdkPackageName, Object source, String originatedBy) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(sdkPackageName);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.d(source);
        }
        a(sdkPackageName, BrandSafetyUtils.a(source), false, originatedBy);
    }

    public static void onVideoCompleted(final String sdkPackageName, final String originatedBy) {
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.g(sdkPackageName, originatedBy);
                }
            });
        } else {
            g(sdkPackageName, originatedBy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str, String str2) {
        if (!aC || !aA.get()) {
            return;
        }
        Logger.d(m, "video completed event sdk=" + str + ", originated by= " + str2);
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().f(str, str2);
        }
    }

    public static void a(final String str, final String str2, final boolean z2, final String str3) {
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(str, str2, z2, str3);
                }
            });
        } else {
            c(str, str2, z2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(String str, String str2, boolean z2, String str3) {
        if (!aC || !aA.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("video ");
        sb.append(z2 ? "completed" : "started");
        sb.append(" event sdk=");
        sb.append(str);
        sb.append(", view address=");
        sb.append(str2);
        sb.append(", originated by= ");
        sb.append(str3);
        Logger.d(m, sb.toString());
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null) {
            for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(safeDK.z(), safeDK.B())) {
                if (aVar != null && aVar.a(str, str2, z2, str3)) {
                    return;
                }
            }
        }
        if (!z2) {
            Logger.d(m, "video started event added to videoStartViewList, sdk=" + str + ", view address=" + str2);
            d.add(str2);
        }
    }

    public static void onViewClicked(final String sdkPackageName, final View view) {
        Logger.d(m, "View clicked event sdk=" + sdkPackageName + ", view id = " + Integer.toString(view.getId(), 16));
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(sdkPackageName, view);
                }
            });
        } else {
            c(sdkPackageName, BrandSafetyUtils.a(view), true, "view-click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view) {
        try {
            Logger.d(m, "View clicked event sdk=" + str + ", view id = " + Integer.toString(view.getId(), 16) + ", isOnUiThread = " + n.c());
            if (aC && aA.get()) {
                if (view == null) {
                    Logger.d(m, "View clicked event sdk=" + str + ", view=null, exiting.");
                    return;
                }
                AdNetworkDiscovery adNetworkDiscoveryI = i(str);
                if (adNetworkDiscoveryI != null) {
                    adNetworkDiscoveryI.c(view);
                    return;
                }
                Logger.d(m, "clicked from unsupported SDK: " + str);
            }
        } catch (Throwable th) {
            Logger.e(m, "View clicked event exception", th);
        }
    }

    public static boolean onViewTouched(final String sdkPackageName, final View view, final MotionEvent motionEvent) {
        Logger.d(m, "View touched event sdk=" + sdkPackageName + ", view id = " + Integer.toString(view.getId(), 16) + ", motion event=" + motionEvent.toString());
        if (!aC || !aA.get()) {
            return false;
        }
        if (view == null) {
            Logger.d(m, "View touched event sdk=" + sdkPackageName + ", view=null, exiting.");
            return false;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 11) {
            Logger.d(m, "View touched event sdk=" + sdkPackageName + ", motion event=" + motionEvent.getAction() + ". exiting.");
            return false;
        }
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.6
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(sdkPackageName, view, motionEvent);
                }
            });
            return true;
        }
        b(sdkPackageName, view, motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view, MotionEvent motionEvent) {
        try {
            Logger.d(m, "onViewTouchedImpl started, sdkPackageName = " + str + ", view = " + view + ", motionEvent = " + motionEvent + ", isOnUiThread = " + n.c());
            AdNetworkDiscovery adNetworkDiscoveryI = i(str);
            if (adNetworkDiscoveryI != null) {
                adNetworkDiscoveryI.d(view);
            } else {
                Logger.d(m, "View touched event clicked from unsupported SDK: " + str);
            }
        } catch (Throwable th) {
            Logger.e(m, "View touched event exception", th);
        }
    }

    public static boolean h(String str) {
        if (n.a(str, j) && str.contains(i)) {
            return true;
        }
        return false;
    }

    public static synchronized void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        try {
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
        if (aC && aA.get()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.7
                @Override // java.lang.Runnable
                public void run() {
                    Logger.d(CreativeInfoManager.m, "updating creative info details from Max, sdk=" + str + ", placement id=" + str2 + ", creative id=" + str3 + ", ad format=" + str5);
                    AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                    if (adNetworkDiscovery != null) {
                        adNetworkDiscovery.a(str2, str3, str4, str5);
                        return;
                    }
                    Logger.d(CreativeInfoManager.m, "no discovery object for SDK " + str);
                }
            });
            return;
        }
        Logger.d(m, "updating creative info details SafeDK not initialized");
    }

    public static AdNetworkDiscovery i(String str) {
        if (!aC || !aA.get() || str == null) {
            return null;
        }
        return adNetworkDiscoveries.get(str);
    }

    public static b j(String str) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            return adNetworkDiscovery.d();
        }
        return null;
    }

    public static boolean a(String str, AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().b(adNetworkConfiguration);
        }
        return z2;
    }

    public static long a(String str, AdNetworkConfiguration adNetworkConfiguration, long j2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().e(adNetworkConfiguration);
        }
        return j2;
    }

    public static String a(String str, AdNetworkConfiguration adNetworkConfiguration, String str2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().c(adNetworkConfiguration);
        }
        return str2;
    }

    public static float a(String str, AdNetworkConfiguration adNetworkConfiguration, float f2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aC && aA.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().d(adNetworkConfiguration);
        }
        return f2;
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, float f2) {
        if (!aC || !aA.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, f2);
                Logger.d(m, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.f() + " to " + f2);
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        if (!aC || !aA.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, j2);
                Logger.d(m, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.f() + " to " + j2);
            }
        }
    }

    public static void d() {
        if (!aC || !aA.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                Logger.d(m, "Config item SDK " + adNetworkDiscovery.f() + " min image uniformity threshold is " + adNetworkDiscovery.d().d(AdNetworkConfiguration.E));
            }
        }
    }

    public static void onHandleInvocation(String packageName, Object target, String data) {
        if (!aC || !aA.get()) {
            return;
        }
        n.b(m, "onHandleInvocation packageName = " + packageName + ", interface name: " + target + ", data is: " + data);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(packageName);
        if (adNetworkDiscovery == null) {
            Logger.d(m, "onHandleInvocation: couldn't find discovery for package: " + packageName);
            return;
        }
        adNetworkDiscovery.a(data, target);
    }

    public static void onWebviewInterfaceConstruction(final String packageName, final Object bridge) {
        if (n.c()) {
            aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.8
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(packageName, bridge);
                }
            });
        } else {
            c(packageName, bridge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object obj) {
        if (!aC || !aA.get()) {
            return;
        }
        String strA = BrandSafetyUtils.a(obj);
        n.b(m, "onWebviewInterfaceConstruction: packageName is: " + str + ", isOnUiThread = " + n.c() + ", bridge address is: " + strA);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(m, "onWebviewInterfaceConstruction: couldn't find discovery for package: " + str);
            return;
        }
        adNetworkDiscovery.w(strA);
    }

    public static Set<String> e() {
        return adNetworkDiscoveries.keySet();
    }

    public static boolean k(String str) {
        SafeDK safeDK;
        return (!aC || !aA.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().G.a(str, false) == null) ? false : true;
    }

    public static boolean l(String str) {
        SafeDK safeDK;
        return (!aC || !aA.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().G.e(str) == null) ? false : true;
    }

    public static boolean m(String str) {
        SafeDK safeDK;
        if (!aC || !aA.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.A() == null) {
            return false;
        }
        return safeDK.A().p(str);
    }

    public static void a(String str, String str2, BrandSafetyUtils.AdType adType, String str3) {
        if (!aC || !aA.get()) {
            return;
        }
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.a(adType) != null) {
            Logger.d(m, "sendMessageToAdInfo: sending message: " + str2 + " to address: " + str);
            safeDK.a(adType).c(str, str2, str3);
            return;
        }
        Logger.d(m, "sendMessageToAdInfo: NOT sending message: " + str2 + " to address: " + str + "because ad finder not available");
    }

    public static void onReceiveMessageFromExternal(final String sdkPackage, final Object object, final String data) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.9
            @Override // java.lang.Runnable
            public void run() {
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(sdkPackage);
                if (adNetworkDiscoveryI != null) {
                    adNetworkDiscoveryI.a(object, data);
                }
            }
        });
    }

    public static void onBindView(final String packageName, final Object controller, final View videoView) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.10
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.m, "on bind view - controller: " + controller + " (" + BrandSafetyUtils.a(controller) + "), video view: " + videoView + " (" + BrandSafetyUtils.a(videoView) + ")");
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(packageName);
                if (adNetworkDiscoveryI != null) {
                    CreativeInfoManager.a(adNetworkDiscoveryI, adNetworkDiscoveryI.c(controller, videoView), videoView);
                }
            }
        });
    }

    public static void c(final String str, final String str2) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.11
            @Override // java.lang.Runnable
            public void run() {
                String str3;
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(str);
                if (adNetworkDiscoveryI != null && (str3 = str2) != null) {
                    adNetworkDiscoveryI.e(str3);
                }
            }
        });
    }

    public static String d(String str, String str2) {
        AdNetworkDiscovery adNetworkDiscoveryI = i(str);
        if (adNetworkDiscoveryI != null) {
            return adNetworkDiscoveryI.f(str2);
        }
        return null;
    }

    public static void onFeedbackPopup(String sdkPackageName) {
        com.safedk.android.analytics.brandsafety.n nVarQ;
        Logger.d(m, "on feedback popup started, sdkPackageName: " + sdkPackageName);
        InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
        if (interstitialFinderZ != null && (nVarQ = interstitialFinderZ.q(sdkPackageName)) != null && nVarQ.i() != null) {
            Logger.d(m, "_AD_CAPTURE_ on feedback popup : PP detection for sdk = " + sdkPackageName);
            nVarQ.i().a("ppl", new l.a[0]);
            interstitialFinderZ.a(nVarQ, false);
        }
    }

    public static void onInitVFPData(String sdkPackageName, Object view) {
        Logger.d(m, "on init VFP data, sdkPackageName: " + sdkPackageName + " and view: " + view);
        a(sdkPackageName, BrandSafetyUtils.a(view), false, "video-view");
    }

    public static void onAdReadyToPlay(final String sdkPackageName, final Object vastPlayer, final Object videoPlayerView) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.13
            @Override // java.lang.Runnable
            public void run() {
                String strA = BrandSafetyUtils.a(vastPlayer);
                String strA2 = BrandSafetyUtils.a(videoPlayerView);
                Logger.d(CreativeInfoManager.m, "on ad ready to play - vast player is: " + vastPlayer + " and address is: " + strA);
                Logger.d(CreativeInfoManager.m, "on ad ready to play - video player view is: " + videoPlayerView + " and address is: " + strA2);
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(sdkPackageName);
                if (adNetworkDiscoveryI != null) {
                    adNetworkDiscoveryI.c(vastPlayer, videoPlayerView);
                }
            }
        });
    }

    public static void onAdStarted(final String sdkPackageName, final Object vastPlayer) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.14
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.m, "on ad start - vast player is: " + vastPlayer + " and address is: " + BrandSafetyUtils.a(vastPlayer));
                AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(sdkPackageName);
                if (adNetworkDiscoveryI != null) {
                    CreativeInfoManager.a(adNetworkDiscoveryI, adNetworkDiscoveryI.c(vastPlayer), (Object) null);
                }
            }
        });
    }

    public static void onVolleyStringRequestCtor(String sdkPackageName, String url, Response.Listener responseListener) {
        String strA = BrandSafetyUtils.a(responseListener);
        Logger.d(m, "on volley string request ctor started with sdk: " + sdkPackageName + " url is: " + url + " and response listener: " + responseListener + " and address: " + strA);
        AdNetworkDiscovery adNetworkDiscoveryI = i(sdkPackageName);
        if (adNetworkDiscoveryI != null) {
            adNetworkDiscoveryI.g(strA, url);
        }
    }

    public static void onVolleyGetResponse(final String sdkPackageName, final Response.Listener responseListener, final Object responseObj) {
        aB.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.15
            @Override // java.lang.Runnable
            public void run() {
                String strA;
                String strX;
                Logger.d(CreativeInfoManager.m, "on volley get response started with sdk: " + sdkPackageName + " instance is: " + responseListener + " and response object: " + responseObj);
                Object obj = responseObj;
                if ((obj instanceof String) && h.a((String) obj)) {
                    n.b(CreativeInfoManager.m, "on volley get response - object is a vast string");
                    AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(sdkPackageName);
                    if (adNetworkDiscoveryI != null && (strX = adNetworkDiscoveryI.x((strA = BrandSafetyUtils.a(responseListener)))) != null) {
                        Logger.d(CreativeInfoManager.m, "on volley get response - for listener address: " + strA + " found url: " + strX);
                        adNetworkDiscoveryI.a(strX, (String) responseObj, (byte[]) null, (Map) null, (c.a) null);
                    }
                }
            }
        });
    }

    public static void onCronetClientGetResponse(String sdkPackageName, Object urlResponseInfo, byte[] byteStream) {
        String str;
        Logger.d(m, "on cronet client get response - sdk: " + sdkPackageName + ", response info: " + urlResponseInfo);
        try {
            str = (String) urlResponseInfo.getClass().getMethod("getUrl", new Class[0]).invoke(urlResponseInfo, new Object[0]);
        } catch (Exception e2) {
            Logger.d(m, "on cronet client get response - failed to get url or data: ", e2);
            str = null;
        }
        AdNetworkDiscovery adNetworkDiscoveryI = i(sdkPackageName);
        if (byteStream != null && adNetworkDiscoveryI != null && adNetworkDiscoveryI.a(str, (Bundle) null)) {
            adNetworkDiscoveryI.a(str, new String(byteStream), byteStream, (Map) null, (c.a) null);
        }
    }

    public static void a(AdNetworkDiscovery adNetworkDiscovery, CreativeInfo creativeInfo, Object obj) {
        if (creativeInfo == null) {
            return;
        }
        List<CreativeInfo> arrayList = null;
        if (creativeInfo.al()) {
            arrayList = adNetworkDiscovery.u(creativeInfo.N());
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            arrayList.add(creativeInfo);
        }
        for (CreativeInfo creativeInfo2 : arrayList) {
            if (obj != null) {
                creativeInfo2.a(obj);
            }
            a(creativeInfo2, "exact_ad_object");
        }
    }

    public static void a(String str, u uVar) {
        Logger.d(m, "registerSafeDKSavePrefetchEventListener started , sdk = " + str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.a(uVar);
            Logger.d(m, "save prefetch event listener registered fpr Ad network discovery class " + str + ", discovery = " + adNetworkDiscovery.f());
            return;
        }
        Logger.d(m, "save prefetch event listener cannot be registered, Ad network discovery class not found for " + str);
    }

    public static void b(String str, u uVar) {
        Logger.d(m, "registerSafeDKRewriteEventListener started , sdk = " + str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.b(uVar);
            Logger.d(m, "rewrite event listener registered for Ad network discovery class " + str + ", discovery = " + adNetworkDiscovery.f());
            return;
        }
        Logger.d(m, "rewrite event listener cannot be registered, Ad network discovery class not found for " + str);
    }
}
