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
public final class zzefc implements zzede {
    private final Context zza;
    private final zzdpc zzb;
    private final zzdfy zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzefc(Context context, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar, Executor executor, zzdfy zzdfyVar, zzdpc zzdpcVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzd = zzfcoVar;
        this.zzc = zzdfyVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpcVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzefc zzefcVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        final zzefc zzefcVar2;
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzefcVar.zzj.zza().putLong(zzdrk.zzB.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpc zzdpcVar = zzefcVar.zzb;
        zzfco zzfcoVar = zzefcVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        Context context = zzefcVar.zza;
        zzdpgVar.zza(context, zzcfeVarZza.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzefcVar.zzj.zza().putLong(zzdrk.zzC.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcai zzcaiVar = new zzcai();
        zzdfy zzdfyVar = zzefcVar.zzc;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, (String) null);
        VersionInfoParcel versionInfoParcel = zzefcVar.zzf;
        boolean z = zzefcVar.zzh;
        zzbkg zzbkgVar = zzefcVar.zzg;
        final zzdev zzdevVarZzd = zzdfyVar.zzd(zzcrlVar, new zzdey(new zzefb(context, versionInfoParcel, zzcaiVar, zzfbtVar, zzcfeVarZza, zzfcoVar, z, zzbkgVar, zzefcVar.zzi, zzefcVar.zzk), zzcfeVarZza));
        zzcaiVar.zzc(zzdevVarZzd);
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzefcVar2 = zzefcVar;
            zzefcVar2.zzj.zza().putLong(zzdrk.zzD.zza(), zzv.zzD().currentTimeMillis());
        } else {
            zzefcVar2 = zzefcVar;
        }
        zzdevVarZzd.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeez
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzdevVarZzd.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, new String[]{zzcgp.zza(zzfbtVar)});
        }
        zzdpb zzdpbVarZzi = zzdevVarZzd.zzi();
        zzbkg zzbkgVar2 = true != z ? null : zzbkgVar;
        zzdrw zzdrwVar = zzefcVar2.zzj;
        zzdpbVarZzi.zzi(zzcfeVarZza, true, zzbkgVar2, zzdrwVar.zza());
        zzdevVarZzd.zzi();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzefcVar2) { // from class: com.google.android.gms.internal.ads.zzefa
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzdev zzdevVar = zzdevVarZzd;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzdevVar.zzg();
            }
        }, zzefcVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        ListenableFuture listenableFutureZzh = zzgdb.zzh((Object) null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzeex
            public final ListenableFuture zza(Object obj) {
                return zzefc.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzn = zzgdb.zzn(listenableFutureZzh, zzgciVar, executor);
        Objects.requireNonNull(zzdpgVar);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeey
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
