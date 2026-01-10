package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class cs extends cz {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m504(List<Object> list) {
        return hr.ﻛ().ｋ().ｋ((Class) m528(list, 0, Class.class), (hp) m528(list, 1, hp.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Field> m503(List<Object> list) {
        if (list.get(0) instanceof Class) {
            if (list.size() > 1) {
                return hr.ﻛ().ｋ().ﾇ((Class) m528(list, 0, Class.class), (hp) m528(list, 1, hp.class));
            }
        } else {
            Object obj = m528(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) m528(list, 1, Boolean.class)).booleanValue() : false;
            hr.ﻛ().ｋ();
            Field[] fieldArr = ho.ﾒ(obj.getClass(), zBooleanValue, -1, (List) null);
            if (fieldArr != null) {
                return Arrays.asList(fieldArr);
            }
        }
        return new ArrayList();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Field m502(List<Object> list) {
        if (list.get(0) instanceof Class) {
            Class cls = (Class) m528(list, 0, Class.class);
            if (list.get(1) instanceof Class) {
                return hr.ﻛ().ｋ().ﻐ(cls, (Class) m528(list, 1, Class.class));
            }
            return hr.ﻛ().ｋ().ｋ(cls, (hp) m528(list, 1, hp.class));
        }
        Object obj = m528(list, 0, Object.class);
        return hr.ﻛ().ｋ().ﻐ(obj.getClass(), (Class) m528(list, 1, Class.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m505(List<Object> list) {
        return hr.ﻛ().ｋ().ﾇ((Class) m528(list, 0, Class.class), (String) m528(list, 1, String.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static hp.e m501() {
        hr.ﻛ().ｋ();
        return ho.ｋ();
    }
}
