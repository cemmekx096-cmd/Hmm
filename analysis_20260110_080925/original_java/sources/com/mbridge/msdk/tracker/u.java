package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.safedk.android.analytics.brandsafety.p;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: ReportMonitor.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class u {
    private static volatile u g;
    private m a;
    private x b;
    private volatile boolean c = false;
    private int d = p.c;
    private final HashMap<String, String> e = new HashMap<>();
    Handler f = new a(Looper.getMainLooper());

    /* compiled from: ReportMonitor.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                u.this.b();
                u.this.f.removeMessages(1);
                u.this.d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f.sendEmptyMessageDelayed(1, this.d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:5:0x0008, B:7:0x000d, B:9:0x001b, B:12:0x002e, B:15:0x003a, B:18:0x005a, B:23:0x00a8, B:20:0x0074), top: B:28:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() throws org.json.JSONException {
        /*
            r14 = this;
            com.mbridge.msdk.tracker.m[] r0 = com.mbridge.msdk.tracker.m.b()
            int r1 = r0.length
            if (r1 != 0) goto L8
            return
        L8:
            int r1 = r0.length     // Catch: java.lang.Exception -> Laf
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto Lb3
            r4 = r0[r3]     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = r4.f()     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = "monitor"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> Laf
            if (r6 != 0) goto Lab
            java.lang.String r6 = r4.d()     // Catch: java.lang.Exception -> Laf
            long[] r4 = r4.e()     // Catch: java.lang.Exception -> Laf
            r7 = 1
            r8 = r4[r7]     // Catch: java.lang.Exception -> Laf
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L2e
            goto Lab
        L2e:
            r10 = r4[r2]     // Catch: java.lang.Exception -> Laf
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.e     // Catch: java.lang.Exception -> Laf
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Exception -> Laf
            java.lang.String r12 = ""
            if (r4 == 0) goto L5a
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.e     // Catch: java.lang.Exception -> Laf
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Laf
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r13.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r13 = r13.append(r10)     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r13 = r13.append(r12)     // Catch: java.lang.Exception -> Laf
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> Laf
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto L5a
            goto Lab
        L5a:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.e     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r13.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r13 = r13.append(r10)     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r12 = r13.append(r12)     // Catch: java.lang.Exception -> Laf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> Laf
            r4.put(r5, r12)     // Catch: java.lang.Exception -> Laf
            com.mbridge.msdk.tracker.m r4 = r14.a     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto Lab
            com.mbridge.msdk.tracker.e r4 = new com.mbridge.msdk.tracker.e     // Catch: java.lang.Exception -> La7
            java.lang.String r12 = "event_lib_monitor"
            r4.<init>(r12)     // Catch: java.lang.Exception -> La7
            r4.a(r7)     // Catch: java.lang.Exception -> La7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> La7
            r7.<init>()     // Catch: java.lang.Exception -> La7
            java.lang.String r12 = "key"
            java.lang.String r13 = "m_report_rate"
            r7.put(r12, r13)     // Catch: java.lang.Exception -> La7
            java.lang.String r12 = "task_name"
            r7.put(r12, r5)     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "task_count"
            r7.put(r5, r8)     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "task_session_id"
            r7.put(r5, r6)     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "task_ts"
            r7.put(r5, r10)     // Catch: java.lang.Exception -> La7
            r4.a(r7)     // Catch: java.lang.Exception -> La7
            com.mbridge.msdk.tracker.m r5 = r14.a     // Catch: java.lang.Exception -> La7
            r5.d(r4)     // Catch: java.lang.Exception -> La7
            goto Lab
        La7:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Exception -> Laf
        Lab:
            int r3 = r3 + 1
            goto Lb
        Laf:
            r0 = move-exception
            r0.printStackTrace()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.u.b():void");
    }

    public synchronized void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        d();
    }

    public void a(Context context, x xVar, int i, JSONObject jSONObject) {
        this.b = xVar;
        this.d = i;
        m mVarA = m.a("monitor", context, xVar);
        this.a = mVarA;
        if (mVarA != null) {
            mVarA.a(jSONObject);
            this.a.h();
        }
        c();
    }

    public static u a() {
        if (g == null) {
            synchronized (u.class) {
                if (g == null) {
                    g = new u();
                }
            }
        }
        return g;
    }
}
