package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class g implements AppLovinCommunicatorPublisher {
    private static final String a = "BrandSafetyReporter";
    private static final ExecutorService b = Executors.newSingleThreadExecutor();
    private static g c = null;

    private g() {
        d();
    }

    public static g a() {
        if (c == null) {
            c = new g();
        }
        return c;
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            public void a(String str, Bundle bundle) {
                Logger.d(g.a, "Response received, response=" + bundle.toString());
            }
        };
        AppLovinBridge.registerListener("v1/image_uploaded", bVar);
        AppLovinBridge.registerListener("v1/resolved", bVar);
    }

    public static void a(final Bundle bundle) {
        Logger.d(a, "report image uploaded to server started");
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                            return;
                        }
                        if (bundle.size() > 0) {
                            Logger.d(g.a, "Starting image upload report event.");
                            AppLovinBridge.reportImageUploadEvent(bundle, g.c);
                            String string = bundle.getString(c.i);
                            c cVarJ = b.j(string);
                            if (cVarJ != null) {
                                for (k kVar : cVarJ.g()) {
                                    if (string.contains(kVar.a)) {
                                        g.b(kVar, cVarJ.p);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public static void b(final Bundle bundle) {
        Logger.d(a, "report file uploaded to server started");
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null || bundle.size() <= 0) {
                            Logger.d(g.a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                        } else {
                            Logger.d(g.a, "Starting file upload report event.");
                            AppLovinBridge.reportFileUploadEvent(bundle, g.c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportFileUploadedToServer. data: " + bundle, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(k kVar, BrandSafetyUtils.AdType adType) {
        if (kVar != null) {
            a aVarA = SafeDK.getInstance().a(adType);
            if (aVarA != null) {
                Logger.d(a, "Executing image cleanup request");
                aVarA.b(kVar);
            } else {
                Logger.d(a, "Upload: finder not found for image cleanup request");
            }
        }
    }

    public static void c(final Bundle bundle) {
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        } else if (bundle.size() > 0) {
                            Logger.d(g.a, "Starting url resolution report event.");
                            AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public String b() {
        return "SafeDK";
    }
}
