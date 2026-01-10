package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzam implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ QueryProductDetailsParams zzb;
    public final /* synthetic */ ProductDetailsResponseListener zzc;

    public /* synthetic */ zzam(BillingClientImpl billingClientImpl, QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = queryProductDetailsParams;
        this.zzc = productDetailsResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzbj zzbjVarZzh = this.zza.zzh(this.zzb);
        this.zzc.onProductDetailsResponse(zzcj.zza(zzbjVarZzh.zza(), zzbjVarZzh.zzb()), zzbjVarZzh.zzc());
        return null;
    }
}
