package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class LoadOperationState$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ LoadOperationState f$0;
    public final /* synthetic */ UnityAds.UnityAdsLoadError f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LoadOperationState$$ExternalSyntheticLambda1(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.f$0 = loadOperationState;
        this.f$1 = unityAdsLoadError;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$onUnityAdsFailedToLoad$0$com-unity3d-services-ads-operation-load-LoadOperationState(this.f$1, this.f$2);
    }
}
