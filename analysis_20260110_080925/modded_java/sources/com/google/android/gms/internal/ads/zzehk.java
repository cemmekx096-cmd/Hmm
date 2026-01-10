package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzehk implements zzedk {
    private final Context zza;
    private final zzdol zzb;

    public zzehk(Context context, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = zzdolVar;
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, AdFormat.REWARDED);
        zzdoh zzdohVarZzd = this.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdoi(zzefeVar));
        zzefeVar.zzc(zzdohVarZzd.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzdohVarZzd.zzo());
        return zzdohVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzo.zza == 3) {
                zzbrnVar.zzo(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcoVar.zzd, ObjectWrapper.wrap(this.zza), new zzehi(this, zzedhVar, null), zzedhVar.zzc);
            } else {
                zzbrnVar.zzp(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcoVar.zzd, ObjectWrapper.wrap(this.zza), new zzehi(this, zzedhVar, null), zzedhVar.zzc);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
