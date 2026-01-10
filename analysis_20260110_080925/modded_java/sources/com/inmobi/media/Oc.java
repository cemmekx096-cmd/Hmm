package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Oc {
    public final Rc a;
    public final LinkedHashSet b;

    public Oc(Rc rc, LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(rc, "networkRequest");
        Intrinsics.checkNotNullParameter(linkedHashSet, "inMobiUnifiedIdInterfaceSet");
        this.a = rc;
        this.b = linkedHashSet;
    }

    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        synchronized (Nc.class) {
            if (((rb) this.a).A.get()) {
                return;
            }
            Nc.a();
            u5.b(Pc.a(jSONObject, u5.b()));
            JSONObject jSONObjectA = Pc.a(u5.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                if (jSONObjectA == null) {
                    Pc.a(inMobiUnifiedIdInterface, null, new Error("No local data present"));
                } else {
                    Pc.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                }
            }
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(i9 i9Var) {
        c4 c4Var;
        synchronized (Nc.class) {
            if (i9Var != null) {
                try {
                    c4Var = i9Var.a;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                c4Var = null;
            }
            Objects.toString(c4Var);
            Objects.toString(i9Var != null ? i9Var.a : null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i9Var != null) {
                linkedHashMap.put("errorCode", i9Var.a);
            }
            ic icVar = ic.a;
            ic.b("UnifiedIdNetworkResponseFailure", linkedHashMap, mc.a);
            if (((rb) this.a).A.get()) {
                return;
            }
            Nc.a();
            a();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0050, JSONException -> 0x0052, TryCatch #1 {JSONException -> 0x0052, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:12:0x0033, B:13:0x0039, B:15:0x003f), top: B:26:0x000d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.String r0 = "ufids"
            org.json.JSONObject r1 = com.inmobi.media.u5.b()
            org.json.JSONObject r1 = com.inmobi.media.Pc.a(r1)
            r2 = 0
            if (r1 == 0) goto L33
            boolean r3 = r1.has(r0)     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            if (r3 == 0) goto L33
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            if (r0 <= 0) goto L33
            java.util.LinkedHashSet r0 = r5.b     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
        L23:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            if (r3 == 0) goto L56
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r3 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r3     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            com.inmobi.media.Pc.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            goto L23
        L33:
            java.util.LinkedHashSet r0 = r5.b     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
        L39:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r1 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r1     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            java.lang.Error r3 = new java.lang.Error     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            java.lang.String r4 = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            com.inmobi.media.Pc.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L50 org.json.JSONException -> L52
            goto L39
        L50:
            r0 = move-exception
            goto L5c
        L52:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L50
        L56:
            java.util.LinkedHashSet r0 = r5.b
            r0.clear()
            return
        L5c:
            java.util.LinkedHashSet r1 = r5.b
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Oc.a():void");
    }
}
