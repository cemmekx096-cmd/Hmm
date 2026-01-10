package com.unity3d.mediation.adapters.levelplay;

import com.crashlytics.android.BuildConfig;
import com.ironsource.mediationsdk.adunit.adapter.BaseNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.x7;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/unity3d/mediation/adapters/levelplay/LevelPlayBaseNativeAd;", "Lcom/unity3d/mediation/adapters/levelplay/LevelPlayBaseAdapter;", "NetworkAdapter", "Lcom/ironsource/mediationsdk/adunit/adapter/BaseNativeAd;", "Lcom/ironsource/x7;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", BuildConfig.FLAVOR, "collectBiddingData", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", "<init>", "(Lcom/ironsource/mediationsdk/model/NetworkSettings;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class LevelPlayBaseNativeAd<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseNativeAd<NetworkAdapter> implements x7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseNativeAd(NetworkSettings networkSettings) {
        super(networkSettings);
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}
