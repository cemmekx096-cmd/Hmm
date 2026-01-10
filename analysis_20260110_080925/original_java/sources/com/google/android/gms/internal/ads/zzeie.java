package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeie implements zzedg {
    private final zzeji zza;
    private final zzdps zzb;

    zzeie(zzeji zzejiVar, zzdps zzdpsVar) {
        this.zza = zzejiVar;
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) throws zzfcv {
        zzbrn zzbrnVarZzb;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbO)).booleanValue()) {
            try {
                zzbrnVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrnVarZzb = null;
            }
        } else {
            zzbrnVarZzb = this.zza.zza(str);
        }
        if (zzbrnVarZzb == null) {
            return null;
        }
        return new zzedh(zzbrnVarZzb, new zzeev(), str);
    }
}
