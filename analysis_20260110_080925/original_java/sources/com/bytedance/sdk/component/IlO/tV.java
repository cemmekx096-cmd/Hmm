package com.bytedance.sdk.component.IlO;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class tV<P, R> extends com.bytedance.sdk.component.IlO.MY<P, R> {
    private vCE EO;
    private boolean IlO = true;
    private IlO MY;

    interface IlO {
        void IlO(Object obj);

        void IlO(Throwable th);
    }

    public interface MY {
        tV IlO();
    }

    protected abstract void IlO(P p, vCE vce) throws Exception;

    public /* bridge */ /* synthetic */ String IlO() {
        return super.IlO();
    }

    protected final void IlO(R r) {
        if (vCE()) {
            this.MY.IlO(r);
            tV();
        }
    }

    protected final void IlO(Throwable th) {
        if (vCE()) {
            this.MY.IlO(th);
            tV();
        }
    }

    protected final void EO() {
        IlO((Throwable) null);
    }

    protected void tV() {
        this.IlO = false;
        this.EO = null;
    }

    void IlO(P p, vCE vce, IlO ilO) throws Exception {
        this.EO = vce;
        this.MY = ilO;
        IlO(p, vce);
    }

    void Cc() {
        tV();
    }

    private boolean vCE() {
        if (this.IlO) {
            return true;
        }
        DmF.IlO(new IllegalStateException("Jsb async call already finished: " + IlO() + ", hashcode: " + hashCode()));
        return false;
    }
}
