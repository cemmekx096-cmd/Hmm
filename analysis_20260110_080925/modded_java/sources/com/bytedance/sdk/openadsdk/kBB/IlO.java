package com.bytedance.sdk.openadsdk.kBB;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.rp;
import com.bytedance.sdk.openadsdk.utils.zLG;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class IlO {
    private static int IlO(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static List<String> IlO(List<String> list, boolean z) {
        String strIlO = rp.IlO(cl.IlO());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strIlO)) {
                next = next.replace("{UID}", strIlO).replace("__UID__", strIlO);
            }
            if (z) {
                next = IlO(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String IlO(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            oeT.EO("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> IlO(List<String> list, boolean z, com.bytedance.sdk.openadsdk.core.model.oeT oet) {
        String strIlO = rp.IlO(cl.IlO());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strIlO)) {
                next = next.replace("{UID}", strIlO).replace("__UID__", strIlO);
            }
            if (next.contains("__CID__") && oet != null && !TextUtils.isEmpty(oet.ED())) {
                next = next.replace("__CID__", oet.ED());
            }
            if (next.contains("__CTYPE__") && oet != null) {
                next = next.replace("__CTYPE__", String.valueOf(IlO(oet.uI())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().MY());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(zLG.EO()));
            }
            if (z) {
                next = IlO(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
