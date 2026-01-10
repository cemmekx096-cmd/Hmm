package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzeia implements zzdgg {
    final /* synthetic */ zzedh zza;
    final /* synthetic */ zzfbt zzb;

    zzeia(zzeic zzeicVar, zzedh zzedhVar, zzfbt zzfbtVar) {
        this.zza = zzedhVar;
        this.zzb = zzfbtVar;
    }

    public final zzfbt zza() {
        return this.zzb;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzdgf */
    public final void zzb(boolean z, Context context, zzcwe zzcweVar) throws zzdgf {
        try {
            zzfdm zzfdmVar = (zzfdm) this.zza.zzb;
            zzfdmVar.zzv(z);
            zzfdmVar.zzA();
        } catch (zzfcv e) {
            int i = zze.zza;
            zzo.zzk("Cannot show rewarded video.", e);
            throw new zzdgf(e.getCause());
        }
    }
}
