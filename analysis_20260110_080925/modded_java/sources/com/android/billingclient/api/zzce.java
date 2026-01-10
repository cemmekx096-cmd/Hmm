package com.android.billingclient.api;

import com.android.billingclient.api.BillingFlowParams;
import java.util.function.Consumer;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class zzce implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (((BillingFlowParams.ProductDetailsParams) obj) == null) {
            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
        }
    }
}
