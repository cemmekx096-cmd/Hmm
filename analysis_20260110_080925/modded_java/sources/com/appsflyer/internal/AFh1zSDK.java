package com.appsflyer.internal;

import com.crashlytics.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AFh1zSDK extends AFg1gSDK {
    private final AFc1dSDK AFAdRevenueData;

    public AFh1zSDK(AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = aFc1dSDK;
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        if (z3) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.AFAdRevenueData.afRDLog().getMediationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
