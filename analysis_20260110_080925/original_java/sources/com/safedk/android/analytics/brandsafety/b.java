package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.mediation.ads.MaxAdView;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class b implements a {
    protected static final float A = 80.0f;
    protected static final List<String> B = Arrays.asList("com.unity3d.ads");
    protected static final Map<String, l> F = new LimitedConcurrentHashMap(90);
    public static final String f = "ad_format";
    protected static final String g = "type";
    protected static final String h = "WILL_DISPLAY";
    protected static final String i = "WILL_LOAD";
    protected static final String j = "DID_HIDE";
    protected static final String k = "DID_CLICKED";
    protected static final String l = "DID_LOAD";
    protected static final String m = "DID_DISPLAY";
    protected static final String n = "DID_FAIL_DISPLAY";
    protected static final String o = "id";
    protected static final String p = "network_name";
    protected static final String q = "third_party_ad_placement_id";
    protected static final String r = "creative_id";
    protected static final String s = "max_ad_unit_id";
    protected static final String t = "ad_view";
    protected static final String u = "dsp_name";
    public static final int v = 120;
    public static final String w = "revenue_event";
    public static final String x = "unknown";
    public static final String y = "no_CI_report";
    protected static final String z = "_BIDDING";
    protected String a;
    protected List<String> b;
    protected BrandSafetyUtils.AdType c;
    int e;
    protected int d = 0;
    protected final Map<String, c> C = new ConcurrentHashMap();
    protected final Set<String> D = new HashSet();
    protected final ScheduledExecutorService E = Executors.newScheduledThreadPool(1);

    protected abstract c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5);

    protected b(BrandSafetyUtils.AdType adType, List<String> list, String str, int i2) {
        this.e = 0;
        this.a = str;
        this.c = adType;
        this.b = list;
        this.e = i2;
        Logger.d(str, "ctor started, type: " + this.c + ", supported formats: " + this.b + ", maxAttemptsToCaptureImage = " + i2 + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        f();
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        AppLovinBridge.registerToReceiveMaxEvents(this);
        AppLovinBridge.registerToReceiveMaxRevenueEvents(this);
        if (Build.VERSION.SDK_INT >= 21) {
            ((ScheduledThreadPoolExecutor) this.E).setRemoveOnCancelPolicy(true);
            Logger.d(this.a, "ctor thread pool removal policy set");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public BrandSafetyUtils.AdType a() {
        return this.c;
    }

    public int d() {
        return this.C.size();
    }

    private void f() {
        List listC = BrandSafetyUtils.c(this.c);
        for (int i2 = 0; i2 < listC.size(); i2++) {
            BrandSafetyUtils.d dVar = (BrandSafetyUtils.d) listC.get(i2);
            String str = dVar.a() + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + dVar.c();
            synchronized (this.C) {
                this.C.put(str, a(dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e(), dVar.f()));
            }
        }
        Logger.d(this.a, "restore impressions for upload - number of loaded impressions to report " + this.C.size() + " " + this.C.keySet());
        if (this.C.size() > 0 && StatsCollector.b()) {
            e();
        }
    }

    protected boolean a(String str, View view) {
        AdNetworkDiscovery adNetworkDiscoveryI;
        if (str != null && (adNetworkDiscoveryI = CreativeInfoManager.i(str)) != null) {
            return adNetworkDiscoveryI.e(view);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void a(FileUploadManager.b bVar, FileUploadManager.a aVar, String str, String str2) {
        Logger.d(this.a, "handle upload request started, imageToUpload=" + str + ", adInfoCollectionForUpload=" + this.C);
        if (this.C.get(str) != null) {
            a(str, bVar, aVar, str2);
        } else {
            Logger.d(this.a, "handle upload request - adInfoCollectionForUpload doesn't contain imageToUpload " + str);
        }
        Logger.d(this.a, "handle upload request - adInfoCollectionForUpload remove key " + str);
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void f(String str) {
        Logger.d(this.a, "handle discard request started, imageToDiscard=" + str + ", adInfoCollectionForUpload=" + this.C + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        g(str);
        c cVar = this.C.get(str);
        if (cVar != null) {
            for (k kVar : cVar.g()) {
                if (str.contains(kVar.a)) {
                    b(kVar);
                }
            }
        }
        Logger.d(this.a, "handle discard request - adInfoCollectionForUpload remove key " + str);
        synchronized (this.C) {
            this.C.remove(str);
            Logger.d(this.a, "handle discard request - number of loaded impressions to report " + this.C.size() + " " + this.C.keySet());
        }
    }

    public void g(String str) {
        Logger.d(this.a, "Cleaning stored impressions: " + str);
        BrandSafetyUtils.a(this.c, str);
        h(str);
    }

    protected void h(String str) {
        Logger.d(this.a, "removal all impression images started, reportedImage = " + str + ", adInfoCollectionForUpload keys = " + this.C.keySet() + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        if (str.contains(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) {
            String str2 = str.split(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)[1];
            Logger.d(this.a, "removal all impression images impressionId = " + str2);
            synchronized (this.C) {
                Iterator<Map.Entry<String, c>> it = this.C.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next.getKey().endsWith(str2)) {
                        Logger.d(this.a, "removal all impression images removing " + next.getKey() + " ");
                        it.remove();
                    }
                }
                Logger.d(this.a, "removal all impression images - number of loaded impressions to report " + this.C.size() + " " + this.C.keySet());
            }
        }
        File file = new File(SafeDK.getInstance().ae() + this.c);
        Logger.d(this.a, "removal all impression images getting files for dir" + file.getPath());
        List listA = com.safedk.android.utils.b.a(file.getPath());
        Logger.d(this.a, "removal all impression images files for dir" + file.getPath() + " : " + listA);
    }

    protected String i(String str) {
        String[] strArrSplit;
        if (str != null && (strArrSplit = new File(str).getName().replace(".jpg", BuildConfig.FLAVOR).split(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) != null && strArrSplit.length >= 4) {
            return strArrSplit[0] + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + strArrSplit[2];
        }
        return null;
    }

    private void a(final String str, final FileUploadManager.b bVar, final FileUploadManager.a aVar, final String str2) {
        synchronized (this.C) {
            Logger.d(this.a, "Uploading impression " + str + " to server, timeout=" + SafeDK.getInstance().L() + "ms, adInfoCollectionForUpload = " + this.C + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        }
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.a(str, bVar, aVar, str2, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final java.lang.String r11, com.safedk.android.analytics.brandsafety.FileUploadManager.b r12, final com.safedk.android.analytics.brandsafety.FileUploadManager.a r13, final java.lang.String r14, final int r15) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.b.a(java.lang.String, com.safedk.android.analytics.brandsafety.FileUploadManager$b, com.safedk.android.analytics.brandsafety.FileUploadManager$a, java.lang.String, int):void");
    }

    public synchronized void e() {
        Logger.d(this.a, "synchronize impressions and events - impression size is: " + this.C.size() + " and keys: " + this.C.keySet() + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("synchronize impressions and events - BrandSafetyEvents keys ");
        sb.append(StatsCollector.c().a(StatsCollector.EventType.h).keySet());
        Logger.d(str, sb.toString());
        ConcurrentHashMap concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.h);
        Iterator<Map.Entry<String, c>> it = this.C.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c value = next.getValue();
            String key = next.getKey();
            k kVarI = value.i();
            if (kVarI != null) {
                if (kVarI.c != null && kVarI.c.b != null) {
                    Logger.d(this.a, "synchronize impressions and events - deleting file: " + kVarI.c.b);
                    BrandSafetyUtils.d(kVarI.c.b);
                }
                BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) concurrentHashMapA.get(kVarI.a);
                if (brandSafetyEvent == null || key == null || !key.equals(brandSafetyEvent.h())) {
                    String str2 = this.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("synchronize impressions and events - remove impressionId: ");
                    sb2.append(kVarI.a);
                    sb2.append(", impression hash: ");
                    sb2.append(key);
                    sb2.append(", event hash: ");
                    sb2.append(brandSafetyEvent != null ? brandSafetyEvent.h() : "null");
                    Logger.d(str2, sb2.toString());
                    it.remove();
                } else if (brandSafetyEvent.h() != null) {
                    Logger.d(this.a, "synchronize impressions and events - clearing image hash value: " + brandSafetyEvent.h());
                    brandSafetyEvent.c();
                }
            }
        }
        Logger.d(this.a, "synchronize impressions and events - number of loaded impressions to report " + this.C.size() + " " + this.C.keySet());
    }

    public static c j(String str) {
        if (str != null) {
            for (b bVar : SafeDK.getInstance().y().values()) {
                synchronized (bVar.C) {
                    Logger.d("AdFinderBase", "get impression ad info by image ID: " + str + ", type: " + bVar.a() + ", keys: " + bVar.C.keySet() + ", isOnUiThread = " + com.safedk.android.utils.n.c());
                }
                c cVar = bVar.C.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        return null;
    }

    public c k(String str) {
        return null;
    }

    public void a(c cVar, k kVar) {
        if (cVar != null && kVar.c != null && kVar.c.a != null && kVar.a != null) {
            Logger.d(this.a, "add info collection for upload " + kVar.c.a + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + kVar.a + ", file = " + kVar.c.b);
            synchronized (this.C) {
                this.C.put(kVar.c.a + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + kVar.a, cVar);
                Logger.d(this.a, "add info collection for upload - number of loaded impressions to report " + this.C.size() + " " + this.C.keySet());
            }
        }
    }

    public boolean c(String str, String str2) {
        return this.C.containsKey(str + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + str2);
    }

    public boolean d(String str, String str2) {
        return this.D.contains(str + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + str2);
    }

    protected boolean d(String str, String str2, String str3) {
        BrandSafetyUtils.a aVarB;
        boolean z2 = true;
        try {
            if (new File(str).exists()) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (com.safedk.android.utils.n.a(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) || com.safedk.android.utils.n.b(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight())) {
                    aVarB = BrandSafetyUtils.b(str2, bitmapDecodeFile);
                    if (BrandSafetyUtils.b(str2, aVarB) != BrandSafetyUtils.ScreenshotValidity.a) {
                        z2 = false;
                    }
                } else {
                    aVarB = BrandSafetyUtils.a(str2, bitmapDecodeFile);
                    if (BrandSafetyUtils.a(str2, aVarB) != BrandSafetyUtils.ScreenshotValidity.a) {
                        z2 = false;
                    }
                }
                Logger.d(this.a, "Image file validation check hashValue = " + str3 + ", dimen h,w: " + bitmapDecodeFile.getHeight() + "," + bitmapDecodeFile.getWidth() + ", bitmapScanResult result = " + aVarB + ", isValid = " + z2 + ", filename = " + str);
            } else {
                Logger.d(this.a, "Image file validation check file does not exist = " + str);
            }
        } catch (Throwable th) {
            Logger.d(this.a, "Image file validation check exception : " + th.getMessage(), th);
        }
        return z2;
    }

    protected String a(List<o> list) {
        if (list == null || list.size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            sb.append(list.get(i2).a.ai());
            sb.append(", ");
        }
        sb.append(list.get(list.size() - 1).a.ai());
        sb.append("]");
        return sb.toString();
    }

    protected static String[] a(Activity activity) {
        String str;
        String strA = null;
        if (activity == null) {
            str = null;
        } else {
            String string = activity.toString();
            String strA2 = BrandSafetyUtils.a(string, true);
            strA = BrandSafetyUtils.a(string, false);
            str = strA2;
        }
        return new String[]{strA, str};
    }

    protected void a(c cVar) {
        if (cVar != null && !cVar.I) {
            Logger.d(this.a, "_AD_CAPTURE_ clearing any images taken previously");
            k kVarI = cVar.i();
            if (kVarI != null) {
                a(kVarI);
            }
            cVar.I = true;
            return;
        }
        Logger.d(this.a, "avoid clearing any images taken previously");
    }

    public void a(k kVar) {
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("remove impression screenshots started with impression: ");
        sb.append(kVar);
        sb.append(", report impression size is: ");
        Set<String> set = this.D;
        sb.append(set != null ? Integer.valueOf(set.size()) : "null");
        Logger.d(str, sb.toString());
        if (kVar != null) {
            String str2 = kVar.d;
            if (str2 == null && kVar.c != null) {
                str2 = kVar.c.b;
            }
            if (str2 != null) {
                Logger.d(this.a, "Calling remove ad files, filename = " + str2);
                BrandSafetyUtils.d(str2);
                kVar.d = null;
            } else {
                Logger.d(this.a, "lastActivityImpressionScreenshotFilename is null and image is: " + kVar.c);
            }
        }
        this.D.clear();
    }

    public static boolean a(c cVar, CreativeInfo creativeInfo) {
        String strA;
        return CreativeInfoManager.a(creativeInfo.T() == null ? creativeInfo.S() : creativeInfo.T(), AdNetworkConfiguration.ac, false) && (strA = CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.ad, (String) null)) != null && strA.contains(cVar.A()) && cVar.z() != null;
    }

    protected void b(c cVar, CreativeInfo creativeInfo) {
        Logger.d(this.a, "should replace prefetch creativeId with max value, ad info sdk : " + cVar.c() + ", ci sdk : " + creativeInfo.S() + ", actual sdk : " + creativeInfo.T());
        if (a(cVar, creativeInfo)) {
            Logger.d(this.a, "updating creativeId from " + cVar.j().P() + " to " + cVar.z());
            cVar.j().k(cVar.z());
        }
    }

    static void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            list.add(new WeakReference<>(childAt));
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list);
            }
        }
    }

    static List<WeakReference<View>> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(viewGroup));
        a(viewGroup, arrayList);
        return arrayList;
    }

    protected List<WeakReference<WebView>> b(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a(weakReference) && (weakReference.get() instanceof WebView)) {
                WebView webView = (WebView) weakReference.get();
                arrayList.add(new WeakReference(webView));
                Logger.d(this.a, "getWebViews added WebView address " + webView);
            }
        }
        return arrayList;
    }

    static List<String> c(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a(weakReference)) {
                arrayList.add(BrandSafetyUtils.a(weakReference.get()));
            } else {
                arrayList.add(BuildConfig.FLAVOR);
            }
        }
        return arrayList;
    }

    public Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Logger.d(this.a, "getActivity: now context type is: " + context.getClass().getName());
        }
        return null;
    }

    static Activity a(Bundle bundle) {
        Logger.d("AdFinderBase", "getMaxAdViewActivity: started, isOnUiThread = " + com.safedk.android.utils.n.c());
        String strN = BrandSafetyUtils.n(bundle.getString(t, null));
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        try {
            Iterator it = com.safedk.android.internal.b.getInstance().getAppActivities().iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null && weakReference.get() != null) {
                    Activity activity = (Activity) weakReference.get();
                    View viewFindViewById = activity.findViewById(R.id.content);
                    if ((viewFindViewById instanceof ViewGroup) && c(a((ViewGroup) viewFindViewById)).contains(strN)) {
                        Logger.d("AdFinderBase", "getMaxAdViewActivity: found activity with name " + activity.getClass().getName());
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("AdFinderBase", "getMaxAdViewActivity: exception occurred " + e.getMessage());
        }
        return foregroundActivity;
    }

    void b(Activity activity) {
        String strA = BrandSafetyUtils.a(com.safedk.android.internal.b.getInstance().getForegroundActivity().getClass().getName(), true);
        String strA2 = BrandSafetyUtils.a(activity.getClass().getName(), true);
        if (strA2 != null && !strA2.equals(strA)) {
            Logger.d(this.a, "compare ad activity to foreground found ad activity different than foreground, foreground address is: " + strA + ", and activity address is: " + strA2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str, String str2, String str3) {
    }

    public static boolean e(String str, String str2) {
        l lVar;
        if (str != null && (lVar = F.get(str)) != null) {
            return lVar.a(str2);
        }
        return false;
    }

    public static void a(String str, Long l2, Long l3, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                l lVar = F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    F.put(str, lVar);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + F.size());
                }
                lVar.a(l2, l3, str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(String str, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                l lVar = F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    F.put(str, lVar);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + F.size());
                }
                lVar.a(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(c cVar, String str, l.a... aVarArr) {
        if (cVar != null) {
            if (cVar.K != null) {
                a(cVar.K, str, aVarArr);
                return;
            } else {
                cVar.a(str, aVarArr);
                return;
            }
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void b(String str, String str2, l.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                l lVar = F.get(str);
                if (lVar == null) {
                    lVar = new l();
                    F.put(str, lVar);
                    Logger.d("AdFinderBase", "add cumulative impression log event - key: " + str + ", impression log map size: " + F.size());
                }
                lVar.b(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add cumulative impression log event - event id is null, not adding impression log event");
    }

    protected static void b(c cVar) {
        if (cVar != null) {
            synchronized (F) {
                if (cVar.L != null && F.remove(cVar.L) != null) {
                    Logger.d("AdFinderBase", "clear impression log, eventId: " + cVar.L + ", impression log map size: " + F.size());
                }
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        if (F.remove(str) != null) {
                            Logger.d("AdFinderBase", "clear impression log, viewAddress: " + str + ", impression log map size: " + F.size());
                        }
                    }
                } else if (cVar.K != null && F.remove(cVar.K) != null) {
                    Logger.d("AdFinderBase", "clear impression log, viewAddress: " + cVar.K + ", impression log map size: " + F.size());
                }
            }
        }
    }

    protected static l b(c cVar, k kVar) {
        l lVarRemove;
        l lVarRemove2;
        if (cVar != null && kVar != null) {
            synchronized (F) {
                if (cVar.L != null && (lVarRemove2 = F.remove(cVar.L)) != null) {
                    cVar.R.a(lVarRemove2);
                    Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.L + ", events: " + lVarRemove2.a() + ", impression log map size: " + F.size());
                }
                if (!cVar.U) {
                    if (cVar.x() != null) {
                        for (String str : cVar.x()) {
                            l lVarRemove3 = F.remove(str);
                            if (lVarRemove3 != null) {
                                kVar.h.a(lVarRemove3);
                                Logger.d("AdFinderBase", "collect impression logs - key: " + str + ", events: " + lVarRemove3.a() + ", impression log map size: " + F.size());
                            }
                        }
                    } else if (cVar.K != null && (lVarRemove = F.remove(cVar.K)) != null) {
                        kVar.h.a(lVarRemove);
                        Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.K + ", events: " + lVarRemove.a() + ", impression log map size: " + F.size());
                    }
                }
            }
            l lVar = new l(cVar.R);
            lVar.a(kVar.h);
            StringBuilder sb = new StringBuilder("collect impression logs, ad info: ");
            sb.append(cVar.R.a());
            sb.append(", impression: ");
            sb.append(kVar.h.a());
            if (kVar.i() != null) {
                l lVarG = kVar.i().G();
                lVar.a(lVarG);
                sb.append(", ci: ");
                sb.append(lVarG.a());
            }
            sb.append(", total: ");
            sb.append(lVar.a());
            Logger.d("AdFinderBase", sb.toString());
            return lVar;
        }
        return null;
    }

    public static List<String> a(View view) {
        if (view == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.toString());
        }
        return arrayList;
    }

    public static List<ViewParent> b(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    public static void a(ViewGroup viewGroup, List<String> list, List<String> list2, int i2) {
        if (viewGroup == null) {
            return;
        }
        int i3 = i2 + 1;
        int i4 = 0;
        while (i4 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i4);
            list.add(BrandSafetyUtils.a(childAt));
            StringBuilder sb = new StringBuilder();
            sb.append("h");
            sb.append(i3);
            sb.append("c");
            i4++;
            sb.append(i4);
            sb.append(":");
            sb.append(childAt);
            list2.add(sb.toString());
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list, list2, i3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.ViewParent] */
    public static BrandSafetyUtils.AdType a(String str, WebView webView) {
        if (webView != 0) {
            AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(str);
            do {
                if (webView instanceof View) {
                    View view = webView;
                    if (com.safedk.android.utils.n.a(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", BANNER ratio, isOnUiThread = " + com.safedk.android.utils.n.c());
                        return BrandSafetyUtils.AdType.c;
                    }
                    if (com.safedk.android.utils.n.b(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", MREC ratio, isOnUiThread = " + com.safedk.android.utils.n.c());
                        return BrandSafetyUtils.AdType.b;
                    }
                    if (webView instanceof MaxAdView) {
                        BrandSafetyUtils.AdType adType = (BrandSafetyUtils.AdType) BannerFinder.f().get(BrandSafetyUtils.a(webView));
                        if (adType != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: " + view + ", MaxAdView type: " + adType.name() + ", isOnUiThread = " + com.safedk.android.utils.n.c());
                            return adType;
                        }
                    } else if (adNetworkDiscoveryI != null) {
                        BrandSafetyUtils.AdType adTypeF = adNetworkDiscoveryI.f(view);
                        if (adTypeF != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: " + view + ", discovery detected type: " + adTypeF);
                            return adTypeF;
                        }
                    } else if (com.safedk.android.internal.b.getInstance().isInterstitialActivity(view.getContext()) && SafeDK.getInstance().A().b(BrandSafetyUtils.a(view)) == null) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", INTERSTITIAL activity: " + view.getContext() + ", isOnUiThread = " + com.safedk.android.utils.n.c());
                        return BrandSafetyUtils.AdType.a;
                    }
                }
                Logger.d("AdFinderBase", "extract ad type from view: " + webView + ", not detected");
                webView = webView.getParent();
            } while (webView != 0);
        }
        Logger.d("AdFinderBase", "extract ad type from view: failed to extract");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(Bitmap bitmap, c cVar) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b() {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c() {
    }

    protected void b(ViewGroup viewGroup, List<WeakReference<WebView>> list) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof WebView) {
                    list.add(new WeakReference<>((WebView) childAt));
                    String str = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("find WebViews in view group - found view: ");
                    sb.append(childAt);
                    sb.append(" , parent: ");
                    sb.append(childAt.getParent() != null ? childAt.getParent().toString() : "null");
                    Logger.d(str, sb.toString());
                } else if (childAt instanceof ViewGroup) {
                    b((ViewGroup) childAt, list);
                }
            } catch (Throwable th) {
                Logger.d(this.a, "caught exception: ", th);
                return;
            }
        }
    }

    static void c(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        View view = list.get(0).get();
        long width = view.getWidth() * view.getHeight();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            long width2 = childAt.getWidth() * childAt.getHeight();
            if (width > 0 && width2 > 0 && (width2 / width) * 100.0f >= A) {
                list.add(new WeakReference<>(childAt));
            }
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, list);
            }
        }
    }

    public c b(String str, x xVar) {
        String str2;
        String str3;
        String str4;
        v vVar;
        v vVar2;
        long jLongValue;
        String strC = xVar.c();
        c cVarB = b(strC);
        if (cVarB != null && cVarB.c().equals(str)) {
            String str5 = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("handle website opened for ");
            sb.append(str);
            String str6 = " ";
            sb.append(" ");
            sb.append(cVarB.p.name());
            String str7 = ", view address: ";
            sb.append(", view address: ");
            sb.append(xVar.c());
            String str8 = ", requested URL: ";
            sb.append(", requested URL: ");
            sb.append(xVar.a());
            sb.append(", target URL: ");
            sb.append(xVar.b());
            Logger.d(str5, sb.toString());
            RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(cVarB.p));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iH = SafeDK.getInstance().h();
            int size = cVarB.x().size() - 1;
            boolean z2 = false;
            v vVar3 = null;
            while (true) {
                if (size < 0) {
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                    vVar = vVar3;
                    break;
                }
                v vVarA = DetectTouchUtils.a(str, cVarB.x().get(size));
                if (vVarA == null) {
                    vVar2 = vVarA;
                    jLongValue = 0;
                } else {
                    vVar2 = vVarA;
                    jLongValue = vVarA.a.longValue();
                }
                String str9 = this.a;
                str4 = str8;
                StringBuilder sb2 = new StringBuilder();
                str3 = str7;
                sb2.append("handle website opened, view: ");
                sb2.append(strC);
                sb2.append(", last touch event time: ");
                sb2.append(jLongValue);
                sb2.append(", diff: ");
                str2 = str6;
                long j2 = jElapsedRealtime - jLongValue;
                sb2.append(j2);
                long j3 = jElapsedRealtime;
                sb2.append(", threshold: ");
                sb2.append(iH);
                Logger.d(str9, sb2.toString());
                z2 = (iH == 0 || jLongValue == 0 || j2 > ((long) iH)) ? false : true;
                if (!z2) {
                    size--;
                    str8 = str4;
                    vVar3 = vVar2;
                    str7 = str3;
                    str6 = str2;
                    jElapsedRealtime = j3;
                } else {
                    vVar = vVar2;
                    break;
                }
            }
            xVar.a(cVarB);
            xVar.a(vVar);
            xVar.e();
            k kVarI = cVarB.i();
            if (kVarI != null) {
                redirectData.a(xVar.a(), xVar.b());
                redirectData.l = !z2;
                String str10 = this.a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("handle ");
                sb3.append(redirectData.l ? "auto " : BuildConfig.FLAVOR);
                sb3.append("website opened for ");
                sb3.append(str);
                sb3.append(str2);
                sb3.append(cVarB.p.name());
                sb3.append(str3);
                sb3.append(strC);
                sb3.append(str4);
                sb3.append(xVar.a());
                sb3.append(", redirect URL: ");
                sb3.append(xVar.b());
                Logger.d(str10, sb3.toString());
                kVarI.a(redirectData);
                return cVarB;
            }
            return null;
        }
        return null;
    }
}
