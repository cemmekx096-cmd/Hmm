package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzefz implements zzedk {
    private final Context zza;
    private final zzdgu zzb;
    private zzbqd zzc;
    private final VersionInfoParcel zzd;

    public zzefz(Context context, zzdgu zzdguVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdguVar;
        this.zzd = versionInfoParcel;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzdwe */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzdwe, zzfcv {
        ArrayList arrayList = zzfcfVar.zza.zza.zzg;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzegx(2, "Unified must be used for RTB.");
        }
        zzdim zzdimVarZzt = zzdim.zzt(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdimVarZzt.zzc()))) {
            throw new zzegx(1, "No corresponding native ad listener");
        }
        zzdio zzdioVarZze = this.zzb.zze(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdiy(zzdimVarZzt), new zzdkr((zzbqa) null, (zzbpz) null, this.zzc));
        ((zzeev) zzedhVar.zzc).zzc(zzdioVarZze.zzj());
        return zzdioVarZze.zza();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzefy zzefyVar = null;
            if (this.zzd.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbdc.zzbR)).intValue()) {
                zzbrnVar.zzm(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefx(this, zzedhVar, zzefyVar), zzedhVar.zzc);
                return;
            }
            String str = zzfbtVar.zzU;
            String string = zzfbtVar.zzv.toString();
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            zzbrnVar.zzn(str, string, zzfcoVar.zzd, ObjectWrapper.wrap(this.zza), new zzefx(this, zzedhVar, zzefyVar), zzedhVar.zzc, zzfcoVar.zzi);
        } catch (RemoteException e) {
            throw new zzfcv(e);
        }
    }
}
