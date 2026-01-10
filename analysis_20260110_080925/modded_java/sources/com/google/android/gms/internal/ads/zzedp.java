package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzedp implements zzede {
    private final zzcob zza;
    private final Context zzb;
    private final zzdpc zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzedp(zzcob zzcobVar, Context context, Executor executor, zzdpc zzdpcVar, zzfco zzfcoVar, VersionInfoParcel versionInfoParcel, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zzb = context;
        this.zza = zzcobVar;
        this.zze = executor;
        this.zzc = zzdpcVar;
        this.zzd = zzfcoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzedp zzedpVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        final zzedp zzedpVar2;
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzedpVar.zzj.zza().putLong(zzdrk.zzB.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpc zzdpcVar = zzedpVar.zzc;
        zzfco zzfcoVar = zzedpVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        zzdpgVar.zza(zzedpVar.zzb, zzcfeVarZza.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzedpVar.zzj.zza().putLong(zzdrk.zzC.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcai zzcaiVar = new zzcai();
        zzcob zzcobVar = zzedpVar.zza;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, (String) null);
        VersionInfoParcel versionInfoParcel = zzedpVar.zzf;
        boolean z = zzedpVar.zzh;
        zzbkg zzbkgVar = zzedpVar.zzg;
        final zzcny zzcnyVarZza = zzcobVar.zza(zzcrlVar, new zzdey(new zzedr(versionInfoParcel, zzcaiVar, zzfbtVar, zzcfeVarZza, zzfcoVar, z, zzbkgVar, zzedpVar.zzi, zzedpVar.zzk), zzcfeVarZza), new zzcnz(zzfbtVar.zzaa));
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzedpVar2 = zzedpVar;
            zzedpVar2.zzj.zza().putLong(zzdrk.zzD.zza(), zzv.zzD().currentTimeMillis());
        } else {
            zzedpVar2 = zzedpVar;
        }
        zzdpb zzdpbVarZzh = zzcnyVarZza.zzh();
        zzbkg zzbkgVar2 = true != z ? null : zzbkgVar;
        zzdrw zzdrwVar = zzedpVar2.zzj;
        zzdpbVarZzh.zzi(zzcfeVarZza, false, zzbkgVar2, zzdrwVar.zza());
        zzcaiVar.zzc(zzcnyVarZza);
        zzcnyVarZza.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzedn
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzcnyVarZza.zzi().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, new String[]{zzcgp.zza(zzfbtVar)});
        }
        zzcnyVarZza.zzh();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzedpVar2) { // from class: com.google.android.gms.internal.ads.zzedo
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzcny zzcnyVar = zzcnyVarZza;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzcnyVar.zza();
            }
        }, zzedpVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        ListenableFuture listenableFutureZzh = zzgdb.zzh((Object) null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzedl
            public final ListenableFuture zza(Object obj) {
                return zzedp.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzn = zzgdb.zzn(listenableFutureZzh, zzgciVar, executor);
        Objects.requireNonNull(zzdpgVar);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.lang.Runnable
            public final void run() {
                zzdpgVar.zzb();
            }
        }, executor);
        return listenableFutureZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}
