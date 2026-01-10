package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class X7 {
    public boolean a;
    public final t7 b;
    public final f5 c;
    public final String d;
    public final d8 e;

    public X7(Context context, AdConfig adConfig, t7 t7Var, P7 p7, f5 f5Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(t7Var, "mNativeAdContainer");
        Intrinsics.checkNotNullParameter(p7, "dataModel");
        this.b = t7Var;
        this.c = f5Var;
        this.d = "X7";
        d8 d8Var = new d8(context, adConfig, t7Var, p7, new W7(this), new V7(this), this, f5Var);
        this.e = d8Var;
        d9 d9Var = d8Var.m;
        int i = t7Var.B;
        d9Var.getClass();
        d9.f = i;
    }

    public final j8 a(View view, ViewGroup viewGroup, boolean z, Ya ya) {
        j8 j8VarA;
        g5 g5Var;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View viewFindViewWithTag = view != null ? view.findViewWithTag("InMobiAdView") : null;
        j8 j8Var = viewFindViewWithTag instanceof j8 ? (j8) viewFindViewWithTag : null;
        if (z) {
            j8VarA = this.e.a(j8Var, viewGroup, ya);
        } else {
            d8 d8Var = this.e;
            d8Var.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            d8Var.o = ya;
            j8 j8VarA2 = d8Var.a(j8Var, viewGroup);
            if (!d8Var.n) {
                H7 h7 = d8Var.c.e;
                if (j8VarA2 != null && h7 != null) {
                    Intrinsics.checkNotNullParameter(j8VarA2, "container");
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    Intrinsics.checkNotNullParameter(h7, "root");
                    d8Var.b(j8VarA2, h7);
                }
            }
            j8VarA = j8VarA2;
        }
        if (j8Var == null && (g5Var = this.c) != null) {
            String str = this.d;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            g5Var.b(str, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (j8VarA != null) {
            j8VarA.setNativeStrandAd(this.b);
        }
        if (j8VarA != null) {
            j8VarA.setTag("InMobiAdView");
        }
        return j8VarA;
    }
}
