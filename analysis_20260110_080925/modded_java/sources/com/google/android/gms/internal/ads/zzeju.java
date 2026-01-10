package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeju extends zzbp {
    private final zzelb zza;

    public zzeju(Context context, zzcgz zzcgzVar, zzfcm zzfcmVar, zzdix zzdixVar, zzbk zzbkVar) {
        zzeld zzeldVar = new zzeld(zzdixVar, zzcgzVar.zzi());
        zzeldVar.zze(zzbkVar);
        this.zza = new zzelb(new zzeln(zzcgzVar, context, zzeldVar, zzfcmVar), zzfcmVar.zzL());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    public final synchronized void zzh(zzm zzmVar, int i) throws RemoteException {
        this.zza.zzd(zzmVar, i);
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
