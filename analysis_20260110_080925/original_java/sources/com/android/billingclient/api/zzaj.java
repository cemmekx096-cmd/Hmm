package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzaj implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

    public /* synthetic */ zzaj(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferReportingDetailsListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaf(this.zzb);
    }
}
