package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzegp extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzdbp zzc;
    private final zzegt zzd;

    @Nullable
    private final zzfcg zze;
    private final zzedj zzf;

    public zzegp(zzcgz zzcgzVar, zzcuy zzcuyVar, zzdbp zzdbpVar, @Nullable zzfcg zzfcgVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzdbpVar;
        this.zze = zzfcgVar;
        this.zzd = zzegtVar;
        this.zzf = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    protected final ListenableFuture zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzfcg zzfcgVar;
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zzd));
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdO)).booleanValue() && (zzfcgVar = this.zze) != null) {
            zzcuyVar.zzj(zzfcgVar);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zzf);
        }
        zzdok zzdokVarZzh = this.zza.zzh();
        zzdokVarZzh.zzd(zzcuyVar.zzl());
        zzdokVarZzh.zzc(this.zzc);
        zzcrz zzcrzVarZzb = zzdokVarZzh.zze().zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }
}
