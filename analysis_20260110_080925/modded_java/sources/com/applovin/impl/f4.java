package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.j2;
import com.applovin.impl.l0;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class f4 extends j2 {
    private final l0.a n;
    private final Context o;
    private final boolean p;

    public f4(l0.a aVar, boolean z, Context context) {
        super(j2.c.f);
        this.n = aVar;
        this.o = context;
        ((j2) this).c = new SpannedString(aVar.a());
        this.p = z;
    }

    public SpannedString f() {
        return new SpannedString(this.n.a(this.o));
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        Boolean boolB = this.n.b(this.o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
