package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzegl extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzeiz zzc;
    private final zzdbp zzd;
    private final zzdgp zze;
    private final zzcyo zzf;
    private final ViewGroup zzg;
    private final zzdau zzh;
    private final zzegt zzi;
    private final zzedj zzj;

    public zzegl(zzcgz zzcgzVar, zzcuy zzcuyVar, zzeiz zzeizVar, zzdbp zzdbpVar, zzdgp zzdgpVar, zzcyo zzcyoVar, ViewGroup viewGroup, zzdau zzdauVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzeizVar;
        this.zzd = zzdbpVar;
        this.zze = zzdgpVar;
        this.zzf = zzcyoVar;
        this.zzg = viewGroup;
        this.zzh = zzdauVar;
        this.zzi = zzegtVar;
        this.zzj = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    protected final ListenableFuture zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zzi));
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zzj);
        }
        zzcpr zzcprVarZzd = this.zza.zzd();
        zzcprVarZzd.zzi(zzcuyVar.zzl());
        zzcprVarZzd.zzf(this.zzd);
        zzcprVarZzd.zze(this.zzc);
        zzcprVarZzd.zzd(this.zze);
        zzcprVarZzd.zzg(new zzcqn(this.zzf, this.zzh));
        zzcprVarZzd.zzc(new zzcok(this.zzg));
        zzcrz zzcrzVarZzc = zzcprVarZzd.zzk().zzc();
        return zzcrzVarZzc.zzh(zzcrzVarZzc.zzi());
    }
}
