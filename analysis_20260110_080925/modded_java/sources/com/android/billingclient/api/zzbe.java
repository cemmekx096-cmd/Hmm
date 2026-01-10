package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zze;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzbe extends com.google.android.gms.internal.play_billing.zzad {
    final BillingConfigResponseListener zza;
    final zzch zzb;
    final int zzc;

    /* synthetic */ zzbe(BillingConfigResponseListener billingConfigResponseListener, zzch zzchVar, int i, zzbl zzblVar) {
        this.zza = billingConfigResponseListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zzb(zzcg.zzb(63, 13, zzcj.zzk), this.zzc);
            this.zza.onBillingConfigResponse(zzcj.zzk, (BillingConfig) null);
            return;
        }
        int iZzb = zze.zzb(bundle, "BillingClient");
        String strZzh = zze.zzh(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzh);
        if (iZzb != 0) {
            zze.zzl("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            this.zzb.zzb(zzcg.zzb(23, 13, billingResultBuild), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild, (BillingConfig) null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            zze.zzl("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            this.zzb.zzb(zzcg.zzb(64, 13, billingResultBuild2), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild2, (BillingConfig) null);
            return;
        }
        try {
            this.zza.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e) {
            zze.zzm("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            this.zzb.zzb(zzcg.zzb(65, 13, zzcj.zzk), this.zzc);
            this.zza.onBillingConfigResponse(zzcj.zzk, (BillingConfig) null);
        }
    }
}
