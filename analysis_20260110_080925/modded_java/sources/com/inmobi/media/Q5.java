package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.Q5$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Q5 extends Q0 {
    public int M;
    public boolean N;
    public gc O;
    public Function0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Context context, Y y, E0 e0) {
        super(context, y, e0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(y, "adPlacement");
        this.O = new gc();
        Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
        y.l();
        a(context, y, e0);
        c("activity");
    }

    public static final void c(Q5 q5) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        q5.a(q5.r());
    }

    public static final void d(Q5 q5) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        q5.b(q5.r());
    }

    public static final /* synthetic */ String e() {
        return "Q5";
    }

    public final boolean D0() {
        if (f0()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        E0 e0R = r();
        if (e0R == null) {
            return false;
        }
        byte bQ = Q();
        if (bQ == 1) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
        } else if (bQ == 7 || bQ == 6) {
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                g5Var3.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        } else {
            if (bQ != 2) {
                if (4 == Q()) {
                    if (!W()) {
                        g5 g5Var4 = this.j;
                        if (g5Var4 != null) {
                            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                            g5Var4.a("Q5", "An ad is ready with the ad unit. Signaling ad load success ...");
                        }
                        E0 e0R2 = r();
                        if (e0R2 == null) {
                            g5 g5Var5 = this.j;
                            if (g5Var5 != null) {
                                g5Var5.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                            }
                        } else {
                            e(e0R2);
                            f(e0R2);
                        }
                        return false;
                    }
                    g();
                }
                e0();
                return true;
            }
            if (Intrinsics.areEqual("html", E()) || Intrinsics.areEqual("htmlUrl", E())) {
                g5 g5Var6 = this.j;
                if (g5Var6 != null) {
                    g5Var6.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + I());
                }
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
            } else {
                e(e0R);
            }
        }
        return false;
    }

    public final boolean E0() {
        g5 g5Var;
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        AdConfig adConfigJ = j();
        Intrinsics.checkNotNull(adConfigJ);
        boolean zA = hVarM.a(adConfigJ.getCacheConfig(q()).getTimeToLive());
        if (zA && (g5Var = this.j) != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var.b("Q5", "Top ad has expired, failing show of ad.");
        }
        return !zA;
    }

    @Override // com.inmobi.media.Q0
    public Integer F() {
        AdConfig adConfigJ = j();
        if (adConfigJ != null) {
            return Integer.valueOf(adConfigJ.getMinimumRefreshInterval());
        }
        return null;
    }

    public final void F0() {
        x xVarK = k();
        if (xVarK == null) {
            return;
        }
        this.N = true;
        xVarK.e();
    }

    public final gc G0() {
        return this.O;
    }

    public final boolean H0() {
        return Q() == 4;
    }

    @Override // com.inmobi.media.Q0
    public final byte J() {
        return (byte) 1;
    }

    public boolean J0() {
        return 2 == Q();
    }

    public final void K0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            String strE = Q0.e();
            Intrinsics.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            g5Var.c(strE, "submitAdNotReady " + this);
        }
        gc gcVar = this.O;
        S0 s0S = s();
        h hVarA = this.A ? a(this.x) : m();
        String strP = hVarA != null ? hVarA.p() : null;
        x0 x0VarY = y();
        Boolean boolO = x0VarY != null ? x0VarY.o() : null;
        String strE2 = E();
        byte bQ = Q();
        V v = new V(s0S, strP, boolO, strE2, bQ);
        gcVar.getClass();
        Intrinsics.checkNotNullParameter(v, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j = s0S.c;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("errorCode", Short.valueOf(bQ == 0 ? (short) 2204 : bQ == 1 ? (short) 2205 : bQ == 2 ? (short) 2206 : bQ == 3 ? (short) 2207 : bQ == 6 ? (short) 2208 : bQ == 7 ? (short) 2209 : bQ == 8 ? (short) 2242 : (short) 2210));
        if (strE2 != null) {
            map.put("markupType", strE2);
        }
        if (strP != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        if (boolO != null) {
            map.put("isRewarded", boolO);
        }
        String strA = s0S.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", s0S.a.q());
        map.put("networkType", E3.q());
        map.put("plId", Long.valueOf(s0S.a.I().l()));
        map.put("isAdLoaded", Boolean.valueOf(gcVar.a));
        String strM = s0S.a.I().m();
        if (strM != null) {
            map.put("plType", strM);
        }
        ic icVar = ic.a;
        ic.b("AdNotReady", map, mc.a);
    }

    public final void L0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + I());
        }
        i();
        r0();
    }

    @Override // com.inmobi.media.Q0
    public void a(int i, Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
    }

    public final short b(Context context) {
        try {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            x xVarK = k();
            if (xVarK == null) {
                return (short) 2155;
            }
            if (Intrinsics.areEqual("unknown", xVarK.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            Intrinsics.checkNotNullParameter(xVarK, "container");
            int iHashCode = xVarK.hashCode();
            InMobiAdActivity.k.put(iHashCode, xVarK);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            f5 f5Var = this.j;
            if (f5Var != null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                HashMap map = S4.a;
                String string2 = string.toString();
                Intrinsics.checkNotNullParameter(string2, "key");
                Intrinsics.checkNotNullParameter(f5Var, "obj");
                S4.a.put(string2, new WeakReference(f5Var));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strE = E();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", Intrinsics.areEqual(strE, "html") ? ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION : Intrinsics.areEqual(strE, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (b0()) {
                if (C() == -1) {
                    a(System.currentTimeMillis());
                }
                if (z() > 0) {
                    intent.setFlags(603979776);
                }
            }
            Kb.a.a(context, intent);
            return (short) 0;
        } catch (Exception e) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.Q0
    public void c0() {
        if (D0()) {
            super.c0();
        }
    }

    @Override // com.inmobi.media.Q0
    public void g() {
        super.g();
        this.P = null;
    }

    public final void h(E0 e0) {
        short sB = b(t());
        if (e0 == null) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                g5Var.b("InMobiInterstitial", "Listener was garbage collected.Unable to give callback");
                return;
            }
            return;
        }
        if (sB != 0) {
            a(true, sB);
        } else {
            e0.e();
        }
    }

    public final void i(E0 e0) {
        if (e0 == null) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                g5Var.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a(true, (short) 2151);
            return;
        }
        Function0 function0 = this.P;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (Q() == 8) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var2.b("Q5", "unload has been called on this ad. Dont show. ");
            }
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            I6.a((byte) 2, "Q5", "Failed to show Ad as creative has called unload() on the Ad");
            a(true, (short) 2239);
            return;
        }
        if (!H0()) {
            I6.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var3.b("Q5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            I6.a((byte) 1, "Q5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(true, (short) 2152);
            return;
        }
        g(e0);
        d((byte) 6);
        if (!Intrinsics.areEqual("html", E()) && !Intrinsics.areEqual("htmlUrl", E())) {
            A aV = v();
            int iHashCode = hashCode();
            J5 j5 = new J5(this, e0);
            aV.getClass();
            A.a(iHashCode, j5);
            return;
        }
        if (!W()) {
            h(e0);
            return;
        }
        b(e0, (short) 2153);
        x xVarK = k();
        if (xVarK != null) {
            xVarK.b();
        }
    }

    public final void j(E0 e0) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i(e0);
        } else {
            int i = m4.a;
            ((P6) m4.d.getValue()).a.post(new Q5$.ExternalSyntheticLambda5(this, e0));
        }
    }

    @Override // com.inmobi.media.Q0
    public void j0() {
        if (p0()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "renderAd without internet check");
            }
            I0();
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var2.a("Q5", "renderAd");
        }
        a((Function0) new O5(this), (Function1) new P5(this));
    }

    @Override // com.inmobi.media.Q0
    public void k0() {
        super.k0();
        this.M = 0;
    }

    @Override // com.inmobi.media.Q0
    public void m(Ya ya) {
        super.m(ya);
        if (!b0()) {
            if (Q() == 2) {
                b((byte) 1);
                L0();
                return;
            }
            return;
        }
        int iIndexOf = this.g.indexOf(ya);
        if (iIndexOf < A()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + A());
                return;
            }
            return;
        }
        B().add(Integer.valueOf(iIndexOf));
        for (int i = 0; i < iIndexOf; i++) {
            if (this.g.get(i) != null) {
                return;
            }
        }
        if (Q() == 2) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.a("Q5", x8.a("Q5", "TAG", "Providing success based on index ", iIndexOf));
            }
            b((byte) 1);
            h(iIndexOf);
            L0();
        }
    }

    @Override // com.inmobi.media.Q0
    public void o(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (!b0() || !a(ya)) {
            C0();
        }
        super.o(ya);
    }

    @Override // com.inmobi.media.Q0
    public String q() {
        return "int";
    }

    @Override // com.inmobi.media.Q0
    public void q0() {
        E0 e0R = r();
        if (e0R != null) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "callback - onFetchSuccess");
            }
            e(e0R);
            return;
        }
        b((short) 2188);
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var2.b("Q5", "listener is null");
        }
    }

    @Override // com.inmobi.media.Q0
    public void r0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var.d("Q5", "AdUnit " + this + " state - READY");
        }
        d((byte) 4);
        S0 s0S = s();
        s0S.getClass();
        s0S.i = SystemClock.elapsedRealtime();
        u0();
        z0();
        this.O.a = true;
        E0 e0R = r();
        if (e0R == null || !e0R.a()) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var2.a("Q5", "signaling Success");
        }
        f(e0R);
    }

    @Override // com.inmobi.media.Q0
    public Ya w() {
        Ya yaW = super.w();
        if (this.N && yaW != null) {
            yaW.e();
        }
        return yaW;
    }

    public static final void e(Q5 q5) {
        LinkedList linkedListF;
        Intrinsics.checkNotNullParameter(q5, "this$0");
        q5.s0();
        if (q5.b0()) {
            x0 x0VarY = q5.y();
            int size = (x0VarY == null || (linkedListF = x0VarY.f()) == null) ? 0 : linkedListF.size();
            for (int i = 1; i < size; i++) {
                q5.g(q5.z() + 1);
                q5.s0();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r1.equals("html") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0() {
        /*
            r6 = this;
            java.lang.String r0 = "Cannot handle markupType: "
            com.inmobi.media.f5 r1 = r6.j
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Q5"
            if (r1 == 0) goto L14
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            com.inmobi.media.g5 r1 = (com.inmobi.media.g5) r1
            java.lang.String r4 = "renderAdPostInternetCheck"
            r1.a(r3, r4)
        L14:
            r6.k0()
            boolean r1 = r6.o0()     // Catch: java.lang.IllegalStateException -> L9b
            if (r1 == 0) goto L1e
            return
        L1e:
            com.inmobi.media.S0 r1 = r6.s()     // Catch: java.lang.IllegalStateException -> L9b
            r1.getClass()     // Catch: java.lang.IllegalStateException -> L9b
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L9b
            r1.g = r4     // Catch: java.lang.IllegalStateException -> L9b
            r6.d0()     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.String r1 = r6.E()     // Catch: java.lang.IllegalStateException -> L9b
            int r4 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L9b
            r5 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r4 == r5) goto L66
            r5 = 3213227(0x3107ab, float:4.50269E-39)
            if (r4 == r5) goto L4f
            r5 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r4 == r5) goto L46
            goto L6e
        L46:
            java.lang.String r4 = "htmlUrl"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L9b
            if (r1 != 0) goto L57
            goto L6e
        L4f:
            java.lang.String r4 = "html"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L9b
            if (r1 == 0) goto L6e
        L57:
            android.os.Handler r0 = r6.D()     // Catch: java.lang.IllegalStateException -> L9b
            if (r0 == 0) goto Lb7
            com.inmobi.media.Q5$$ExternalSyntheticLambda4 r1 = new com.inmobi.media.Q5$$ExternalSyntheticLambda4     // Catch: java.lang.IllegalStateException -> L9b
            r1.<init>(r6)     // Catch: java.lang.IllegalStateException -> L9b
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L9b
            goto Lb7
        L66:
            java.lang.String r4 = "inmobiJson"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L9b
            if (r1 != 0) goto L8c
        L6e:
            com.inmobi.media.f5 r1 = r6.j     // Catch: java.lang.IllegalStateException -> L9b
            if (r1 == 0) goto Lb7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L9b
            r4.<init>(r0)     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.String r0 = r6.E()     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalStateException -> L9b
            com.inmobi.media.g5 r1 = (com.inmobi.media.g5) r1     // Catch: java.lang.IllegalStateException -> L9b
            r1.a(r3, r0)     // Catch: java.lang.IllegalStateException -> L9b
            goto Lb7
        L8c:
            com.inmobi.media.f5 r0 = r6.j     // Catch: java.lang.IllegalStateException -> L9b
            if (r0 == 0) goto Lb7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.IllegalStateException -> L9b
            java.lang.String r1 = "Waiting for Vast Processing"
            com.inmobi.media.g5 r0 = (com.inmobi.media.g5) r0     // Catch: java.lang.IllegalStateException -> L9b
            r0.a(r3, r1)     // Catch: java.lang.IllegalStateException -> L9b
            goto Lb7
        L9b:
            r0 = move-exception
            com.inmobi.media.f5 r1 = r6.j
            if (r1 == 0) goto Laa
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            com.inmobi.media.g5 r1 = (com.inmobi.media.g5) r1
            java.lang.String r2 = "Exception while loading ad."
            r1.a(r3, r2, r0)
        Laa:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 1
            r2 = 2134(0x856, float:2.99E-42)
            r6.b(r0, r1, r2)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q5.I0():void");
    }

    @Override // com.inmobi.media.Q0
    public void c(String str) {
        Intrinsics.checkNotNullParameter(str, "monetizationContext");
        super.c("activity");
    }

    public synchronized void d(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        super.d(ya);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new Q5$.ExternalSyntheticLambda3(this));
        }
    }

    public final void a(gc gcVar) {
        Intrinsics.checkNotNullParameter(gcVar, "<set-?>");
        this.O = gcVar;
    }

    @Override // com.inmobi.media.Q0
    public void a(byte[] bArr) {
        if (D0()) {
            super.a(bArr);
        }
    }

    public static final void a(Q5 q5, E0 e0) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        q5.i(e0);
    }

    public synchronized void e(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        super.e(ya);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new Q5$.ExternalSyntheticLambda2(this));
        }
    }

    public static final void a(Q5 q5, Ya ya, Context context) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        Intrinsics.checkNotNullParameter(ya, "$renderView");
        int iIndexOf = q5.g.indexOf(ya);
        ArrayList arrayList = q5.g;
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (iIndexOf < 0 || iIndexOf >= arrayList.size()) {
            return;
        }
        short sB = q5.b(context);
        if (sB != 0) {
            q5.f(iIndexOf);
        }
        q5.b(iIndexOf, sB == 0);
        Handler handlerD = q5.D();
        if (handlerD != null) {
            handlerD.post(new Q5$.ExternalSyntheticLambda0(q5, iIndexOf));
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(Ya ya, Context context) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            String strE = Q0.e();
            Intrinsics.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            g5Var.c(strE, "closeCurrentPodAd " + this);
        }
        if (b0()) {
            Integer numHigher = B().higher(Integer.valueOf(this.g.indexOf(ya)));
            if (numHigher != null) {
                a(numHigher.intValue(), ya, context);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(E0 e0) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q5", j6.a("Q5", "TAG", "handleAdScreenDismissed ").append((int) Q()).toString());
        }
        if (Q() == 7) {
            int i = this.M - 1;
            this.M = i;
            if (i == 1) {
                d((byte) 6);
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                    g5Var2.d("Q5", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (Q() == 6 || Q() == 8) {
            this.M--;
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                g5Var3.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + I());
            }
            if (e0 != null) {
                e0.b();
                return;
            }
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                g5Var4.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.Q0
    public void b(E0 e0) {
        if (Q() == 6) {
            int i = this.M + 1;
            this.M = i;
            if (i == 1) {
                g5 g5Var = this.j;
                if (g5Var != null) {
                    g5Var.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + I());
                }
                if (e0 != null) {
                    b((byte) 4);
                    d(e0);
                    return;
                }
                return;
            }
            d((byte) 7);
            return;
        }
        if (Q() == 7) {
            this.M++;
        }
    }

    public final void b(E0 e0, short s) {
        a(true, s);
        d((byte) 0);
    }

    @Override // com.inmobi.media.Q0
    public void b() {
        if (b0()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "Closing the ad as closeAll is called");
            }
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Q5$.ExternalSyntheticLambda6(this));
            }
        }
    }

    public static final void b(Q5 q5) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        g5 g5Var = q5.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.a("Q0", "clearAdPods " + q5);
        }
        if (q5.A) {
            q5.h();
            q5.g.clear();
            q5.w = 0;
            q5.x = 0;
            q5.z.clear();
        }
        g5 g5Var2 = q5.j;
        if (g5Var2 != null) {
            g5Var2.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + q5.I());
        }
        if (q5.r() != null) {
            E0 e0R = q5.r();
            if (e0R != null) {
                e0R.b();
                return;
            }
            return;
        }
        g5 g5Var3 = q5.j;
        if (g5Var3 != null) {
            g5Var3.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        String strM;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var.c("Q5", "onDidParseAfterFetch - parsingResult - " + z);
        }
        super.a(z, inMobiAdRequestStatus);
        if (Q() == 2) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + I());
            }
            if (Intrinsics.areEqual(E(), "inmobiJson") && (strM = I().m()) != null) {
                B6 b6 = Ea.a;
                g5 g5Var3 = this.j;
                Intrinsics.checkNotNullParameter("intNative", "logType");
                Intrinsics.checkNotNullParameter(strM, "placementType");
                TelemetryConfig.LoggingConfig loggingConfig = Ea.d.getLoggingConfig();
                if (g5Var3 != null) {
                    B6 b6A = Ea.a("intNative", strM, loggingConfig);
                    double dB = Ea.b("intNative", strM, loggingConfig);
                    e5 e5Var = new e5(b6A, dB);
                    Intrinsics.checkNotNullParameter(e5Var, "config");
                    Objects.toString(e5Var);
                    Ca ca = g5Var3.a;
                    if (ca != null) {
                        Intrinsics.checkNotNullParameter(e5Var, "config");
                        Objects.toString(e5Var);
                        Objects.toString(ca.i);
                        if (!ca.i.get()) {
                            D6 d6 = ca.e;
                            d6.getClass();
                            Intrinsics.checkNotNullParameter(b6A, "logLevel");
                            d6.a = b6A;
                            ca.f.a = dB;
                        }
                    }
                }
            }
            q0();
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(h hVar, boolean z, short s) {
        Intrinsics.checkNotNullParameter(hVar, "ad");
        if (!z) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
            return;
        }
        try {
            super.a(hVar, z, s);
        } catch (IllegalStateException e) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                g5Var.b("Q5", j6.a("Q5", "TAG", "Exception while onVastProcessCompleted : ").append(e.getMessage()).toString());
            }
        }
        h hVarM = m();
        if (hVarM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
        } else if (hVarM.G()) {
            b(true);
            V();
        } else {
            a(hVarM);
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(Y y, boolean z) {
        Intrinsics.checkNotNullParameter(y, "placement");
        super.a(y, z);
        if (!z) {
            if (Intrinsics.areEqual(I(), y)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    g5 g5Var = this.j;
                    if (g5Var != null) {
                        Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                        g5Var.d("Q5", "AdUnit " + this + " state - CREATED");
                    }
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (short) 0);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(I(), y) && 2 == Q()) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var2.a("Q5", "Asset are ready now");
            }
            if (a0()) {
                c(true);
                f();
            } else {
                r0();
            }
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(Ya ya, short s) {
        super.a(ya, s);
        if (b0()) {
            int iIndexOf = this.g.indexOf(ya);
            boolean z = false;
            Q0.a(this, iIndexOf, false, 2, null);
            int size = this.g.size();
            boolean z2 = true;
            boolean z3 = true;
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = z2;
                    i = -1;
                    break;
                }
                if (i != iIndexOf && this.g.get(i) != null) {
                    if (B().contains(Integer.valueOf(i))) {
                        break;
                    }
                    z2 = false;
                    z3 = false;
                }
                i++;
            }
            if (i != -1) {
                if (z3 && Q() == 2) {
                    b((byte) 1);
                    h(i);
                    g5 g5Var = this.j;
                    if (g5Var != null) {
                        g5Var.a("Q5", j6.a("Q5", "TAG", "Providing success based on currIndex ").append(A()).append(" as ").append(iIndexOf).append(" failed").toString());
                    }
                    L0();
                    return;
                }
                return;
            }
            if (z && Q() == 2) {
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    g5Var2.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
                return;
            }
            return;
        }
        if (Q() == 2) {
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                g5Var3.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.Q0
    public void a(int i, Ya ya, Context context) {
        Ya ya2;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (!b0()) {
            g5 g5Var = this.j;
            if (g5Var != null) {
                Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                g5Var.a("Q5", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (B().contains(Integer.valueOf(i)) && i > this.g.indexOf(ya) && i < this.g.size() && this.g.get(i) != null && ((ya2 = (Ya) this.g.get(i)) == null || ya2.m0)) {
            if (context == null) {
                context = t();
            }
            super.a(i, ya, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Q5$.ExternalSyntheticLambda1(this, ya, context));
                return;
            }
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var2.a("Q5", "Cannot show an pod ad with invalid index passed");
        }
        b(this.g.indexOf(ya), false);
    }

    public static final void a(Q5 q5, int i) {
        Intrinsics.checkNotNullParameter(q5, "this$0");
        q5.a(i, false);
    }

    @Override // com.inmobi.media.Q0
    public boolean a(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        if (b0()) {
            return B().higher(Integer.valueOf(this.g.indexOf(ya))) != null;
        }
        return false;
    }

    @Override // com.inmobi.media.Q0
    public void a(byte b) {
        if (b == 1) {
            if (b0()) {
                if (Q() == 2) {
                    if (B().isEmpty()) {
                        g5 g5Var = this.j;
                        if (g5Var != null) {
                            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                            g5Var.b("Q5", "RenderView time out, none of the ad provided success");
                        }
                        h();
                        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                        return;
                    }
                    b((byte) 1);
                    g5 g5Var2 = this.j;
                    if (g5Var2 != null) {
                        g5Var2.a("Q5", j6.a("Q5", "TAG", "RenderView time out, providing success based on ").append(B().first()).toString());
                    }
                    Integer numFirst = B().first();
                    Intrinsics.checkNotNullExpressionValue(numFirst, "first(...)");
                    h(numFirst.intValue());
                    L0();
                    int size = this.g.size();
                    for (int i = 0; i < size; i++) {
                        if (!B().contains(Integer.valueOf(i))) {
                            Q0.a(this, i, false, 2, null);
                        }
                    }
                    return;
                }
                h();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.Q0
    public void a(Ya ya, boolean z) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        super.a(ya, z);
        byte bQ = Q();
        if (bQ == 4) {
            this.P = new N5(this, z ? (short) 2220 : (short) 2219);
            return;
        }
        if (bQ != 6) {
            if (bQ == 7) {
                short s = z ? (short) 2224 : (short) 2223;
                I6.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                g5 g5Var = this.j;
                if (g5Var != null) {
                    Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
                    g5Var.b("Q5", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                ya.a(z, s);
                Activity fullScreenActivity = ya.getFullScreenActivity();
                if (fullScreenActivity != null) {
                    g5 g5Var2 = ya.i;
                    if (g5Var2 != null) {
                        String str = Ya.P0;
                        Intrinsics.checkNotNullExpressionValue(str, "TAG");
                        g5Var2.c(str, "fullScreenActivity is not null and finishing");
                    }
                    fullScreenActivity.finish();
                }
                a(r());
                return;
            }
            return;
        }
        short s2 = z ? (short) 2222 : (short) 2221;
        I6.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            Intrinsics.checkNotNullExpressionValue("Q5", "TAG");
            g5Var3.b("Q5", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        Activity fullScreenActivity2 = ya.getFullScreenActivity();
        if (fullScreenActivity2 != null) {
            g5 g5Var4 = ya.i;
            if (g5Var4 != null) {
                String str2 = Ya.P0;
                Intrinsics.checkNotNullExpressionValue(str2, "TAG");
                g5Var4.c(str2, "fullScreenActivity is not null and finishing");
            }
            fullScreenActivity2.finish();
        }
        if (this.M == 0) {
            a(true, s2);
        } else {
            ya.a(z, s2);
            a(r());
        }
    }
}
