package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzabn implements zzcb {
    private final Context zza;
    private final zzca zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzacn zze;
    private final zzdj zzf;
    private final CopyOnWriteArraySet zzg;
    private zzet zzh = new zzet(10);
    private final zzz zzi;
    private final zzbv zzj;
    private final zzfyf zzk;
    private zzdt zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzabn(zzabg zzabgVar, zzabm zzabmVar) {
        this.zza = zzabgVar.zza;
        zzca zzcaVar = zzabgVar.zzc;
        zzdd.zzb(zzcaVar);
        this.zzb = zzcaVar;
        this.zzc = new SparseArray();
        this.zzk = zzfyf.zzn();
        this.zzj = zzbv.zza;
        this.zzd = zzabgVar.zzd;
        zzdj zzdjVar = zzabgVar.zze;
        this.zzf = zzdjVar;
        this.zze = new zzaar(zzabgVar.zzb, zzdjVar);
        this.zzg = new CopyOnWriteArraySet();
        this.zzi = new zzx().zzan();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzA(zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? zzk.zza : zzkVar;
    }

    public static /* synthetic */ void zzf(zzabn zzabnVar) {
        zzabnVar.zzn--;
    }

    static /* bridge */ /* synthetic */ void zzj(final zzabn zzabnVar, boolean z) {
        if (zzabnVar.zzo == 1) {
            zzabnVar.zzn++;
            zzacn zzacnVar = zzabnVar.zze;
            zzacnVar.zzj(z);
            while (zzabnVar.zzh.zza() > 1) {
                zzabnVar.zzh.zzb();
            }
            if (zzabnVar.zzh.zza() == 1) {
                zzabl zzablVar = (zzabl) zzabnVar.zzh.zzb();
                zzablVar.getClass();
                zzacnVar.zzl(1, zzabnVar.zzi, zzablVar.zza, zzablVar.zzb, zzfyf.zzn());
            }
            zzabnVar.zzp = -9223372036854775807L;
            zzabnVar.zzq = -9223372036854775807L;
            zzdt zzdtVar = zzabnVar.zzl;
            zzdd.zzb(zzdtVar);
            zzdtVar.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    zzabn.zzf(this.zza);
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean zzy(zzabn zzabnVar, zzz zzzVar, int i) throws zzacm {
        zzdd.zzf(zzabnVar.zzo == 0);
        zzk zzkVarZzA = zzA(zzzVar.zzE);
        int i2 = zzkVarZzA.zzd;
        if (i2 != 7) {
            if (!zzdr.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                Object[] objArr = {Integer.valueOf(i2)};
                String str = zzex.zza;
                zzea.zzf("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                zzkVarZzA = zzk.zza;
            }
        } else if (Build.VERSION.SDK_INT >= 34 || !zzdr.zzb()) {
            i2 = 7;
            if (!zzdr.zzc(i2)) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                String str2 = zzex.zza;
                zzea.zzf("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr2));
                zzkVarZzA = zzk.zza;
            }
        } else {
            zzi zziVarZzc = zzkVarZzA.zzc();
            zziVarZzc.zzd(6);
            zzkVarZzA = zziVarZzc.zzg();
        }
        zzk zzkVar = zzkVarZzA;
        zzdj zzdjVar = zzabnVar.zzf;
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        zzabnVar.zzl = zzdjVar.zzd(looperMyLooper, (Handler.Callback) null);
        try {
            zzca zzcaVar = zzabnVar.zzb;
            Context context = zzabnVar.zza;
            zzn zznVar = zzn.zza;
            final zzdt zzdtVar = zzabnVar.zzl;
            Objects.requireNonNull(zzdtVar);
            zzcaVar.zza(context, zzkVar, zznVar, zzabnVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdtVar.zzi(runnable);
                }
            }, zzabnVar.zzj, zzabnVar.zzk, 0L, false);
            throw null;
        } catch (zzbw e) {
            throw new zzacm(e, zzzVar);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzz(zzabn zzabnVar) {
        int i = zzabnVar.zzr;
        return i != -1 && i == 0;
    }

    public final zzacn zze(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzex.zzH(sparseArray, 0)) {
            return (zzacn) sparseArray.get(0);
        }
        zzabh zzabhVar = new zzabh(this, this.zza, 0);
        this.zzg.add(zzabhVar);
        sparseArray.put(0, zzabhVar);
        return zzabhVar;
    }

    public final void zzq() {
        zzeo zzeoVar = zzeo.zza;
        zzeoVar.zzb();
        zzeoVar.zza();
        this.zzm = null;
    }

    public final void zzr() {
        if (this.zzo == 2) {
            return;
        }
        zzdt zzdtVar = this.zzl;
        if (zzdtVar != null) {
            zzdtVar.zzf((Object) null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzs(Surface surface, zzeo zzeoVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeo) this.zzm.second).equals(zzeoVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzeoVar);
        zzeoVar.zzb();
        zzeoVar.zza();
    }

    public final void zzt(int i) {
        this.zzr = 1;
    }

    public final void zzu() {
        this.zze.zzx();
    }

    public final void zzv() {
        this.zze.zzy();
    }
}
