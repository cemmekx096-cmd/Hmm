package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzekx implements zzelf {
    final /* synthetic */ zzeky zza;

    zzekx(zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    public final void zza() {
        zzeky zzekyVar = this.zza;
        synchronized (zzekyVar) {
            zzekyVar.zzj = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeky zzekyVar = this.zza;
        zzdeu zzdeuVar = (zzdeu) obj;
        synchronized (zzekyVar) {
            zzekyVar.zzj = zzdeuVar;
            zzekyVar.zzj.zzk();
        }
    }
}
