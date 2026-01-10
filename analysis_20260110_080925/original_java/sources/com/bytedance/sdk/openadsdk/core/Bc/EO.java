package com.bytedance.sdk.openadsdk.core.Bc;

import com.bytedance.sdk.component.Bc.IlO.IlO;
import com.bytedance.sdk.component.Bc.MY;
import com.bytedance.sdk.component.Bc.MY.tV;
import com.bytedance.sdk.openadsdk.cL.Bc;
import com.bytedance.sdk.openadsdk.utils.oeT;
import com.bytedance.sdk.openadsdk.utils.zLG;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class EO {
    public static void IlO(String str, long j) throws JSONException {
        JSONObject jSONObjectMY = MY(str, j);
        tV tVVarMY = Bc.IlO().MY().MY();
        tVVarMY.MY(zLG.tV("/api/ad/union/sdk/stats/"));
        tVVarMY.tV(jSONObjectMY.toString());
        tVVarMY.IlO(6);
        tVVarMY.IlO("uploadFrequentEvent");
        tVVarMY.IlO(new IlO() { // from class: com.bytedance.sdk.openadsdk.core.Bc.EO.1
            public void IlO(com.bytedance.sdk.component.Bc.MY.EO eo, MY my) {
            }

            public void IlO(com.bytedance.sdk.component.Bc.MY.EO eo, IOException iOException) {
                iOException.getMessage();
                if (eo != null) {
                    oeT.IlO(eo.tV());
                }
            }
        });
    }

    private static JSONObject MY(String str, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", "7.2.0.6");
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
