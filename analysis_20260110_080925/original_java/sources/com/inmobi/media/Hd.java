package com.inmobi.media;

import android.content.Context;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Hd {
    public final l9 a;
    public final n2 b;
    public Gd c;

    public Hd(l9 l9Var, n2 n2Var) {
        Intrinsics.checkNotNullParameter(l9Var, "mNetworkRequest");
        Intrinsics.checkNotNullParameter(n2Var, "mWebViewClient");
        this.a = l9Var;
        this.b = n2Var;
    }

    public final void a() {
        try {
            Context contextD = Kb.d();
            if (contextD != null) {
                Gd gd = new Gd(contextD);
                gd.setWebViewClient(this.b);
                gd.getSettings().setJavaScriptEnabled(true);
                gd.getSettings().setCacheMode(2);
                this.c = gd;
            }
            Gd gd2 = this.c;
            if (gd2 != null) {
                String strD = this.a.d();
                l9 l9Var = this.a;
                boolean z = p9.a;
                p9.a(l9Var.i);
                InMobiNetworkBridge.webviewLoadUrl(gd2, strD, l9Var.i);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Hd", "TAG");
        }
    }
}
