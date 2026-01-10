package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Sa implements w {
    public final /* synthetic */ Ya a;

    public Sa(Ya ya) {
        this.a = ya;
    }

    @Override // com.inmobi.media.w
    public final void a() {
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            g5Var.a(str, "onAdScreenDisplayFailed");
        }
        this.a.getListener().c();
    }

    @Override // com.inmobi.media.w
    public final void b(Object obj) {
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            g5Var.a(str, "onAdScreenDismissed");
        }
        if (Intrinsics.areEqual("Default", this.a.getViewState())) {
            this.a.setAndUpdateViewState("Hidden");
        }
        this.a.w();
    }

    @Override // com.inmobi.media.w
    public final void a(Object obj) {
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            g5Var.a(str, "onAdScreenDisplayed");
        }
        Ya ya = this.a;
        if (ya.b == 0) {
            ya.G = false;
        }
        ya.getListener().e(this.a);
    }
}
