package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j, String str);
}
