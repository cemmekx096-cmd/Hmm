package com.iab.omid.library.unity3d.internal;

import android.content.Context;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class f {
    private static f b = new f();
    private Context a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
