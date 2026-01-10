package com.applovin.impl;

import com.applovin.impl.e2$;
import com.applovin.impl.r5;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class e2 {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (a) {
            return;
        }
        kVar.E().a(y1.w0, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        Long l = (Long) kVar.a(g3.K7);
        if (l.longValue() <= 0) {
            return;
        }
        kVar.q0().a(new f6(kVar, true, "submitIntegrationErrorReport", new e2$.ExternalSyntheticLambda0(kVar)), r5.b.e, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        a = true;
    }
}
