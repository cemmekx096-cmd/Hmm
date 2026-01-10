package com.applovin.impl;

import com.applovin.impl.u;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class c5 extends w4 {
    private final a g;

    public interface a {
        void a(u.a aVar);
    }

    public c5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.g = aVar;
    }

    public void run() {
        this.g.a(((w4) this).a.B().f());
    }
}
