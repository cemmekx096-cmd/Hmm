package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.I2$;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class I2 {
    public static void a() {
        if (K2.c.getAndSet(true)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        b();
        a("root", Kb.b(), null);
    }

    public static void b() {
        ArrayList arrayList = new ArrayList();
        M2 m2 = (M2) K2.f.getValue();
        m2.getClass();
        for (Config config : CollectionsKt.filterNotNull(R1.a(m2, null, null, null, null, null, null, 63))) {
            ConcurrentHashMap concurrentHashMap = K2.e;
            LinkedHashMap linkedHashMap = K2.a;
            Intrinsics.checkNotNullParameter(config, "<this>");
            HashMap map = y3.a;
            Config config2 = (Config) concurrentHashMap.put(y3.b(config.getAccountId$media_release(), config.getType()), config);
            if (config2 == null || config2.getLastUpdateTimeStamp() != config.getLastUpdateTimeStamp()) {
                Intrinsics.checkNotNullParameter(config, "<this>");
                arrayList.add(y3.b(config.getAccountId$media_release(), config.getType()));
            }
        }
        ((E2) K2.b.getValue()).post(new I2$.ExternalSyntheticLambda0(arrayList));
    }

    public static final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "$changedConfigKeys");
        try {
            Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Config config = (Config) K2.e.get((String) it.next());
                if (config != null) {
                    LinkedHashMap linkedHashMap = K2.a;
                    b(config);
                }
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.commons.core.configs.Config a(java.lang.String r3, java.lang.String r4, com.inmobi.media.J2 r5) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = com.inmobi.media.K2.f()
            java.lang.String r1 = "access$getTAG$cp(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Objects.toString(r5)
            com.inmobi.commons.core.configs.Config r3 = com.inmobi.media.y3.a(r4, r3)
            if (r4 != 0) goto L1f
            java.lang.String r4 = com.inmobi.media.K2.f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            return r3
        L1f:
            kotlin.Lazy r4 = com.inmobi.media.K2.d()
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.E2 r4 = (com.inmobi.media.E2) r4
            android.os.Message r4 = r4.obtainMessage()
            java.lang.String r0 = "obtainMessage(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r0 = 0
            r4.what = r0
            com.inmobi.media.O2 r0 = new com.inmobi.media.O2
            r0.<init>(r3, r5)
            r4.obj = r0
            kotlin.Lazy r5 = com.inmobi.media.K2.d()
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.E2 r5 = (com.inmobi.media.E2) r5
            r5.sendMessage(r4)
            java.lang.String r4 = com.inmobi.media.K2.f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.util.Objects.toString(r3)
            java.lang.String r4 = r3.getAccountId$media_release()
            if (r4 == 0) goto L84
            java.util.LinkedHashMap r5 = com.inmobi.media.K2.a
            java.lang.String r5 = r3.getType()
            java.lang.String r0 = com.inmobi.media.K2.f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = com.inmobi.media.K2.e
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r4 = com.inmobi.media.y3.b(r4, r5)
            java.lang.Object r4 = r0.get(r4)
            com.inmobi.commons.core.configs.Config r4 = (com.inmobi.commons.core.configs.Config) r4
            if (r4 == 0) goto L84
            java.lang.String r5 = com.inmobi.media.K2.f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r4.getLastUpdateTimeStamp()
            goto L85
        L84:
            r4 = 0
        L85:
            if (r4 != 0) goto L88
            goto L89
        L88:
            r3 = r4
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.I2.a(java.lang.String, java.lang.String, com.inmobi.media.J2):com.inmobi.commons.core.configs.Config");
    }

    public static Config a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "accountId");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        ConcurrentHashMap concurrentHashMap = K2.e;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        Config config = (Config) concurrentHashMap.get(y3.b(str, str2));
        Config config2 = null;
        if (config != null) {
            Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
            config.getLastUpdateTimeStamp();
        } else {
            config = null;
        }
        if (config != null) {
            return config;
        }
        M2 m2 = (M2) K2.f.getValue();
        m2.getClass();
        Intrinsics.checkNotNullParameter(str2, "type");
        Config config3 = (Config) m2.b("account_id=? AND config_type=?", new String[]{str, str2});
        if (config3 != null) {
            Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
            config3.toString();
            if (y2.a(config3.getAccountId$media_release()) && config3.getType().length() > 0) {
                Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
                ConcurrentHashMap concurrentHashMap2 = K2.e;
                LinkedHashMap linkedHashMap = K2.a;
                Intrinsics.checkNotNullParameter(config3, "<this>");
                concurrentHashMap2.put(y3.b(config3.getAccountId$media_release(), config3.getType()), config3);
                b(config3);
            }
            config2 = config3;
        }
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        if (config2 != null) {
            config2.getLastUpdateTimeStamp();
        }
        return config2;
    }

    public static void b(Config config) {
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        ArrayList arrayList = (ArrayList) K2.a.get(config);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) next).get() == null) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) K2.a.get(config);
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                J2 j2 = (J2) ((WeakReference) it2.next()).get();
                if (j2 != null) {
                    Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
                    j2.getClass().toString();
                    j2.a(config);
                }
            }
        }
    }

    public static Config a(String str) {
        Intrinsics.checkNotNullParameter(str, "accountId");
        Intrinsics.checkNotNullParameter("root", "type");
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        Config configA = a(str, "root");
        return configA == null ? y3.a(str, "root") : configA;
    }

    public static void a(Config config) {
        Intrinsics.checkNotNullExpressionValue(K2.f(), "access$getTAG$cp(...)");
        Message messageObtainMessage = ((E2) K2.b.getValue()).obtainMessage();
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = config;
        ((E2) K2.b.getValue()).sendMessage(messageObtainMessage);
    }
}
