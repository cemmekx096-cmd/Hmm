package com.fyber.inneractive.sdk.player.cache;

import android.net.Uri;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class g implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {
    public Uri a;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        new CountDownLatch(1);
        new AtomicReference();
        this.a = kVar.a;
        throw null;
    }

    public final void close() {
    }

    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }

    public final Uri a() {
        return this.a;
    }
}
