package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;
import com.safedk.android.analytics.brandsafety.p;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class b extends a {
    public b(k kVar, String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        kVar.getClass();
        String str2 = str + "_global_timeout";
        int i = k.d(str) ? p.c : 10000;
        Integer numA = kVar.a(str2);
        return numA != null ? numA.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        kVar.getClass();
        String strA = k.a(new String[]{str, "min", "rat"});
        "read".equalsIgnoreCase(str);
        Integer numA = kVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        kVar.getClass();
        String strA = k.a(new String[]{str, "rat_perc"});
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer numA = kVar.a(strA);
        return numA != null ? numA.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        kVar.getClass();
        Integer numA = kVar.a(k.a(new String[]{"timeout", "threshold"}));
        if (numA != null) {
            return numA.intValue();
        }
        return 300;
    }
}
