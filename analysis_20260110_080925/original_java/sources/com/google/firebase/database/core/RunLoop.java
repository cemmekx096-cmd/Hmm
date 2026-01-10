package com.google.firebase.database.core;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface RunLoop {
    void restart();

    ScheduledFuture schedule(Runnable runnable, long j);

    void scheduleNow(Runnable runnable);

    void shutdown();
}
