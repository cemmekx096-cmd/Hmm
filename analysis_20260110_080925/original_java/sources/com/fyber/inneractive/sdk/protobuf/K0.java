package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class K0 implements U0 {
    public final E0 a;
    public final p1 b;
    public final boolean c;
    public final J d;

    public K0(p1 p1Var, J j, E0 e0) {
        this.b = p1Var;
        j.getClass();
        this.c = e0 instanceof GeneratedMessageLite$ExtendableMessage;
        this.d = j;
        this.a = e0;
    }

    public final Object a() {
        return this.a.newBuilderForType().b();
    }

    public final boolean b(Object obj, Object obj2) {
        this.b.getClass();
        o1 o1Var = ((a0) obj).unknownFields;
        this.b.getClass();
        if (!o1Var.equals(((a0) obj2).unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.getClass();
        N n = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.d.getClass();
        return n.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    public final void c(Object obj) {
        this.b.getClass();
        ((a0) obj).unknownFields.e = false;
        this.d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    public final int d(Object obj) {
        this.b.getClass();
        int iHashCode = ((a0) obj).unknownFields.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.getClass();
        return (iHashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a.hashCode();
    }

    public final void a(Object obj, Object obj2) {
        p1 p1Var = this.b;
        Class cls = V0.a;
        p1Var.getClass();
        a0 a0Var = (a0) obj;
        o1 o1VarA = a0Var.unknownFields;
        o1 o1Var = ((a0) obj2).unknownFields;
        if (!o1Var.equals(o1.f)) {
            o1VarA = o1.a(o1VarA, o1Var);
        }
        a0Var.unknownFields = o1VarA;
        if (this.c) {
            this.d.getClass();
            N n = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n.a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n);
        }
    }

    public final int b(Object obj) {
        this.b.getClass();
        o1 o1Var = ((a0) obj).unknownFields;
        int i = o1Var.d;
        if (i == -1) {
            int iA = 0;
            for (int i2 = 0; i2 < o1Var.a; i2++) {
                int i3 = o1Var.b[i2] >>> 3;
                iA += B.a((s) o1Var.c[i2]) + B.b(3) + B.c(i3) + B.b(2) + (B.b(1) * 2);
            }
            o1Var.d = iA;
            i = iA;
        }
        if (!this.c) {
            return i;
        }
        this.d.getClass();
        return i + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a();
    }

    public final void a(Object obj, C c) {
        this.d.getClass();
        Iterator itD = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            X x = (X) entry.getKey();
            if (x.c.a() == L1.MESSAGE && !x.d && !x.e) {
                int i = x.b;
                Object value = entry.getValue();
                c.getClass();
                if (value instanceof s) {
                    c.a.b(i, (s) value);
                } else {
                    c.a.a(i, (E0) value);
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.b.getClass();
        o1 o1Var = ((a0) obj).unknownFields;
        o1Var.getClass();
        c.getClass();
        if (R1.ASCENDING == R1.DESCENDING) {
            for (int i2 = o1Var.a - 1; i2 >= 0; i2--) {
                int i3 = o1Var.b[i2] >>> 3;
                Object obj2 = o1Var.c[i2];
                if (obj2 instanceof s) {
                    c.a.b(i3, (s) obj2);
                } else {
                    c.a.a(i3, (E0) obj2);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < o1Var.a; i4++) {
            int i5 = o1Var.b[i4] >>> 3;
            Object obj3 = o1Var.c[i4];
            if (obj3 instanceof s) {
                c.a.b(i5, (s) obj3);
            } else {
                c.a.a(i5, (E0) obj3);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.f r15) throws com.fyber.inneractive.sdk.protobuf.o0 {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.K0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.f):void");
    }

    public final void a(Object obj, T0 t0, H h) {
        p1 p1Var = this.b;
        J j = this.d;
        p1Var.getClass();
        a0 a0Var = (a0) obj;
        o1 o1Var = a0Var.unknownFields;
        if (o1Var == o1.f) {
            o1Var = new o1();
            a0Var.unknownFields = o1Var;
        }
        o1 o1Var2 = o1Var;
        j.getClass();
        N nEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (t0.s() != Integer.MAX_VALUE && a(t0, h, j, nEnsureExtensionsAreMutable, p1Var, o1Var2)) {
            try {
            } finally {
                a0Var.unknownFields = o1Var2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    public final boolean a(T0 t0, H h, J j, N n, p1 p1Var, o1 o1Var) throws o0 {
        byte[] bArr;
        int iE = t0.e();
        if (iE != 11) {
            if ((iE & 7) == 2) {
                E0 e0 = this.a;
                j.getClass();
                Y yA = h.a(iE >>> 3, e0);
                if (yA != null) {
                    n.c(yA.d, t0.b(yA.c.getClass(), h));
                    return true;
                }
                p1Var.getClass();
                return p1.a(o1Var, t0);
            }
            return t0.i();
        }
        int iC = 0;
        Y yA2 = null;
        s sVarA = null;
        while (t0.s() != Integer.MAX_VALUE) {
            int iE2 = t0.e();
            if (iE2 == 16) {
                iC = t0.c();
                E0 e02 = this.a;
                j.getClass();
                yA2 = h.a(iC, e02);
            } else if (iE2 == 26) {
                if (yA2 != null) {
                    j.getClass();
                    n.c(yA2.d, t0.b(yA2.c.getClass(), h));
                } else {
                    sVarA = t0.a();
                }
            } else if (!t0.i()) {
                break;
            }
        }
        if (t0.e() != 12) {
            throw new o0("Protocol message end-group tag did not match expected tag.");
        }
        if (sVarA != null) {
            if (yA2 != null) {
                j.getClass();
                a0 a0VarB = yA2.c.newBuilderForType().b();
                int size = sVarA.size();
                if (size == 0) {
                    bArr = m0.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVarA.a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                if (byteBufferWrap.hasArray()) {
                    h hVar = new h(byteBufferWrap);
                    Q0 q0 = Q0.c;
                    q0.getClass();
                    q0.a(a0VarB.getClass()).a(a0VarB, hVar, h);
                    n.c(yA2.d, a0VarB);
                    if (hVar.s() != Integer.MAX_VALUE) {
                        throw new o0("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
            } else {
                p1Var.getClass();
                o1Var.a((iC << 3) | 2, sVarA);
            }
        }
        return true;
    }

    public final boolean a(Object obj) {
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
