package com.bytedance.sdk.openadsdk.core.model;

import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY {
    private boolean Cc;
    private String EO;
    private String IlO;
    private String MY;
    private String tV;

    public void IlO(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.IlO = jSONObject.optString(SettingsJsonConstants.APP_ICON_KEY);
        this.MY = jSONObject.optString("text");
        this.EO = jSONObject.optString("privacy_url");
        this.tV = jSONObject.optString("privacy_title");
    }

    public String IlO() {
        return this.IlO;
    }

    public String MY() {
        return this.MY;
    }

    public String EO() {
        return this.EO;
    }

    public String tV() {
        return this.tV;
    }

    public boolean Cc() {
        return this.Cc;
    }

    public void IlO(boolean z) {
        this.Cc = z;
    }

    public JSONObject vCE() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.EO);
            jSONObject.put("privacy_title", this.tV);
            jSONObject.put("text", this.MY);
            jSONObject.put(SettingsJsonConstants.APP_ICON_KEY, this.IlO);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
