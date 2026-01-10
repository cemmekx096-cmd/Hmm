package com.applovin.impl;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class d7 implements d4 {
    private final List a;

    private d7(List list) {
        this.a = list;
    }

    public static d7 a(c8 c8Var, d7 d7Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List listB = d7Var != null ? d7Var.b() : new ArrayList();
            Iterator it = c8Var.a("Verification").iterator();
            while (it.hasNext()) {
                c7 c7VarA = c7.a((c8) it.next(), f7Var, kVar);
                if (c7VarA != null) {
                    listB.add(c7VarA);
                }
            }
            return new d7(listB);
        } catch (Throwable th) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.E().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d7) {
            return this.a.equals(((d7) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.a + "'}";
    }

    static d7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            c7 c7VarA = c7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (c7VarA != null) {
                arrayList.add(c7VarA);
            }
        }
        return new d7(arrayList);
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
