package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeix implements zzede {
    private final zzbdx zza;
    private final zzgdm zzb;
    private final zzfgs zzc;
    private final zzejg zzd;

    public zzeix(zzfgs zzfgsVar, zzgdm zzgdmVar, zzbdx zzbdxVar, zzejg zzejgVar) {
        this.zzc = zzfgsVar;
        this.zzb = zzgdmVar;
        this.zza = zzbdxVar;
        this.zzd = zzejgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzcai zzcaiVar = new zzcai();
        zzejc zzejcVar = new zzejc();
        zzejcVar.zzd(new zzeiw(this, zzcaiVar, zzfcfVar, zzfbtVar, zzejcVar));
        zzfby zzfbyVar = zzfbtVar.zzs;
        final zzbds zzbdsVar = new zzbds(zzejcVar, zzfbyVar.zzb, zzfbyVar.zza);
        zzfgm zzfgmVar = zzfgm.zzt;
        return zzfgc.zzd(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeiv
            public final void zza() {
                this.zza.zza.zze(zzbdsVar);
            }
        }, this.zzb, zzfgmVar, this.zzc).zzb(zzfgm.zzu).zzd(zzcaiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar;
        return (this.zza == null || (zzfbyVar = zzfbtVar.zzs) == null || zzfbyVar.zza == null) ? false : true;
    }
}
