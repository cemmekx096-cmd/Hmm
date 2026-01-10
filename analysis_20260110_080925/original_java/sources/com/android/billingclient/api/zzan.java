package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzan implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ProductDetailsResponseListener zzb;

    public /* synthetic */ zzan(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = productDetailsResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaj(this.zzb);
    }
}
