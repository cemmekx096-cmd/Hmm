package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzak implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzb;

    public /* synthetic */ zzak(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferInformationDialogListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzao(this.zzb);
    }
}
