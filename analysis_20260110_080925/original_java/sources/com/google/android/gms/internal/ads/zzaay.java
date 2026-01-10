package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzaay {
    private final Context zza;
    private boolean zzb;
    private zztr zzc = zztr.zza;
    private final zztd zzd;
    private Handler zze;
    private zzaci zzf;

    public zzaay(Context context) {
        this.zza = context;
        this.zzd = new zzsx(context, (zzfvw) null, (zzfvw) null);
    }

    public final zzaay zze(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaay zzf(zzaci zzaciVar) {
        this.zzf = zzaciVar;
        return this;
    }

    public final zzaay zzg(zztr zztrVar) {
        this.zzc = zztrVar;
        return this;
    }

    public final zzaba zzh() {
        zzdd.zzf(!this.zzb);
        Handler handler = this.zze;
        boolean z = false;
        if ((handler == null && this.zzf == null) || (handler != null && this.zzf != null)) {
            z = true;
        }
        zzdd.zzf(z);
        this.zzb = true;
        return new zzaba(this);
    }
}
