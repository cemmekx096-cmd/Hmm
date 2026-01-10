package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class S2 {
    public final Config a;
    public final int b;
    public N2 c;

    public S2(JSONObject jSONObject, Config config) throws JSONException {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
        int i = -1;
        this.b = -1;
        if (jSONObject != null) {
            try {
                int i2 = jSONObject.getInt(SettingsJsonConstants.APP_STATUS_KEY);
                if (i2 == 200) {
                    i = 200;
                } else if (i2 == 304) {
                    i = 304;
                } else if (i2 == 404) {
                    i = 404;
                } else if (i2 == 500) {
                    i = 500;
                }
                this.b = i;
                if (i != 200) {
                    if (i == 304) {
                        Intrinsics.checkNotNullExpressionValue("W2", "access$getTAG$cp(...)");
                        config.getType();
                        return;
                    } else {
                        N2 n2 = new N2((byte) 1, "Internal error");
                        Intrinsics.checkNotNullExpressionValue("W2", "access$getTAG$cp(...)");
                        config.getType();
                        this.c = n2;
                        return;
                    }
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                C2 c2 = Config.Companion;
                String type = config.getType();
                Intrinsics.checkNotNull(jSONObject2);
                String accountId$media_release = config.getAccountId$media_release();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c2.getClass();
                Config configA = C2.a(type, jSONObject2, accountId$media_release, jCurrentTimeMillis);
                if (configA == null) {
                    this.c = new N2((byte) 3, "The received config has failed backend contract.");
                } else {
                    this.a = configA;
                }
                Intrinsics.checkNotNullExpressionValue("W2", "access$getTAG$cp(...)");
                this.a.getType();
                this.a.isValid();
                if (this.a.isValid()) {
                    return;
                }
                N2 n22 = new N2((byte) 2, "The received config has failed validation.");
                Intrinsics.checkNotNullExpressionValue("W2", "access$getTAG$cp(...)");
                this.a.getType();
                this.c = n22;
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                N2 n23 = new N2((byte) 2, localizedMessage == null ? "Exception in config validation" : localizedMessage);
                this.a.getType();
                this.c = n23;
            }
        }
    }
}
