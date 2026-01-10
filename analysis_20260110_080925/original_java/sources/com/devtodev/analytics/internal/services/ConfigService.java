package com.devtodev.analytics.internal.services;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.BackendConfig;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.backend.Versions;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataErrorWithResponse;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataJsonError;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataNoConnection;
import com.devtodev.analytics.internal.backend.repository.BackendUserDataRetry;
import com.devtodev.analytics.internal.backend.repository.DoNotRetryBackendUserData;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.InvolvedExperiments;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.backend.repository.SummaryBackendData;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.backend.repository.UserIdentifications;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IAbTestManager;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigService.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ(\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u000eH\u0002J(\u0010H\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020\u000eH\u0002J\b\u0010J\u001a\u00020\u0012H\u0016J \u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020\u0012H\u0016J\b\u0010R\u001a\u00020\u0012H\u0016J\b\u0010S\u001a\u00020\u0012H\u0016J\b\u0010T\u001a\u00020\u0012H\u0016J.\u0010U\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010X\u001a\u00020BH\u0002J\b\u0010Y\u001a\u00020\u0012H\u0002J\b\u0010Z\u001a\u00020\u0012H\u0002J\b\u0010[\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRR\u0010\u001d\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020 0\u001f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R7\u0010*\u001a\u001f\u0012\u0013\u0012\u00110+¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R7\u0010/\u001a\u001f\u0012\u0013\u0012\u001100¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R9\u00104\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R(\u00108\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010\u0016R\u000e\u0010<\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/devtodev/analytics/internal/services/ConfigService;", "Lcom/devtodev/analytics/internal/services/IAnalyticsConfigService;", "Lcom/devtodev/analytics/internal/services/IAbTestConfigService;", "stateManager", "Lcom/devtodev/analytics/internal/managers/IStateManager;", "abTestManager", "Lcom/devtodev/analytics/internal/managers/IAbTestManager;", "backend", "Lcom/devtodev/analytics/internal/backend/IBackend;", "(Lcom/devtodev/analytics/internal/managers/IStateManager;Lcom/devtodev/analytics/internal/managers/IAbTestManager;Lcom/devtodev/analytics/internal/backend/IBackend;)V", "abConfigRequestInProcess", BuildConfig.FLAVOR, "backendIDsRequestInProcess", "backendIdentifiersAttempt", BuildConfig.FLAVOR, "configUpdate", "Lkotlin/Function1;", "Lcom/devtodev/analytics/internal/backend/repository/RemoteConfig;", BuildConfig.FLAVOR, "getConfigUpdate", "()Lkotlin/jvm/functions/Function1;", "setConfigUpdate", "(Lkotlin/jvm/functions/Function1;)V", "offerNoConnection", "Lkotlin/Function0;", "getOfferNoConnection", "()Lkotlin/jvm/functions/Function0;", "setOfferNoConnection", "(Lkotlin/jvm/functions/Function0;)V", "offerUpdate", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/backend/repository/InvolvedExperiment;", "Lkotlin/ParameterName;", "name", "involvedExp", "Lcom/devtodev/analytics/internal/domain/events/abTests/SuitableExperiments;", "suitableExp", "getOfferUpdate", "()Lkotlin/jvm/functions/Function2;", "setOfferUpdate", "(Lkotlin/jvm/functions/Function2;)V", "offerUserChanged", "Ljava/lang/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getOfferUserChanged", "setOfferUserChanged", "onBackendUserDataUpdate", "Lcom/devtodev/analytics/internal/backend/repository/UserData;", "userData", "getOnBackendUserDataUpdate", "setOnBackendUserDataUpdate", "onIdentifiersUpdate", "devtodevId", "getOnIdentifiersUpdate", "setOnIdentifiersUpdate", "onSdkConfigUpdate", "Lcom/devtodev/analytics/internal/backend/ConfigEntry;", "getOnSdkConfigUpdate", "setOnSdkConfigUpdate", "remoteConfigAttempt", "retryTimer", "Ljava/util/TimerTask;", "sdkConfigAttempt", "getABConfig", "applicationKey", BuildConfig.FLAVOR, "identifiers", "Lcom/devtodev/analytics/internal/backend/Identifiers;", JsonParser.EXCLUDE_VERSION, "Lcom/devtodev/analytics/internal/backend/Versions;", "lastRequestIdKey", "getBackendIdentifiers", "attempt", "invalidateUserBackendIds", "processResultRecivingOffer", "user", "Lcom/devtodev/analytics/internal/domain/User;", "suitableExperiments", "result", "Lcom/devtodev/analytics/internal/backend/repository/AbTestOffer;", "receiveABConfig", "receiveAbBackendOffers", "receiveAnalyticsConfig", "receiveUserBackendIds", "retryAfter", "attemptTimeout", "retryBy", SettingsJsonConstants.PROMPT_MESSAGE_KEY, "retryGetOffer", "stopABTestRequestProcess", "stopRequestProcess", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ConfigService implements IAnalyticsConfigService, IAbTestConfigService {
    private boolean abConfigRequestInProcess;
    private final IAbTestManager abTestManager;
    private final IBackend backend;
    private boolean backendIDsRequestInProcess;
    private long backendIdentifiersAttempt;
    private Function1<? super RemoteConfig, Unit> configUpdate;
    private Function0<Unit> offerNoConnection;
    private Function2<? super List<InvolvedExperiment>, ? super SuitableExperiments, Unit> offerUpdate;
    private Function1<? super Exception, Unit> offerUserChanged;
    private Function1<? super UserData, Unit> onBackendUserDataUpdate;
    private Function1<? super Long, Unit> onIdentifiersUpdate;
    private Function1<? super ConfigEntry, Unit> onSdkConfigUpdate;
    private long remoteConfigAttempt;
    private TimerTask retryTimer;
    private long sdkConfigAttempt;
    private final IStateManager stateManager;

    public ConfigService(IStateManager iStateManager, IAbTestManager iAbTestManager, IBackend iBackend) {
        Intrinsics.checkNotNullParameter(iStateManager, "stateManager");
        Intrinsics.checkNotNullParameter(iAbTestManager, "abTestManager");
        Intrinsics.checkNotNullParameter(iBackend, "backend");
        this.stateManager = iStateManager;
        this.abTestManager = iAbTestManager;
        this.backend = iBackend;
        this.sdkConfigAttempt = 1L;
        this.backendIdentifiersAttempt = 1L;
        this.remoteConfigAttempt = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getABConfig(String applicationKey, Identifiers identifiers, Versions version, long lastRequestIdKey) {
        RemoteConfigSealedClass remoteConfigSealedClassRequestAbTestConfig = this.backend.requestAbTestConfig(applicationKey, identifiers, version);
        if (!(remoteConfigSealedClassRequestAbTestConfig instanceof RemoteConfig)) {
            stopABTestRequestProcess();
            this.remoteConfigAttempt = retryAfter(this.remoteConfigAttempt, 60L, new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.getABConfig.1
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m99invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m99invoke() {
                    QueueManager.Companion companion = QueueManager.Companion;
                    final ConfigService configService = ConfigService.this;
                    companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.getABConfig.1.1
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m100invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m100invoke() {
                            configService.receiveABConfig();
                        }
                    });
                }
            }, "Failed to receive A/B-Test config");
            return;
        }
        this.abConfigRequestInProcess = false;
        if (!this.stateManager.getActiveProject().getTrackingAvailable()) {
            Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] The query result was not applied. Tracking is Disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        if (lastRequestIdKey != this.stateManager.getActiveUser().getIdKey()) {
            Logger.debug$default(Logger.INSTANCE, "In the process of receiving AB-test configuration from the server, the user was changed. Request the configuration again.", (Throwable) null, 2, (Object) null);
            receiveABConfig();
        } else {
            Function1<RemoteConfig, Unit> configUpdate = getConfigUpdate();
            if (configUpdate != null) {
                configUpdate.invoke(remoteConfigSealedClassRequestAbTestConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBackendIdentifiers(final long attempt, final String applicationKey, final Identifiers identifiers, final long lastRequestIdKey) {
        final BackendUserDataRetry backendUserDataRetryRequestBackendUserData = this.backend.requestBackendUserData(applicationKey, attempt, identifiers);
        if (backendUserDataRetryRequestBackendUserData instanceof SummaryBackendData) {
            QueueManager.Companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.getBackendIdentifiers.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m101invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m101invoke() {
                    ConfigService.this.backendIDsRequestInProcess = false;
                    if (!ConfigService.this.stateManager.getActiveProject().getTrackingAvailable()) {
                        Logger.info$default(Logger.INSTANCE, "BackendIdentifiers: The query result was not applied. Tracking is Disabled", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    User activeUser = ConfigService.this.stateManager.getActiveUser();
                    if (activeUser.getIdKey() != lastRequestIdKey) {
                        Logger.debug$default(Logger.INSTANCE, "In the process of receiving backend identifiers from the server, the user was changed. Request the identifiers again.", (Throwable) null, 2, (Object) null);
                        ConfigService.this.receiveUserBackendIds();
                        return;
                    }
                    Identifiers allIdentifiers = ConfigService.this.stateManager.getAllIdentifiers(activeUser);
                    UserIdentifications userIdentifications = backendUserDataRetryRequestBackendUserData.getUserIdentifications();
                    if (!allIdentifiers.isValid() && Intrinsics.areEqual(allIdentifiers.getDevtodevId(), userIdentifications.getDevtodevId())) {
                        Logger.warning$default(Logger.INSTANCE, "Once tracking is disabled, the devtodevID is invalid until changed!", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    ConfigService.this.stateManager.changeValidStateOfDeviceIdentifiers(true);
                    ConfigService.this.stateManager.updateDeviceIdentifiers(userIdentifications.getDevtodevId(), userIdentifications.getCrossPlatformDevtodevId(), userIdentifications.getDevtodevIdTimestamp());
                    Logger logger = Logger.INSTANCE;
                    Logger.info$default(logger, "For [" + activeUser.getUserId() + "] user the updated backendIdentifiers are:\n" + userIdentifications, (Throwable) null, 2, (Object) null);
                    Function1<Long, Unit> onIdentifiersUpdate = ConfigService.this.getOnIdentifiersUpdate();
                    if (onIdentifiersUpdate != null) {
                        onIdentifiersUpdate.invoke(userIdentifications.getDevtodevId());
                    }
                    Logger.info$default(logger, "For [" + activeUser.getUserId() + "] user the updated backendUserInfo are:\n" + backendUserDataRetryRequestBackendUserData.getUserData(), (Throwable) null, 2, (Object) null);
                    Function1<UserData, Unit> onBackendUserDataUpdate = ConfigService.this.getOnBackendUserDataUpdate();
                    if (onBackendUserDataUpdate != null) {
                        onBackendUserDataUpdate.invoke(backendUserDataRetryRequestBackendUserData.getUserData());
                    }
                }
            });
            return;
        }
        if (backendUserDataRetryRequestBackendUserData instanceof BackendUserDataRetry) {
            BackendUserDataRetry backendUserDataRetry = backendUserDataRetryRequestBackendUserData;
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: let's retry after: " + backendUserDataRetry.getRetryAfter(), (Throwable) null, 2, (Object) null);
            Timer timer = new Timer();
            long retryAfter = backendUserDataRetry.getRetryAfter();
            TimerTask timerTask = new TimerTask() { // from class: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$$inlined$schedule$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    final long j = attempt + 1;
                    QueueManager.Companion companion = QueueManager.Companion;
                    final ConfigService configService = this;
                    final String str = applicationKey;
                    final Identifiers identifiers2 = identifiers;
                    final long j2 = lastRequestIdKey;
                    companion.runConfigQueue(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService$getBackendIdentifiers$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m102invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m102invoke() {
                            configService.getBackendIdentifiers(j, str, identifiers2, j2);
                        }
                    });
                }
            };
            timer.schedule(timerTask, retryAfter);
            this.retryTimer = timerTask;
            return;
        }
        if (backendUserDataRetryRequestBackendUserData instanceof DoNotRetryBackendUserData) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: doNotRetry", (Throwable) null, 2, (Object) null);
            stopRequestProcess();
            return;
        }
        if (backendUserDataRetryRequestBackendUserData instanceof BackendUserDataErrorWithResponse) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifier unknown status code: " + ((BackendUserDataErrorWithResponse) backendUserDataRetryRequestBackendUserData).getResponse(), (Throwable) null, 2, (Object) null);
            stopRequestProcess();
            return;
        }
        if (backendUserDataRetryRequestBackendUserData instanceof BackendUserDataJsonError) {
            Logger.debug$default(Logger.INSTANCE, "BackendIdentifiers: Identification Json Error", (Throwable) null, 2, (Object) null);
            stopRequestProcess();
        } else if (backendUserDataRetryRequestBackendUserData instanceof BackendUserDataNoConnection) {
            stopRequestProcess();
            this.backendIdentifiersAttempt = retryAfter(this.backendIdentifiersAttempt, 60L, new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.getBackendIdentifiers.3
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m103invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m103invoke() {
                    QueueManager.Companion companion = QueueManager.Companion;
                    final ConfigService configService = ConfigService.this;
                    companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.getBackendIdentifiers.3.1
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m104invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m104invoke() {
                            configService.receiveUserBackendIds();
                        }
                    });
                }
            }, "Failed to get devtodev backendId identifiers");
        } else if (backendUserDataRetryRequestBackendUserData instanceof BackendUserDataError) {
            Logger.error$default(Logger.INSTANCE, "BackendIdentifiers: Identification Error", (Throwable) null, 2, (Object) null);
            stopRequestProcess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResultRecivingOffer(final User user, final SuitableExperiments suitableExperiments, final AbTestOffer result) {
        QueueManager.Companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.processResultRecivingOffer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m105invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m105invoke() {
                if (ConfigService.this.stateManager.getActiveUser().getIdKey() != user.getIdKey()) {
                    Exception exc = new Exception("[A/B-Test Module]  In the process of receiving offer from the server, the user was changed. Offer has been canceled.");
                    Function1<Exception, Unit> offerUserChanged = ConfigService.this.getOfferUserChanged();
                    if (offerUserChanged != null) {
                        offerUserChanged.invoke(exc);
                        return;
                    }
                    return;
                }
                if (result instanceof InvolvedExperiments) {
                    Function2<List<InvolvedExperiment>, SuitableExperiments, Unit> offerUpdate = ConfigService.this.getOfferUpdate();
                    if (offerUpdate != null) {
                        offerUpdate.invoke(result.getInvolvedExperiments(), suitableExperiments);
                        return;
                    }
                    return;
                }
                Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Failed to get A/B-Test offer", (Throwable) null, 2, (Object) null);
                ConfigService configService = ConfigService.this;
                long j = configService.remoteConfigAttempt;
                final ConfigService configService2 = ConfigService.this;
                configService.retryAfter(j, 2L, new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.processResultRecivingOffer.1.1
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m106invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m106invoke() {
                        configService2.retryGetOffer();
                    }
                }, "[A/B-Test Module] The query result was not applied. Tracking is Disabled");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long retryAfter(long attempt, long attemptTimeout, final Function0<Unit> retryBy, String message) {
        long j = attemptTimeout * attempt;
        new Timer().schedule(new TimerTask() { // from class: com.devtodev.analytics.internal.services.ConfigService$retryAfter$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                retryBy.invoke();
            }
        }, VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD * j);
        Logger.debug$default(Logger.INSTANCE, message + ", retrying after [" + j + "] seconds", (Throwable) null, 2, (Object) null);
        if (attempt < 10) {
            return 1 + attempt;
        }
        return 10L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryGetOffer() {
        if (!this.stateManager.getActiveProject().getTrackingAvailable()) {
            Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] The query result was not applied. Tracking is Disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        Function0<Unit> offerNoConnection = getOfferNoConnection();
        if (offerNoConnection != null) {
            offerNoConnection.invoke();
        }
    }

    private final void stopABTestRequestProcess() {
        QueueManager.Companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.stopABTestRequestProcess.1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m113invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m113invoke() {
                ConfigService.this.abConfigRequestInProcess = false;
            }
        });
    }

    private final void stopRequestProcess() {
        QueueManager.Companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.stopRequestProcess.1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m114invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m114invoke() {
                ConfigService.this.backendIDsRequestInProcess = false;
            }
        });
    }

    public Function1<RemoteConfig, Unit> getConfigUpdate() {
        return this.configUpdate;
    }

    public Function0<Unit> getOfferNoConnection() {
        return this.offerNoConnection;
    }

    public Function2<List<InvolvedExperiment>, SuitableExperiments, Unit> getOfferUpdate() {
        return this.offerUpdate;
    }

    public Function1<Exception, Unit> getOfferUserChanged() {
        return this.offerUserChanged;
    }

    public Function1<UserData, Unit> getOnBackendUserDataUpdate() {
        return this.onBackendUserDataUpdate;
    }

    public Function1<Long, Unit> getOnIdentifiersUpdate() {
        return this.onIdentifiersUpdate;
    }

    public Function1<ConfigEntry, Unit> getOnSdkConfigUpdate() {
        return this.onSdkConfigUpdate;
    }

    public void invalidateUserBackendIds() {
        this.stateManager.changeValidStateOfDeviceIdentifiers(false);
        Logger.debug$default(Logger.INSTANCE, "Current devtodevID is invalid!", (Throwable) null, 2, (Object) null);
    }

    public void receiveABConfig() {
        final User activeUser = this.stateManager.getActiveUser();
        if (this.abConfigRequestInProcess) {
            Logger logger = Logger.INSTANCE;
            String userId = activeUser.getUserId();
            if (userId == null) {
                userId = BuildConfig.FLAVOR;
            }
            Logger.debug$default(logger, "[A/B-Test Module] Receiving operation for AB-test configuration [" + userId + "] has been canceled", (Throwable) null, 2, (Object) null);
            return;
        }
        this.abConfigRequestInProcess = true;
        final Project activeProject = this.stateManager.getActiveProject();
        final Identifiers identifiers = this.stateManager.getIdentifiers(this.stateManager.getActiveUser());
        final Versions version = this.stateManager.getVersion();
        Long configVersion = this.abTestManager.getConfigVersion();
        if (configVersion != null) {
            version.setConfigVersion(configVersion.longValue());
        }
        Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Trying get A/B-Test configuration from server", (Throwable) null, 2, (Object) null);
        QueueManager.Companion.runConfigQueue(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveABConfig.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m107invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m107invoke() {
                ConfigService.this.getABConfig(activeProject.getApplicationKey(), identifiers, version, activeUser.getIdKey());
            }
        });
    }

    public void receiveAbBackendOffers() {
        final Project activeProject = this.stateManager.getActiveProject();
        final User activeUser = this.stateManager.getActiveUser();
        final Identifiers identifiers = this.stateManager.getIdentifiers(activeUser);
        final SuitableExperiments suitableExperiments = new SuitableExperiments(this.abTestManager.getSuitableExperiments());
        QueueManager.Companion.runConfigQueue(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveAbBackendOffers.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m108invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m108invoke() {
                Logger.debug$default(Logger.INSTANCE, "[A/B-Test Module] Try get A/B-Test offer from server", (Throwable) null, 2, (Object) null);
                ConfigService.this.processResultRecivingOffer(activeUser, suitableExperiments, ConfigService.this.backend.requestAbTestOffer(activeProject.getApplicationKey(), identifiers, suitableExperiments));
            }
        });
    }

    public void receiveAnalyticsConfig() {
        final Project activeProject = this.stateManager.getActiveProject();
        final Identifiers identifiers = this.stateManager.getIdentifiers(this.stateManager.getActiveUser());
        final Versions version = this.stateManager.getVersion();
        Logger.debug$default(Logger.INSTANCE, "Trying to get analytics configuration from the server", (Throwable) null, 2, (Object) null);
        QueueManager.Companion.runConfigQueue(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveAnalyticsConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m109invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m109invoke() {
                BackendConfig backendConfigRequestConfig = ConfigService.this.backend.requestConfig(activeProject.getApplicationKey(), identifiers, version);
                if (backendConfigRequestConfig instanceof ConfigEntry) {
                    Function1<ConfigEntry, Unit> onSdkConfigUpdate = ConfigService.this.getOnSdkConfigUpdate();
                    if (onSdkConfigUpdate != null) {
                        onSdkConfigUpdate.invoke(backendConfigRequestConfig);
                        return;
                    }
                    return;
                }
                ConfigService configService = ConfigService.this;
                long j = configService.sdkConfigAttempt;
                final ConfigService configService2 = ConfigService.this;
                configService.sdkConfigAttempt = configService.retryAfter(j, 60L, new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveAnalyticsConfig.1.1
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m110invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m110invoke() {
                        QueueManager.Companion companion = QueueManager.Companion;
                        final ConfigService configService3 = configService2;
                        companion.runIncoming(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveAnalyticsConfig.1.1.1
                            {
                                super(0);
                            }

                            public /* bridge */ /* synthetic */ Object invoke() {
                                m111invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m111invoke() {
                                configService3.receiveAnalyticsConfig();
                            }
                        });
                    }
                }, "Failed to get analytics configuration, using the default configuration");
            }
        });
    }

    public void receiveUserBackendIds() {
        final User activeUser = this.stateManager.getActiveUser();
        if (!this.backendIDsRequestInProcess) {
            final String applicationKey = this.stateManager.getActiveProject().getApplicationKey();
            final Identifiers identifiers = this.stateManager.getIdentifiers(activeUser);
            this.backendIDsRequestInProcess = true;
            QueueManager.Companion.runConfigQueue(new Function0<Unit>() { // from class: com.devtodev.analytics.internal.services.ConfigService.receiveUserBackendIds.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m112invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m112invoke() {
                    TimerTask timerTask = ConfigService.this.retryTimer;
                    if (timerTask != null) {
                        timerTask.cancel();
                    }
                    ConfigService.this.getBackendIdentifiers(1L, applicationKey, identifiers, activeUser.getIdKey());
                }
            });
            return;
        }
        Logger logger = Logger.INSTANCE;
        String userId = activeUser.getUserId();
        if (userId == null) {
            userId = BuildConfig.FLAVOR;
        }
        Logger.debug$default(logger, "Receiving operation for user backend identifiers [" + userId + "] has been canceled", (Throwable) null, 2, (Object) null);
    }

    public void setConfigUpdate(Function1<? super RemoteConfig, Unit> function1) {
        this.configUpdate = function1;
    }

    public void setOfferNoConnection(Function0<Unit> function0) {
        this.offerNoConnection = function0;
    }

    public void setOfferUpdate(Function2<? super List<InvolvedExperiment>, ? super SuitableExperiments, Unit> function2) {
        this.offerUpdate = function2;
    }

    public void setOfferUserChanged(Function1<? super Exception, Unit> function1) {
        this.offerUserChanged = function1;
    }

    public void setOnBackendUserDataUpdate(Function1<? super UserData, Unit> function1) {
        this.onBackendUserDataUpdate = function1;
    }

    public void setOnIdentifiersUpdate(Function1<? super Long, Unit> function1) {
        this.onIdentifiersUpdate = function1;
    }

    public void setOnSdkConfigUpdate(Function1<? super ConfigEntry, Unit> function1) {
        this.onSdkConfigUpdate = function1;
    }
}
