package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzt;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzekt implements zzcyd {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(zzdt zzdtVar) {
        this.zza.set(zzdtVar);
    }

    public final void zzh(final zzt zztVar) {
        zzeyy.zza(this.zza, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeks
            public final void zza(Object obj) throws RemoteException {
                ((zzdt) obj).zze(zztVar);
            }
        });
    }
}
