package com.safedk.android.a;

import com.safedk.android.utils.Logger;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class b implements Runnable {
    private static final String a = "ConfigDownload";
    private static final int b = 2;
    private static final int[] c = {60000, 300000};
    private e d;
    private final String e;
    private final String f;

    public b(e eVar, String str, String str2) {
        this.d = new e();
        this.d = eVar;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[PHI: r7
      0x0078: PHI (r7v4 com.safedk.android.a.f) = (r7v2 com.safedk.android.a.f), (r7v6 com.safedk.android.a.f) binds: [B:21:0x0076, B:36:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = "ConfigDownload"
            com.safedk.android.SafeDK r1 = com.safedk.android.SafeDK.getInstance()
            java.lang.String r1 = r1.getUserId()
            r2 = 0
            r3 = 0
            r4 = 0
        Ld:
            r5 = 2
            if (r4 > r5) goto Lda
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            java.lang.String r7 = r9.e     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            r7.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            java.lang.String r8 = "Config url: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            r7.append(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            com.safedk.android.utils.Logger.d(r0, r7)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            com.safedk.android.a.f r7 = new com.safedk.android.a.f     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L7d
            r7.a(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L4f
            java.lang.String r3 = "Cookie"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r8 = "user_id="
            r6.append(r8)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r6.append(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r7.a(r3, r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
        L4f:
            java.lang.String r3 = r9.f     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r3 == 0) goto L5a
            java.lang.String r3 = "If-None-Match"
            java.lang.String r6 = r9.f     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r7.a(r3, r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
        L5a:
            r7.f()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            r9.a(r7)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            goto Lcf
        L62:
            r3 = move-exception
            goto L69
        L64:
            r3 = move-exception
            goto L80
        L66:
            r5 = move-exception
            r7 = r3
            r3 = r5
        L69:
            java.lang.String r5 = "Caught exception"
            com.safedk.android.utils.Logger.e(r0, r5, r3)     // Catch: java.lang.Throwable -> Ld3
            com.safedk.android.analytics.reporters.CrashReporter r5 = new com.safedk.android.analytics.reporters.CrashReporter     // Catch: java.lang.Throwable -> Ld3
            r5.<init>()     // Catch: java.lang.Throwable -> Ld3
            r5.caughtException(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L7b
        L78:
            r7.d()
        L7b:
            r3 = r7
            goto Lc9
        L7d:
            r6 = move-exception
            r7 = r3
            r3 = r6
        L80:
            java.lang.String r6 = "Failed to download configuration"
            com.safedk.android.utils.Logger.e(r0, r6, r3)     // Catch: java.lang.Throwable -> Ld3
            com.safedk.android.a.e r6 = r9.d     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r8 = r3.getMessage()     // Catch: java.lang.Throwable -> Ld3
            r6.b(r8)     // Catch: java.lang.Throwable -> Ld3
            if (r4 >= r5) goto Lcd
            boolean r3 = r9.a(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto Lcd
            int r3 = r9.a(r4)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            r5.<init>()     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            java.lang.String r6 = "Next retry in "
            r5.append(r6)     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            r5.append(r3)     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            java.lang.String r6 = " ms"
            r5.append(r6)     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            com.safedk.android.utils.Logger.d(r0, r5)     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            long r5 = (long) r3     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            java.lang.Thread.sleep(r5)     // Catch: java.lang.InterruptedException -> Lb8 java.lang.Throwable -> Ld3
            goto Lc5
        Lb8:
            r3 = move-exception
            java.lang.String r5 = "Thread interrupted while sleeping: "
            com.safedk.android.utils.Logger.e(r0, r5, r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Ld3
            r3.interrupt()     // Catch: java.lang.Throwable -> Ld3
        Lc5:
            if (r7 == 0) goto L7b
            goto L78
        Lc9:
            int r4 = r4 + 1
            goto Ld
        Lcd:
            if (r7 == 0) goto Lda
        Lcf:
            r7.d()
            goto Lda
        Ld3:
            r0 = move-exception
            if (r7 == 0) goto Ld9
            r7.d()
        Ld9:
            throw r0
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.a.b.run():void");
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, HttpRequest.CHARSET_UTF8);
            char[] cArr = new char[65536];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    break;
                }
                sb.append(cArr, 0, i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.e(a, "Failed to read configuration from input stream", e);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(com.safedk.android.a.f r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r7.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "response code = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ConfigDownload"
            com.safedk.android.utils.Logger.d(r2, r1)
            r1 = 0
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 >= r3) goto L73
            java.io.InputStream r1 = r7.e()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            java.lang.String r3 = r6.a(r1)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            java.lang.String r5 = "response = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            r4.append(r3)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            com.safedk.android.utils.Logger.d(r2, r4)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            com.safedk.android.a.e r4 = r6.d     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            java.lang.String r7 = r6.b(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            r4.a(r3, r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L59
            if (r1 == 0) goto L6b
            goto L68
        L48:
            r7 = move-exception
            java.lang.String r3 = "Caught exception"
            com.safedk.android.utils.Logger.e(r2, r3, r7)     // Catch: java.lang.Throwable -> L6c
            com.safedk.android.analytics.reporters.CrashReporter r2 = new com.safedk.android.analytics.reporters.CrashReporter     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
            r2.caughtException(r7)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6b
            goto L68
        L59:
            r7 = move-exception
            java.lang.String r3 = "Failed to get response from server"
            com.safedk.android.utils.Logger.e(r2, r3, r7)     // Catch: java.lang.Throwable -> L6c
            com.safedk.android.a.e r7 = r6.d     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "Failed to read data from connection"
            r7.a(r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6b
        L68:
            r1.close()
        L6b:
            goto L80
        L6c:
            r7 = move-exception
            if (r1 == 0) goto L72
            r1.close()
        L72:
            throw r7
        L73:
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L81
            com.safedk.android.a.e r2 = r6.d
            java.lang.String r7 = r6.b(r7)
            r2.a(r1, r7)
        L80:
            return r0
        L81:
            java.io.InputStream r7 = r7.g()
            java.lang.String r1 = r6.a(r7)
            com.safedk.android.a.e r2 = r6.d
            r2.a(r1)
            if (r7 == 0) goto L93
            r7.close()
        L93:
            java.net.HttpRetryException r7 = new java.net.HttpRetryException
            r7.<init>(r1, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.a.b.a(com.safedk.android.a.f):int");
    }

    private int a(int i) {
        return c[i];
    }

    private boolean a(Exception exc) {
        if (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) {
            return false;
        }
        return true;
    }

    private String b(f fVar) {
        return fVar.b(HttpRequest.HEADER_ETAG);
    }
}
