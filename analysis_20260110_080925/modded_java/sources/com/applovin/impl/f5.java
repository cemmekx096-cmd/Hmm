package com.applovin.impl;

import com.applovin.impl.i4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.ktor.http.ContentDisposition;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class f5 extends w4 {
    protected final t g;
    private final String h;

    public f5(t tVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.g = tVar;
        this.h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.g.e());
        if (this.g.f() != null) {
            map.put("AppLovin-Ad-Size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            map.put("AppLovin-Ad-Type", this.g.g().getLabel());
        }
        return map;
    }

    protected abstract w4 a(JSONObject jSONObject);

    protected void a(int i, String str) {
        if (o.a()) {
            ((w4) this).c.b(((w4) this).b, "Unable to fetch " + this.g + " ad: server returned " + i);
        }
        ((w4) this).a.g().a(y1.m, this.g, new AppLovinError(i, str));
    }

    protected void b(JSONObject jSONObject) {
        n0.c(jSONObject, ((w4) this).a);
        n0.b(jSONObject, ((w4) this).a);
        n0.a(jSONObject, ((w4) this).a);
        t.a(jSONObject);
        ((w4) this).a.q0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.g.e());
        if (this.g.f() != null) {
            map.put(ContentDisposition.Parameters.Size, this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            map.put("require", this.g.g().getLabel());
        }
        return map;
    }

    public void run() {
        i4.a aVarA;
        Map map;
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Fetching next ad of zone: " + this.g);
        }
        if (((Boolean) ((w4) this).a.a(l4.J3)).booleanValue() && a7.j() && o.a()) {
            ((w4) this).c.a(((w4) this).b, "User is connected to a VPN");
        }
        a7.a(((w4) this).a, ((w4) this).b);
        ((w4) this).a.g().a(y1.k, this.g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = ((w4) this).a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) ((w4) this).a.a(l4.Z2)).booleanValue()) {
                aVarA = i4.a.a(((Integer) ((w4) this).a.a(l4.T4)).intValue());
                JSONObject jSONObject = new JSONObject(((w4) this).a.B().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) ((w4) this).a.a(l4.d5)).booleanValue() && !((Boolean) ((w4) this).a.a(l4.Z4)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) ((w4) this).a.a(l4.L4)).booleanValue()) {
                    map.put("sdk_key", ((w4) this).a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                i4.a aVarA2 = i4.a.a(((Integer) ((w4) this).a.a(l4.U4)).intValue());
                Map mapA = a7.a(((w4) this).a.B().a(h(), false, false));
                if (!((Boolean) ((w4) this).a.a(l4.i6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = HttpRequest.METHOD_GET;
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (a7.f(a()) || a7.h(a())) {
                map.putAll(((w4) this).a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.h)) {
                map.put("sts", this.h);
            }
            a.a aVarF = com.applovin.impl.sdk.network.a.a(((w4) this).a).b(f()).a(e()).b(map).c(str).a(g()).a(new JSONObject()).a(((Integer) ((w4) this).a.a(l4.O2)).intValue()).c(((Boolean) ((w4) this).a.a(l4.P2)).booleanValue()).d(((Boolean) ((w4) this).a.a(l4.Q2)).booleanValue()).c(((Integer) ((w4) this).a.a(l4.N2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                aVarF.a(andResetCustomPostBody);
                aVarF.b(((Boolean) ((w4) this).a.a(l4.n5)).booleanValue());
            }
            a aVar = new a(aVarF.a(), ((w4) this).a);
            aVar.c(l4.p0);
            aVar.b(l4.q0);
            ((w4) this).a.q0().a(aVar);
        } catch (Throwable th) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Unable to fetch ad for zone id: " + this.g, th);
            }
            a(0, th.getMessage());
        }
    }

    class a extends z5 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, JSONObject jSONObject, int i) throws JSONException {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", ((z5) this).l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", ((z5) this).l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
                CollectionUtils.putStringIfValid("ad_zone_id", f5.this.g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(((z5) this).l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(((z5) this).l.b()), map);
                ((w4) this).a.g().d(y1.l, map);
                f5.this.b(jSONObject);
                return;
            }
            f5.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            f5.this.a(i, str2);
            ((w4) this).a.E().a("fetchAd", str, i, str2);
        }
    }
}
