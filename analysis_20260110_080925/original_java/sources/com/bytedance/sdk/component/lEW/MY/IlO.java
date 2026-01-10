package com.bytedance.sdk.component.lEW.MY;

import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO {
    public int EO;
    public int IlO;
    public int MY;
    public int tV;

    public IlO(int i, int i2, int i3, int i4) {
        this.IlO = i;
        this.MY = i2;
        this.EO = i3;
        this.tV = i4;
    }

    public JSONObject IlO() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.IlO);
            jSONObject.put("sdk_max_thread_num", this.MY);
            jSONObject.put("app_thread_num", this.EO);
            jSONObject.put("app_max_thread_num", this.tV);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
