package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.util.o;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class y {
    public final String a;
    public final HashMap b;
    public String c;

    public y(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        int i = k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String str8 = TextUtils.isEmpty(property) ? "https://" + IAConfigManager.O.i.f : Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches() ? "https://" + property + "/simpleM2M/Event" : "https://" + property + ".inner-active.mobi/simpleM2M/Event";
        this.c = null;
        if (TextUtils.isEmpty(str8)) {
            throw new InvalidParameterException();
        }
        this.b = new HashMap();
        this.a = str8;
        a(str7 == null ? "8.3.7" : str7, "sdkv");
        a(o.a.getPackageName(), "pkgn");
        if (IAConfigManager.d()) {
            return;
        }
        a("Android", "osn");
        a(Build.VERSION.RELEASE, "osv");
        a(com.fyber.inneractive.sdk.util.k.k(), "model");
        a(com.fyber.inneractive.sdk.util.k.m(), "pkgv");
        a(str, "appid");
        a(str2, SettingsJsonConstants.SESSION_KEY);
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, "campaign_id");
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
