package com.google.android.gms.internal.measurement;

import com.crashlytics.android.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class zzcc {
    static final zzcc zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        zzbu zzbuVar = new zzbu();
        zzbuVar.zza(BuildConfig.FLAVOR);
        zzbuVar.zzb(false);
        zzbuVar.zzd(1);
        zzbuVar.zze(1);
        zzbuVar.zzc();
        zzbu zzbuVar2 = new zzbu();
        zzbuVar2.zza(BuildConfig.FLAVOR);
        zzbuVar2.zzb(false);
        zzbuVar2.zzd(4);
        zzbuVar2.zze(1);
        zza = zzbuVar2.zzc();
        zzbu zzbuVar3 = new zzbu();
        zzbuVar3.zza(BuildConfig.FLAVOR);
        zzbuVar3.zzb(false);
        zzbuVar3.zzd(2);
        zzbuVar3.zze(1);
        zzbuVar3.zzc();
    }

    public abstract zzbs zza();

    public abstract zzbt zzb();

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract int zze();

    public abstract int zzf();
}
