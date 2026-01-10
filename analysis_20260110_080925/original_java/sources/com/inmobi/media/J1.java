package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class J1 extends Lambda implements Function1 {
    public final /* synthetic */ K1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(K1 k1) {
        super(1);
        this.a = k1;
    }

    public final Object invoke(Object obj) {
        c4 c4Var = (c4) obj;
        Intrinsics.checkNotNullParameter(c4Var, "it");
        K1 k1 = this.a;
        g5 g5Var = k1.j;
        if (g5Var != null) {
            String str = k1.M;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.b(str, "loadWithRetry error - " + c4Var);
        }
        this.a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, tc.a(c4Var));
        return Unit.INSTANCE;
    }
}
