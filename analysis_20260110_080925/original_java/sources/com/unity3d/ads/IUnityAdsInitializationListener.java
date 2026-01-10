package com.unity3d.ads;

import com.unity3d.ads.UnityAds;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface IUnityAdsInitializationListener {
    void onInitializationComplete();

    void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str);
}
