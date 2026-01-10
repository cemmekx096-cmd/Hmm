package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzabv {
    private final zzaat zza = new zzaat();
    private final zzabt zzb;
    private final zzabu zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    static /* bridge */ /* synthetic */ void zzb(zzabv zzabvVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzabvVar.zzk = refreshRate;
            zzabvVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzea.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzabvVar.zzk = -9223372036854775807L;
            zzabvVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzabs.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L62
            android.view.Surface r0 = r8.zze
            if (r0 != 0) goto Lb
            goto L62
        Lb:
            com.google.android.gms.internal.ads.zzaat r0 = r8.zza
            boolean r2 = r0.zzg()
            if (r2 == 0) goto L18
            float r2 = r0.zza()
            goto L1a
        L18:
            float r2 = r8.zzf
        L1a:
            float r3 = r8.zzg
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L62
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L51
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L51
            boolean r1 = r0.zzg()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            long r0 = r0.zzd()
            r4 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L44
            r3 = 1017370378(0x3ca3d70a, float:0.02)
        L44:
            float r0 = r8.zzg
            float r0 = r2 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L5a
            goto L5b
        L51:
            if (r5 != 0) goto L5d
            int r0 = r0.zzb()
            if (r0 < r1) goto L5a
            goto L5b
        L5a:
            r6 = r7
        L5b:
            if (r6 == 0) goto L62
        L5d:
            r8.zzg = r2
            r8.zzn(r7)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabv.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzabs.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1) {
            zzaat zzaatVar = this.zza;
            if (zzaatVar.zzg()) {
                long jZzc = zzaatVar.zzc();
                long j3 = this.zzq + ((long) ((jZzc * (this.zzm - this.zzp)) / this.zzi));
                if (Math.abs(j - j3) > 20000000) {
                    zzl();
                } else {
                    j = j3;
                }
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzabu zzabuVar = this.zzc;
        if (zzabuVar != null && this.zzk != -9223372036854775807L) {
            long j4 = zzabuVar.zza;
            if (j4 != -9223372036854775807L) {
                long j5 = this.zzk;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    j6 = j5 + j6;
                    j2 = j6;
                }
                long j7 = this.zzl;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j7;
            }
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        zzabt zzabtVar = this.zzb;
        if (zzabtVar != null) {
            zzabu zzabuVar = this.zzc;
            zzabuVar.getClass();
            zzabuVar.zzb();
            zzabtVar.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzabt zzabtVar = this.zzb;
        if (zzabtVar != null) {
            zzabtVar.zzb();
            zzabu zzabuVar = this.zzc;
            zzabuVar.getClass();
            zzabuVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }

    public zzabv(Context context) {
        DisplayManager displayManager;
        zzabt zzabtVar = (context == null || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) ? null : new zzabt(this, displayManager);
        this.zzb = zzabtVar;
        this.zzc = zzabtVar != null ? zzabu.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }
}
