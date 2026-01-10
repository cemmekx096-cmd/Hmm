package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzefx extends zzbrg {
    final /* synthetic */ zzefz zza;
    private final zzedh zzb;

    /* synthetic */ zzefx(zzefz zzefzVar, zzedh zzedhVar, zzefy zzefyVar) {
        this.zza = zzefzVar;
        this.zzb = zzedhVar;
    }

    public final void zze(String str) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zzeVar) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzh(zzeVar);
    }

    public final void zzg(zzbqd zzbqdVar) throws RemoteException {
        this.zza.zzc = zzbqdVar;
        ((zzeev) this.zzb.zzc).zzo();
    }
}
