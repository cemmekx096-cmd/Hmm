package com.applovin.impl;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class b6 extends c6 {
    private final t2 g;

    public b6(t2 t2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.g = t2Var;
    }

    @Override // com.applovin.impl.e6
    protected void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
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

    @Override // com.applovin.impl.c6
    protected void b(JSONObject jSONObject) {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Reported reward successfully for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.e6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.c6
    protected b4 h() {
        return this.g.h0();
    }

    @Override // com.applovin.impl.c6
    protected void i() {
        if (o.a()) {
            ((w4) this).c.b(((w4) this).b, "No reward result was found for mediated ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.e6
    protected void a(int i) {
        super.a(i);
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Failed to report reward for mediated ad: " + this.g + " - error code: " + i);
        }
        ((w4) this).a.P().a(y1.f0, this.g);
    }
}
