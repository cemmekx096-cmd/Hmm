package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzedt implements zzedk {
    private final Context zza;
    private final zzcob zzb;
    private final Executor zzc;

    zzedt(Context context, zzcob zzcobVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcobVar;
        this.zzc = executor;
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzcny zzcnyVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(new zzeds(this, zzedhVar, zzfbtVar), (zzcfe) null), new zzcnz(zzfbtVar.zzaa));
        zzcnyVarZza.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzc);
        ((zzeev) zzedhVar.zzc).zzc(zzcnyVarZza.zzk());
        return zzcnyVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        zzfdmVar.zzl(this.zza, zzfcoVar.zzd, string, zzedhVar.zzc);
    }
}
