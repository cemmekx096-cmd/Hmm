package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zze;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzaf implements Runnable {
    public final /* synthetic */ Future zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzaf(Future future, Runnable runnable) {
        this.zza = future;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Future future = this.zza;
        if (future.isDone() || future.isCancelled()) {
            return;
        }
        Runnable runnable = this.zzb;
        future.cancel(true);
        zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
        if (runnable != null) {
            runnable.run();
        }
    }
}
