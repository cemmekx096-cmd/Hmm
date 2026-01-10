package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzabd extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabb zzd;
    private boolean zze;

    /* synthetic */ zzabd(zzabb zzabbVar, SurfaceTexture surfaceTexture, boolean z, zzabc zzabcVar) {
        super(surfaceTexture);
        this.zzd = zzabbVar;
        this.zza = z;
    }

    public static zzabd zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdd.zzf(z2);
        return new zzabb().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        if (!zzc) {
            zzb = zzdr.zzd(context) ? zzdr.zze() ? 1 : 2 : 0;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzabb zzabbVar = this.zzd;
        synchronized (zzabbVar) {
            if (!this.zze) {
                zzabbVar.zzb();
                this.zze = true;
            }
        }
    }
}
