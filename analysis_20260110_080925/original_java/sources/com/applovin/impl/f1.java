package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.crashlytics.android.BuildConfig;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class f1 {
    private final String a;
    private final String b;
    private final boolean c;

    f1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", BuildConfig.FLAVOR);
        this.b = JsonUtils.getString(jSONObject, "description", BuildConfig.FLAVOR);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.c = a7.a(list);
        } else {
            this.c = a7.a(JsonUtils.getString(jSONObject, "existence_class", BuildConfig.FLAVOR));
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || a7.a(str2, str) != 1) {
            return str3 == null || a7.a(str3, str) != -1;
        }
        return false;
    }
}
