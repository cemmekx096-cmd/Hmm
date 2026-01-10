package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class M2 extends R1 {
    public M2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.R1
    public final Object a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        C2 c2 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        Intrinsics.checkNotNull(asLong);
        long jLongValue = asLong.longValue();
        c2.getClass();
        return C2.a(asString3, jSONObject, asString2, jLongValue);
    }

    @Override // com.inmobi.media.R1
    public final ContentValues b(Object obj) {
        Config config = (Config) obj;
        Intrinsics.checkNotNullParameter(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    public final boolean b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "accountId");
        boolean z = false;
        try {
            z = !v3.b(this.a, (String[]) null, "account_id=? AND config_type=?", new String[]{str2, str}, (String) null, (String) null, (String) null, (String) null).isEmpty();
        } catch (Exception unused) {
        }
        return !z;
    }

    public final long a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        String[] strArr = {str2, str};
        L2 l2 = L2.a;
        Intrinsics.checkNotNullParameter(l2, "transform");
        Object objInvoke = null;
        try {
            List listB = v3.b(this.a, (String[]) null, "account_id=? AND config_type=?", strArr, (String) null, (String) null, (String) null, (String) null);
            if (!listB.isEmpty()) {
                objInvoke = l2.invoke(listB.get(0));
            }
        } catch (Exception unused) {
        }
        Long l = (Long) objInvoke;
        long jLongValue = l != null ? l.longValue() : 0L;
        Intrinsics.checkNotNullExpressionValue("M2", "TAG");
        return jLongValue;
    }
}
