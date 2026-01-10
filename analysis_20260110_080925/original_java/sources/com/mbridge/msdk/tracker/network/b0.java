package com.mbridge.msdk.tracker.network;

import com.crashlytics.android.BuildConfig;

/* compiled from: VolleyError.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class b0 extends Exception {
    public final q a;
    private long b;
    private int c;
    private String d;

    public b0() {
        this.c = 0;
        this.d = BuildConfig.FLAVOR;
        this.a = null;
    }

    public abstract int a();

    void a(long j) {
        this.b = j;
    }

    public int b() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public b0(q qVar) {
        this.c = 0;
        this.d = BuildConfig.FLAVOR;
        this.a = qVar;
    }

    public b0(String str) {
        super(str);
        this.c = 0;
        this.d = BuildConfig.FLAVOR;
        this.a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.c = 0;
        this.d = BuildConfig.FLAVOR;
        this.a = null;
    }
}
