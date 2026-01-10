package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class J implements Runnable {
    public final /* synthetic */ U a;
    public final /* synthetic */ L b;

    public J(L l, U u) {
        this.b = l;
        this.a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("retryNetworkRequest pre-execute - %s", new Object[]{this.a.getClass().getName()});
        this.b.b(this.a);
    }
}
