package com.devtodev.analytics.internal.platform.gateway;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import com.devtodev.analytics.internal.platform.HuaweiTokenData;
import com.devtodev.analytics.internal.platform.repository.RepositoryDI;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerStateListener;
import com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformGateway.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/devtodev/analytics/internal/platform/gateway/PlatformGateway;", "Lcom/devtodev/analytics/internal/platform/gateway/IApplicationGateway;", "repositoryDI", "Lcom/devtodev/analytics/internal/platform/repository/RepositoryDI;", "(Lcom/devtodev/analytics/internal/platform/repository/RepositoryDI;)V", "applicationData", "Lcom/devtodev/analytics/internal/platform/ApplicationData;", "getApplicationData", "()Lcom/devtodev/analytics/internal/platform/ApplicationData;", "applicationData$delegate", "Lkotlin/Lazy;", "deviceConstants", "Lcom/devtodev/analytics/internal/platform/DeviceConstants;", "getDeviceConstants", "()Lcom/devtodev/analytics/internal/platform/DeviceConstants;", "deviceConstants$delegate", "deviceResolution", "Lcom/devtodev/analytics/internal/platform/DeviceResolution;", "getDeviceResolution", "()Lcom/devtodev/analytics/internal/platform/DeviceResolution;", "deviceResolution$delegate", "googleAdvertisingIdResult", "Lcom/devtodev/analytics/internal/platform/GoogleAdvertisingIdResult;", "getGoogleAdvertisingIdResult", "()Lcom/devtodev/analytics/internal/platform/GoogleAdvertisingIdResult;", "googleAdvertisingIdResult$delegate", "huaweiAdvertisingIdResult", "Lcom/devtodev/analytics/internal/platform/HuaweiTokenData;", "getHuaweiAdvertisingIdResult", "()Lcom/devtodev/analytics/internal/platform/HuaweiTokenData;", "huaweiAdvertisingIdResult$delegate", "getInstallReferrer", BuildConfig.FLAVOR, "referrerStateListener", "Lcom/devtodev/analytics/internal/platform/repository/playservice/IReferrerStateListener;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class PlatformGateway implements IApplicationGateway {

    /* renamed from: applicationData$delegate, reason: from kotlin metadata */
    private final Lazy applicationData;

    /* renamed from: deviceConstants$delegate, reason: from kotlin metadata */
    private final Lazy deviceConstants;

    /* renamed from: deviceResolution$delegate, reason: from kotlin metadata */
    private final Lazy deviceResolution;

    /* renamed from: googleAdvertisingIdResult$delegate, reason: from kotlin metadata */
    private final Lazy googleAdvertisingIdResult;

    /* renamed from: huaweiAdvertisingIdResult$delegate, reason: from kotlin metadata */
    private final Lazy huaweiAdvertisingIdResult;
    private final RepositoryDI repositoryDI;

    public PlatformGateway(RepositoryDI repositoryDI) {
        Intrinsics.checkNotNullParameter(repositoryDI, "repositoryDI");
        this.repositoryDI = repositoryDI;
        this.applicationData = LazyKt.lazy(new Function0<ApplicationData>() { // from class: com.devtodev.analytics.internal.platform.gateway.PlatformGateway$applicationData$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ApplicationData m86invoke() {
                return new ApplicationData(this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getVersionName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getPackageName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getVersionCode(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getInstallSourceLocation(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getSdkVersionName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getSdkVersionCode(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_unityRelease().getPlatformEngine());
            }
        });
        this.deviceConstants = LazyKt.lazy(new Function0<DeviceConstants>() { // from class: com.devtodev.analytics.internal.platform.gateway.PlatformGateway$deviceConstants$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DeviceConstants m87invoke() {
                return new DeviceConstants(this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getAndroidId(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getDeviceVersionKey(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getDevtodevUDID(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().isRooted(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getLanguage(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getMacAddress(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getManufacturer(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getModel(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getODIN(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getOsKey(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getTimezoneOffset(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getUserAgent(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getDeviceType());
            }
        });
        this.deviceResolution = LazyKt.lazy(new Function0<DeviceResolution>() { // from class: com.devtodev.analytics.internal.platform.gateway.PlatformGateway$deviceResolution$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DeviceResolution m88invoke() {
                return new DeviceResolution(this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getScreenDPI(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getScreenInches(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_unityRelease().getScreenResolution());
            }
        });
        this.googleAdvertisingIdResult = LazyKt.lazy(new Function0<GoogleAdvertisingIdResult>() { // from class: com.devtodev.analytics.internal.platform.gateway.PlatformGateway$googleAdvertisingIdResult$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final GoogleAdvertisingIdResult m89invoke() {
                return this.this$0.repositoryDI.getGoogleApiRepository$DTDAnalytics_unityRelease().getAdvertisingId();
            }
        });
        this.huaweiAdvertisingIdResult = LazyKt.lazy(new Function0<HuaweiTokenData>() { // from class: com.devtodev.analytics.internal.platform.gateway.PlatformGateway$huaweiAdvertisingIdResult$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final HuaweiTokenData m90invoke() {
                return this.this$0.repositoryDI.getHuaweiApiRepository$DTDAnalytics_unityRelease().getTokenData();
            }
        });
    }

    public ApplicationData getApplicationData() {
        return (ApplicationData) this.applicationData.getValue();
    }

    public DeviceConstants getDeviceConstants() {
        return (DeviceConstants) this.deviceConstants.getValue();
    }

    public DeviceResolution getDeviceResolution() {
        return (DeviceResolution) this.deviceResolution.getValue();
    }

    public GoogleAdvertisingIdResult getGoogleAdvertisingIdResult() {
        return (GoogleAdvertisingIdResult) this.googleAdvertisingIdResult.getValue();
    }

    public HuaweiTokenData getHuaweiAdvertisingIdResult() {
        return (HuaweiTokenData) this.huaweiAdvertisingIdResult.getValue();
    }

    public void getInstallReferrer(IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        new PlayServiceWrapper(this.repositoryDI.getPlayServiceRepository$DTDAnalytics_unityRelease()).getInstallReferrer(referrerStateListener);
    }
}
