package com.ironsource;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00062\u00020\u0001:\u0003\f\u0010\u0006B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H\u0004J\b\u0010\n\u001a\u00020\tH\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/h7;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "g", "h", "c", BuildConfig.FLAVOR, "d", BuildConfig.FLAVOR, "e", "Lcom/ironsource/h7$b;", "a", "Lcom/ironsource/h7$b;", "config", "Lcom/ironsource/i6;", "b", "Lcom/ironsource/i6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/h7$b;Lcom/ironsource/i6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class h7 {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final Config config;

    /* renamed from: b, reason: from kotlin metadata */
    private final i6 bannerAdProperties;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/h7$a;", BuildConfig.FLAVOR, "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/v6;", "bannerContainer", "Lcom/ironsource/h7$b;", "config", "Lcom/ironsource/i6;", "bannerAdProperties", "Lcom/ironsource/i7;", "bannerStrategyListener", "Lcom/ironsource/m6;", "createBannerAdUnitFactory", "Lcom/ironsource/h7;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.h7$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.ironsource.h7$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0036a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.TIMED_LOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.TIMED_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final h7 a(m1 adTools, v6 bannerContainer, Config config, i6 bannerAdProperties, i7 bannerStrategyListener, m6 createBannerAdUnitFactory) throws NoWhenBranchMatchedException {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
            Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
            Intrinsics.checkNotNullParameter(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i = C0036a.a[config.e().ordinal()];
            if (i == 1) {
                return new av(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            if (i == 2) {
                return new bv(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/h7$b;", BuildConfig.FLAVOR, "Lcom/ironsource/h7$c;", "a", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "c", "strategyType", "refreshInterval", "isAutoRefreshEnabled", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", "equals", "Lcom/ironsource/h7$c;", "e", "()Lcom/ironsource/h7$c;", "J", "d", "()J", "Z", "f", "()Z", "<init>", "(Lcom/ironsource/h7$c;JZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.h7$b, reason: from toString */
    public static final /* data */ class Config {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final c strategyType;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final long refreshInterval;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean isAutoRefreshEnabled;

        public Config(c cVar, long j, boolean z) {
            Intrinsics.checkNotNullParameter(cVar, "strategyType");
            this.strategyType = cVar;
            this.refreshInterval = j;
            this.isAutoRefreshEnabled = z;
        }

        public static /* synthetic */ Config a(Config config, c cVar, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = config.strategyType;
            }
            if ((i & 2) != 0) {
                j = config.refreshInterval;
            }
            if ((i & 4) != 0) {
                z = config.isAutoRefreshEnabled;
            }
            return config.a(cVar, j, z);
        }

        public final Config a(c strategyType, long refreshInterval, boolean isAutoRefreshEnabled) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new Config(strategyType, refreshInterval, isAutoRefreshEnabled);
        }

        /* renamed from: a, reason: from getter */
        public final c getStrategyType() {
            return this.strategyType;
        }

        /* renamed from: b, reason: from getter */
        public final long getRefreshInterval() {
            return this.refreshInterval;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsAutoRefreshEnabled() {
            return this.isAutoRefreshEnabled;
        }

        public final long d() {
            return this.refreshInterval;
        }

        public final c e() {
            return this.strategyType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.strategyType == config.strategyType && this.refreshInterval == config.refreshInterval && this.isAutoRefreshEnabled == config.isAutoRefreshEnabled;
        }

        public final boolean f() {
            return this.isAutoRefreshEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((this.strategyType.hashCode() * 31) + Long.hashCode(this.refreshInterval)) * 31;
            boolean z = this.isAutoRefreshEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public String toString() {
            return "Config(strategyType=" + this.strategyType + ", refreshInterval=" + this.refreshInterval + ", isAutoRefreshEnabled=" + this.isAutoRefreshEnabled + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/h7$c;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public h7(Config config, i6 i6Var) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(i6Var, "bannerAdProperties");
        this.config = config;
        this.bannerAdProperties = i6Var;
    }

    public abstract void c();

    protected final long d() {
        Long lJ = this.bannerAdProperties.j();
        return lJ != null ? lJ.longValue() : this.config.d();
    }

    protected final boolean e() {
        Boolean boolI = this.bannerAdProperties.i();
        return boolI != null ? boolI.booleanValue() : this.config.f();
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
