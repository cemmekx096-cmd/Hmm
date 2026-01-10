package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Od {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put(String.valueOf(J9.a((I9) entry.getKey())), ((Nd) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            return new JSONObject();
        }
    }
}
