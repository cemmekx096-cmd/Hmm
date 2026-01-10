package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class X0 implements Iterator {
    public int a;
    public Iterator b;
    public final /* synthetic */ f1 c;

    public X0(f1 f1Var) {
        this.c = f1Var;
        this.a = f1Var.b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i <= 0 || i > this.c.b.size()) {
            if (this.b == null) {
                this.b = this.c.f.entrySet().iterator();
            }
            if (!this.b.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        if (this.b.hasNext()) {
            if (this.b == null) {
                this.b = this.c.f.entrySet().iterator();
            }
            return (Map.Entry) this.b.next();
        }
        List list = this.c.b;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
