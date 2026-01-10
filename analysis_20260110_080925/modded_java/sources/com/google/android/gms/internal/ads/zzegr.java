package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzegr implements zzgcx {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfbw zzb;
    final /* synthetic */ zzfbt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjm zze;
    final /* synthetic */ zzfcf zzf;
    final /* synthetic */ zzegt zzg;

    zzegr(zzegt zzegtVar, long j, zzfbw zzfbwVar, zzfbt zzfbtVar, String str, zzfjm zzfjmVar, zzfcf zzfcfVar) {
        this.zza = j;
        this.zzb = zzfbwVar;
        this.zzc = zzfbtVar;
        this.zzd = str;
        this.zze = zzfjmVar;
        this.zzf = zzfcfVar;
        this.zzg = zzegtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r6
      0x001a: PHI (r6v9 int) = (r6v0 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v10 int) binds: [B:17:0x0031, B:22:0x004c, B:24:0x0050, B:26:0x0059, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegr.zza(java.lang.Throwable):void");
    }

    public final void zzb(Object obj) {
        zzegt zzegtVar = this.zzg;
        long jElapsedRealtime = zzegtVar.zza.elapsedRealtime() - this.zza;
        synchronized (zzegtVar) {
            if (zzegtVar.zze) {
                zzegtVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            if (zzegtVar.zzg) {
                return;
            }
            zzfbt zzfbtVar = this.zzc;
            if (zzegtVar.zzq(zzfbtVar)) {
                ((zzegs) zzegtVar.zzd.get(zzfbtVar)).zzd = jElapsedRealtime;
            } else {
                zzegtVar.zzd.put(zzfbtVar, new zzegs(this.zzd, zzfbtVar.zzaf, 0, jElapsedRealtime, null));
            }
            zzegtVar.zzf.zzg(zzfbtVar, jElapsedRealtime, null);
        }
    }
}
