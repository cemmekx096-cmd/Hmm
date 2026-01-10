package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class S6 implements R6 {
    public final R6 a;
    public final AtomicBoolean b;

    public S6(R6 r6) {
        Intrinsics.checkNotNullParameter(r6, "mediaChangeReceiver");
        this.a = r6;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.R6
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.a.a();
        }
    }

    @Override // com.inmobi.media.R6
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.b();
    }
}
