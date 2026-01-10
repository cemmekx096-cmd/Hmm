package com.applovin.impl;

import android.os.Looper;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class g1 {
    private static final Thread a = Looper.getMainLooper().getThread();

    public static void a(Throwable th) {
    }

    public static void a(Throwable th, String str, Object... objArr) {
    }

    public static boolean a(boolean z) {
        return a(z, "Assertion failed", new Object[0]);
    }

    public static boolean a(boolean z, String str, Object... objArr) {
        if (!z) {
            a(str, objArr);
        }
        return z;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
