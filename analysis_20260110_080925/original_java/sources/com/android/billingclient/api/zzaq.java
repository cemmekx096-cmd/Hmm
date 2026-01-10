package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzaq implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferAvailabilityListener zzb;

    public /* synthetic */ zzaq(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferAvailabilityListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzai(this.zzb);
    }
}
