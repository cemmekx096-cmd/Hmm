package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class zzy implements OnCompleteListener {
    public final /* synthetic */ zza zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(zza zzaVar, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.zza = zzaVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzbVar;
    }

    public final void onComplete(Task task) {
        this.zza.removeCallbacksAndMessages((Object) null);
        TaskCompletionSource taskCompletionSource = this.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.isCanceled()) {
            this.zzc.zza();
        } else {
            taskCompletionSource.trySetException((Exception) Objects.requireNonNull(task.getException()));
        }
    }
}
