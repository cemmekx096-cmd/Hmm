package com.google.android.gms.internal.p000firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzaju {
    private final Object zza;
    private final int zzb;

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    zzaju(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaju)) {
            return false;
        }
        zzaju zzajuVar = (zzaju) obj;
        return this.zza == zzajuVar.zza && this.zzb == zzajuVar.zzb;
    }
}
