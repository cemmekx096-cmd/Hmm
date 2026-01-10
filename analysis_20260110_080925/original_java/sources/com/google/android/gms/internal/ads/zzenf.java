package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzenf implements zzetu {
    private final Executor zza;
    private final zzbzq zzb;

    zzenf(Executor executor, zzbzq zzbzqVar) {
        this.zza = executor;
        this.zzb = zzbzqVar;
    }

    public final int zza() {
        return 10;
    }

    public final ListenableFuture zzb() {
        return ((Boolean) zzbd.zzc().zzb(zzbdc.zzde)).booleanValue() ? zzgdb.zzh(new zzeng(null)) : zzgdb.zzm(this.zzb.zzk(), new zzfut() { // from class: com.google.android.gms.internal.ads.zzene
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzeng(arrayList);
            }
        }, this.zza);
    }
}
