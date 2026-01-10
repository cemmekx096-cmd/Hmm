package com.applovin.impl;

import com.applovin.impl.m0;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class c6 extends e6 {
    protected c6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(b4 b4Var) throws JSONException {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", b4Var.b());
        Map mapA = b4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.e6
    protected int g() {
        return ((Integer) ((w4) this).a.a(l4.b1)).intValue();
    }

    protected abstract b4 h();

    protected abstract void i();

    public void run() throws JSONException {
        b4 b4VarH = h();
        if (b4VarH != null) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Reporting pending reward: " + b4VarH + "...");
            }
            a(a(b4VarH), new a());
        } else {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Pending reward not found");
            }
            i();
        }
    }

    class a implements m0.e {
        a() {
        }

        public void a(String str, JSONObject jSONObject, int i) {
            c6.this.b(jSONObject);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            c6.this.a(i);
        }
    }
}
