package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hv;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cx extends cz {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Method m524(List<Object> list) {
        hv hvVar = (hv) m528(list, 1, hv.class);
        if (list.get(0) instanceof Class) {
            return hs.ﾇ((Class) m528(list, 0, Class.class), hvVar);
        }
        return hs.ﾇ(m528(list, 0, Object.class).getClass(), hvVar);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m523(List<Object> list) {
        hv hvVar = (hv) m528(list, 1, hv.class);
        if (list.get(0) instanceof Class) {
            return hs.ｋ((Class) m528(list, 0, Class.class), hvVar);
        }
        return hs.ｋ(m528(list, 0, Object.class).getClass(), hvVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static hv.a m525() {
        return new hv.a();
    }
}
