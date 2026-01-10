package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzem extends zzbc {
    final /* synthetic */ zzen zza;

    zzem(zzen zzenVar) {
        this.zza = zzenVar;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzen zzenVar = this.zza;
        zzenVar.zze.zzb(zzenVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        zzen zzenVar = this.zza;
        zzenVar.zze.zzb(zzenVar.zzi());
        super.onAdLoaded();
    }
}
