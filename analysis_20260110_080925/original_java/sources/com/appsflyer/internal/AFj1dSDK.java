package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.crashlytics.android.BuildConfig;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFj1dSDK;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/util/concurrent/ScheduledExecutorService;", "p0", "Ljava/lang/Runnable;", "p1", BuildConfig.FLAVOR, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", BuildConfig.FLAVOR, "getMediationNetwork", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFj1dSDK {
    public static final AFj1dSDK INSTANCE = new AFj1dSDK();

    private AFj1dSDK() {
    }

    @JvmStatic
    public static final void getMediationNetwork(ScheduledExecutorService p0, Runnable p1, long p2, TimeUnit p3) {
        Intrinsics.checkNotNullParameter(p0, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p3, BuildConfig.FLAVOR);
        try {
            p0.schedule(p1, p2, p3);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
