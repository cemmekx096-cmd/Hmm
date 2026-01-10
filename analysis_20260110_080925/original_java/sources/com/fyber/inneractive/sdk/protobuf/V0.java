package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class V0 {
    public static final Class a;
    public static final p1 b;
    public static final p1 c;
    public static final p1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = a(false);
        c = a(true);
        d = new p1();
    }

    public static Object a(int i, List list, Object obj, p1 p1Var) {
        return obj;
    }

    public static void a(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = B.b;
            i3++;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            c2.a.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void b(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                B b2 = c2.a;
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                b2.getClass();
                b2.a(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 8;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            B b3 = c2.a;
            double dDoubleValue2 = ((Double) list.get(i2)).doubleValue();
            b3.getClass();
            b3.c(Double.doubleToRawLongBits(dDoubleValue2));
            i2++;
        }
    }

    public static void c(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += B.a(((Integer) list.get(i3)).intValue());
        }
        c2.a.g(iA);
        while (i2 < list.size()) {
            c2.a.f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void d(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 4;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            c2.a.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void e(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 8;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            c2.a.c(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void f(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                B b2 = c2.a;
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                b2.getClass();
                b2.a(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 4;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            B b3 = c2.a;
            float fFloatValue2 = ((Float) list.get(i2)).floatValue();
            b3.getClass();
            b3.e(Float.floatToRawIntBits(fFloatValue2));
            i2++;
        }
    }

    public static void g(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iC += iIntValue >= 0 ? B.c(iIntValue) : 10;
        }
        c2.a.g(iC);
        while (i2 < list.size()) {
            c2.a.f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void h(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += B.a(((Long) list.get(i3)).longValue());
        }
        c2.a.g(iA);
        while (i2 < list.size()) {
            c2.a.d(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void i(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 4;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            c2.a.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void j(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = B.b;
            i3 += 8;
        }
        c2.a.g(i3);
        while (i2 < list.size()) {
            c2.a.c(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void k(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.d(i, B.d(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += B.c(B.d(((Integer) list.get(i3)).intValue()));
        }
        c2.a.g(iC);
        while (i2 < list.size()) {
            c2.a.g(B.d(((Integer) list.get(i2)).intValue()));
            i2++;
        }
    }

    public static void l(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.b(i, B.b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += B.a(B.b(((Long) list.get(i3)).longValue()));
        }
        c2.a.g(iA);
        while (i2 < list.size()) {
            c2.a.d(B.b(((Long) list.get(i2)).longValue()));
            i2++;
        }
    }

    public static void m(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += B.c(((Integer) list.get(i3)).intValue());
        }
        c2.a.g(iC);
        while (i2 < list.size()) {
            c2.a.g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void n(int i, List list, C c2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c2.getClass();
            while (i2 < list.size()) {
                c2.a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c2.a.c(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += B.a(((Long) list.get(i3)).longValue());
        }
        c2.a.g(iA);
        while (i2 < list.size()) {
            c2.a.d(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int d(List list) {
        int iC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            iC = 0;
            while (i < size) {
                b0Var.d(i);
                iC += B.c(B.d(b0Var.b[i]));
                i++;
            }
        } else {
            iC = 0;
            while (i < size) {
                iC += B.c(B.d(((Integer) list.get(i)).intValue()));
                i++;
            }
        }
        return iC;
    }

    public static int e(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v0) {
            v0 v0Var = (v0) list;
            iA = 0;
            while (i < size) {
                v0Var.c(i);
                iA += B.a(B.b(v0Var.b[i]));
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += B.a(B.b(((Long) list.get(i)).longValue()));
                i++;
            }
        }
        return iA;
    }

    public static int g(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v0) {
            v0 v0Var = (v0) list;
            iA = 0;
            while (i < size) {
                v0Var.c(i);
                iA += B.a(v0Var.b[i]);
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += B.a(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iA;
    }

    public static void a(int i, List list, C c2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2.a.a(i, (s) list.get(i2));
        }
    }

    public static void b(int i, List list, C c2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2.getClass();
        int i2 = 0;
        if (list instanceof r0) {
            r0 r0Var = (r0) list;
            while (i2 < list.size()) {
                Object objA = r0Var.a(i2);
                if (objA instanceof String) {
                    c2.a.a((String) objA, i);
                } else {
                    c2.a.a(i, (s) objA);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            c2.a.a((String) list.get(i2), i);
            i2++;
        }
    }

    public static int c(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v0) {
            v0 v0Var = (v0) list;
            iA = 0;
            while (i < size) {
                v0Var.c(i);
                iA += B.a(v0Var.b[i]);
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += B.a(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iA;
    }

    public static int f(List list) {
        int iC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            iC = 0;
            while (i < size) {
                b0Var.d(i);
                iC += B.c(b0Var.b[i]);
                i++;
            }
        } else {
            iC = 0;
            while (i < size) {
                iC += B.c(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iC;
    }

    public static void a(int i, List list, C c2, U0 u0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2.a(i, list.get(i2), u0);
        }
    }

    public static int a(List list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            iA = 0;
            while (i < size) {
                b0Var.d(i);
                iA += B.a(b0Var.b[i]);
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += B.a(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iA;
    }

    public static void b(int i, List list, C c2, U0 u0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2.a.a(i, (E0) list.get(i2), u0);
        }
    }

    public static int c(int i, List list) {
        int iA;
        int iA2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iB = B.b(i) * size;
        if (list instanceof r0) {
            r0 r0Var = (r0) list;
            while (i2 < size) {
                Object objA = r0Var.a(i2);
                if (objA instanceof s) {
                    iA2 = B.a((s) objA);
                } else {
                    iA2 = B.a((String) objA);
                }
                iB = iA2 + iB;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof s) {
                    iA = B.a((s) obj);
                } else {
                    iA = B.a((String) obj);
                }
                iB = iA + iB;
                i2++;
            }
        }
        return iB;
    }

    public static int b(List list) {
        int i;
        int iC;
        int iC2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.d(i2);
                int i3 = b0Var.b[i2];
                if (i3 >= 0) {
                    iC2 = B.c(i3);
                } else {
                    Logger logger = B.b;
                    iC2 = 10;
                }
                i += iC2;
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                if (iIntValue >= 0) {
                    iC = B.c(iIntValue);
                } else {
                    Logger logger2 = B.b;
                    iC = 10;
                }
                i += iC;
                i2++;
            }
        }
        return i;
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (B.b(i) + 4) * size;
    }

    public static p1 a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (p1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object a(int i, AbstractList abstractList, f0 f0Var, Object obj, p1 p1Var) {
        if (f0Var == null) {
            return obj;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (f0Var.a(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj = a(i, iIntValue, obj, p1Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (B.b(i) + 8) * size;
    }

    public static Object a(int i, int i2, Object obj, p1 p1Var) {
        if (obj == null) {
            p1Var.getClass();
            obj = new o1();
        }
        p1Var.getClass();
        ((o1) obj).a(i << 3, Long.valueOf(i2));
        return obj;
    }
}
