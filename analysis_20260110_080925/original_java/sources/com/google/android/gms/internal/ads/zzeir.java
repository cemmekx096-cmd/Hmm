package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeir implements zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvp zzb;
    private final zzcwj zzc;
    private final zzddy zzd;
    private final zzddq zze;
    private final zzcni zzf;

    zzeir(zzcvp zzcvpVar, zzcwj zzcwjVar, zzddy zzddyVar, zzddq zzddqVar, zzcni zzcniVar) {
        this.zzb = zzcvpVar;
        this.zzc = zzcwjVar;
        this.zzd = zzddyVar;
        this.zze = zzddqVar;
        this.zzf = zzcniVar;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzs();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
