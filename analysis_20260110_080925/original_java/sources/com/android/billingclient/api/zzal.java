package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzal implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ PurchaseHistoryResponseListener zzb;

    public /* synthetic */ zzal(BillingClientImpl billingClientImpl, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = purchaseHistoryResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzak(this.zzb);
    }
}
