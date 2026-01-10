package com.inmobi.media;

import java.lang.ref.WeakReference;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class O0$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Q0 f$0;
    public final /* synthetic */ WeakReference f$1;

    public /* synthetic */ O0$$ExternalSyntheticLambda0(Q0 q0, WeakReference weakReference) {
        this.f$0 = q0;
        this.f$1 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O0.a(this.f$0, this.f$1);
    }
}
