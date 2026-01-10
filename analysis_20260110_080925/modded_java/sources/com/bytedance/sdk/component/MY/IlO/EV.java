package com.bytedance.sdk.component.MY.IlO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class EV implements Cloneable {
    public TimeUnit Bc;
    public TimeUnit Cc;
    public TimeUnit EO;
    public List<lEW> IlO;
    public long MY;
    public long tV;
    public long vCE;

    public abstract MY IlO(rp rpVar);

    public abstract tV IlO();

    public EV(IlO ilO) {
        this.MY = ilO.MY;
        this.tV = ilO.tV;
        this.vCE = ilO.vCE;
        this.IlO = ilO.IlO;
        this.EO = ilO.EO;
        this.Cc = ilO.Cc;
        this.Bc = ilO.Bc;
        this.IlO = ilO.IlO;
    }

    public static final class IlO {
        public TimeUnit Bc;
        public TimeUnit Cc;
        public TimeUnit EO;
        public final List<lEW> IlO;
        public long MY;
        public long tV;
        public long vCE;

        public IlO() {
            this.IlO = new ArrayList();
            this.MY = 10000L;
            this.EO = TimeUnit.MILLISECONDS;
            this.tV = 10000L;
            this.Cc = TimeUnit.MILLISECONDS;
            this.vCE = 10000L;
            this.Bc = TimeUnit.MILLISECONDS;
        }

        public IlO(String str) {
            this.IlO = new ArrayList();
            this.MY = 10000L;
            this.EO = TimeUnit.MILLISECONDS;
            this.tV = 10000L;
            this.Cc = TimeUnit.MILLISECONDS;
            this.vCE = 10000L;
            this.Bc = TimeUnit.MILLISECONDS;
        }

        public IlO(EV ev) {
            this.IlO = new ArrayList();
            this.MY = 10000L;
            this.EO = TimeUnit.MILLISECONDS;
            this.tV = 10000L;
            this.Cc = TimeUnit.MILLISECONDS;
            this.vCE = 10000L;
            this.Bc = TimeUnit.MILLISECONDS;
            this.MY = ev.MY;
            this.EO = ev.EO;
            this.tV = ev.tV;
            this.Cc = ev.Cc;
            this.vCE = ev.vCE;
            this.Bc = ev.Bc;
        }

        public IlO IlO(long j, TimeUnit timeUnit) {
            this.MY = j;
            this.EO = timeUnit;
            return this;
        }

        public IlO MY(long j, TimeUnit timeUnit) {
            this.tV = j;
            this.Cc = timeUnit;
            return this;
        }

        public IlO EO(long j, TimeUnit timeUnit) {
            this.vCE = j;
            this.Bc = timeUnit;
            return this;
        }

        public IlO IlO(lEW lew) {
            this.IlO.add(lew);
            return this;
        }

        public EV IlO() {
            return com.bytedance.sdk.component.MY.IlO.IlO.IlO.IlO(this);
        }
    }

    public IlO MY() {
        return new IlO(this);
    }
}
