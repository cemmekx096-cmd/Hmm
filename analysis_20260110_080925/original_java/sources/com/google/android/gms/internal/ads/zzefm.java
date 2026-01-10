package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzefm implements zzedg {
    private final zzdps zza;

    public zzefm(zzdps zzdpsVar) {
        this.zza = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) throws zzfcv {
        return new zzedh(this.zza.zzc(str, jSONObject), new zzeev(), str);
    }
}
