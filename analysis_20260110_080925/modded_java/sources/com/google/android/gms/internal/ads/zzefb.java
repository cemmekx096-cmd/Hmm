package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzefb implements zzdgg {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfbt zzd;
    private final zzcfe zze;
    private final zzfco zzf;
    private final zzbkg zzg;
    private final boolean zzh;
    private final zzecd zzi;
    private final zzdsc zzj;

    zzefb(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfbt zzfbtVar, zzcfe zzcfeVar, zzfco zzfcoVar, boolean z, zzbkg zzbkgVar, zzecd zzecdVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfbtVar;
        this.zze = zzcfeVar;
        this.zzf = zzfcoVar;
        this.zzg = zzbkgVar;
        this.zzh = z;
        this.zzi = zzecdVar;
        this.zzj = zzdscVar;
    }

    public final zzfbt zza() {
        return this.zzd;
    }

    public final void zzb(boolean z, Context context, zzcwe zzcweVar) {
        zzdev zzdevVar = (zzdev) zzgdb.zzq(this.zzc);
        zzcfe zzcfeVar = this.zze;
        zzcfeVar.zzaq(true);
        boolean z2 = this.zzh;
        boolean zZze = z2 ? this.zzg.zze(false) : false;
        zzv.zzr();
        boolean zZzJ = zzs.zzJ(this.zza);
        boolean z3 = z2 && this.zzg.zzd();
        float fZza = z2 ? this.zzg.zza() : 0.0f;
        zzfbt zzfbtVar = this.zzd;
        zzl zzlVar = new zzl(zZze, zZzJ, z3, fZza, -1, z, zzfbtVar.zzO, false);
        if (zzcweVar != null) {
            zzcweVar.zzf();
        }
        zzv.zzj();
        zzdfv zzdfvVarZzh = zzdevVar.zzh();
        int i = zzfbtVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfbtVar.zzB;
        zzfby zzfbyVar = zzfbtVar.zzs;
        String str2 = zzfbyVar.zzb;
        String str3 = zzfbyVar.zza;
        zzfco zzfcoVar = this.zzf;
        zzn.zza(context, new AdOverlayInfoParcel((zza) null, zzdfvVarZzh, (zzad) null, zzcfeVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfcoVar.zzf, zzcweVar, zzfbtVar.zzb() ? this.zzi : null, zzcfeVar.zzr()), true, this.zzj);
    }
}
