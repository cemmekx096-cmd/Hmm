package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.fyber.inneractive.sdk.util.o;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class m implements e {
    public static final m f = new m();
    public Context a;
    public f b;
    public boolean c = false;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final l e = new l(this);

    public static File a(Context context, String str) {
        String externalStorageState;
        File externalCacheDir;
        String externalStorageState2 = BuildConfig.FLAVOR;
        if (context != null && !TextUtils.isEmpty(str)) {
            if (o.a != null && o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    externalStorageState = BuildConfig.FLAVOR;
                }
                if ("mounted".equals(externalStorageState)) {
                    try {
                        externalStorageState2 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                        return new File(context.getExternalCacheDir(), str);
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 52428800) {
                return new File(context.getCacheDir(), str);
            }
        }
        return null;
    }
}
