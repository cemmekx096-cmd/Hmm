package com.inmobi.media;

import com.crashlytics.android.BuildConfig;
import com.inmobi.commons.core.configs.Config;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Q2 extends l9 {
    public final int A;
    public final String B;
    public final boolean C;
    public final Map y;
    public final int z;

    public final void f() throws JSONException {
        String string;
        ((l9) this).u = false;
        super.f();
        HashMap map = ((l9) this).k;
        if (map != null) {
            M2 m2 = new M2();
            try {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry entry : this.y.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", entry.getKey());
                    jSONObject.put("t", m2.a((String) entry.getKey(), ((Config) entry.getValue()).getAccountId$media_release()));
                    jSONArray.put(jSONObject);
                }
                string = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            } catch (JSONException unused) {
                string = BuildConfig.FLAVOR;
            }
        }
        HashMap map2 = ((l9) this).k;
        if (map2 != null) {
        }
        if (this.C) {
            ((l9) this).i.put("rip", "true");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(Map map, Kc kc, String str, int i, int i2, boolean z, String str2, boolean z2) {
        super("POST", (map.get("root") == null && StringsKt.trim(str).toString().length() != 0) ? str : "https://config.inmobi.com/config-server/v1/config/secure.cfg", kc, z, (f5) null, HttpRequest.CONTENT_TYPE_FORM, 64);
        Intrinsics.checkNotNullParameter(map, "requestedConfigMap");
        Intrinsics.checkNotNullParameter(kc, "uidMap");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "accountId");
        this.y = map;
        this.z = i;
        this.A = i2;
        this.B = str2;
        this.C = z2;
    }
}
