package com.iab.omid.library.inmobi.internal;

import android.content.Context;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class g {
    private static g b = new g();
    private Context a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
