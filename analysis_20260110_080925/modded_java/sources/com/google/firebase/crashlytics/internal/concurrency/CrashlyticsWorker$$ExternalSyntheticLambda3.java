package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class CrashlyticsWorker$$ExternalSyntheticLambda3 implements Continuation {
    public final /* synthetic */ SuccessContinuation f$0;

    public final Object then(Task task) {
        return CrashlyticsWorker.lambda$submitTaskOnSuccess$5(this.f$0, task);
    }
}
