package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class m {
    public Long a = Long.valueOf(System.currentTimeMillis());
    public Long b = Long.valueOf(SystemClock.elapsedRealtime());
    public String c;
    public String d;
    public String e;
    public String f;
    public m g;

    public m(String str, String str2, String str3, String str4, m mVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = mVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + " }";
    }
}
