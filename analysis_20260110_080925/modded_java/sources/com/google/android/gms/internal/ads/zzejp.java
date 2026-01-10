package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzejp extends zzbrp {
    private final String zza;
    private final zzbrn zzb;
    private final zzcai zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejp(String str, zzbrn zzbrnVar, zzcai zzcaiVar, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcaiVar;
        this.zza = str;
        this.zzb = zzbrnVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbrnVar.zzf().toString());
            jSONObject.put("sdk_version", zzbrnVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcai zzcaiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbK)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            zzcaiVar.zzc(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void zzh(String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signal_error", str);
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbL)).booleanValue()) {
                jSONObject.put("latency", zzv.zzD().elapsedRealtime() - this.zze);
            }
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbK)).booleanValue()) {
                jSONObject.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbK)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbL)).booleanValue()) {
                jSONObject.put("latency", zzv.zzD().elapsedRealtime() - this.zze);
            }
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbK)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    public final synchronized void zzg(zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
