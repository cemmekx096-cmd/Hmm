package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class e extends c {
    protected static final String aq = "network_name";
    protected static final String ar = "ad_format";
    protected static final String as = "BANNER";
    protected static final String at = "MREC";
    public static final String au = "NATIVE";
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    boolean aa;
    public String ab;

    /* renamed from: ac, reason: collision with root package name */
    boolean f667ac;
    boolean ad;
    ScheduledFuture<?> ae;
    WeakReference<Activity> af;
    boolean ag;
    boolean ah;
    long ai;
    long aj;
    float ak;
    String al;
    public BannerFinder.a am;
    boolean an;
    String ao;
    String ap;
    protected d av;

    public e(String[] strArr, String str, int i, String str2, Bundle bundle, String str3) {
        this(strArr, str, i, str2, bundle, str3, BrandSafetyUtils.AdType.c);
    }

    public e(String str, long j) {
        this(str, j, BrandSafetyUtils.AdType.c);
    }

    protected e(String[] strArr, String str, int i, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.a, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = BuildConfig.FLAVOR;
        this.f667ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
        this.av = null;
        this.al = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.c);
    }

    protected e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = BuildConfig.FLAVOR;
        this.f667ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
        this.av = null;
        this.q = str5;
    }

    protected e(String str, long j, BrandSafetyUtils.AdType adType) {
        super(str, j, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = BuildConfig.FLAVOR;
        this.f667ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
        this.av = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarM = m();
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" webView: ");
        sb.append(this.K);
        sb.append(" isActive: ");
        sb.append(this.aa);
        sb.append(" hash: ");
        sb.append(jVarM != null ? jVarM.a : null);
        sb.append(" url: ");
        sb.append(e());
        sb.append(" isClicked: ");
        sb.append(d());
        sb.append(" touch timestamp: ");
        sb.append(v());
        sb.append(" activity address: ");
        sb.append(this.B);
        sb.append(" activity class name: ");
        sb.append(this.C);
        sb.append(" filename: ");
        sb.append(jVarM != null ? jVarM.b : null);
        sb.append(" type: ");
        sb.append(this.p);
        sb.append(", eventId: ");
        sb.append(this.L);
        sb.append(", requestNoSamplingReceived: ");
        sb.append(this.O);
        sb.append(", onVideoCompletedEventHasBeenTriggered: ");
        sb.append(i() != null ? Boolean.valueOf(i().k) : "null");
        return sb.toString();
    }

    public boolean H() {
        if (this.A != null && this.A.containsKey(aq)) {
            return this.A.getString(aq).contains(au);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void f(boolean z) {
        super.f(z);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = BuildConfig.FLAVOR;
        this.f667ac = false;
        this.ad = false;
        this.ah = false;
        if (z) {
            this.ak = 0.0f;
        }
        this.al = null;
        this.T = false;
        BannerFinder.a aVar = this.am;
        if (aVar != null && aVar.d != null) {
            this.am.d.cancel(false);
        }
        this.am = null;
        this.af = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.v = null;
        this.af = null;
        this.al = null;
        this.aa = false;
        this.ag = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i) {
        super.a(dVar, bundle, i);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] strArrA = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.C = strArrA[0];
            this.B = strArrA[1];
        }
        this.v = CreativeInfoManager.b(bundle.getString(aq));
        this.af = new WeakReference<>(BannerFinder.a(bundle));
        this.al = BrandSafetyUtils.c().name().toLowerCase();
        this.aa = true;
        this.ag = true;
    }

    public boolean I() {
        if (this.A != null && this.A.containsKey("ad_format")) {
            return this.A.getString("ad_format").equals(at);
        }
        return false;
    }
}
