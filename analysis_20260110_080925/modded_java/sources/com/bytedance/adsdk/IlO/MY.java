package com.bytedance.adsdk.IlO;

import com.bytedance.adsdk.ugeno.EO.IlO;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY implements com.bytedance.adsdk.ugeno.EO.IlO {
    @Override // com.bytedance.adsdk.ugeno.EO.IlO
    public IlO.InterfaceC0010IlO IlO(String str) {
        return IlO.IlO(str);
    }

    static class IlO implements IlO.InterfaceC0010IlO {
        private com.bytedance.adsdk.IlO.MY.IlO IlO;
        private String MY;

        private IlO(String str) {
            this.MY = str;
            this.IlO = com.bytedance.adsdk.IlO.MY.IlO.IlO(str);
        }

        public static IlO IlO(String str) {
            return new IlO(str);
        }

        @Override // com.bytedance.adsdk.ugeno.EO.IlO.InterfaceC0010IlO
        public Object IlO(JSONObject jSONObject) {
            com.bytedance.adsdk.IlO.MY.IlO ilO = this.IlO;
            if (ilO == null) {
                return this.MY;
            }
            Object objIlO = ilO.IlO(jSONObject);
            if (objIlO instanceof String) {
                return objIlO;
            }
            if (objIlO instanceof com.bytedance.adsdk.IlO.MY.IlO.IlO) {
                return String.valueOf(DmF.IlO((com.bytedance.adsdk.IlO.MY.IlO.IlO) objIlO));
            }
            return String.valueOf(objIlO);
        }
    }
}
