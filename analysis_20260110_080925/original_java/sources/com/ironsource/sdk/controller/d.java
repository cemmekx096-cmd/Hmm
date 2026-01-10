package com.ironsource.sdk.controller;

import com.ironsource.db;
import com.ironsource.ir;
import com.ironsource.kh;
import com.ironsource.n9;
import com.ironsource.ph;
import com.ironsource.rh;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC0037d d = EnumC0037d.NONE;
    private String e;
    private String f;
    private db g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt("controllerSourceStrategy", Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.a()));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0037d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        EnumC0037d(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, db dbVar) {
        int iOptInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.b = iOptInt;
        this.c = a(iOptInt);
        this.e = str;
        this.f = str2;
        this.g = dbVar;
    }

    private c a(int i2) {
        return i2 != 1 ? i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private void a(rh rhVar) {
        if (this.g.c()) {
            return;
        }
        this.g.a(rhVar, this.f);
    }

    private void a(EnumC0037d enumC0037d) {
        kh khVarA = new kh().a("generalmessage", Integer.valueOf(this.b)).a("controllersource", Integer.valueOf(enumC0037d.a()));
        if (this.a > 0) {
            khVarA.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.a));
        }
        ph.a(ir.w, khVarA.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            n9.d().a(e);
            return false;
        }
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            rh rhVarG = g();
            if (rhVarG.exists()) {
                rh rhVarH = h();
                if (rhVarH.exists()) {
                    rhVarH.delete();
                }
                IronSourceStorageUtils.renameFile(rhVarG.getPath(), rhVarH.getPath());
            }
        } catch (Exception e) {
            n9.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private rh h() {
        return new rh(this.e, "fallback_mobileController.html");
    }

    private rh i() {
        return new rh(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        kh khVarA = new kh().a("generalmessage", Integer.valueOf(this.b));
        if (this.a > 0) {
            khVarA.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.a));
        }
        ph.a(ir.x, khVarA.a());
    }

    void a(kh khVar) {
        khVar.a("generalmessage", Integer.valueOf(this.b));
        ph.a(ir.v, khVar.a());
        this.a = System.currentTimeMillis();
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0037d enumC0037d = EnumC0037d.CONTROLLER_FROM_SERVER;
        this.d = enumC0037d;
        a(enumC0037d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            EnumC0037d enumC0037d = EnumC0037d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0037d;
            a(enumC0037d);
            runnable.run();
        }
    }

    JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    rh g() {
        return new rh(this.e, "mobileController.html");
    }

    boolean k() {
        rh rhVar;
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            rhVar = new rh(this.e, SDKUtils.getFileName(this.f));
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        rh rhVarG = g();
                        rh rhVarI = i();
                        if (!rhVarI.exists() && !rhVarG.exists()) {
                            a(new rh(this.e, SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        if (!rhVarI.exists() && rhVarG.exists()) {
                            EnumC0037d enumC0037d = EnumC0037d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = enumC0037d;
                            a(enumC0037d);
                            a(new rh(this.e, rhVarI.getName()));
                            return true;
                        }
                        c();
                        if (b()) {
                            EnumC0037d enumC0037d2 = EnumC0037d.PREPARED_CONTROLLER_LOADED;
                            this.d = enumC0037d2;
                            a(enumC0037d2);
                            d();
                            a(new rh(this.e, rhVarI.getName()));
                            return true;
                        }
                        if (!a()) {
                            a(new rh(this.e, SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        EnumC0037d enumC0037d3 = EnumC0037d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.d = enumC0037d3;
                        a(enumC0037d3);
                        a(new rh(this.e, rhVarI.getName()));
                        return true;
                    } catch (Exception e) {
                        n9.d().a(e);
                    }
                }
                return false;
            }
            c();
            rhVar = new rh(this.e, SDKUtils.getFileName(this.f));
        }
        a(rhVar);
        return false;
    }

    boolean m() {
        return this.d != EnumC0037d.NONE;
    }
}
