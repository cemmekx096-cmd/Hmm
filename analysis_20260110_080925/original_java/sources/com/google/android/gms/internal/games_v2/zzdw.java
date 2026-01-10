package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final /* synthetic */ class zzdw implements RemoteCall {
    private final /* synthetic */ Player zza;

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        PlayerEntity playerEntity = new PlayerEntity(this.zza);
        Intent intentZzN = ((com.google.android.gms.games.internal.zzah) obj).getService().zzN(playerEntity);
        intentZzN.setExtrasClassLoader(playerEntity.getClass().getClassLoader());
        ((TaskCompletionSource) obj2).setResult(intentZzN);
    }
}
