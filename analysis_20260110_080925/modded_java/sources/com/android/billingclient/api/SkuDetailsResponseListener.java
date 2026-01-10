package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@Deprecated
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface SkuDetailsResponseListener {
    void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list);
}
