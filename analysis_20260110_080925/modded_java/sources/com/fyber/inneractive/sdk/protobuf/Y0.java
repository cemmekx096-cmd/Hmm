package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Y0 extends e1 {
    public final /* synthetic */ f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(f1 f1Var) {
        super(f1Var);
        this.b = f1Var;
    }

    public final Iterator iterator() {
        return new X0(this.b);
    }
}
