package com.inmobi.media;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class V5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout a;
    public final f5 b;
    public int c;
    public int d;

    public V5(FrameLayout frameLayout, f5 f5Var) {
        Intrinsics.checkNotNullParameter(frameLayout, "view");
        this.a = frameLayout;
        this.b = f5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            g5 g5Var = this.b;
            if (g5Var != null) {
                String str = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                g5Var.a(str, "close called");
            }
            this.c = y2.b(this.a.getWidth() / N3.b());
            this.d = y2.b(this.a.getHeight() / N3.b());
            if (Build.VERSION.SDK_INT >= 16) {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            Boolean bool = Boolean.FALSE;
            synchronized (bool) {
                bool.notify();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            g5 g5Var2 = this.b;
            if (g5Var2 != null) {
                String str2 = Y5.a;
                g5Var2.b(str2, Ed.a(e, j6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ")));
            }
        }
    }
}
