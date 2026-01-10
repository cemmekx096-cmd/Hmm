package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class c0 {
    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj != null) {
            try {
                if (obj instanceof b0) {
                    jSONObject.putOpt(str, ((b0) obj).a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
