package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class M0 extends Lambda implements Function1 {
    public final /* synthetic */ Q0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Q0 q0) {
        super(1);
        this.a = q0;
    }

    public final Object invoke(Object obj) {
        c4 c4Var = (c4) obj;
        Intrinsics.checkNotNullParameter(c4Var, "it");
        g5 g5Var = this.a.j;
        if (g5Var != null) {
            String strE = Q0.e();
            Intrinsics.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            g5Var.b(strE, "load with retry failed - max retry reached - No network");
        }
        this.a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, tc.a(c4Var));
        return Unit.INSTANCE;
    }
}
