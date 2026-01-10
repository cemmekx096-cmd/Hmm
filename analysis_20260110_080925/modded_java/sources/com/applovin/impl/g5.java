package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.a0;
import com.applovin.impl.sdk.o;
import com.crashlytics.android.BuildConfig;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class g5 extends w4 {
    private final b g;
    private final String h;
    private String i;

    public interface b {
        void a(a0.b bVar, String str);

        void a(String str, String str2);
    }

    public g5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.h = str;
        this.g = bVar;
    }

    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(((w4) this).a).c(HttpRequest.METHOD_GET).b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a(BuildConfig.FLAVOR).a(false).a();
        this.i = uriBuild.toString();
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Looking up app-ads.txt at " + this.i);
        }
        ((w4) this).a.q0().a(new a(aVarA, ((w4) this).a));
    }

    class a extends z5 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (o.a()) {
                    ((w4) this).c.b(((w4) this).b, "No app-ads.txt found");
                }
                g5.this.g.a(a0.b.c, g5.this.i);
            } else {
                if (o.a()) {
                    ((w4) this).c.a(((w4) this).b, "Found app-ads.txt");
                }
                g5.this.g.a(str2, g5.this.i);
            }
        }

        public void a(String str, int i, String str2, String str3) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            g5.this.g.a(a0.b.c, g5.this.i);
        }
    }
}
