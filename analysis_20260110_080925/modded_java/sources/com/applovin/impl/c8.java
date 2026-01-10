package com.applovin.impl;

import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class c8 {
    public static final c8 f = new c8();
    private final c8 a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    public c8(String str, Map map, c8 c8Var) {
        this.a = c8Var;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }

    public Map a() {
        return this.c;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        for (c8 c8Var : this.e) {
            if (str.equalsIgnoreCase(c8Var.c())) {
                arrayList.add(c8Var);
            }
        }
        return arrayList;
    }

    public c8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            c8 c8Var = (c8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(c8Var.c())) {
                return c8Var;
            }
            arrayList.addAll(c8Var.b());
        }
        return null;
    }

    public c8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (c8 c8Var : this.e) {
            if (str.equalsIgnoreCase(c8Var.c())) {
                return c8Var;
            }
        }
        return null;
    }

    private c8() {
        this.a = null;
        this.b = BuildConfig.FLAVOR;
        this.c = Collections.emptyMap();
        this.d = BuildConfig.FLAVOR;
        this.e = Collections.emptyList();
    }
}
