package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.K1$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class K1 extends Q0 implements Application.ActivityLifecycleCallbacks {
    public final String M;
    public final String N;
    public boolean O;
    public int P;
    public final L1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(Context context, Y y, E0 e0) {
        super(context, y, e0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(y, "placement");
        this.M = "K1";
        this.N = "InMobi";
        this.Q = new L1();
        Intrinsics.checkNotNullExpressionValue("K1", "TAG");
        y.l();
        a(context, y, e0);
    }

    public static final void c(K1 k1) {
        Intrinsics.checkNotNullParameter(k1, "this$0");
        g5 g5Var = k1.j;
        if (g5Var != null) {
            String str = k1.M;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            g5Var.a(str, "start loading html ad");
        }
        k1.s0();
    }

    public static final void e(K1 k1) {
        Intrinsics.checkNotNullParameter(k1, "this$0");
        try {
            if (k1.Q() != 6) {
                if (k1.Q() == 7) {
                    k1.P++;
                    return;
                }
                return;
            }
            k1.P++;
            k1.d((byte) 7);
            g5 g5Var = k1.j;
            if (g5Var != null) {
                String str = k1.M;
                Intrinsics.checkNotNullExpressionValue(str, "TAG");
                g5Var.d(str, "AdUnit " + k1 + " state - ACTIVE");
            }
            g5 g5Var2 = k1.j;
            if (g5Var2 != null) {
                g5Var2.c(k1.N, "Successfully displayed banner ad for placement Id : " + k1.I());
            }
            E0 e0R = k1.r();
            if (e0R != null) {
                k1.d(e0R);
            }
        } catch (Exception e) {
            g5 g5Var3 = k1.j;
            if (g5Var3 != null) {
                String str2 = k1.M;
                g5Var3.b(str2, Ed.a(e, j6.a(str2, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    public static final void f(K1 k1) {
        Intrinsics.checkNotNullParameter(k1, "this$0");
        try {
            if (k1.Q() == 4) {
                k1.d((byte) 6);
                g5 g5Var = k1.j;
                if (g5Var != null) {
                    String str = k1.M;
                    Intrinsics.checkNotNullExpressionValue(str, "TAG");
                    g5Var.d(str, "AdUnit " + k1 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            g5 g5Var2 = k1.j;
            if (g5Var2 != null) {
                String str2 = k1.M;
                g5Var2.b(str2, Ed.a(e, j6.a(str2, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    public static final void g(K1 k1) {
        LinkedList linkedListF;
        Intrinsics.checkNotNullParameter(k1, "this$0");
        if (k1.b0()) {
            k1.a(System.currentTimeMillis());
            x0 x0VarY = k1.y();
            if (x0VarY != null && (linkedListF = x0VarY.f()) != null) {
                int i = 0;
                for (Object obj : linkedListF) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    k1.B().add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        k1.s0();
    }

    public boolean D0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "canProceedToLoad ", this));
        }
        if (f0()) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                String str2 = this.M;
                Intrinsics.checkNotNullExpressionValue(str2, "TAG");
                g5Var2.b(str2, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == Q() || 2 == Q()) {
            I6.a((byte) 1, this.N, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                String str3 = this.M;
                Intrinsics.checkNotNullExpressionValue(str3, "TAG");
                g5Var3.b(str3, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == Q()) {
                a((short) 2008);
            } else {
                a((short) 2011);
            }
            return false;
        }
        if (7 != Q()) {
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                g5Var4.c(this.N, "Fetching a Banner ad for placement id: " + I());
            }
            e0();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        g5 g5Var5 = this.j;
        if (g5Var5 != null) {
            String str4 = this.M;
            g5Var5.b(str4, j6.a(str4, "TAG", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ").append(I().l()).toString());
        }
        return false;
    }

    public final boolean E0() {
        return Q() == 7;
    }

    public final void F0() {
        md viewableAd;
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "onPause ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            x xVarK = k();
            Context contextT = t();
            if (xVarK == null || contextT == null || (viewableAd = xVarK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 1);
        }
    }

    public final void G0() {
        md viewableAd;
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "onResume ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            x xVarK = k();
            Context contextT = t();
            if (xVarK == null || contextT == null || (viewableAd = xVarK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 0);
        }
    }

    public final void H0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        if (contextT != null) {
            Kb.a(contextT, this);
        }
    }

    public final void I0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            g5Var.a(str, "renderAdPostInternetCheck");
        }
        try {
            if (o0()) {
                return;
            }
            S0 s0S = s();
            s0S.getClass();
            s0S.g = SystemClock.elapsedRealtime();
            d0();
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new K1$.ExternalSyntheticLambda3(this));
            }
        } catch (IllegalStateException e) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                String str2 = this.M;
                Intrinsics.checkNotNullExpressionValue(str2, "TAG");
                g5Var2.a(str2, "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.Q0
    public final byte J() {
        return (byte) 0;
    }

    public final void J0() {
        Application application;
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        Activity activity = contextT instanceof Activity ? (Activity) contextT : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.Q0
    public void c0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "load ", this));
        }
        if (D0()) {
            super.c0();
        }
    }

    public synchronized void d(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "onAdScreenDismissed ", this));
        }
        super.d(ya);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new K1$.ExternalSyntheticLambda0(this));
        }
    }

    @Override // com.inmobi.media.Q0
    public boolean f0() {
        g5 g5Var = this.j;
        if (g5Var == null) {
            return false;
        }
        String str = this.M;
        g5Var.c(str, H1.a(str, "TAG", "missingPrerequisitesForAd ", this));
        return false;
    }

    @Override // com.inmobi.media.Q0
    public void i(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.i(ya);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new K1$.ExternalSyntheticLambda1(this));
        }
    }

    @Override // com.inmobi.media.Q0
    public void j0() {
        if (p0()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                String str = this.M;
                Intrinsics.checkNotNullExpressionValue(str, "TAG");
                g5Var.a(str, "renderAd without internet check");
            }
            I0();
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            String str2 = this.M;
            Intrinsics.checkNotNullExpressionValue(str2, "TAG");
            g5Var2.a(str2, "renderAd");
        }
        a((Function0) new I1(this), (Function1) new J1(this));
    }

    @Override // com.inmobi.media.Q0
    public final void m(Ya ya) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.m(ya);
        if (b0() && this.g.indexOf(ya) > 0 && Q() == 6) {
            b((byte) 1);
            Ya ya2 = (Ya) this.g.get(A());
            if (ya2 != null) {
                ya2.a(true);
                return;
            }
            return;
        }
        if (Q() != 2) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                String str2 = this.M;
                g5Var2.a(str2, j6.a(str2, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ").append((int) Q()).toString());
                return;
            }
            return;
        }
        b((byte) 1);
        d((byte) 4);
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            String str3 = this.M;
            Intrinsics.checkNotNullExpressionValue(str3, "TAG");
            g5Var3.d(str3, "AdUnit " + this + " state - READY");
        }
        S0 s0S = s();
        s0S.getClass();
        s0S.i = SystemClock.elapsedRealtime();
        u0();
        z0();
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            g5Var4.c(this.N, "Successfully loaded Banner ad markup in the WebView for placement id: " + I());
        }
        E0 e0R = r();
        if (e0R != null) {
            f(e0R);
        } else {
            g5 g5Var5 = this.j;
            if (g5Var5 != null) {
                String str4 = this.M;
                Intrinsics.checkNotNullExpressionValue(str4, "TAG");
                g5Var5.b(str4, "AdUnit listener is null");
            }
        }
        i();
    }

    @Override // com.inmobi.media.Q0
    public void o(Ya ya) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (b0() && (iIndexOf = this.g.indexOf(ya)) > A() && ya.z != qd.c) {
            B().remove(Integer.valueOf(iIndexOf));
        } else {
            C0();
            super.o(ya);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context contextT = t();
        if (Intrinsics.areEqual(contextT, activity)) {
            Intrinsics.checkNotNull(contextT, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextT).getApplication().unregisterActivityLifecycleCallbacks(this);
            g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityStarted ", this));
        }
        if (Intrinsics.areEqual(t(), activity)) {
            G0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onActivityStopped ", this));
        }
        if (Intrinsics.areEqual(t(), activity)) {
            F0();
        }
    }

    @Override // com.inmobi.media.Q0
    public String q() {
        return "banner";
    }

    @Override // com.inmobi.media.Q0
    public Ya w() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "htmlAdContainer getter ", this));
        }
        Ya yaW = super.w();
        if (I().p() && yaW != null) {
            yaW.e();
        }
        return yaW;
    }

    @Override // com.inmobi.media.Q0
    public void a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        E0 e0R;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        super.a(z, inMobiAdRequestStatus);
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            g5Var2.c(this.N, "Banner ad fetch successful for placement id: " + I());
        }
        if (Q() != 2 || (e0R = r()) == null) {
            return;
        }
        e(e0R);
    }

    @Override // com.inmobi.media.Q0
    public void b() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "closeAll ", this));
        }
    }

    @Override // com.inmobi.media.Q0
    public final HashMap o() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.c(str, H1.a(str, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.O ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        map.put("mk-ad-slot", I().a());
        return map;
    }

    public static final void a(K1 k1, Ya ya, int i) {
        Intrinsics.checkNotNullParameter(k1, "this$0");
        Intrinsics.checkNotNullParameter(ya, "$renderView");
        int iIndexOf = k1.g.indexOf(ya);
        try {
            E0 e0R = k1.r();
            g5 g5Var = k1.j;
            if (g5Var != null) {
                String str = k1.M;
                Intrinsics.checkNotNullExpressionValue(str, "TAG");
                g5Var.c(str, "callback onShowNextPodAd");
            }
            if (e0R != null) {
                e0R.a(i, iIndexOf, ya);
            }
        } catch (Exception unused) {
            k1.b(iIndexOf, false);
            k1.f(iIndexOf);
        }
    }

    @Override // com.inmobi.media.Q0
    public final void a(Ya ya, short s) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.a(ya, s);
        if (b0()) {
            int iIndexOf = this.g.indexOf(ya);
            Q0.a(this, iIndexOf, false, 2, null);
            if (iIndexOf > 0 && Q() == 6) {
                b((byte) 1);
                Ya ya2 = (Ya) this.g.get(A());
                if (ya2 != null) {
                    ya2.a(false);
                }
            }
        }
        if (Q() == 2) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.c(this.N, "Failed to load the Banner markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public static final void d(K1 k1) {
        Intrinsics.checkNotNullParameter(k1, "this$0");
        try {
            if (k1.Q() == 7) {
                int i = k1.P - 1;
                k1.P = i;
                if (i == 0) {
                    k1.d((byte) 6);
                    E0 e0R = k1.r();
                    if (e0R != null) {
                        e0R.b();
                    }
                }
            }
        } catch (Exception e) {
            g5 g5Var = k1.j;
            if (g5Var != null) {
                String str = k1.M;
                g5Var.b(str, Ed.a(e, j6.a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.Q0
    public void g() {
        this.Q.a = false;
        super.g();
    }

    public final void e(boolean z) {
        g5 g5Var;
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            String str = this.M;
            g5Var2.a(str, H1.a(str, "TAG", "load ", this));
        }
        if (z && (g5Var = this.j) != null) {
            g5Var.c(this.N, "Initiating Banner refresh for placement id: " + I());
        }
        this.O = z;
        c0();
    }

    @Override // com.inmobi.media.Q0
    public void a(int i, Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "loadPodAd ", this));
        }
        if (B().contains(Integer.valueOf(i)) && i > this.g.indexOf(ya)) {
            g(i);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new K1$.ExternalSyntheticLambda5(this));
                return;
            }
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            String str2 = this.M;
            Intrinsics.checkNotNullExpressionValue(str2, "TAG");
            g5Var2.a(str2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.g;
        Ya ya2 = (Ya) arrayList.get(arrayList.indexOf(ya));
        if (ya2 != null) {
            ya2.a(false);
        }
    }

    public synchronized void e(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            g5Var.a(str, H1.a(str, "TAG", "onAdScreenDisplayed ", this));
        }
        super.e(ya);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new K1$.ExternalSyntheticLambda2(this));
        }
    }

    public final void e(String str) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str2 = this.M;
            g5Var.c(str2, H1.a(str2, "TAG", "setAdSize ", this));
        }
        Y yI = I();
        Intrinsics.checkNotNull(str);
        yI.a(str);
    }

    @Override // com.inmobi.media.Q0
    public void a(int i, Ya ya, Context context) {
        Ya ya2;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String str = this.M;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            g5Var.a(str, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!b0()) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                String str2 = this.M;
                Intrinsics.checkNotNullExpressionValue(str2, "TAG");
                g5Var2.b(str2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.g;
            Ya ya3 = (Ya) arrayList.get(arrayList.indexOf(ya));
            if (ya3 != null) {
                ya3.b(false);
                return;
            }
            return;
        }
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            String str3 = this.M;
            Intrinsics.checkNotNullExpressionValue(str3, "TAG");
            g5Var3.c(str3, "isInValidShowPodIndex " + i + ' ' + B() + ' ' + this.g.indexOf(ya) + ' ' + this + ' ');
        }
        if (B().contains(Integer.valueOf(i)) && i > this.g.indexOf(ya) && this.g.get(i) != null && ((ya2 = (Ya) this.g.get(i)) == null || ya2.m0)) {
            super.a(i, ya, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new K1$.ExternalSyntheticLambda4(this, ya, i));
                return;
            }
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            String str4 = this.M;
            Intrinsics.checkNotNullExpressionValue(str4, "TAG");
            g5Var4.b(str4, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.g;
        Ya ya4 = (Ya) arrayList2.get(arrayList2.indexOf(ya));
        if (ya4 != null) {
            ya4.b(false);
        }
    }

    public void a(B1 b1) {
        Intrinsics.checkNotNullParameter(b1, "audioStatusInternal");
        E0 e0R = r();
        if (e0R != null) {
            e0R.a(b1);
        }
        L1 l1 = this.Q;
        l1.getClass();
        Intrinsics.checkNotNullParameter(b1, "audioStatusInternal");
        if (!l1.a && b1 == B1.e) {
            l1.a = true;
            b5 b5Var = b5.c;
            b5Var.a = System.currentTimeMillis();
            b5Var.b++;
        }
    }

    public void a(boolean z) {
        b5 b5Var = b5.c;
        Context contextD = Kb.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = e6.b;
        e6 e6VarA = d6.a(contextD, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = e6VarA.a.getInt("user_mute_count", 0);
        e6.a(e6VarA, "user_mute_count", z ? Math.max(0, i - 1) : i + 1, false, 4, (Object) null);
    }

    @Override // com.inmobi.media.Q0
    public void a(Ya ya, boolean z) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        super.a(ya, z);
        byte bQ = Q();
        if (bQ != 4 && bQ != 6) {
            if (bQ == 7) {
                ya.a(z, Q() == 7 ? z ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte bQ2 = Q();
        if (bQ2 == 4) {
            s = z ? (short) 2220 : (short) 2219;
        } else if (bQ2 == 6) {
            s = z ? (short) 2222 : (short) 2221;
        }
        m0();
        ya.a(z, s);
    }
}
