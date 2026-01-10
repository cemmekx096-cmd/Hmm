package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class W2 {
    public static final /* synthetic */ int e = 0;
    public final m9 a;
    public final TreeMap b;
    public final LinkedHashMap c;
    public final N2 d;

    public W2(Q2 q2, m9 m9Var) throws JSONException {
        Intrinsics.checkNotNullParameter(q2, "networkRequest");
        Intrinsics.checkNotNullParameter(m9Var, "mNetworkResponse");
        this.a = m9Var;
        TreeMap treeMap = new TreeMap(q2.y);
        this.b = treeMap;
        this.c = new LinkedHashMap();
        i9 i9Var = m9Var.c;
        Unit unit = null;
        if (i9Var != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                S2 s2 = new S2(null, (Config) value);
                s2.c = new N2((byte) 0, "Network error in fetching config.");
                LinkedHashMap linkedHashMap = this.c;
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                linkedHashMap.put(key, s2);
            }
            N2 n2 = new N2((byte) 0, i9Var.b);
            this.d = n2;
            Intrinsics.checkNotNullExpressionValue("W2", "TAG");
            byte b = n2.a;
            String str = n2.b;
            Pair pairA = R2.a(this.b);
            Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("errorCode", Integer.valueOf(i9Var.a.a)), TuplesKt.to("name", (List) pairA.component1()), TuplesKt.to("lts", (List) pairA.component2()), TuplesKt.to("networkType", E3.q())});
            ic icVar = ic.a;
            ic.b("InvalidConfig", mapMutableMapOf, mc.a);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            try {
                JSONObject jSONObject = new JSONObject(this.a.a());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Config config = (Config) this.b.get(next);
                    if (config != null) {
                        Intrinsics.checkNotNull(config);
                        S2 s22 = new S2(jSONObject2, config);
                        LinkedHashMap linkedHashMap2 = this.c;
                        Intrinsics.checkNotNull(next);
                        linkedHashMap2.put(next, s22);
                    }
                }
                Pair pairA2 = R2.a(this.b);
                Map mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("name", (List) pairA2.component1()), TuplesKt.to("lts", (List) pairA2.component2())});
                ic icVar2 = ic.a;
                ic.b("ConfigFetched", mapMutableMapOf2, mc.a);
            } catch (JSONException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Exception while parsing config";
                } else {
                    Intrinsics.checkNotNull(localizedMessage);
                }
                N2 n22 = new N2((byte) 2, localizedMessage);
                this.d = n22;
                String str2 = n22.b;
                Pair pairA3 = R2.a(this.b);
                Map mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("errorCode", (short) 1), TuplesKt.to("name", (List) pairA3.component1()), TuplesKt.to("lts", (List) pairA3.component2()), TuplesKt.to("networkType", E3.q())});
                ic icVar3 = ic.a;
                ic.b("InvalidConfig", mapMutableMapOf3, mc.a);
            }
        }
    }

    public final boolean a() {
        c4 c4Var;
        i9 i9Var = this.a.c;
        if ((i9Var != null ? i9Var.a : null) != c4.i) {
            if (i9Var == null || (c4Var = i9Var.a) == null) {
                c4Var = c4.e;
            }
            int i = c4Var.a;
            if (500 > i || i >= 600) {
                return false;
            }
        }
        return true;
    }
}
