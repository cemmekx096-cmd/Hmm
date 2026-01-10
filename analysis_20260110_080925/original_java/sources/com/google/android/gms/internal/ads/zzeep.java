package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeep implements zzedk {
    private final Context zza;
    private final zzcps zzb;
    private View zzc;
    private zzbpx zzd;

    public zzeep(Context context, zzcps zzcpsVar) {
        this.zza = context;
        this.zzb = zzcpsVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.android.gms.internal.ads.zzegx] */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, final zzfbt zzfbtVar, final zzedh zzedhVar) throws zzfcv {
        final View view;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgdb.zzn(zzgdb.zzh((Object) null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeem
                            public final ListenableFuture zza(Object obj) {
                                return zzgdb.zzh(zzcqh.zza(this.zza.zza, view, zzfbtVar));
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
            view = this.zzc;
        }
        zzcoo zzcooVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzcou(view, (zzcfe) null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeel
            /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
            public final zzed zza() throws zzfcv {
                try {
                    return ((zzbrn) zzedhVar.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfcv(e3);
                }
            }
        }, (zzfbu) zzfbtVar.zzu.get(0)));
        zzcooVarZza.zzh().zza(view);
        ((zzeev) zzedhVar.zzc).zzc(zzcooVarZza.zzj());
        return zzcooVarZza.zza();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzfcv */
    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzeeo zzeeoVar = null;
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
                String str = zzfbtVar.zzU;
                String string = zzfbtVar.zzv.toString();
                zzfco zzfcoVar = zzfcfVar.zza.zza;
                zzbrnVar.zzk(str, string, zzfcoVar.zzd, ObjectWrapper.wrap(this.zza), new zzeen(this, zzedhVar, zzeeoVar), zzedhVar.zzc, zzfcoVar.zze);
                return;
            }
            String str2 = zzfbtVar.zzU;
            String string2 = zzfbtVar.zzv.toString();
            zzfco zzfcoVar2 = zzfcfVar.zza.zza;
            zzbrnVar.zzj(str2, string2, zzfcoVar2.zzd, ObjectWrapper.wrap(this.zza), new zzeen(this, zzedhVar, zzeeoVar), zzedhVar.zzc, zzfcoVar2.zze);
        } catch (RemoteException e) {
            throw new zzfcv(e);
        }
    }
}
