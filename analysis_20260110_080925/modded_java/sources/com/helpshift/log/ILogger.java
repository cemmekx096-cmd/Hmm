package com.helpshift.log;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface ILogger {

    public enum LEVEL {
        DEBUG,
        WARN,
        ERROR
    }

    void d(String str, String str2);

    void d(String str, String str2, Throwable th);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);
}
