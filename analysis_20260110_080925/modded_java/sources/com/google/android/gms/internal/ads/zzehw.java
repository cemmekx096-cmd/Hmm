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
public final class zzehw implements zzede {
    private final Context zza;
    private final zzdpc zzb;
    private final zzdol zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzehw(Context context, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar, Executor executor, zzdol zzdolVar, zzdpc zzdpcVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzd = zzfcoVar;
        this.zzc = zzdolVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpcVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static /* synthetic */ ListenableFuture zzc(final zzehw zzehwVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzehwVar.zzj.zza().putLong(zzdrk.zzB.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpc zzdpcVar = zzehwVar.zzb;
        zzfco zzfcoVar = zzehwVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        Context context = zzehwVar.zza;
        zzdpgVar.zza(context, zzcfeVarZza.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzehwVar.zzj.zza().putLong(zzdrk.zzC.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcai zzcaiVar = new zzcai();
        zzdol zzdolVar = zzehwVar.zzc;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, (String) null);
        VersionInfoParcel versionInfoParcel = zzehwVar.zzf;
        zzbkg zzbkgVar = zzehwVar.zzg;
        boolean z = zzehwVar.zzh;
        zzecd zzecdVar = zzehwVar.zzi;
        zzdrw zzdrwVar = zzehwVar.zzj;
        final zzdoh zzdohVarZzd = zzdolVar.zzd(zzcrlVar, new zzdoi(new zzehv(context, zzdpcVar, zzfcoVar, versionInfoParcel, zzfbtVar, zzcaiVar, zzcfeVarZza, zzbkgVar, z, zzecdVar, zzdrwVar, zzehwVar.zzk), zzcfeVarZza));
        zzcaiVar.zzc(zzdohVarZzd);
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzdrwVar.zza().putLong(zzdrk.zzD.zza(), zzv.zzD().currentTimeMillis());
        }
        zzbkv.zzb(zzcfeVarZza, zzdohVarZzd.zzg());
        zzdohVarZzd.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzehp
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzdohVarZzd.zzl().zzi(zzcfeVarZza, true, true != z ? null : zzbkgVar, zzdrwVar.zza());
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzdohVarZzd.zzm().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, new String[]{zzcgp.zza(zzfbtVar)});
        }
        zzdohVarZzd.zzl();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzehwVar) { // from class: com.google.android.gms.internal.ads.zzehq
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzdoh zzdohVar = zzdohVarZzd;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzdohVar.zzi();
            }
        }, zzehwVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        ListenableFuture listenableFutureZzh = zzgdb.zzh((Object) null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzehr
            public final ListenableFuture zza(Object obj) {
                return zzehw.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzn = zzgdb.zzn(listenableFutureZzh, zzgciVar, executor);
        Objects.requireNonNull(zzdpgVar);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehs
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
