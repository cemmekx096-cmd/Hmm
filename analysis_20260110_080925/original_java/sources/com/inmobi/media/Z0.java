package com.inmobi.media;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Z0$;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Z0 {
    public final String a = "Z0";
    public final ArrayList b = new ArrayList();
    public boolean c;

    public static Y0 a(ValueAnimator valueAnimator, D7 d7) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        p8 p8Var = d7.d.k;
        if (p8Var != null) {
            o8 o8Var = p8Var.a;
            o8 o8Var2 = p8Var.b;
            if (o8Var2 != null) {
                valueAnimator.setDuration(o8Var2.a() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
            }
            if (o8Var != null) {
                valueAnimator.setStartDelay(o8Var.a() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
            }
        }
        return new Y0(valueAnimator);
    }

    public static ValueAnimator b(View view, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new Z0$.ExternalSyntheticLambda1(layoutParams instanceof I7 ? (I7) layoutParams : null, view));
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static final void b(I7 i7, View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (i7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            i7.b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(i7);
        view.requestLayout();
    }

    public static ValueAnimator a(View view, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new Z0$.ExternalSyntheticLambda0(layoutParams instanceof I7 ? (I7) layoutParams : null, view));
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static final void a(I7 i7, View view, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (i7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            i7.a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(i7);
        view.requestLayout();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y0 y0 = (Y0) it.next();
            if (!y0.c) {
                ValueAnimator valueAnimator = y0.a;
                Intrinsics.checkNotNull(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator.setCurrentPlayTime(y0.b);
                valueAnimator.start();
            }
            if (!this.b.contains(y0)) {
                this.b.add(y0);
            }
        }
    }

    public final void a() {
        if (this.c) {
            this.c = false;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                Y0 y0 = (Y0) it.next();
                ValueAnimator valueAnimator = y0.a;
                Intrinsics.checkNotNull(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                y0.b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    y0.c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
