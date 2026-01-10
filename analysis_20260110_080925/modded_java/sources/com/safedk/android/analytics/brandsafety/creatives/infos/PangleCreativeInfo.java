package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class PangleCreativeInfo extends CreativeInfo {
    public static final String E = "non-app";
    public static final String Y = "/playable";
    public static final String Z = "/dynamic_";
    public static final String a = "app";
    public static final String aa = "/dpa_count_";
    public static final String ab = "/dpa";

    /* renamed from: ac, reason: collision with root package name */
    public static final String f666ac = "/dpa_related_products_count_";
    private static final long serialVersionUID = 0;
    private String ad;
    private int ae;
    private boolean af;

    public PangleCreativeInfo() {
    }

    public PangleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, String endCardUrl, boolean isPlayable, String placementId, String sdkVersion, String packageName, String downstreamStruct) {
        super(adType, "com.bytedance.sdk", id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.K = placementId;
        this.W = isPlayable;
        this.at = endCardUrl;
        this.M = packageName;
        this.ad = null;
        this.ae = 0;
        this.af = false;
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObjectI.put("commonMultiAdUuid", this.ad);
        }
        jSONObjectI.put("dynamicCreativesCount", this.ae);
        jSONObjectI.put("isDpa", this.af);
        return jSONObjectI;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ad = jSONObject.optString("commonMultiAdUuid", BuildConfig.FLAVOR);
            this.ae = jSONObject.optInt("dynamicCreativesCount", 0);
            this.af = jSONObject.optBoolean("isDpa", false);
        }
    }

    public void a(String str) {
        this.ad = str;
    }

    public String aq() {
        return this.ad;
    }

    public int ar() {
        return this.ae;
    }

    public void b(int i) {
        this.ae = i;
    }

    public void as() {
        this.af = true;
    }

    public boolean at() {
        return this.af;
    }
}
