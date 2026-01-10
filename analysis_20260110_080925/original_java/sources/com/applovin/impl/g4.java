package com.applovin.impl;

import androidx.credentials.CredentialManager$;
import com.applovin.impl.g4$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class g4 {
    public static final Executor h = new g4$.ExternalSyntheticLambda2();
    public static final Executor i = new CredentialManager$.ExternalSyntheticLambda0();
    private final String b;
    private volatile Object f;
    private volatile Object g;
    private final Object a = new Object();
    private final List c = new ArrayList();
    private volatile boolean d = false;
    private volatile boolean e = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z, Object obj, Object obj2);
    }

    public g4(String str) {
        this.b = str;
    }

    public static g4 a(String str, Object obj) {
        return new g4(str).b(obj);
    }

    public g4 b(Object obj) {
        a(true, obj, null);
        return this;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.d && !this.e;
    }

    public String toString() {
        return "Promise(" + b() + ": " + (!this.d ? "Waiting" : this.e ? "Success -> " + this.f : "Failed -> " + this.g) + ")";
    }

    private Runnable c(Executor executor, b bVar) {
        return new g4$.ExternalSyntheticLambda1(this, executor, bVar);
    }

    public g4 a(Object obj) {
        a(false, null, obj);
        return this;
    }

    public String b() {
        String str = this.b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new g4$.ExternalSyntheticLambda0(this, bVar));
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, (b) new g4$.ExternalSyntheticLambda3(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, (b) new g4$.ExternalSyntheticLambda4(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.a) {
            if (!this.d) {
                this.c.add(runnableC);
            } else {
                runnableC.run();
            }
        }
    }

    public Object a() {
        g1.a(d());
        return this.g;
    }

    private void a(boolean z, Object obj, Object obj2) {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            this.f = obj;
            this.g = obj2;
            this.e = z;
            this.d = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.e, this.f, this.g);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        g1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.E().a("Promise", "PromiseCallback: " + b(), th);
        }
    }
}
