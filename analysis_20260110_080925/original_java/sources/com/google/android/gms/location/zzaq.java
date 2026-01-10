package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final /* synthetic */ class zzaq implements RemoteCall {
    private final GeofencingRequest zza;
    private final PendingIntent zzb;

    zzaq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        GeofencingRequest geofencingRequest = this.zza;
        PendingIntent pendingIntent = this.zzb;
        int i = GeofencingClient.zza;
        ((com.google.android.gms.internal.location.zzaz) obj).zzv(geofencingRequest, pendingIntent, new zzat((TaskCompletionSource) obj2));
    }
}
