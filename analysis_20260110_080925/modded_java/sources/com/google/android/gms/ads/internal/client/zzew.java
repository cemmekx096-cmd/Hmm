package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbmh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzew extends zzbmh {
    final /* synthetic */ zzey zza;

    /* synthetic */ zzew(zzey zzeyVar, zzex zzexVar) {
        this.zza = zzeyVar;
    }

    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        zzey zzeyVar = this.zza;
        synchronized (zzeyVar.zzf) {
            zzeyVar.zzi = false;
            zzeyVar.zzj = true;
            arrayList = new ArrayList(zzeyVar.zzh);
            zzeyVar.zzh.clear();
        }
        InitializationStatus initializationStatusZzA = zzey.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusZzA);
        }
    }
}
