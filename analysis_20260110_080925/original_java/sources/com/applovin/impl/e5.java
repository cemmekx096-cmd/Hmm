package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class e5 extends w4 {
    private final com.applovin.impl.sdk.network.e g;
    private final AppLovinPostbackListener h;
    private final r5.b i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        public void onPostbackFailure(String str, int i) {
            e5.this.e();
        }

        public void onPostbackSuccess(String str) {
            if (e5.this.h != null) {
                e5.this.h.onPostbackSuccess(e5.this.g.f());
            }
        }
    }

    public e5(com.applovin.impl.sdk.network.e eVar, r5.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.h = appLovinPostbackListener;
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.i);
        b().q0().a(bVar);
    }

    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().x0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (o.a()) {
            ((w4) this).c.d(((w4) this).b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), -900);
        }
    }

    class b extends z5 {
        final String m;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.m = e5.this.g.f();
        }

        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : ((w4) this).a.c(l4.m0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                n0.c(jSONObject, ((w4) this).a);
                                n0.b(jSONObject, ((w4) this).a);
                                n0.a(jSONObject, ((w4) this).a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (e5.this.h != null) {
                e5.this.h.onPostbackSuccess(this.m);
            }
            if (e5.this.g.t()) {
                ((w4) this).a.u().a(e5.this.g.s(), this.m, i, obj, (String) null, true);
            }
        }

        public void a(String str, int i, String str2, Object obj) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.m);
            }
            if (e5.this.h != null) {
                e5.this.h.onPostbackFailure(this.m, i);
            }
            if (e5.this.g.t()) {
                ((w4) this).a.u().a(e5.this.g.s(), this.m, i, obj, str2, false);
            }
        }
    }
}
