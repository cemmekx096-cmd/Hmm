package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zze;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzbh extends com.google.android.gms.internal.play_billing.zzaj {
    final ExternalOfferAvailabilityListener zza;
    final zzch zzb;
    final int zzc;

    /* synthetic */ zzbh(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzch zzchVar, int i, zzbl zzblVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zzb(zzcg.zzb(92, 23, zzcj.zzk), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(zzcj.zzk);
            return;
        }
        int iZzb = zze.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzcj.zza(iZzb, zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            zze.zzl("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcg.zzb(23, 23, billingResultZza), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }
}
