package com.devtodev.analytics.internal.platform.repository.android;

import android.os.Build;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.platform.repository.utils.Root;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidConstants.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/android/AndroidConstants;", BuildConfig.FLAVOR, "()V", "getDeviceVersionKey", BuildConfig.FLAVOR, "getManufacturer", "getModel", "getTimezoneOffset", BuildConfig.FLAVOR, "isRooted", BuildConfig.FLAVOR, "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AndroidConstants {
    private static final int MILLISECONDS = 1000;

    public final String getDeviceVersionKey() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
        return str;
    }

    public final String getManufacturer() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
        return str;
    }

    public final String getModel() {
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "MODEL");
        return str;
    }

    public final int getTimezoneOffset() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    public final boolean isRooted() {
        return Root.Companion.isDeviceRooted();
    }
}
