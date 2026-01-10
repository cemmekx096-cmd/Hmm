package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzejt extends zzbs {
    final zzfcm zza;
    final zzdiv zzb;
    private final Context zzc;
    private final zzcgz zzd;
    private zzbk zze;

    public zzejt(zzcgz zzcgzVar, Context context, String str) {
        zzfcm zzfcmVar = new zzfcm();
        this.zza = zzfcmVar;
        this.zzb = new zzdiv();
        this.zzd = zzcgzVar;
        zzfcmVar.zzt(str);
        this.zzc = context;
    }

    public final zzbq zze() {
        zzdix zzdixVarZzg = this.zzb.zzg();
        ArrayList arrayListZzi = zzdixVarZzg.zzi();
        zzfcm zzfcmVar = this.zza;
        zzfcmVar.zzE(arrayListZzi);
        zzfcmVar.zzF(zzdixVarZzg.zzh());
        if (zzfcmVar.zzh() == null) {
            zzfcmVar.zzs(zzr.zzc());
        }
        return new zzeju(this.zzc, this.zzd, zzfcmVar, zzdixVarZzg, this.zze);
    }

    public final void zzf(zzbhl zzbhlVar) {
        this.zzb.zza(zzbhlVar);
    }

    public final void zzg(zzbho zzbhoVar) {
        this.zzb.zzb(zzbhoVar);
    }

    public final void zzh(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        this.zzb.zzc(str, zzbhuVar, zzbhrVar);
    }

    public final void zzi(zzbmw zzbmwVar) {
        this.zzb.zzd(zzbmwVar);
    }

    public final void zzj(zzbhy zzbhyVar, zzr zzrVar) {
        this.zzb.zze(zzbhyVar);
        this.zza.zzs(zzrVar);
    }

    public final void zzk(zzbib zzbibVar) {
        this.zzb.zzf(zzbibVar);
    }

    public final void zzl(zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    public final void zzn(zzbmn zzbmnVar) {
        this.zza.zzw(zzbmnVar);
    }

    public final void zzo(zzbgc zzbgcVar) {
        this.zza.zzD(zzbgcVar);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    public final void zzq(zzcs zzcsVar) {
        this.zza.zzV(zzcsVar);
    }
}
