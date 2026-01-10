package com.crashlytics.android.core;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    ByteString getLogAsByteString();

    byte[] getLogAsBytes();

    void writeToLog(long j, String str);
}
