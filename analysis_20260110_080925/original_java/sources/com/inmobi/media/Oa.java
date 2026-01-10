package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Oa extends Lambda implements Function1 {
    public final /* synthetic */ Ya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(Ya ya) {
        super(1);
        this.a = ya;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Ya ya = this.a;
        g5 g5Var = ya.i;
        if (g5Var != null) {
            String str = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            g5Var.c(str, "onRenderProcessGone");
        }
        ya.getListener().a(ya, zBooleanValue);
        return Unit.INSTANCE;
    }
}
