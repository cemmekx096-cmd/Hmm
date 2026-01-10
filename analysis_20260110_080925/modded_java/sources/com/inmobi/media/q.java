package com.inmobi.media;

import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class q extends Lambda implements Function1 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j) {
        super(1);
        this.a = j;
    }

    public final Object invoke(Object obj) {
        b2 b2Var = (b2) obj;
        Intrinsics.checkNotNullParameter(b2Var, "it");
        int i = b2Var.a;
        if (i != 101) {
            if (i == 102) {
                ScheduledFuture scheduledFuture = s.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                s.f = null;
            }
        } else if (s.f == null && s.d.get()) {
            s sVar = s.a;
            s.a(this.a);
        }
        return Unit.INSTANCE;
    }
}
