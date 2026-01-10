package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class R8 {
    public final LinkedList a = new LinkedList();
    public int b;
    public int c;
    public final /* synthetic */ d9 d;

    public R8(d9 d9Var) {
        this.d = d9Var;
    }

    public abstract View a(Context context);

    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        HashMap map = d9.c;
        N8.a(view);
        view.setOnClickListener(null);
        this.a.add(view);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.d.a++;
    }

    public final String toString() {
        return "Size:" + this.a.size() + " Miss Count:" + this.b + " Hit Count:" + this.c;
    }

    public void a(View view, D7 d7, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(d7, "asset");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        view.setVisibility(d7.v);
        view.setOnClickListener(null);
    }
}
