package com.inmobi.media;

import com.crashlytics.android.BuildConfig;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class S0 {
    public final Q0 a;
    public final sc b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final R0 j;

    public S0(Q0 q0) {
        Intrinsics.checkNotNullParameter(q0, "adUnit");
        this.a = q0;
        this.b = new sc();
        this.j = new R0(this);
    }

    public final String a() {
        x0 x0VarY;
        LinkedList linkedListF;
        h hVar;
        String strW;
        Q0 q0 = this.a;
        return (q0 == null || (x0VarY = q0.y()) == null || (linkedListF = x0VarY.f()) == null || (hVar = (h) CollectionsKt.firstOrNull(linkedListF)) == null || (strW = hVar.w()) == null) ? BuildConfig.FLAVOR : strW;
    }
}
