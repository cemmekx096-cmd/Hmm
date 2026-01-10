package com.bytedance.adsdk.IlO;

import android.text.TextUtils;
import com.bytedance.adsdk.IlO.MY.IlO;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class tV implements vCE {
    @Override // com.bytedance.adsdk.IlO.vCE
    /* renamed from: MY, reason: merged with bridge method [inline-methods] */
    public String IlO(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objIlO = IlO.IlO(strValueOf2).IlO(jSONObject2);
            if (TextUtils.isEmpty(String.valueOf(objIlO))) {
                if (objArr.length >= 3) {
                    return String.valueOf(objArr[2]);
                }
                return null;
            }
            return String.valueOf(objIlO);
        } catch (JSONException unused) {
            return null;
        }
    }
}
