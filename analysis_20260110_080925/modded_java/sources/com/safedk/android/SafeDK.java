package com.safedk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.a;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.g;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.DeviceData;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.Api;
import com.safedk.android.utils.j;
import com.safedk.android.utils.l;
import com.safedk.android.utils.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class SafeDK {
    public static final String a = "com.safedk";
    private static final String c = "SafeDKMain";
    private static final String d = "SafeDK";
    private static final String e = "https://config.safedk.com/";
    private static final String f = "com.safedk.AppID";
    private static final String g = "com.safedk.ConfigPrefix";
    private static final String h = "com.safedk.APIPrefix";
    private static final String i = "com.safedk.DebugMode";
    private static final String j = "com.safedk.MaximumStatsSetSize";
    private static final String k = "com.safedk.AggregationThreshold";
    private static final boolean m = false;
    private static int n;
    private static boolean o;
    private static boolean q;
    private boolean p;
    private final Context s;
    private String v;
    private DeviceData w;
    private final Map<BrandSafetyUtils.AdType, b> x;
    private j y;
    private final AtomicBoolean z;
    private static final List<String> l = Arrays.asList(GooglePlayServicesUtilLight.GOOGLE_PLAY_STORE_PACKAGE, "com.amazon.venezia", "com.sec.android.app.samsungapps");
    private static SafeDK r = null;
    private static final d t = new d();
    private static final AtomicBoolean u = new AtomicBoolean(false);
    private static final AtomicBoolean A = new AtomicBoolean(false);
    private static final AtomicBoolean B = new AtomicBoolean(false);
    private static Boolean C = false;
    private static Boolean D = false;
    static final ExecutorService b = Executors.newFixedThreadPool(2);

    public static String getSdkKey() {
        return "PGkeOn9QTXC1m4FWUfQPBzPwPQe62RQV8MKpOcUbUy6mE3q710zz48uSMiGQli14WwV9HpVIuEVfU_SOminT5h";
    }

    public static boolean a() {
        return q;
    }

    public static boolean b() {
        return u.get();
    }

    private SafeDK(Context context) {
        this.v = null;
        this.x = new HashMap();
        this.z = new AtomicBoolean(false);
        Logger.d(c, "SafeDK ctor started");
        this.s = context;
        AppLovinBridge.init(context);
        Logger.d(c, "LifecycleManager initialized : " + com.safedk.android.internal.b.getInstance());
        if (c()) {
            Logger.d(c, "Before reading shared prefs");
            this.w = new DeviceData(context, this.y);
        }
    }

    public boolean c() {
        try {
            synchronized (D) {
                if (!D.booleanValue() && A != null && !A.get()) {
                    Logger.d(c, "loading config from prefs");
                    this.y = new j(this.s.getSharedPreferences("SafeDKToggles", 0), false);
                }
                D = true;
            }
        } catch (IllegalStateException e2) {
            Logger.d(c, "IllegalStateException caught during loading of configuration from prefs, device may be locked", e2);
        } catch (Throwable th) {
            Logger.d(c, "Exception during loading of configuration from prefs : " + th.getMessage(), th);
        }
        return D.booleanValue();
    }

    private void ah() throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = this.s.getPackageManager().getApplicationInfo(this.s.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY);
            if (applicationInfo.metaData == null) {
                Logger.e(c, "SafeDK meta data is missing from manifest file");
                return;
            }
            a(applicationInfo);
            b(applicationInfo);
            c(applicationInfo);
            d(applicationInfo);
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.d(c, "Couldn't get application's meta data");
        }
    }

    private void a(ApplicationInfo applicationInfo) {
        try {
            try {
                PackageInfo packageInfo = this.s.getPackageManager().getPackageInfo(this.s.getPackageName(), 0);
                Logger.d(c, "package is: " + packageInfo.packageName + ", Installer Package Name is " + this.s.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                q = l.contains(this.s.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                o = (applicationInfo.flags & 2) != 0;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendPath("apps").appendPath("cfg").appendPath(extractAppIdentifier(applicationInfo.metaData)).appendPath(String.valueOf(packageInfo.versionCode)).appendQueryParameter("store", String.valueOf(q));
                if (q) {
                    builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("versionName", packageInfo.versionName);
                }
                String string = builderAppendQueryParameter.build().toString();
                String strExtractUrlPrefix = extractUrlPrefix(applicationInfo.metaData);
                if (strExtractUrlPrefix == null || strExtractUrlPrefix.isEmpty()) {
                    Logger.d(c, "no apiURL Value in manifest");
                } else {
                    Logger.d(c, "apiURL Value from manifest is " + strExtractUrlPrefix + ". Setting new edge urls");
                    AppLovinBridge.receiveEdgeUrls(strExtractUrlPrefix, strExtractUrlPrefix);
                }
                n = packageInfo.versionCode;
                String string2 = applicationInfo.metaData.getString(g);
                if (string2 == null) {
                    String str = getDefaultConfig() + string;
                } else {
                    if (!string2.endsWith(File.separator)) {
                        string2 = string2 + File.separator;
                    }
                    if (string.startsWith(File.separator)) {
                        string = string.substring(1);
                    }
                    Logger.d(c, "basePrefix != null, configUrl:" + (string2 + string));
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.d(c, "Bad URL; won't update toggles");
            }
        } catch (Throwable th) {
            Logger.e(c, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    private static String extractAppIdentifier(Bundle metaData) {
        return metaData.getString(f);
    }

    private static String extractUrlPrefix(Bundle metaData) {
        return metaData.getString(h, "https://edge.safedk.com");
    }

    private static String getDefaultConfig() {
        return e;
    }

    public static String getProguardMD5() {
        return BuildConfig.FLAVOR;
    }

    private void b(ApplicationInfo applicationInfo) {
        boolean z = false;
        if (t.G() && (applicationInfo.metaData.getBoolean(i, false) || am())) {
            z = true;
        }
        Logger.setDebugMode(z);
    }

    public boolean d() throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = SafeDKApplication.getAppContext().getPackageManager().getApplicationInfo(this.s.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY);
            if (t.G()) {
                return applicationInfo.metaData.getBoolean(i, false) || am();
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    private void c(ApplicationInfo applicationInfo) {
        t.a(applicationInfo.metaData.getInt(j, 5000));
    }

    private void d(ApplicationInfo applicationInfo) {
        t.b(applicationInfo.metaData.getInt(k, 500));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (this.y != null) {
            String string = UUID.randomUUID().toString();
            this.v = string;
            this.y.a(string);
        }
    }

    public static void a(final Context context, final Application application) {
        Logger.d(c, "start started");
        l.a(b, new Runnable() { // from class: com.safedk.android.SafeDK.1
            @Override // java.lang.Runnable
            public void run() {
                if (SafeDK.r == null) {
                    SafeDK unused = SafeDK.r = new SafeDK(context);
                    SafeDK.r.an();
                    SafeDK.r.a(false);
                    SafeDK.r.b(true);
                } else {
                    Logger.d(SafeDK.c, "SafeDK already started");
                }
                SafeDK.a(application);
            }
        });
    }

    public static void a(Application application) {
        if (getInstance() != null && getInstance().p() && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(com.safedk.android.internal.b.getInstance());
            Logger.d(c, "registerActivityLifecycleCallbacks finished, application = " + application);
        }
    }

    private void aj() {
        try {
            if (!B.get() && this.y != null) {
                String strP = this.y.p();
                Logger.d(c, "setIsFirstSession Current safedk version : 5.10.4 , stored version is " + strP);
                if (strP == null || !"5.10.4".equals(strP)) {
                    Logger.d(c, "setIsFirstSession setting is_first_session to true");
                    this.p = true;
                    this.y.c("5.10.4");
                }
                B.set(true);
                return;
            }
            Logger.d(c, "setIsFirstSession already executed, value is " + this.p);
        } catch (Throwable th) {
            Logger.d(c, "setIsFirstSession Exception : " + th.getMessage(), th);
        }
    }

    public boolean e() {
        return this.p;
    }

    public static SafeDK getInstance() {
        return r;
    }

    public int f() {
        return t.a();
    }

    public void a(int i2) {
        t.K = i2;
    }

    public int g() {
        return t.b();
    }

    public int h() {
        return t.c();
    }

    public boolean i() {
        return t.d();
    }

    private void ak() {
        synchronized (this.x) {
            if (!this.x.containsKey(BrandSafetyUtils.AdType.a)) {
                this.x.put(BrandSafetyUtils.AdType.a, new InterstitialFinder());
            }
            if (!this.x.containsKey(BrandSafetyUtils.AdType.c) && q()) {
                this.x.put(BrandSafetyUtils.AdType.c, new BannerFinder(getInstance().Y()));
                if (Logger.getDebugMode()) {
                    try {
                        Class.forName("com.safedk.android.analytics.brandsafety.shakemenu.ShakeMenuManager");
                    } catch (ClassNotFoundException e2) {
                    } catch (Exception e3) {
                    }
                }
            }
            if (!this.x.containsKey(BrandSafetyUtils.AdType.b) && q()) {
                this.x.put(BrandSafetyUtils.AdType.b, new q(getInstance().Y()));
            }
            if (!this.x.containsKey(BrandSafetyUtils.AdType.d)) {
                this.x.put(BrandSafetyUtils.AdType.d, new NativeFinder(getInstance().Y()));
            }
        }
    }

    public void j() {
        A.set(true);
        CreativeInfoManager.d();
        al();
        aj();
        Logger.d(c, "Loading singletons");
        g.a();
        FileUploadManager.a();
        i.a();
        ak();
        this.z.set(true);
    }

    public void k() {
        if (StatsCollector.b()) {
            synchronized (this.x) {
                for (b bVar : this.x.values()) {
                    if (bVar.d() > 0) {
                        bVar.e();
                    }
                }
            }
        }
    }

    public void a(boolean z, boolean z2) {
        try {
            if (t.G()) {
                Logger.i(d, "SafeDK Device ID: " + r.v + ", SafeDK version: " + getVersion() + ", isOnUiThread = " + n.c());
            }
            if (r == null) {
                Logger.d(c, "instance is null, existing");
                return;
            }
            r.b(false);
            if (!t.G()) {
                Logger.d(c, "SafeDK is disabled.");
                Logger.setDebugMode(false);
                com.safedk.android.internal.b.getInstance().clearBackgroundForegroundListeners();
                return;
            }
            ah();
            if (am()) {
                Logger.setDebugMode(true);
            }
            Logger.d(c, "Configuration download completed, configurationDownloadedSuccessfully=" + z + ", isMaxProcess " + z2 + ", isActive " + t.G() + ", packageId = " + getInstance().m().getPackageName());
            if (t.G() && z2 && !A.get()) {
                A.set(true);
                CreativeInfoManager.d();
                CreativeInfoManager.b();
                al();
                if (z) {
                    Logger.d(c, "Will attempt to load events from storage");
                    if (StatsCollector.c() != null) {
                        StatsCollector.c().d();
                    }
                } else {
                    aj();
                }
                aj();
                Logger.d(c, "Loading singletons");
                g.a();
                FileUploadManager.a();
                i.a();
                ak();
            }
            this.z.set(true);
        } catch (Throwable th) {
            Logger.e(c, "Exception handling configuration event", th);
        }
    }

    private static void al() {
        if (!u.get()) {
            Logger.d(c, "Starting reporter thread");
            StatsCollector.a(true);
            int I = t.I();
            int iL = t.L();
            StatsReporter.a();
            StatsCollector.c().a(I, com.safedk.android.internal.b.getInstance().isInBackground(), iL, StatsReporter.b());
            StatsCollector.a(false);
            StatsCollector.b(getInstance().s());
            u.set(true);
            Logger.d(c, "Reporter thread started");
            return;
        }
        Logger.d(c, "Reporter thread already initialized, skipping");
    }

    public void a(Bundle bundle, boolean z) {
        Logger.d(c, "Updating configuration");
        boolean zA = t.a(bundle, true);
        if (zA) {
            a(bundle);
        }
        a(zA, z);
    }

    private void a(Bundle bundle) {
        if (this.y != null) {
            Logger.d(c, "Writing to shared preferences: " + bundle.toString());
            this.y.a(bundle);
        }
    }

    public static int l() {
        return n;
    }

    public Context m() {
        return this.s;
    }

    public boolean n() {
        return t.H() || am();
    }

    public boolean o() {
        return o;
    }

    public boolean p() {
        return t.G();
    }

    public boolean q() {
        return t.w();
    }

    public boolean r() {
        return t.x();
    }

    public boolean s() {
        return !t() && t.G();
    }

    public boolean t() {
        j jVar = this.y;
        if (jVar == null) {
            return true;
        }
        return jVar.b();
    }

    private boolean am() {
        try {
            Set setP = t.P();
            if (!setP.contains(Marker.ANY_MARKER)) {
                if (!setP.contains(this.v)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Logger.e(c, "Caught exception", th);
            new CrashReporter().caughtException(th);
            return false;
        }
    }

    public static boolean u() {
        return t.K();
    }

    public List<String> v() {
        return t.y();
    }

    public List<String> w() {
        return t.z();
    }

    public DeviceData x() {
        return this.w;
    }

    public Map<BrandSafetyUtils.AdType, b> y() {
        return this.x;
    }

    public a a(BrandSafetyUtils.AdType adType) {
        return this.x.get(adType);
    }

    public InterstitialFinder z() {
        return a(BrandSafetyUtils.AdType.a);
    }

    public BannerFinder A() {
        return a(BrandSafetyUtils.AdType.c);
    }

    public q B() {
        return (q) a(BrandSafetyUtils.AdType.b);
    }

    public NativeFinder C() {
        return a(BrandSafetyUtils.AdType.d);
    }

    public int D() {
        return t.e();
    }

    public int E() {
        return t.f();
    }

    public float F() {
        return t.g();
    }

    public float G() {
        return t.h();
    }

    public float H() {
        return t.i();
    }

    public boolean I() {
        return t.j();
    }

    public int J() {
        return t.k();
    }

    public long K() {
        return t.l();
    }

    public int L() {
        return t.m();
    }

    public int M() {
        return t.n();
    }

    public int N() {
        return t.p();
    }

    public boolean O() {
        return t.q();
    }

    public boolean P() {
        return t.o();
    }

    public boolean Q() {
        return t.S();
    }

    public void a(final boolean z) {
        try {
            l.a(b, new Runnable() { // from class: com.safedk.android.SafeDK.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.d(SafeDK.c, "Reading configuration from shared preferences, isMaxProcess = " + z);
                        if (SafeDK.this.y != null) {
                            SafeDK.this.v = SafeDK.this.y.a();
                            if (SafeDK.this.v == null) {
                                SafeDK.this.ai();
                            }
                            Bundle bundleE = SafeDK.this.y.e();
                            Logger.d(SafeDK.c, "configurationBundle loaded : " + bundleE.toString());
                            if (bundleE == null || bundleE.isEmpty()) {
                                Logger.d(SafeDK.c, "Configuration bundle from storage is empty");
                            } else {
                                Logger.d(SafeDK.c, "Parsing configuration from shared preferences");
                                SafeDK.t.a(bundleE, false);
                            }
                            SafeDK.this.a(false, z);
                        }
                    } catch (Throwable th) {
                        Logger.e(SafeDK.c, th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(c, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public void a(Activity activity) {
        Logger.d(c, "Starting interstitial finder in activity " + activity.getClass().getName());
        Iterator<b> it = this.x.values().iterator();
        while (it.hasNext()) {
            InterstitialFinder interstitialFinder = (a) it.next();
            if (interstitialFinder != null) {
                int i2 = AnonymousClass3.a[interstitialFinder.a().ordinal()];
                if (i2 == 1) {
                    interstitialFinder.c(activity);
                } else if (i2 == 2 || i2 == 3) {
                    interstitialFinder.b();
                }
            }
        }
    }

    /* renamed from: com.safedk.android.SafeDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BrandSafetyUtils.AdType.values().length];
            a = iArr;
            try {
                iArr[BrandSafetyUtils.AdType.a.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[BrandSafetyUtils.AdType.c.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[BrandSafetyUtils.AdType.d.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[BrandSafetyUtils.AdType.b.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public void b(Activity activity) {
        Logger.d(c, "Stopping interstitial finder in activity " + activity.getClass().getName());
        Iterator<b> it = this.x.values().iterator();
        while (it.hasNext()) {
            InterstitialFinder interstitialFinder = (a) it.next();
            if (interstitialFinder != null) {
                if (interstitialFinder.a() == BrandSafetyUtils.AdType.a) {
                    interstitialFinder.e(activity);
                } else {
                    interstitialFinder.c();
                }
            }
        }
    }

    public void c(Activity activity) {
        Logger.d(c, "Starting redirect monitoring in activity " + activity.getClass().getName());
        BannerFinder bannerFinderA = a(BrandSafetyUtils.AdType.c);
        if (bannerFinderA != null) {
            bannerFinderA.c(activity);
        }
    }

    public void a(String str) {
        synchronized (this.x) {
            for (b bVar : this.x.values()) {
                if (bVar != null) {
                    bVar.d(str);
                }
            }
        }
    }

    public void d(Activity activity) {
        if (p()) {
            Logger.d(c, "onForegroundActivity " + activity.getClass().getName());
            if (getInstance().c() && this.w == null) {
                Logger.d(c, "Before reading shared prefs");
                this.w = new DeviceData(this.s, this.y);
            }
        }
    }

    public void e(Activity activity) {
        if (p()) {
            Logger.d(c, "onBackgroundActivity " + activity.getClass().getName());
        }
    }

    public String b(String str) {
        JSONObject jSONObject;
        String string = null;
        if (this.y == null) {
            return null;
        }
        Logger.d(c, "getSdkVersion getSdkVersion: " + str);
        JSONObject jSONObjectJ = this.y.j();
        if (jSONObjectJ != null) {
            Logger.d(c, "getSdkVersion sdkVersionsJson=" + jSONObjectJ.toString());
        }
        try {
            jSONObject = jSONObjectJ.getJSONObject(str);
        } catch (Throwable th) {
        }
        if (jSONObject == null) {
            Logger.d(c, "getSdkVersion sdkData is null");
            return null;
        }
        Logger.d(c, "getSdkVersion sdkData : " + jSONObject.toString());
        string = jSONObject.getString("sdk_version");
        Logger.d(c, "getSdkVersion version : " + string);
        Logger.d(c, "return sdk version: " + string);
        return string;
    }

    public JSONObject R() {
        j jVar = this.y;
        if (jVar == null) {
            return null;
        }
        return jVar.j();
    }

    @Api
    public String getUserId() {
        return this.v;
    }

    public static String getVersion() {
        return "5.10.4";
    }

    public static boolean S() {
        return "5.10.4".contains("rc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        boolean zS = s();
        Logger.d(c, "notifyMonitorUserActivityUpdate shouldMonitorUser is " + zS);
        CreativeInfoManager.a(zS);
        com.safedk.android.internal.b.setActiveMode(zS);
        i.a(zS);
        if (z && !s()) {
            synchronized (this.x) {
                for (b bVar : this.x.values()) {
                    if (bVar != null) {
                        bVar.a((String) null);
                    }
                }
                this.x.clear();
            }
        }
    }

    public long T() {
        return t.T();
    }

    public int U() {
        return t.U();
    }

    public ArrayList<String> V() {
        return t.V();
    }

    public float W() {
        return t.r();
    }

    public float X() {
        return t.s();
    }

    public int Y() {
        return t.t();
    }

    public int Z() {
        return t.u();
    }

    public int aa() {
        return t.v();
    }

    public static boolean ab() {
        return C.booleanValue();
    }

    public static void ac() {
        Logger.d(c, "setMaxInitialized started");
        C = true;
        if (!b()) {
            al();
        }
    }

    public static boolean ad() {
        d dVar;
        boolean z = r != null && (dVar = t) != null && dVar.G() && C.booleanValue();
        if (!z) {
            Logger.d(c, "isSafeDKFullyInitialized returned false , instance = " + r + ",config = " + t + ", config.isActive() = " + t.G() + ", SafeDK.isMaxInitialized = " + C);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
            c(adType.toString());
        }
        c("Files");
    }

    private void c(String str) {
        File dir = m().getDir("SafeDK_" + str, 0);
        if (dir.exists() && dir.isDirectory()) {
            File file = new File(ae() + str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File[] fileArrListFiles = dir.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    file2.renameTo(new File(file, file2.getName()));
                }
            }
            dir.delete();
        }
    }

    public String ae() {
        return m().getFilesDir() + File.separator + "safedk" + File.separator;
    }
}
