package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class n extends c {
    public boolean V;
    Set<String> W;
    boolean X;
    boolean Y;
    long Z;
    boolean aa;
    public String ab;

    /* renamed from: ac, reason: collision with root package name */
    public String f668ac;
    public long ad;
    public boolean ae;
    public long af;
    public BrandSafetyUtils.ScreenShotOrientation ag;
    public boolean ah;
    public h ai;
    public boolean aj;
    public ScheduledFuture<?> ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public WeakReference<Activity> ap;
    boolean aq;
    String ar;
    boolean as;
    public final Object at;
    public final Object au;

    public boolean H() {
        return this.aq;
    }

    public void g(boolean z) {
        this.aq = z;
    }

    public n(String str, int i, Bundle bundle) {
        super(i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.a, BrandSafetyUtils.AdType.a);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.aa = false;
        this.ab = null;
        this.f668ac = null;
        this.ad = 0L;
        this.ae = false;
        this.af = 0L;
        this.ag = BrandSafetyUtils.ScreenShotOrientation.a;
        this.ah = false;
        this.ai = null;
        this.aj = false;
        this.ak = null;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = true;
        this.aq = false;
        this.ar = null;
        this.as = false;
        this.at = new Object();
        this.au = new Object();
        this.W = new HashSet();
        if (str != null) {
            this.aj = CreativeInfoManager.a(str, AdNetworkConfiguration.y, false);
        }
    }

    public n(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.a);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.aa = false;
        this.ab = null;
        this.f668ac = null;
        this.ad = 0L;
        this.ae = false;
        this.af = 0L;
        this.ag = BrandSafetyUtils.ScreenShotOrientation.a;
        this.ah = false;
        this.ai = null;
        this.aj = false;
        this.ak = null;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = true;
        this.aq = false;
        this.ar = null;
        this.as = false;
        this.at = new Object();
        this.au = new Object();
        this.q = str5;
    }

    public void I() {
        this.X = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("maxSdk: ");
        String str = this.v;
        String str2 = BuildConfig.FLAVOR;
        sb.append(str != null ? this.v : BuildConfig.FLAVOR);
        sb.append(", activity address: ");
        sb.append(this.B != null ? this.B : BuildConfig.FLAVOR);
        sb.append(", view address: ");
        sb.append(this.K != null ? this.K : BuildConfig.FLAVOR);
        sb.append(", interstitial activity name: ");
        String str3 = this.f668ac;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(", eventId: ");
        if (this.L != null) {
            str2 = this.L;
        }
        sb.append(str2);
        sb.append(", isAdFinished: ");
        sb.append(this.U);
        sb.append(", number of CIs: ");
        sb.append(k().size());
        return sb.toString();
    }

    public boolean J() {
        WeakReference<Activity> weakReference = this.ap;
        return ((weakReference == null || weakReference.get() == null) && (!this.aj || j() == null || j().f() == null)) ? false : true;
    }

    public View K() {
        WeakReference<Activity> weakReference = this.ap;
        if (weakReference != null && weakReference.get() != null) {
            return this.ap.get().getWindow().getDecorView().findViewById(R.id.content);
        }
        if (this.aj && j() != null) {
            return j().f();
        }
        return null;
    }

    public void a(String str, boolean z) {
        if (str != null) {
            String str2 = this.ar;
            if (str2 == null) {
                this.ar = str;
                return;
            }
            if (!z || !str2.contains(str)) {
                this.ar += "||" + str;
            }
        }
    }

    public void L() {
        d(this.ar);
    }

    public void e(String str) {
        i().k = true;
        this.as = true;
        b("vie", new l.a("org", str));
    }
}
