package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFj1xSDK;
import com.appsflyer.internal.AFj1zSDK$;
import com.crashlytics.android.BuildConfig;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AFj1zSDK extends AFi1dSDK {
    private final Runnable component3;
    private final AFj1ySDK getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    public final void getRevenue(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        if (!AFAdRevenueData(context)) {
            this.component3.run();
        } else {
            this.getMonetizationNetwork.execute(new AFj1zSDK$.ExternalSyntheticLambda0(this, context));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[PHI: r0
      0x00bd: PHI (r0v6 java.lang.String) = (r0v5 java.lang.String), (r0v11 java.lang.String), (r0v16 java.lang.String) binds: [B:19:0x004f, B:33:0x0085, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFAdRevenueData(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1zSDK.AFAdRevenueData(android.content.Context):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean getCurrencyIso4217Code(Context context) throws NoWhenBranchMatchedException {
        int i = AFa1vSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i == 1) {
            return getMediationNetwork(context);
        }
        if (i == 2) {
            return getMonetizationNetwork(context);
        }
        if (i == 3) {
            return component2(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1zSDK(AFc1pSDK aFc1pSDK, ExecutorService executorService, AFj1ySDK aFj1ySDK, Runnable runnable, Runnable runnable2) throws NoWhenBranchMatchedException {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(executorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFj1ySDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(runnable2, BuildConfig.FLAVOR);
        int i = AFj1xSDK.AFa1ySDK.getMonetizationNetwork[aFj1ySDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFj1ySDK;
        this.component3 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113 A[Catch: all -> 0x0280, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:3:0x002b, B:7:0x003e, B:9:0x0044, B:24:0x0113, B:10:0x006f, B:11:0x0083, B:12:0x0088, B:13:0x0089, B:15:0x008f, B:16:0x00b9, B:17:0x00cc, B:19:0x00d2, B:20:0x00fc), top: B:106:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c6 A[PHI: r10
      0x02c6: PHI (r10v3 android.content.ContentProviderClient) = 
      (r10v1 android.content.ContentProviderClient)
      (r10v12 android.content.ContentProviderClient)
      (r10v12 android.content.ContentProviderClient)
     binds: [B:89:0x02c4, B:64:0x024f, B:73:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc A[PHI: r10
      0x02cc: PHI (r10v2 android.content.ContentProviderClient) = 
      (r10v1 android.content.ContentProviderClient)
      (r10v12 android.content.ContentProviderClient)
      (r10v12 android.content.ContentProviderClient)
     binds: [B:91:0x02ca, B:66:0x0253, B:75:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void getMonetizationNetwork(com.appsflyer.internal.AFj1zSDK r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1zSDK.getMonetizationNetwork(com.appsflyer.internal.AFj1zSDK, android.content.Context):void");
    }

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }
}
