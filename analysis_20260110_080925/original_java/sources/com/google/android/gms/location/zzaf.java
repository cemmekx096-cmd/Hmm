package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final /* synthetic */ class zzaf implements RemoteCall {
    private final FusedLocationProviderClient zza;
    private final com.google.android.gms.internal.location.zzba zzb;
    private final PendingIntent zzc;

    zzaf(FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.internal.location.zzba zzbaVar, PendingIntent pendingIntent) {
        this.zza = fusedLocationProviderClient;
        this.zzb = zzbaVar;
        this.zzc = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zza(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
    }
}
