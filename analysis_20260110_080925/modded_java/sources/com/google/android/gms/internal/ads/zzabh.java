package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzabh implements zzacn {
    final /* synthetic */ zzabn zza;
    private zzfyf zzb;
    private zzz zzc;
    private long zzd;
    private long zze;

    public zzabh(zzabn zzabnVar, Context context, int i) {
        this.zza = zzabnVar;
        zzex.zzL(context);
        this.zzb = zzfyf.zzn();
        this.zze = -9223372036854775807L;
    }

    private static final void zza(zzz zzzVar) {
        zzx zzxVarZzb = zzzVar.zzb();
        zzxVarZzb.zzF(zzabn.zzA(zzzVar.zzE));
        zzxVarZzb.zzan();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzA(zzz zzzVar) throws zzacm {
        return zzabn.zzy(this.zza, zzzVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzC() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzD(boolean z) {
        return this.zza.zze.zzD(false);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final Surface zzb() {
        zzdd.zzf(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzh() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzh.zza() == 0) {
            zzabnVar.zze.zzh();
            return;
        }
        zzet zzetVar = new zzet(10);
        boolean z = true;
        while (zzabnVar.zzh.zza() > 0) {
            zzabl zzablVar = (zzabl) zzabnVar.zzh.zzb();
            zzablVar.getClass();
            if (z) {
                int i = zzablVar.zzb;
                if (i == 0 || i == 1) {
                    zzablVar = new zzabl(zzablVar.zza, 0, zzablVar.zzc);
                } else {
                    zzabnVar.zze.zzh();
                }
            }
            zzetVar.zzd(zzablVar.zzc, zzablVar);
            z = false;
        }
        zzabnVar.zzh = zzetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzi() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzj(boolean z) {
        this.zze = -9223372036854775807L;
        zzabn.zzj(this.zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzk(boolean z) {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zze.zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzl(int i, zzz zzzVar, long j, int i2, List list) {
        zzdd.zzf(false);
        this.zzb = zzfyf.zzl(list);
        this.zzc = zzzVar;
        zzabn zzabnVar = this.zza;
        zzabnVar.zzq = -9223372036854775807L;
        zza(zzzVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzabnVar.zzd) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        zzabnVar.zzh.zzd(j3, new zzabl(j + this.zzd, i2, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzn() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzo(long j, long j2) throws zzacm {
        this.zza.zze.zzo(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzp(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzq(int i) {
        this.zza.zze.zzq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzr(zzack zzackVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzs(Surface surface, zzeo zzeoVar) {
        this.zza.zzs(surface, zzeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzt(float f) {
        this.zza.zze.zzt(f);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzu(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzfyf.zzl(list);
        zzz zzzVar = this.zzc;
        if (zzzVar != null) {
            zza(zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzv(zzabo zzaboVar) {
        this.zza.zze.zzv(zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzw() {
        zzabn zzabnVar = this.zza;
        zzabnVar.zzq = this.zze;
        if (zzabnVar.zzp >= zzabnVar.zzq) {
            zzabnVar.zze.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzx() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzy() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzz(long j, zzacl zzaclVar) {
        zzdd.zzf(false);
        if (zzabn.zzz(this.zza)) {
            throw null;
        }
        return false;
    }
}
