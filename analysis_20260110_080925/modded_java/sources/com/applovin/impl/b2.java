package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.b2$b$;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.messaging.Constants;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class b2 {
    protected final com.applovin.impl.sdk.k b;
    protected final AppLovinAdServiceImpl c;
    private AppLovinAd d;
    private String e;
    private SoftReference f;
    private volatile String h;
    private volatile double j;
    public final Map a = Collections.synchronizedMap(new HashMap());
    private final Object g = new Object();
    private volatile boolean i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    private class c implements f2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {
        private final AppLovinAd a;
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        /* synthetic */ c(b2 b2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String strF;
            int i;
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = b2.this.b();
            if (!StringUtils.isValidString(strB) || !b2.this.i) {
                b2.this.b.O();
                if (o.a()) {
                    b2.this.b.O().b("IncentivizedAdController", "Invalid reward state - result: " + strB + " and wasFullyEngaged: " + b2.this.i);
                }
                b2.this.b.O();
                if (o.a()) {
                    b2.this.b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (b2.this.i) {
                    b2.this.b.O();
                    if (o.a()) {
                        b2.this.b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    i = -500;
                    strF = "network_timeout";
                } else {
                    strF = bVar.F() != null ? bVar.F() : "unknown_early_dismissal_source";
                    b2.this.b.O();
                    if (o.a()) {
                        b2.this.b.O().b("IncentivizedAdController", "Ad closed prematurely from source: " + strF);
                    }
                    i = -600;
                }
                bVar.a(b4.a(strF));
                b2.this.b.O();
                if (o.a()) {
                    b2.this.b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                l2.a(this.e, bVar, i);
                HashMap mapHashMap = CollectionUtils.hashMap("details", String.valueOf(b2.this.j));
                CollectionUtils.putStringIfValid(Constants.ScionAnalytics.PARAM_SOURCE, strF, mapHashMap);
                b2.this.b.g().a(y1.w, bVar, mapHashMap);
            }
            if (bVar.N0().getAndSet(true)) {
                return;
            }
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            b2.this.b.q0().a(new a6(bVar, b2.this.b), r5.b.e);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            l2.a(this.c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            l2.a(this.b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAdF);
            } else {
                String str = appLovinAdF == null ? "null/expired ad" : "invalid ad of type: " + appLovinAdF;
                b2.this.b.O();
                if (o.a()) {
                    b2.this.b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            b2.this.a(appLovinAdF);
            b2.this.b.O();
            if (o.a()) {
                b2.this.b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            l2.b(this.b, appLovinAd);
        }

        @Override // com.applovin.impl.f2
        public void onAdDisplayFailed(String str) {
            AppLovinAd appLovinAdF = this.a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z = this.b instanceof f2;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAdF);
            } else {
                String str2 = appLovinAdF == null ? "null/expired ad" : "invalid ad of type: " + appLovinAdF;
                b2.this.b.O();
                if (o.a()) {
                    b2.this.b.O().b("IncentivizedAdController", "Received `" + (z ? "adDisplayFailed" : "adHidden") + "` callback for " + str2);
                }
            }
            b2.this.a(appLovinAdF);
            if (z) {
                l2.a(this.b, str);
            } else {
                l2.b(this.b, this.a);
            }
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.a("quota_exceeded");
            l2.b(this.e, appLovinAd, map);
            b2.this.b.g().a(y1.v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.a("rejected");
            l2.a(this.e, appLovinAd, map);
            b2.this.b.g().a(y1.v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.a("accepted");
            l2.c(this.e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            b2.this.a("network_timeout");
            l2.a(this.e, appLovinAd, i);
            b2.this.b.g().a(y1.v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            l2.a(this.d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            l2.a(this.d, appLovinAd, d, z);
            b2.this.j = d;
            b2.this.i = z;
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }
    }

    public b2(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(-300);
    }

    public boolean d() {
        return this.d != null;
    }

    public String c() {
        return this.e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.O();
        if (o.a()) {
            this.b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private class b implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.a.adReceived(appLovinAd);
            } catch (Throwable th) {
                o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                b2.this.b.E().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        public void adReceived(AppLovinAd appLovinAd) {
            b2.this.d = appLovinAd;
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new b2$b$.ExternalSyntheticLambda0(this, appLovinAd));
            }
        }

        public void failedToReceiveAd(int i) {
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new b2$b$.ExternalSyntheticLambda1(this, i));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            try {
                this.a.failedToReceiveAd(i);
            } catch (Throwable th) {
                o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                b2.this.b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.q0().a(new g6(bVar, appLovinAdRewardListener, this.b), r5.b.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = a2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(Constants.ScionAnalytics.PARAM_SOURCE, "showRewardedAd", mapA);
        this.b.g().d(y1.p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = a7.a(appLovinAdImpl, this.b);
        String strA = a(appLovinAdA, (AppLovinAd) appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.b.y0(), context);
        for (String str : this.a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = a2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(Constants.ScionAnalytics.PARAM_SOURCE, "showRewardedAdView", mapA);
        this.b.g().d(y1.p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = a7.a(appLovinAdImpl, this.b);
        String strA = a(appLovinAdA, (AppLovinAd) appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.b.y0(), context);
        for (String str : this.a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, f2 f2Var) {
        l2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        l2.a(f2Var, str);
        Map mapA = a2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid(Constants.ScionAnalytics.PARAM_SOURCE, "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.b.g().d(y1.s, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        com.applovin.impl.sdk.ad.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        if (!(cVar instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == cVar) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar2 = cVar;
            if (cVar2.f() == null || appLovinAd == cVar2.f()) {
                this.d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
