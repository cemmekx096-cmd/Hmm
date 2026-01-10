package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeoo implements zzetu {
    private final zzgdm zza;

    zzeoo(zzgdm zzgdmVar) {
        this.zza = zzgdmVar;
    }

    public final int zza() {
        return 55;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeop(Long.valueOf(zzv.zzD().currentTimeMillis() - zzv.zzp().zzi().zzg().zza()).longValue());
            }
        });
    }
}
