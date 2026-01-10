package com.appsflyer.internal;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AFi1tSDK {
    public final Context getCurrencyIso4217Code;
    public AFi1pSDK getMediationNetwork;

    public AFi1tSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = context;
    }
}
