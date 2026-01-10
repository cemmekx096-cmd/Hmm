package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzefv implements zzedk {
    private final Context zza;
    private final zzdgu zzb;
    private final Executor zzc;

    public zzefv(Context context, zzdgu zzdguVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdguVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcf zzfcfVar, int i) {
        return zzfcfVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzdwe */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzdwe, zzfcv {
        zzdim zzdimVarZzah;
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzbpz zzbpzVarZzD = zzfdmVar.zzD();
        zzbqa zzbqaVarZzE = zzfdmVar.zzE();
        zzbqd zzbqdVarZzd = zzfdmVar.zzd();
        if (zzbqdVarZzd != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzt(zzbqdVarZzd);
        } else if (zzbpzVarZzD != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzai(zzbpzVarZzD);
        } else if (zzbpzVarZzD != null && zzc(zzfcfVar, 2)) {
            zzdimVarZzah = zzdim.zzag(zzbpzVarZzD);
        } else if (zzbqaVarZzE != null && zzc(zzfcfVar, 6)) {
            zzdimVarZzah = zzdim.zzaj(zzbqaVarZzE);
        } else {
            if (zzbqaVarZzE == null || !zzc(zzfcfVar, 1)) {
                throw new zzegx(1, "No native ad mappers");
            }
            zzdimVarZzah = zzdim.zzah(zzbqaVarZzE);
        }
        if (zzdimVarZzah != null) {
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzg.contains(Integer.toString(zzdimVarZzah.zzc()))) {
                zzdio zzdioVarZze = this.zzb.zze(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdiy(zzdimVarZzah), new zzdkr(zzbqaVarZzE, zzbpzVarZzD, zzbqdVarZzd));
                ((zzeev) zzedhVar.zzc).zzc(zzdioVarZze.zzk());
                zzdioVarZze.zzd().zzo(new zzcmb(zzfdmVar), this.zzc);
                return zzdioVarZze.zza();
            }
        }
        throw new zzegx(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        String string = zzfbtVar.zzv.toString();
        String strZzm = zzbs.zzm(zzfbtVar.zzs);
        zzfdmVar.zzp(this.zza, zzfcoVar.zzd, string, strZzm, zzedhVar.zzc, zzfcoVar.zzi, zzfcoVar.zzg);
    }
}
