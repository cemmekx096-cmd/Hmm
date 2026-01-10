package androidx.multidex;

import android.content.Context;
import bin.mt.signature.KillerApplication;
import com.safedk.android.internal.DexBridge;
import com.safedk.android.utils.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MultiDexApplication extends KillerApplication {
    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate() {
        Logger.d("SafeDK|SafeDK: App> Landroidx/multidex/MultiDexApplication;->onCreate()V");
        DexBridge.appClassOnCreateBefore(this);
        super/*android.app.Application*/.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void attachBaseContext(Context context) {
        super/*android.app.Application*/.attachBaseContext(context);
        MultiDex.install(this);
    }
}
