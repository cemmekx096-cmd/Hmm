package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;

/* compiled from: BooleanTypeAdapter.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class a extends r<Boolean> {
    public final /* synthetic */ void a(c cVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            cVar.h();
        } else {
            cVar.a(bool);
        }
    }

    /* compiled from: BooleanTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.c.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.a().length];
            a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bykv.vk.openvk.preload.a.m */
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws m, IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = aVar.f();
        int i = AnonymousClass1.a[bVarF.ordinal()];
        if (i == 1) {
            return Boolean.valueOf(aVar.i());
        }
        if (i == 2) {
            aVar.j();
            return null;
        }
        if (i == 3) {
            return Boolean.valueOf(aVar.m() != 0);
        }
        throw new m("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(bVarF)));
    }
}
