package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Ja implements rd {
    public final /* synthetic */ Ya a;

    public Ja(Ya ya) {
        this.a = ya;
    }

    public final void a(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof Ya) {
            if (this.a.hasWindowFocus()) {
                this.a.c(z);
            } else {
                this.a.c(false);
            }
        }
    }
}
