package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.e;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import com.safedk.android.analytics.brandsafety.p;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReportRequest.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class v<T> extends t<T> {
    private e A;
    private Map<String, String> w;
    private t.a x;
    private v.b<T> y;
    private w z;

    public v(String str, int i) {
        super(i, str);
    }

    public v.b<T> C() {
        return this.y;
    }

    public void a(w wVar) {
        this.z = wVar;
    }

    public boolean a() {
        return false;
    }

    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", HttpRequest.CONTENT_TYPE_FORM);
        map.put("Charset", HttpRequest.CHARSET_UTF8);
        return map;
    }

    protected Map<String, String> i() {
        return this.w;
    }

    public t.a l() {
        return this.x;
    }

    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new e(p.c, 0);
        }
        return this.A;
    }

    public v(String str, int i, int i2) {
        super(i, str, i2);
    }

    public void a(t.a aVar) {
        this.x = aVar;
    }

    public void a(Map<String, String> map) {
        this.w = map;
    }

    public void a(v.b<T> bVar) {
        this.y = bVar;
    }

    protected com.mbridge.msdk.tracker.network.v<T> a(q qVar) {
        return this.z.a(qVar);
    }

    protected void a(T t) {
        v.b<T> bVarC = C();
        this.y = bVarC;
        if (bVarC != null) {
            bVarC.a(t);
        }
    }
}
