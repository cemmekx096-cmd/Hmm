package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.core.model.oeT;
import java.lang.ref.SoftReference;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY {
    public static SoftReference<oeT> IlO;

    public static oeT IlO() {
        SoftReference<oeT> softReference = IlO;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void IlO(oeT oet) {
        if (oet == null) {
            return;
        }
        IlO = new SoftReference<>(oet);
    }
}
