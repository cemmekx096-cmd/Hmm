package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.internal.special.SpecialsBridge;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.vungle.ads.internal.ui.AdActivity;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class R5 extends PublisherCallbacks {
    public WeakReference<InMobiInterstitial> a;

    public R5(InMobiInterstitial inMobiInterstitial) {
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "interstitial");
        this.a = new WeakReference<>(inMobiInterstitial);
    }

    public byte getType() {
        return (byte) 1;
    }

    public void onAdClicked(Map<Object, ? extends Object> map) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(map, "params");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, map);
    }

    public void onAdDismissed() {
        L5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        ((M5) mPubListener$media_release).a.onAdDismissed(inMobiInterstitial);
    }

    public void onAdDisplayFailed() {
        L5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        ((M5) mPubListener$media_release).a.onAdDisplayFailed(inMobiInterstitial);
    }

    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        SpecialsBridge.inmobiOnInterstitialAdDisplayed(((M5) mPubListener$media_release).a, inMobiInterstitial, adMetaInfo);
    }

    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        ((M5) mPubListener$media_release).a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, adMetaInfo);
    }

    public void onAdImpression(rc rcVar) {
        InMobiInterstitial inMobiInterstitial = this.a.get();
        L5 mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (rcVar != null) {
                rcVar.c();
            }
        } else {
            mPubListener$media_release.a(inMobiInterstitial);
            if (rcVar != null) {
                rcVar.d();
            }
        }
    }

    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
    }

    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, adMetaInfo);
    }

    public void onAdWillDisplay() {
        L5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        ((M5) mPubListener$media_release).a.onAdWillDisplay(inMobiInterstitial);
    }

    public void onImraidLog(String str) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(str, "log");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, str);
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((M5) mPubListener$media_release).a.onRequestPayloadCreated(bArr);
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, AdOperationMetric.REASON);
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        ((M5) mPubListener$media_release).a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        L5 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(map, "rewards");
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(map, "rewards");
        ((M5) mPubListener$media_release).a.onRewardsUnlocked(inMobiInterstitial, map);
    }

    public void onUserLeftApplication() {
        L5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        ((M5) mPubListener$media_release).a.onUserLeftApplication(inMobiInterstitial);
    }
}
