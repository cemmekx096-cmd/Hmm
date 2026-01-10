package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.inmobi.media.X5$;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class X5 {
    public final Ya a;
    public final int b;
    public K9 c;
    public f5 d;

    public X5(int i, Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "mRenderView");
        this.a = ya;
        this.b = i;
    }

    public static final void a(X5 x5, String str, String str2) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        o6.a(x5.a.getLandingPageHandler(), "open", str, str2, (t6) null, false, 24);
    }

    public static final void b(X5 x5, String str, String str2) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x5.a.getLandingPageHandler().d("openEmbedded", str, str2, (t6) null);
        } catch (Exception e) {
            x5.a.a(str, "Unexpected error", "openEmbedded");
            I6.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str3 = Y5.a;
                g5Var.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling openEmbedded() request from creative; ")));
            }
        }
    }

    public static final void c(X5 x5, String str, String str2) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        o6.a(x5.a.getLandingPageHandler(), "openWithoutTracker", str, str2, (t6) null, true, 8);
    }

    public static final void d(X5 x5, String str, String str2) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            Ya ya = x5.a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            ya.b(str, str2.subSequence(i, length + 1).toString());
        } catch (Exception e) {
            x5.a.a(str, "Unexpected error", "playVideo");
            I6.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str3 = Y5.a;
                g5Var.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling playVideo() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "url");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "asyncPing called: ", str2));
        }
        if (!URLUtil.isValidUrl(str2)) {
            this.a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            l9 l9Var = new l9(str2, this.d);
            l9Var.x = false;
            l9Var.t = false;
            l9Var.u = false;
            l9Var.a(new t1(new u1(l9Var, new W5(this))));
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "asyncPing");
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                g5Var2.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered internal error in handling asyncPing() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "mediaId");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "cancelSaveContent called. mediaId:", str2));
        }
    }

    @JavascriptInterface
    public final void close(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "close called");
        }
        if (!this.a.z0) {
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda9(this, str));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "closeAll is called");
        }
        Ya ya = this.a;
        g5 g5Var2 = ya.i;
        if (g5Var2 != null) {
            String str3 = Ya.P0;
            g5Var2.a(str3, Wa.a(ya, str3, "TAG", "closeAll "));
        }
        Z z = ya.V;
        if (z != null) {
            z.b();
        }
        Activity activity = (Activity) ya.k.get();
        if (activity != null) {
            activity.finish();
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "closeCustomExpand called.");
        }
        if (this.b != 1) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                g5Var2.b(str3, j6.a(str3, "access$getTAG$p(...)", "closeCustomExpand called in incorrect Ad type: ").append(this.b).toString());
                return;
            }
            return;
        }
        if (this.a != null) {
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda3(this));
            return;
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.b(str4, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i, float f, boolean z, boolean z2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/X5;->customExpand(Ljava/lang/String;Ljava/lang/String;IFZZ)V");
        safedk_X5_customExpand_2287a97dcbc7209482e01a27014d5286(str, str2, i, f, z, z2);
        BrandSafetyUtils.onMraidExpand("com.inmobi", str, str2, this.a, "imraid.customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(String str, String str2, float f, boolean z) {
        t6 t6Var;
        Intrinsics.checkNotNullParameter(str2, "url");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "customExpandInNative called");
        }
        Ya ya = this.a;
        if (ya.z0) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            g5 g5Var3 = this.d;
            if (g5Var3 != null) {
                String str5 = Y5.a;
                g5Var3.b(str5, j6.a(str5, "access$getTAG$p(...)", "customExpandInNative called in incorrect Ad type: ").append(this.b).toString());
                return;
            }
            return;
        }
        if (f < 0.0f || f > 1.0f) {
            ya.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        u6 u6Var = ya.getLandingPageHandler().f;
        if (u6Var != null) {
            String strA = l6.a(str2);
            o6 landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.h + 1;
            landingPageHandler.h = i;
            t6Var = new t6(u6Var, strA, i, 8);
        } else {
            t6Var = null;
        }
        t6 t6Var2 = t6Var;
        if (t6Var2 != null) {
            t6Var2.g = "IN_NATIVE";
        }
        o6 landingPageHandler2 = this.a.getLandingPageHandler();
        h6 h6Var = h6.d;
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter(h6Var, "funnelState");
        l6.a(h6Var, t6Var2, 8010, new n6(landingPageHandler2));
        int iA = this.a.getLandingPageHandler().a("customExpandInNative", str, str2, t6Var2, new g2(f, z));
        g5 g5Var4 = this.d;
        if (g5Var4 != null) {
            String str6 = Y5.a;
            g5Var4.a(str6, x8.a(str6, "access$getTAG$p(...)", "customExpandInNativeRequest: ", iA));
        }
        if (iA == 3) {
            R3 r3 = R3.a;
            a(str, str2, 0, f, !z, t6Var2);
        }
    }

    @JavascriptInterface
    public final void disableBackButton(String str, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "disableBackButton called");
        }
        Ya ya = this.a;
        if (ya != null) {
            ya.setDisableBackButton(z);
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void disableCloseRegion(String str, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "disableCloseRegion called");
        }
        if (this.a != null) {
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda6(this, z, str));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            g5 g5Var = this.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                g5Var.a(str2, "fireAdFailed called.");
            }
            this.a.g();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdFailed");
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                g5Var2.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdFailed() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            g5 g5Var = this.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                g5Var.a(str2, "fireAdReady called.");
            }
            this.a.h();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdReady");
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                g5Var2.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdReady() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "fireComplete is called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            g5Var3.c(str4, Wa.a(ya, str4, "TAG", "completeFromInterActive "));
        }
        Z2 z2 = ya.I0;
        if (z2 != null && !z2.g.get()) {
            z2.d.i = 1;
            Intrinsics.checkNotNull(z2.c);
        }
        g5 g5Var4 = ya.i;
        if (g5Var4 != null) {
            String str5 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str5, "TAG");
            g5Var4.a(str5, "completeFromInterActive");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        g5 g5Var;
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var2.a(str2, "fireSkip is called");
        }
        if (this.a == null && (g5Var = this.d) != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.b(str3, "Found a null instance of render view!");
        }
        Ya ya = this.a;
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            g5Var3.c(str4, Wa.a(ya, str4, "TAG", "skipFromInterActive "));
        }
        Z2 z2 = ya.I0;
        if (z2 != null && !z2.g.get()) {
            z2.d.h = 1;
            Intrinsics.checkNotNull(z2.c);
        }
        g5 g5Var4 = ya.i;
        if (g5Var4 != null) {
            String str5 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str5, "TAG");
            g5Var4.a(str5, "skipFromInterActive");
        }
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getAdContext is called");
        }
        Z adPodHandler = this.a.getAdPodHandler();
        if (adPodHandler != null) {
            return ((Q0) adPodHandler).K();
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        Z1 z1;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "getBlob is called");
        }
        a2 a2Var = this.a;
        if (a2Var == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = ((Ya) a2Var).i;
        if (g5Var3 != null) {
            String str5 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str5, "TAG");
            g5Var3.a(str5, "getBlob");
        }
        if (str == null || str2 == null || (z1 = ((Ya) a2Var).R) == null) {
            return;
        }
        ((Q0) z1).a(str, str2, a2Var, a2Var.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        Ya ya;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getCurrentPosition called");
        }
        Ya ya2 = this.a;
        if (ya2 == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 == null) {
                return BuildConfig.FLAVOR;
            }
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "Found a null instance of render view!");
            return BuildConfig.FLAVOR;
        }
        synchronized (ya2.getCurrentPositionMonitor()) {
            this.a.w = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda1(this));
            while (true) {
                ya = this.a;
                if (ya.w) {
                    try {
                        ya.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return ya.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getCurrentRenderingIndex is called");
        }
        return this.a.getCurrentRenderingPodAdIndex();
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        Ya ya;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getDefaultPosition called");
        }
        Ya ya2 = this.a;
        if (ya2 == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
            }
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        synchronized (ya2.getDefaultPositionMonitor()) {
            this.a.v = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda0(this));
            while (true) {
                ya = this.a;
                if (ya.v) {
                    try {
                        ya.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return ya.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getDeviceVolume called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            f7 mediaProcessor = ya.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getDeviceVolume");
            g5 g5Var3 = this.d;
            if (g5Var3 != null) {
                String str4 = Y5.a;
                g5Var3.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDeviceVolume() request from creative; ")));
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getMaxDeviceVolume called");
        }
        try {
            return E3.a.m();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getMaxDeviceVolume");
            g5 g5Var2 = this.d;
            if (g5Var2 == null) {
                return 0;
            }
            String str3 = Y5.a;
            g5Var2.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; ")));
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) throws JSONException {
        int i;
        int i2;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.a.getContainerContext();
                Intrinsics.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            int iB = y2.b(frameLayout.getWidth() / N3.b());
            int iB2 = y2.b(frameLayout.getHeight() / N3.b());
            if (this.a.getFullScreenActivity() != null && (iB == 0 || iB2 == 0)) {
                Intrinsics.checkNotNull(frameLayout);
                V5 v5 = new V5(frameLayout, this.d);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(v5);
                Boolean bool = Boolean.FALSE;
                synchronized (bool) {
                    try {
                        bool.wait();
                    } catch (InterruptedException unused) {
                    }
                    i = v5.c;
                    i2 = v5.d;
                    Unit unit = Unit.INSTANCE;
                }
                iB2 = i2;
                iB = i;
            }
            try {
                jSONObject.put(SettingsJsonConstants.ICON_WIDTH_KEY, iB);
                jSONObject.put(SettingsJsonConstants.ICON_HEIGHT_KEY, iB2);
            } catch (JSONException e) {
                g5 g5Var2 = this.d;
                if (g5Var2 != null) {
                    String str3 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    g5Var2.a(str3, "Error while creating max size Json.", e);
                }
            }
            g5 g5Var3 = this.d;
            if (g5Var3 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var3.a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e2) {
            this.a.a(str, "Unexpected error", "getMaxSize");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e2, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxSize() request from creative; ")));
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getOrientation called");
        }
        byte bG = N3.g();
        return bG == 1 ? "0" : bG == 3 ? "90" : bG == 2 ? "180" : bG == 4 ? "270" : "-1";
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        K9 k9 = this.c;
        String str2 = k9 != null ? k9.d : null;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "getOrientationProperties called: ", str2));
        }
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        g5 g5Var = this.d;
        if (g5Var == null) {
            return "android";
        }
        String str2 = Y5.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        g5Var.a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            g5Var.a(str2, k6.a(str2, "access$getTAG$p(...)", "getPlatformVersion. Version:", strValueOf));
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getRenderableAdIndexes is called");
        }
        JSONArray renderableAdIndexes = this.a.getRenderableAdIndexes();
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.a(str3, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string = renderableAdIndexes.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.a.getSafeArea();
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SettingsJsonConstants.ICON_WIDTH_KEY, N3.h().a);
            jSONObject.put(SettingsJsonConstants.ICON_HEIGHT_KEY, N3.h().b);
            g5 g5Var = this.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                g5Var.c(str2, "Message:Width x Height : " + N3.h().a + 'x' + N3.h().b);
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getScreenSize");
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                g5Var2.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error while getting screen dimensions; ")));
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            g5Var3.a(str4, k6.a(str4, "access$getTAG$p(...)", "getScreenSize called:", string));
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        g5 g5Var = this.d;
        if (g5Var == null) {
            return "10.8.3";
        }
        String str2 = Y5.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        g5Var.a(str2, "getSdkVersion called. Version:10.8.3");
        return "10.8.3";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "getShowTimeStamp is called");
        }
        long showTimeStamp = this.a.getShowTimeStamp();
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.a(str3, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.a.getViewState();
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        String lowerCase = viewState.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            g5Var.c(str2, k6.a(str2, "access$getTAG$p(...)", "getState called:", lowerCase));
        }
        return lowerCase;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        g5 g5Var = this.d;
        if (g5Var == null) {
            return "2.0";
        }
        String str2 = Y5.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        g5Var.a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "impressionFired is called");
        }
        Ya ya = this.a;
        g5 g5Var2 = ya.i;
        if (g5Var2 != null) {
            String str3 = Ya.P0;
            g5Var2.a(str3, Wa.a(ya, str3, "TAG", "onImpressionFired "));
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            g5Var3.a(str4, Wa.a(ya, str4, "TAG", "recordContextualData "));
        }
        Z2 z2 = ya.I0;
        if (z2 != null) {
            z2.a();
        }
        ya.getListener().a(ya.getTelemetryOnAdImpression());
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) throws JSONException {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "incentCompleted called. IncentData:", str2));
        }
        if (str2 == null) {
            try {
                this.a.getListener().b(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                g5 g5Var2 = this.d;
                if (g5Var2 != null) {
                    String str4 = Y5.a;
                    g5Var2.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str5 = next;
                Object obj = jSONObject.get(str5);
                Intrinsics.checkNotNull(obj);
                map.put(str5, obj);
            }
            try {
                try {
                    this.a.getListener().b(map);
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "incentCompleted");
                    g5 g5Var3 = this.d;
                    if (g5Var3 != null) {
                        String str6 = Y5.a;
                        Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        g5Var3.b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                g5 g5Var4 = this.d;
                if (g5Var4 != null) {
                    String str7 = Y5.a;
                    g5Var4.b(str7, Ed.a(e3, j6.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.a.getListener().b(new HashMap());
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "isBackButtonDisabled called");
        }
        Ya ya = this.a;
        if (ya != null) {
            return ya.B;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 == null) {
            return false;
        }
        String str3 = Y5.a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        g5Var2.b(str3, "Found a null instance of render view!");
        return false;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "isDeviceMuted called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 == null) {
                return "false";
            }
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "Found a null instance of render view!");
            return "false";
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            f7 mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            g5 g5Var4 = mediaProcessor.b;
            if (g5Var4 != null) {
                g5Var4.c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context contextD = Kb.d();
            if (contextD != null) {
                Object systemService = contextD.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            g5 g5Var5 = this.d;
            if (g5Var5 != null) {
                String str5 = Y5.a;
                g5Var5.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if device is muted; ")));
            }
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "isHeadphonePlugged called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 == null) {
                return "false";
            }
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var2.b(str3, "Found a null instance of render view!");
            return "false";
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        boolean zB = false;
        try {
            f7 mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            zB = f7.b();
        } catch (Exception e) {
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if headphones are plugged-in; ")));
            }
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        String str2 = Y5.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        Ya ya = this.a;
        if (ya != null) {
            return ya.z == qd.c;
        }
        g5 g5Var = this.d;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            g5Var.a(str2, x8.a(str2, "access$getTAG$p(...)", "loadAd is called with index - ", i));
        }
        Ya ya = this.a;
        g5 g5Var2 = ya.i;
        if (g5Var2 != null) {
            String str3 = Ya.P0;
            g5Var2.a(str3, Wa.a(ya, str3, "TAG", "loadPodAd "));
        }
        if (ya.z == qd.c && ya.V != null && !ya.D.get()) {
            Z z = ya.V;
            if (z != null) {
                z.a(i, ya);
                return;
            }
            return;
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str4, "TAG");
            g5Var3.b(str4, "Cannot load index pod ad as the current ad is not viewable");
        }
        ya.a(false);
    }

    @JavascriptInterface
    public final void log(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.c(str3, k6.a(str3, "access$getTAG$p(...)", "Log called. Message:", str2));
        }
        Ya ya = this.a;
        ya.getClass();
        Ia ia = Ya.N0;
        ia.getClass();
        if (!((Boolean) Ya.Q0.getValue(ia, Ia.a[0])).booleanValue() || str2 == null) {
            return;
        }
        ya.getListener().a(str2);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String str2, String str3) {
        if (str2 == null) {
            g5 g5Var = this.d;
            if (g5Var != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var.b(str4, "eventType is null");
                return;
            }
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str5 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            g5Var2.a(str5, "logTelemetryEvent is called: ".concat(str2));
        }
        Ya ya = this.a;
        ya.getClass();
        Intrinsics.checkNotNullParameter(str2, "eventType");
        fb fbVar = ya.O;
        if (fbVar != null) {
            Intrinsics.checkNotNullParameter(str2, "eventType");
            if (fbVar.f.get()) {
                return;
            }
            if (fbVar.e.decrementAndGet() <= 0) {
                fbVar.f.set(true);
                Map mapA = fbVar.a();
                long j = fbVar.b;
                ScheduledExecutorService scheduledExecutorService = Xc.a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
                ic icVar = ic.a;
                ic.b("TemplateEventDropped", mapA, mc.a);
                return;
            }
            if (str3 != null) {
                try {
                } catch (JSONException e) {
                    Log.e(ic.b, "Error parsing JSON: " + e);
                }
                if (new JSONObject(str3).length() == 0) {
                    str3 = null;
                }
            }
            Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("plType", String.valueOf(fbVar.a.a.m())), TuplesKt.to("markupType", fbVar.a.b), TuplesKt.to("networkType", E3.q())});
            if (str3 != null) {
                mapMutableMapOf.put("payload", str3);
            }
            if (fbVar.a.c.length() > 0) {
                mapMutableMapOf.put("metadataBlob", fbVar.a.c);
            }
            ic.b(str2, mapMutableMapOf, mc.b);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            g5Var.a(str2, x8.a(str2, "access$getTAG$p(...)", "onAudioStateChanged is called: ", i));
        }
        B1.b.getClass();
        B1 b1 = (B1) B1.c.get(i);
        if (b1 == null) {
            b1 = B1.d;
        }
        if (b1 != B1.d) {
            this.a.getListener().a(b1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.a.getListener().a(z);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) throws JSONException {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "onUserInteraction called");
        }
        Ya ya = this.a;
        if (ya != null && !ya.k()) {
            this.a.a("onUserInteraction");
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str4 = Y5.a;
            g5Var2.a(str4, k6.a(str4, "access$getTAG$p(...)", "onUserInteraction called. Params:", str2));
        }
        if (str2 == null) {
            try {
                this.a.getListener().a(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str5 = Y5.a;
                    g5Var3.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str6 = next;
                Object obj = jSONObject.get(str6);
                Intrinsics.checkNotNull(obj);
                map.put(str6, obj);
            }
            try {
                try {
                    this.a.getListener().a(map);
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "onUserInteraction");
                    g5 g5Var4 = this.d;
                    if (g5Var4 != null) {
                        String str7 = Y5.a;
                        Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        g5Var4.b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                g5 g5Var5 = this.d;
                if (g5Var5 != null) {
                    String str8 = Y5.a;
                    g5Var5.b(str8, Ed.a(e3, j6.a(str8, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.a.getListener().a(new HashMap());
        }
    }

    @JavascriptInterface
    public final void open(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/X5;->open(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_X5_open_e67ddc1c0a6aa8dd605d7d84d6b0ed36(str, str2);
        BrandSafetyUtils.onMraidOpen("com.inmobi", str, str2, this.a, "mraid.open");
    }

    @JavascriptInterface
    public final void openEmbedded(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/X5;->openEmbedded(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_X5_openEmbedded_1a4e883c9f1cfc95918f37394f9eb8e4(str, str2);
        BrandSafetyUtils.onMraidOpen("com.inmobi", str, str2, this.a, "imraid.openEmbedded");
    }

    @JavascriptInterface
    public final void openExternal(String str, String str2, String str3) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/X5;->openExternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        safedk_X5_openExternal_f0f9c173969147824afa2b697b1a257d(str, str2, str3);
        BrandSafetyUtils.onMraidOpen("com.inmobi", str, str2, this.a, "imraid.openExternal");
    }

    @JavascriptInterface
    public final void openWithoutTracker(String str, String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/X5;->openWithoutTracker(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_X5_openWithoutTracker_35c6d4b1f056e399fd508fc03da299cb(str, str2);
        BrandSafetyUtils.onMraidOpen("com.inmobi", str, str2, this.a, "imraid.openWithoutTracker");
    }

    @JavascriptInterface
    public final void ping(String str, String str2, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "ping called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare(str2.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str5 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    g5Var3.a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    u2.a.a(str2, z, this.d);
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "ping");
                    I6.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    g5 g5Var4 = this.d;
                    if (g5Var4 != null) {
                        String str6 = Y5.a;
                        g5Var4.b(str6, Ed.a(e, j6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String str2, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "openInWebView called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare(str2.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str5 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    g5Var3.a(str5, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    u2.a.b(str2, z, this.d);
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "pingInWebView");
                    I6.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    g5 g5Var4 = this.d;
                    if (g5Var4 != null) {
                        String str6 = Y5.a;
                        g5Var4.b(str6, Ed.a(e, j6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling pingInWebView() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void playVideo(String str, String str2) {
        if (this.a == null) {
            g5 g5Var = this.d;
            if (g5Var != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && StringsKt.startsWith$default(str2, "http", false, 2, (Object) null) && (StringsKt.endsWith$default(str2, "mp4", false, 2, (Object) null) || StringsKt.endsWith$default(str2, "avi", false, 2, (Object) null) || StringsKt.endsWith$default(str2, "m4v", false, 2, (Object) null))) {
                g5 g5Var2 = this.d;
                if (g5Var2 != null) {
                    String str4 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    g5Var2.a(str4, "JavaScript called: playVideo (" + str2 + ')');
                }
                new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda2(this, str, str2));
                return;
            }
        }
        this.a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "registerBackButtonPressedEventListener called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            g5 g5Var3 = ya.i;
            if (g5Var3 != null) {
                String str4 = Ya.P0;
                Intrinsics.checkNotNullExpressionValue(str4, "TAG");
                g5Var3.a(str4, "registerBackButtonPressedEventListener " + ya);
            }
            ya.C = str;
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "registerDeviceMuteEventListener called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                f7 mediaProcessor = ya.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(str, "jsCallbackNamespace");
                    if (mediaProcessor.d == null) {
                        S6 s6 = new S6(new c7(mediaProcessor, str));
                        mediaProcessor.d = s6;
                        s6.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str4 = Y5.a;
                    g5Var3.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                f7 mediaProcessor = ya.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(str, "jsCallbackNamespace");
                    Context contextD = Kb.d();
                    if (contextD != null && mediaProcessor.e == null) {
                        S6 s6 = new S6(new d7(mediaProcessor, str, contextD, new Handler(Looper.getMainLooper())));
                        mediaProcessor.e = s6;
                        s6.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str4 = Y5.a;
                    g5Var3.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "registerHeadphonePluggedEventListener called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                f7 mediaProcessor = ya.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(str, "jsCallbackNamespace");
                    if (mediaProcessor.f == null) {
                        S6 s6 = new S6(new b7(mediaProcessor, str));
                        mediaProcessor.f = s6;
                        s6.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                g5 g5Var3 = this.d;
                if (g5Var3 != null) {
                    String str4 = Y5.a;
                    g5Var3.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public void safedk_X5_customExpand_2287a97dcbc7209482e01a27014d5286(String p0, String p1, int p2, float p3, boolean p4, boolean p5) {
        t6 t6Var;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.a(str, "customExpand called");
        }
        boolean p42 = this.a.z0;
        if (p42) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String p12 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
                g5Var2.b(p12, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            g5 g5Var3 = this.d;
            if (g5Var3 != null) {
                String p13 = Y5.a;
                g5Var3.b(p13, j6.a(p13, "access$getTAG$p(...)", "customExpand called in incorrect Ad type: ").append(this.b).toString());
                return;
            }
            return;
        }
        if (p1 != null) {
            int length = p1.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare(p1.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (p1.subSequence(i, length + 1).toString().length() != 0) {
                if (p2 < 0 || p2 >= R3.values().length) {
                    this.a.a(p0, "Invalid inputType", "customExpand");
                    return;
                }
                if (p3 < 0.0f || p3 > 1.0f) {
                    this.a.a(p0, "Invalid screenPercentage", "customExpand");
                    return;
                }
                u6 u6Var = this.a.getLandingPageHandler().f;
                if (u6Var != null) {
                    String strA = l6.a(p1);
                    o6 landingPageHandler = this.a.getLandingPageHandler();
                    int i2 = landingPageHandler.h + 1;
                    landingPageHandler.h = i2;
                    t6Var = new t6(u6Var, strA, i2, 8);
                } else {
                    t6Var = null;
                }
                t6 t6Var2 = t6Var;
                if (t6Var2 != null) {
                    t6Var2.g = "IN_CUSTOM";
                }
                o6 landingPageHandler2 = this.a.getLandingPageHandler();
                h6 h6Var = h6.d;
                Integer numValueOf = Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_HAVE_ACTIVE_STRATEGY);
                landingPageHandler2.getClass();
                Intrinsics.checkNotNullParameter(h6Var, "funnelState");
                l6.a(h6Var, t6Var2, numValueOf, new n6(landingPageHandler2));
                a(p0, p1, p2, p3, p5, t6Var2);
                return;
            }
        }
        this.a.a(p0, "Invalid " + p2, "customExpand");
    }

    @JavascriptInterface
    public void safedk_X5_openEmbedded_1a4e883c9f1cfc95918f37394f9eb8e4(String p0, String p1) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.a(str, "openEmbedded called");
        }
        if (!this.a.k()) {
            this.a.a("openEmbedded");
            return;
        }
        Ya ya = this.a;
        if (!ya.z0) {
            ya.i();
            fc.a(new X5$.ExternalSyntheticLambda5(this, p0, p1));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String p12 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            g5Var2.b(p12, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_X5_openExternal_f0f9c173969147824afa2b697b1a257d(String p0, String p1, String p2) {
        t6 t6Var;
        Intrinsics.checkNotNullParameter(p1, "url");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.a(str, "open External");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String p12 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
                g5Var2.b(p12, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (!ya.k()) {
            this.a.a("openExternal");
            return;
        }
        this.a.i();
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str2 = Y5.a;
            g5Var3.a(str2, k6.a(str2, "access$getTAG$p(...)", "openExternal called with url: ", p1));
        }
        u6 u6Var = this.a.getLandingPageHandler().f;
        if (u6Var != null) {
            String strA = l6.a(p1);
            o6 landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.h + 1;
            landingPageHandler.h = i;
            t6Var = new t6(u6Var, strA, i, 8);
        } else {
            t6Var = null;
        }
        if (t6Var != null) {
            t6Var.g = "EX_NATIVE";
        }
        o6 landingPageHandler2 = this.a.getLandingPageHandler();
        h6 h6Var = h6.d;
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter(h6Var, "funnelState");
        l6.a(h6Var, t6Var, (Integer) null, new n6(landingPageHandler2));
        o6 landingPageHandler3 = this.a.getLandingPageHandler();
        landingPageHandler3.getClass();
        Intrinsics.checkNotNullParameter("openExternal", "api");
        if (p1 != null) {
            landingPageHandler3.e(p0, p1, p2, t6Var);
            return;
        }
        if (p2 != null) {
            landingPageHandler3.e(p0, p2, (String) null, t6Var);
            return;
        }
        h6 h6Var2 = h6.e;
        Intrinsics.checkNotNullParameter(h6Var2, "funnelState");
        l6.a(h6Var2, t6Var, 2, new n6(landingPageHandler3));
        Ra ra = landingPageHandler3.d;
        if (ra != null) {
            Intrinsics.checkNotNullParameter("Empty url and fallback url", SettingsJsonConstants.PROMPT_MESSAGE_KEY);
            ra.a.a(p0, "Empty url and fallback url", "openExternal");
        }
        g5 g5Var4 = landingPageHandler3.g;
        if (g5Var4 != null) {
            Intrinsics.checkNotNullExpressionValue("o6", "TAG");
            g5Var4.b("o6", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public void safedk_X5_openWithoutTracker_35c6d4b1f056e399fd508fc03da299cb(String p0, String p1) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.a(str, "openWithoutTracker called");
        }
        if (!this.a.k()) {
            this.a.a("openWithoutTracker");
            return;
        }
        if (!this.a.z0) {
            fc.a(new X5$.ExternalSyntheticLambda4(this, p0, p1));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String p12 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            g5Var2.b(p12, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_X5_open_e67ddc1c0a6aa8dd605d7d84d6b0ed36(String p0, String p1) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            g5Var.a(str, "open called");
        }
        if (!this.a.k()) {
            this.a.a("open");
            return;
        }
        Ya ya = this.a;
        if (!ya.z0) {
            ya.i();
            fc.a(new X5$.ExternalSyntheticLambda12(this, p0, p1));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String p12 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            g5Var2.b(p12, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        Z1 z1;
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "saveBlob is called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str5 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str5, "TAG");
            g5Var3.a(str5, "saveBlob");
        }
        if (str2 == null || (z1 = ya.R) == null) {
            return;
        }
        ((Q0) z1).a(str2, ya.getImpressionId());
    }

    @JavascriptInterface
    public final void saveContent(String str, String str2, String str3) throws JSONException {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            try {
                this.a.b(str, str2, str3);
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "saveContent");
                g5 g5Var = this.d;
                if (g5Var != null) {
                    String str4 = Y5.a;
                    g5Var.b(str4, Ed.a(e, j6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling saveContent() request from creative; ")));
                    return;
                }
                return;
            }
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str5 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            g5Var2.a(str5, "saveContent called with invalid parameters");
        }
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        try {
            jSONObject.put("url", str3);
            jSONObject.put(AdOperationMetric.REASON, 8);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strReplace$default = StringsKt.replace$default(string, "\"", "\\\"", false, 4, (Object) null);
        StringBuilder sb = new StringBuilder("sendSaveContentResult(\"saveContent_");
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        this.a.a(str, sb.append(str2).append("\", 'failed', \"").append(strReplace$default).append("\");").toString());
    }

    @JavascriptInterface
    public final void setAdContext(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "podAdContext");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "setAdContext is called ", str2));
        }
        Z adPodHandler = this.a.getAdPodHandler();
        if (adPodHandler != null) {
            ((Q0) adPodHandler).d(str2);
        }
    }

    @JavascriptInterface
    public final void setCloseEndCardTracker(String str, String str2) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "setCloseEndCardTracker is called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            ya.setCloseEndCardTracker(str2);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getDownloadStatus");
            g5 g5Var3 = this.d;
            if (g5Var3 != null) {
                String str5 = Y5.a;
                g5Var3.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDownloadStatus() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "orientationPropertiesString");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "setOrientationProperties called: ", str2));
        }
        if (!this.a.z0) {
            new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda8(this, str2));
            return;
        }
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var2.b(str4, "setOrientationProperties called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void showAd(String str, int i) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            g5Var.a(str2, x8.a(str2, "access$getTAG$p(...)", "showAd is called with index ", i));
        }
        Ya ya = this.a;
        g5 g5Var2 = ya.i;
        if (g5Var2 != null) {
            String str3 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str3, "TAG");
            g5Var2.a(str3, "showPodAdAtIndex " + ya + ' ' + i);
        }
        if (ya.z == qd.c && ya.V != null && !ya.D.get()) {
            Z z = ya.V;
            if (z != null) {
                z.a(i, ya, ya.getFullScreenActivity());
                return;
            }
            return;
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str4, "TAG");
            g5Var3.b(str4, "Cannot show index pod ad as the current ad is not viewable");
        }
        ya.b(false);
    }

    @JavascriptInterface
    public final void showAlert(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "alert");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "showAlert: ", str2));
        }
    }

    @JavascriptInterface
    public final void showEndCard(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "showEndCard is called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = ya.i;
        if (g5Var3 != null) {
            String str4 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str4, "TAG");
            g5Var3.a(str4, "showEndCardFromInterActive");
        }
        t7 referenceContainer = ya.getReferenceContainer();
        if (referenceContainer instanceof t7) {
            referenceContainer.o();
        }
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            g5Var.a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str2, "adQualityUrl");
        Intrinsics.checkNotNullParameter(str3, "enableUserAdReportScreenshot");
        Intrinsics.checkNotNullParameter(str4, "templateInfo");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str5 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            g5Var.a(str5, "submitAdReport called");
        }
        this.a.a(str2, str4, Intrinsics.areEqual(str3, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
    }

    @JavascriptInterface
    public final String supports(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "feature");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str3 = Y5.a;
            g5Var.a(str3, k6.a(str3, "access$getTAG$p(...)", "Checking support for: ", str2));
        }
        String strValueOf = String.valueOf(this.a.e(str2));
        g5 g5Var2 = this.d;
        if (g5Var2 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var2.c(str4, "Message:" + str2 + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "timeSinceShow is called");
        }
        Ya ya = this.a;
        g5 g5Var2 = ya.i;
        if (g5Var2 != null) {
            String str3 = Ya.P0;
            g5Var2.c(str3, Wa.a(ya, str3, "TAG", "timeSincePodShow "));
        }
        Z z = ya.V;
        if (z != null) {
            return ((Q0) z).A0();
        }
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "unload called");
        }
        try {
            this.a.n();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unload");
            I6.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                g5Var2.b(str3, Ed.a(e, j6.a(str3, "access$getTAG$p(...)", "SDK encountered an expected error in handling the unload() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "unregisterBackButtonPressedEventListener called");
        }
        Ya ya = this.a;
        if (ya == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            g5 g5Var3 = ya.i;
            if (g5Var3 != null) {
                String str4 = Ya.P0;
                Intrinsics.checkNotNullExpressionValue(str4, "TAG");
                g5Var3.a(str4, "unregisterBackButtonPressedEventListener " + ya);
            }
            ya.C = null;
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.a(str4, "Unregister device mute event listener ...");
        }
        try {
            f7 mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                S6 s6 = mediaProcessor.d;
                if (s6 != null) {
                    s6.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.a(str4, "Unregister device volume change listener ...");
        }
        try {
            f7 mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                S6 s6 = mediaProcessor.e;
                if (s6 != null) {
                    s6.a();
                }
                mediaProcessor.e = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.a == null) {
            g5 g5Var2 = this.d;
            if (g5Var2 != null) {
                String str3 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                g5Var2.b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        g5 g5Var3 = this.d;
        if (g5Var3 != null) {
            String str4 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            g5Var3.a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            f7 mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                S6 s6 = mediaProcessor.f;
                if (s6 != null) {
                    s6.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            g5 g5Var4 = this.d;
            if (g5Var4 != null) {
                String str5 = Y5.a;
                g5Var4.b(str5, Ed.a(e, j6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void useCustomClose(String str, boolean z) {
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "useCustomClose called:" + z);
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda7(this, z, str));
    }

    @JavascriptInterface
    public final void zoom(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "jsCallbackNamespace");
        g5 g5Var = this.d;
        if (g5Var != null) {
            String str2 = Y5.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            g5Var.a(str2, "zoom is called " + str + ' ' + i);
        }
        fc.a(new X5$.ExternalSyntheticLambda11(this, i));
    }

    public static final void c(X5 x5) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x5.a.p();
        } catch (Exception e) {
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str = Y5.a;
                g5Var.b(str, Ed.a(e, j6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting default position; ")));
            }
        }
    }

    public final void a(String str, String str2, int i, float f, boolean z, t6 t6Var) {
        if (t6Var != null) {
            t6Var.g = "IN_CUSTOM";
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new X5$.ExternalSyntheticLambda10(this, t6Var, str2, i, str, f, z));
    }

    public static final void a(X5 x5, t6 t6Var, String str, int i, String str2, float f, boolean z) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        Intrinsics.checkNotNullParameter(str, "$expandInput");
        try {
            if (x5.a.getEmbeddedBrowserJSCallbacks() == null) {
                g5 g5Var = x5.d;
                if (g5Var != null) {
                    String str3 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    g5Var.b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                o6 landingPageHandler = x5.a.getLandingPageHandler();
                h6 h6Var = h6.e;
                Integer numValueOf = Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_DISCOVERING);
                landingPageHandler.getClass();
                Intrinsics.checkNotNullParameter(h6Var, "funnelState");
                l6.a(h6Var, t6Var, numValueOf, new n6(landingPageHandler));
                return;
            }
            g5 g5Var2 = x5.d;
            if (g5Var2 != null) {
                String str4 = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                g5Var2.a(str4, "Custom expand called. Url: " + str);
            }
            R3 r3 = R3.values()[i];
            if (r3 == R3.a) {
                int iA = x5.a.getLandingPageHandler().a("customExpand", str2, str, t6Var, (g2) null);
                g5 g5Var3 = x5.d;
                if (g5Var3 != null) {
                    String str5 = Y5.a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    g5Var3.a(str5, "processCustomExpandRequest: " + iA);
                }
                if (iA == 3) {
                    N4 embeddedBrowserJSCallbacks = x5.a.getEmbeddedBrowserJSCallbacks();
                    if (embeddedBrowserJSCallbacks != null) {
                        embeddedBrowserJSCallbacks.a(str, r3, f, z, x5.a.getViewTouchTimestamp(), t6Var);
                    }
                    o6 landingPageHandler2 = x5.a.getLandingPageHandler();
                    h6 h6Var2 = h6.f;
                    landingPageHandler2.getClass();
                    Intrinsics.checkNotNullParameter(h6Var2, "funnelState");
                    l6.a(h6Var2, t6Var, (Integer) null, new n6(landingPageHandler2));
                    Ra ra = x5.a.getLandingPageHandler().d;
                    if (ra != null) {
                        Ya.a(ra.a, "customExpand", str2, str);
                        return;
                    }
                    return;
                }
                N4 embeddedBrowserJSCallbacks2 = x5.a.getEmbeddedBrowserJSCallbacks();
                if (embeddedBrowserJSCallbacks2 != null) {
                    P4.a(embeddedBrowserJSCallbacks2.a);
                    return;
                }
                return;
            }
            N4 embeddedBrowserJSCallbacks3 = x5.a.getEmbeddedBrowserJSCallbacks();
            if (embeddedBrowserJSCallbacks3 != null) {
                embeddedBrowserJSCallbacks3.a(str, r3, f, z, x5.a.getViewTouchTimestamp(), t6Var);
            }
            o6 landingPageHandler3 = x5.a.getLandingPageHandler();
            h6 h6Var3 = h6.f;
            landingPageHandler3.getClass();
            Intrinsics.checkNotNullParameter(h6Var3, "funnelState");
            l6.a(h6Var3, t6Var, (Integer) null, new n6(landingPageHandler3));
            Ra ra2 = x5.a.getLandingPageHandler().d;
            if (ra2 != null) {
                Ya.a(ra2.a, "customExpand", str2, str);
            }
        } catch (Exception e) {
            x5.a.a(str2, "Unexpected error", "customExpand");
            o6 landingPageHandler4 = x5.a.getLandingPageHandler();
            h6 h6Var4 = h6.e;
            landingPageHandler4.getClass();
            Intrinsics.checkNotNullParameter(h6Var4, "funnelState");
            l6.a(h6Var4, t6Var, 9, new n6(landingPageHandler4));
            I6.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            g5 g5Var4 = x5.d;
            if (g5Var4 != null) {
                String str6 = Y5.a;
                g5Var4.b(str6, Ed.a(e, j6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling customExpand() request; ")));
            }
        }
    }

    public static final void b(X5 x5) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x5.a.o();
        } catch (Exception e) {
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str = Y5.a;
                g5Var.b(str, Ed.a(e, j6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting current position; ")));
            }
        }
    }

    public static final void b(X5 x5, String str) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        Intrinsics.checkNotNullParameter(str, "$orientationPropertiesString");
        K9 orientationProperties = x5.a.getOrientationProperties();
        if (orientationProperties != null) {
            Intrinsics.checkNotNullParameter(str, "json");
            Intrinsics.checkNotNullParameter(orientationProperties, "op");
            K9 k9 = new K9();
            k9.d = str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("forceOrientation", orientationProperties.b);
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                Intrinsics.checkNotNullParameter(strOptString, "<set-?>");
                k9.b = strOptString;
                k9.a = jSONObject.optBoolean("allowOrientationChange", orientationProperties.a);
                String strOptString2 = jSONObject.optString("direction", orientationProperties.c);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                Intrinsics.checkNotNullParameter(strOptString2, "<set-?>");
                k9.c = strOptString2;
                if (!Intrinsics.areEqual(k9.b, "portrait") && !Intrinsics.areEqual(k9.b, "landscape")) {
                    Intrinsics.checkNotNullParameter("none", "<set-?>");
                    k9.b = "none";
                }
                if (!Intrinsics.areEqual(k9.c, "left") && !Intrinsics.areEqual(k9.c, "right")) {
                    Intrinsics.checkNotNullParameter("right", "<set-?>");
                    k9.c = "right";
                }
            } catch (JSONException unused) {
                k9 = null;
            }
            x5.c = k9;
        }
        K9 k92 = x5.c;
        if (k92 != null) {
            Ya ya = x5.a;
            Intrinsics.checkNotNull(k92);
            ya.setOrientationProperties(k92);
        }
    }

    public static final void b(X5 x5, boolean z, String str) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x5.a.e(z);
        } catch (Exception e) {
            x5.a.a(str, "Unexpected error", "useCustomClose");
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                g5Var.b(str2, Ed.a(e, j6.a(str2, "access$getTAG$p(...)", "SDK encountered internal error in handling useCustomClose() request from creative; ")));
            }
        }
    }

    public static final void a(X5 x5) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        if (x5.a.getEmbeddedBrowserJSCallbacks() == null) {
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str = Y5.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                g5Var.b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        N4 embeddedBrowserJSCallbacks = x5.a.getEmbeddedBrowserJSCallbacks();
        if (embeddedBrowserJSCallbacks != null) {
            P4.a(embeddedBrowserJSCallbacks.a);
        }
    }

    public static final void a(X5 x5, String str) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x referenceContainer = x5.a.getReferenceContainer();
            if (referenceContainer != null) {
                referenceContainer.a();
            }
        } catch (Exception e) {
            x5.a.a(str, "Unexpected error", "close");
            I6.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                g5Var.b(str2, Ed.a(e, j6.a(str2, "access$getTAG$p(...)", "SDK encountered an expected error in handling the close() request from creative; ")));
            }
        }
    }

    public static final void a(X5 x5, boolean z, String str) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        try {
            x5.a.d(z);
        } catch (Exception e) {
            x5.a.a(str, "Unexpected error", "disableCloseRegion");
            g5 g5Var = x5.d;
            if (g5Var != null) {
                String str2 = Y5.a;
                g5Var.b(str2, Ed.a(e, j6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling disableCloseRegion() request from creative; ")));
            }
        }
    }

    public static final void a(X5 x5, int i) {
        Intrinsics.checkNotNullParameter(x5, "this$0");
        x5.a.setInitialScale(i);
    }
}
