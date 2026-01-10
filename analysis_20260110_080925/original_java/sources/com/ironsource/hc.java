package com.ironsource;

import android.util.Log;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class hc {
    private static final String e = "EventsTracker";
    private gf a;
    private bc b;
    private zf c;
    private ExecutorService d;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                jq jqVar = new jq();
                ArrayList arrayListD = hc.this.b.d();
                if ("POST".equals(hc.this.b.e())) {
                    jqVar = vg.b(hc.this.b.b(), this.a, arrayListD);
                } else if (HttpRequest.METHOD_GET.equals(hc.this.b.e())) {
                    jqVar = vg.a(hc.this.b.b(), this.a, arrayListD);
                }
                hc.this.a("response status code: " + jqVar.a);
            } catch (Exception e) {
                n9.d().a(e);
            }
        }
    }

    public hc(bc bcVar, gf gfVar) {
        if (bcVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (bcVar.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = bcVar;
        this.a = gfVar;
        this.c = bcVar.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            n9.d().a(e2);
        }
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            a(map2, this.a.a());
            a(map2, map);
            b(this.c.a(map2));
        }
    }
}
