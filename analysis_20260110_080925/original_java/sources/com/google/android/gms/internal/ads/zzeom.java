package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeom implements zzetu {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(false);
    private final Clock zzc;
    private final Executor zzd;
    private final zzetu zze;
    private final long zzf;
    private final zzdsc zzg;

    public zzeom(zzetu zzetuVar, long j, Clock clock, Executor executor, zzdsc zzdscVar) {
        this.zzc = clock;
        this.zze = zzetuVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdscVar;
    }

    public final int zza() {
        return this.zze.zza();
    }

    public final ListenableFuture zzb() {
        zzeol zzeolVar;
        zzeol zzeolVar2;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlZ)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlY)).booleanValue() && !((Boolean) this.zzb.getAndSet(true)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcad.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeom zzeomVar = this.zza;
                        zzeomVar.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeok
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeom zzeomVar2 = zzeomVar;
                                zzeomVar2.zza.set(new zzeol(zzeomVar2.zze.zzb(), zzeomVar2.zzf, zzeomVar2.zzc));
                            }
                        });
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                AtomicReference atomicReference = this.zza;
                zzeolVar = (zzeol) atomicReference.get();
                if (zzeolVar == null) {
                    zzeol zzeolVar3 = new zzeol(this.zze.zzb(), this.zzf, this.zzc);
                    atomicReference.set(zzeolVar3);
                    return zzeolVar3.zza;
                }
                if (!((Boolean) this.zzb.get()).booleanValue() && zzeolVar.zza()) {
                    ListenableFuture listenableFuture = zzeolVar.zza;
                    zzetu zzetuVar = this.zze;
                    zzeolVar2 = new zzeol(zzetuVar.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeolVar2);
                    if (((Boolean) zzbd.zzc().zzb(zzbdc.zzma)).booleanValue()) {
                        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzmb)).booleanValue()) {
                            zzdsb zzdsbVarZza = this.zzg.zza();
                            zzdsbVarZza.zzb("action", "scs");
                            zzdsbVarZza.zzb("sid", String.valueOf(zzetuVar.zza()));
                            zzdsbVarZza.zzj();
                        }
                        return listenableFuture;
                    }
                    zzeolVar = zzeolVar2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeolVar = (zzeol) atomicReference2.get();
            if (zzeolVar == null || zzeolVar.zza()) {
                zzetu zzetuVar2 = this.zze;
                zzeolVar2 = new zzeol(zzetuVar2.zzb(), this.zzf, this.zzc);
                atomicReference2.set(zzeolVar2);
                zzeolVar = zzeolVar2;
            }
        }
        return zzeolVar.zza;
    }
}
