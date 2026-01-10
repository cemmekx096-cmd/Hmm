package com.devtodev.analytics.internal.platform.repository.playservice;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.queue.QueueManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferrerClient.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/playservice/ReferrerClient;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "installReferrerClient", "Lcom/android/installreferrer/api/InstallReferrerClient;", "getInstallReferrerClient", "()Lcom/android/installreferrer/api/InstallReferrerClient;", "installReferrerClient$delegate", "Lkotlin/Lazy;", "endConnection", BuildConfig.FLAVOR, "referrerListener", "Lcom/devtodev/analytics/internal/platform/repository/playservice/IReferrerClientListener;", "startConnection", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ReferrerClient {
    private final Context context;

    /* renamed from: installReferrerClient$delegate, reason: from kotlin metadata */
    private final Lazy installReferrerClient;

    public ReferrerClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.installReferrerClient = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<InstallReferrerClient>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$installReferrerClient$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InstallReferrerClient m91invoke() {
                return InstallReferrerClient.newBuilder(this.this$0.context).build();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallReferrerClient getInstallReferrerClient() {
        return (InstallReferrerClient) this.installReferrerClient.getValue();
    }

    public final void endConnection(IReferrerClientListener referrerListener) {
        Intrinsics.checkNotNullParameter(referrerListener, "referrerListener");
        InstallReferrerClient installReferrerClient = getInstallReferrerClient();
        if (installReferrerClient != null && installReferrerClient.isReady()) {
            installReferrerClient.endConnection();
        }
        referrerListener.onReferrerServiceConnectionClosed();
    }

    public final void startConnection(final IReferrerClientListener referrerListener) {
        Intrinsics.checkNotNullParameter(referrerListener, "referrerListener");
        InstallReferrerClient installReferrerClient = getInstallReferrerClient();
        if (installReferrerClient != null) {
            installReferrerClient.startConnection(new InstallReferrerStateListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient.startConnection.1
                public void onInstallReferrerServiceDisconnected() {
                    QueueManager.Companion companion = QueueManager.Companion;
                    final IReferrerClientListener iReferrerClientListener = referrerListener;
                    companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerServiceDisconnected$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m92invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m92invoke() {
                            iReferrerClientListener.onReferrerServiceDisconnected();
                        }
                    });
                }

                public void onInstallReferrerSetupFinished(final int responseCode) {
                    QueueManager.Companion companion = QueueManager.Companion;
                    final ReferrerClient referrerClient = ReferrerClient.this;
                    final IReferrerClientListener iReferrerClientListener = referrerListener;
                    companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m93invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m93invoke() {
                            try {
                                int i = responseCode;
                                if (i != 0) {
                                    if (i == 1) {
                                        QueueManager.Companion companion2 = QueueManager.Companion;
                                        final IReferrerClientListener iReferrerClientListener2 = iReferrerClientListener;
                                        companion2.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m97invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m97invoke() {
                                                iReferrerClientListener2.onReferrerServiceUnavailable();
                                            }
                                        });
                                        return;
                                    } else {
                                        if (i != 2) {
                                            return;
                                        }
                                        QueueManager.Companion companion3 = QueueManager.Companion;
                                        final IReferrerClientListener iReferrerClientListener3 = iReferrerClientListener;
                                        companion3.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m96invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m96invoke() {
                                                iReferrerClientListener3.onReferrerFeatureNotSupported();
                                            }
                                        });
                                        return;
                                    }
                                }
                                InstallReferrerClient installReferrerClient2 = referrerClient.getInstallReferrerClient();
                                ReferrerDetails installReferrer = installReferrerClient2 != null ? installReferrerClient2.getInstallReferrer() : null;
                                if (installReferrer == null) {
                                    QueueManager.Companion companion4 = QueueManager.Companion;
                                    final IReferrerClientListener iReferrerClientListener4 = iReferrerClientListener;
                                    companion4.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m95invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m95invoke() {
                                            iReferrerClientListener4.onReferrerSetupFail();
                                        }
                                    });
                                    return;
                                }
                                final String installReferrer2 = installReferrer.getInstallReferrer();
                                final boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                final long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                final long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                QueueManager.Companion companion5 = QueueManager.Companion;
                                final IReferrerClientListener iReferrerClientListener5 = iReferrerClientListener;
                                companion5.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m94invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m94invoke() {
                                        IReferrerClientListener iReferrerClientListener6 = iReferrerClientListener5;
                                        String str = installReferrer2;
                                        Intrinsics.checkNotNullExpressionValue(str, "installReferrer");
                                        iReferrerClientListener6.onReferrerSetup(str, googlePlayInstantParam, installBeginTimestampSeconds, referrerClickTimestampSeconds);
                                    }
                                });
                            } catch (Exception unused) {
                                QueueManager.Companion companion6 = QueueManager.Companion;
                                final IReferrerClientListener iReferrerClientListener6 = iReferrerClientListener;
                                companion6.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m98invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m98invoke() {
                                        iReferrerClientListener6.onReferrerServiceUnavailable();
                                    }
                                });
                            }
                        }
                    });
                }
            });
        }
    }
}
