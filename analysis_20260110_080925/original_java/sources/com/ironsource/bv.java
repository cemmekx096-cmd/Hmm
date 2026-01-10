package com.ironsource;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.bv$;
import com.ironsource.h7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB7\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bD\u0010EJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u001c\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u001a\u00105\u001a\u000601R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lcom/ironsource/bv;", "Lcom/ironsource/h7;", "Lcom/ironsource/k2;", "Lcom/ironsource/w1;", BuildConfig.FLAVOR, "j", BuildConfig.FLAVOR, "Lcom/ironsource/kp;", "triggers", "a", "([Lcom/ironsource/kp;)V", "l", "i", "k", "f", "Lcom/ironsource/r1;", "adUnitCallback", "c", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "g", "h", "Lcom/ironsource/m1;", "d", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/v6;", "e", "Lcom/ironsource/v6;", "bannerContainer", "Lcom/ironsource/i7;", "Lcom/ironsource/i7;", "bannerStrategyListener", "Lcom/ironsource/m6;", "Lcom/ironsource/m6;", "bannerAdUnitFactory", "Lcom/ironsource/jv;", "Lcom/ironsource/jv;", "taskScheduler", "Lcom/ironsource/u3;", "Lcom/ironsource/u3;", "appLifecycleTrigger", "Lcom/ironsource/zv;", "Lcom/ironsource/zv;", "viewVisibilityTrigger", "Lcom/ironsource/om;", "Lcom/ironsource/om;", "manualTrigger", "Lcom/ironsource/bv$a;", "Lcom/ironsource/bv$a;", "currentBanner", "m", "nextBanner", BuildConfig.FLAVOR, "n", "Z", "isShowCountdownFinished", "o", "isFirstShow", "p", "Lcom/ironsource/r1;", "q", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "Lcom/ironsource/h7$b;", "config", "Lcom/ironsource/i6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/v6;Lcom/ironsource/h7$b;Lcom/ironsource/i6;Lcom/ironsource/i7;Lcom/ironsource/m6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class bv extends h7 implements k2, w1 {

    /* renamed from: d, reason: from kotlin metadata */
    private final m1 adTools;

    /* renamed from: e, reason: from kotlin metadata */
    private final v6 bannerContainer;

    /* renamed from: f, reason: from kotlin metadata */
    private final i7 bannerStrategyListener;

    /* renamed from: g, reason: from kotlin metadata */
    private final m6 bannerAdUnitFactory;

    /* renamed from: h, reason: from kotlin metadata */
    private jv taskScheduler;

    /* renamed from: i, reason: from kotlin metadata */
    private final u3 appLifecycleTrigger;

    /* renamed from: j, reason: from kotlin metadata */
    private final zv viewVisibilityTrigger;

    /* renamed from: k, reason: from kotlin metadata */
    private final om manualTrigger;

    /* renamed from: l, reason: from kotlin metadata */
    private a currentBanner;

    /* renamed from: m, reason: from kotlin metadata */
    private a nextBanner;

    /* renamed from: n, reason: from kotlin metadata */
    private boolean isShowCountdownFinished;

    /* renamed from: o, reason: from kotlin metadata */
    private boolean isFirstShow;

    /* renamed from: p, reason: from kotlin metadata */
    private r1 adUnitCallback;

    /* renamed from: q, reason: from kotlin metadata */
    private IronSourceError error;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0006\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\n\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ironsource/bv$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "isPublisherDestroy", "a", "d", "Lcom/ironsource/k6;", "Lcom/ironsource/k6;", "b", "()Lcom/ironsource/k6;", "bannerAdUnit", "Lcom/ironsource/r1;", "Lcom/ironsource/r1;", "()Lcom/ironsource/r1;", "(Lcom/ironsource/r1;)V", "adUnitCallback", "c", "Z", "()Z", "(Z)V", "isLoading", "Lcom/ironsource/m6;", "bannerAdUnitFactory", "isPublisherLoad", "<init>", "(Lcom/ironsource/bv;Lcom/ironsource/m6;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    private final class a {

        /* renamed from: a, reason: from kotlin metadata */
        private final k6 bannerAdUnit;

        /* renamed from: b, reason: from kotlin metadata */
        public r1 adUnitCallback;

        /* renamed from: c, reason: from kotlin metadata */
        private boolean isLoading;
        final /* synthetic */ bv d;

        public a(bv bvVar, m6 m6Var, boolean z) {
            Intrinsics.checkNotNullParameter(m6Var, "bannerAdUnitFactory");
            this.d = bvVar;
            this.bannerAdUnit = m6Var.a(z);
            this.isLoading = true;
        }

        public final r1 a() {
            r1 r1Var = this.adUnitCallback;
            if (r1Var != null) {
                return r1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        public final void a(r1 r1Var) {
            Intrinsics.checkNotNullParameter(r1Var, "<set-?>");
            this.adUnitCallback = r1Var;
        }

        public final void a(boolean isPublisherDestroy) {
            this.bannerAdUnit.a(isPublisherDestroy);
        }

        /* renamed from: b, reason: from getter */
        public final k6 getBannerAdUnit() {
            return this.bannerAdUnit;
        }

        public final void b(boolean z) {
            this.isLoading = z;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final boolean d() {
            return this.bannerAdUnit.d().a();
        }

        public final void e() {
            this.bannerAdUnit.a(this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(m1 m1Var, v6 v6Var, h7.Config bVar, i6 i6Var, i7 i7Var, m6 m6Var) {
        super(bVar, i6Var);
        Intrinsics.checkNotNullParameter(m1Var, "adTools");
        Intrinsics.checkNotNullParameter(v6Var, "bannerContainer");
        Intrinsics.checkNotNullParameter(bVar, "config");
        Intrinsics.checkNotNullParameter(i6Var, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(i7Var, "bannerStrategyListener");
        Intrinsics.checkNotNullParameter(m6Var, "bannerAdUnitFactory");
        this.adTools = m1Var;
        this.bannerContainer = v6Var;
        this.bannerStrategyListener = i7Var;
        this.bannerAdUnitFactory = m6Var;
        IronLog.INTERNAL.verbose(m1.a(m1Var, "refresh interval: " + d() + ", auto refresh: " + e(), (String) null, 2, (Object) null));
        this.appLifecycleTrigger = new u3(m1Var.b());
        this.viewVisibilityTrigger = new zv(v6Var);
        this.manualTrigger = new om(!e());
        this.nextBanner = new a(this, m6Var, true);
        this.isFirstShow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bv bvVar) {
        Intrinsics.checkNotNullParameter(bvVar, "this$0");
        bvVar.isShowCountdownFinished = true;
        if (bvVar.nextBanner.d()) {
            bvVar.l();
        } else {
            if (bvVar.nextBanner.getIsLoading()) {
                return;
            }
            bvVar.k();
            bvVar.i();
            bvVar.a(bvVar.appLifecycleTrigger, bvVar.manualTrigger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bv bvVar, kp[] kpVarArr) {
        Intrinsics.checkNotNullParameter(bvVar, "this$0");
        Intrinsics.checkNotNullParameter(kpVarArr, "$triggers");
        jv jvVar = bvVar.taskScheduler;
        if (jvVar != null) {
            jvVar.c();
        }
        bvVar.taskScheduler = new jv(bvVar.adTools, new bv$.ExternalSyntheticLambda0(bvVar), bvVar.d(), ArraysKt.toList(kpVarArr));
    }

    private final void a(kp... triggers) {
        this.isShowCountdownFinished = false;
        this.adTools.c(new bv$.ExternalSyntheticLambda1(this, triggers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bv bvVar) {
        Intrinsics.checkNotNullParameter(bvVar, "this$0");
        bvVar.j();
    }

    private final void i() {
        if (e()) {
            a aVar = new a(this, this.bannerAdUnitFactory, false);
            this.nextBanner = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.adTools.a(new bv$.ExternalSyntheticLambda2(this));
    }

    private final void k() {
        this.bannerStrategyListener.c(this.error);
        this.adUnitCallback = null;
        this.error = null;
    }

    private final void l() {
        this.isFirstShow = false;
        this.nextBanner.getBannerAdUnit().a(this.bannerContainer.getViewBinder(), this);
        this.bannerStrategyListener.a(this.nextBanner.a());
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(false);
        }
        this.currentBanner = this.nextBanner;
        i();
        a(this.viewVisibilityTrigger, this.appLifecycleTrigger, this.manualTrigger);
    }

    public void a(IronSourceError error) {
        this.nextBanner.b(false);
        this.error = error;
        if (this.isFirstShow) {
            k();
            a(this.appLifecycleTrigger, this.manualTrigger);
        } else if (this.isShowCountdownFinished) {
            k();
            i();
            a(this.appLifecycleTrigger, this.manualTrigger);
        }
    }

    public void b() {
        this.bannerStrategyListener.f();
    }

    public void b(IronSourceError error) {
        this.bannerStrategyListener.d(error);
    }

    @Override // com.ironsource.h7
    public void c() {
        this.appLifecycleTrigger.e();
        this.viewVisibilityTrigger.e();
        jv jvVar = this.taskScheduler;
        if (jvVar != null) {
            jvVar.c();
        }
        this.taskScheduler = null;
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(true);
        }
        this.nextBanner.a(true);
    }

    public void c(r1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.nextBanner.a(adUnitCallback);
        this.nextBanner.b(false);
        if (this.isShowCountdownFinished || this.isFirstShow) {
            l();
        }
    }

    @Override // com.ironsource.h7
    public void f() {
        this.nextBanner.e();
    }

    @Override // com.ironsource.h7
    public void g() {
        if (e()) {
            this.manualTrigger.e();
        }
    }

    @Override // com.ironsource.h7
    public void h() {
        if (e()) {
            this.manualTrigger.f();
        }
    }
}
