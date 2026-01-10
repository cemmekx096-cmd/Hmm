package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Ha extends Lambda implements Function0 {
    public static final Ha a = new Ha();

    public Ha() {
        super(0);
    }

    public final Object invoke() {
        ConcurrentHashMap concurrentHashMap = e6.b;
        Context contextD = Kb.d();
        Intrinsics.checkNotNull(contextD);
        e6 e6VarA = d6.a(contextD, "default");
        Intrinsics.checkNotNullParameter("enableImraidLogs", "key");
        return Boolean.valueOf(e6VarA.a.getBoolean("enableImraidLogs", false));
    }
}
