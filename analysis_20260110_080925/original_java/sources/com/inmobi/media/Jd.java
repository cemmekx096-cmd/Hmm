package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class Jd {
    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_SOURCE);
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(Constants.ScionAnalytics.PARAM_SOURCE, str), TuplesKt.to("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false))});
        ic icVar = ic.a;
        ic.b("WebViewRenderProcessGoneEvent", mapMutableMapOf, mc.a);
        webView.destroy();
        return true;
    }
}
