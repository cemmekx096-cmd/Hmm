package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class g extends r<Object> {
    public static final s a = new s() { // from class: com.bykv.vk.openvk.preload.a.b.a.g.1
        public final <T> r<T> a(d dVar, a<T> aVar) {
            if (aVar.a() == Object.class) {
                return new g(dVar);
            }
            return null;
        }
    };
    private final d b;

    g(d dVar) {
        this.b = dVar;
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a.g$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a().length];
            a = iArr;
            try {
                iArr[b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        switch (AnonymousClass2.a[aVar.f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                com.bykv.vk.openvk.preload.a.b.g gVar = new com.bykv.vk.openvk.preload.a.b.g();
                aVar.c();
                while (aVar.e()) {
                    gVar.put(aVar.g(), a(aVar));
                }
                aVar.d();
                return gVar;
            case 3:
                return aVar.h();
            case 4:
                return Double.valueOf(aVar.k());
            case 5:
                return Boolean.valueOf(aVar.i());
            case 6:
                aVar.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.h();
            return;
        }
        r rVarA = this.b.a(obj.getClass());
        if (rVarA instanceof g) {
            cVar.f();
            cVar.g();
        } else {
            rVarA.a(cVar, obj);
        }
    }
}
