package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeej implements zzedk {
    private final Context zza;
    private final zzcps zzb;
    private final Executor zzc;

    public zzeej(Context context, zzcps zzcpsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpsVar;
        this.zzc = executor;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, final zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        final View viewZza;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            zzbpx zzbpxVarZzc = ((zzfdm) zzedhVar.zzb).zzc();
            if (zzbpxVarZzc == null) {
                int i = zze.zza;
                zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbpxVarZzc.zze());
                boolean zZzf = zzbpxVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfcv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgdb.zzn(zzgdb.zzh((Object) null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeeh
                            public final ListenableFuture zza(Object obj) {
                                return zzgdb.zzh(zzcqh.zza(this.zza.zza, viewZza, zzfbtVar));
                            }
                        }, zzcad.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcv(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcv(e2);
            }
        } else {
            viewZza = ((zzfdm) zzedhVar.zzb).zza();
        }
        zzcps zzcpsVar = this.zzb;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza);
        final zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        Objects.requireNonNull(zzfdmVar);
        zzcoo zzcooVarZza = zzcpsVar.zza(zzcrlVar, new zzcou(viewZza, (zzcfe) null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeei
            public final zzed zza() {
                return zzfdmVar.zzb();
            }
        }, (zzfbu) zzfbtVar.zzu.get(0)));
        zzcooVarZza.zzh().zza(viewZza);
        zzcooVarZza.zzd().zzo(new zzcmb(zzfdmVar), this.zzc);
        ((zzeev) zzedhVar.zzc).zzc(zzcooVarZza.zzk());
        return zzcooVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        zzr zzrVar;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        zzr zzrVar2 = zzfcoVar.zze;
        if (zzrVar2.zzn) {
            zzrVar = new zzr(this.zza, zzc.zzd(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) ? new zzr(this.zza, zzc.zze(zzrVar2.zze, zzrVar2.zzb)) : zzfcu.zza(this.zza, zzfbtVar.zzu);
        }
        zzr zzrVar3 = zzrVar;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            ((zzfdm) zzedhVar.zzb).zzn(this.zza, zzrVar3, zzfcoVar.zzd, zzfbtVar.zzv.toString(), zzbs.zzm(zzfbtVar.zzs), zzedhVar.zzc);
        } else {
            ((zzfdm) zzedhVar.zzb).zzm(this.zza, zzrVar3, zzfcoVar.zzd, zzfbtVar.zzv.toString(), zzbs.zzm(zzfbtVar.zzs), zzedhVar.zzc);
        }
    }
}
