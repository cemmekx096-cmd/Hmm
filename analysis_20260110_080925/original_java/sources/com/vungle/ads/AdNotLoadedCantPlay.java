package com.vungle.ads;

import com.crashlytics.android.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VungleError.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AdNotLoadedCantPlay;", "Lcom/vungle/ads/VungleError;", SettingsJsonConstants.PROMPT_MESSAGE_KEY, BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AdNotLoadedCantPlay extends VungleError {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdNotLoadedCantPlay() {
        String str = null;
        this(str, 1, str);
    }

    public /* synthetic */ AdNotLoadedCantPlay(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public AdNotLoadedCantPlay(String str) {
        super(Sdk.SDKError.Reason.AD_NOT_LOADED, "Failed to retrieve the ad object: " + str, (DefaultConstructorMarker) null);
    }
}
