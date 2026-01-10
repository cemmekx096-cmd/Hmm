package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MBridgeRevenueParamsEntityForAdmob extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForAdmob(String str, String str2) {
        super(str, str2);
        setMediationName("Admob");
    }

    public void setAdType(String str) {
        super.setAdType(str);
    }

    public void setAdmobResponseInfo(String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            setSourceData(str, str);
            JSONObject jSONObjectOptJSONObject = MintegralNetworkBridge.jsonObjectInit(str).optJSONObject("Loaded Adapter Response");
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("Credentials");
                if (jSONObjectOptJSONObject2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject2.get(next) + BuildConfig.FLAVOR);
                    }
                    setNetworkInfo(jSONObject);
                }
                setNetworkName(jSONObjectOptJSONObject.optString("Ad Source Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAdmobRevenueInfo(int i, long j, String str) {
        setRevenue(j + BuildConfig.FLAVOR);
        setPrecision(i + BuildConfig.FLAVOR);
        setCurrency(str);
    }

    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }
}
