package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b7;
import com.applovin.impl.j7;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.crashlytics.android.BuildConfig;
import java.util.Collections;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
class b5 extends z4 {
    private final b7 l;

    public b5(b7 b7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", b7Var, kVar, appLovinAdLoadListener);
        this.l = b7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) ((w4) this).a.a(l4.I4)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.emptyList(), false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    ((z4) this).g.a(uriA);
                } else if (o.a()) {
                    ((w4) this).c.b(((w4) this).b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void l() {
        if (k()) {
            return;
        }
        if (!this.l.C1()) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        e7 e7VarO1 = this.l.o1();
        if (e7VarO1 == null) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        j7 j7VarE = e7VarO1.e();
        if (j7VarE == null) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriC = j7VarE.c();
        String string = uriC != null ? uriC.toString() : BuildConfig.FLAVOR;
        String strB = j7VarE.b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
            if (o.a()) {
                ((w4) this).c.k(((w4) this).b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (j7VarE.d() == j7.a.b) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Caching static companion ad at " + string + "...");
            }
            Uri uriA = a(string, Collections.emptyList(), false);
            if (uriA != null) {
                j7VarE.a(uriA);
                this.l.b(true);
                return;
            } else {
                if (o.a()) {
                    ((w4) this).c.b(((w4) this).b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (j7VarE.d() != j7.a.d) {
            if (j7VarE.d() == j7.a.c && o.a()) {
                ((w4) this).c.a(((w4) this).b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
            }
            if (((Boolean) ((w4) this).a.a(l4.H4)).booleanValue()) {
                strB = d(strB);
            }
            j7VarE.a(a(strB, Collections.emptyList(), this.l));
            this.l.b(true);
            return;
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strC = c(string, (List) null, false);
        if (!StringUtils.isValidString(strC)) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to load companion ad resources from " + string);
            }
        } else {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "HTML fetched. Caching HTML now...");
            }
            j7VarE.a(a(strC, Collections.emptyList(), this.l));
            this.l.b(true);
        }
    }

    private void m() {
        if (k() || !n7.a(this.l)) {
            return;
        }
        String strQ1 = this.l.q1();
        if (!StringUtils.isValidString(strQ1)) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strA = a(strQ1, this.l.c0(), ((z4) this).g);
        if (this.l.isOpenMeasurementEnabled()) {
            strA = ((w4) this).a.d0().a(strA, a2.a(((z4) this).g));
        }
        this.l.d(strA);
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Finish caching HTML template " + this.l.q1() + " for ad #" + this.l.getAdIdNumber());
        }
    }

    private void n() {
        p7 p7VarY1;
        Uri uriE;
        if (k()) {
            return;
        }
        if (!this.l.D1()) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Video caching disabled. Skipping...");
            }
        } else {
            if (this.l.x1() == null || (p7VarY1 = this.l.y1()) == null || (uriE = p7VarY1.e()) == null) {
                return;
            }
            Uri uriB = b(uriE.toString(), Collections.emptyList(), false);
            if (uriB != null) {
                if (o.a()) {
                    ((w4) this).c.a(((w4) this).b, "Video file successfully cached into: " + uriB);
                }
                p7VarY1.a(uriB);
            } else if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Failed to cache video file: " + p7VarY1);
            }
        }
    }

    void a(int i) {
        this.l.getAdEventTracker().f();
        super.a(i);
    }

    void e() {
        this.l.getAdEventTracker().h();
        super.e();
    }

    public void run() {
        super.run();
        boolean zQ0 = this.l.Q0();
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Begin caching for VAST " + (zQ0 ? "streaming " : BuildConfig.FLAVOR) + "ad #" + ((z4) this).g.getAdIdNumber() + "...");
        }
        if (zQ0) {
            i();
            if (this.l.A1()) {
                e();
            }
            b7.c cVarR1 = this.l.r1();
            b7.c cVar = b7.c.COMPANION_AD;
            if (cVarR1 == cVar) {
                l();
                m();
                a(this.l);
            } else {
                n();
            }
            if (!this.l.A1()) {
                e();
            }
            if (this.l.r1() == cVar) {
                n();
            } else {
                l();
                m();
                a(this.l);
            }
        } else {
            i();
            l();
            n();
            m();
            a(this.l);
            e();
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Finished caching VAST ad #" + this.l.getAdIdNumber());
        }
        this.l.B1();
        j();
    }
}
