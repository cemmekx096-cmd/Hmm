package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.IlO;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class oeT implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene IlO;

    public oeT(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.IlO = cryptDataScene;
    }

    public JSONObject encrypt(JSONObject jSONObject, int i) {
        vAh.IlO(1, this.IlO, i);
        return IlO.IlO(jSONObject);
    }
}
