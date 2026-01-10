package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class xv {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put("isVisible", Boolean.valueOf(xv.this.b == 0));
            put("isWindowVisible", Boolean.valueOf(xv.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    xv() {
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }

    void a(String str, int i, boolean z) {
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put("isShown", Boolean.valueOf(z));
        this.a.put("isViewVisible", Boolean.valueOf((this.a.get("isWindowVisible").booleanValue() || this.a.get("isVisible").booleanValue()) && this.a.get("isShown").booleanValue()));
    }
}
