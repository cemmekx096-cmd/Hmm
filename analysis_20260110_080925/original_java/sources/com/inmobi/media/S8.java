package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class S8 extends R8 {
    public S8(d9 d9Var) {
        super(d9Var);
    }

    @Override // com.inmobi.media.R8
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new J7(context.getApplicationContext());
    }

    @Override // com.inmobi.media.R8
    public final void a(View view, D7 d7, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(d7, "asset");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, d7, adConfig);
        HashMap map = d9.c;
        N8.a(view, d7.d);
    }
}
