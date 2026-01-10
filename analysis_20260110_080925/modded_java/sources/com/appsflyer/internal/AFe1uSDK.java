package com.appsflyer.internal;

import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.AFe1tSDK;
import com.crashlytics.android.BuildConfig;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AFe1uSDK {
    public final AFc1qSDK AFAdRevenueData;
    private final AFe1lSDK component3;
    private final AFf1gSDK component4;
    private final AFg1qSDK getCurrencyIso4217Code;
    private final ExecutorService getMediationNetwork;
    private final AFc1pSDK getMonetizationNetwork;
    public final AFc1iSDK getRevenue;

    public AFe1uSDK(AFc1qSDK aFc1qSDK, AFc1iSDK aFc1iSDK, AFc1pSDK aFc1pSDK, ExecutorService executorService, AFg1qSDK aFg1qSDK, AFf1gSDK aFf1gSDK, AFe1lSDK aFe1lSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1iSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1pSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(executorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFg1qSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1gSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1lSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1iSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = executorService;
        this.getCurrencyIso4217Code = aFg1qSDK;
        this.component4 = aFf1gSDK;
        this.component3 = aFe1lSDK;
    }

    public final void getRevenue() {
        if (this.AFAdRevenueData.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1iSDK.getRevenue(this.getRevenue.getMonetizationNetwork)) {
            return;
        }
        getMediationNetwork((AFe1tSDK) AFe1tSDK.AFa1uSDK.INSTANCE, new Function1<com.appsflyer.internal.AFe1rSDK, Unit>() { // from class: com.appsflyer.internal.AFe1uSDK.4
            public final /* synthetic */ Object invoke(Object obj) {
                getRevenue((com.appsflyer.internal.AFe1rSDK) obj);
                return Unit.INSTANCE;
            }

            public final void getRevenue(com.appsflyer.internal.AFe1rSDK aFe1rSDK) {
                Intrinsics.checkNotNullParameter(aFe1rSDK, BuildConfig.FLAVOR);
                if (aFe1rSDK == com.appsflyer.internal.AFe1rSDK.AFAdRevenueData) {
                    AFe1uSDK.this.AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
                }
            }

            {
                super(1);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "p0", BuildConfig.FLAVOR, "getRevenue", "(Lcom/appsflyer/internal/AFe1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1uSDK$3, reason: from Kotlin metadata */
    public static final class AFe1rSDK extends Lambda implements Function1<com.appsflyer.internal.AFe1rSDK, Unit> {
        public static final AFe1rSDK getRevenue = new AFe1rSDK();

        public final void getRevenue(com.appsflyer.internal.AFe1rSDK aFe1rSDK) {
            Intrinsics.checkNotNullParameter(aFe1rSDK, BuildConfig.FLAVOR);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((com.appsflyer.internal.AFe1rSDK) obj);
            return Unit.INSTANCE;
        }

        AFe1rSDK() {
            super(1);
        }
    }

    public final void getMediationNetwork(AFe1tSDK aFe1tSDK, Function1<? super com.appsflyer.internal.AFe1rSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1tSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        AFe1sSDK aFf1zSDK = new AFf1zSDK(aFe1tSDK, this.getMediationNetwork, this.getMonetizationNetwork, this.getRevenue, this.getCurrencyIso4217Code, this.component4, function1);
        AFe1lSDK aFe1lSDK = this.component3;
        aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFf1zSDK));
    }
}
