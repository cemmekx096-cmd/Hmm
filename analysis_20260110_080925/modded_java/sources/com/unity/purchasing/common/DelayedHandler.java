package com.unity.purchasing.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class DelayedHandler implements IDelayedExecutor {
    private Handler handler = new Handler(Looper.getMainLooper());

    public void ExecuteDelayed(Runnable runnable, long j) {
        this.handler.postDelayed(runnable, j);
    }
}
