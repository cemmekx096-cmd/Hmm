package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, String> f337 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m736(String str) {
        String str2 = f337.get(str);
        if (str2 != null) {
            return str2;
        }
        f337.put(str, str);
        return str;
    }
}
