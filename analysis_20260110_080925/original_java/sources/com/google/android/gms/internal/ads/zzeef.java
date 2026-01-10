package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeef implements zzede {
    private final zzcps zza;
    private final Context zzb;
    private final zzdpc zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final zzfut zzf;
    private final zzdrw zzg;

    public zzeef(zzcps zzcpsVar, Context context, Executor executor, zzdpc zzdpcVar, zzfco zzfcoVar, zzfut zzfutVar, zzdrw zzdrwVar) {
        this.zzb = context;
        this.zza = zzcpsVar;
        this.zze = executor;
        this.zzc = zzdpcVar;
        this.zzd = zzfcoVar;
        this.zzf = zzfutVar;
        this.zzg = zzdrwVar;
    }

    public static /* synthetic */ ListenableFuture zzc(final zzeef zzeefVar, zzfcf zzfcfVar, zzfbt zzfbtVar, Object obj) {
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzeefVar.zzg.zza().putLong(zzdrk.zzB.zza(), zzv.zzD().currentTimeMillis());
        }
        Context context = zzeefVar.zzb;
        zzr zzrVarZza = zzfcu.zza(context, zzfbtVar.zzu);
        final zzcfe zzcfeVarZza = zzeefVar.zzc.zza(zzrVarZza, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        zzcqh zzcqhVarZza = (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) ? zzcqh.zza(context, zzcfeVarZza.zzF(), zzfbtVar) : new zzdpf(context, zzcfeVarZza.zzF(), (zzau) zzeefVar.zzf.apply(zzfbtVar));
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzeefVar.zzg.zza().putLong(zzdrk.zzC.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcps zzcpsVar = zzeefVar.zza;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, (String) null);
        Objects.requireNonNull(zzcfeVarZza);
        final zzcoo zzcooVarZza = zzcpsVar.zza(zzcrlVar, new zzcou(zzcqhVarZza, zzcfeVarZza, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzedz
            public final zzed zza() {
                return zzcfeVarZza.zzq();
            }
        }, zzfcu.zzb(zzrVarZza)));
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzeefVar.zzg.zza().putLong(zzdrk.zzD.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpb zzdpbVarZzi = zzcooVarZza.zzi();
        zzdrw zzdrwVar = zzeefVar.zzg;
        zzdpbVarZzi.zzi(zzcfeVarZza, false, (zzbkg) null, zzdrwVar.zza());
        zzcwj zzcwjVarZzc = zzcooVarZza.zzc();
        zzcwl zzcwlVar = new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeea
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        };
        zzgdm zzgdmVar = zzcad.zzg;
        zzcwjVarZzc.zzo(zzcwlVar, zzgdmVar);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzcooVarZza.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, new String[]{zzcgp.zza(zzfbtVar)});
        }
        zzcooVarZza.zzi();
        ListenableFuture listenableFutureZzj = zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza());
        if (zzfbtVar.zzM) {
            Objects.requireNonNull(zzcfeVarZza);
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfeVarZza.zzah();
                }
            }, zzeefVar.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.lang.Runnable
            public final void run() {
                zzeef.zzd(this.zza, zzcfeVarZza);
            }
        }, zzeefVar.zze);
        return zzgdb.zzm(listenableFutureZzj, new zzfut() { // from class: com.google.android.gms.internal.ads.zzeed
            public final Object apply(Object obj2) {
                return zzcooVarZza.zza();
            }
        }, zzgdmVar);
    }

    public static /* synthetic */ void zzd(zzeef zzeefVar, zzcfe zzcfeVar) {
        zzcfeVar.zzab();
        zzfco zzfcoVar = zzeefVar.zzd;
        zzcgg zzcggVarZzq = zzcfeVar.zzq();
        zzgc zzgcVar = zzfcoVar.zza;
        if (zzgcVar != null && zzcggVarZzq != null) {
            zzcggVarZzq.zzs(zzgcVar);
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzbt)).booleanValue() || zzcfeVar.isAttachedToWindow()) {
            return;
        }
        zzcfeVar.onPause();
        zzcfeVar.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        return zzgdb.zzn(zzgdb.zzh((Object) null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeee
            public final ListenableFuture zza(Object obj) {
                return zzeef.zzc(this.zza, zzfcfVar, zzfbtVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}
