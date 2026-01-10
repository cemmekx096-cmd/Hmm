package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final /* synthetic */ class zzdy implements RemoteCall {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;

    /* synthetic */ zzdy(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((com.google.android.gms.games.internal.zzah) obj).zzs((TaskCompletionSource) obj2, this.zza, this.zzb);
    }
}
