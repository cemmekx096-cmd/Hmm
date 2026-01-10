package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzejv implements zzelf {
    final /* synthetic */ zzejw zza;

    zzejv(zzejw zzejwVar) {
        this.zza = zzejwVar;
    }

    public final void zza() {
        zzejw zzejwVar = this.zza;
        synchronized (zzejwVar) {
            zzejwVar.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejw zzejwVar = this.zza;
        zzcon zzconVar = (zzcon) obj;
        synchronized (zzejwVar) {
            if (zzejwVar.zzi != null) {
                zzejwVar.zzi.zzb();
            }
            zzejwVar.zzi = zzconVar;
            zzejwVar.zzi.zzk();
        }
    }
}
