package com.inmobi.media;

import java.io.File;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class J3 {
    public final String a;
    public final long[] b;
    public boolean c;
    public I3 d;
    public final /* synthetic */ L3 e;

    public J3(L3 l3, String str) {
        this.e = l3;
        this.a = str;
        this.b = new long[l3.h];
    }

    public final File a(int i) {
        return new File(this.e.a, this.a + "." + i);
    }

    public final File b(int i) {
        return new File(this.e.a, this.a + "." + i + ".tmp");
    }
}
