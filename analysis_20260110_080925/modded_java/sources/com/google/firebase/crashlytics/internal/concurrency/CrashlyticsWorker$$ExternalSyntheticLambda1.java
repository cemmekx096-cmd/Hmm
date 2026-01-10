package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class CrashlyticsWorker$$ExternalSyntheticLambda1 implements Continuation {
    public final /* synthetic */ Runnable f$0;

    public final Object then(Task task) {
        return CrashlyticsWorker.lambda$submit$1(this.f$0, task);
    }
}
