package com.ironsource;

import com.crashlytics.android.BuildConfig;
import com.ironsource.dq;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.rd;
import com.ironsource.s;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006!"}, d2 = {"Lcom/ironsource/hl;", "Lcom/ironsource/or;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", BuildConfig.FLAVOR, "adUnitId", "Lcom/ironsource/rd$c;", "a", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "Lcom/ironsource/do;", "c", "d", "Lcom/ironsource/h7$b;", "Lcom/ironsource/rd$a;", "b", "Lcom/unity3d/mediation/LevelPlayAdSize;", "h", BuildConfig.FLAVOR, "i", "placementName", "Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/zl;", "tools", "Lcom/ironsource/mq;", "j", "Lcom/ironsource/s1;", "Lcom/ironsource/rp;", BuildConfig.FLAVOR, "sdkConfig", "<init>", "(Lcom/ironsource/or;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class hl extends or {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(or orVar) {
        super(orVar);
        Intrinsics.checkNotNullParameter(orVar, "sdkConfig");
    }

    private final rd.c a(LevelPlay.AdFormat adFormat, String adUnitId) {
        s.d dVarB;
        aq aqVarG;
        Map mapA;
        s.d dVar;
        aq aqVarG2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        s sVar = (s) g().a().a().get(adFormat);
        rd.c cVarA = null;
        rd.c cVarA2 = (sVar == null || (mapA = sVar.a()) == null || (dVar = (s.d) mapA.get(adUnitId)) == null || (aqVarG2 = dVar.g()) == null) ? null : aqVarG2.a();
        if (sVar != null && (dVarB = sVar.b()) != null && (aqVarG = dVarB.g()) != null) {
            cVarA = aqVarG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        return cVarA2 != null ? cVarA2 : z ? rd.c.c : rd.c.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[PHI: r8
      0x0058: PHI (r8v20 java.lang.Boolean) = (r8v4 java.lang.Boolean), (r8v13 java.lang.Boolean), (r8v22 java.lang.Boolean) binds: [B:16:0x0056, B:22:0x0081, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.h7.Config a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "adUnitId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.ironsource.xr r0 = r7.g()
            com.ironsource.s8 r0 = r0.a()
            com.ironsource.s6 r0 = r0.c()
            java.util.Map r1 = r0.a()
            java.lang.Object r1 = r1.get(r8)
            com.ironsource.s6$b r1 = (com.ironsource.s6.b) r1
            if (r1 == 0) goto L1e
            goto L22
        L1e:
            com.ironsource.s6$b r1 = r0.b()
        L22:
            int r1 = r1.b()
            java.util.Map r2 = r0.a()
            java.lang.Object r2 = r2.get(r8)
            com.ironsource.s6$b r2 = (com.ironsource.s6.b) r2
            if (r2 == 0) goto L33
            goto L37
        L33:
            com.ironsource.s6$b r2 = r0.b()
        L37:
            boolean r2 = r2.d()
            java.util.Map r3 = r0.a()
            java.lang.Object r8 = r3.get(r8)
            com.ironsource.s6$b r8 = (com.ironsource.s6.b) r8
            if (r8 == 0) goto L4e
            java.lang.Boolean r8 = r8.e()
            if (r8 == 0) goto L4e
            goto L58
        L4e:
            com.ironsource.s6$b r8 = r0.b()
            java.lang.Boolean r8 = r8.e()
            if (r8 == 0) goto L5d
        L58:
            boolean r8 = r8.booleanValue()
            goto L85
        L5d:
            com.ironsource.xr r8 = r7.g()
            com.ironsource.s8 r8 = r8.a()
            com.ironsource.x3 r8 = r8.b()
            com.ironsource.v3 r8 = r8.a()
            java.util.Map r8 = r8.a()
            com.unity3d.mediation.LevelPlay$AdFormat r0 = com.unity3d.mediation.LevelPlay.AdFormat.BANNER
            java.lang.Object r8 = r8.get(r0)
            com.ironsource.p r8 = (com.ironsource.p) r8
            if (r8 == 0) goto L80
            java.lang.Boolean r8 = r8.a()
            goto L81
        L80:
            r8 = 0
        L81:
            if (r8 == 0) goto L84
            goto L58
        L84:
            r8 = 0
        L85:
            if (r8 == 0) goto L8a
            com.ironsource.h7$c r8 = com.ironsource.h7.c.TIMED_SHOW
            goto L8c
        L8a:
            com.ironsource.h7$c r8 = com.ironsource.h7.c.TIMED_LOAD
        L8c:
            com.ironsource.h7$b r0 = new com.ironsource.h7$b
            long r3 = (long) r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.<init>(r8, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.hl.a(java.lang.String):com.ironsource.h7$b");
    }

    public final s1 a(zl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new s1(tools, g().a().a());
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, dq.b> mapA;
        Set<String> setKeySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        dq.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (list = CollectionsKt.toList(setKeySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, dq.b> mapA;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        dq.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        s.d dVarB;
        Long lD;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        s sVar = (s) g().a().a().get(adFormat);
        long jLongValue = (sVar == null || (dVarB = sVar.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final rd.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new rd.a(a(adFormat, adUnitId));
    }

    public final rp b(zl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new rp(tools, g().a().a());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Placement c(LevelPlay.AdFormat adFormat, String placementName) throws NoWhenBranchMatchedException {
        Placement placementA;
        InterstitialPlacement interstitialPlacementA;
        String str;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            cr crVarF = d().c().f();
            if (crVarF == null || (placementA = crVarF.a(placementName)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(placementA, "getRewardedVideoPlacement(placementName)");
            return new Placement(placementA.getPlacementId(), placementA.getPlacementName(), placementA.isDefault(), placementA.getRewardName(), placementA.getRewardAmount(), placementA.getPlacementAvailabilitySettings());
        }
        if (i == 2) {
            qj qjVarD = d().c().d();
            if (qjVarD == null || (interstitialPlacementA = qjVarD.a(placementName)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(interstitialPlacementA, "getInterstitialPlacement(placementName)");
            return new Placement(interstitialPlacementA);
        }
        if (i == 3) {
            t6 t6VarC = d().c().c();
            if (t6VarC == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            g7 g7VarA = t6VarC.a(placementName);
            if (g7VarA == null) {
                g7VarA = t6VarC.i();
                str = "config.defaultBannerPlacement";
            } else {
                str = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            Intrinsics.checkNotNullExpressionValue(g7VarA, str);
            return new Placement(g7VarA);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        vm vmVarE = d().c().e();
        if (vmVarE != null && placementName != null) {
            gn gnVarA = vmVarE.a(placementName);
            if (gnVarA == null) {
                gnVarA = vmVarE.e();
            }
            if (gnVarA != null) {
                return new Placement(gnVarA);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final mq c(zl tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        s sVar = (s) g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new mq(tools, sVar != null ? sVar.a() : null, sVar != null ? sVar.c() : null);
    }

    public final List<do> c(LevelPlay.AdFormat adFormat) {
        Map<String, dq.b> mapA;
        Set<String> setKeySet;
        List<do> listDistinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        dq.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            if (listFlatten != null && (listDistinct = CollectionsKt.distinct(listFlatten)) != null) {
                return listDistinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final List<do> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, dq.b> mapA;
        dq.b bVar;
        List<String> listA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        dq.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(adUnitId)) == null || (listA = bVar.a()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            do doVar = (do) g().e().a().get((String) it.next());
            if (doVar != null) {
                arrayList.add(doVar);
            }
        }
        return arrayList;
    }

    public final List<LevelPlayAdSize> h() {
        List listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().c();
    }

    public final boolean j() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean k() {
        return g().a().b().d();
    }
}
