package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzab implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ SkuDetailsResponseListener zzb;

    public /* synthetic */ zzab(BillingClientImpl billingClientImpl, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = skuDetailsResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzam(this.zzb);
    }
}
