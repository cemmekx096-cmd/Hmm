package com.applovin.mediation.adapters;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class GoogleAdManagerMediationAdapter$$ExternalSyntheticLambda0 implements OnUserEarnedRewardListener {
    public final /* synthetic */ GoogleAdManagerMediationAdapter f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ GoogleAdManagerMediationAdapter$$ExternalSyntheticLambda0(GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter, String str) {
        this.f$0 = googleAdManagerMediationAdapter;
        this.f$1 = str;
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        this.f$0.lambda$showRewardedAd$0$com-applovin-mediation-adapters-GoogleAdManagerMediationAdapter(this.f$1, rewardItem);
    }
}
