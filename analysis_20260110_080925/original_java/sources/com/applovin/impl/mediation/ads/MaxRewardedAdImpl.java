package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    private class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super(MaxRewardedAdImpl.this);
        }

        public void onAdHidden(MaxAd maxAd) {
            t2 t2Var = (t2) maxAd;
            if (!t2Var.m0().get()) {
                o oVar = ((com.applovin.impl.mediation.ads.a) MaxRewardedAdImpl.this).logger;
                if (o.a()) {
                    MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                    ((com.applovin.impl.mediation.ads.a) maxRewardedAdImpl).logger.a(((com.applovin.impl.mediation.ads.a) maxRewardedAdImpl).tag, "User not rewarded for ad: " + maxAd);
                }
                ((com.applovin.impl.mediation.ads.a) MaxRewardedAdImpl.this).sdk.P().a(y1.h0, t2Var);
            }
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            o oVar = ((com.applovin.impl.mediation.ads.a) MaxRewardedAdImpl.this).logger;
            if (o.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                ((com.applovin.impl.mediation.ads.a) maxRewardedAdImpl).logger.a(((com.applovin.impl.mediation.ads.a) maxRewardedAdImpl).tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + ((com.applovin.impl.mediation.ads.a) MaxRewardedAdImpl.this).adListener);
            }
            l2.a(((com.applovin.impl.mediation.ads.a) MaxRewardedAdImpl.this).adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, aVar, str2, kVar, context);
    }

    protected MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }
}
