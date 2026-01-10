package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class e1 {
    private final com.applovin.impl.sdk.k a;

    public e1(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public void a(Uri uri) {
        o.g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.a.w0().b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.a.w0().c(queryParameter2);
            }
        }
    }
}
