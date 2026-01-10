package io.github.mytargetsdk;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class CertData {
    public final SSLContext sslContext;
    public final TrustManagerFactory trustManagerFactory;
    public final X509TrustManager x509TrustManager;

    public CertData(X509TrustManager x509TrustManager, SSLContext sSLContext, TrustManagerFactory trustManagerFactory) {
        this.x509TrustManager = x509TrustManager;
        this.sslContext = sSLContext;
        this.trustManagerFactory = trustManagerFactory;
    }
}
