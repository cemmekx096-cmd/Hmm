package com.devtodev.analytics.internal.platform.repository.playservice;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.platform.repository.IPlayServiceRepository;
import com.devtodev.analytics.internal.platform.repository.playservice.InstallReferrerState;
import com.devtodev.analytics.internal.platform.repository.playservice.ReferrerState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayServiceWrapper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/playservice/PlayServiceWrapper;", BuildConfig.FLAVOR, "playServiceRepository", "Lcom/devtodev/analytics/internal/platform/repository/IPlayServiceRepository;", "(Lcom/devtodev/analytics/internal/platform/repository/IPlayServiceRepository;)V", "getInstallReferrer", BuildConfig.FLAVOR, "referrerStateListener", "Lcom/devtodev/analytics/internal/platform/repository/playservice/IReferrerStateListener;", "getInstallReferrerListener", "Lcom/devtodev/analytics/internal/platform/repository/playservice/IInstallReferrerStartConnectionListener;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class PlayServiceWrapper {
    private final IPlayServiceRepository playServiceRepository;

    public PlayServiceWrapper(IPlayServiceRepository iPlayServiceRepository) {
        Intrinsics.checkNotNullParameter(iPlayServiceRepository, "playServiceRepository");
        this.playServiceRepository = iPlayServiceRepository;
    }

    private final IInstallReferrerStartConnectionListener getInstallReferrerListener(final IReferrerStateListener referrerStateListener) {
        return new IInstallReferrerStartConnectionListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper.getInstallReferrerListener.1
            public void referrerServiceDisconnected() {
                referrerStateListener.onReferrerState(ReferrerState.ServiceDisconnected.INSTANCE);
            }

            public void referrerServiceNoDefinition() {
                referrerStateListener.onReferrerState(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
            }

            public void referrerSetupFinished(InstallReferrerState installReferrerState) {
                Intrinsics.checkNotNullParameter(installReferrerState, "installReferrerState");
                if (installReferrerState instanceof InstallReferrerState.InstallReferrerData) {
                    InstallReferrerState.InstallReferrerData installReferrerData = (InstallReferrerState.InstallReferrerData) installReferrerState;
                    referrerStateListener.onReferrerState(new ReferrerState.ReferrerData(installReferrerData.getInstallReferrer(), installReferrerData.getGooglePlayInstantParam(), installReferrerData.getInstallBeginTimeStampSeconds(), installReferrerData.getReferrerClickTimestampSeconds()));
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.ReceiveStateFail.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.ReceiveStateFail.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.FeatureNotSupported.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.FeatureNotSupported.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.ServiceUnavailable.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.ServiceUnavailable.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.SecurityException.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.BindNotAllowed.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.NoInstallReferrerImplementation.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.DeadObjectException.INSTANCE)) {
                    referrerStateListener.onReferrerState(ReferrerState.ServiceUnavailable.INSTANCE);
                }
                IPlayServiceRepository iPlayServiceRepository = this.playServiceRepository;
                final IReferrerStateListener iReferrerStateListener = referrerStateListener;
                iPlayServiceRepository.stopInstallReferrerConnection(new IInstallReferrerStopConnectionListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper$getInstallReferrerListener$1$referrerSetupFinished$1
                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerConnectionClosed() {
                        iReferrerStateListener.onReferrerStateClose(ReferrerState.ServiceConnectionEnded.INSTANCE);
                    }

                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerObjectNotExist() {
                        iReferrerStateListener.onReferrerStateClose(ReferrerState.ServiceUnavailable.INSTANCE);
                    }

                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerServiceNoDefinition() {
                        iReferrerStateListener.onReferrerStateClose(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
                    }
                });
            }
        };
    }

    public final void getInstallReferrer(IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        this.playServiceRepository.startInstallReferrerConnection(getInstallReferrerListener(referrerStateListener));
    }
}
