package com.applovin.impl.mediation;

import com.applovin.impl.q2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final q2 a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final List f;
    private final String g;

    public MaxAdWaterfallInfoImpl(q2 q2Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(q2Var, q2Var.R(), q2Var.S(), j, list, q2Var.Q(), str);
    }

    public long getLatencyMillis() {
        return this.e;
    }

    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.g;
    }

    public String getName() {
        return this.b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.f;
    }

    public String getTestName() {
        return this.c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(q2 q2Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.a = q2Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = j;
        this.f = list2;
        this.g = str3;
    }
}
