package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.BufferedOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class m {
    public static final /* synthetic */ int b = 0;
    public final l1 a;

    public m(l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "mResultListener");
        this.a = l1Var;
    }

    public static void a(File file, HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) {
        try {
            if (file.exists()) {
                file.delete();
                Intrinsics.checkNotNullExpressionValue("m", "TAG");
            }
            InMobiNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            p9.a(bufferedOutputStream);
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }
}
