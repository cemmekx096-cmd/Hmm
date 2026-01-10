package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class L implements F {
    public static final H g = new H();
    public final PriorityBlockingQueue a = new PriorityBlockingQueue(100, new K());
    public volatile boolean b = false;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), g);
    public final I e = new I(this);
    public final j0 f = new j0();

    public static void a(U u, l lVar, O o) {
        try {
            if (u.a || u.f() == null || o == null || lVar == null || lVar.a != 200) {
                return;
            }
            u.a(o, u.f(), lVar.e);
        } catch (Exception e) {
            IAlog.a("Failed cache network response data", e, new Object[0]);
        }
    }

    public final void b(U u) {
        P p;
        if (!this.a.offer(u)) {
            IAlog.a("Request queue is full! current request is dropped! %s", new Object[]{u.p()});
            return;
        }
        i0 i0Var = i0.QUEUED;
        u.f = i0Var;
        if (i0Var != i0.QUEUED_FOR_RETRY || (p = u.d) == null) {
            return;
        }
        p.a("sdkRequestEndedButWillBeRetried");
    }

    public final void c(U u) {
        j0 j0Var = this.f;
        j0Var.getClass();
        String str = u.g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", new Object[]{IAlog.a(j0Var), str});
        n0 n0Var = (n0) j0Var.a.get(str);
        if (n0Var != null) {
            r.b.removeCallbacks(n0Var.d);
        }
        j0Var.a.remove(str);
    }

    public final boolean d(U u) {
        if (!u.s()) {
            return false;
        }
        u.f = i0.QUEUED_FOR_RETRY;
        P p = u.d;
        if (p != null) {
            p.a("sdkRequestEndedButWillBeRetried");
        }
        long jE = u.e();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", new Object[]{u.getClass().getName(), Long.valueOf(jE)});
        this.c.postDelayed(new J(this, u), jE);
        return true;
    }

    public static void a(U u, O o) {
        try {
            if (u.a || o == null) {
                return;
            }
            u.a(o.a, (Exception) null, false);
        } catch (Exception e) {
            IAlog.a("failed notifying the listener request complete", e, new Object[0]);
            if (u.a) {
                return;
            }
            u.a((Object) null, e, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.network.s0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.network.t0 */
    public final O a(U u, l lVar) throws Exception {
        O oA = null;
        if (lVar != null) {
            try {
                if (!u.a) {
                    int i = lVar.a;
                    if (i == 200 || (i >= 300 && i < 304)) {
                        oA = u.a(lVar, lVar.d, i);
                    } else if (i == 304) {
                        u.a((Object) null, new g(), false);
                    } else {
                        u.a((Object) null, new k0(lVar.b, lVar.a), false);
                    }
                }
            } catch (t0 e) {
                IAlog.a("failed parsing network request but will retry", e, new Object[0]);
                if (d(u)) {
                    throw e;
                }
                throw new s0(e);
            } catch (Exception e2) {
                IAlog.a("failed parsing network request", e2, new Object[0]);
                throw e2;
            }
        }
        return oA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.network.s0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.network.t0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.U r4, com.fyber.inneractive.sdk.network.a r5) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.String r0 = "failed sending network request"
            r1 = 0
            boolean r2 = r4.a     // Catch: java.lang.Exception -> L18 java.net.SocketTimeoutException -> L1f com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23 com.fyber.inneractive.sdk.network.t0 -> L3b
            if (r2 != 0) goto L16
            if (r5 == 0) goto Lc
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L18 java.net.SocketTimeoutException -> L1f com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23 com.fyber.inneractive.sdk.network.t0 -> L3b
            goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            a()     // Catch: java.lang.Exception -> L18 java.net.SocketTimeoutException -> L1f com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23 com.fyber.inneractive.sdk.network.t0 -> L3b
            com.fyber.inneractive.sdk.network.l r4 = r4.a(r5)     // Catch: java.lang.Exception -> L18 java.net.SocketTimeoutException -> L1f com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23 com.fyber.inneractive.sdk.network.t0 -> L3b
            goto L17
        L16:
            r4 = 0
        L17:
            return r4
        L18:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r4, r5)
            throw r4
        L1f:
            r5 = move-exception
            goto L24
        L21:
            r5 = move-exception
            goto L24
        L23:
            r5 = move-exception
        L24:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r5, r1)
            boolean r4 = r3.d(r4)
            if (r4 == 0) goto L35
            com.fyber.inneractive.sdk.network.t0 r4 = new com.fyber.inneractive.sdk.network.t0
            r4.<init>(r5)
            throw r4
        L35:
            com.fyber.inneractive.sdk.network.s0 r4 = new com.fyber.inneractive.sdk.network.s0
            r4.<init>(r5)
            throw r4
        L3b:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "failed sending network request but will retry"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r5, r0)
            boolean r4 = r3.d(r4)
            if (r4 == 0) goto L4a
            throw r5
        L4a:
            com.fyber.inneractive.sdk.network.s0 r4 = new com.fyber.inneractive.sdk.network.s0
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.L.a(com.fyber.inneractive.sdk.network.U, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.l");
    }

    public static void a(U u) {
        P p;
        try {
            l lVar = u.e;
            if (lVar != null) {
                lVar.a();
            }
            u.c.getClass();
        } catch (Exception unused) {
        }
        i0 i0Var = i0.DONE;
        u.f = i0Var;
        if (i0Var != i0.QUEUED_FOR_RETRY || (p = u.d) == null) {
            return;
        }
        p.a("sdkRequestEndedButWillBeRetried");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fyber.inneractive.sdk.network.b */
    public static void a() throws b {
        NetworkInfo activeNetworkInfo;
        Boolean boolC = IAConfigManager.O.M.a(l.class).c("should_use_is_network_connected");
        boolean z = false;
        if (boolC != null ? boolC.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) o.a.getSystemService("connectivity");
                activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    z = true;
                }
            }
            if (!z) {
                throw new b("No network connection");
            }
        }
    }
}
