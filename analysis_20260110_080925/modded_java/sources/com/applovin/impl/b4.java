package com.applovin.impl;

import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class b4 {
    private final String a;
    private Map b;

    private b4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static b4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.b + "'}";
    }

    public static b4 a(String str, Map map) {
        return new b4(str, map);
    }

    public Map a() {
        return this.b;
    }
}
