package com.google.android.gms.internal.ads;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzehv implements zzdgg {
    private final Context zza;
    private final zzdpc zzb;
    private final zzfco zzc;
    private final VersionInfoParcel zzd;
    private final zzfbt zze;
    private final ListenableFuture zzf;
    private final zzcfe zzg;
    private final zzbkg zzh;
    private final boolean zzi;
    private final zzecd zzj;
    private final zzdrw zzk;
    private final zzdsc zzl;

    zzehv(Context context, zzdpc zzdpcVar, zzfco zzfcoVar, VersionInfoParcel versionInfoParcel, zzfbt zzfbtVar, ListenableFuture listenableFuture, zzcfe zzcfeVar, zzbkg zzbkgVar, boolean z, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdpcVar;
        this.zzc = zzfcoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfbtVar;
        this.zzf = listenableFuture;
        this.zzg = zzcfeVar;
        this.zzh = zzbkgVar;
        this.zzi = z;
        this.zzj = zzecdVar;
        this.zzk = zzdrwVar;
        this.zzl = zzdscVar;
    }

    public final zzfbt zza() {
        return this.zze;
    }

    public final void zzb(boolean z, Context context, zzcwe zzcweVar) {
        zzdoh zzdohVar = (zzdoh) zzgdb.zzq(this.zzf);
        try {
            zzfbt zzfbtVar = this.zze;
            final zzcfe zzcfeVarZza = this.zzg;
            if (zzcfeVarZza.zzaG()) {
                if (((Boolean) zzbd.zzc().zzb(zzbdc.zzaZ)).booleanValue()) {
                    zzcfeVarZza = this.zzb.zza(this.zzc.zze, (zzfbt) null, (zzfbw) null);
                    zzbkv.zzb(zzcfeVarZza, zzdohVar.zzg());
                    final zzdpg zzdpgVar = new zzdpg();
                    zzdpgVar.zza(this.zza, zzcfeVarZza.zzF());
                    zzdohVar.zzl().zzi(zzcfeVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzeht
                        public final void zza(boolean z2, int i, String str, String str2) {
                            zzdpgVar.zzb();
                            zzcfe zzcfeVar = zzcfeVarZza;
                            zzcfeVar.zzab();
                            zzcfeVar.zzN().zzs();
                        }
                    });
                    zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
                    Objects.requireNonNull(zzcfeVarZza);
                    zzcgwVarZzN.zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzehu
                        public final void zza() {
                            zzcfeVarZza.zzaa();
                        }
                    });
                    zzfby zzfbyVar = zzfbtVar.zzs;
                    zzcfeVarZza.zzae(zzfbyVar.zzb, zzfbyVar.zza, (String) null);
                }
            }
            zzcfe zzcfeVar = zzcfeVarZza;
            zzcfeVar.zzaq(true);
            boolean z2 = this.zzi;
            boolean zZze = z2 ? this.zzh.zze(false) : false;
            zzv.zzr();
            boolean zZzJ = zzs.zzJ(this.zza);
            boolean z3 = z2 && this.zzh.zzd();
            float fZza = z2 ? this.zzh.zza() : 0.0f;
            zzfbt zzfbtVar2 = this.zze;
            zzl zzlVar = new zzl(zZze, zZzJ, z3, fZza, -1, z, zzfbtVar2.zzO, zzfbtVar2.zzP);
            if (zzcweVar != null) {
                zzcweVar.zzf();
            }
            zzv.zzj();
            zzdfv zzdfvVarZzh = zzdohVar.zzh();
            int i = zzfbtVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfbtVar2.zzB;
            zzfby zzfbyVar2 = zzfbtVar2.zzs;
            String str2 = zzfbyVar2.zzb;
            String str3 = zzfbyVar2.zza;
            zzfco zzfcoVar = this.zzc;
            zzn.zza(context, new AdOverlayInfoParcel((zza) null, zzdfvVarZzh, (zzad) null, zzcfeVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfcoVar.zzf, zzcweVar, zzfbtVar2.zzb() ? this.zzj : null, zzcfeVar.zzr()), true, this.zzl);
        } catch (zzcfq e) {
            int i2 = zze.zza;
            zzo.zzh(BuildConfig.FLAVOR, e);
        }
    }
}
