package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import java.sql.Timestamp;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = "com.vungle")
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class VungleCreativeInfo extends CreativeInfo {
    private static final String a = "vungle_mraid";
    private static final long serialVersionUID = 0;
    private boolean Y;

    public VungleCreativeInfo() {
        this.Y = false;
    }

    public VungleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, String placement_id, String sdkVersion, long expiry, String struct) {
        super(adType, "com.vungle", id, creativeId, clickUrl, videoUrl, struct, sdkVersion);
        this.Y = false;
        a(adFormat);
        this.K = placement_id;
        this.R = new Timestamp(expiry);
    }

    public boolean a() {
        return TextUtils.isEmpty(P()) || TextUtils.isEmpty(O());
    }

    public void b(boolean z) {
    }

    public boolean u(String str) {
        return super.u(str);
    }

    public boolean aq() {
        return this.Y;
    }

    public void k(boolean z) {
        this.Y = z;
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("isLoopingVideo", this.Y);
        return jSONObjectI;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.Y = jSONObject.optBoolean("isLoopingVideo", false);
        }
    }
}
