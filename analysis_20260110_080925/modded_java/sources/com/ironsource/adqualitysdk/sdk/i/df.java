package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class df extends cz {
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static cm.a m556(List<Object> list) {
        return new cm.a((List) m528(list, 0, List.class), ((Integer) m528(list, 1, Integer.class)).intValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m557(List<Object> list) {
        Object obj;
        Class<?> cls;
        hp hpVar;
        Object obj2;
        Object obj3;
        Class<?> cls2;
        hp hpVar2;
        Object obj4;
        int size = list.size();
        Object obj5 = null;
        Class<?> cls3 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls = (Class) m528(list, 0, Class.class);
                obj = null;
            } else {
                Object obj6 = m528(list, 0, (Class<Object>) Object.class);
                if (obj6 != null) {
                    obj = obj6;
                    cls = obj6.getClass();
                } else {
                    obj = obj6;
                    cls = null;
                }
            }
            hpVar = (hp) m528(list, 1, hp.class);
            cls3 = cls;
            obj2 = obj;
            obj3 = null;
        } else if (size == 3) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m528(list, 0, Class.class);
                if (list.get(1) instanceof hp) {
                    hpVar2 = (hp) m528(list, 1, hp.class);
                    obj4 = m528(list, 2, (Class<Object>) Object.class);
                } else {
                    Object obj7 = m528(list, 1, (Class<Object>) Object.class);
                    hpVar = (hp) m528(list, 2, hp.class);
                    obj3 = null;
                    cls3 = cls2;
                    obj2 = obj7;
                }
            } else {
                obj5 = m528(list, 0, (Class<Object>) Object.class);
                cls2 = obj5.getClass();
                hpVar2 = (hp) m528(list, 1, hp.class);
                obj4 = m528(list, 2, (Class<Object>) Object.class);
            }
            obj3 = obj4;
            hpVar = hpVar2;
            Object obj8 = obj5;
            cls3 = cls2;
            obj2 = obj8;
        } else if (size != 4) {
            hpVar = null;
            obj2 = null;
            obj3 = null;
        } else {
            cls3 = (Class) m528(list, 0, Class.class);
            obj2 = m528(list, 1, (Class<Object>) Object.class);
            hp hpVar3 = (hp) m528(list, 2, hp.class);
            obj3 = m528(list, 3, (Class<Object>) Object.class);
            hpVar = hpVar3;
        }
        hr.ﻛ().ﾒ();
        return hw.ﾒ(cls3, obj2, hpVar, obj3);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m558(List<Object> list) {
        Object obj;
        hp hpVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object obj2 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) m528(list, 0, Class.class);
                obj = null;
            } else {
                obj = m528(list, 0, (Class<Object>) Object.class);
                if (obj != null) {
                    cls2 = obj.getClass();
                }
            }
            hpVar = (hp) m528(list, 1, hp.class);
        } else if (size != 3) {
            hpVar = null;
            obj = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) m528(list, 0, Class.class);
                if (list.get(1) instanceof hp) {
                    hpVar = (hp) m528(list, 1, hp.class);
                } else {
                    obj2 = m528(list, 1, (Class<Object>) Object.class);
                    hpVar = (hp) m528(list, 2, hp.class);
                }
            } else {
                obj2 = m528(list, 0, (Class<Object>) Object.class);
                cls = obj2.getClass();
                hpVar = (hp) m528(list, 1, hp.class);
            }
            Object obj3 = obj2;
            cls2 = cls;
            obj = obj3;
        }
        hr.ﻛ().ﾒ();
        return hw.ﻛ(cls2, obj, hpVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final <T> ht<T> m563(final dr drVar, final cp cpVar, List<Object> list) {
        Object obj = m528(list, 0, (Class<Object>) Object.class);
        final cm cmVar = (cm) m528(list, 1, cm.class);
        final List<Object> list2 = m529(list, 2);
        if (cmVar == null) {
            return null;
        }
        return hr.ﻛ().ﾒ().ﾇ(obj, cmVar.m426(new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.2
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final boolean m564(ht htVar) {
                return cmVar.m425().m456(htVar, drVar, cpVar, list2);
            }
        }));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m562(dr drVar, cp cpVar, List<Object> list) {
        ht htVarM563 = m563(drVar, cpVar, list);
        if (htVarM563 != null) {
            return htVarM563.ｋ();
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<ht> m561(final dr drVar, final cp cpVar, List<Object> list) {
        Object obj = m528(list, 0, (Class<Object>) Object.class);
        final cm cmVar = (cm) m528(list, 1, cm.class);
        final List<Object> list2 = m529(list, 2);
        if (cmVar == null) {
            return null;
        }
        return hr.ﻛ().ﾒ().ﾒ(obj, cmVar.m426(new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.df.5
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final boolean m565(ht htVar) {
                return cmVar.m425().m456(htVar, drVar, cpVar, list2);
            }
        }));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<Object> m560(dr drVar, cp cpVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (ht htVar : m561(drVar, cpVar, list)) {
            if (htVar != null) {
                arrayList.add(htVar.ｋ());
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m559(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hr.ﻛ().ﾒ().ｋ((Class) m528(list, 0, Class.class), (String) m528(list, 1, String.class));
        }
        Object obj = m528(list, 0, (Class<Object>) Object.class);
        if (list.get(1) instanceof List) {
            return hr.ﻛ().ﾒ().ﻐ(obj, new JSONArray((Collection) m528(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hr.ﻛ().ﾒ().ﻐ(obj, (JSONArray) m528(list, 1, JSONArray.class));
        }
        return hr.ﻛ().ﾒ().ﾒ(obj, (String) m528(list, 1, String.class));
    }
}
