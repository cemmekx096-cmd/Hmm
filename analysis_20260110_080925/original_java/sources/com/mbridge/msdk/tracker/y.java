package com.mbridge.msdk.tracker;

import android.database.Cursor;
import java.util.List;

/* compiled from: Utils.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class y {
    public static long a(int i, long j, long j2) {
        if (i <= 0 || j == 0 || i <= 10) {
            return j2;
        }
        if (i <= 20) {
            return 60000L;
        }
        if (i <= 30) {
            return 120000L;
        }
        if (i <= 40) {
            return 180000L;
        }
        return i <= 50 ? 240000L : 300000L;
    }

    static boolean a(Object obj) {
        return obj != null;
    }

    static boolean a(List<i> list) {
        if (b((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!b(iVar)) {
                e eVarA = iVar.a();
                if (!b(eVarA) && eVarA.c() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(Object obj) {
        return obj == null;
    }

    static boolean b(List<?> list) {
        return list == null || list.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.util.List<com.mbridge.msdk.tracker.i> b(android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.y.b(android.database.Cursor):java.util.List");
    }

    static boolean a(e eVar) {
        return a((Object) eVar) && eVar.c() == 1;
    }

    static void a(Cursor cursor) {
        boolean z = false;
        try {
            if (a((Object) cursor)) {
                if (!cursor.isClosed()) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        if (z) {
            try {
                cursor.close();
            } catch (Exception unused2) {
            }
        }
    }
}
