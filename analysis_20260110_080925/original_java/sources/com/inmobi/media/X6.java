package com.inmobi.media;

import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class X6 {
    public static int a(String str, JSONObject jSONObject) {
        return (str == null || !jSONObject.has(str)) ? jSONObject.getInt("default") : jSONObject.getInt(str);
    }
}
