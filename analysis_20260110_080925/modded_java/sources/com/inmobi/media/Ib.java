package com.inmobi.media;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Ib extends k8 implements ViewPager.OnPageChangeListener {
    public final String b;
    public final ViewPager c;
    public final Point d;
    public final Point e;
    public boolean f;
    public d8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ib(Context context) {
        super(context, (byte) 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = "Ib";
        this.d = new Point();
        this.e = new Point();
        setClipChildren(false);
        setLayerType(1, null);
        ViewPager viewPager = new ViewPager(getContext());
        this.c = viewPager;
        viewPager.addOnPageChangeListener(this);
        addView(viewPager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(H7 h7, l8 l8Var, int i, int i2, d8 d8Var) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(h7, "scrollableContainerAsset");
        Intrinsics.checkNotNullParameter(l8Var, "dataSource");
        D7 d7 = h7.B > 0 ? (D7) h7.A.get(0) : null;
        if (d7 != null) {
            HashMap map = d9.c;
            ViewGroup.LayoutParams layoutParamsA = N8.a(d7, this);
            Intrinsics.checkNotNull(layoutParamsA, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) layoutParamsA;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(20);
                layoutParams.setMarginEnd(20);
            } else {
                layoutParams.setMargins(20, 0, 20, 0);
            }
            layoutParams.gravity = i2;
        } else {
            layoutParams = null;
        }
        ViewPager viewPager = this.c;
        if (viewPager != null) {
            viewPager.setLayoutParams(layoutParams);
            viewPager.setAdapter(l8Var instanceof Q7 ? (Q7) l8Var : null);
            viewPager.setOffscreenPageLimit(2);
            viewPager.setPageMargin(16);
            viewPager.setCurrentItem(i);
        }
        this.g = d8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void onPageScrollStateChanged(int i) {
        this.f = i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.f) {
            invalidate();
        }
    }

    public final void onPageSelected(int i) {
        Intrinsics.checkNotNullExpressionValue(this.b, "TAG");
        ViewPager viewPager = this.c;
        ViewGroup.LayoutParams layoutParams = viewPager != null ? viewPager.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        d8 d8Var = this.g;
        if (d8Var != null) {
            if (layoutParams2 != null) {
                d8Var.k = i;
                H7 h7B = d8Var.c.b(i);
                if (h7B != null) {
                    W7 w7 = d8Var.d;
                    Intrinsics.checkNotNullParameter(h7B, "asset");
                    X7 x7 = w7.a;
                    if (!x7.a) {
                        t7 t7Var = x7.b;
                        t7Var.getClass();
                        Intrinsics.checkNotNullParameter(h7B, "asset");
                        if (!t7Var.n.contains(Integer.valueOf(i)) && !t7Var.t) {
                            t7Var.m();
                            if (!t7Var.t) {
                                t7Var.n.add(Integer.valueOf(i));
                                h7B.y = System.currentTimeMillis();
                                if (t7Var.r) {
                                    HashMap mapA = t7Var.a(h7B);
                                    g5 g5Var = t7Var.j;
                                    if (g5Var != null) {
                                        String str = t7Var.m;
                                        Intrinsics.checkNotNullExpressionValue(str, "TAG");
                                        g5Var.a(str, "Page-view impression record request");
                                    }
                                    h7B.a("page_view", mapA, (l7) null, t7Var.j);
                                } else {
                                    t7Var.o.add(h7B);
                                }
                            }
                        }
                    }
                }
                int i2 = d8Var.k;
                int i3 = 1;
                if (i2 == 0) {
                    i3 = 8388611;
                } else if (i2 == d8Var.c.d() - 1) {
                    i3 = 8388613;
                }
                layoutParams2.gravity = i3;
            }
            ViewPager viewPager2 = this.c;
            if (viewPager2 != null) {
                viewPager2.requestLayout();
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Point point = this.d;
        point.x = i / 2;
        point.y = i2 / 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
