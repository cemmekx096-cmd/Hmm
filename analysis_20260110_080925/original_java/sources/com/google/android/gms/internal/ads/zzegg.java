package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzegg extends zzegi {
    private final zzcgz zza;
    private final zzdgp zzb;
    private final zzcuy zzc;
    private final zzdbp zzd;
    private final zzegt zze;
    private final zzedj zzf;

    public zzegg(zzcgz zzcgzVar, zzdgp zzdgpVar, zzcuy zzcuyVar, zzdbp zzdbpVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzdgpVar;
        this.zzc = zzcuyVar;
        this.zzd = zzdbpVar;
        this.zze = zzegtVar;
        this.zzf = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    protected final ListenableFuture zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzcuy zzcuyVar = this.zzc;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zze));
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zzf);
        }
        zzdgt zzdgtVarZzg = this.zza.zzg();
        zzdgtVarZzg.zzf(zzcuyVar.zzl());
        zzdgtVarZzg.zze(this.zzd);
        zzdgtVarZzg.zzd(this.zzb);
        zzdgtVarZzg.zzc(new zzcok((ViewGroup) null));
        zzcrz zzcrzVarZza = zzdgtVarZzg.zzg().zza();
        return zzcrzVarZza.zzh(zzcrzVarZza.zzi());
    }
}
