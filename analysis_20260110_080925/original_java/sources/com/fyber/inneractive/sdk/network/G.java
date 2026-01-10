package com.fyber.inneractive.sdk.network;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class G {
    public static final G c = new G();
    public final k a = new k();
    public p0 b;

    public final h a() throws ClassNotFoundException {
        String property;
        if (this.b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals("okhttp")) {
                try {
                    Class.forName("okhttp3.OkHttpClient");
                    this.b = new p0();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p0 p0Var = this.b;
        return p0Var != null ? p0Var : this.a;
    }
}
