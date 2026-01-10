package com.inmobi.media;

import android.os.Looper;
import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.A$;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class A {
    public static final A a = new A();
    public static final SparseArray b = new SparseArray();
    public static final ThreadPoolExecutor c;

    public static void a(int i, E1 e1) {
        Intrinsics.checkNotNullParameter(e1, "task");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            c(i, e1);
            return;
        }
        P6 p6 = (P6) m4.d.getValue();
        Runnable externalSyntheticLambda0 = new A$.ExternalSyntheticLambda0(i, e1);
        p6.getClass();
        Intrinsics.checkNotNullParameter(externalSyntheticLambda0, "runnable");
        p6.a.post(externalSyntheticLambda0);
    }

    public static final void b(int i, E1 e1) {
        Intrinsics.checkNotNullParameter(e1, "$task");
        c(i, e1);
    }

    public static void c(int i, E1 e1) {
        try {
            SparseArray sparseArray = b;
            Queue linkedList = (Queue) sparseArray.get(i);
            if (linkedList == null) {
                linkedList = new LinkedList();
                sparseArray.put(i, linkedList);
            }
            linkedList.add(e1);
            Runnable runnable = (E1) linkedList.peek();
            if (linkedList.size() != 1 || runnable == null) {
                return;
            }
            try {
                c.execute(runnable);
            } catch (OutOfMemoryError unused) {
                runnable.c();
            }
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }

    static {
        LinkedHashMap linkedHashMap = K2.a;
        AdConfig adConfigA = V4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfigA.getMaxPoolSize(), adConfigA.getMaxPoolSize(), 5L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new p5("A".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        c = threadPoolExecutor;
    }
}
