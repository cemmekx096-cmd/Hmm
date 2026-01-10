package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class Uploader$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ Uploader f$0;
    public final /* synthetic */ TransportContext f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Runnable f$3;

    public /* synthetic */ Uploader$$ExternalSyntheticLambda2(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.f$0 = uploader;
        this.f$1 = transportContext;
        this.f$2 = i;
        this.f$3 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$upload$1$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader(this.f$1, this.f$2, this.f$3);
    }
}
