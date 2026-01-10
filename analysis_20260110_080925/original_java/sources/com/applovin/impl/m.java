package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class m implements Comparable {
    private final String a;
    private final String b;
    private final MaxAdFormat c;
    private final n d;
    private final List e;

    public m(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", BuildConfig.FLAVOR);
        this.b = JsonUtils.getString(jSONObject, "display_name", BuildConfig.FLAVOR);
        this.c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.e = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.e.add(new n(jSONObject2, map, this.c, kVar));
            }
        }
        this.d = this.e.isEmpty() ? null : (n) this.e.get(0);
    }

    public MaxAdFormat a() {
        return this.c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ").append(this.b).append(" ----------").append("\nIdentifier - ").append(this.a).append("\nFormat     - ").append(b());
        return sb.toString();
    }

    public n f() {
        return this.d;
    }

    public List g() {
        return this.e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.b.compareToIgnoreCase(mVar.b);
    }
}
