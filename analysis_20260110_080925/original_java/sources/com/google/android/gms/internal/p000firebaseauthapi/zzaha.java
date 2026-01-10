package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzaha {
    private final String zza;
    private final zzaih zzb;

    public final zzaih zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public zzaha(String str, zzaih zzaihVar) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = (zzaih) Preconditions.checkNotNull(zzaihVar);
    }
}
