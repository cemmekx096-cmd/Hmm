package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class e7 implements d4 {
    private int a;
    private int b;
    private Uri c;
    private j7 d;
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    private e7() {
    }

    public static e7 a(c8 c8Var, e7 e7Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        c8 c8VarC;
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (e7Var == null) {
            try {
                e7Var = new e7();
            } catch (Throwable th) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                kVar.E().a("VastCompanionAd", th);
                return null;
            }
        }
        if (e7Var.a == 0 && e7Var.b == 0) {
            int i = StringUtils.parseInt((String) c8Var.a().get(SettingsJsonConstants.ICON_WIDTH_KEY));
            int i2 = StringUtils.parseInt((String) c8Var.a().get(SettingsJsonConstants.ICON_HEIGHT_KEY));
            if (i > 0 && i2 > 0) {
                e7Var.a = i;
                e7Var.b = i2;
            }
        }
        e7Var.d = j7.a(c8Var, e7Var.d, kVar);
        if (e7Var.c == null && (c8VarC = c8Var.c("CompanionClickThrough")) != null) {
            String strD = c8VarC.d();
            if (StringUtils.isValidString(strD)) {
                e7Var.c = Uri.parse(strD);
            }
        }
        n7.a(c8Var.a("CompanionClickTracking"), e7Var.e, f7Var, kVar);
        n7.a(c8Var, e7Var.f, f7Var, kVar);
        return e7Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.c;
    }

    public Map d() {
        return this.f;
    }

    public j7 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (this.a != e7Var.a || this.b != e7Var.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? e7Var.c != null : !uri.equals(e7Var.c)) {
            return false;
        }
        j7 j7Var = this.d;
        if (j7Var == null ? e7Var.d != null : !j7Var.equals(e7Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? e7Var.e != null : !set.equals(e7Var.e)) {
            return false;
        }
        Map map = this.f;
        Map map2 = e7Var.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Uri uri = this.c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        j7 j7Var = this.d;
        int iHashCode2 = (iHashCode + (j7Var != null ? j7Var.hashCode() : 0)) * 31;
        Set set = this.e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }

    public static e7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, SettingsJsonConstants.ICON_WIDTH_KEY, 0);
        int i2 = JsonUtils.getInt(jSONObject, SettingsJsonConstants.ICON_HEIGHT_KEY, 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        j7 j7VarA = j7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArray, i3, (JSONObject) null), kVar);
            if (l7VarA != null) {
                hashSet.add(l7VarA);
            }
        }
        e7 e7Var = new e7();
        e7Var.a = i;
        e7Var.b = i2;
        e7Var.c = uri;
        e7Var.d = j7VarA;
        e7Var.e.addAll(hashSet);
        return e7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, SettingsJsonConstants.ICON_WIDTH_KEY, this.a);
        JsonUtils.putInt(jSONObject, SettingsJsonConstants.ICON_HEIGHT_KEY, this.b);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        j7 j7Var = this.d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", j7Var != null ? j7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((l7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
