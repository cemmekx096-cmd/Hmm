package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzedx implements zzedk {
    private final Context zza;
    private final zzcob zzb;

    zzedx(Context context, zzcob zzcobVar) {
        this.zza = context;
        this.zzb = zzcobVar;
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, AdFormat.APP_OPEN_AD);
        zzcny zzcnyVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(zzefeVar, (zzcfe) null), new zzcnz(zzfbtVar.zzaa));
        zzefeVar.zzc(zzcnyVarZza.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzcnyVarZza.zzj());
        return zzcnyVarZza.zza();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzbrnVar.zzi(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedv(zzedhVar, null), zzedhVar.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfcv(e);
        }
    }
}
