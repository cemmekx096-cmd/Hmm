package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class RedirectDetails {
    public Long a = Long.valueOf(System.currentTimeMillis());
    public Long b = Long.valueOf(SystemClock.elapsedRealtime());
    public String c;
    public BrandSafetyUtils.AdType d;
    public RedirectType e;
    public String f;
    public String g;
    public String h;
    public RedirectDetails i;

    public enum RedirectType {
        REDIRECT,
        EXPAND
    }

    public RedirectDetails(String sdkPackageName, BrandSafetyUtils.AdType adType, RedirectType type, String viewAddress, String requestedUrl, String originatedMethod, RedirectDetails previousRedirectDetails) {
        this.c = sdkPackageName;
        this.d = adType;
        this.e = type;
        this.f = viewAddress;
        this.g = requestedUrl;
        this.h = originatedMethod;
        this.i = previousRedirectDetails;
    }

    public String toString() {
        return "RedirectDetails{ " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + " }";
    }
}
