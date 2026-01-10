package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzz;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzbc extends zzz {
    final ExternalOfferReportingDetailsListener zza;
    final zzch zzb;
    final int zzc;

    /* synthetic */ zzbc(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzch zzchVar, int i, zzbl zzblVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zzb(zzcg.zzb(95, 24, zzcj.zzk), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(zzcj.zzk, (ExternalOfferReportingDetails) null);
            return;
        }
        int iZzb = zze.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzcj.zza(iZzb, zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            zze.zzl("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcg.zzb(23, 24, billingResultZza), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, (ExternalOfferReportingDetails) null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            zze.zzm("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            this.zzb.zzb(zzcg.zzb(104, 24, zzcj.zzk), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(zzcj.zzk, (ExternalOfferReportingDetails) null);
        }
    }
}
