package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import com.mbridge.msdk.foundation.cache.d;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CandidateController.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class b {
    private HashMap<String, d> a;

    /* compiled from: CandidateController.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    static class C0040b {
        static b a = new b();
    }

    public static b a() {
        return C0040b.a;
    }

    public d b(String str, JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        Exception e;
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
            } catch (Exception e2) {
                jSONArray2 = jSONArray;
                e = e2;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("c_cb", 0);
                jSONObject.put("t_disc", 0.95d);
                jSONObject.put("u_disc", 0.95d);
                jSONObject.put("max_ecppv_diff", 0);
                jSONObject.put("max_cache_num", 20);
                jSONObject.put("max_usage_limit", 10);
                jSONObject.put("time_interval", 7200);
                jSONArray2.put(jSONObject);
            } catch (Exception e3) {
                e = e3;
                Log.e("CandidateController", e.getMessage());
                jSONArray = jSONArray2;
                return a(str, jSONArray);
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.a = new HashMap<>();
    }

    public d a(String str, JSONArray jSONArray) {
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        d dVar = new d(str, jSONArray);
        this.a.put(str, dVar);
        return dVar;
    }
}
