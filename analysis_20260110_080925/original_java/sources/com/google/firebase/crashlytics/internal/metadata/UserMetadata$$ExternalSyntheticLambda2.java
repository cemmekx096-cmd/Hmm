package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class UserMetadata$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ UserMetadata f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ UserMetadata$$ExternalSyntheticLambda2(UserMetadata userMetadata, List list) {
        this.f$0 = userMetadata;
        this.f$1 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$updateRolloutsState$1$com-google-firebase-crashlytics-internal-metadata-UserMetadata(this.f$1);
    }
}
