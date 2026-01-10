package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class h {
    private static final String d = "ClickUrlCandidate";
    public long a;
    public String b;
    public String c;

    public h(long j, String str, String str2) {
        this.a = 0L;
        Logger.d(d, "click URL candidate, current time: " + j + ", click URL: " + str + ", view address: " + str2);
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public h(long j, String str) {
        this.a = 0L;
        Logger.d(d, "click url candidate, currentTime=" + j + ", clickUrl=" + str);
        this.a = j;
        this.b = str;
    }
}
