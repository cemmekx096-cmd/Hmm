package androidx.multidex;

import android.app.Application;
import android.content.Context;
import com.safedk.android.internal.DexBridge;
import com.safedk.android.utils.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MultiDexApplication extends Application {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Application
    public void onCreate() {
        Logger.d("SafeDK|SafeDK: App> Landroidx/multidex/MultiDexApplication;->onCreate()V");
        DexBridge.appClassOnCreateBefore(this);
        super.onCreate();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
