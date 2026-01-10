package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final /* synthetic */ class zzae implements RemoteCall {
    private final FusedLocationProviderClient zza;
    private final zzap zzb;
    private final LocationCallback zzc;
    private final zzan zzd;
    private final com.google.android.gms.internal.location.zzba zze;
    private final ListenerHolder zzf;

    zzae(FusedLocationProviderClient fusedLocationProviderClient, zzap zzapVar, LocationCallback locationCallback, zzan zzanVar, com.google.android.gms.internal.location.zzba zzbaVar, ListenerHolder listenerHolder) {
        this.zza = fusedLocationProviderClient;
        this.zzb = zzapVar;
        this.zzc = locationCallback;
        this.zzd = zzanVar;
        this.zze = zzbaVar;
        this.zzf = listenerHolder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
    }
}
