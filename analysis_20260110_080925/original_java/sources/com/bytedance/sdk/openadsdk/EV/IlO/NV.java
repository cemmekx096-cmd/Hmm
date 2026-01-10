package com.bytedance.sdk.openadsdk.EV.IlO;

import com.bytedance.sdk.component.DmF.vCE;
import com.bytedance.sdk.component.IlO.Cc;
import com.bytedance.sdk.component.IlO.cl;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NV extends Cc<JSONObject, JSONObject> {
    private WeakReference<vCE> IlO;

    public static void IlO(cl clVar, vCE vce) {
        clVar.IlO("preventTouchEvent", new NV(vce));
    }

    public NV(vCE vce) {
        this.IlO = new WeakReference<>(vce);
    }

    public JSONObject IlO(JSONObject jSONObject, com.bytedance.sdk.component.IlO.vCE vce) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            vCE vce2 = this.IlO.get();
            if (vce2 != null) {
                vce2.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
