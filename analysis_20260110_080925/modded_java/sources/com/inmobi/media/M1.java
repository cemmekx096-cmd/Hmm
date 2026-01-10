package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.vungle.ads.internal.ui.AdActivity;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class M1 extends PublisherCallbacks {
    private WeakReference<InMobiBanner> a;

    public M1(InMobiBanner inMobiBanner) {
        Intrinsics.checkNotNullParameter(inMobiBanner, "banner");
        this.a = new WeakReference<>(inMobiBanner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.a;
    }

    public byte getType() {
        return (byte) 1;
    }

    public void onAdClicked(Map<Object, ? extends Object> map) {
        F1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(map, "params");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, map);
    }

    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        G1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            Intrinsics.checkNotNullParameter(inMobiBanner, "ad");
            mPubListener$media_release.a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        G1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiBanner, "ad");
        mPubListener$media_release.a.onAdDisplayed(inMobiBanner);
    }

    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        G1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiBanner, "ad");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        mPubListener$media_release.a.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        F1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, adMetaInfo);
    }

    public void onAdImpression(rc rcVar) {
        InMobiBanner inMobiBanner = this.a.get();
        F1 mPubListener$media_release = inMobiBanner != null ? inMobiBanner.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (rcVar != null) {
                rcVar.c();
            }
        } else {
            mPubListener$media_release.a(inMobiBanner);
            if (rcVar != null) {
                rcVar.d();
            }
        }
    }

    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        Intrinsics.checkNotNullExpressionValue("M1", "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        F1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            mPubListener$media_release.a(inMobiBanner, inMobiAdRequestStatus);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        P1 mAdManager$media_release;
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mAdManager$media_release = inMobiBanner.getMAdManager$media_release()) == null) {
            return;
        }
        if (!mAdManager$media_release.B() && mAdManager$media_release.x()) {
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            F1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.b(inMobiBanner, adMetaInfo);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager$media_release.B()) {
            Q0 q0J = mAdManager$media_release.j();
            if (q0J != null) {
                q0J.b((short) 2173);
                return;
            }
            return;
        }
        Q0 q0J2 = mAdManager$media_release.j();
        if (q0J2 != null) {
            q0J2.b((short) 2174);
        }
    }

    public void onAudioStatusChanged(B1 b1) {
        Intrinsics.checkNotNullParameter(b1, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(b1);
        AudioListener mAudioListener$media_release = inMobiBanner.getMAudioListener$media_release();
        if (mAudioListener$media_release != null) {
            B1.b.getClass();
            Intrinsics.checkNotNullParameter(b1, "item");
            int iOrdinal = b1.ordinal();
            mAudioListener$media_release.onAudioStatusChanged(inMobiBanner, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    public void onImraidLog(String str) {
        F1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(str, "log");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, str);
    }

    public void onRequestPayloadCreated(byte[] bArr) {
        G1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a.onRequestPayloadCreated(bArr);
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        G1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, AdOperationMetric.REASON);
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        mPubListener$media_release.a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onRewardsUnlocked(Map<Object, ? extends Object> map) {
        G1 mPubListener$media_release;
        Intrinsics.checkNotNullParameter(map, "rewards");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiBanner, "ad");
        Intrinsics.checkNotNullParameter(map, "rewards");
        mPubListener$media_release.a.onRewardsUnlocked(inMobiBanner, map);
    }

    public void onUserLeftApplication() {
        G1 mPubListener$media_release;
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(inMobiBanner, "ad");
        mPubListener$media_release.a.onUserLeftApplication(inMobiBanner);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.a = weakReference;
    }
}
