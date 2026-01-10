package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzegf implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzegf(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
        this.zzd = zzhghVar5;
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegd zzb() {
        return new zzegd(zzffm.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcqy) this.zzb.zzb(), (zzegt) this.zzc.zzb(), (zzfjm) this.zzd.zzb());
    }
}
