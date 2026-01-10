package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzelv implements zzetu {
    private final Clock zza;
    private final zzfco zzb;

    zzelv(Clock clock, zzfco zzfcoVar) {
        this.zza = clock;
        this.zzb = zzfcoVar;
    }

    public final int zza() {
        return 4;
    }

    public final ListenableFuture zzb() {
        return zzgdb.zzh(new zzelw(this.zzb, this.zza.currentTimeMillis()));
    }
}
