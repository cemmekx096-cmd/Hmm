package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class cw extends cz {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m521(List<Object> list) {
        kc.ﾇ((JSONObject) m528(list, 0, JSONObject.class), (JSONObject) m528(list, 1, JSONObject.class), list.size() > 2 ? ((Boolean) m528(list, 2, Boolean.class)).booleanValue() : true);
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m520(List<Object> list) {
        return kc.ﻐ((JSONObject) m528(list, 0, JSONObject.class), list.size() > 1 ? ((Boolean) m528(list, 1, Boolean.class)).booleanValue() : true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m522(cp cpVar) {
        return cpVar.ﾇ();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m519(cp cpVar, List<Object> list) {
        cpVar.ﾒ((JSONObject) m528(list, 0, JSONObject.class));
        return null;
    }
}
