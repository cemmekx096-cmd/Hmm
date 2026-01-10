package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.DmF;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.Bc;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.Cc;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.EO;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.MY;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.tV;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.vCE;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class BinderPoolService extends Service {
    private static boolean EO;
    public static volatile boolean IlO;
    private final Binder MY = new IlO();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        cl.MY(getApplicationContext());
        IlO = true;
        if (!EO) {
            DmF.MY().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    hp.aP().IlO(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        EO = true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.MY;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public static class IlO extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) throws RemoteException {
            if (i == 0) {
                return Bc.IlO();
            }
            if (i == 1) {
                return Cc.IlO();
            }
            if (i == 4) {
                return EO.IlO();
            }
            if (i == 5) {
                return vCE.MY();
            }
            if (i == 6) {
                return tV.IlO();
            }
            if (i != 7) {
                return null;
            }
            return MY.IlO();
        }
    }
}
