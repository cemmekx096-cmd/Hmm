package com.fyber.inneractive.sdk.protobuf;

import com.crashlytics.android.BuildConfig;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class J0 implements U0 {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final E0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final L0 l;
    public final u0 m;
    public final p1 n;
    public final J o;
    public final A0 p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new t1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public J0(int[] iArr, Object[] objArr, int i, int i2, E0 e0, boolean z, int[] iArr2, int i3, int i4, L0 l0, u0 u0Var, p1 p1Var, J j, A0 a0) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = e0 instanceof a0;
        this.h = z;
        this.f = j != null && (e0 instanceof GeneratedMessageLite$ExtendableMessage);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = l0;
        this.m = u0Var;
        this.n = p1Var;
        this.o = j;
        this.e = e0;
        this.p = a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.protobuf.J0 a(com.fyber.inneractive.sdk.protobuf.S0 r33, com.fyber.inneractive.sdk.protobuf.L0 r34, com.fyber.inneractive.sdk.protobuf.u0 r35, com.fyber.inneractive.sdk.protobuf.p1 r36, com.fyber.inneractive.sdk.protobuf.J r37, com.fyber.inneractive.sdk.protobuf.A0 r38) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.a(com.fyber.inneractive.sdk.protobuf.S0, com.fyber.inneractive.sdk.protobuf.L0, com.fyber.inneractive.sdk.protobuf.u0, com.fyber.inneractive.sdk.protobuf.p1, com.fyber.inneractive.sdk.protobuf.J, com.fyber.inneractive.sdk.protobuf.A0):com.fyber.inneractive.sdk.protobuf.J0");
    }

    public static long d(int i) {
        return i & 1048575;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final U0 c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        U0 u0 = (U0) objArr[i2];
        if (u0 != null) {
            return u0;
        }
        U0 u0A = Q0.c.a((Class) objArr[i2 + 1]);
        this.b[i2] = u0A;
        return u0A;
    }

    public final void e(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (a(obj2, i3, i)) {
            Object objE = a(obj, i3, i) ? y1.e(obj, j) : null;
            Object objE2 = y1.e(obj2, j);
            if (objE != null && objE2 != null) {
                y1.a(j, obj, m0.a(objE, objE2));
                b(obj, i3, i);
            } else if (objE2 != null) {
                y1.a(j, obj, objE2);
                b(obj, i3, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0228 A[PHI: r2
      0x0228: PHI (r2v30 int) = (r2v10 int), (r2v31 int) binds: [B:81:0x0225, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.d(java.lang.Object):int");
    }

    public final void c(Object obj) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long j = this.a[this.i[i2] + 1] & 1048575;
            Object objE = y1.e(obj, j);
            if (objE != null) {
                this.p.getClass();
                ((z0) objE).a = false;
                y1.a(j, obj, objE);
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.a(obj, this.i[i]);
            i++;
        }
        this.n.getClass();
        ((a0) obj).unknownFields.e = false;
        if (this.f) {
            this.o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        Object objE = y1.e(obj, j);
        if (objE != null) {
            this.p.getClass();
            if (!((z0) objE).a) {
                this.p.getClass();
                z0 z0Var = z0.b;
                z0 z0Var2 = z0Var.isEmpty() ? new z0() : new z0(z0Var);
                this.p.getClass();
                A0.a(z0Var2, objE);
                y1.a(j, obj, z0Var2);
                objE = z0Var2;
            }
        } else {
            this.p.getClass();
            z0 z0Var3 = z0.b;
            objE = z0Var3.isEmpty() ? new z0() : new z0(z0Var3);
            y1.a(j, obj, objE);
        }
        this.p.getClass();
        this.p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0634 A[PHI: r6
      0x0634: PHI (r6v70 int) = (r6v8 int), (r6v72 int) binds: [B:236:0x062d, B:59:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0ca8 A[PHI: r4
      0x0ca8: PHI (r4v68 int) = (r4v5 int), (r4v70 int) binds: [B:487:0x0ca1, B:311:0x080b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.b(java.lang.Object):int");
    }

    public final void d(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        if (a(i, obj2)) {
            Object objE = y1.e(obj, j);
            Object objE2 = y1.e(obj2, j);
            if (objE != null && objE2 != null) {
                y1.a(j, obj, m0.a(objE, objE2));
                b(i, obj);
            } else if (objE2 != null) {
                y1.a(j, obj, objE2);
                b(i, obj);
            }
        }
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public final Object a() {
        L0 l0 = this.l;
        a0 a0Var = this.e;
        l0.getClass();
        return a0Var.dynamicMethod(Z.NEW_MUTABLE_INSTANCE);
    }

    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x1 x1Var = y1.c;
                            x1Var.a(obj, j, x1Var.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 1:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x1 x1Var2 = y1.c;
                            x1Var2.a(obj, j, x1Var2.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 2:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 3:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 4:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 5:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 6:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 7:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x1 x1Var3 = y1.c;
                            x1Var3.a(obj, j, x1Var3.a(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 8:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(j, obj, y1.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 9:
                        d(i, obj, obj2);
                        break;
                    case 10:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(j, obj, y1.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 11:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 12:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 13:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 14:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 15:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 16:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            y1.a(obj, j, y1.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 17:
                        d(i, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.m.a(j, obj, obj2);
                        break;
                    case 50:
                        A0 a0 = this.p;
                        Class cls = V0.a;
                        Object objE = y1.e(obj, j);
                        Object objE2 = y1.e(obj2, j);
                        a0.getClass();
                        y1.a(j, obj, A0.a(objE, objE2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            y1.a(j, obj, y1.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 60:
                        e(i, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            y1.a(j, obj, y1.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 68:
                        e(i, obj, obj2);
                        break;
                }
                i += 3;
            } else {
                p1 p1Var = this.n;
                Class cls2 = V0.a;
                p1Var.getClass();
                a0 a0Var = (a0) obj;
                o1 o1VarA = a0Var.unknownFields;
                o1 o1Var = ((a0) obj2).unknownFields;
                if (!o1Var.equals(o1.f)) {
                    o1VarA = o1.a(o1VarA, o1Var);
                }
                a0Var.unknownFields = o1VarA;
                if (this.f) {
                    this.o.getClass();
                    N n = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n.a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r20, com.fyber.inneractive.sdk.protobuf.C r21) {
        /*
            Method dump skipped, instructions count: 3234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.C):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r12, com.fyber.inneractive.sdk.protobuf.C r13) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.C):void");
    }

    public final void a(Object obj, T0 t0, H h) {
        h.getClass();
        a(this.n, this.o, obj, t0, h);
    }

    public final void a(p1 p1Var, J j, Object obj, T0 t0, H h) {
        Y yA;
        Object objA;
        Object objB = null;
        N nEnsureExtensionsAreMutable = null;
        while (true) {
            try {
                int iS = t0.s();
                int iA = (iS < this.c || iS > this.d) ? -1 : a(iS, 0);
                if (iA < 0) {
                    if (iS == Integer.MAX_VALUE) {
                        if (objB != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f) {
                        E0 e0 = this.e;
                        j.getClass();
                        yA = h.a(iS, e0);
                    } else {
                        yA = null;
                    }
                    if (yA != null) {
                        if (nEnsureExtensionsAreMutable == null) {
                            j.getClass();
                            nEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
                        }
                        j.getClass();
                        objA = J.a(t0, yA, h, nEnsureExtensionsAreMutable, objB, p1Var);
                        objB = objA;
                    } else {
                        p1Var.getClass();
                        if (objB == null) {
                            a0 a0Var = (a0) obj;
                            o1 o1Var = a0Var.unknownFields;
                            if (o1Var == o1.f) {
                                o1Var = new o1();
                                a0Var.unknownFields = o1Var;
                            }
                            objB = o1Var;
                        }
                        if (!p1.a(objB, t0)) {
                            for (int i = this.j; i < this.k; i++) {
                                objB = b(this.i[i], obj, objB);
                            }
                            if (objB != null) {
                                p1.a(obj, objB);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int i2 = this.a[iA + 1];
                    switch ((267386880 & i2) >>> 20) {
                        case 0:
                            y1.c.a(obj, d(i2), t0.h());
                            b(iA, obj);
                            break;
                        case 1:
                            y1.c.a(obj, d(i2), t0.k());
                            b(iA, obj);
                            break;
                        case 2:
                            y1.a(obj, d(i2), t0.o());
                            b(iA, obj);
                            break;
                        case 3:
                            y1.a(obj, d(i2), t0.f());
                            b(iA, obj);
                            break;
                        case 4:
                            y1.a(obj, d(i2), t0.d());
                            b(iA, obj);
                            break;
                        case 5:
                            y1.a(obj, d(i2), t0.g());
                            b(iA, obj);
                            break;
                        case 6:
                            y1.a(obj, d(i2), t0.q());
                            b(iA, obj);
                            break;
                        case 7:
                            y1.c.a(obj, d(i2), t0.r());
                            b(iA, obj);
                            break;
                        case 8:
                            if ((i2 & 536870912) != 0) {
                                y1.a(i2 & 1048575, obj, t0.p());
                            } else if (this.g) {
                                y1.a(i2 & 1048575, obj, t0.n());
                            } else {
                                y1.a(i2 & 1048575, obj, t0.a());
                            }
                            b(iA, obj);
                            break;
                        case 9:
                            if (a(iA, obj)) {
                                y1.a(d(i2), obj, m0.a(y1.e(obj, d(i2)), t0.b(c(iA), h)));
                                break;
                            } else {
                                y1.a(d(i2), obj, t0.b(c(iA), h));
                                b(iA, obj);
                                break;
                            }
                        case 10:
                            y1.a(d(i2), obj, t0.a());
                            b(iA, obj);
                            break;
                        case 11:
                            y1.a(obj, d(i2), t0.c());
                            b(iA, obj);
                            break;
                        case 12:
                            int iB = t0.b();
                            a(iA);
                            y1.a(obj, d(i2), iB);
                            b(iA, obj);
                            break;
                        case 13:
                            y1.a(obj, d(i2), t0.m());
                            b(iA, obj);
                            break;
                        case 14:
                            y1.a(obj, d(i2), t0.t());
                            b(iA, obj);
                            break;
                        case 15:
                            y1.a(obj, d(i2), t0.j());
                            b(iA, obj);
                            break;
                        case 16:
                            y1.a(obj, d(i2), t0.l());
                            b(iA, obj);
                            break;
                        case 17:
                            if (a(iA, obj)) {
                                y1.a(d(i2), obj, m0.a(y1.e(obj, d(i2)), t0.a(c(iA), h)));
                                break;
                            } else {
                                y1.a(d(i2), obj, t0.a(c(iA), h));
                                b(iA, obj);
                                break;
                            }
                        case 18:
                            t0.j(this.m.b(obj, d(i2)));
                            break;
                        case 19:
                            t0.d(this.m.b(obj, d(i2)));
                            break;
                        case 20:
                            t0.k(this.m.b(obj, d(i2)));
                            break;
                        case 21:
                            t0.a(this.m.b(obj, d(i2)));
                            break;
                        case 22:
                            t0.o(this.m.b(obj, d(i2)));
                            break;
                        case 23:
                            t0.n(this.m.b(obj, d(i2)));
                            break;
                        case 24:
                            t0.e(this.m.b(obj, d(i2)));
                            break;
                        case 25:
                            t0.l(this.m.b(obj, d(i2)));
                            break;
                        case 26:
                            a(obj, i2, t0);
                            break;
                        case 27:
                            a(obj, i2, t0, c(iA), h);
                            break;
                        case 28:
                            t0.h(this.m.b(obj, d(i2)));
                            break;
                        case 29:
                            t0.i(this.m.b(obj, d(i2)));
                            break;
                        case 30:
                            List listB = this.m.b(obj, d(i2));
                            t0.p(listB);
                            a(iA);
                            objA = V0.a(iS, listB, objB, p1Var);
                            objB = objA;
                            break;
                        case 31:
                            t0.f(this.m.b(obj, d(i2)));
                            break;
                        case 32:
                            t0.m(this.m.b(obj, d(i2)));
                            break;
                        case 33:
                            t0.c(this.m.b(obj, d(i2)));
                            break;
                        case 34:
                            t0.g(this.m.b(obj, d(i2)));
                            break;
                        case 35:
                            t0.j(this.m.b(obj, d(i2)));
                            break;
                        case 36:
                            t0.d(this.m.b(obj, d(i2)));
                            break;
                        case 37:
                            t0.k(this.m.b(obj, d(i2)));
                            break;
                        case 38:
                            t0.a(this.m.b(obj, d(i2)));
                            break;
                        case 39:
                            t0.o(this.m.b(obj, d(i2)));
                            break;
                        case 40:
                            t0.n(this.m.b(obj, d(i2)));
                            break;
                        case 41:
                            t0.e(this.m.b(obj, d(i2)));
                            break;
                        case 42:
                            t0.l(this.m.b(obj, d(i2)));
                            break;
                        case 43:
                            t0.i(this.m.b(obj, d(i2)));
                            break;
                        case 44:
                            List listB2 = this.m.b(obj, d(i2));
                            t0.p(listB2);
                            a(iA);
                            objA = V0.a(iS, listB2, objB, p1Var);
                            objB = objA;
                            break;
                        case 45:
                            t0.f(this.m.b(obj, d(i2)));
                            break;
                        case 46:
                            t0.m(this.m.b(obj, d(i2)));
                            break;
                        case 47:
                            t0.c(this.m.b(obj, d(i2)));
                            break;
                        case 48:
                            t0.g(this.m.b(obj, d(i2)));
                            break;
                        case 49:
                            a(obj, d(i2), t0, c(iA), h);
                            break;
                        case 50:
                            c(iA, obj, b(iA));
                            throw null;
                            break;
                        case 51:
                            y1.a(d(i2), obj, Double.valueOf(t0.h()));
                            b(obj, iS, iA);
                            break;
                        case 52:
                            y1.a(d(i2), obj, Float.valueOf(t0.k()));
                            b(obj, iS, iA);
                            break;
                        case 53:
                            y1.a(d(i2), obj, Long.valueOf(t0.o()));
                            b(obj, iS, iA);
                            break;
                        case 54:
                            y1.a(d(i2), obj, Long.valueOf(t0.f()));
                            b(obj, iS, iA);
                            break;
                        case 55:
                            y1.a(d(i2), obj, Integer.valueOf(t0.d()));
                            b(obj, iS, iA);
                            break;
                        case 56:
                            y1.a(d(i2), obj, Long.valueOf(t0.g()));
                            b(obj, iS, iA);
                            break;
                        case 57:
                            y1.a(d(i2), obj, Integer.valueOf(t0.q()));
                            b(obj, iS, iA);
                            break;
                        case 58:
                            y1.a(d(i2), obj, Boolean.valueOf(t0.r()));
                            b(obj, iS, iA);
                            break;
                        case 59:
                            if ((i2 & 536870912) != 0) {
                                y1.a(i2 & 1048575, obj, t0.p());
                            } else if (this.g) {
                                y1.a(i2 & 1048575, obj, t0.n());
                            } else {
                                y1.a(i2 & 1048575, obj, t0.a());
                            }
                            b(obj, iS, iA);
                            break;
                        case 60:
                            if (a(obj, iS, iA)) {
                                y1.a(d(i2), obj, m0.a(y1.e(obj, d(i2)), t0.b(c(iA), h)));
                            } else {
                                y1.a(d(i2), obj, t0.b(c(iA), h));
                                b(iA, obj);
                            }
                            b(obj, iS, iA);
                            break;
                        case 61:
                            y1.a(d(i2), obj, t0.a());
                            b(obj, iS, iA);
                            break;
                        case 62:
                            y1.a(d(i2), obj, Integer.valueOf(t0.c()));
                            b(obj, iS, iA);
                            break;
                        case 63:
                            int iB2 = t0.b();
                            a(iA);
                            y1.a(d(i2), obj, Integer.valueOf(iB2));
                            b(obj, iS, iA);
                            break;
                        case 64:
                            y1.a(d(i2), obj, Integer.valueOf(t0.m()));
                            b(obj, iS, iA);
                            break;
                        case 65:
                            y1.a(d(i2), obj, Long.valueOf(t0.t()));
                            b(obj, iS, iA);
                            break;
                        case 66:
                            y1.a(d(i2), obj, Integer.valueOf(t0.j()));
                            b(obj, iS, iA);
                            break;
                        case 67:
                            y1.a(d(i2), obj, Long.valueOf(t0.l()));
                            b(obj, iS, iA);
                            break;
                        case 68:
                            y1.a(d(i2), obj, t0.a(c(iA), h));
                            b(obj, iS, iA);
                            break;
                        default:
                            if (objB == null) {
                                try {
                                    p1Var.getClass();
                                    objB = new o1();
                                } catch (n0 unused) {
                                    p1Var.getClass();
                                    if (objB == null) {
                                        a0 a0Var2 = (a0) obj;
                                        o1 o1Var2 = a0Var2.unknownFields;
                                        if (o1Var2 == o1.f) {
                                            o1Var2 = new o1();
                                            a0Var2.unknownFields = o1Var2;
                                        }
                                        objB = o1Var2;
                                    }
                                    if (!p1.a(objB, t0)) {
                                        for (int i3 = this.j; i3 < this.k; i3++) {
                                            objB = b(this.i[i3], obj, objB);
                                        }
                                        if (objB != null) {
                                            p1.a(obj, objB);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            p1Var.getClass();
                            if (!p1.a(objB, t0)) {
                                for (int i4 = this.j; i4 < this.k; i4++) {
                                    objB = b(this.i[i4], obj, objB);
                                }
                                if (objB != null) {
                                    p1.a(obj, objB);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
            } finally {
                for (int i5 = this.j; i5 < this.k; i5++) {
                    objB = b(this.i[i5], obj, objB);
                }
                if (objB != null) {
                    p1Var.getClass();
                    p1.a(obj, objB);
                }
            }
        }
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Object b(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (y1.e(obj, r0[i + 1] & 1048575) == null) {
            return obj2;
        }
        a(i);
        return obj2;
    }

    public final void b(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        y1.a(obj, j, (1 << (i2 >>> 20)) | y1.c(obj, j));
    }

    public final void b(Object obj, int i, int i2) {
        y1.a(obj, this.a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, f fVar) throws o0 {
        int iD;
        int i7;
        int iA = i;
        Unsafe unsafe = r;
        l0 l0VarB = (l0) unsafe.getObject(obj, j2);
        if (!((c) l0VarB).a) {
            int size = l0VarB.size();
            l0VarB = l0VarB.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, l0VarB);
        }
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    D d = (D) l0VarB;
                    int iD2 = g.d(bArr, iA, fVar);
                    int i8 = fVar.a + iD2;
                    while (iD2 < i8) {
                        d.a(Double.longBitsToDouble(g.b(iD2, bArr)));
                        iD2 += 8;
                    }
                    if (iD2 == i8) {
                        return iD2;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    D d2 = (D) l0VarB;
                    d2.a(Double.longBitsToDouble(g.b(iA, bArr)));
                    while (true) {
                        int i9 = iA + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iA = i9 + 1;
                        byte b = bArr[i9];
                        if (b >= 0) {
                            fVar.a = b;
                        } else {
                            iA = g.a(b, bArr, iA, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i9;
                        }
                        d2.a(Double.longBitsToDouble(g.b(iA, bArr)));
                    }
                }
                return iA;
            case 19:
            case 36:
                if (i4 == 2) {
                    Q q2 = (Q) l0VarB;
                    int iD3 = g.d(bArr, iA, fVar);
                    int i10 = fVar.a + iD3;
                    while (iD3 < i10) {
                        q2.a(Float.intBitsToFloat(g.a(iD3, bArr)));
                        iD3 += 4;
                    }
                    if (iD3 == i10) {
                        return iD3;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    Q q3 = (Q) l0VarB;
                    q3.a(Float.intBitsToFloat(g.a(iA, bArr)));
                    while (true) {
                        int i11 = iA + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iA = i11 + 1;
                        byte b2 = bArr[i11];
                        if (b2 >= 0) {
                            fVar.a = b2;
                        } else {
                            iA = g.a(b2, bArr, iA, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i11;
                        }
                        q3.a(Float.intBitsToFloat(g.a(iA, bArr)));
                    }
                }
                return iA;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    v0 v0Var = (v0) l0VarB;
                    int iD4 = g.d(bArr, iA, fVar);
                    int i12 = fVar.a + iD4;
                    while (iD4 < i12) {
                        iD4 = g.e(bArr, iD4, fVar);
                        v0Var.a(fVar.b);
                    }
                    if (iD4 == i12) {
                        return iD4;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    v0 v0Var2 = (v0) l0VarB;
                    int iE = g.e(bArr, iA, fVar);
                    v0Var2.a(fVar.b);
                    while (iE < i2) {
                        int iA2 = iE + 1;
                        byte b3 = bArr[iE];
                        if (b3 >= 0) {
                            fVar.a = b3;
                        } else {
                            iA2 = g.a(b3, bArr, iA2, fVar);
                        }
                        if (i3 != fVar.a) {
                            return iE;
                        }
                        iE = g.e(bArr, iA2, fVar);
                        v0Var2.a(fVar.b);
                    }
                    return iE;
                }
                return iA;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return g.a(bArr, iA, l0VarB, fVar);
                }
                if (i4 == 0) {
                    return g.c(i3, bArr, i, i2, l0VarB, fVar);
                }
                return iA;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    v0 v0Var3 = (v0) l0VarB;
                    int iD5 = g.d(bArr, iA, fVar);
                    int i13 = fVar.a + iD5;
                    while (iD5 < i13) {
                        v0Var3.a(g.b(iD5, bArr));
                        iD5 += 8;
                    }
                    if (iD5 == i13) {
                        return iD5;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    v0 v0Var4 = (v0) l0VarB;
                    v0Var4.a(g.b(iA, bArr));
                    while (true) {
                        int i14 = iA + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iA = i14 + 1;
                        byte b4 = bArr[i14];
                        if (b4 >= 0) {
                            fVar.a = b4;
                        } else {
                            iA = g.a(b4, bArr, iA, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i14;
                        }
                        v0Var4.a(g.b(iA, bArr));
                    }
                }
                return iA;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    b0 b0Var = (b0) l0VarB;
                    int iD6 = g.d(bArr, iA, fVar);
                    int i15 = fVar.a + iD6;
                    while (iD6 < i15) {
                        b0Var.c(g.a(iD6, bArr));
                        iD6 += 4;
                    }
                    if (iD6 == i15) {
                        return iD6;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    b0 b0Var2 = (b0) l0VarB;
                    b0Var2.c(g.a(iA, bArr));
                    while (true) {
                        int i16 = iA + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iA = i16 + 1;
                        byte b5 = bArr[i16];
                        if (b5 >= 0) {
                            fVar.a = b5;
                        } else {
                            iA = g.a(b5, bArr, iA, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i16;
                        }
                        b0Var2.c(g.a(iA, bArr));
                    }
                }
                return iA;
            case 25:
            case 42:
                if (i4 == 2) {
                    j jVar = (j) l0VarB;
                    iD = g.d(bArr, iA, fVar);
                    int i17 = fVar.a + iD;
                    while (iD < i17) {
                        iD = g.e(bArr, iD, fVar);
                        jVar.a(fVar.b != 0);
                    }
                    if (iD != i17) {
                        throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return iD;
                }
                if (i4 == 0) {
                    j jVar2 = (j) l0VarB;
                    iA = g.e(bArr, iA, fVar);
                    jVar2.a(fVar.b != 0);
                    while (iA < i2) {
                        int iA3 = iA + 1;
                        byte b6 = bArr[iA];
                        if (b6 >= 0) {
                            fVar.a = b6;
                        } else {
                            iA3 = g.a(b6, bArr, iA3, fVar);
                        }
                        if (i3 == fVar.a) {
                            iA = g.e(bArr, iA3, fVar);
                            jVar2.a(fVar.b != 0);
                        }
                    }
                }
                return iA;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        return g.a(i3, bArr, i, i2, l0VarB, fVar);
                    }
                    return g.b(i3, bArr, i, i2, l0VarB, fVar);
                }
                return iA;
            case 27:
                if (i4 == 2) {
                    U0 u0C = c(i5);
                    iA = g.a(u0C, bArr, iA, i2, fVar);
                    l0VarB.add(fVar.c);
                    while (iA < i2) {
                        int iA4 = iA + 1;
                        byte b7 = bArr[iA];
                        if (b7 >= 0) {
                            fVar.a = b7;
                        } else {
                            iA4 = g.a(b7, bArr, iA4, fVar);
                        }
                        if (i3 == fVar.a) {
                            iA = g.a(u0C, bArr, iA4, i2, fVar);
                            l0VarB.add(fVar.c);
                        }
                    }
                }
                return iA;
            case 28:
                if (i4 == 2) {
                    int iD7 = g.d(bArr, iA, fVar);
                    int i18 = fVar.a;
                    if (i18 >= 0) {
                        if (i18 > bArr.length - iD7) {
                            throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i18 == 0) {
                            l0VarB.add(s.b);
                            i7 = iD7;
                        } else {
                            i7 = iD7 + i18;
                            s.a(iD7, i7, bArr.length);
                            l0VarB.add(new q(s.c.a(bArr, iD7, i18)));
                        }
                        while (i7 < i2) {
                            int iA5 = i7 + 1;
                            byte b8 = bArr[i7];
                            if (b8 >= 0) {
                                fVar.a = b8;
                            } else {
                                iA5 = g.a(b8, bArr, iA5, fVar);
                            }
                            if (i3 != fVar.a) {
                                return i7;
                            }
                            int iA6 = iA5 + 1;
                            byte b9 = bArr[iA5];
                            if (b9 >= 0) {
                                fVar.a = b9;
                            } else {
                                iA6 = g.a(b9, bArr, iA6, fVar);
                            }
                            int i19 = fVar.a;
                            if (i19 >= 0) {
                                if (i19 > bArr.length - iA6) {
                                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i19 == 0) {
                                    l0VarB.add(s.b);
                                    i7 = iA6;
                                } else {
                                    i7 = iA6 + i19;
                                    s.a(iA6, i7, bArr.length);
                                    l0VarB.add(new q(s.c.a(bArr, iA6, i19)));
                                }
                            } else {
                                throw new o0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return i7;
                    }
                    throw new o0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return iA;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        iD = g.c(i3, bArr, i, i2, l0VarB, fVar);
                    }
                    return iA;
                }
                iD = g.a(bArr, iA, l0VarB, fVar);
                a0 a0Var = (a0) obj;
                o1 o1Var = a0Var.unknownFields;
                if (o1Var == o1.f) {
                    o1Var = null;
                }
                a(i5);
                Class cls = V0.a;
                if (o1Var != null) {
                    a0Var.unknownFields = o1Var;
                }
                return iD;
            case 33:
            case 47:
                if (i4 == 2) {
                    b0 b0Var3 = (b0) l0VarB;
                    int iD8 = g.d(bArr, iA, fVar);
                    int i20 = fVar.a + iD8;
                    while (iD8 < i20) {
                        int i21 = iD8 + 1;
                        byte b10 = bArr[iD8];
                        if (b10 >= 0) {
                            fVar.a = b10;
                            iD8 = i21;
                        } else {
                            iD8 = g.a(b10, bArr, i21, fVar);
                        }
                        b0Var3.c(w.b(fVar.a));
                    }
                    if (iD8 == i20) {
                        return iD8;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    b0 b0Var4 = (b0) l0VarB;
                    int iD9 = g.d(bArr, iA, fVar);
                    b0Var4.c(w.b(fVar.a));
                    while (iD9 < i2) {
                        int iA7 = iD9 + 1;
                        byte b11 = bArr[iD9];
                        if (b11 >= 0) {
                            fVar.a = b11;
                        } else {
                            iA7 = g.a(b11, bArr, iA7, fVar);
                        }
                        if (i3 != fVar.a) {
                            return iD9;
                        }
                        iD9 = iA7 + 1;
                        byte b12 = bArr[iA7];
                        if (b12 >= 0) {
                            fVar.a = b12;
                        } else {
                            iD9 = g.a(b12, bArr, iD9, fVar);
                        }
                        b0Var4.c(w.b(fVar.a));
                    }
                    return iD9;
                }
                return iA;
            case 34:
            case 48:
                if (i4 == 2) {
                    v0 v0Var5 = (v0) l0VarB;
                    int iD10 = g.d(bArr, iA, fVar);
                    int i22 = fVar.a + iD10;
                    while (iD10 < i22) {
                        iD10 = g.e(bArr, iD10, fVar);
                        v0Var5.a(w.a(fVar.b));
                    }
                    if (iD10 == i22) {
                        return iD10;
                    }
                    throw new o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    v0 v0Var6 = (v0) l0VarB;
                    int iE2 = g.e(bArr, iA, fVar);
                    v0Var6.a(w.a(fVar.b));
                    while (iE2 < i2) {
                        int iA8 = iE2 + 1;
                        byte b13 = bArr[iE2];
                        if (b13 >= 0) {
                            fVar.a = b13;
                        } else {
                            iA8 = g.a(b13, bArr, iA8, fVar);
                        }
                        if (i3 != fVar.a) {
                            return iE2;
                        }
                        iE2 = g.e(bArr, iA8, fVar);
                        v0Var6.a(w.a(fVar.b));
                    }
                    return iE2;
                }
                return iA;
            case 49:
                if (i4 == 3) {
                    U0 u0C2 = c(i5);
                    int i23 = (i3 & (-8)) | 4;
                    iA = g.a(u0C2, bArr, i, i2, i23, fVar);
                    l0VarB.add(fVar.c);
                    while (iA < i2) {
                        int iD11 = g.d(bArr, iA, fVar);
                        if (i3 == fVar.a) {
                            iA = g.a(u0C2, bArr, iD11, i2, i23, fVar);
                            l0VarB.add(fVar.c);
                        }
                    }
                }
                return iA;
            default:
                return iA;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, f fVar) throws o0 {
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(g.b(i, bArr))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(g.a(i, bArr))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iE = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Long.valueOf(fVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return iE;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iD = g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, Integer.valueOf(fVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return iD;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(g.b(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(g.a(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iE2 = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(fVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iE2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int iD2 = g.d(bArr, i, fVar);
                    int i13 = fVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, BuildConfig.FLAVOR);
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (!E1.a.b(bArr, iD2, iD2 + i13)) {
                                throw new o0("Protocol message had invalid UTF-8.");
                            }
                        }
                        unsafe.putObject(obj, j, new String(bArr, iD2, i13, m0.a));
                        iD2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iD2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int iA = g.a(c(i8), bArr, i, i2, fVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, m0.a(object, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iA;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iA2 = g.a(bArr, i, fVar);
                    unsafe.putObject(obj, j, fVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return iA2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iD3 = g.d(bArr, i, fVar);
                    int i14 = fVar.a;
                    a(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return iD3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int iD4 = g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, Integer.valueOf(w.b(fVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return iD4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int iE3 = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Long.valueOf(w.a(fVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return iE3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int iA3 = g.a(c(i8), bArr, i, i2, (i3 & (-8)) | 4, fVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, m0.a(object2, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iA3;
                }
                break;
        }
        return i;
    }

    public final void a(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x08a0, code lost:
    
        if (r5 == 1048575) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x08a2, code lost:
    
        r29.putInt(r13, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x08a8, code lost:
    
        r1 = r8.j;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x08ae, code lost:
    
        if (r1 >= r8.k) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x08b0, code lost:
    
        r2 = (com.fyber.inneractive.sdk.protobuf.o1) r8.b(r8.i[r1], r13, r2);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x08bd, code lost:
    
        if (r2 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x08bf, code lost:
    
        r8.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.a0) r13).unknownFields = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x08cb, code lost:
    
        if (r9 != 0) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x08cd, code lost:
    
        if (r0 != r6) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x08d5, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.o0("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x08d6, code lost:
    
        if (r0 > r6) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x08d8, code lost:
    
        if (r3 != r9) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x08da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x08e0, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.o0("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.fyber.inneractive.sdk.protobuf.f r38) throws com.fyber.inneractive.sdk.protobuf.o0 {
        /*
            Method dump skipped, instructions count: 2386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.f):int");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.protobuf.o0 */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02fc, code lost:
    
        if (r0 != r20) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0393, code lost:
    
        if (r0 != r14) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0395, code lost:
    
        r14 = r30;
        r13 = r32;
        r11 = r34;
        r12 = r35;
        r2 = r17;
        r8 = r18;
        r9 = r19;
        r1 = r24;
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03aa, code lost:
    
        r2 = r0;
        r9 = r17;
        r6 = r28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x009f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r31, byte[] r32, int r33, int r34, com.fyber.inneractive.sdk.protobuf.f r35) throws com.fyber.inneractive.sdk.protobuf.o0 {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.J0.a(java.lang.Object):boolean");
    }

    public static void a(int i, Object obj, C c) {
        if (obj instanceof String) {
            c.a.a((String) obj, i);
        } else {
            c.a.a(i, (s) obj);
        }
    }

    public final void a(Object obj, int i, T0 t0) {
        if ((536870912 & i) != 0) {
            t0.b(this.m.b(obj, i & 1048575));
        } else {
            t0.q(this.m.b(obj, i & 1048575));
        }
    }

    public final void a(Object obj, int i, T0 t0, U0 u0, H h) {
        t0.b(this.m.b(obj, i & 1048575), u0, h);
    }

    public final void a(Object obj, long j, T0 t0, U0 u0, H h) {
        t0.a(this.m.b(obj, j), u0, h);
    }

    public final boolean a(int i, Object obj) {
        int[] iArr = this.a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & y1.c(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return y1.c.c(obj, j2) != 0.0d;
            case 1:
                return y1.c.d(obj, j2) != 0.0f;
            case 2:
                return y1.d(obj, j2) != 0;
            case 3:
                return y1.d(obj, j2) != 0;
            case 4:
                return y1.c(obj, j2) != 0;
            case 5:
                return y1.d(obj, j2) != 0;
            case 6:
                return y1.c(obj, j2) != 0;
            case 7:
                return y1.c.a(obj, j2);
            case 8:
                Object objE = y1.e(obj, j2);
                if (objE instanceof String) {
                    return !((String) objE).isEmpty();
                }
                if (objE instanceof s) {
                    return !s.b.equals(objE);
                }
                throw new IllegalArgumentException();
            case 9:
                return y1.e(obj, j2) != null;
            case 10:
                return !s.b.equals(y1.e(obj, j2));
            case 11:
                return y1.c(obj, j2) != 0;
            case 12:
                return y1.c(obj, j2) != 0;
            case 13:
                return y1.c(obj, j2) != 0;
            case 14:
                return y1.d(obj, j2) != 0;
            case 15:
                return y1.c(obj, j2) != 0;
            case 16:
                return y1.d(obj, j2) != 0;
            case 17:
                return y1.e(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i, int i2) {
        return y1.c(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean a(int i, Object obj, Object obj2) {
        return a(i, obj) == a(i, obj2);
    }

    public final int a(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
