package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.bd;
import com.ironsource.c2;
import com.ironsource.jl;
import com.ironsource.m1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.ml;
import com.ironsource.p9;
import com.ironsource.pf;
import com.ironsource.qm;
import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dB\u0019\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006#"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "loadAd", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "placementName", "showAd", BuildConfig.FLAVOR, "isAdReady", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "a", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/ml;", "b", "Lcom/ironsource/ml;", "adInternal", "getAdId", "adId", "<init>", "(Ljava/lang/String;)V", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;", "config", "(Ljava/lang/String;Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;)V", "Lcom/ironsource/jl$c;", "payload", "(Ljava/lang/String;Lcom/ironsource/jl$c;)V", "Companion", "Config", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class LevelPlayInterstitialAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String adUnitId;

    /* renamed from: b, reason: from kotlin metadata */
    private final ml adInternal;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Companion;", BuildConfig.FLAVOR, "()V", "isPlacementCapped", BuildConfig.FLAVOR, "placementName", BuildConfig.FLAVOR, "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isPlacementCapped(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return jl.n.a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;", "Lcom/ironsource/jl$b;", BuildConfig.FLAVOR, "component1", "()Ljava/lang/Double;", "bidFloor", "copy", "(Ljava/lang/Double;)Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/Double;", "getBidFloor", "<init>", "(Ljava/lang/Double;)V", "Companion", "Builder", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Config implements jl.b {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final Double bidFloor;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config$Builder;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bidFloor", "setBidFloor", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;", "build", "a", "Ljava/lang/Double;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Builder {

            /* renamed from: a, reason: from kotlin metadata */
            private Double bidFloor;

            public final Config build() {
                return new Config(this.bidFloor);
            }

            public final Builder setBidFloor(double bidFloor) {
                this.bidFloor = Double.valueOf(bidFloor);
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config$Companion;", BuildConfig.FLAVOR, "()V", "empty", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Config;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Config empty() {
                return new Config(null);
            }
        }

        public Config(Double d) {
            this.bidFloor = d;
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.bidFloor;
            }
            return config.copy(d);
        }

        /* renamed from: component1, reason: from getter */
        public final Double getBidFloor() {
            return this.bidFloor;
        }

        public final Config copy(Double bidFloor) {
            return new Config(bidFloor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Config) && Intrinsics.areEqual(this.bidFloor, ((Config) other).bidFloor);
        }

        public Double getBidFloor() {
            return this.bidFloor;
        }

        public int hashCode() {
            Double d = this.bidFloor;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.bidFloor + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String str) {
        this(str, Config.INSTANCE.empty());
        Intrinsics.checkNotNullParameter(str, "adUnitId");
    }

    public LevelPlayInterstitialAd(String str, jl.c cVar) {
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        Intrinsics.checkNotNullParameter(cVar, "payload");
        IronLog.API.info("adUnitId: " + str + ", config: " + cVar.c());
        this.adUnitId = str;
        this.adInternal = new ml(str, cVar.c(), cVar.b(), cVar.a(), cVar.f(), cVar.d(), cVar.e());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String str, Config config) {
        this(str, new jl.c(new m1(IronSource.AD_UNIT.INTERSTITIAL, c2.b.a), new bd(), qm.r.d(), new p9.a(), pf.a, config));
        Intrinsics.checkNotNullParameter(str, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @JvmStatic
    public static final boolean isPlacementCapped(String str) {
        return INSTANCE.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.adInternal.b();
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final boolean isAdReady() {
        return this.adInternal.c();
    }

    public final void loadAd() {
        this.adInternal.d();
    }

    public final void setListener(LevelPlayInterstitialAdListener listener) {
        this.adInternal.a(listener);
    }

    public final void showAd(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public final void showAd(Activity activity, String placementName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.adInternal.a(activity, placementName);
    }
}
