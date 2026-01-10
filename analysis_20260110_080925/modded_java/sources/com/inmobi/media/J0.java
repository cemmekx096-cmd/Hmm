package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.J0$;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class J0 extends ab {
    public final /* synthetic */ Q0 a;

    public J0(Q0 q0) {
        this.a = q0;
    }

    public static final void a(Q0 q0) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        q0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 43);
    }

    public static final void b(Q0 q0) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        q0.q = true;
        q0.f();
    }

    public final void f(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (2 == this.a.Q()) {
            this.a.q0();
        }
    }

    public final void g(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        new Handler(Looper.getMainLooper()).post(new J0$.ExternalSyntheticLambda1(this.a));
    }

    public final void h(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (2 == this.a.Q()) {
            new Handler(Looper.getMainLooper()).post(new J0$.ExternalSyntheticLambda0(this.a));
        }
    }

    public final void a(rc rcVar) {
        Intrinsics.checkNotNullParameter(rcVar, "telemetryOnAdImpression");
        this.a.a(rcVar);
    }
}
