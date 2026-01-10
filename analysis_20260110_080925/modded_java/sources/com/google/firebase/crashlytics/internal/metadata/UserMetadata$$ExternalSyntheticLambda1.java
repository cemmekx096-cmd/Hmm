package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;
import java.util.Map;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class UserMetadata$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ UserMetadata f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ List f$3;

    public /* synthetic */ UserMetadata$$ExternalSyntheticLambda1(UserMetadata userMetadata, String str, Map map, List list) {
        this.f$0 = userMetadata;
        this.f$1 = str;
        this.f$2 = map;
        this.f$3 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setNewSession$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata(this.f$1, this.f$2, this.f$3);
    }
}
