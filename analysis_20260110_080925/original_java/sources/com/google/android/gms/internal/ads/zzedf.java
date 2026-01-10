package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzedf implements zzede {
    public final zzede zza;
    private final zzfut zzb;

    public zzedf(zzede zzedeVar, zzfut zzfutVar) {
        this.zza = zzedeVar;
        this.zzb = zzfutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        return zzgdb.zzm(this.zza.zza(zzfcfVar, zzfbtVar), this.zzb, zzcad.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        return this.zza.zzb(zzfcfVar, zzfbtVar);
    }
}
