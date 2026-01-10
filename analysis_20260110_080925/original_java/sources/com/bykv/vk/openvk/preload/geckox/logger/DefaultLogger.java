package com.bykv.vk.openvk.preload.geckox.logger;

import android.util.Log;
import com.bykv.vk.openvk.preload.geckox.c.b;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class DefaultLogger implements Logger {
    DefaultLogger() {
    }

    public void d(String str, Object... objArr) {
        if (objArr == null) {
            Log.d(str, "null");
        } else {
            try {
                Log.d(str, b.a().b().a(objArr));
            } catch (Throwable unused) {
            }
        }
    }

    public void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void w(String str, String str2) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        Log.w(str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
