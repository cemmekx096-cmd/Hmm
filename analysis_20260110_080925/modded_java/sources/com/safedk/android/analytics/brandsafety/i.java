package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class i implements com.safedk.android.internal.a {
    private static final String a = "ClickUrlsManager";
    private static final int b = 2;
    private static final String c = "https://play.google.com/store/apps/details?id=%s";
    private static i d;
    private static final Object l = new Object();
    private static AtomicBoolean m = new AtomicBoolean();
    private static final ScheduledExecutorService n = Executors.newScheduledThreadPool(0);
    private String e = null;
    private String f = null;
    private String g = null;
    private String h = null;
    private AtomicBoolean j = new AtomicBoolean(false);
    private AtomicInteger k = new AtomicInteger(0);
    private Set<String> i = new HashSet();

    private i() {
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
    }

    public static i a() {
        i iVar;
        synchronized (l) {
            if (d == null) {
                d = new i();
            }
            iVar = d;
        }
        return iVar;
    }

    public static void a(boolean z) {
        synchronized (l) {
            Logger.d(a, "setActiveMode to " + z);
            d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, String str3, String str4) {
        if (this.e == null && !this.i.contains(str)) {
            Logger.d(a, "logging url: " + str + ", fingerprint: " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.n.c());
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            if (TextUtils.isEmpty(str2)) {
                this.f = str;
            }
        }
    }

    public static String a(String str) {
        return String.format(Locale.ENGLISH, c, str);
    }

    public synchronized String b() {
        return this.f;
    }

    public synchronized void g() {
        m.set(true);
    }

    public synchronized void h() {
        String str;
        String str2;
        String str3;
        String str4;
        Logger.d(a, "onForeground started");
        m.set(false);
        if (this.j.get()) {
            if (this.k.getAndIncrement() <= 2) {
                synchronized (d) {
                    str = null;
                    if (this.e == null) {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    } else {
                        str = this.e;
                        str2 = this.f;
                        str3 = this.g;
                        str4 = this.h;
                    }
                }
                c(str, str2, str3, str4);
            } else {
                Logger.d(a, "Exhausted2 attempts to resolve URL. Clearing the slot.");
                d();
            }
        }
    }

    private void d() {
        synchronized (d) {
            if (this.e != null) {
                String str = this.e;
                this.e = null;
                this.f = null;
                this.i.add(str);
                this.j.set(false);
                this.k.set(0);
            }
        }
    }

    public void a(final String str, final String str2, final String str3, final String str4) {
        Logger.d(a, "resolve Url started, url = " + str + ", fingerprint = " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str3);
        boolean zA = CreativeInfoManager.a(sdkPackageByPackageUUID, AdNetworkConfiguration.aq, true);
        StringBuilder sb = new StringBuilder();
        sb.append("resolve Url setting shouldDecode is ");
        sb.append(zA);
        sb.append(" for sdkPackageName ");
        sb.append(sdkPackageByPackageUUID);
        Logger.d(a, sb.toString());
        final String strZ = zA ? com.safedk.android.utils.n.z(str) : str;
        if (com.safedk.android.utils.n.p(strZ)) {
            a(strZ, com.safedk.android.utils.n.q(strZ), str2, str3, str4, false);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i.m.get()) {
                        i.this.b(strZ, str2, str3, str4);
                        i.this.j.set(true);
                        Logger.d(i.a, "server asked to resolve but currently in background.");
                        return;
                    }
                    i.this.c(str, str2, str3, str4);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Logger.d(a, "resolveUrlInternal starting Url resolution. url = " + str + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final WebView webView = new WebView(SafeDK.getInstance().m());
        Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (atomicBoolean.get()) {
                    Logger.d(i.a, "Url resolved. no timeout.");
                } else {
                    webView.post(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(i.a, "Timeout resolving url");
                            webView.stopLoading();
                        }
                    });
                }
            }
        };
        AtomicLong atomicLong = new AtomicLong(0L);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new AnonymousClass3(str, atomicBoolean, str2, str3, str4));
        atomicLong.set(System.currentTimeMillis());
        webView.loadUrl(str);
        Logger.d(a, "Starting resolution, timeout = " + SafeDK.getInstance().M());
        n.schedule(runnable, (long) SafeDK.getInstance().M(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: com.safedk.android.analytics.brandsafety.i$3, reason: invalid class name */
    class AnonymousClass3 extends WebViewClient {
        AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ String b;
        final /* synthetic */ AtomicBoolean c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;

        AnonymousClass3(String str, AtomicBoolean atomicBoolean, String str2, String str3, String str4) {
            this.b = str;
            this.c = atomicBoolean;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, final String url, Bitmap favicon) {
            final int iIncrementAndGet = this.a.incrementAndGet();
            Logger.d(i.a, "onPageStarted started. callbackCounter=" + iIncrementAndGet + ", url= " + url);
            if (!url.equals(this.b)) {
                new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass3.this.a.get() == iIncrementAndGet) {
                            Logger.d(i.a, "onPageFinished never called, assuming last onPageStarted is the landing page.Landing page detected: " + url);
                            AnonymousClass3.this.c.set(true);
                            i.this.a(AnonymousClass3.this.b, url, AnonymousClass3.this.d, AnonymousClass3.this.e, AnonymousClass3.this.f, true);
                            return;
                        }
                        Logger.d(i.a, "onPageStarted resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.a.get() + ", callbackCounter=" + iIncrementAndGet);
                    }
                }, 60000L);
            }
            super.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, final String url) {
            final int iIncrementAndGet = this.a.incrementAndGet();
            new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass3.this.a.get() == iIncrementAndGet) {
                        Logger.d(i.a, "Landing page detected. is original url same as resolved ? " + AnonymousClass3.this.b.equals(url) + " , url " + url);
                        AnonymousClass3.this.c.set(true);
                        i.this.a(AnonymousClass3.this.b, url, AnonymousClass3.this.d, AnonymousClass3.this.e, AnonymousClass3.this.f, true);
                        return;
                    }
                    Logger.d(i.a, "onPageFinished resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.a.get() + ", callbackCounter=" + iIncrementAndGet);
                }
            }, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Logger.d(i.a, "onRenderProcessGone for view = " + view.toString());
            this.c.set(true);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            Logger.d(a, "reportResolvedUrlToServer started. originalUrl=" + str + ", resolvedUrl=" + str2 + ", fingerprint=" + str3 + ", isOnUiThread = " + com.safedk.android.utils.n.c());
            d();
            if (z && com.safedk.android.utils.n.p(str2)) {
                str2 = com.safedk.android.utils.n.q(str2);
            }
            Bundle bundle = new Bundle();
            bundle.putString("original_url", str);
            bundle.putString("resolved_url", str2);
            bundle.putString("fingerprint", str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("sdk_uuid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("impression_id", str5);
            }
            bundle.putString("package", SafeDK.getInstance().m().getPackageName());
            g.c(bundle);
        } catch (Throwable th) {
            Logger.d(a, "Failed to report url resolve to server");
            new CrashReporter().caughtException(th);
        }
    }
}
