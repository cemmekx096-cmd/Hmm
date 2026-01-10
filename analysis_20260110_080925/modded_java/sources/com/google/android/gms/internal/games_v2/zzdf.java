package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final /* synthetic */ class zzdf implements RemoteCall {
    static final /* synthetic */ zzdf zza = new zzdf();

    private /* synthetic */ zzdf() {
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzah) obj).getService().zzv());
    }
}
