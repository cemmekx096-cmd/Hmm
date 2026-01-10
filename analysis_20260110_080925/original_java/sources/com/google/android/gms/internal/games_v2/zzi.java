package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzi implements Api.ApiOptions.Optional {
    public final int zza;
    public final String zzb;

    /* synthetic */ zzi(int i, String str, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
    }

    public static zzh zza() {
        return new zzh(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.zza == zziVar.zza && Objects.equal(this.zzb, zziVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }
}
