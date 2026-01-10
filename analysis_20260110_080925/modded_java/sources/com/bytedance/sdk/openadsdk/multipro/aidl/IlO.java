package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.multipro.MY;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.Bc;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.Cc;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.tV;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.vCE;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.bytedance.sdk.openadsdk.utils.zLG;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class IlO {
    private static final IlO MY = new IlO();
    private MY EO;
    private IBinderPool IlO;
    private long tV = 0;
    private final ServiceConnection Cc = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IlO.2
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            mmj.IlO(new lEW("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IlO.2.1
                public void run() throws RemoteException {
                    IlO.this.IlO = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        IlO.this.IlO.asBinder().linkToDeath(IlO.this.vCE, 0);
                    } catch (RemoteException e) {
                        oeT.IlO("TTAD.BinderPool", "onServiceConnected throws :", e);
                    }
                    new StringBuilder("onServiceConnected - binderService consume time ：").append(System.currentTimeMillis() - IlO.this.tV);
                    if (IlO.this.EO != null) {
                        IlO.this.EO.onServiceConnected();
                    }
                }
            }, 5);
        }
    };
    private final IBinder.DeathRecipient vCE = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IlO.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            mmj.IlO(new lEW("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IlO.3.1
                public void run() {
                    try {
                        if (IlO.this.IlO.asBinder().isBinderAlive()) {
                            IlO.this.IlO.asBinder().unlinkToDeath(IlO.this.vCE, 0);
                        }
                    } catch (Exception e) {
                        oeT.EO("TTAD.BinderPool", e.getMessage());
                    }
                    IlO.this.IlO = null;
                    IlO.this.tV();
                }
            }, 5);
        }
    };

    private IlO() {
        tV();
    }

    public static IlO IlO() {
        return MY;
    }

    public void MY() {
        try {
            Context contextIlO = cl.IlO();
            contextIlO.startService(new Intent(contextIlO, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void EO() {
        try {
            Context contextIlO = cl.IlO();
            contextIlO.bindService(new Intent(contextIlO, (Class<?>) BinderPoolService.class), this.Cc, 1);
            this.tV = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void IlO(MY my) {
        this.EO = my;
        if (this.IlO != null) {
            mmj.IlO(new lEW("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IlO.1
                public void run() {
                    if (IlO.this.EO != null) {
                        IlO.this.EO.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder IlO(int i) {
        try {
            if (MY.EO()) {
                try {
                    IBinderPool iBinderPool = this.IlO;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    oeT.EO("TTAD.BinderPool", e.getMessage());
                    zLG.lEW("queryBinder error");
                    return null;
                }
            }
            if (i == 0) {
                return Bc.IlO();
            }
            if (i == 1) {
                return Cc.IlO();
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
            return com.bytedance.sdk.openadsdk.multipro.aidl.IlO.MY.IlO();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tV() {
        if (MY.EO()) {
            EO();
        }
    }
}
