package com.inmobi.media;

import com.crashlytics.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class S1 {
    public String a;
    public long b;
    public int c;
    public String d;

    public S1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "eventType");
        this.a = str;
        this.d = str2;
        this.b = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.d;
        return str == null ? BuildConfig.FLAVOR : str;
    }
}
