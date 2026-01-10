package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzehc {
    private zzegt zza;

    zzehc() {
    }

    private zzehc(zzegt zzegtVar) {
        this.zza = zzegtVar;
    }

    public static zzehc zzb(zzegt zzegtVar) {
        return new zzehc(zzegtVar);
    }

    public final zzegt zza(Clock clock, zzegv zzegvVar, zzedj zzedjVar, zzfjq zzfjqVar) {
        zzegt zzegtVar = this.zza;
        return zzegtVar != null ? zzegtVar : new zzegt(clock, zzegvVar, zzedjVar, zzfjqVar);
    }
}
