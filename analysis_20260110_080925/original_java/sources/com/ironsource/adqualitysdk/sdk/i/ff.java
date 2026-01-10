package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class ff<T> extends ee {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private T f493;

    public ff(T t, dm dmVar) {
        super(dmVar);
        this.f493 = t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        return new du(this.f493);
    }

    public String toString() {
        return new StringBuilder().append(this.f493).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f493;
            T t2 = ((ff) obj).f493;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f493;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
