package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzah implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ConsumeResponseListener zzb;
    public final /* synthetic */ ConsumeParams zzc;

    public /* synthetic */ zzah(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = billingClientImpl;
        this.zzb = consumeResponseListener;
        this.zzc = consumeParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzad(this.zzb, this.zzc);
    }
}
