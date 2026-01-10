package com.vungle.ads.internal.ui;

import android.view.MotionEvent;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;

/* compiled from: VungleActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0011¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleActivity;", "Lcom/vungle/ads/internal/ui/AdActivity;", "()V", "canRotate", BuildConfig.FLAVOR, "canRotate$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class VungleActivity extends AdActivity {
    @Override // com.vungle.ads.internal.ui.AdActivity
    public boolean canRotate$vungle_ads_release() {
        return true;
    }

    @Override // com.vungle.ads.internal.ui.AdActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.vungle", me);
        return super.dispatchTouchEvent(me);
    }
}
