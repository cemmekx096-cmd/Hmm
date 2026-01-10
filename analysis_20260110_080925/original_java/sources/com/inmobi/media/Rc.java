package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Rc extends rb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc(String str, Kc kc, String str2, int i, int i2, int i3) {
        super(str, kc, str2, i, i2);
        Intrinsics.checkNotNullParameter("POST", "requestType");
        Intrinsics.checkNotNullParameter(str, "url");
        ((l9) this).p = i3;
    }

    public final void f() throws JSONException {
        InMobiUserDataTypes emailId;
        InMobiUserDataTypes phoneNumber;
        HashMap map;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        String string;
        HashMap map5;
        super/*com.inmobi.media.l9*/.f();
        InMobiUserDataModel inMobiUserDataModel = y4.a;
        String.valueOf(y4.a);
        HashMap mapA = ca.a();
        HashMap map6 = ((l9) this).k;
        if (map6 != null) {
            map6.put("mk-version", Lb.a());
            String str = c1.a;
            if (str != null) {
            }
            map6.put("ua", Kb.k());
            map6.put("ts", String.valueOf(System.currentTimeMillis()));
        }
        String str2 = ((l9) this).m;
        if (str2 != null && (map5 = ((l9) this).k) != null) {
        }
        Boolean boolC = Jc.a.c();
        HashMap map7 = ((l9) this).k;
        if (map7 != null) {
            if (boolC == null || (string = boolC.toString()) == null) {
                string = "true";
            }
        }
        String str3 = (String) mapA.get("u-age");
        if (str3 != null && (map4 = ((l9) this).k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel2 = y4.a;
        if (inMobiUserDataModel2 == null || (emailId = inMobiUserDataModel2.getEmailId()) == null || (emailId.getMd5() == null && emailId.getSha1() == null && emailId.getSha256() == null)) {
            emailId = null;
        }
        if (emailId != null && (map3 = ((l9) this).k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel3 = y4.a;
        if (inMobiUserDataModel3 == null || (phoneNumber = inMobiUserDataModel3.getPhoneNumber()) == null || (phoneNumber.getMd5() == null && phoneNumber.getSha1() == null && phoneNumber.getSha256() == null)) {
            phoneNumber = null;
        }
        if (phoneNumber != null && (map2 = ((l9) this).k) != null) {
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = u5.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String string2 = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        String string3 = jSONArray2.getJSONObject(i).has("signature") ? jSONArray2.getJSONObject(i).getString("signature") : null;
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (string2 != null && string3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string2);
                            jSONObject.put("signature", string3);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObjectB);
            }
        }
        HashMap map8 = ((l9) this).k;
        if (map8 != null) {
            String string4 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        }
        InMobiUserDataModel inMobiUserDataModel4 = y4.a;
        HashMap<String, String> extras = inMobiUserDataModel4 != null ? inMobiUserDataModel4.getExtras() : null;
        if (extras == null || (map = ((l9) this).k) == null) {
            return;
        }
        map.putAll(extras);
    }
}
