package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzegc implements zzgcx {
    final /* synthetic */ zzfbt zza;
    final /* synthetic */ zzegd zzb;

    zzegc(zzegd zzegdVar, zzfbt zzfbtVar) {
        this.zza = zzfbtVar;
        this.zzb = zzegdVar;
    }

    public final void zza(Throwable th) {
        zzegd zzegdVar = this.zzb;
        synchronized (zzegdVar) {
            zzege zzegeVar = zzegdVar.zzh;
            zzfbt zzfbtVar = this.zza;
            zzegeVar.zzb(th, zzfbtVar);
            zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
            if (zzfbtVar.zzav) {
                while (zzfbtVarZza != null) {
                    zzegdVar.zze(zzfbtVarZza);
                    zzfbtVarZza = zzegdVar.zzh.zza();
                }
            } else if (zzfbtVarZza != null) {
                zzegdVar.zze(zzfbtVarZza);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegd zzegdVar = this.zzb;
        zzegu zzeguVar = (zzegu) obj;
        synchronized (zzegdVar) {
            zzegdVar.zzh.zzc(zzeguVar, this.zza);
            zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
            if (zzfbtVarZza != null) {
                zzegdVar.zze(zzfbtVarZza);
            }
        }
    }
}
