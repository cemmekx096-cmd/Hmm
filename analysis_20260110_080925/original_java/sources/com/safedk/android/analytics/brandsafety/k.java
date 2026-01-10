package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class k {
    public static final String b = "text:";
    private static final String y = "ImpressionInfo";
    private String A;
    private List<String> B;
    String a;
    j c;
    String d;
    RedirectData e;
    int f;
    public HashSet<String> g;
    final l h;
    public String i;
    public BrandSafetyUtils.AdType j;
    boolean k;
    public boolean l;
    public Boolean m;
    public SimpleConcurrentHashSet<String> n;
    public SimpleConcurrentHashSet<String> o;
    public SimpleConcurrentHashSet<String> p;
    public SimpleConcurrentHashSet<String> q;
    public SimpleConcurrentHashSet<String> r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public Boolean x;
    private CreativeInfo z;

    public String a() {
        return this.A;
    }

    public boolean b() {
        CreativeInfo creativeInfo = this.z;
        return creativeInfo != null && creativeInfo.w();
    }

    public boolean c() {
        CreativeInfo creativeInfo = this.z;
        return creativeInfo != null && creativeInfo.x();
    }

    public void a(String str) {
        this.A = str;
        if (str != null && !this.B.contains(str)) {
            this.B.add(str);
        }
    }

    public List<String> d() {
        return this.B;
    }

    public k(String str) {
        this(str, null, null, null);
    }

    public k(String str, j jVar, String str2, BrandSafetyUtils.AdType adType) {
        this.d = null;
        this.f = 0;
        this.g = new HashSet<>();
        this.h = new l();
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new SimpleConcurrentHashSet<>();
        this.o = new SimpleConcurrentHashSet<>();
        this.p = new SimpleConcurrentHashSet<>();
        this.q = new SimpleConcurrentHashSet<>();
        this.r = new SimpleConcurrentHashSet<>();
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = null;
        this.B = new ArrayList();
        this.a = str == null ? UUID.randomUUID().toString() : str;
        this.c = jVar;
        this.z = null;
        this.i = str2;
        this.j = adType;
    }

    public k(RedirectData redirectData) {
        this(null, null, null, null);
        this.e = redirectData;
    }

    public boolean e() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.i;
    }

    public boolean f() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.j;
    }

    public boolean g() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.k;
    }

    public void a(RedirectData redirectData) {
        this.e = redirectData;
        this.f++;
        if ((redirectData.j || redirectData.k) && this.z != null) {
            l();
        }
    }

    public void h() {
        CreativeInfo creativeInfo = this.z;
        if (creativeInfo == null) {
            return;
        }
        boolean zA = CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.P, false);
        if (this.z.al() && this.c != null && !zA) {
            Logger.d(y, "removing image taken for multi-ad " + this.c.b);
            BrandSafetyUtils.d(this.c.b);
            this.c = null;
        }
    }

    public void a(CreativeInfo creativeInfo) {
        if (this.z == null && creativeInfo != null) {
            a("cim", new l.a[0]);
        }
        this.z = creativeInfo;
        if (creativeInfo != null) {
            creativeInfo.q().addAll(this.g);
            this.g = new HashSet<>();
            h();
            if (creativeInfo.ao() && this.c != null) {
                Logger.d(y, "set creative info, removing image taken for website endcard: " + this.c.b);
                BrandSafetyUtils.d(this.c.b);
                this.c = null;
            }
        }
    }

    public CreativeInfo i() {
        return this.z;
    }

    public String j() {
        return this.a;
    }

    public void k() {
        this.c = null;
    }

    public void a(String str, l.a... aVarArr) {
        this.h.a(str, aVarArr);
    }

    public void b(String str, l.a... aVarArr) {
        this.h.b(str, aVarArr);
    }

    public void l() {
        Logger.d(y, "_NW_ _RESOURCES_ start collecting expand resources...");
        this.v = true;
    }

    public void b(String str) {
        String strD;
        if (str.startsWith(b)) {
            strD = str;
        } else {
            strD = d(str);
        }
        if (!TextUtils.isEmpty(strD)) {
            CreativeInfo creativeInfo = this.z;
            if (creativeInfo != null && creativeInfo.c(strD)) {
                Logger.d(y, "_NW_ _RESOURCES_ add resource url: avoid adding a recommendation resource: " + strD);
                this.z.d();
                return;
            }
            CreativeInfo creativeInfo2 = this.z;
            if (creativeInfo2 != null && creativeInfo2.d(strD)) {
                Logger.d(y, "_NW_ _RESOURCES_ add resource url: Url is in the WebView urls exclusion list, will not be added : " + strD);
                return;
            }
            if (this.v) {
                if (!str.startsWith(b)) {
                    synchronized (this.q) {
                        this.q.a(strD);
                    }
                    Logger.d(y, "_NW_ _RESOURCES_ Resource was added successfully to impression expanded list, resource: " + strD);
                    return;
                }
                return;
            }
            synchronized (this.o) {
                this.o.a(strD);
            }
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.g.add(str);
        }
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? str : com.safedk.android.utils.k.f(com.safedk.android.utils.n.z(str));
    }

    public String toString() {
        return "Impression: id=" + this.a + ", image is: " + this.c + ", CI is: " + this.z;
    }
}
