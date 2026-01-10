package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class dc extends cz {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m550(List<Object> list) {
        return kd.ﾇ((String) m528(list, 0, String.class), (String) m528(list, 1, String.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m549(List<Object> list) {
        return hr.ﻛ().ﾒ().ﾇ(m528(list, 0, Object.class), (List) m528(list, 1, List.class), ((Integer) m528(list, 2, Integer.class)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m548(List<Object> list) {
        String str = (String) m528(list, 0, String.class);
        if (list.get(1) instanceof String) {
            return kd.ﻛ(str, (String) m528(list, 1, String.class));
        }
        return kd.ﾇ(str, new JSONArray((Collection) m528(list, 1, List.class)));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m546(List<Object> list) {
        String str = (String) m528(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) m528(list, 2, Boolean.class)).booleanValue() : true;
        if (list.get(1) instanceof String) {
            return kd.ﾇ(str, (String) m528(list, 1, String.class), zBooleanValue);
        }
        return kd.ﾇ(str, new JSONArray((Collection) m528(list, 1, List.class)), zBooleanValue);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m547(List<Object> list) {
        return kd.ｋ((String) m528(list, 0, String.class));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String m545(List<Object> list) {
        return kd.ﻐ((String) m528(list, 0, String.class));
    }
}
