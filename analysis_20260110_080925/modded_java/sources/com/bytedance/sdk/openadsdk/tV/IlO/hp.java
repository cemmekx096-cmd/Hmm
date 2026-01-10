package com.bytedance.sdk.openadsdk.tV.IlO;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ea.IlO.EO;
import com.bytedance.sdk.openadsdk.ea.MY;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class hp implements MY {
    private final com.bytedance.sdk.component.vCE.IlO.vCE.tV IlO;
    private final boolean MY;

    public hp(boolean z, com.bytedance.sdk.component.vCE.IlO.vCE.tV tVVar) {
        this.IlO = tVVar;
        this.MY = z;
    }

    public EO getLogStats() throws Exception {
        int i;
        if (this.IlO == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.MY);
        jSONObject.put("url", this.IlO.MY());
        int iTV = this.IlO.tV();
        if (iTV <= 0) {
            iTV = 0;
        }
        jSONObject.put("retry_times", iTV);
        jSONObject.put("ad_id", this.IlO.vCE());
        jSONObject.put("track_type", this.IlO.Cc());
        if (!this.MY) {
            i = 4;
        } else if (this.IlO.NV()) {
            i = 3;
        } else {
            i = this.IlO.tV() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strBc = this.IlO.Bc();
        if (!TextUtils.isEmpty(strBc)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strBc.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strDmF = this.IlO.DmF();
        if (!TextUtils.isEmpty(strDmF)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strDmF.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.ea.IlO.tV.MY().IlO("track_link_result").MY(jSONObject.toString());
    }
}
