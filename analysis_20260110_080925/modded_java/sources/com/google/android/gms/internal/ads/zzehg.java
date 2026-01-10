package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzehg implements zzedk {
    private final Context zza;
    private final Executor zzb;
    private final zzdol zzc;

    public zzehg(Context context, Executor executor, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdolVar;
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzdoh zzdohVarZzd = this.zzc.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdoi(new zzehf(this, zzedhVar, zzfbtVar)));
        zzdohVarZzd.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzb);
        ((zzeev) zzedhVar.zzc).zzc(zzdohVarZzd.zzn());
        return zzdohVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzo.zza == 3) {
                ((zzfdm) zzedhVar.zzb).zzr(this.zza, zzfcoVar.zzd, zzfbtVar.zzv.toString(), zzedhVar.zzc);
            } else {
                ((zzfdm) zzedhVar.zzb).zzq(this.zza, zzfcoVar.zzd, zzfbtVar.zzv.toString(), zzedhVar.zzc);
            }
        } catch (Exception e) {
            String str = zzedhVar.zza;
            int i = zze.zza;
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }
}
