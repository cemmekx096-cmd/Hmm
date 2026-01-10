package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.i4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.security.ProviderInstaller;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class h5 extends w4 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;
    private final Object h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends w4 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        public void run() {
            if (h5.this.i != null) {
                if (o.a()) {
                    ((w4) this).c.b(((w4) this).b, "Timing out fetch basic settings...");
                }
                h5.this.a(new JSONObject());
            }
        }
    }

    public h5(int i, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.h = new Object();
        this.g = i;
        this.i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return n0.a((String) ((w4) this).a.a(l4.o0), "5.0/i", b());
    }

    private String g() {
        return n0.a((String) ((w4) this).a.a(l4.n0), "5.0/i", b());
    }

    protected JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = ((w4) this).a;
            l4 l4Var = l4.Z4;
            if (((Boolean) kVar.a(l4Var)).booleanValue() || ((Boolean) ((w4) this).a.a(l4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", i.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", ((w4) this).a.a(l4.o));
            if (((w4) this).a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!((w4) this).a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", a7.b(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", a7.g(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) ((w4) this).a.a(l4.B3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", ((w4) this).a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", ((w4) this).a.D());
            jSONObject.put("installed_mediation_adapters", l3.b(((w4) this).a));
            Map mapD = ((w4) this).a.B().D();
            jSONObject.put("package_name", mapD.get("package_name"));
            jSONObject.put("app_version", mapD.get("app_version"));
            jSONObject.put("debug", mapD.get("debug"));
            jSONObject.put("tg", mapD.get("tg"));
            jSONObject.put("target_sdk", mapD.get("target_sdk"));
            jSONObject.put("session_id", mapD.get("session_id"));
            List adUnitIds = ((w4) this).a.K() != null ? ((w4) this).a.K().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, mapD.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapD.get("IABTCF_gdprApplies"));
            Object obj = mapD.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", ((w4) this).a.y().b());
            Map mapL = ((w4) this).a.B().L();
            jSONObject.put("platform", mapL.get("platform"));
            jSONObject.put("os", mapL.get("os"));
            jSONObject.put("locale", mapL.get("locale"));
            jSONObject.put("brand", mapL.get("brand"));
            jSONObject.put("brand_name", mapL.get("brand_name"));
            jSONObject.put("hardware", mapL.get("hardware"));
            jSONObject.put("model", mapL.get("model"));
            jSONObject.put("revision", mapL.get("revision"));
            jSONObject.put("is_tablet", mapL.get("is_tablet"));
            jSONObject.put("screen_size_in", mapL.get("screen_size_in"));
            jSONObject.put("supported_abis", mapL.get("supported_abis"));
            Object obj2 = mapL.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) ((w4) this).a.a(l4.M3)).booleanValue()) {
                jSONObject.put("mtl", ((w4) this).a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            u.a aVarF = ((w4) this).a.B().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = l0.c().b(a());
            if (((Boolean) ((w4) this).a.a(l4.w3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarE = ((w4) this).a.B().E();
            if (((Boolean) ((w4) this).a.a(l4.p3)).booleanValue() && bVarE != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarE.a);
                jSONObject.put("idfv_scope", bVarE.b);
            }
            if (((Boolean) ((w4) this).a.a(l4.s3)).booleanValue()) {
                jSONObject.put("compass_random_token", ((w4) this).a.v());
            }
            if (((Boolean) ((w4) this).a.a(l4.u3)).booleanValue()) {
                jSONObject.put("applovin_random_token", ((w4) this).a.h0());
            }
            if (((Boolean) ((w4) this).a.a(l4.y3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", ((w4) this).a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", ((w4) this).a.F());
            if (((w4) this).a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = ((w4) this).a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(((w4) this).a.n0().getExtraParameters()));
            Map mapK0 = ((w4) this).a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
            if (this.g > 1) {
                ArrayService arrayServiceP = ((w4) this).a.p();
                if (arrayServiceP.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceP.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceP.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceP.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceP.getAppHubPackageName()));
            }
        } catch (JSONException e) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Failed to create JSON body", e);
            }
            ((w4) this).a.E().a(((w4) this).b, "createJSONBody", e);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) ((w4) this).a.a(l4.a5)).booleanValue() && !((Boolean) ((w4) this).a.a(l4.Z4)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) ((w4) this).a.a(l4.L4)).booleanValue()) {
            map.put("sdk_key", ((w4) this).a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", ((w4) this).a.r(), map);
        Boolean boolB = l0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = l0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = l0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    public void run() throws JSONException {
        if (!k0.i() && j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (o.a()) {
                    ((w4) this).c.a(((w4) this).b, "Cannot update security provider", th);
                }
            }
        }
        ((w4) this).a.v0().d(y1.f, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(((w4) this).a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) ((w4) this).a.a(l4.l5)).booleanValue()).c("POST").a(new JSONObject()).a(((Integer) ((w4) this).a.a(l4.U2)).intValue()).b(((Integer) ((w4) this).a.a(l4.X2)).intValue()).c(((Integer) ((w4) this).a.a(l4.T2)).intValue()).e(((Boolean) ((w4) this).a.a(l4.g3)).booleanValue()).a(i4.a.a(((Integer) ((w4) this).a.a(l4.Q4)).intValue())).f(true).a();
        ((w4) this).a.q0().a(new c(((w4) this).a), r5.b.d, ((Integer) ((w4) this).a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, ((w4) this).a, d(), jElapsedRealtime);
        aVar.c(l4.n0);
        aVar.b(l4.o0);
        ((w4) this).a.q0().a(aVar);
    }

    class a extends z5 {
        final /* synthetic */ long m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z, long j) {
            super(aVar, kVar, z);
            this.m = j;
        }

        public void a(String str, JSONObject jSONObject, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            h5.this.a(jSONObject);
            ((w4) this).a.v0().d(y1.g, h5.this.a(str, jElapsedRealtime, i, jSONObject, null));
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            h5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            ((w4) this).a.v0().d(y1.h, h5.this.a(str, jElapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j2, int i, JSONObject jSONObject, String str2) throws JSONException {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j2));
        map.put("code", Integer.toString(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
