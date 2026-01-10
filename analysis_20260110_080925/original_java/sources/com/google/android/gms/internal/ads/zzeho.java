package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeho implements zzedg {
    private final Map zza = new HashMap();
    private final zzdps zzb;

    public zzeho(zzdps zzdpsVar) {
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) throws zzfcv {
        zzedh zzedhVar;
        synchronized (this) {
            Map map = this.zza;
            zzedhVar = (zzedh) map.get(str);
            if (zzedhVar == null) {
                zzedhVar = new zzedh(this.zzb.zzc(str, jSONObject), new zzeew(), str);
                map.put(str, zzedhVar);
            }
        }
        return zzedhVar;
    }
}
