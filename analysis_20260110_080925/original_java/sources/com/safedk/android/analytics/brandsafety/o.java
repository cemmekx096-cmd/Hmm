package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class o {
    CreativeInfo a;
    String b;
    String c;

    public o(CreativeInfo creativeInfo, String str) {
        this(creativeInfo, str, null);
    }

    public o(CreativeInfo creativeInfo, String str, String str2) {
        this.a = creativeInfo;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        return " how ? : " + this.b + ", debugInfo : " + this.c + ", creative info : " + this.a.aa();
    }
}
