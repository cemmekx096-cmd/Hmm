package com.applovin.impl;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class f6 extends w4 {
    private final Runnable g;

    public f6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    public void run() {
        this.g.run();
    }

    public f6(com.applovin.impl.sdk.k kVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z);
        this.g = runnable;
    }
}
