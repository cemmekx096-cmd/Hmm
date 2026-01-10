package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: Http2Stream.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class i {
    static final /* synthetic */ boolean l = true;
    long a = 0;
    long b;
    final int c;
    final g d;
    private final Deque<p> e;
    private boolean f;
    private final b g;
    final a h;
    final c i;
    final c j;
    com.mbridge.msdk.thrid.okhttp.internal.http2.b k;

    /* compiled from: Http2Stream.java */
    class c extends com.mbridge.msdk.thrid.okio.a {
        c() {
        }

        protected IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        protected void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b(null);
            }
        }
    }

    i(int i, g gVar, boolean z, boolean z2, @Nullable p pVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new c();
        this.j = new c();
        this.k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.d = gVar;
        this.b = gVar.u.c();
        b bVar = new b(gVar.t.c());
        this.g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.e = z2;
        aVar.c = z;
        if (pVar != null) {
            arrayDeque.add(pVar);
        }
        if (f() && pVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && pVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.c;
    }

    public r d() {
        synchronized (this) {
            if (!this.f && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public s e() {
        return this.g;
    }

    public boolean f() {
        return this.d.a == ((this.c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.k != null) {
            return false;
        }
        b bVar = this.g;
        if (bVar.e || bVar.d) {
            a aVar = this.h;
            if (aVar.c || aVar.b) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    public t h() {
        return this.i;
    }

    void i() {
        boolean zG;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.g.e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.d.c(this.c);
    }

    public synchronized p j() throws IOException {
        this.i.h();
        while (this.e.isEmpty() && this.k == null) {
            try {
                k();
            } catch (Throwable th) {
                this.i.k();
                throw th;
            }
        }
        this.i.k();
        if (this.e.isEmpty()) {
            throw new n(this.k);
        }
        return this.e.removeFirst();
    }

    void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.e && this.h.c) {
                return false;
            }
            this.k = bVar;
            notifyAll();
            this.d.c(this.c);
            return true;
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.d.b(this.c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.d.c(this.c, bVar);
        }
    }

    /* compiled from: Http2Stream.java */
    final class a implements r {
        static final /* synthetic */ boolean e = true;
        private final com.mbridge.msdk.thrid.okio.c a = new com.mbridge.msdk.thrid.okio.c();
        boolean b;
        boolean c;

        a() {
        }

        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.a.a(cVar, j);
            while (this.a.size() >= 16384) {
                a(false);
            }
        }

        public t b() {
            return i.this.j;
        }

        public void close() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.b) {
                    return;
                }
                if (!i.this.h.c) {
                    if (this.a.size() > 0) {
                        while (this.a.size() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.d.a(iVar.c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.b = true;
                }
                i.this.d.flush();
                i.this.a();
            }
        }

        public void flush() throws IOException {
            if (!e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.a.size() > 0) {
                a(false);
                i.this.d.flush();
            }
        }

        private void a(boolean z) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.b > 0 || this.c || this.b || iVar.k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                    }
                }
                iVar.j.k();
                i.this.b();
                jMin = Math.min(i.this.b, this.a.size());
                iVar2 = i.this;
                iVar2.b -= jMin;
            }
            iVar2.j.h();
            try {
                i iVar3 = i.this;
                iVar3.d.a(iVar3.c, z && jMin == this.a.size(), this.a, jMin);
            } finally {
            }
        }
    }

    void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f = true;
            this.e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.d.c(this.c);
    }

    synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    void b() throws IOException {
        a aVar = this.h;
        if (!aVar.b) {
            if (!aVar.c) {
                if (this.k != null) {
                    throw new n(this.k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    void a(com.mbridge.msdk.thrid.okio.e eVar, int i) throws IOException {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.g.a(eVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.l
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$b r0 = r2.g     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L28
            boolean r0 = r0.d     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$a r0 = r2.h     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L26
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L36
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL
            r2.a(r0)
            goto L3f
        L36:
            if (r1 != 0) goto L3f
            com.mbridge.msdk.thrid.okhttp.internal.http2.g r0 = r2.d
            int r1 = r2.c
            r0.c(r1)
        L3f:
            return
        L40:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.a():void");
    }

    void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* compiled from: Http2Stream.java */
    private final class b implements s {
        static final /* synthetic */ boolean g = true;
        private final com.mbridge.msdk.thrid.okio.c a = new com.mbridge.msdk.thrid.okio.c();
        private final com.mbridge.msdk.thrid.okio.c b = new com.mbridge.msdk.thrid.okio.c();
        private final long c;
        boolean d;
        boolean e;

        b(long j) {
            this.c = j;
        }

        private void f(long j) {
            if (!g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.d.g(j);
        }

        void a(com.mbridge.msdk.thrid.okio.e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long size;
            if (!g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (i.this) {
                    z = this.e;
                    z2 = true;
                    z3 = this.b.size() + j > this.c;
                }
                if (z3) {
                    eVar.skip(j);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.skip(j);
                    return;
                }
                long jB = eVar.b(this.a, j);
                if (jB == -1) {
                    throw new EOFException();
                }
                j -= jB;
                synchronized (i.this) {
                    if (this.d) {
                        size = this.a.size();
                        this.a.k();
                    } else {
                        if (this.b.size() != 0) {
                            z2 = false;
                        }
                        this.b.a(this.a);
                        if (z2) {
                            i.this.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long b(com.mbridge.msdk.thrid.okio.c r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Laf
            L6:
                r2 = 0
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this
                monitor-enter(r3)
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r4 = r4.i     // Catch: java.lang.Throwable -> Lac
                r4.h()     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.b r5 = r4.k     // Catch: java.lang.Throwable -> La3
                if (r5 == 0) goto L18
                r2 = r5
            L18:
                boolean r5 = r11.d     // Catch: java.lang.Throwable -> La3
                if (r5 != 0) goto L9b
                java.util.Deque r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.a(r4)     // Catch: java.lang.Throwable -> La3
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L2b
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i.b(r4)     // Catch: java.lang.Throwable -> La3
            L2b:
                com.mbridge.msdk.thrid.okio.c r4 = r11.b     // Catch: java.lang.Throwable -> La3
                long r4 = r4.size()     // Catch: java.lang.Throwable -> La3
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L6d
                com.mbridge.msdk.thrid.okio.c r4 = r11.b     // Catch: java.lang.Throwable -> La3
                long r7 = r4.size()     // Catch: java.lang.Throwable -> La3
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> La3
                long r12 = r4.b(r12, r13)     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                long r7 = r14.a     // Catch: java.lang.Throwable -> La3
                long r7 = r7 + r12
                r14.a = r7     // Catch: java.lang.Throwable -> La3
                if (r2 != 0) goto L82
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r14 = r14.d     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.m r14 = r14.t     // Catch: java.lang.Throwable -> La3
                int r14 = r14.c()     // Catch: java.lang.Throwable -> La3
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> La3
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L82
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r4 = r14.d     // Catch: java.lang.Throwable -> La3
                int r7 = r14.c     // Catch: java.lang.Throwable -> La3
                long r8 = r14.a     // Catch: java.lang.Throwable -> La3
                r4.a(r7, r8)     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                r14.a = r0     // Catch: java.lang.Throwable -> La3
                goto L82
            L6d:
                boolean r4 = r11.e     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L81
                if (r2 != 0) goto L81
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                r2.k()     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r2 = r2.i     // Catch: java.lang.Throwable -> Lac
                r2.k()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                goto L6
            L81:
                r12 = r5
            L82:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r14 = r14.i     // Catch: java.lang.Throwable -> Lac
                r14.k()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L92
                r11.f(r12)
                return r12
            L92:
                if (r2 != 0) goto L95
                return r5
            L95:
                com.mbridge.msdk.thrid.okhttp.internal.http2.n r12 = new com.mbridge.msdk.thrid.okhttp.internal.http2.n
                r12.<init>(r2)
                throw r12
            L9b:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> La3
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> La3
                throw r12     // Catch: java.lang.Throwable -> La3
            La3:
                r12 = move-exception
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r13 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r13 = r13.i     // Catch: java.lang.Throwable -> Lac
                r13.k()     // Catch: java.lang.Throwable -> Lac
                throw r12     // Catch: java.lang.Throwable -> Lac
            Lac:
                r12 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                throw r12
            Laf:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r13 = r0.append(r13)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.b.b(com.mbridge.msdk.thrid.okio.c, long):long");
        }

        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                this.d = true;
                size = this.b.size();
                this.b.k();
                if (!i.this.e.isEmpty()) {
                    i.b(i.this);
                }
                i.this.notifyAll();
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        public t b() {
            return i.this.i;
        }
    }
}
