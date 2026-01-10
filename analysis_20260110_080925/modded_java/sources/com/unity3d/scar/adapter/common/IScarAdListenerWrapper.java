package com.unity3d.scar.adapter.common;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface IScarAdListenerWrapper {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i, String str);

    void onAdLoaded();

    void onAdOpened();
}
