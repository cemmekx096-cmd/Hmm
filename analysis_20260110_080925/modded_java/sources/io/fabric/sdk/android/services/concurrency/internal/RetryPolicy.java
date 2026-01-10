package io.fabric.sdk.android.services.concurrency.internal;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface RetryPolicy {
    boolean shouldRetry(int i, Throwable th);
}
