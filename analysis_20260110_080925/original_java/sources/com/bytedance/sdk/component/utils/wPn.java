package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.lEW.vCE;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class wPn {
    private static final Object IlO = new Object();
    private static final Map<IlO, Object> MY = new ConcurrentHashMap();
    private static AtomicBoolean EO = new AtomicBoolean(false);
    private static volatile int tV = -1;
    private static volatile long Cc = 0;
    private static volatile int vCE = 60000;
    private static AXM Bc = null;
    private static final AtomicBoolean lEW = new AtomicBoolean(false);

    public interface IlO {
        void IlO(Context context, Intent intent, boolean z, int i);
    }

    public static int IlO(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Cc + j <= jElapsedRealtime) {
            return MY(context);
        }
        if (tV == -1) {
            return MY(context);
        }
        if (jElapsedRealtime - Cc >= vCE) {
            MY(context, (Intent) null, false, false);
        }
        return tV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void MY(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            tV = 0;
        } else if (lEW.compareAndSet(false, true)) {
            vCE.MY(new lEW("getNetworkType") { // from class: com.bytedance.sdk.component.utils.wPn.1
                public void run() {
                    int unused = wPn.tV = z2 ? 0 : wPn.MY(context);
                    wPn.lEW.set(false);
                    if (z) {
                        wPn.MY(context, intent, wPn.tV, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void MY(Context context, Intent intent, int i, boolean z) {
        Map<IlO, Object> map = MY;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (IlO ilO : map.keySet()) {
            if (ilO != null) {
                ilO.IlO(context, intent, !z, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int MY(Context context) {
        tV = EO(context);
        Cc = SystemClock.elapsedRealtime();
        return tV;
    }

    private static int EO(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        AXM axm = Bc;
                        return (axm == null || !axm.IlO(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static void IlO(IlO ilO, Context context) {
        if (ilO == null) {
            return;
        }
        if (!EO.get()) {
            try {
                context.registerReceiver(new MY(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                EO.set(true);
            } catch (Throwable unused) {
            }
        }
        MY.put(ilO, IlO);
    }

    public static void IlO(IlO ilO) {
        if (ilO == null) {
            return;
        }
        MY.remove(ilO);
    }

    private static class MY extends BroadcastReceiver {
        private MY() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (wPn.MY != null && wPn.MY.size() > 0) {
                z = true;
            }
            wPn.MY(context, intent, z, booleanExtra);
        }
    }
}
