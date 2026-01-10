package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.S9$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class S9 extends T1 {
    public final Window b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(Window window, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(adQualityConfig, "config");
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new S9$.ExternalSyntheticLambda0(booleanRef, this), new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        String str = "success - " + booleanRef.element + " - time - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(str, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Log.i("PixelCopyScreenShotProcess", str);
        this.b.getDecorView().setLayerType(layerType, null);
        if (!booleanRef.element) {
            return null;
        }
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter("success", SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Log.i("PixelCopyScreenShotProcess", "success");
        return a(bitmapCreateBitmap);
    }

    public static final void a(Ref.BooleanRef booleanRef, S9 s9, int i) {
        Intrinsics.checkNotNullParameter(booleanRef, "$isSuccess");
        Intrinsics.checkNotNullParameter(s9, "this$0");
        if (i == 0) {
            booleanRef.element = true;
        }
        String str = "capture result - success - " + booleanRef.element;
        Intrinsics.checkNotNullParameter("PixelCopyScreenShotProcess", "tag");
        Intrinsics.checkNotNullParameter(str, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Log.i("PixelCopyScreenShotProcess", str);
        s9.c.set(true);
    }
}
