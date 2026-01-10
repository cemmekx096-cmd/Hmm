package com.sfbx.appconsent.core.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.crashlytics.android.BuildConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/sfbx/appconsent/core/util/Utils;", BuildConfig.FLAVOR, "()V", "clientOrigin", BuildConfig.FLAVOR, "userAgent", "getClientOrigin", "getUserAgent", "init", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "initClientOrigin", "initUserAgent", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();
    private static String userAgent = BuildConfig.FLAVOR;
    private static String clientOrigin = BuildConfig.FLAVOR;

    private Utils() {
    }

    public final void init(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        initClientOrigin(context);
        initUserAgent();
    }

    private final void initUserAgent() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/%s (Android %s; %s %s)", Arrays.copyOf(new Object[]{"sfbx-premium", getClientOrigin(), Build.VERSION.RELEASE, Build.BRAND, Build.MODEL}, 5));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        userAgent = str;
    }

    private final void initClientOrigin(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        clientOrigin = packageInfo.packageName + ':' + packageInfo.versionName;
    }

    public final String getUserAgent() {
        return userAgent;
    }

    public final String getClientOrigin() {
        return clientOrigin;
    }
}
