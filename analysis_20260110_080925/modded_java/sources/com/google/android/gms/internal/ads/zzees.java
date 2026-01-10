package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzees implements zzdgg {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzfbt zzb;
    final /* synthetic */ zzeet zzc;

    zzees(zzeet zzeetVar, zzcai zzcaiVar, zzfbt zzfbtVar) {
        this.zza = zzcaiVar;
        this.zzb = zzfbtVar;
        this.zzc = zzeetVar;
    }

    public final zzfbt zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwe zzcweVar) {
        try {
            zzv.zzj();
            zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zze);
        } catch (Exception unused) {
        }
    }
}
