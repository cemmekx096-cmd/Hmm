package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Xa extends Md {
    public final /* synthetic */ Ya a;

    public Xa(Ya ya) {
        this.a = ya;
    }

    public final boolean a() {
        return !Intrinsics.areEqual("Hidden", this.a.getViewState());
    }

    public final void a(I9 i9, Od od) throws JSONException {
        JSONObject jSONObjectA;
        Nd nd;
        Intrinsics.checkNotNullParameter(i9, "orientation");
        Intrinsics.checkNotNullParameter(od, "finalInsets");
        Ya ya = this.a;
        g5 g5Var = ya.i;
        if (g5Var != null) {
            String str = Ya.P0;
            g5Var.c(str, Wa.a(ya, str, "TAG", "fireOnSafeAreaChanged "));
        }
        StringBuilder sb = new StringBuilder("window.imraid.broadcastEvent('onSafeAreaChange', ");
        Intrinsics.checkNotNullParameter(od, "<this>");
        Intrinsics.checkNotNullParameter(i9, "orientation");
        try {
            od.getClass();
            Intrinsics.checkNotNullParameter(i9, "orientation");
            nd = (Nd) od.a.get(i9);
        } catch (Exception unused) {
        }
        if (nd != null) {
            jSONObjectA = nd.a();
            jSONObjectA.put("orientation", J9.a(i9));
        } else {
            jSONObjectA = null;
        }
        ya.b(sb.append(jSONObjectA).append(')').toString());
        Ya ya2 = this.a;
        ya2.getClass();
        od.getClass();
        Intrinsics.checkNotNullParameter(i9, "orientation");
        Nd nd2 = (Nd) od.a.get(i9);
        if (nd2 == null) {
            return;
        }
        if (nd2.b == 0 && nd2.c == 0) {
            return;
        }
        ya2.setCloseAssetArea(nd2);
        Intrinsics.checkNotNullParameter(ya2, "renderView");
        Nd nd3 = ya2.M0;
        Intrinsics.checkNotNullParameter(nd3, "insets");
        t3 t3VarFindViewById = ya2.getRootView().findViewById(65531);
        t3 t3Var = t3VarFindViewById instanceof t3 ? t3VarFindViewById : null;
        if (t3Var == null) {
            return;
        }
        t3 t3VarFindViewById2 = ya2.getRootView().findViewById(65531);
        t3 t3Var2 = t3VarFindViewById2 instanceof t3 ? t3VarFindViewById2 : null;
        if (t3Var2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = t3Var.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = t3Var2.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            return;
        }
        layoutParams2.setMargins(0, nd3.b, nd3.c, 0);
        layoutParams4.setMargins(0, nd3.b, nd3.c, 0);
    }
}
