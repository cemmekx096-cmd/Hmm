package com.bytedance.sdk.openadsdk;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface CustomEventInterstitialListener {
    void onInterstitialClicked();

    void onInterstitialDismissed();

    void onInterstitialImpression();

    void onInterstitialShowFail();

    void onInterstitialShown();

    void onLeaveApplication();
}
