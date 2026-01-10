package com.devtodev.analytics.internal.platform.repository.android;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.ContextCompat;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.platform.repository.utils.Odin;
import com.google.firebase.messaging.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidContextAPI.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/android/AndroidContextAPI;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAndroidId", BuildConfig.FLAVOR, "getFullResolution", "Lcom/devtodev/analytics/internal/platform/repository/android/Resolution;", "windowManager", "Landroid/view/WindowManager;", "getLocale", "getMacAddress", "getMetricsDensity", BuildConfig.FLAVOR, "getMetricsXDPI", BuildConfig.FLAVOR, "getMetricsYDPI", "getODIN", "getRealScreenResolution", "Landroid/graphics/Point;", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Landroid/view/Display;", "getUserAgent", "getWindowServiceScreenResolution", "hasSensorHingeAngle", BuildConfig.FLAVOR, "isSimulator", "isTV", "isWatch", "permissionAccessWiFiStateGranted", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AndroidContextAPI {
    private static final String DEFAULT_ANDROID_ID = "";
    private static final String DEFAULT_MAC_ADDRESS = "";
    private static final String DEFAULT_USER_AGENT = "";
    private final Context context;

    public AndroidContextAPI(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Resolution getFullResolution(WindowManager windowManager) {
        if (Build.VERSION.SDK_INT < 30) {
            return new Resolution(1, 1);
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "windowManager.currentWindowMetrics");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "metrics.windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsets.Type.captionBar() & WindowInsets.Type.displayCutout() & WindowInsets.Type.ime() & WindowInsets.Type.mandatorySystemGestures() & WindowInsets.Type.navigationBars() & WindowInsets.Type.statusBars() & WindowInsets.Type.systemBars() & WindowInsets.Type.systemGestures() & WindowInsets.Type.tappableElement());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(\n…leElement()\n            )");
        int i = insets.right + insets.left;
        int i2 = insets.top + insets.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "metrics.bounds");
        return new Resolution(bounds.width() - i, bounds.height() - i2);
    }

    private final Point getRealScreenResolution(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    private final boolean permissionAccessWiFiStateGranted() {
        return ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public final String getAndroidId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        return string == null ? BuildConfig.FLAVOR : string;
    }

    public final String getLocale() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    public final String getMacAddress() {
        WifiManager wifiManager;
        if (!permissionAccessWiFiStateGranted() || (wifiManager = (WifiManager) this.context.getApplicationContext().getSystemService("wifi")) == null) {
            return BuildConfig.FLAVOR;
        }
        try {
            String macAddress = wifiManager.getConnectionInfo().getMacAddress();
            if (macAddress == null) {
                return BuildConfig.FLAVOR;
            }
            Intrinsics.checkNotNullExpressionValue(macAddress, "it.connectionInfo.macAdd…ss ?: DEFAULT_MAC_ADDRESS");
            return macAddress;
        } catch (RemoteException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public final float getMetricsDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    public final double getMetricsXDPI() {
        return this.context.getResources().getDisplayMetrics().xdpi;
    }

    public final double getMetricsYDPI() {
        return this.context.getResources().getDisplayMetrics().ydpi;
    }

    public final String getODIN() {
        String odin1 = Odin.getODIN1(getAndroidId());
        Intrinsics.checkNotNullExpressionValue(odin1, "getODIN1(getAndroidId())");
        return odin1;
    }

    public final String getUserAgent() {
        try {
            String property = System.getProperty("http.agent");
            return property == null ? BuildConfig.FLAVOR : property;
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public final Resolution getWindowServiceScreenResolution() {
        Resolution resolution;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        if (windowManager == null) {
            return new Resolution(1, 1);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return getFullResolution(windowManager);
        }
        if (i >= 17) {
            windowManager.getDefaultDisplay().getRealSize(point);
            resolution = new Resolution(point.x, point.y);
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "windowManager.defaultDisplay");
            Point realScreenResolution = getRealScreenResolution(defaultDisplay);
            resolution = new Resolution(realScreenResolution.x, realScreenResolution.y);
        }
        return resolution;
    }

    public final boolean hasSensorHingeAngle() {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x0009, B:6:0x001a, B:8:0x0024, B:11:0x0035, B:13:0x003e, B:15:0x0049, B:17:0x0054, B:19:0x005f, B:21:0x006a, B:23:0x0073, B:25:0x007e, B:27:0x0089, B:29:0x0094, B:31:0x009f, B:33:0x00aa, B:35:0x00b5, B:37:0x00c0, B:39:0x00ca, B:41:0x00d2, B:43:0x00df, B:45:0x00ee, B:47:0x00fb, B:49:0x0108), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x0009, B:6:0x001a, B:8:0x0024, B:11:0x0035, B:13:0x003e, B:15:0x0049, B:17:0x0054, B:19:0x005f, B:21:0x006a, B:23:0x0073, B:25:0x007e, B:27:0x0089, B:29:0x0094, B:31:0x009f, B:33:0x00aa, B:35:0x00b5, B:37:0x00c0, B:39:0x00ca, B:41:0x00d2, B:43:0x00df, B:45:0x00ee, B:47:0x00fb, B:49:0x0108), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x0009, B:6:0x001a, B:8:0x0024, B:11:0x0035, B:13:0x003e, B:15:0x0049, B:17:0x0054, B:19:0x005f, B:21:0x006a, B:23:0x0073, B:25:0x007e, B:27:0x0089, B:29:0x0094, B:31:0x009f, B:33:0x00aa, B:35:0x00b5, B:37:0x00c0, B:39:0x00ca, B:41:0x00d2, B:43:0x00df, B:45:0x00ee, B:47:0x00fb, B:49:0x0108), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[Catch: Exception -> 0x0111, TRY_LEAVE, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x0009, B:6:0x001a, B:8:0x0024, B:11:0x0035, B:13:0x003e, B:15:0x0049, B:17:0x0054, B:19:0x005f, B:21:0x006a, B:23:0x0073, B:25:0x007e, B:27:0x0089, B:29:0x0094, B:31:0x009f, B:33:0x00aa, B:35:0x00b5, B:37:0x00c0, B:39:0x00ca, B:41:0x00d2, B:43:0x00df, B:45:0x00ee, B:47:0x00fb, B:49:0x0108), top: B:54:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isSimulator() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.internal.platform.repository.android.AndroidContextAPI.isSimulator():boolean");
    }

    public final boolean isTV() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.context.getPackageManager().hasSystemFeature("android.software.leanback");
        }
        return false;
    }

    public final boolean isWatch() {
        try {
            String str = this.context.getPackageManager().getPackageInfo("com.google.android.wearable.app", 0).versionName;
            if (str == null) {
                return false;
            }
            return str.length() > 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
