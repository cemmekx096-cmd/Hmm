package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b7$;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class b7 extends com.applovin.impl.sdk.ad.b implements d4 {
    private final String m;
    private final String n;
    private final k7 o;
    private final long p;
    private final o7 q;
    private final e7 r;
    private final String s;
    private final d7 t;
    private final y3 u;
    private final Set v;
    private final Set w;

    public static class b {
        private JSONObject a;
        private JSONObject b;
        private com.applovin.impl.sdk.k c;
        private long d;
        private String e;
        private String f;
        private k7 g;
        private o7 h;
        private e7 i;
        private d7 j;
        private Set k;
        private Set l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b b(Set set) {
            this.k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b a(k7 k7Var) {
            this.g = k7Var;
            return this;
        }

        public b a(o7 o7Var) {
            this.h = o7Var;
            return this;
        }

        public b a(e7 e7Var) {
            this.i = e7Var;
            return this;
        }

        public b a(d7 d7Var) {
            this.j = d7Var;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(long j) {
            this.d = j;
            return this;
        }

        public b7 a() {
            return new b7(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set p1() {
        e7 e7Var = this.r;
        return e7Var != null ? e7Var.b() : Collections.emptySet();
    }

    private String s1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t(v4 v4Var) {
        return a7.a(v4Var.a("vimp_urls", new JSONObject()), getClCode(), (Map) null, s1(), T(), Z0(), ((AppLovinAdBase) this).sdk);
    }

    private Set w1() {
        o7 o7Var = this.q;
        return o7Var != null ? o7Var.b() : Collections.emptySet();
    }

    public boolean A1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void B1() {
        v4 v4Var = ((AppLovinAdBase) this).synchronizedAdObject;
        if (v4Var != null) {
            v4Var.c("vast_is_streaming");
            return;
        }
        synchronized (((AppLovinAdBase) this).adObjectLock) {
            ((AppLovinAdBase) this).adObject.remove("vast_is_streaming");
        }
    }

    public boolean C1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean D1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean E1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean F1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean G1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    public List J() {
        List listA;
        v4 v4Var = ((AppLovinAdBase) this).synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new b7$.ExternalSyntheticLambda0(this));
        }
        synchronized (((AppLovinAdBase) this).adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), (Map) null, s1(), T(), Z0(), ((AppLovinAdBase) this).sdk);
        }
        return listA;
    }

    public boolean M0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean P0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && m() != null;
    }

    public boolean Q0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    public String S() {
        return this.s;
    }

    public void S0() {
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void d(String str) {
        v4 v4Var = ((AppLovinAdBase) this).synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("html_template", str);
            return;
        }
        synchronized (((AppLovinAdBase) this).adObjectLock) {
            JsonUtils.putString(((AppLovinAdBase) this).adObject, "html_template", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7) || !super/*com.applovin.impl.sdk.ad.AppLovinAdImpl*/.equals(obj)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        String str = this.m;
        if (str == null ? b7Var.m != null : !str.equals(b7Var.m)) {
            return false;
        }
        String str2 = this.n;
        if (str2 == null ? b7Var.n != null : !str2.equals(b7Var.n)) {
            return false;
        }
        k7 k7Var = this.o;
        if (k7Var == null ? b7Var.o != null : !k7Var.equals(b7Var.o)) {
            return false;
        }
        o7 o7Var = this.q;
        if (o7Var == null ? b7Var.q != null : !o7Var.equals(b7Var.q)) {
            return false;
        }
        e7 e7Var = this.r;
        if (e7Var == null ? b7Var.r != null : !e7Var.equals(b7Var.r)) {
            return false;
        }
        d7 d7Var = this.t;
        if (d7Var == null ? b7Var.t != null : !d7Var.equals(b7Var.t)) {
            return false;
        }
        Set set = this.v;
        if (set == null ? b7Var.v != null : !set.equals(b7Var.v)) {
            return false;
        }
        Set set2 = this.w;
        Set set3 = b7Var.w;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public long getCreatedAtMillis() {
        return this.p;
    }

    public JSONObject getOriginalFullResponse() {
        return ((AppLovinAdBase) this).fullResponse;
    }

    public boolean hasVideoUrl() {
        List listG;
        o7 o7Var = this.q;
        return (o7Var == null || (listG = o7Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    public int hashCode() {
        int iHashCode = super/*com.applovin.impl.sdk.ad.AppLovinAdImpl*/.hashCode() * 31;
        String str = this.m;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        k7 k7Var = this.o;
        int iHashCode4 = (iHashCode3 + (k7Var != null ? k7Var.hashCode() : 0)) * 31;
        o7 o7Var = this.q;
        int iHashCode5 = (iHashCode4 + (o7Var != null ? o7Var.hashCode() : 0)) * 31;
        e7 e7Var = this.r;
        int iHashCode6 = (iHashCode5 + (e7Var != null ? e7Var.hashCode() : 0)) * 31;
        d7 d7Var = this.t;
        int iHashCode7 = (iHashCode6 + (d7Var != null ? d7Var.hashCode() : 0)) * 31;
        Set set = this.v;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.w;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.t != null;
    }

    public Uri m() {
        o7 o7Var = this.q;
        if (o7Var != null) {
            return o7Var.c();
        }
        return null;
    }

    public Uri n0() {
        return m();
    }

    public d7 n1() {
        return this.t;
    }

    public e7 o1() {
        return this.r;
    }

    public String q1() {
        return getStringFromAdObject("html_template", BuildConfig.FLAVOR);
    }

    public c r1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public h7 t1() {
        o7 o7Var = this.q;
        if (o7Var != null) {
            return o7Var.f();
        }
        return null;
    }

    public String toString() {
        return "VastAd{title='" + this.m + "', adDescription='" + this.n + "', systemInfo=" + this.o + ", videoCreative=" + this.q + ", companionAd=" + this.r + ", adVerifications=" + this.t + ", impressionTrackers=" + this.v + ", errorTrackers=" + this.w + '}';
    }

    public long u1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public k7 v1() {
        return this.o;
    }

    public Uri w0() {
        p7 p7VarY1 = y1();
        if (p7VarY1 != null) {
            return p7VarY1.e();
        }
        return null;
    }

    public o7 x1() {
        return this.q;
    }

    public p7 y1() {
        Long lF = n0.f(((AppLovinAdBase) this).sdk);
        return this.q.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean z1() {
        return t1() != null;
    }

    private b7(b bVar) {
        super(bVar.a, bVar.b, bVar.c);
        this.m = bVar.e;
        this.o = bVar.g;
        this.n = bVar.f;
        this.q = bVar.h;
        this.r = bVar.i;
        this.t = bVar.j;
        this.v = bVar.k;
        this.w = bVar.l;
        this.u = new y3(this);
        Uri uriW0 = w0();
        if (uriW0 != null) {
            this.s = uriW0.toString();
        } else {
            this.s = BuildConfig.FLAVOR;
        }
        this.p = bVar.d;
    }

    public Set a(d dVar, String[] strArr) {
        ((AppLovinAdBase) this).sdk.O();
        if (o.a()) {
            ((AppLovinAdBase) this).sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.v;
        }
        if (dVar == d.VIDEO_CLICK) {
            return w1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return p1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return t1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return t1().f();
        }
        if (dVar == d.ERROR) {
            return this.w;
        }
        ((AppLovinAdBase) this).sdk.O();
        if (o.a()) {
            ((AppLovinAdBase) this).sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    public y3 getAdEventTracker() {
        return this.u;
    }

    private Set a(c cVar, String[] strArr) {
        e7 e7Var;
        o7 o7Var;
        if (strArr != null && strArr.length > 0) {
            Map mapD = null;
            if (cVar == c.VIDEO && (o7Var = this.q) != null) {
                mapD = o7Var.e();
            } else if (cVar == c.COMPANION_AD && (e7Var = this.r) != null) {
                mapD = e7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static b7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.a = jSONObject3;
        bVar.c = kVar;
        bVar.d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.e = JsonUtils.getString(jSONObject, "title", BuildConfig.FLAVOR);
        bVar.f = JsonUtils.getString(jSONObject, "ad_description", BuildConfig.FLAVOR);
        bVar.g = k7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.h = o7.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.i = e7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.j = d7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (l7VarA != null) {
                hashSet.add(l7VarA);
            }
        }
        bVar.k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            l7 l7VarA2 = l7.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), kVar);
            if (l7VarA2 != null) {
                hashSet2.add(l7VarA2);
            }
        }
        bVar.l = hashSet2;
        b7 b7Var = new b7(bVar);
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray());
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray3, i3, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    b7Var.a(Uri.parse(str));
                }
            }
        }
        return b7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.p);
        JsonUtils.putString(jSONObject, "title", this.m);
        JsonUtils.putString(jSONObject, "ad_description", this.n);
        k7 k7Var = this.o;
        if (k7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", k7Var.a());
        }
        o7 o7Var = this.q;
        if (o7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", o7Var.a());
        }
        e7 e7Var = this.r;
        if (e7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", e7Var.a());
        }
        d7 d7Var = this.t;
        if (d7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", d7Var.a());
        }
        if (this.v != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                jSONArray.put(((l7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.w != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.w.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((l7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = l().iterator();
        while (it3.hasNext()) {
            arrayList.add(((Uri) it3.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        v4 v4Var = ((AppLovinAdBase) this).synchronizedFullResponse;
        if (v4Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", v4Var.a());
        } else {
            synchronized (((AppLovinAdBase) this).fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", ((AppLovinAdBase) this).fullResponse);
            }
        }
        return jSONObject;
    }
}
