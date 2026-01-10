package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.rp;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.bytedance.sdk.openadsdk.core.settings.rp;
import com.bytedance.sdk.openadsdk.core.settings.tV;
import com.bytedance.sdk.openadsdk.core.settings.vCE;
import com.bytedance.sdk.openadsdk.utils.Bc;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class DeviceUtils {
    private static int DmF = 0;
    public static String IlO = "";
    private static int bWL;
    private static int ea;
    private static int hp;
    private static int lEW;
    private static int zPa;
    private static volatile long MY = System.currentTimeMillis();
    private static volatile boolean EO = false;
    private static volatile boolean tV = false;
    private static volatile boolean Cc = false;
    private static volatile boolean vCE = true;
    private static long Bc = 0;
    private static String NV = BuildConfig.FLAVOR;
    private static int EV = 0;
    private static final AtomicBoolean rp = new AtomicBoolean(false);
    private static AtomicBoolean cl = new AtomicBoolean(false);

    public static void IlO(Context context) {
        if (EO) {
            return;
        }
        try {
            MY my = new MY();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(my, intentFilter);
            EO = true;
        } catch (Throwable unused) {
        }
    }

    public static long IlO() {
        return MY;
    }

    public static boolean MY() {
        if (SystemClock.elapsedRealtime() - Bc >= SegmentDownloader.DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS) {
            Bc = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) cl.IlO().getSystemService("power");
                if (powerManager != null) {
                    if (Build.VERSION.SDK_INT >= 20) {
                        vCE = powerManager.isInteractive();
                    } else {
                        vCE = powerManager.isScreenOn();
                    }
                }
            } catch (Throwable th) {
                oeT.EO("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return vCE;
    }

    public static boolean MY(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean EO(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int tV(Context context) {
        if (EO(context)) {
            return 3;
        }
        return MY(context) ? 2 : 1;
    }

    private static void IlO(JSONObject jSONObject) throws JSONException {
        MY(jSONObject);
    }

    private static void MY(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(jSONObject);
    }

    public static String Cc(Context context) {
        if (!rp.get()) {
            zPa(context);
        }
        return NV;
    }

    public static int vCE(Context context) {
        if (!rp.get()) {
            zPa(context);
        }
        return EV;
    }

    private static void zPa(Context context) {
        if (context != null) {
            boolean z = true;
            if (rp.compareAndSet(false, true)) {
                try {
                    if (com.bytedance.sdk.openadsdk.AXM.IlO.IlO("gp_v_enable", 0) != 1) {
                        z = false;
                    }
                    if (z) {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_PLAY_STORE_PACKAGE, 0);
                        NV = packageInfo.versionName;
                        EV = packageInfo.versionCode;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static JSONObject IlO(Context context, boolean z) throws JSONException {
        String strMY;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", lEW(context));
            IlO(jSONObject);
            jSONObject.put("type", tV(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", zLG.rp(context));
            jSONObject.put("app_set_id", tV.EO());
            jSONObject.put("app_set_id_scope", tV.MY());
            jSONObject.put("installed_source", tV.tV());
            jSONObject.put("screen_width", BS.EO(context));
            jSONObject.put("screen_height", BS.Cc(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.DmF.EO.vCE());
            vCE vceTV = cl.tV();
            if (vceTV.OOq("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", rp.EO(context));
            jSONObject.put("rom_version", OOq.IlO());
            jSONObject.put("sys_compiling_time", rp.MY(context));
            jSONObject.put("timezone", zLG.AXM());
            jSONObject.put("language", rp.MY());
            jSONObject.put("carrier_name", oc.IlO());
            if (z) {
                strMY = zLG.IlO(context);
            } else {
                strMY = zLG.MY(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strMY) * 1024));
            jSONObject.put("locale_language", tV());
            jSONObject.put("screen_bright", Math.ceil(Cc() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", MY() ? 0 : 1);
            jSONObject.put("cpu_num", NV.IlO(context));
            jSONObject.put("cpu_max_freq", NV.MY(context));
            jSONObject.put("cpu_min_freq", NV.EO(context));
            Bc.IlO IlO2 = Bc.IlO();
            jSONObject.put("battery_remaining_pct", (int) IlO2.MY);
            jSONObject.put("is_charging", IlO2.IlO);
            jSONObject.put("total_space", String.valueOf(zLG.EO(context)));
            jSONObject.put("free_space_in", String.valueOf(zLG.tV(context)));
            jSONObject.put("sdcard_size", String.valueOf(zLG.Cc(context)));
            jSONObject.put("rooted", zLG.vCE(context));
            jSONObject.put("enable_assisted_clicking", vCE());
            jSONObject.put("force_language", pP.IlO(context, "tt_choose_language"));
            jSONObject.put("airplane", DmF(context));
            jSONObject.put("darkmode", cl(context));
            jSONObject.put("headset", cL(context));
            jSONObject.put("ringmute", NV(context));
            jSONObject.put("screenscale", es(context));
            jSONObject.put("volume", lEW());
            jSONObject.put("low_power_mode", xF(context));
            if (z) {
                lEW.IlO(jSONObject, context);
                jSONObject.put("gp_v_name", Cc(context));
                jSONObject.put("gp_v_code", vCE(context));
            }
            if (vceTV.OOq("mnc")) {
                jSONObject.put("mnc", oc.EO());
            }
            if (vceTV.OOq("mcc")) {
                jSONObject.put("mcc", oc.MY());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.IlO.MY(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.IlO.IlO());
            String strEO = com.bytedance.sdk.openadsdk.core.DmF.EO.EO();
            Object[] objArr = new Object[2];
            Long.valueOf(com.bytedance.sdk.openadsdk.core.DmF.EO.tV());
            if (!TextUtils.isEmpty(strEO)) {
                jSONObject.put("sof_chara", strEO);
            }
            String strMY2 = com.bytedance.sdk.openadsdk.multipro.tV.tV.MY("ttopenadsdk", "key_ipv6", BuildConfig.FLAVOR);
            if (!strMY2.isEmpty()) {
                jSONObject.put("ipv6", strMY2);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.MY.EO());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject Bc(Context context) {
        return IlO(context, false);
    }

    public static int EO() {
        return com.bytedance.sdk.openadsdk.core.EO.IlO(cl.IlO()).MY("limit_ad_track", -1);
    }

    public static String tV() {
        if (Build.VERSION.SDK_INT >= 21) {
            String languageTag = Locale.getDefault().toLanguageTag();
            return !TextUtils.isEmpty(languageTag) ? languageTag : BuildConfig.FLAVOR;
        }
        return Locale.getDefault().getLanguage();
    }

    public static float Cc() {
        int i = -1;
        try {
            Context contextIlO = cl.IlO();
            if (contextIlO != null) {
                i = Settings.System.getInt(contextIlO.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            oeT.EO("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int vCE() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) cl.IlO().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int lEW(Context context) {
        int i = -1;
        if (context == null) {
            return -1;
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                i = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
            } else {
                i = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
            }
        } catch (Throwable th) {
            oeT.EO("TTAD.DeviceUtils", th.getMessage());
        }
        return i;
    }

    public static int DmF(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int cl(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    private static int cL(Context context) {
        return ea;
    }

    public static int NV(Context context) {
        return lEW;
    }

    private static float es(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int Bc() {
        return hp;
    }

    public static int lEW() {
        return bWL;
    }

    public static int DmF() {
        return DmF;
    }

    private static int xF(Context context) {
        return zPa;
    }

    public static String EV(Context context) {
        if (TextUtils.isEmpty(IlO)) {
            IlO = com.bytedance.sdk.openadsdk.core.EO.IlO(context).MY("framework_name", BuildConfig.FLAVOR);
        }
        return IlO;
    }

    public static void NV() throws IOException, ClassNotFoundException {
        hp.IlO(new rp.IlO() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.rp.IlO
            public void IlO() {
                com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.rp.IlO
            public void MY() {
                com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(true);
            }
        });
        Context contextIlO = cl.IlO();
        if (contextIlO != null) {
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("cpu_count", NV.IlO());
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("cpu_max_frequency", NV.IlO(NV.IlO()));
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("cpu_min_frequency", NV.MY(NV.IlO()));
            String strDmF = zLG.DmF();
            if (strDmF != null) {
                com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("total_memory", strDmF);
            }
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("total_internal_storage", zLG.NV());
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("free_internal_storage", com.bytedance.sdk.component.utils.cl.IlO());
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("total_sdcard_storage", zLG.EV());
            com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("is_root", zLG.rp() ? 1 : 0);
            if (TextUtils.isEmpty(EV(contextIlO))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    IlO = "unity";
                } catch (ClassNotFoundException unused) {
                    IlO = "native";
                }
                com.bytedance.sdk.openadsdk.core.EO.IlO(contextIlO).IlO("framework_name", IlO);
            }
            EV();
            AXM(contextIlO);
            zPa = vAh(contextIlO);
            lEW.IlO(contextIlO);
        }
    }

    public static void EV() {
        try {
            int ringerMode = ((AudioManager) cl.IlO().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                lEW = 1;
            } else if (ringerMode == 1) {
                lEW = 2;
            } else {
                lEW = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void AXM(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            DmF = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            hp = streamVolume;
            bWL = (int) ((streamVolume / DmF) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oeT(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        mmj.MY(new lEW("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            public void run() {
                int unused = DeviceUtils.zPa = DeviceUtils.vAh(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int vAh(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
            }
            return kBB(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int kBB(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L35
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != r1) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            r2 = r1
            goto L34
        L1c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L34
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L35
            r0 = 4
            if (r4 != r0) goto L19
            goto L1a
        L34:
            return r2
        L35:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.DeviceUtils.kBB(android.content.Context):int");
    }

    public static void rp(Context context) {
        AudioInfoReceiver.MY(context);
    }

    public static void hp(Context context) {
        Context applicationContext;
        if (Cc || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                pP(applicationContext);
            } else {
                IlO.MY(applicationContext);
            }
            Cc = true;
        } catch (Throwable unused) {
        }
    }

    private static void pP(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.oeT(applicationContext);
            }
        });
    }

    static class MY extends BroadcastReceiver {
        MY() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.vCE = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.vCE = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.MY = System.currentTimeMillis();
            }
        }
    }

    public static class EO extends lEW {
        public EO() {
            super("gaid_task");
        }

        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(cl.IlO());
                if (advertisingIdInfo != null) {
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    i = 1;
                    if (zIsLimitAdTrackingEnabled) {
                        com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(1);
                    }
                    if (!zIsLimitAdTrackingEnabled) {
                        i = 0;
                    }
                    DeviceUtils.MY(advertisingIdInfo, zIsLimitAdTrackingEnabled);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    com.bytedance.sdk.openadsdk.core.EO.IlO(cl.IlO()).IlO("limit_ad_track", i);
                }
            } catch (IOException e) {
                com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(2);
                oeT.IlO("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(2);
                oeT.EO("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void MY(AdvertisingIdClient.Info info, boolean z) {
        if (z || !com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().EO()) {
            return;
        }
        String id = info.getId();
        String strMY = com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().MY();
        if (!TextUtils.isEmpty(id)) {
            com.bytedance.sdk.openadsdk.es.IlO.MY.IlO.IlO().IlO(id);
            com.bytedance.sdk.openadsdk.core.DmF.EO.IlO(id);
        }
        if (strMY.equals(id)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rp.IlO();
    }

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.rp.DmF> IlO = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void MY(Context context) {
            if (DeviceUtils.tV || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.DmF.IlO());
                boolean unused = DeviceUtils.tV = true;
            } catch (Throwable unused2) {
            }
        }

        public static void IlO(com.bytedance.sdk.openadsdk.rp.DmF dmF) {
            if (dmF != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.rp.DmF> copyOnWriteArrayList = IlO;
                if (copyOnWriteArrayList.contains(dmF)) {
                    return;
                }
                copyOnWriteArrayList.add(dmF);
            }
        }

        public static void MY(com.bytedance.sdk.openadsdk.rp.DmF dmF) {
            if (dmF == null) {
                return;
            }
            IlO.remove(dmF);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.hp = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (!IlO.isEmpty()) {
                            mmj.IlO(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Iterator<com.bytedance.sdk.openadsdk.rp.DmF> it = AudioInfoReceiver.IlO.iterator();
                                    while (it.hasNext()) {
                                        it.next().MY(DeviceUtils.hp);
                                    }
                                }
                            });
                        }
                        if (DeviceUtils.DmF != 0) {
                            int unused2 = DeviceUtils.bWL = (int) ((DeviceUtils.hp / DeviceUtils.DmF) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.ea = intent.getIntExtra(AdOperationMetric.INIT_STATE, 0);
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static class IlO extends BroadcastReceiver {
        private IlO() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void MY(Context context) {
            if (Build.VERSION.SDK_INT < 21 || context == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(new IlO(), intentFilter, 2);
            } else {
                context.registerReceiver(new IlO(), intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.oeT(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.zPa = intent.getIntExtra(AdOperationMetric.INIT_STATE, 0) == 1 ? 1 : 0;
            }
        }
    }
}
