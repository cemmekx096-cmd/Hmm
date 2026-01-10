package com.inmobi.ads.rendering;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.inmobi.media.E3;
import com.inmobi.media.K9;
import com.inmobi.media.N3;
import com.inmobi.media.P;
import com.inmobi.media.P4;
import com.inmobi.media.Pd;
import com.inmobi.media.Q3;
import com.inmobi.media.R4;
import com.inmobi.media.T4;
import com.inmobi.media.U3;
import com.inmobi.media.Y3;
import com.inmobi.media.Ya;
import com.inmobi.media.ab;
import com.inmobi.media.f5;
import com.inmobi.media.g5;
import com.inmobi.media.t3;
import com.inmobi.media.w;
import com.inmobi.media.y2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/S4", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class InMobiAdActivity extends Activity {
    public static final SparseArray k = new SparseArray();
    public static Ya l;
    public static ab m;
    public R4 a;
    public P4 b;
    public Ya c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public f5 h;
    public Pd i;
    public OnBackInvokedCallback j;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        Intrinsics.checkNotNullParameter(inMobiAdActivity, "this$0");
        inMobiAdActivity.a();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U3 u3;
        Intrinsics.checkNotNullParameter(inMobiAdActivity, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ya ya = inMobiAdActivity.c;
        if (ya != null && (u3 = ya.o0) != null) {
            U3.a(u3, 6, true, (String) null, 12);
        }
        Ya ya2 = inMobiAdActivity.c;
        if (ya2 != null) {
            ya2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U3 u3;
        Intrinsics.checkNotNullParameter(inMobiAdActivity, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ya ya = inMobiAdActivity.c;
        if (ya == null || !ya.canGoBack()) {
            Ya ya2 = inMobiAdActivity.c;
            if (ya2 != null && (u3 = ya2.o0) != null) {
                U3.a(u3, 5, true, (String) null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.finish();
        } else {
            Ya ya3 = inMobiAdActivity.c;
            if (ya3 != null) {
                ya3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        Ya ya;
        Intrinsics.checkNotNullParameter(inMobiAdActivity, "this$0");
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ya ya2 = inMobiAdActivity.c;
        if (ya2 != null && ya2.canGoForward() && (ya = inMobiAdActivity.c) != null) {
            ya.goForward();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.inmobi", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(configuration);
        R4 r4 = this.a;
        if (r4 != null) {
            if (r4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                r4 = null;
            }
            r4.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191 A[PHI: r3
      0x0191: PHI (r3v8 com.inmobi.commons.core.configs.AdConfig) = (r3v7 com.inmobi.commons.core.configs.AdConfig), (r3v18 com.inmobi.commons.core.configs.AdConfig) binds: [B:56:0x0174, B:58:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1 A[Catch: Exception -> 0x0264, TryCatch #2 {Exception -> 0x0264, blocks: (B:64:0x01d0, B:68:0x01e6, B:72:0x01f0, B:75:0x01f6, B:71:0x01eb, B:67:0x01e1), top: B:110:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb A[Catch: Exception -> 0x0264, TryCatch #2 {Exception -> 0x0264, blocks: (B:64:0x01d0, B:68:0x01e6, B:72:0x01f0, B:75:0x01f6, B:71:0x01eb, B:67:0x01e1), top: B:110:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209 A[Catch: Exception -> 0x0262, TryCatch #3 {Exception -> 0x0262, blocks: (B:78:0x01ff, B:80:0x0205, B:82:0x0209, B:83:0x020c, B:85:0x0234, B:86:0x023c, B:88:0x0240, B:89:0x0243, B:91:0x0247, B:92:0x024c), top: B:112:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234 A[Catch: Exception -> 0x0262, TryCatch #3 {Exception -> 0x0262, blocks: (B:78:0x01ff, B:80:0x0205, B:82:0x0209, B:83:0x020c, B:85:0x0234, B:86:0x023c, B:88:0x0240, B:89:0x0243, B:91:0x0247, B:92:0x024c), top: B:112:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0240 A[Catch: Exception -> 0x0262, TryCatch #3 {Exception -> 0x0262, blocks: (B:78:0x01ff, B:80:0x0205, B:82:0x0209, B:83:0x020c, B:85:0x0234, B:86:0x023c, B:88:0x0240, B:89:0x0243, B:91:0x0247, B:92:0x024c), top: B:112:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247 A[Catch: Exception -> 0x0262, TryCatch #3 {Exception -> 0x0262, blocks: (B:78:0x01ff, B:80:0x0205, B:82:0x0209, B:83:0x020c, B:85:0x0234, B:86:0x023c, B:88:0x0240, B:89:0x0243, B:91:0x0247, B:92:0x024c), top: B:112:0x01ff }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        Ya ya;
        U3 u3;
        w fullScreenEventsListener;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onDestroy");
        }
        if (this.e) {
            int i = this.d;
            if (100 == i) {
                Ya ya2 = this.c;
                if (ya2 != null && (fullScreenEventsListener = ya2.getFullScreenEventsListener()) != null) {
                    try {
                        fullScreenEventsListener.b(this.c);
                        Ya ya3 = this.c;
                        Intrinsics.checkNotNull(ya3);
                        ya3.b();
                        R4 r4 = this.a;
                        if (r4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                            r4 = null;
                        }
                        Ya ya4 = this.c;
                        Intrinsics.checkNotNull(ya4);
                        r4.getClass();
                        Intrinsics.checkNotNullParameter(ya4, "orientationListener");
                        r4.b.remove(ya4);
                        r4.a();
                        this.c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i) {
                P4 p4 = this.b;
                if (p4 != null) {
                    R4 r42 = this.a;
                    if (r42 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        r42 = null;
                    }
                    r42.getClass();
                    Intrinsics.checkNotNullParameter(p4, "orientationListener");
                    r42.b.remove(p4);
                    r42.a();
                    P p = p4.c;
                    if (p != null) {
                        p.b();
                    }
                    RelativeLayout relativeLayout = p4.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Q3 q3 = p4.e;
                    if (q3 != null) {
                        Y3 y3 = q3.c;
                        if (y3 != null) {
                            y3.destroy();
                        }
                        q3.c = null;
                        q3.d = null;
                        q3.e = null;
                        Pd pd = q3.g;
                        if (pd != null) {
                            pd.a();
                        }
                        q3.removeAllViews();
                    }
                    p4.a.clear();
                    p4.b = null;
                    p4.c = null;
                    p4.d = null;
                    p4.e = null;
                }
                this.b = null;
            }
        } else {
            int i2 = this.d;
            if (100 != i2 && 102 == i2) {
                P4 p42 = this.b;
                if (p42 != null) {
                    R4 r43 = this.a;
                    if (r43 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        r43 = null;
                    }
                    r43.getClass();
                    Intrinsics.checkNotNullParameter(p42, "orientationListener");
                    r43.b.remove(p42);
                    r43.a();
                    P p2 = p42.c;
                    if (p2 != null) {
                        p2.b();
                    }
                    RelativeLayout relativeLayout2 = p42.d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Q3 q32 = p42.e;
                    if (q32 != null) {
                        Y3 y32 = q32.c;
                        if (y32 != null) {
                            y32.destroy();
                        }
                        q32.c = null;
                        q32.d = null;
                        q32.e = null;
                        Pd pd2 = q32.g;
                        if (pd2 != null) {
                            pd2.a();
                        }
                        q32.removeAllViews();
                    }
                    p42.a.clear();
                    p42.b = null;
                    p42.c = null;
                    p42.d = null;
                    p42.e = null;
                }
                this.b = null;
            }
            if (100 == this.d && (ya = this.c) != null && (u3 = ya.o0) != null) {
                U3.a(u3, 9, true, (String) null, 12);
            }
        }
        Pd pd3 = this.i;
        if (pd3 != null) {
            pd3.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        P4 p4;
        R4 r4;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "multiWindow mode - " + z);
        }
        super.onMultiWindowModeChanged(z);
        if (z || (p4 = this.b) == null) {
            return;
        }
        Ya ya = p4.b;
        R4 r42 = null;
        K9 orientationProperties = (ya == null || !(ya instanceof Ya)) ? null : ya.getOrientationProperties();
        if (orientationProperties == null || (r4 = this.a) == null) {
            return;
        }
        if (r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
        } else {
            r42 = r4;
        }
        r42.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.c = null;
        setIntent(intent);
        P4 p4 = this.b;
        if (p4 != null) {
            SparseArray sparseArray = k;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(sparseArray, "adContainers");
            p4.a(intent, sparseArray);
            P p = p4.c;
            if (p != null) {
                p.g();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        P4 p4;
        P p;
        w fullScreenEventsListener;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onResume");
        }
        super.onResume();
        if (this.e) {
            return;
        }
        int i = this.d;
        if (100 != i) {
            if (102 != i || (p4 = this.b) == null || (p = p4.c) == null) {
                return;
            }
            p.c();
            return;
        }
        Ya ya = this.c;
        if (ya == null || (fullScreenEventsListener = ya.getFullScreenEventsListener()) == null) {
            return;
        }
        try {
            if (this.f) {
                return;
            }
            this.f = true;
            fullScreenEventsListener.a(this.c);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        P4 p4;
        Window window;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        E3 e3 = E3.a;
        if (e3.B()) {
            if (this.j == null) {
                this.j = new OnBackInvokedCallback() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda4
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(this.f$0);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.e || 102 != this.d || (p4 = this.b) == null) {
            return;
        }
        P p = p4.c;
        if (p != null) {
            p.g();
        }
        Ya ya = p4.b;
        if (ya != null) {
            if ((ya instanceof Ya ? ya.H0 : false) && !e3.z() && e3.F()) {
                Object obj = p4.a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null || Build.VERSION.SDK_INT < 19) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        P4 p4;
        P p;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        if (E3.a.B() && this.j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.e || (p4 = this.b) == null || (p = p4.c) == null) {
            return;
        }
        p.d();
    }

    public final void a(RelativeLayout relativeLayout) {
        float f = N3.d().c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f));
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (y2.a(this)) {
            Pd pd = this.i;
            if (pd != null) {
                pd.a();
            }
            this.i = new Pd(this, new T4(layoutParams), this.h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        View t3Var = new t3(this, (byte) 2, this.h);
        t3Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(this.f$0, view, motionEvent);
            }
        });
        linearLayout.addView(t3Var, layoutParams2);
        View t3Var2 = new t3(this, (byte) 3, this.h);
        t3Var2.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(this.f$0, view, motionEvent);
            }
        });
        linearLayout.addView(t3Var2, layoutParams2);
        View t3Var3 = new t3(this, (byte) 4, this.h);
        t3Var3.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(this.f$0, view, motionEvent);
            }
        });
        linearLayout.addView(t3Var3, layoutParams2);
        View t3Var4 = new t3(this, (byte) 6, this.h);
        t3Var4.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(this.f$0, view, motionEvent);
            }
        });
        linearLayout.addView(t3Var4, layoutParams2);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onMultiWindowModeChanged(z, configuration);
        onMultiWindowModeChanged(z);
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U3 u3;
        Intrinsics.checkNotNullParameter(inMobiAdActivity, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Ya ya = inMobiAdActivity.c;
            if (ya != null && (u3 = ya.o0) != null) {
                U3.a(u3, 5, true, (String) null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.finish();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        U3 u3;
        P p;
        g5 g5Var = this.h;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            g5Var.c("InMobiAdActivity", "onBackPressed");
        }
        int i = this.d;
        if (i == 102) {
            g5 g5Var2 = this.h;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                g5Var2.c("InMobiAdActivity", "back pressed on ad");
            }
            P4 p4 = this.b;
            if (p4 == null || (p = p4.c) == null) {
                return;
            }
            p.a();
            return;
        }
        if (i == 100) {
            g5 g5Var3 = this.h;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                g5Var3.c("InMobiAdActivity", "back pressed in browser");
            }
            Ya ya = this.c;
            if (ya != null && (u3 = ya.o0) != null) {
                U3.a(u3, 7, true, (String) null, 12);
            }
            this.e = true;
            finish();
        }
    }
}
