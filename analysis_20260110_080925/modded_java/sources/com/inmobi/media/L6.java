package com.inmobi.media;

import com.inmobi.media.L6$;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class L6 {
    public static void a(A6 a6, long j, int i) {
        Intrinsics.checkNotNullParameter(a6, "dao");
        if (M6.d.getAndSet(true)) {
            return;
        }
        Runnable externalSyntheticLambda0 = new L6$.ExternalSyntheticLambda0(a6, j, i);
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        Intrinsics.checkNotNullParameter(externalSyntheticLambda0, "runnable");
        Xc.a.schedule(externalSyntheticLambda0, 10000L, TimeUnit.MILLISECONDS);
    }

    public static final void b(A6 a6, long j, int i) {
        Intrinsics.checkNotNullParameter(a6, "$dao");
        a6.getClass();
        for (z6 z6Var : R1.a(a6, "id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j + " ORDER BY saveTimestamp DESC LIMIT " + i + ") AS foo);", null, null, null, null, null, 62)) {
            if (z6Var != null) {
                N6.a(z6Var.a);
                a6.a(z6Var);
            }
        }
        M6.d.set(false);
    }

    public static Object a(Function0 function0) {
        Semaphore semaphore;
        Intrinsics.checkNotNullParameter(function0, "run");
        try {
            Result.Companion companion = Result.Companion;
            try {
                try {
                    semaphore = M6.c;
                    semaphore.acquire();
                    function0.invoke();
                } catch (Throwable th) {
                    M6.c.release();
                    throw th;
                }
            } catch (Exception e) {
                w5 w5Var = w5.a;
                d2 d2Var = new d2(e);
                Intrinsics.checkNotNullParameter(d2Var, "event");
                w5.d.a(d2Var);
                semaphore = M6.c;
            }
            semaphore.release();
            return Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }
}
