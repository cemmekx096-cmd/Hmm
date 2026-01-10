package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzat implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzat(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcv zzcvVarZzar = BillingClientImpl.zzar(this.zzc, this.zza, 9);
        if (zzcvVarZzar.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzcvVarZzar.zza(), zzcvVarZzar.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzcvVarZzar.zza(), zzco.zzl());
        return null;
    }
}
