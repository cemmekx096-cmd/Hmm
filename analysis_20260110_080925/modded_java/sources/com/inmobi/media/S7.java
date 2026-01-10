package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.S7$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class S7 extends D7 {
    public final String x;
    public final Lazy y;

    public /* synthetic */ S7(String str, String str2, E7 e7, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, e7, str3, new ArrayList(), str4, jSONObject);
    }

    public static final v4 a(S7 s7, String str) {
        s7.getClass();
        return Build.VERSION.SDK_INT < 28 ? new w4(str) : new V0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(String str, String str2, E7 e7, String str3, List list, String str4, JSONObject jSONObject) {
        super(str, str2, "GIF", e7, list);
        Intrinsics.checkNotNullParameter(str, "assetId");
        Intrinsics.checkNotNullParameter(str2, "assetName");
        Intrinsics.checkNotNullParameter(e7, "assetStyle");
        Intrinsics.checkNotNullParameter(str3, "url");
        Intrinsics.checkNotNullParameter(list, "trackers");
        Intrinsics.checkNotNullParameter(str4, "interactionMode");
        this.x = "S7";
        this.y = LazyKt.lazy(new R7(this, str3));
        Kb.a((Runnable) new S7$.ExternalSyntheticLambda0(str3, this, jSONObject, str4));
    }

    public static final void a(String str, S7 s7, JSONObject jSONObject, String str2) {
        Intrinsics.checkNotNullParameter(str, "$url");
        Intrinsics.checkNotNullParameter(s7, "this$0");
        Intrinsics.checkNotNullParameter(str2, "$interactionMode");
        j jVarB = Db.a().b(str);
        ((D7) s7).e = jVarB != null ? jVarB.c : null;
        if (jSONObject != null) {
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            ((D7) s7).g = str2;
        }
    }
}
