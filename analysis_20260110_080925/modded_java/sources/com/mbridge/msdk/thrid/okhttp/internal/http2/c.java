package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okio.f;

/* compiled from: Header.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class c {
    public static final f d = f.c(":");
    public static final f e = f.c(":status");
    public static final f f = f.c(":method");
    public static final f g = f.c(":path");
    public static final f h = f.c(":scheme");
    public static final f i = f.c(":authority");
    public final f a;
    public final f b;
    final int c;

    /* compiled from: Header.java */
    interface a {
    }

    public c(String str, String str2) {
        this(f.c(str), f.c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", new Object[]{this.a.h(), this.b.h()});
    }

    public c(f fVar, String str) {
        this(fVar, f.c(str));
    }

    public c(f fVar, f fVar2) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar.e() + 32 + fVar2.e();
    }
}
