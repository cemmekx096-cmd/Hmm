package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class R7 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ S7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(S7 s7, String str) {
        super(0);
        this.a = str;
        this.b = s7;
    }

    public final Object invoke() {
        j jVarB = Db.a().b(this.a);
        v4 v4VarA = null;
        if (jVarB == null) {
            return null;
        }
        S7 s7 = this.b;
        try {
            String str = jVarB.c;
            if (str == null) {
                return null;
            }
            v4VarA = S7.a(s7, str);
            Unit unit = Unit.INSTANCE;
            return v4VarA;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(s7.x, "access$getTAG$p(...)");
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            Unit unit2 = Unit.INSTANCE;
            return v4VarA;
        }
    }
}
