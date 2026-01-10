package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import io.fabric.sdk.android.services.events.EventsFilesManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class d {
    private static final String j = "AdInfoKey";
    String a;
    String b;
    String c;
    String d;
    String e;
    BrandSafetyUtils.AdType f;
    String g = null;
    String h = null;
    boolean i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.c || adType == BrandSafetyUtils.AdType.b) ? false : true;
    }

    public boolean equals(Object o) {
        Logger.d(j, "equals started with this: " + this + " and that: " + o);
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        d dVar = (d) o;
        boolean zEquals = this.a.equals(dVar.a);
        String str = this.b;
        boolean z = str != null && str.equals(dVar.b);
        boolean zEquals2 = this.d.equals(dVar.d);
        String str2 = this.e;
        boolean zEquals3 = zEquals && zEquals2 && ((str2 != null && str2.equals(dVar.e)) || (this.e == null && dVar.e == null));
        String str3 = this.c;
        if (str3 != null) {
            zEquals3 &= str3.equals(dVar.c);
            String strA = CreativeInfoManager.a(this.d, AdNetworkConfiguration.aj, BuildConfig.FLAVOR);
            if (strA != null && strA.contains(this.e) && !a(this.f)) {
                Logger.d(j, "not using placement id - equals result is: " + zEquals3);
                return zEquals3;
            }
        }
        return zEquals3 && z;
    }

    public int hashCode() {
        String str;
        int iHashCode = this.a.hashCode() * this.d.hashCode();
        String strA = CreativeInfoManager.a(this.d, AdNetworkConfiguration.aj, BuildConfig.FLAVOR);
        if (a(this.f) || (str = this.e) == null || strA == null || !strA.contains(str)) {
            iHashCode *= this.b.hashCode();
        }
        String str2 = this.c;
        if (str2 != null) {
            return iHashCode * str2.hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.a + ", placementId=" + this.b + ", eventId=" + com.safedk.android.utils.n.b(this.c) + ", sdk=" + this.d + ", maxNetwork=" + com.safedk.android.utils.n.b(this.e) + "}";
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        String str3 = this.b;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        String str4 = this.c;
        if (str4 == null) {
            str4 = BuildConfig.FLAVOR;
        }
        sb.append(str4);
        sb.append(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        String str5 = this.d;
        if (str5 != null) {
            str2 = str5;
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (dVar.equals(this)) {
            if (TextUtils.isEmpty(this.b)) {
                creativeInfo.j(dVar.b);
                this.b = dVar.b;
                return true;
            }
            return true;
        }
        return false;
    }
}
