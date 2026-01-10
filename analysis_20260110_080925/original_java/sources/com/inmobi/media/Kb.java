package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Kb {
    public static Context b = null;
    public static String c = "";
    public static String d;
    public static boolean g;
    public static final ExecutorService h;
    public static int i;
    public static final Kb a = new Kb();
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final Lazy f = LazyKt.lazy(Jb.a);

    public static final String b() {
        return d;
    }

    @JvmStatic
    public static /* synthetic */ void c() {
    }

    public static final Context d() {
        return b;
    }

    @JvmStatic
    public static /* synthetic */ void e() {
    }

    public static final h7 f() {
        return (h7) f.getValue();
    }

    @JvmStatic
    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    public static final String k() throws Uc {
        Context applicationContext;
        if (c.length() == 0 && Build.VERSION.SDK_INT >= 17) {
            Context context = b;
            String str = BuildConfig.FLAVOR;
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Exception e2) {
                    try {
                        throw new Uc(e2.getMessage());
                    } catch (Uc e3) {
                        Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                        w5 w5Var = w5.a;
                        d2 d2Var = new d2(e3);
                        Intrinsics.checkNotNullParameter(d2Var, "event");
                        w5.d.a(d2Var);
                        try {
                            String property = System.getProperty("http.agent");
                            if (property != null) {
                                str = property;
                            }
                            Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                        } catch (Exception e4) {
                            Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                            Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                            w5 w5Var2 = w5.a;
                            w5.d.a(c5.a(e4, "event"));
                        }
                    } catch (Exception unused) {
                        Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                    }
                }
            } else {
                applicationContext = null;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
            Intrinsics.checkNotNull(defaultUserAgent);
            str = defaultUserAgent;
            c = str;
        }
        return c;
    }

    @JvmStatic
    public static /* synthetic */ void l() {
    }

    public static final boolean m() {
        return e.get();
    }

    @JvmStatic
    public static /* synthetic */ void n() {
    }

    public static final boolean o() {
        return g;
    }

    @JvmStatic
    public static /* synthetic */ void p() {
    }

    public static final boolean q() {
        return i == 2;
    }

    @JvmStatic
    public static /* synthetic */ void r() {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.inmobi");
        p0.startActivity(p1);
    }

    @JvmStatic
    public static final void u() {
        b = null;
        d = null;
        i = 0;
    }

    public final void a(int i2) {
        i = i2;
    }

    public final String h() {
        Context context = b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = e6.b;
        e6 e6VarA = d6.a(context, "coppa_store");
        Intrinsics.checkNotNullParameter("im_accid", "key");
        return e6VarA.a.getString("im_accid", null);
    }

    public final int i() {
        return i;
    }

    public final void s() {
        d = null;
        b = null;
        i = 3;
    }

    public final void t() {
        i = 2;
    }

    @JvmStatic
    public static final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        h.submit(runnable);
    }

    public static final void b(boolean z) {
        g = z;
    }

    public static final void c(Context context) {
        b = context;
    }

    public static final void a(boolean z) {
        e.set(z);
        if (z) {
            f().b(new b2(101, 6, (String) null));
        } else {
            f().b(new b2(102, 6, (String) null));
        }
    }

    @JvmStatic
    public static final boolean b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "accountId");
        i = 1;
        b = context.getApplicationContext();
        e.set(true);
        d = str;
        if (Build.VERSION.SDK_INT >= 17 || c.length() > 0) {
            return true;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            WebView webView = new WebView(context);
            webView.setWebViewClient(new Id());
            String userAgentString = webView.getSettings().getUserAgentString();
            Intrinsics.checkNotNullExpressionValue(userAgentString, "getUserAgentString(...)");
            c = userAgentString;
            return true;
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
            return false;
        }
    }

    public static final void c(String str) {
        d = str;
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            s4.a(b(context));
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
        }
    }

    public final void a() {
        Context context = b;
        if (context != null) {
            File fileB = b(context);
            if (!fileB.mkdir() && !fileB.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
            } else {
                Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
            }
        }
    }

    public final boolean a(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT < 23) {
            String nameForUid = packageManager.getNameForUid(Binder.getCallingUid());
            if (nameForUid == null || packageManager.checkPermission(str, nameForUid) != 0) {
                return false;
            }
        } else {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr == null) {
                    return false;
                }
                for (String str2 : strArr) {
                    if (!Intrinsics.areEqual(str2, str)) {
                    }
                }
                return false;
            } catch (Exception unused) {
                Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
                return false;
            }
        }
        return true;
    }

    static {
        Intrinsics.checkNotNullExpressionValue("Kb", "TAG");
        h = Executors.newSingleThreadExecutor(new p5("Kb"));
    }

    public final File b(Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "primaryAccountId");
        Context context = b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = e6.b;
            e6.a(d6.a(context, "coppa_store"), "im_accid", str, false, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public final void a(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public final File a(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        a();
        File fileB = b(b);
        int length = str.length() / 2;
        String strSubstring = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder sbAppend = new StringBuilder().append(String.valueOf(strSubstring.hashCode() & Integer.MAX_VALUE));
        String strSubstring2 = str.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return new File(fileB, sbAppend.append(strSubstring2.hashCode() & Integer.MAX_VALUE).toString());
    }
}
