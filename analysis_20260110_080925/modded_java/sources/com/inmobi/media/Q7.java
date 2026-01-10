package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.inmobi.media.Q7$;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Q7 extends PagerAdapter implements l8 {
    public final P7 a;
    public final d8 b;
    public final String c;
    public final int d;
    public final Handler e;
    public boolean f;
    public final SparseArray g;

    public Q7(P7 p7, d8 d8Var) {
        Intrinsics.checkNotNullParameter(p7, "mNativeDataModel");
        Intrinsics.checkNotNullParameter(d8Var, "mNativeLayoutInflater");
        this.a = p7;
        this.b = d8Var;
        this.c = "Q7";
        this.d = 50;
        this.e = new Handler(Looper.getMainLooper());
        this.g = new SparseArray();
    }

    public static final void a(Object obj, Q7 q7) {
        Intrinsics.checkNotNullParameter(obj, "$item");
        Intrinsics.checkNotNullParameter(q7, "this$0");
        if (obj instanceof View) {
            d8 d8Var = q7.b;
            View view = (View) obj;
            d8Var.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            d8Var.m.a(view);
        }
    }

    public final void destroy() {
        this.f = true;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.e.removeCallbacks((Runnable) this.g.get(this.g.keyAt(i)));
        }
        this.g.clear();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "item");
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
        Runnable runnable = (Runnable) this.g.get(i);
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
            Intrinsics.checkNotNullExpressionValue(this.c, "TAG");
        }
        this.e.post(new Q7$.ExternalSyntheticLambda1(obj, this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.a.d();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "item");
        View view = obj instanceof View ? (View) obj : null;
        Object tag = view != null ? view.getTag() : null;
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View relativeLayout;
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullExpressionValue(this.c, "TAG");
        H7 h7B = this.a.b(i);
        if (h7B == null || (relativeLayout = a(i, viewGroup, h7B)) == null) {
            relativeLayout = new RelativeLayout(viewGroup.getContext());
        }
        relativeLayout.setTag(Integer.valueOf(i));
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Intrinsics.areEqual(view, obj);
    }

    public final ViewGroup a(int i, ViewGroup viewGroup, H7 h7) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(h7, "pageContainerAsset");
        ViewGroup viewGroupA = this.b.a(viewGroup, h7);
        if (viewGroupA != null) {
            int iAbs = Math.abs(this.b.k - i);
            Runnable externalSyntheticLambda0 = new Q7$.ExternalSyntheticLambda0(this, i, viewGroupA, viewGroup, h7);
            this.g.put(i, externalSyntheticLambda0);
            this.e.postDelayed(externalSyntheticLambda0, iAbs * this.d);
        }
        return viewGroupA;
    }

    public static final void a(Q7 q7, int i, ViewGroup viewGroup, ViewGroup viewGroup2, H7 h7) {
        Intrinsics.checkNotNullParameter(q7, "this$0");
        Intrinsics.checkNotNullParameter(viewGroup, "$it");
        Intrinsics.checkNotNullParameter(viewGroup2, "$parent");
        Intrinsics.checkNotNullParameter(h7, "$pageContainerAsset");
        if (q7.f) {
            return;
        }
        q7.g.remove(i);
        d8 d8Var = q7.b;
        d8Var.getClass();
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(viewGroup2, "parent");
        Intrinsics.checkNotNullParameter(h7, "root");
        d8Var.b(viewGroup, h7);
    }
}
