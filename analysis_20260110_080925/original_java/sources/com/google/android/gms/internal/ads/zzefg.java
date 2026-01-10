package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzefg implements zzedk {
    private final Context zza;
    private final zzdfy zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefg(Context context, VersionInfoParcel versionInfoParcel, zzdfy zzdfyVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdfyVar;
        this.zzd = executor;
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzdev zzdevVarZzd = this.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(new zzeff(this, zzedhVar, zzfbtVar), (zzcfe) null));
        zzdevVarZzd.zzd().zzo(new zzcmb((zzfdm) zzedhVar.zzb), this.zzd);
        ((zzeev) zzedhVar.zzc).zzc(zzdevVarZzd.zzk());
        return zzdevVarZzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        String strZzm = zzbs.zzm(zzfbtVar.zzs);
        zzfdmVar.zzo(this.zza, zzfcoVar.zzd, string, strZzm, zzedhVar.zzc);
    }
}
