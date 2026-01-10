package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final /* synthetic */ class zzo implements RemoteCall {
    private final /* synthetic */ zzq zza;
    private final /* synthetic */ zzr zzb;
    private final /* synthetic */ zzi zzc;

    /* synthetic */ zzo(zzq zzqVar, zzr zzrVar, zzi zziVar) {
        this.zza = zzqVar;
        this.zzb = zzrVar;
        this.zzc = zziVar;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzv) ((zzu) obj).getService()).zze(new zzm(this.zza, (TaskCompletionSource) obj2), this.zzb, this.zzc);
    }
}
