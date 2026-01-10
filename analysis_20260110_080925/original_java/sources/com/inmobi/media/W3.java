package com.inmobi.media;

import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class W3 extends Lambda implements Function0 {
    public final /* synthetic */ Y3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(Y3 y3) {
        super(0);
        this.a = y3;
    }

    public final Object invoke() {
        O4 o4;
        ViewParent parent = this.a.getParent();
        Q3 q3 = parent instanceof Q3 ? (Q3) parent : null;
        if (q3 != null && (o4 = q3.d) != null) {
            x xVar = o4.a.b;
            Ya ya = xVar instanceof Ya ? (Ya) xVar : null;
            if (ya != null) {
                ya.m();
            }
        }
        return Unit.INSTANCE;
    }
}
