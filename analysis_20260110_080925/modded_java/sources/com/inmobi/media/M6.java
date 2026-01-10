package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class M6 {
    public static final ScheduledExecutorService a;
    public static final ExecutorService b;
    public static final Semaphore c;
    public static final AtomicBoolean d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new p5("Log", true));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        a = scheduledExecutorServiceNewScheduledThreadPool;
        b = Executors.newSingleThreadExecutor(new p5("LogSingle", true));
        c = new Semaphore(1);
        d = new AtomicBoolean(false);
    }
}
