package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class l extends k2 {
    private final m e;
    private final n f;
    private final v7 g;
    private final String h;
    private final List i;
    private final List j;
    private final List k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends o3 {
        private final v7 p;

        b(v7 v7Var, String str, boolean z) {
            super(v7Var.b().d(), ((k2) l.this).a);
            this.p = v7Var;
            ((j2) this).c = StringUtils.createSpannedString(v7Var.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            ((j2) this).d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            ((j2) this).b = z;
        }

        public int g() {
            return -12303292;
        }

        public boolean o() {
            return ((j2) this).b;
        }

        public v7 v() {
            return this.p;
        }
    }

    l(m mVar, n nVar, v7 v7Var, Context context) {
        super(context);
        this.e = mVar;
        this.g = v7Var;
        this.f = nVar != null ? nVar : mVar.f();
        this.h = nVar != null ? nVar.c() : mVar.d();
        this.i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private j2 f() {
        return j2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private j2 g() {
        return j2.a().d("ID").c(this.e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private j2 i() {
        return j2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        v7 v7Var = this.g;
        if (v7Var != null && v7Var.d()) {
            return new ArrayList();
        }
        List<v7> listE = this.f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (v7 v7Var2 : listE) {
            v7 v7Var3 = this.g;
            if (v7Var3 == null || v7Var3.b().c().equals(v7Var2.b().c())) {
                arrayList.add(new b(v7Var2, null, this.g == null));
                for (p3 p3Var : v7Var2.c()) {
                    arrayList.add(j2.a().d(p3Var.a()).c(p3Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    protected int b() {
        return a.COUNT.ordinal();
    }

    protected List c(int i) {
        return i == a.INFO.ordinal() ? this.i : i == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    protected int d(int i) {
        return i == a.INFO.ordinal() ? this.i.size() : i == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    protected j2 e(int i) {
        return i == a.INFO.ordinal() ? new j4("INFO") : i == a.BIDDERS.ordinal() ? new j4("BIDDERS") : new j4("WATERFALL");
    }

    public n j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    private j2 d() {
        return j2.a().d("Ad Format").c(this.e.b()).a();
    }

    private List e() {
        v7 v7Var = this.g;
        if (v7Var != null && !v7Var.d()) {
            return new ArrayList();
        }
        List<v7> listA = this.f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (v7 v7Var2 : listA) {
            v7 v7Var3 = this.g;
            if (v7Var3 == null || v7Var3.b().c().equals(v7Var2.b().c())) {
                arrayList.add(new b(v7Var2, v7Var2.a() != null ? v7Var2.a().a() : BuildConfig.FLAVOR, this.g == null));
            }
        }
        return arrayList;
    }
}
