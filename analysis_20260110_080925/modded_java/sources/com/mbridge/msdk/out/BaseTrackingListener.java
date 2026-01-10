package com.mbridge.msdk.out;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface BaseTrackingListener {
    void onFinishRedirection(Campaign campaign, String str);

    void onRedirectionFailed(Campaign campaign, String str);

    void onStartRedirection(Campaign campaign, String str);
}
