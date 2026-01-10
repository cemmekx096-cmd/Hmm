package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class p extends Lambda implements Function0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(0);
        this.a = context;
    }

    public final Object invoke() {
        n nVar = s.c;
        if (nVar != null) {
            z2.a(new o(this.a, nVar));
            s.c = null;
        }
        ScheduledFuture scheduledFuture = s.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        q qVar = s.h;
        if (qVar != null) {
            Kb.f().a(qVar);
        }
        s.h = null;
        s.f = null;
        return Unit.INSTANCE;
    }
}
