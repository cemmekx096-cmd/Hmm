package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.e;
import com.apm.insight.entity.b;
import com.apm.insight.l.k;
import com.apm.insight.runtime.m;
import com.google.firebase.messaging.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ApmConfigFetcher.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class a {
    private static Runnable a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (k.b(e.g())) {
                a.i();
            }
            if (a.b > 0) {
                if (com.apm.insight.l.a.b(e.g())) {
                    m.a().a(a.a, 15000L);
                } else {
                    m.a().a(a.a, 60000L);
                }
            }
        }
    };
    private static int b = 0;

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    public static void a() {
        b = 40;
        m.a().a(a);
    }

    public static void b() {
        if (!j.b()) {
            j.c();
        }
        if (k.b(e.g()) && j.g()) {
            i();
        }
    }

    private static byte[] h() {
        try {
            return e.a(e.i().getConfigUrl(), b.a().toString().getBytes());
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        int i = b;
        if (i > 0) {
            b = i - 1;
        }
        com.apm.insight.a.a("try fetchApmConfig");
        if (com.apm.insight.l.a.b(e.g())) {
            JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrH = h();
                if (bArrH != null) {
                    jSONArrayOptJSONArray = new JSONObject(new String(bArrH)).optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
            } catch (Throwable th) {
                if (e.i().isDebugMode()) {
                    Log.e("npth", "npth NPTH Catch Error", th);
                }
            }
            com.apm.insight.a.a("after fetchApmConfig net ".concat(String.valueOf(jSONArrayOptJSONArray)));
            if (jSONArrayOptJSONArray != null) {
                com.apm.insight.runtime.a.a(jSONArrayOptJSONArray, true);
                b = 0;
                return;
            } else {
                b -= 10;
                return;
            }
        }
        j.c();
        if (j.a()) {
            b = 0;
        }
    }
}
