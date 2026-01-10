package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Y7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ d8 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ D7 c;

    public Y7(d8 d8Var, ArrayList arrayList, D7 d7) {
        this.a = d8Var;
        this.b = arrayList;
        this.c = d7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        this.a.l.a(this.b);
        t7 t7Var = this.a.b;
        D7 d7A = t7Var.a(t7Var.b, this.c);
        D7 d7 = this.c;
        t7 t7Var2 = this.a.b;
        if (d7A == null) {
            d7A = d7;
        }
        d7.a("creativeView", t7Var2.a(d7A), (l7) null, this.a.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        view.removeOnAttachStateChangeListener(this);
        Z0 z0 = this.a.l;
        ArrayList arrayList = this.b;
        z0.getClass();
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Y0) it.next()).a.cancel();
        }
        z0.b.removeAll(arrayList);
    }
}
