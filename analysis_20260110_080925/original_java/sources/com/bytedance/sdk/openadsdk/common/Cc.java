package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class Cc {
    private static boolean IlO;

    public static void IlO(boolean z) {
        IlO = z;
    }

    public static ISDKTypeFactory IlO(PAGLoadListener pAGLoadListener) {
        if (IlO) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, "SDK disable");
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(5000, "SDK load ad factory should not be null");
        }
        return null;
    }

    public static boolean IlO() {
        return IlO;
    }
}
