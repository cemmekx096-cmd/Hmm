package com.applovin.impl;

import android.content.Context;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class c4 {
    private final String a;
    private final String b;
    private final boolean c;

    c4(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", BuildConfig.FLAVOR);
        this.b = str2;
        this.c = k0.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }
}
