package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzegd {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcqy zzc;
    private final zzegt zzd;
    private final zzfjm zze;
    private final zzgdv zzf = zzgdv.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzege zzh;
    private zzfcf zzi;

    zzegd(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcqy zzcqyVar, zzegt zzegtVar, zzfjm zzfjmVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcqyVar;
        this.zzd = zzegtVar;
        this.zze = zzfjmVar;
    }

    private final synchronized ListenableFuture zzd(zzfbt zzfbtVar) {
        Iterator it = zzfbtVar.zza.iterator();
        while (it.hasNext()) {
            zzede zzedeVarZza = this.zzc.zza(zzfbtVar.zzb, (String) it.next());
            if (zzedeVarZza != null && zzedeVarZza.zzb(this.zzi, zzfbtVar)) {
                return zzgdb.zzo(zzedeVarZza.zza(this.zzi, zzfbtVar), zzfbtVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgdb.zzg(new zzdwe(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfbt zzfbtVar) {
        ListenableFuture listenableFutureZzd = zzd(zzfbtVar);
        this.zzd.zzf(this.zzi, zzfbtVar, listenableFutureZzd, this.zze);
        zzgdb.zzr(listenableFutureZzd, new zzegc(this, zzfbtVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfcf zzfcfVar) {
        if (!this.zzg.getAndSet(true)) {
            List list = zzfcfVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzd(new zzegx(3, zzeha.zzc(zzfcfVar)));
            } else {
                this.zzi = zzfcfVar;
                zzegt zzegtVar = this.zzd;
                this.zzh = new zzege(zzfcfVar, zzegtVar, this.zzf);
                zzegtVar.zzk(list);
                zzfbt zzfbtVarZza = this.zzh.zza();
                while (zzfbtVarZza != null) {
                    zze(zzfbtVarZza);
                    zzfbtVarZza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
