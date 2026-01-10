package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Scope;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzd extends zze {
    zzd() {
        super(null);
    }

    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        return zzhd.zzj(new Scope("https://www.googleapis.com/auth/games"));
    }
}
