package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.cache.a;
import com.fyber.inneractive.sdk.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class D {
    public final Context a;
    public final a b;
    public SharedPreferences c;

    public D(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final l a() throws Throwable {
        try {
            if (!this.b.d()) {
                new C();
                return new l();
            }
            Object objA = this.b.a(a(this.b.c()));
            if (this.c == null) {
                this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new l(objA, this.c.getString(this.b.b(), null));
        } catch (Exception unused) {
            if (this.c == null) {
                this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            this.c.edit().remove(this.b.b()).apply();
            return new l();
        }
    }

    public final String a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.a("reading local file: %s", new Object[]{str});
        FileInputStream fileInputStream = null;
        str = null;
        str = null;
        String str2 = null;
        try {
            fileInputStreamOpenFileInput = this.a.openFileInput(str);
            try {
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, HttpRequest.CHARSET_UTF8);
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing local file: %s", new Object[]{e.getMessage()});
                    }
                    str2 = str3;
                } catch (Exception e2) {
                    e = e2;
                    if (!(e instanceof FileNotFoundException)) {
                        IAlog.a("Failed reading local file: %s", new Object[]{e.getMessage()});
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (Exception e3) {
                                IAlog.f("Failed closing local file: %s", new Object[]{e3.getMessage()});
                            }
                        }
                        IAlog.a("local file %s read successfully", new Object[]{str});
                        return str2;
                    }
                    throw new FileNotFoundException();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStreamOpenFileInput;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e4) {
                        IAlog.f("Failed closing local file: %s", new Object[]{e4.getMessage()});
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            th = th2;
        }
        IAlog.a("local file %s read successfully", new Object[]{str});
        return str2;
    }
}
