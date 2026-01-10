package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeos implements zzetu {
    private final zzgdm zza;
    private final zzdpx zzb;
    private final String zzc;
    private final zzfco zzd;

    public zzeos(zzgdm zzgdmVar, zzdpx zzdpxVar, zzfco zzfcoVar, String str) {
        this.zza = zzgdmVar;
        this.zzb = zzdpxVar;
        this.zzd = zzfcoVar;
        this.zzc = str;
    }

    public static /* synthetic */ zzeot zzc(zzeos zzeosVar) {
        zzfco zzfcoVar = zzeosVar.zzd;
        zzdpx zzdpxVar = zzeosVar.zzb;
        return new zzeot(zzdpxVar.zzb(zzfcoVar.zzf, zzeosVar.zzc), zzdpxVar.zza());
    }

    public final int zza() {
        return 17;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeos.zzc(this.zza);
            }
        });
    }
}
