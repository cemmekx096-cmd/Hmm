package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Qb {
    public static final Qb a = new Qb();

    public final synchronized void a() {
        Intrinsics.checkNotNullExpressionValue("Qb", "TAG");
        LinkedHashMap linkedHashMap = K2.a;
        I2.a("signals", Kb.b(), null);
        Pb pb = Pb.a;
        boolean zIsSessionEnabled = V4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null).getIceConfig().isSessionEnabled();
        pb.getClass();
        Pb.e = zIsSessionEnabled;
        if (!zIsSessionEnabled) {
            Pb.d = null;
        }
        Pb.c();
        String strH = Kb.a.h();
        if (strH != null) {
            SignalsConfig signalsConfigA = I2.a("signals", strH, null);
            Intrinsics.checkNotNull(signalsConfigA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            if (signalsConfigA.getIceConfig().isLocationEnabled()) {
            }
        }
        y6.a.d();
    }
}
