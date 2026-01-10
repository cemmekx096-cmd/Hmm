package com.safedk.android.analytics.brandsafety;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class w {
    public String a;
    public String b;
    public int c;
    public int d;

    public w(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public String toString() {
        return "viewAddress:" + this.a + ", sdkPackage: " + this.b + ",width: " + this.c + ", height: " + this.d;
    }
}
