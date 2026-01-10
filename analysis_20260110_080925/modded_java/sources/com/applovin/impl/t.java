package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.crashlytics.android.BuildConfig;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class t {
    private static final Map e = new HashMap();
    private static final Object f = new Object();
    private JSONObject a;
    private final String b;
    private AppLovinAdSize c;
    private AppLovinAdType d;

    private t(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.c = appLovinAdSize;
        this.d = appLovinAdType;
        String lowerCase = StringUtils.isValidString(str) ? str.trim().toLowerCase(Locale.ENGLISH) : (appLovinAdSize.getLabel() + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        lowerCase = z ? lowerCase + "_bidding" : lowerCase;
        this.b = z2 ? lowerCase + "_direct_sold" : lowerCase;
    }

    public static t a(String str) {
        return a(null, null, str);
    }

    public static t b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static t c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static t h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static t j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static t k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static t l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static t m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return this.b.equalsIgnoreCase(((t) obj).b);
    }

    public AppLovinAdSize f() {
        if (this.c == null && JsonUtils.valueExists(this.a, "ad_size")) {
            this.c = AppLovinAdSize.fromString(JsonUtils.getString(this.a, "ad_size", null));
        }
        return this.c;
    }

    public AppLovinAdType g() {
        if (this.d == null && JsonUtils.valueExists(this.a, "ad_type")) {
            this.d = AppLovinAdType.fromString(JsonUtils.getString(this.a, "ad_type", null));
        }
        return this.d;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.b + ", zoneObject=" + this.a + '}';
    }

    public static t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static t b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        t tVar = new t(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f) {
            String str2 = tVar.b;
            Map map = e;
            if (map.containsKey(str2)) {
                tVar = (t) map.get(str2);
            } else {
                map.put(str2, tVar);
            }
        }
        return tVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f) {
                t tVar = (t) e.get(JsonUtils.getString(jSONObject, "zone_id", BuildConfig.FLAVOR));
                if (tVar != null) {
                    tVar.c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", BuildConfig.FLAVOR));
                    tVar.d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", BuildConfig.FLAVOR));
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
