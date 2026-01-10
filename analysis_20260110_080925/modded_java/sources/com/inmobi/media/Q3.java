package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.Q3$;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Q3 extends RelativeLayout {
    public final Activity a;
    public int b;
    public Y3 c;
    public T3 d;
    public Vc e;
    public f5 f;
    public Pd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
        this.b = -1;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t3 t3Var = new t3(context, (byte) 4, this.f);
        t3Var.setId(65503);
        t3Var.setOnTouchListener(new Q3$.ExternalSyntheticLambda3(this));
        linearLayout.addView((View) t3Var, (ViewGroup.LayoutParams) layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t3 t3Var = new t3(context, (byte) 2, this.f);
        t3Var.setId(65516);
        t3Var.setOnTouchListener(new Q3$.ExternalSyntheticLambda2(this));
        linearLayout.addView((View) t3Var, (ViewGroup.LayoutParams) layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t3 t3Var = new t3(context, (byte) 6, this.f);
        t3Var.setId(1048283);
        t3Var.setOnTouchListener(new Q3$.ExternalSyntheticLambda1(this));
        linearLayout.addView((View) t3Var, (ViewGroup.LayoutParams) layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t3 t3Var = new t3(context, (byte) 3, this.f);
        t3Var.setId(65502);
        t3Var.setOnTouchListener(new Q3$.ExternalSyntheticLambda0(this));
        linearLayout.addView((View) t3Var, (ViewGroup.LayoutParams) layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final Vc getUserLeftApplicationListener() {
        return this.e;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setEmbeddedBrowserUpdateListener(T3 t3) {
        Intrinsics.checkNotNullParameter(t3, "browserUpdateListener");
        this.d = t3;
    }

    public final void setLogger(f5 f5Var) {
        Intrinsics.checkNotNullParameter(f5Var, "logger");
        this.f = f5Var;
    }

    public final void setUserLeftApplicationListener(Vc vc) {
        this.e = vc;
    }

    public static final boolean b(Q3 q3, View view, MotionEvent motionEvent) {
        U3 u3;
        Intrinsics.checkNotNullParameter(q3, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Y3 y3 = q3.c;
            if (y3 != null && (u3 = y3.g) != null) {
                U3.a(u3, 5, true, (String) null, 12);
            }
            O4 o4 = q3.d;
            if (o4 != null) {
                P4.a(o4.a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(Q3 q3, View view, MotionEvent motionEvent) {
        U3 u3;
        Intrinsics.checkNotNullParameter(q3, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Y3 y3 = q3.c;
            if (y3 != null && (u3 = y3.g) != null) {
                U3.a(u3, 6, true, (String) null, 12);
            }
            Y3 y32 = q3.c;
            if (y32 != null) {
                y32.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(Q3 q3, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(q3, "this$0");
        Y3 y3 = q3.c;
        if (y3 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (y3.canGoForward()) {
                y3.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean a(Q3 q3, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(q3, "this$0");
        Y3 y3 = q3.c;
        if (y3 == null) {
            O4 o4 = q3.d;
            if (o4 != null) {
                P4.a(o4.a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (y3.canGoBack()) {
                y3.goBack();
            } else {
                O4 o42 = q3.d;
                if (o42 != null) {
                    P4.a(o42.a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
