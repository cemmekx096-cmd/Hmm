package com.mbridge.msdk.mbnative.service.net;

import android.content.Context;
import android.os.Build;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.foundation.same.net.wrapper.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.t;

/* compiled from: NativeRequest.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class a extends com.mbridge.msdk.foundation.same.net.wrapper.b {
    public a(Context context) {
        super(context);
    }

    public void addExtraParams(String str, e eVar) {
        super/*com.mbridge.msdk.foundation.same.net.wrapper.a*/.addExtraParams(str, eVar);
        eVar.a("platform", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", k0.t(((c) this).mContext));
        eVar.a("app_version_name", k0.B(((c) this).mContext));
        eVar.a("app_version_code", k0.A(((c) this).mContext) + BuildConfig.FLAVOR);
        eVar.a("orientation", k0.F(((c) this).mContext) + BuildConfig.FLAVOR);
        eVar.a("model", k0.n());
        eVar.a("brand", k0.s());
        eVar.a("gaid", BuildConfig.FLAVOR);
        eVar.a("gaid2", f.c());
        int iS = k0.s(((c) this).mContext);
        eVar.a("network_type", iS + BuildConfig.FLAVOR);
        eVar.a("network_str", k0.a(((c) this).mContext, iS) + BuildConfig.FLAVOR);
        eVar.a("language", k0.p(((c) this).mContext));
        eVar.a("timezone", k0.w());
        eVar.a("useragent", k0.i());
        eVar.a("sdk_version", "MAL_16.9.71");
        eVar.a("screen_size", k0.n(((c) this).mContext) + "x" + k0.m(((c) this).mContext));
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("gp_version", t.d(((c) this).mContext));
        }
        com.mbridge.msdk.foundation.same.net.wrapper.f.a(eVar, ((c) this).mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.b(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.j(eVar);
    }
}
