package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.interstitial.controller.a;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MBInterstitialHandler {
    private a mController;
    private String unitId;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new a();
        }
        if (map != null && map.containsKey("unit_id")) {
            String str = (String) map.get("unit_id");
            this.unitId = str;
            if (!TextUtils.isEmpty(str)) {
                String strE = t0.e(str);
                if (!TextUtils.isEmpty(strE)) {
                    t0.b(str, strE);
                }
            }
        }
        this.mController.a(context, map);
        if (c.m().d() != null || context == null) {
            return;
        }
        c.m().b(context);
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.mController;
        return aVar != null ? aVar.a() : BuildConfig.FLAVOR;
    }

    public String getRequestId() {
        a aVar = this.mController;
        return aVar != null ? aVar.b() : BuildConfig.FLAVOR;
    }

    public void preload() {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.f();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.a(interstitialListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        try {
            this.mController.j();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
