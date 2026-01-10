package com.bytedance.sdk.openadsdk.EV.IlO;

import com.bytedance.sdk.component.IlO.cl;
import com.bytedance.sdk.component.IlO.tV;
import com.bytedance.sdk.component.IlO.vCE;
import com.bytedance.sdk.openadsdk.core.DmF;
import com.bytedance.sdk.openadsdk.core.vSq;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MY extends tV<JSONObject, JSONObject> {
    private final WeakReference<vSq> IlO;

    public static void IlO(cl clVar, final vSq vsq) {
        clVar.IlO("interstitial_webview_close", new tV.MY() { // from class: com.bytedance.sdk.openadsdk.EV.IlO.MY.1
            @Override // com.bytedance.sdk.component.IlO.tV.MY
            public tV IlO() {
                return new MY(vsq);
            }
        });
    }

    public MY(vSq vsq) {
        this.IlO = new WeakReference<>(vsq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.IlO.tV
    public void IlO(JSONObject jSONObject, vCE vce) throws Exception {
        DmF.MY().es();
        vSq vsq = this.IlO.get();
        if (vsq == null) {
            EO();
        } else {
            vsq.lEW();
        }
    }
}
