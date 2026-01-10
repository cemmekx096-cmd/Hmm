package com.bytedance.adsdk.ugeno.tV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tV {
    private static Map<String, MY> IlO = new HashMap();

    public static void IlO(List<MY> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (MY my : list) {
            if (my != null) {
                IlO.put(my.IlO(), my);
            }
        }
    }

    public static MY IlO(String str) {
        return IlO.get(str);
    }
}
