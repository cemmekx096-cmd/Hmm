package com.applovin.impl;

import com.applovin.impl.i4;
import com.applovin.impl.m0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class e6 extends w4 {
    protected e6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    protected abstract void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, m0.e eVar) throws JSONException {
        Map mapC = n0.c(((w4) this).a);
        if (((Boolean) ((w4) this).a.a(l4.g5)).booleanValue() || ((Boolean) ((w4) this).a.a(l4.Z4)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(((w4) this).a).b(n0.b(f(), ((w4) this).a)).a(n0.a(f(), ((w4) this).a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) ((w4) this).a.a(l4.p5)).booleanValue()).a(new JSONObject()).a(g()).a(i4.a.a(((Integer) ((w4) this).a.a(l4.Y4)).intValue())).a(), ((w4) this).a, eVar);
        aVar.c(l4.r0);
        aVar.b(l4.s0);
        ((w4) this).a.q0().a(aVar);
    }

    protected JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strE = ((w4) this).a.w0().e();
        if (((Boolean) ((w4) this).a.a(l4.r3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) ((w4) this).a.a(l4.t3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", ((w4) this).a.v());
        }
        if (((Boolean) ((w4) this).a.a(l4.v3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", ((w4) this).a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected abstract String f();

    protected abstract int g();

    class a extends z5 {
        final /* synthetic */ m0.e m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, m0.e eVar) {
            super(aVar, kVar);
            this.m = eVar;
        }

        public void a(String str, JSONObject jSONObject, int i) {
            this.m.a(str, jSONObject, i);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.m.a(str, i, str2, jSONObject);
        }
    }

    protected void a(int i) {
        n0.a(i, ((w4) this).a);
    }
}
