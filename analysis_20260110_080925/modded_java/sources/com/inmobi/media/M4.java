package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class M4 {
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final yd c;
    public final String d;
    public final Handler e;
    public final L4 f;
    public final long g;
    public final J4 h;

    public M4(AdConfig.ViewabilityConfig viewabilityConfig, yd ydVar, J4 j4) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(ydVar, "visibilityTracker");
        Intrinsics.checkNotNullParameter(j4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = weakHashMap;
        this.b = weakHashMap2;
        this.c = ydVar;
        this.d = "M4";
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        I4 i4 = new I4(this);
        g5 g5Var = ydVar.e;
        if (g5Var != null) {
            g5Var.c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        ydVar.j = i4;
        this.e = handler;
        this.f = new L4(this);
        this.h = j4;
    }

    public final void a(View view, Object obj, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "token");
        K4 k4 = (K4) this.a.get(view);
        if (Intrinsics.areEqual(k4 != null ? k4.a : null, obj)) {
            return;
        }
        a(view);
        this.a.put(view, new K4(obj, i, i2));
        this.c.a(view, obj, i);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.remove(view);
        this.b.remove(view);
        this.c.a(view);
    }
}
