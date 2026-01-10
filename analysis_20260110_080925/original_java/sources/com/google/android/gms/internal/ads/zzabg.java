package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzabg {
    private final Context zza;
    private final zzabr zzb;
    private zzca zzc;
    private boolean zzd;
    private zzdj zze = zzdj.zza;
    private boolean zzf;

    public zzabg(Context context, zzabr zzabrVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzabrVar;
    }

    public final zzabg zzd(zzdj zzdjVar) {
        this.zze = zzdjVar;
        return this;
    }

    public final zzabg zze(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzabn zzf() {
        zzdd.zzf(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzabk(false);
        }
        zzabn zzabnVar = new zzabn(this, null);
        this.zzf = true;
        return zzabnVar;
    }
}
