package com.google.android.datatransport.runtime.retries;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult retry(int i, TInput tinput, Function<TInput, TResult, TException> function, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        TResult tresult;
        if (i < 1) {
            return (TResult) function.apply(tinput);
        }
        do {
            tresult = (TResult) function.apply(tinput);
            tinput = (TInput) retryStrategy.shouldRetry(tinput, tresult);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return tresult;
    }
}
