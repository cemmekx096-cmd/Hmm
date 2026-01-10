package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d5$;
import com.applovin.impl.d5$c$;
import com.applovin.impl.q4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class d5 extends w4 {
    private static JSONObject l;
    private static final Object m = new Object();
    private static final Map n = Collections.synchronizedMap(new HashMap());
    private final String g;
    private final MaxAdFormat h;
    private final Map i;
    private final Context j;
    private final b k;

    public interface b {
        void a(JSONArray jSONArray);
    }

    private static class c implements q4.a, Runnable {
        private final b a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection e;
        private final com.applovin.impl.sdk.k f;
        private final o g;

        public void a(q4 q4Var) throws JSONException {
            boolean z;
            synchronized (this.b) {
                this.e.add(q4Var);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (a7.h() && ((Boolean) this.f.a(l4.N)).booleanValue()) {
                    this.f.q0().a(new f6(this.f, "handleSignalCollectionCompleted", new d5$c$.ExternalSyntheticLambda0(this)), r5.b.c);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i, b bVar, com.applovin.impl.sdk.k kVar) {
            this.c = i;
            this.a = bVar;
            this.f = kVar;
            this.g = kVar.O();
            this.b = new Object();
            this.e = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList<q4> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.e);
            }
            JSONArray jSONArray = new JSONArray();
            for (q4 q4Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    r4 r4VarF = q4Var.f();
                    jSONObject.put("name", r4VarF.c());
                    jSONObject.put("class", r4VarF.b());
                    jSONObject.put("adapter_version", q4Var.a());
                    jSONObject.put("sdk_version", q4Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = q4Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", q4Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", q4Var.b());
                    jSONObject2.put("is_cached", q4Var.g());
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (o.a()) {
                        this.g.a("TaskCollectSignals", "Collected signal from " + r4VarF);
                    }
                } catch (JSONException e) {
                    if (o.a()) {
                        this.g.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f.E().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public d5(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.g = str;
        this.h = maxAdFormat;
        this.i = map;
        this.j = context;
        this.k = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.k, ((w4) this).a);
        ((w4) this).a.q0().a(new f6(((w4) this).a, "timeoutCollectSignal", cVar), r5.b.d, ((Long) ((w4) this).a.a(g3.T6)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new r4(this.i, jSONArray.getJSONObject(i), jSONObject, ((w4) this).a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) n.get(this.g);
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.g, (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (m) {
                jSONArray = JsonUtils.getJSONArray(l, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (n.size() > 0) {
                    b(jSONArray, l);
                    return;
                } else {
                    a(jSONArray, l);
                    return;
                }
            }
            if (o.a()) {
                ((w4) this).c.k(((w4) this).b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) ((w4) this).a.a(n4.D, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (n.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
            ((w4) this).a.E().a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
            ((w4) this).a.E().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            ((w4) this).a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(r4 r4Var, q4.a aVar) {
        if (r4Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new d5$.ExternalSyntheticLambda0(this, r4Var, aVar));
        } else {
            ((w4) this).a.X().collectSignal(this.g, this.h, r4Var, this.j, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(r4 r4Var, q4.a aVar) {
        ((w4) this).a.X().collectSignal(this.g, this.h, r4Var, this.j, aVar);
    }

    private void a(String str, Throwable th) {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "No signals collected: " + str, th);
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (m) {
            l = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    n.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            kVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }
}
