package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzac implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ PurchasesResponseListener zzb;

    public /* synthetic */ zzac(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = purchasesResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzal(this.zzb);
    }
}
