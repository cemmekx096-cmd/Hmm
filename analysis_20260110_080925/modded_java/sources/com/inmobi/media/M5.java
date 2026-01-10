package com.inmobi.media;

import com.google.firebase.messaging.Constants;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class M5 extends L5 {
    public final InterstitialAdEventListener a;

    public M5(InterstitialAdEventListener interstitialAdEventListener) {
        Intrinsics.checkNotNullParameter(interstitialAdEventListener, "adEventListener");
        this.a = interstitialAdEventListener;
    }

    @Override // com.inmobi.media.z
    public final void a(Object obj, Map map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(map, "params");
        this.a.onAdClicked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.media.z
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        this.a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.z
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(adMetaInfo, "info");
        this.a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.z
    public final void a(Object obj) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        this.a.onAdImpression(inMobiInterstitial);
    }

    @Override // com.inmobi.media.z
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        this.a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.z
    public final void a(Object obj, String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(inMobiInterstitial, "ad");
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.a, inMobiInterstitial, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
