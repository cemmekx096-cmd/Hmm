package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class s extends c {
    boolean V;
    boolean W;
    boolean X;
    ScheduledFuture<?> Y;
    ScheduledFuture<?> Z;
    WeakReference<Activity> aa;
    public NativeFinder.a ab;

    /* renamed from: ac, reason: collision with root package name */
    boolean f669ac;
    long ad;
    long ae;
    float af;
    String ag;
    boolean ah;

    public s(String[] strArr, String str, int i, String str2, Bundle bundle, String str3) {
        this(strArr, str, i, str2, bundle, str3, BrandSafetyUtils.AdType.d);
    }

    public s(String str, long j) {
        super(str, j, BrandSafetyUtils.AdType.d);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = null;
        this.f669ac = false;
        this.ad = 0L;
        this.ae = 0L;
        this.af = 0.0f;
        this.ag = null;
        this.ah = false;
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.d);
    }

    protected s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = null;
        this.f669ac = false;
        this.ad = 0L;
        this.ae = 0L;
        this.af = 0.0f;
        this.ag = null;
        this.ah = false;
        this.q = str5;
    }

    private s(String[] strArr, String str, int i, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.a, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = null;
        this.f669ac = false;
        this.ad = 0L;
        this.ae = 0L;
        this.af = 0.0f;
        this.ag = null;
        this.ah = false;
        this.ag = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }
}
