package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final /* synthetic */ class zzab implements RemoteCall {
    private final FusedLocationProviderClient zza;
    private final CancellationToken zzb;
    private final com.google.android.gms.internal.location.zzba zzc;

    zzab(FusedLocationProviderClient fusedLocationProviderClient, CancellationToken cancellationToken, com.google.android.gms.internal.location.zzba zzbaVar) {
        this.zza = fusedLocationProviderClient;
        this.zzb = cancellationToken;
        this.zzc = zzbaVar;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzc(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
    }
}
