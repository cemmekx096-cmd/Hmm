package com.android.billingclient.api;

import android.app.Activity;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzai implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzb;
    public final /* synthetic */ Activity zzc;
    public final /* synthetic */ ResultReceiver zzd;

    public /* synthetic */ zzai(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        this.zza = billingClientImpl;
        this.zzb = externalOfferInformationDialogListener;
        this.zzc = activity;
        this.zzd = resultReceiver;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.zza.zzC(this.zzb, this.zzc, this.zzd);
        return null;
    }
}
