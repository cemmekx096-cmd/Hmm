package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
