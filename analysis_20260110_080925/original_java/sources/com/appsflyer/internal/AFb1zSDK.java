package com.appsflyer.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFb1zSDK {

    public interface AFa1vSDK {
        void AFAdRevenueData(String str);

        void getRevenue(String str, String str2, String str3);
    }

    /* renamed from: com.appsflyer.internal.AFb1zSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements InvocationHandler {
        private /* synthetic */ Class getMonetizationNetwork;
        private /* synthetic */ AFa1vSDK getRevenue;

        AnonymousClass1(Class cls, AFa1vSDK aFa1vSDK) {
            this.getMonetizationNetwork = cls;
            this.getRevenue = aFa1vSDK;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String string;
            String string2;
            String string3;
            Bundle bundle;
            if (method.getName().equals("onDeferredAppLinkDataFetched")) {
                Object obj2 = objArr[0];
                if (obj2 != null) {
                    Bundle bundle2 = (Bundle) Bundle.class.cast(this.getMonetizationNetwork.getMethod("getArgumentBundle", new Class[0]).invoke(this.getMonetizationNetwork.cast(obj2), new Object[0]));
                    if (bundle2 != null) {
                        string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                        string3 = bundle2.getString("target_url");
                        Bundle bundle3 = bundle2.getBundle("extras");
                        string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                    } else {
                        string = null;
                        string2 = null;
                        string3 = null;
                    }
                    AFa1vSDK aFa1vSDK = this.getRevenue;
                    if (aFa1vSDK != null) {
                        aFa1vSDK.getRevenue(string2, string3, string);
                    }
                } else {
                    AFa1vSDK aFa1vSDK2 = this.getRevenue;
                    if (aFa1vSDK2 != null) {
                        aFa1vSDK2.getRevenue(null, null, null);
                    }
                }
                return null;
            }
            AFa1vSDK aFa1vSDK3 = this.getRevenue;
            if (aFa1vSDK3 != null) {
                aFa1vSDK3.AFAdRevenueData("onDeferredAppLinkDataFetched invocation failed");
            }
            return null;
        }
    }
}
