package com.bytedance.sdk.openadsdk.tV.Cc.MY;

import com.bytedance.sdk.component.utils.oeT;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class hp implements EO {
    public long EO;
    public long IlO;
    public int MY;

    public void IlO(long j) {
        this.IlO = j;
    }

    public void IlO(int i) {
        this.MY = i;
    }

    public void MY(long j) {
        this.EO = j;
    }

    public void IlO(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.IlO);
            jSONObject.put("buffers_count", this.MY);
            jSONObject.put("total_duration", this.EO);
        } catch (Throwable th) {
            oeT.EO("PlayBufferModel", th.getMessage());
        }
    }
}
