package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Pb {
    public static String d;
    public static boolean e;
    public static long f;
    public static final SignalsConfig.SessionConfig h;
    public static final AtomicBoolean i;
    public static final e6 j;
    public static final v1 k;
    public static final v1 l;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(Pb.class, "sessionCnt", "getSessionCnt()I", 0)), Reflection.property1(new PropertyReference1Impl(Pb.class, "userRetention", "getUserRetention()I", 0))};
    public static final Pb a = new Pb();
    public static final String c = "Pb";
    public static final List g = CollectionsKt.mutableListOf(new Integer[]{0, 0, 0, 0});

    static {
        LinkedHashMap linkedHashMap = K2.a;
        e6 e6VarA = null;
        h = V4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null).getSessionConfig();
        i = new AtomicBoolean(false);
        Context contextD = Kb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = e6.b;
            e6VarA = d6.a(contextD, "session_pref_file");
        }
        j = e6VarA;
        k = new v1(-1, Nb.a, false, 12);
        l = new v1(-1, Ob.a, false, 12);
    }

    public static int a() {
        e6 e6Var = j;
        if (e6Var == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", "key");
        return Integer.min((int) ((jCurrentTimeMillis - e6Var.a.getLong("u-ret", jCurrentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (i.getAndSet(true)) {
            return;
        }
        LinkedHashMap linkedHashMap = K2.a;
        if (V4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null).getIceConfig().isSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            d = string;
            Intrinsics.checkNotNullExpressionValue(c, "TAG");
        }
        f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        SignalsConfig.SessionConfig sessionConfig = h;
        if (sessionConfig.getSigControlList().contains(5)) {
            e6 e6Var = j;
            if (e6Var != null) {
                Intrinsics.checkNotNullParameter("cnt", "key");
                e6.a(e6Var, "cnt", Integer.min(e6Var.a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false, 4, (Object) null);
            }
            k.a();
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            e6 e6Var2 = j;
            if (e6Var2 != null) {
                Intrinsics.checkNotNullParameter("u-ret", "key");
                if (!e6Var2.a.contains("u-ret")) {
                    e6.a(e6Var2, "u-ret", System.currentTimeMillis(), false, 4, (Object) null);
                }
            }
            l.a();
        }
    }

    public final JSONObject b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SignalsConfig.SessionConfig sessionConfig = h;
        if (sessionConfig.getSigControlList().contains(0)) {
            linkedHashMap.put("st", Long.valueOf(f));
        }
        if (sessionConfig.getSigControlList().contains(5)) {
            v1 v1Var = k;
            KProperty[] kPropertyArr = b;
            if (((Number) v1Var.getValue(this, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) v1Var.getValue(this, kPropertyArr[0])).intValue()));
            }
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            v1 v1Var2 = l;
            KProperty[] kPropertyArr2 = b;
            if (((Number) v1Var2.getValue(this, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) v1Var2.getValue(this, kPropertyArr2[1])).intValue()));
            }
        }
        List mutableList = CollectionsKt.toMutableList(g);
        if (!sessionConfig.getSigControlList().contains(1)) {
            mutableList.set(0, -1);
        }
        if (!sessionConfig.getSigControlList().contains(2)) {
            mutableList.set(1, -1);
        }
        if (!sessionConfig.getSigControlList().contains(3)) {
            mutableList.set(2, -1);
        }
        if (!sessionConfig.getSigControlList().contains(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() != -1) {
                        linkedHashMap.put("dep", mutableList);
                        break;
                    }
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static void a(String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "adtype");
        if (Intrinsics.areEqual(str, "banner") && h.getSigControlList().contains(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(str, "int") && !Intrinsics.areEqual(bool, Boolean.TRUE) && h.getSigControlList().contains(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(str, "native") && h.getSigControlList().contains(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && h.getSigControlList().contains(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
