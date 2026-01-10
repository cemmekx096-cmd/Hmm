package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class f extends z1 {
    public f(com.applovin.impl.sdk.k kVar) {
        super(kVar, y1.b.a);
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar) {
        a(y1Var, bVar, new HashMap());
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(y1Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(y1 y1Var, t tVar, AppLovinError appLovinError) {
        a(y1Var, tVar, null, appLovinError, new HashMap());
    }

    private void a(y1 y1Var, t tVar, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) ((z1) this).a.a(l4.H)).booleanValue() && ((z1) this).a.G0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(a2.a(bVar));
        } else if (tVar != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", tVar.e(), map);
            MaxAdFormat maxAdFormatD = tVar.d();
            if (maxAdFormatD != null) {
                CollectionUtils.putStringIfValid(com.safedk.android.analytics.brandsafety.b.f, maxAdFormatD.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeA = a(tVar, bVar);
        if (appLovinAdSizeA != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeA.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(y1Var, map);
    }

    private AppLovinAdSize a(t tVar, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize appLovinAdSizeF = tVar != null ? tVar.f() : null;
        if (appLovinAdSizeF != null) {
            return appLovinAdSizeF;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
