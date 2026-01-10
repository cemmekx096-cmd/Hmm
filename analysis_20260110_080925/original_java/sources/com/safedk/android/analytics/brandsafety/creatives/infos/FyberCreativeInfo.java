package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = "com.inneractive")
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";
    private static final String aa = "alternative_click_url";

    /* renamed from: ac, reason: collision with root package name */
    private static final List<String> f665ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = 0;
    private String ad;
    private String ag;

    public FyberCreativeInfo() {
    }

    public FyberCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, "com.inneractive", id, creativeId, clickUrl, videoUrl, BuildConfig.FLAVOR, sdkVersion);
        this.K = spotId;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        a(adFormat);
        this.ad = campaignId;
        this.ar = adNetwork;
        this.aZ = adDomain;
        this.ag = alternativeClickUrl;
        h(eventId);
    }

    public String aq() {
        return this.ad;
    }

    public String ar() {
        return this.ag;
    }

    public boolean a() {
        return false;
    }

    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.ad)) {
            bundleB.putString("campaign_id", this.ad);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            bundleB.putString(aa, this.ag);
        }
        return bundleB;
    }

    public void b(List<String> list) {
        Logger.d(Y, "classifyPrefetchUrl started, urlList=" + list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strC = C(it.next());
                boolean z = false;
                if (!TextUtils.isEmpty(strC)) {
                    if (b(strC)) {
                        x(strC);
                        z = true;
                    } else if (u(strC) && !strC.equals(O())) {
                        w(strC);
                        z = true;
                    }
                    if (!z) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : " + strC);
                    }
                }
            }
        }
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObjectI.put("campaignId", this.ad);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            jSONObjectI.put("alternativeClickUrl", this.ag);
        }
        return jSONObjectI;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ad = jSONObject.optString("campaignId", BuildConfig.FLAVOR);
            this.ag = jSONObject.optString("alternativeClickUrl", BuildConfig.FLAVOR);
        }
    }
}
