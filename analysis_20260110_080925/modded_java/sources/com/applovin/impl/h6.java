package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class h6 extends i6 {
    private final t2 g;

    public h6(t2 t2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.g = t2Var;
    }

    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        JsonUtils.putString(jSONObject, com.safedk.android.analytics.brandsafety.b.f, this.g.getFormat().getLabel());
        String strL0 = this.g.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strC = this.g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    protected String f() {
        return "2.0/mvr";
    }

    protected boolean h() {
        return this.g.n0();
    }

    protected void a(b4 b4Var) {
        this.g.a(b4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void a(int i) {
        super/*com.applovin.impl.e6*/.a(i);
        String str = (i < 400 || i >= 500) ? "network_timeout" : "rejected";
        this.g.a(b4.a(str));
        ((w4) this).a.P().a(y1.g0, this.g, CollectionUtils.hashMap("error_message", str));
    }
}
