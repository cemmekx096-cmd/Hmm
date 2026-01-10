package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzach {
    private final Handler zza;
    private final zzaci zzb;

    public zzach(Handler handler, zzaci zzaciVar) {
        if (zzaciVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaciVar;
    }

    public static /* synthetic */ void zza(zzach zzachVar, Exception exc) {
        String str = zzex.zza;
        zzachVar.zzb.zzp(exc);
    }

    public static /* synthetic */ void zzb(zzach zzachVar, String str) {
        String str2 = zzex.zza;
        zzachVar.zzb.zzr(str);
    }

    public static /* synthetic */ void zzc(zzach zzachVar, long j, int i) {
        String str = zzex.zza;
        zzachVar.zzb.zzu(j, i);
    }

    public static /* synthetic */ void zzd(zzach zzachVar, int i, long j) {
        String str = zzex.zza;
        zzachVar.zzb.zzm(i, j);
    }

    public static /* synthetic */ void zze(zzach zzachVar, zzcd zzcdVar) {
        String str = zzex.zza;
        zzachVar.zzb.zzw(zzcdVar);
    }

    public static /* synthetic */ void zzf(zzach zzachVar, zzid zzidVar) {
        zzidVar.zza();
        String str = zzex.zza;
        zzachVar.zzb.zzs(zzidVar);
    }

    public static /* synthetic */ void zzg(zzach zzachVar, zzz zzzVar, zzie zzieVar) {
        String str = zzex.zza;
        zzachVar.zzb.zzv(zzzVar, zzieVar);
    }

    public static /* synthetic */ void zzh(zzach zzachVar, Object obj, long j) {
        String str = zzex.zza;
        zzachVar.zzb.zzn(obj, j);
    }

    public static /* synthetic */ void zzi(zzach zzachVar, zzid zzidVar) {
        String str = zzex.zza;
        zzachVar.zzb.zzt(zzidVar);
    }

    public static /* synthetic */ void zzj(zzach zzachVar, String str, long j, long j2) {
        String str2 = zzex.zza;
        zzachVar.zzb.zzq(str, j, j2);
    }

    public final void zzk(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabx
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzj(this.zza, str, j, j2);
                }
            });
        }
    }

    public final void zzl(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacg
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzb(this.zza, str);
                }
            });
        }
    }

    public final void zzm(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacf
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzf(this.zza, zzidVar);
                }
            });
        }
    }

    public final void zzn(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabz
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzd(this.zza, i, j);
                }
            });
        }
    }

    public final void zzo(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacd
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzi(this.zza, zzidVar);
                }
            });
        }
    }

    public final void zzp(final zzz zzzVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzace
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzg(this.zza, zzzVar, zzieVar);
                }
            });
        }
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaca
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzh(this.zza, obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacb
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zzc(this.zza, j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacc
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zza(this.zza, exc);
                }
            });
        }
    }

    public final void zzt(final zzcd zzcdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaby
                @Override // java.lang.Runnable
                public final void run() {
                    zzach.zze(this.zza, zzcdVar);
                }
            });
        }
    }
}
