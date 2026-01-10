package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.Z2$;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Z2 {
    public final h a;
    public final long b;
    public final String c = "Z2";
    public final d3 d = new d3();
    public long e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public Z2(h hVar, long j) {
        this.a = hVar;
        this.b = j;
    }

    public final void a() {
        h hVar;
        h hVar2;
        Long lM;
        String strH;
        Boolean boolC;
        Intrinsics.checkNotNull(this.c);
        h hVar3 = this.a;
        if (hVar3 != null && (boolC = hVar3.C()) != null) {
            boolean zBooleanValue = boolC.booleanValue();
            c3 c3Var = c3.a;
            Context contextD = Kb.d();
            if (contextD != null) {
                Intrinsics.checkNotNull("c3");
                if (zBooleanValue != c3.d()) {
                    Intrinsics.checkNotNull("c3");
                    ConcurrentHashMap concurrentHashMap = e6.b;
                    e6.a(d6.a(contextD, "c_data_store"), "isEnabled", zBooleanValue, false, 4, (Object) null);
                    if (!zBooleanValue) {
                        c3Var.e();
                    }
                }
            }
        }
        c3 c3Var2 = c3.a;
        if (c3.d() && !this.f.getAndSet(true)) {
            this.e = System.currentTimeMillis();
            if (!this.g.get()) {
                h hVar4 = this.a;
                if ((hVar4 != null ? hVar4.h() : null) != null && (strH = this.a.h()) != null) {
                    d3 d3Var = this.d;
                    d3Var.getClass();
                    Intrinsics.checkNotNullParameter(strH, "<set-?>");
                    d3Var.a = strH;
                    Intrinsics.checkNotNull(this.c);
                }
            }
            if (!this.g.get() && (hVar2 = this.a) != null && (lM = hVar2.m()) != null) {
                this.d.b = lM.longValue();
                Intrinsics.checkNotNull(this.c);
            }
            if (!this.g.get()) {
                this.d.e = this.b;
                Intrinsics.checkNotNull(this.c);
            }
            if (!this.g.get() && (hVar = this.a) != null) {
                this.d.f = hVar.n();
                Intrinsics.checkNotNull(this.c);
            }
            long j = this.e / VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
            if (this.g.get()) {
                return;
            }
            this.d.c = j;
            Intrinsics.checkNotNull(this.c);
        }
    }

    public final void b() {
        c3 c3Var = c3.a;
        if (!c3.d()) {
            Intrinsics.checkNotNull(this.c);
            return;
        }
        if (!this.f.get()) {
            Intrinsics.checkNotNull(this.c);
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.e);
        if (!this.g.get()) {
            this.d.d = iCurrentTimeMillis;
            Intrinsics.checkNotNull(this.c);
        }
        if (this.g.getAndSet(true)) {
            Intrinsics.checkNotNull(this.c);
        } else {
            Intrinsics.checkNotNull(this.c);
            Kb.a((Runnable) new Z2$.ExternalSyntheticLambda0(this));
        }
    }

    public static final void a(Z2 z2) {
        List listEmptyList;
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        AdConfig.ContextualDataConfig contextualData4;
        Intrinsics.checkNotNullParameter(z2, "this$0");
        c3 c3Var = c3.a;
        d3 d3Var = z2.d;
        Intrinsics.checkNotNullParameter(d3Var, "contextualDataModel");
        synchronized (c3Var) {
            Intrinsics.checkNotNull("c3");
            long jCurrentTimeMillis = System.currentTimeMillis();
            AdConfig adConfig = c3.e;
            int maxAdRecords = 0;
            long expiryTime = jCurrentTimeMillis - (((adConfig == null || (contextualData4 = adConfig.getContextualData()) == null) ? 0 : contextualData4.getExpiryTime()) * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
            AdConfig adConfig2 = c3.e;
            c3.a(expiryTime, ((adConfig2 == null || (contextualData3 = adConfig2.getContextualData()) == null) ? 0 : contextualData3.getMaxAdRecords()) - 1);
            AdConfig adConfig3 = c3.e;
            if (adConfig3 == null || (contextualData2 = adConfig3.getContextualData()) == null || (listEmptyList = contextualData2.getSkipFields()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String string = e3.a(d3Var, listEmptyList).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Z3 z3 = new Z3(a4.a(string, c3.f), jCurrentTimeMillis);
            c3.b.add(z3);
            Object objClone = c3.b.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            c3.c = (LinkedList) objClone;
            AdConfig adConfig4 = c3.e;
            if (adConfig4 != null && (contextualData = adConfig4.getContextualData()) != null) {
                maxAdRecords = contextualData.getMaxAdRecords();
            }
            Intrinsics.checkNotNull("c3");
            Y2 y2 = (Y2) Db.d.getValue();
            y2.getClass();
            Objects.toString(z3);
            y2.a(z3);
            y2.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + maxAdRecords + ") foo);", null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
