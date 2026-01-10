package com.applovin.impl;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import io.fabric.sdk.android.services.network.HttpRequest;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class d6 extends w4 {
    private final f7 g;
    private final AppLovinAdLoadListener h;

    d6(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.h = appLovinAdLoadListener;
        this.g = f7Var;
    }

    public void run() {
        String strA = n7.a(this.g);
        if (!StringUtils.isValidString(strA)) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Resolving VAST ad with depth " + this.g.d() + " at " + strA);
        }
        try {
            ((w4) this).a.q0().a(new a(com.applovin.impl.sdk.network.a.a(((w4) this).a).b(strA).c(HttpRequest.METHOD_GET).a(c8.f).a(((Integer) ((w4) this).a.a(l4.v4)).intValue()).c(((Integer) ((w4) this).a.a(l4.w4)).intValue()).a(false).a(), ((w4) this).a));
        } catch (Throwable th) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    class a extends z5 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, c8 c8Var, int i) {
            ((w4) this).a.q0().a(v5.a(c8Var, d6.this.g, d6.this.h, ((w4) d6.this).a));
        }

        public void a(String str, int i, String str2, c8 c8Var) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            d6.this.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (o.a()) {
            ((w4) this).c.b(((w4) this).b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        n7.a(this.g, this.h, i == -1001 ? g7.TIMED_OUT : g7.GENERAL_WRAPPER_ERROR, i, ((w4) this).a);
    }
}
