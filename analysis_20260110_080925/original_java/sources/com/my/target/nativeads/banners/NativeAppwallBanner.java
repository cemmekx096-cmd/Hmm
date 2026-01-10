package com.my.target.nativeads.banners;

import com.my.target.common.models.ImageData;
import com.my.target.r7;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NativeAppwallBanner {
    public final ImageData A;
    public final ImageData B;
    public final ImageData C;
    public boolean D;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final ImageData v;
    public final ImageData w;
    public final ImageData x;
    public final ImageData y;
    public final ImageData z;

    public NativeAppwallBanner(r7 r7Var) {
        this.a = r7Var.r();
        this.b = r7Var.k();
        this.c = r7Var.A();
        this.d = r7Var.M();
        this.e = r7Var.V();
        this.f = r7Var.X();
        this.g = r7Var.v();
        this.i = r7Var.W();
        this.j = r7Var.N();
        this.k = r7Var.P();
        this.l = r7Var.Q();
        this.m = r7Var.F();
        this.n = r7Var.w();
        this.D = r7Var.b0();
        this.o = r7Var.d0();
        this.p = r7Var.e0();
        this.q = r7Var.c0();
        this.r = r7Var.a0();
        this.s = r7Var.f0();
        this.t = r7Var.g0();
        this.u = r7Var.Z();
        this.v = r7Var.q();
        this.w = r7Var.O();
        this.x = r7Var.U();
        this.y = r7Var.S();
        this.z = r7Var.Y();
        this.A = r7Var.L();
        this.B = r7Var.T();
        this.C = r7Var.R();
        this.h = r7Var.e();
    }

    public static NativeAppwallBanner a(r7 r7Var) {
        return new NativeAppwallBanner(r7Var);
    }

    public ImageData getBubbleIcon() {
        return this.A;
    }

    public String getBubbleId() {
        return this.d;
    }

    public String getBundleId() {
        return this.h;
    }

    public int getCoins() {
        return this.j;
    }

    public ImageData getCoinsIcon() {
        return this.w;
    }

    public int getCoinsIconBgColor() {
        return this.k;
    }

    public int getCoinsIconTextColor() {
        return this.l;
    }

    public ImageData getCrossNotifIcon() {
        return this.C;
    }

    public String getDescription() {
        return this.b;
    }

    public ImageData getGotoAppIcon() {
        return this.y;
    }

    public ImageData getIcon() {
        return this.v;
    }

    public String getId() {
        return this.a;
    }

    public ImageData getItemHighlightIcon() {
        return this.B;
    }

    public ImageData getLabelIcon() {
        return this.x;
    }

    public String getLabelType() {
        return this.e;
    }

    public int getMrgsId() {
        return this.i;
    }

    public String getPaidType() {
        return this.g;
    }

    public float getRating() {
        return this.n;
    }

    public String getStatus() {
        return this.f;
    }

    public ImageData getStatusIcon() {
        return this.z;
    }

    public String getTitle() {
        return this.c;
    }

    public int getVotes() {
        return this.m;
    }

    public boolean isAppInstalled() {
        return this.u;
    }

    public boolean isBanner() {
        return this.r;
    }

    public boolean isHasNotification() {
        return this.D;
    }

    public boolean isItemHighlight() {
        return this.q;
    }

    public boolean isMain() {
        return this.o;
    }

    public boolean isRequireCategoryHighlight() {
        return this.p;
    }

    public boolean isRequireWifi() {
        return this.s;
    }

    public boolean isSubItem() {
        return this.t;
    }

    public void setHasNotification(boolean z) {
        this.D = z;
    }

    public String toString() {
        return "NativeAppwallBanner{id='" + this.a + "', description='" + this.b + "', title='" + this.c + "', bubbleId='" + this.d + "', labelType='" + this.e + "', status='" + this.f + "', paidType='" + this.g + "', bundleId='" + this.h + "', mrgsId=" + this.i + ", coins=" + this.j + ", coinsIconBgColor=" + this.k + ", coinsIconTextColor=" + this.l + ", votes=" + this.m + ", rating=" + this.n + ", isMain=" + this.o + ", isRequireCategoryHighlight=" + this.p + ", isItemHighlight=" + this.q + ", isBanner=" + this.r + ", isRequireWifi=" + this.s + ", isSubItem=" + this.t + ", appInstalled=" + this.u + ", icon=" + this.v + ", coinsIcon=" + this.w + ", labelIcon=" + this.x + ", gotoAppIcon=" + this.y + ", statusIcon=" + this.z + ", bubbleIcon=" + this.A + ", itemHighlightIcon=" + this.B + ", crossNotifIcon=" + this.C + ", hasNotification=" + this.D + '}';
    }
}
