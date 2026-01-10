package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeoh implements zzetu {
    private final zzeyr zza;

    zzeoh(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    public final int zza() {
        return 15;
    }

    public final ListenableFuture zzb() {
        zzeyr zzeyrVar = this.zza;
        if (zzeyrVar == null) {
            return zzgdb.zzh(new zzeog(null));
        }
        String strZza = zzeyrVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgdb.zzh(new zzeog(null)) : zzgdb.zzh(new zzeog(strZza));
    }
}
