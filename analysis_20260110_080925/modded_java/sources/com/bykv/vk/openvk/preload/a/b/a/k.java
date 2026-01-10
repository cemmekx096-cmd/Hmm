package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.h;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class k<T> extends r<T> {
    private final o<T> a;
    private final h<T> b;
    private d c;
    private final com.bykv.vk.openvk.preload.a.c.a<T> d;
    private final s e;
    private r<T> f;

    public k(o<T> oVar, h<T> hVar, d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar, s sVar) {
        new a();
        this.a = oVar;
        this.b = hVar;
        this.c = dVar;
        this.d = aVar;
        this.e = sVar;
    }

    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.b == null) {
            return (T) b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.geckox.h.a.a(aVar) instanceof com.bykv.vk.openvk.preload.a.k) {
            return null;
        }
        h<T> hVar = this.b;
        this.d.b();
        return (T) hVar.a();
    }

    public final void a(c cVar, T t) throws IOException {
        o<T> oVar = this.a;
        if (oVar == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.h();
        } else {
            this.d.b();
            com.bykv.vk.openvk.preload.geckox.h.a.a(oVar.a(), cVar);
        }
    }

    private r<T> b() {
        r<T> rVar = this.f;
        if (rVar != null) {
            return rVar;
        }
        r<T> rVarA = this.c.a(this.e, this.d);
        this.f = rVarA;
        return rVarA;
    }

    /* compiled from: TreeTypeAdapter.java */
    final class a {
        /* synthetic */ a() {
            this((byte) 0);
        }

        private a(byte b) {
        }
    }
}
