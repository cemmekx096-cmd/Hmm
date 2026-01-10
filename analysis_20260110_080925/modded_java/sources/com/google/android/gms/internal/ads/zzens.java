package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzens implements zzetu {
    private final zzgdm zza;
    private final VersionInfoParcel zzb;

    zzens(VersionInfoParcel versionInfoParcel, zzgdm zzgdmVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgdmVar;
    }

    public final int zza() {
        return 54;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzent.zzc(this.zza.zzb);
            }
        });
    }
}
