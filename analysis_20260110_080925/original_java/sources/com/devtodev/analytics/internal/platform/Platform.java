package com.devtodev.analytics.internal.platform;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.platform.gateway.PlatformGateway;
import com.devtodev.analytics.internal.platform.repository.RepositoryDI;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/devtodev/analytics/internal/platform/Platform;", "Lcom/devtodev/analytics/internal/platform/IPlatform;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "platformGateway", "Lcom/devtodev/analytics/internal/platform/gateway/PlatformGateway;", "getPlatformGateway", "()Lcom/devtodev/analytics/internal/platform/gateway/PlatformGateway;", "platformGateway$delegate", "Lkotlin/Lazy;", "getApplicationData", "Lcom/devtodev/analytics/internal/platform/ApplicationData;", "getDeviceConstants", "Lcom/devtodev/analytics/internal/platform/DeviceConstants;", "getDeviceResolution", "Lcom/devtodev/analytics/internal/platform/DeviceResolution;", "getGoogleAdvertisingId", "Lcom/devtodev/analytics/internal/platform/GoogleAdvertisingIdResult;", "getHuaweiTokenData", "Lcom/devtodev/analytics/internal/platform/HuaweiTokenData;", "getInstallReferrer", BuildConfig.FLAVOR, "referrerStateListener", "Lcom/devtodev/analytics/internal/platform/repository/playservice/IReferrerStateListener;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Platform implements IPlatform {
    private final Context context;

    /* renamed from: platformGateway$delegate, reason: from kotlin metadata */
    private final Lazy platformGateway;

    public Platform(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.platformGateway = LazyKt.lazy(new Function0<PlatformGateway>() { // from class: com.devtodev.analytics.internal.platform.Platform$platformGateway$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final PlatformGateway m85invoke() {
                return new PlatformGateway(new RepositoryDI(this.this$0.getContext()));
            }
        });
    }

    private final PlatformGateway getPlatformGateway() {
        return (PlatformGateway) this.platformGateway.getValue();
    }

    public ApplicationData getApplicationData() {
        return getPlatformGateway().getApplicationData();
    }

    public final Context getContext() {
        return this.context;
    }

    public DeviceConstants getDeviceConstants() {
        return getPlatformGateway().getDeviceConstants();
    }

    public DeviceResolution getDeviceResolution() {
        return getPlatformGateway().getDeviceResolution();
    }

    public GoogleAdvertisingIdResult getGoogleAdvertisingId() {
        return getPlatformGateway().getGoogleAdvertisingIdResult();
    }

    public HuaweiTokenData getHuaweiTokenData() {
        return getPlatformGateway().getHuaweiAdvertisingIdResult();
    }

    public void getInstallReferrer(IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        getPlatformGateway().getInstallReferrer(referrerStateListener);
    }
}
