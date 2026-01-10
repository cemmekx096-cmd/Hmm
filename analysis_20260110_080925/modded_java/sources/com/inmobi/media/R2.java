package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class R2 {
    public static final Pair a(TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            return TuplesKt.to(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        M2 m2 = new M2();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            long jA = m2.a(str, ((Config) entry.getValue()).getAccountId$media_release());
            arrayList.add(str);
            arrayList2.add(Long.valueOf(jA));
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
