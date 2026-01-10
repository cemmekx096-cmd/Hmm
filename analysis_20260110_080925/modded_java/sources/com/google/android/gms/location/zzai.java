package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final /* synthetic */ class zzai implements RemoteCall {
    private final Location zza;

    zzai(Location location) {
        this.zza = location;
    }

    public final void accept(Object obj, Object obj2) {
        Location location = this.zza;
        String str = FusedLocationProviderClient.KEY_MOCK_LOCATION;
        ((com.google.android.gms.internal.location.zzaz) obj).zzJ(location);
        ((TaskCompletionSource) obj2).setResult((Object) null);
    }
}
