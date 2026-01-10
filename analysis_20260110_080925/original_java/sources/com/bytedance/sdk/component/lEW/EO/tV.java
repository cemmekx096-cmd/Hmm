package com.bytedance.sdk.component.lEW.EO;

import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tV implements ThreadFactory {
    public static volatile boolean EO;
    protected final ThreadGroup IlO;
    protected final String MY;
    private final AtomicInteger tV = new AtomicInteger(1);

    public tV(String str) {
        this.IlO = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.MY = IlO(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (EO) {
            return null;
        }
        Thread threadIlO = IlO(this.IlO, runnable, this.MY + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.tV.getAndIncrement());
        if (threadIlO.isDaemon()) {
            threadIlO.setDaemon(false);
        }
        return threadIlO;
    }

    protected Thread IlO(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String IlO(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
