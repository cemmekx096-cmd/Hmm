package com.safedk.android.analytics.brandsafety;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class x {
    private String a;
    private String b;
    private String c;
    private String d;
    private v e;
    private c f;
    private boolean g = false;

    public x(String str, String str2, String str3, v vVar, c cVar) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = vVar;
        this.f = cVar;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public void e() {
        this.g = true;
    }

    public void a(v vVar) {
        this.e = vVar;
    }

    public v f() {
        return this.e;
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public c g() {
        return this.f;
    }

    public String toString() {
        return "WebviewNavigationTracker{ " + this.a + ", " + this.c + ", " + this.d + " }";
    }
}
