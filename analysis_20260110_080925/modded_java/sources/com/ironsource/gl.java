package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.ironsource.c2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.gl$;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001\u0005B3\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010(\u001a\u00020&¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u001c\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010\f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0016\u00100R(\u00103\u001a\u0004\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b*\u00102R$\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b.\u0010\u001eR\u0018\u00105\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/ironsource/gl;", "Lcom/ironsource/v5;", BuildConfig.FLAVOR, "h", "Lcom/ironsource/u5;", "a", BuildConfig.FLAVOR, "i", "b", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/mediation/LevelPlayAdSize;", "adSize", BuildConfig.FLAVOR, "placementName", "j", "k", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "isReload", "Lcom/unity3d/mediation/LevelPlayAdError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "e", "c", "Ljava/util/UUID;", "Ljava/util/UUID;", "()Ljava/util/UUID;", "adId", "Ljava/lang/String;", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/v6;", "Lcom/ironsource/v6;", "bannerContainer", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", "config", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/ji;", "f", "Lcom/ironsource/ji;", "testSuiteLoadConfigService", "<set-?>", "g", "Lcom/unity3d/mediation/LevelPlayAdSize;", "()Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "()Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "bannerListener", "Lcom/ironsource/u5;", "bannerAdController", "Ljava/lang/Boolean;", "isAutoRefreshEnabled", "Lcom/ironsource/mediationsdk/model/Placement;", "l", "Lcom/ironsource/mediationsdk/model/Placement;", "bannerPlacement", "m", "Z", "isLoadAdCalled", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/v6;Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;Lcom/ironsource/m1;)V", "n", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class gl implements v5 {

    /* renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final UUID adId;

    /* renamed from: b, reason: from kotlin metadata */
    private final String adUnitId;

    /* renamed from: c, reason: from kotlin metadata */
    private final v6 bannerContainer;

    /* renamed from: d, reason: from kotlin metadata */
    private final LevelPlayBannerAdView.Config config;

    /* renamed from: e, reason: from kotlin metadata */
    private final m1 adTools;

    /* renamed from: f, reason: from kotlin metadata */
    private final ji testSuiteLoadConfigService;

    /* renamed from: g, reason: from kotlin metadata */
    private LevelPlayAdSize adSize;

    /* renamed from: h, reason: from kotlin metadata */
    private LevelPlayBannerAdViewListener bannerListener;

    /* renamed from: i, reason: from kotlin metadata */
    private String placementName;

    /* renamed from: j, reason: from kotlin metadata */
    private u5 bannerAdController;

    /* renamed from: k, reason: from kotlin metadata */
    private Boolean isAutoRefreshEnabled;

    /* renamed from: l, reason: from kotlin metadata */
    private Placement bannerPlacement;

    /* renamed from: m, reason: from kotlin metadata */
    private boolean isLoadAdCalled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ironsource/gl$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lcom/unity3d/mediation/banner/LevelPlayBannerAdView$Config;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lkotlin/Pair;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.gl$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = BuildConfig.FLAVOR;
            if (attributeSet == null) {
                return TuplesKt.to(BuildConfig.FLAVOR, LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return TuplesKt.to(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public gl(UUID uuid, String str, v6 v6Var, LevelPlayBannerAdView.Config config, m1 m1Var) {
        Intrinsics.checkNotNullParameter(uuid, "adId");
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        Intrinsics.checkNotNullParameter(v6Var, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(m1Var, "adTools");
        this.adId = uuid;
        this.adUnitId = str;
        this.bannerContainer = v6Var;
        this.config = config;
        this.adTools = m1Var;
        this.testSuiteLoadConfigService = qm.r.d().o();
        LevelPlayAdSize adSize = config.getAdSize();
        this.adSize = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.placementName = placementName == null ? BuildConfig.FLAVOR : placementName;
        m1Var.e().a(new n(IronSource.AD_UNIT.BANNER, uuid, str));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            m1Var.e().f().a(bidFloor.doubleValue());
        }
    }

    public /* synthetic */ gl(UUID uuid, String str, v6 v6Var, LevelPlayBannerAdView.Config config, m1 m1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? pf.a.a() : uuid, str, v6Var, config, (i & 16) != 0 ? new m1(IronSource.AD_UNIT.BANNER, c2.b.a) : m1Var);
    }

    private final u5 a() {
        Placement placement;
        this.bannerPlacement = this.adTools.a(this.placementName);
        Context context = this.bannerContainer.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.adId;
        String str = this.adUnitId;
        Placement placement2 = this.bannerPlacement;
        BasePlacement basePlacement = null;
        if (placement2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            placement = null;
        } else {
            placement = placement2;
        }
        i6 i6Var = new i6(uuid, str, placement, this.adSize, (Boolean) null, (Long) null, this.testSuiteLoadConfigService.a(), this.config.getBidFloor(), 48, (DefaultConstructorMarker) null);
        this.adTools.e().a(new a2(this.adTools, i6Var, (String) null, 4, (DefaultConstructorMarker) null));
        ISBannerSize iSBannerSizeA = this.adTools.a(i6Var.h());
        xb xbVarE = this.adTools.e();
        m1 m1Var = this.adTools;
        BasePlacement basePlacement2 = this.bannerPlacement;
        if (basePlacement2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            basePlacement = basePlacement2;
        }
        xbVarE.a(new x6(m1Var, iSBannerSizeA, basePlacement.getPlacementName()));
        return new u5(this, this.adTools, i6Var, this.bannerContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl glVar) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        if (!glVar.isLoadAdCalled) {
            IronLog.INTERNAL.warning(m1.a(glVar.adTools, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (glVar.bannerAdController == null) {
            IronLog.INTERNAL.warning(m1.a(glVar.adTools, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        zl.a(glVar.adTools, new gl$.ExternalSyntheticLambda12(glVar), 0L, 2, (Object) null);
        u5 u5Var = glVar.bannerAdController;
        if (u5Var != null) {
            u5Var.k();
        }
        glVar.bannerAdController = null;
        glVar.isAutoRefreshEnabled = null;
        glVar.bannerListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl glVar, LevelPlayAdSize levelPlayAdSize) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayAdSize, "$adSize");
        if (glVar.isLoadAdCalled) {
            return;
        }
        glVar.adSize = levelPlayAdSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl glVar, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        glVar.bannerListener = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl glVar, String str) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        Intrinsics.checkNotNullParameter(str, "$placementName");
        if (glVar.isLoadAdCalled) {
            return;
        }
        glVar.placementName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "$it");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(levelPlayAdError, "$it");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + levelPlayAdInfo + " error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(levelPlayAdInfo, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gl glVar) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        glVar.bannerContainer.removeAllViews();
        ViewParent parent = glVar.bannerContainer.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(glVar.bannerContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(gl glVar) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        if (glVar.isLoadAdCalled) {
            IronLog.INTERNAL.warning(m1.a(glVar.adTools, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        glVar.isLoadAdCalled = true;
        if (glVar.h()) {
            u5 u5VarA = glVar.a();
            Boolean bool = glVar.isAutoRefreshEnabled;
            if (bool != null) {
                if (bool.booleanValue()) {
                    u5VarA.q();
                } else {
                    u5VarA.p();
                }
            }
            u5VarA.l();
            glVar.bannerAdController = u5VarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(gl glVar) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        glVar.adTools.e().f().b();
        u5 u5Var = glVar.bannerAdController;
        if (u5Var != null) {
            u5Var.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(gl glVar) {
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        glVar.adTools.e().f().c();
        u5 u5Var = glVar.bannerAdController;
        if (u5Var != null) {
            u5Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo levelPlayAdInfo, gl glVar) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(glVar, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = glVar.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(levelPlayAdInfo);
        }
    }

    private final boolean h() {
        LevelPlayAdError levelPlayAdError;
        if (this.adUnitId.length() == 0) {
            String string = this.adId.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string, this.adUnitId, 624, "Ad unit ID should be specified");
        } else {
            if (this.adTools.g()) {
                hl hlVarA = qm.r.d().t().a();
                if (hlVarA != null && hlVarA.a(this.adUnitId, LevelPlay.AdFormat.BANNER)) {
                    return true;
                }
                LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.bannerListener;
                if (levelPlayBannerAdViewListener != null) {
                    String string2 = this.adId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "adId.toString()");
                    levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string2, this.adUnitId, 626, "Invalid ad unit id"));
                }
                return false;
            }
            String string3 = this.adId.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string3, this.adUnitId, 625, "load must be called after init success callback");
        }
        a(levelPlayAdError);
        return false;
    }

    public void a(LevelPlayAdError error) {
        if (error != null) {
            this.adTools.e(new gl$.ExternalSyntheticLambda13(error, this));
        }
    }

    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda7(adInfo, this));
    }

    public void a(LevelPlayAdInfo adInfo, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (error != null) {
            this.adTools.e(new gl$.ExternalSyntheticLambda10(adInfo, error, this));
        }
    }

    public void a(LevelPlayAdInfo adInfo, boolean isReload) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda14(isReload, adInfo, this));
    }

    public final void a(LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        IronLog.API.info("LevelPlayBannerAdView.setBannerAdSize() adSize: " + adSize);
        this.adTools.d(new gl$.ExternalSyntheticLambda6(this, adSize));
    }

    public final void a(LevelPlayBannerAdViewListener listener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.adTools.d(new gl$.ExternalSyntheticLambda5(this, listener));
    }

    public final void a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        IronLog.API.info("LevelPlayBannerAdView.setPlacementName() placementName: " + placementName);
        this.adTools.d(new gl$.ExternalSyntheticLambda15(this, placementName));
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.adTools.d(new gl$.ExternalSyntheticLambda11(this));
    }

    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda9(adInfo, this));
    }

    /* renamed from: c, reason: from getter */
    public final UUID getAdId() {
        return this.adId;
    }

    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda2(adInfo, this));
    }

    /* renamed from: d, reason: from getter */
    public final LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    public void d(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda0(adInfo, this));
    }

    /* renamed from: e, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public void e(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.e(new gl$.ExternalSyntheticLambda8(adInfo, this));
    }

    /* renamed from: f, reason: from getter */
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.bannerListener;
    }

    /* renamed from: g, reason: from getter */
    public final String getPlacementName() {
        return this.placementName;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.adTools.d(new gl$.ExternalSyntheticLambda3(this));
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        if (this.bannerAdController != null) {
            this.adTools.d(new gl$.ExternalSyntheticLambda4(this));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        if (this.bannerAdController != null) {
            this.adTools.d(new gl$.ExternalSyntheticLambda1(this));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = Boolean.TRUE;
        }
    }
}
