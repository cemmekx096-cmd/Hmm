package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzag implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ConsumeParams zzb;
    public final /* synthetic */ ConsumeResponseListener zzc;

    public /* synthetic */ zzag(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = consumeParams;
        this.zzc = consumeResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.zza.zzt(this.zzb, this.zzc);
        return null;
    }
}
