package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.crashlytics.android.BuildConfig;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.TimeSource;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ServiceProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020.H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", BuildConfig.FLAVOR, "CDN_CREATIVES_PORT", BuildConfig.FLAVOR, "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", BuildConfig.FLAVOR, "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GATEWAY_HTTP_CLIENT", "NAMED_GET_TOKEN_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", "initialize", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GATEWAY_HTTP_CLIENT = "gateway_http_client";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final IServicesRegistry serviceRegistry;

    private ServiceProvider() {
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new Function1<ServicesRegistry, Unit>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ServicesRegistry) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(final ServicesRegistry servicesRegistry) {
                Intrinsics.checkNotNullParameter(servicesRegistry, "$this$registry");
                final UnityAdsModule unityAdsModule = new UnityAdsModule();
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class)), LazyKt.lazy(new Function0<Context>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.1
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Context m1035invoke() {
                        return ClientProperties.getApplicationContext();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.mainDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.defaultDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.ioDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class)), LazyKt.lazy(new Function0<ISDKDispatchers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ISDKDispatchers m1191invoke() {
                        return unityAdsModule.sdkDispatchers();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKMetricsSender.class)), LazyKt.lazy(new Function0<SDKMetricsSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SDKMetricsSender m1202invoke() {
                        return unityAdsModule.sdkMetrics();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineScope invoke() {
                        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class)), ServiceFactoryKt.factoryOf(new Function0<Job>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final Job invoke() {
                        return unityAdsModule.publicApiJob((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1102invoke() {
                        return new AndroidLegacyConfigStoreDataSource((StorageManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StorageManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> m1113invoke() {
                        return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1124invoke() {
                        return unityAdsModule.privacyDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> m1135invoke() {
                        return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1147invoke() {
                        return unityAdsModule.privacyFsmDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.21
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> m1158invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1161invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.23
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> m1162invoke() {
                        return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DataMigration) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1163invoke() {
                        return unityAdsModule.glInfoDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.25
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> m1164invoke() {
                        return unityAdsModule.universalRequestDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.26
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> m1165invoke() {
                        return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.27
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ByteStringDataSource m1166invoke() {
                        return unityAdsModule.iapTransactionDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0<DataStore<WebviewConfigurationStore.WebViewConfigurationStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.28
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> m1167invoke() {
                        return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AsyncTokenStorage.class)), LazyKt.lazy(new Function0<AsyncTokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AsyncTokenStorage m1168invoke() {
                        return unityAdsModule.asyncTokenStorage((TokenStorage) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(VolumeChangeMonitor.class)), LazyKt.lazy(new Function0<VolumeChangeMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.30
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final VolumeChangeMonitor m1170invoke() {
                        return unityAdsModule.volumeChangeMonitor((VolumeChange) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(VolumeChange.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.31
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final JsonStorage m1171invoke() {
                        return unityAdsModule.publicJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.32
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final JsonStorage m1172invoke() {
                        return unityAdsModule.privateJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.33
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final JsonStorage m1173invoke() {
                        return unityAdsModule.memoryJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class)), LazyKt.lazy(new Function0<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.34
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final NativeConfigurationOuterClass.NativeConfiguration m1174invoke() {
                        return unityAdsModule.defaultNativeConfiguration();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MeasurementsService.class)), LazyKt.lazy(new Function0<MeasurementsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.35
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MeasurementsService m1175invoke() {
                        return unityAdsModule.measurementService((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TopicsService.class)), LazyKt.lazy(new Function0<TopicsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.36
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TopicsService m1176invoke() {
                        return unityAdsModule.topicsService((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CronetEngineBuilderFactory.class)), LazyKt.lazy(new Function0<CronetEngineBuilderFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.37
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CronetEngineBuilderFactory m1177invoke() {
                        return new CronetEngineBuilderFactory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClientProvider.class)), LazyKt.lazy(new Function0<HttpClientProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.38
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HttpClientProvider m1178invoke() {
                        return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CronetEngineBuilderFactory) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CronetEngineBuilderFactory.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanupDirectory.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClient.class)), LazyKt.lazy(new Function0<HttpClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.39
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* compiled from: ServiceProvider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name and collision with other inner class name */
                    static final class C00621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpClient>, Object> {
                        final /* synthetic */ ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00621(ServicesRegistry servicesRegistry, Continuation<? super C00621> continuation) {
                            super(2, continuation);
                            this.$this_registry = servicesRegistry;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00621(this.$this_registry, continuation);
                        }

                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpClient> continuation) {
                            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                obj = HttpClientProvider.DefaultImpls.invoke$default((HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClientProvider.class))), null, (Continuation) this, 1, null);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HttpClient m1179invoke() {
                        return (HttpClient) BuildersKt.runBlocking$default((CoroutineContext) null, new C00621(servicesRegistry, null), 1, (Object) null);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, Reflection.getOrCreateKotlinClass(HttpClient.class)), LazyKt.lazy(new Function0<HttpClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.40
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* compiled from: ServiceProvider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1", f = "ServiceProvider.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1, reason: invalid class name and collision with other inner class name */
                    static final class C00631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpClient>, Object> {
                        final /* synthetic */ ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00631(ServicesRegistry servicesRegistry, Continuation<? super C00631> continuation) {
                            super(2, continuation);
                            this.$this_registry = servicesRegistry;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00631(this.$this_registry, continuation);
                        }

                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpClient> continuation) {
                            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                obj = ((HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClientProvider.class)))).invoke(Boxing.boxBoolean(true), (Continuation) this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HttpClient m1181invoke() {
                        return (HttpClient) BuildersKt.runBlocking$default((CoroutineContext) null, new C00631(servicesRegistry, null), 1, (Object) null);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0<MediationTraitsMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.41
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MediationTraitsMetadataReader m1182invoke() {
                        return new MediationTraitsMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class)), LazyKt.lazy(new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.42
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AlternativeFlowReader m1183invoke() {
                        return new AlternativeFlowReader((ConfigurationReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigurationReader.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TcfDataSource.class)), LazyKt.lazy(new Function0<TcfDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.43
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TcfDataSource m1184invoke() {
                        return new AndroidTcfDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TcfRepository.class)), LazyKt.lazy(new Function0<TcfRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.44
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TcfRepository m1185invoke() {
                        return new AndroidTcfRepository((TcfDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TcfDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class)), LazyKt.lazy(new Function0<AndroidManifestIntPropertyReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.45
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidManifestIntPropertyReader m1186invoke() {
                        return new AndroidManifestIntPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidTestDataInfo.class)), LazyKt.lazy(new Function0<AndroidTestDataInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.46
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidTestDataInfo m1187invoke() {
                        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GameServerIdReader.class)), LazyKt.lazy(new Function0<GameServerIdReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.47
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GameServerIdReader m1188invoke() {
                        return new GameServerIdReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreDataSource.class)), LazyKt.lazy(new Function0<StoreDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.48
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StoreDataSource m1189invoke() {
                        return new AndroidStoreDataSource((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class)), LazyKt.lazy(new Function0<AnalyticsDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.49
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AnalyticsDataSource m1190invoke() {
                        return new AndroidAnalyticsDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class)), LazyKt.lazy(new Function0<DeveloperConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.50
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DeveloperConsentDataSource m1192invoke() {
                        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class)), LazyKt.lazy(new Function0<DynamicDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.51
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DynamicDeviceInfoDataSource m1193invoke() {
                        return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class)), LazyKt.lazy(new Function0<LegacyUserConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.52
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LegacyUserConsentDataSource m1194invoke() {
                        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LifecycleDataSource.class)), LazyKt.lazy(new Function0<LifecycleDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.53
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LifecycleDataSource m1195invoke() {
                        return new AndroidLifecycleDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.54
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CacheDataSource m1196invoke() {
                        return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CreateFile.class)), LazyKt.lazy(new Function0<CreateFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.55
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CreateFile m1197invoke() {
                        return new CommonCreateFile();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class)), LazyKt.lazy(new Function0<GetFileExtensionFromUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.56
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetFileExtensionFromUrl m1198invoke() {
                        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(RemoveUrlQuery.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(RemoveUrlQuery.class)), LazyKt.lazy(new Function0<RemoveUrlQuery>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.57
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final RemoveUrlQuery m1199invoke() {
                        return new AndroidRemoveUrlQuery();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationDataSource.class)), LazyKt.lazy(new Function0<MediationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.58
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MediationDataSource m1200invoke() {
                        return new AndroidMediationDataSource((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class)), LazyKt.lazy(new Function0<PrivacyDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.59
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final PrivacyDeviceInfoDataSource m1201invoke() {
                        return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (FIdDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FIdDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.60
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CacheDataSource m1203invoke() {
                        return new AndroidRemoteCacheDataSource((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))), (HttpClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class)), LazyKt.lazy(new Function0<StaticDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.61
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StaticDeviceInfoDataSource m1204invoke() {
                        return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (AnalyticsDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class))), (StoreDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class)), LazyKt.lazy(new Function0<DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.62
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> m1205invoke() {
                        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class)), LazyKt.lazy(new Function0<UniversalRequestDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.63
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final UniversalRequestDataSource m1206invoke() {
                        return new UniversalRequestDataSource((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class)), LazyKt.lazy(new Function0<WebviewConfigurationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.64
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final WebviewConfigurationDataSource m1207invoke() {
                        return new WebviewConfigurationDataSource((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OmidManager.class)), LazyKt.lazy(new Function0<OmidManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.65
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OmidManager m1208invoke() {
                        return new AndroidOmidManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class)), LazyKt.lazy(new Function0<SDKPropertiesManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.66
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SDKPropertiesManager m1209invoke() {
                        return new AndroidSDKPropertiesManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StorageManager.class)), LazyKt.lazy(new Function0<StorageManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.67
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StorageManager m1210invoke() {
                        return new AndroidStorageManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventManager.class)), LazyKt.lazy(new Function0<TransactionEventManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.68
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TransactionEventManager m1211invoke() {
                        return new TransactionEventManager((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (StoreMonitor) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreMonitor.class))), (GetTransactionData) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetTransactionData.class))), (GetTransactionRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetTransactionRequest.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class)), LazyKt.lazy(new Function0<AdRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.69
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AdRepository m1212invoke() {
                        return new AndroidAdRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class)), LazyKt.lazy(new Function0<CacheRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.70
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CacheRepository m1214invoke() {
                        return new AndroidCacheRepository((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetCacheDirectory) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetCacheDirectory.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanupDirectory.class))), (DownloadPriorityQueue) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DownloadPriorityQueue.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CreateFile.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetCacheDirectory.class)), LazyKt.lazy(new Function0<GetCacheDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.71
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetCacheDirectory m1215invoke() {
                        return new CommonGetCacheDirectory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class)), LazyKt.lazy(new Function0<CampaignRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.72
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CampaignRepository m1216invoke() {
                        return new AndroidCampaignRepository((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class)), LazyKt.lazy(new Function0<DeveloperConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.73
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DeveloperConsentRepository m1217invoke() {
                        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)), LazyKt.lazy(new Function0<DeviceInfoRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.74
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DeviceInfoRepository m1218invoke() {
                        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class)), LazyKt.lazy(new Function0<DiagnosticEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.75
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DiagnosticEventRepository m1219invoke() {
                        return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CoroutineTimer.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class)), LazyKt.lazy(new Function0<LegacyUserConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.76
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LegacyUserConsentRepository m1220invoke() {
                        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationRepository.class)), LazyKt.lazy(new Function0<MediationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.77
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MediationRepository m1221invoke() {
                        return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class)), LazyKt.lazy(new Function0<OpenMeasurementRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.78
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OpenMeasurementRepository m1222invoke() {
                        return new AndroidOpenMeasurementRepository((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OmidManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class)), LazyKt.lazy(new Function0<SessionRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.79
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SessionRepository m1223invoke() {
                        return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventRepository.class)), LazyKt.lazy(new Function0<TransactionEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.80
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TransactionEventRepository m1225invoke() {
                        return new AndroidTransactionEventRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OperativeEventRepository.class)), LazyKt.lazy(new Function0<OperativeEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.81
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OperativeEventRepository m1226invoke() {
                        return new OperativeEventRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)), LazyKt.lazy(new Function0<ExecuteAdViewerRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.82
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ExecuteAdViewerRequest m1227invoke() {
                        return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (HttpClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClient.class))), (GetCachedAsset) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetCachedAsset.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetByteStringId.class)), LazyKt.lazy(new Function0<GetByteStringId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.83
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetByteStringId m1228invoke() {
                        return new AndroidGenerateByteStringId();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleOpenUrl.class)), LazyKt.lazy(new Function0<HandleOpenUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.84
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleOpenUrl m1229invoke() {
                        return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Refresh.class)), LazyKt.lazy(new Function0<Refresh>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.85
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Refresh m1230invoke() {
                        return new AndroidRefresh((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class)), LazyKt.lazy(new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.86
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SendDiagnosticEvent m1231invoke() {
                        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class)), LazyKt.lazy(new Function0<SendWebViewClientErrorDiagnostics>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.87
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SendWebViewClientErrorDiagnostics m1232invoke() {
                        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Show.class)), LazyKt.lazy(new Function0<Show>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.88
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Show m1233invoke() {
                        return new AndroidShow((AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (GameServerIdReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GameServerIdReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheFile.class)), LazyKt.lazy(new Function0<CacheFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.89
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CacheFile m1234invoke() {
                        return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanAssets.class)), LazyKt.lazy(new Function0<CleanAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.90
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CleanAssets m1236invoke() {
                        return new CommonCleanAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdObject.class)), LazyKt.lazy(new Function0<GetAdObject>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.91
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAdObject m1237invoke() {
                        return new CommonGetAdObject((AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<GetHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.92
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetHeaderBiddingToken m1238invoke() {
                        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FetchSignalsAndSendUseCase.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<BuildHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.93
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BuildHeaderBiddingToken m1239invoke() {
                        return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (GetInitializationData) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationData.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TcfRepository.class))), (AndroidTestDataInfo) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidTestDataInfo.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.94
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TokenNumberProvider m1240invoke() {
                        return new CommonTokenNumberProvider((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationData.class)), LazyKt.lazy(new Function0<GetInitializationData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.95
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetInitializationData m1241invoke() {
                        return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0<MediationInitBlobMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.96
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MediationInitBlobMetadataReader m1242invoke() {
                        return new MediationInitBlobMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class)), LazyKt.lazy(new Function0<GetInitializationRequestPayload>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.97
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetInitializationRequestPayload m1243invoke() {
                        return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (LegacyUserConsentRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationState.class)), LazyKt.lazy(new Function0<GetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.98
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetInitializationState m1244invoke() {
                        return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetIsFileCache.class)), LazyKt.lazy(new Function0<GetIsFileCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.99
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetIsFileCache m1245invoke() {
                        return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SetInitializationState.class)), LazyKt.lazy(new Function0<SetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.100
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SetInitializationState m1037invoke() {
                        return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.101
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetRequestPolicy m1038invoke() {
                        return new AndroidGetAdRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class)), LazyKt.lazy(new Function0<GetAdDataRefreshRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.102
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAdDataRefreshRequest m1039invoke() {
                        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class)), LazyKt.lazy(new Function0<GetAdPlayerConfigRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.103
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAdPlayerConfigRequest m1040invoke() {
                        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), LazyKt.lazy(new Function0<AndroidGetAdPlayerContext>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.104
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidGetAdPlayerContext m1041invoke() {
                        return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdRequest.class)), LazyKt.lazy(new Function0<GetAdRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.105
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAdRequest m1042invoke() {
                        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TcfRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetHbTokenEventRequest.class)), LazyKt.lazy(new Function0<GetHbTokenEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.106
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetHbTokenEventRequest m1043invoke() {
                        return new GetAndroidTokenEventRequest();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CommonScarEventReceiver.class)), LazyKt.lazy(new Function0<CommonScarEventReceiver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.107
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CommonScarEventReceiver m1044invoke() {
                        return new CommonScarEventReceiver((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GMAScarAdapterBridge.class)), LazyKt.lazy(new Function0<GMAScarAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.108
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GMAScarAdapterBridge m1045invoke() {
                        GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CommonScarEventReceiver.class))))).getBridge();
                        Intrinsics.checkNotNullExpressionValue(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return bridge;
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarTimeHackFixer.class)), LazyKt.lazy(new Function0<ScarTimeHackFixer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.109
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ScarTimeHackFixer m1046invoke() {
                        return new ScarTimeHackFixer((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarManager.class)), LazyKt.lazy(new Function0<ScarManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.110
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ScarManager m1048invoke() {
                        return new AndroidScarManager((CommonScarEventReceiver) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarTimeHackFixer.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FetchSignalsAndSendUseCase.class)), LazyKt.lazy(new Function0<FetchSignalsAndSendUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.111
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FetchSignalsAndSendUseCase m1049invoke() {
                        return new AndroidFetchSignalsAndSendUseCase((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarManager.class))), (HandleGetTokenRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGetTokenRequest.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LoadScarAd.class)), LazyKt.lazy(new Function0<LoadScarAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.112
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LoadScarAd m1050invoke() {
                        return new LoadScarAd((ScarManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGetTokenRequest.class)), LazyKt.lazy(new Function0<HandleGetTokenRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.113
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleGetTokenRequest m1051invoke() {
                        return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetHbTokenEventRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetClientInfo.class)), LazyKt.lazy(new Function0<GetClientInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.114
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetClientInfo m1052invoke() {
                        return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationRepository.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OmidManager.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class))), (FIdExistenceDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FIdExistenceDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class)), LazyKt.lazy(new Function0<GetInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.115
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetInitializationCompletedRequest m1053invoke() {
                        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationRequest.class)), LazyKt.lazy(new Function0<GetInitializationRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.116
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetInitializationRequest m1054invoke() {
                        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class)), LazyKt.lazy(new Function0<GetLimitedSessionToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.117
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetLimitedSessionToken m1055invoke() {
                        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(MediationRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class)), LazyKt.lazy(new Function0<GetOpenGLRendererInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.118
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetOpenGLRendererInfo m1056invoke() {
                        return new AndroidGetOpenGLRendererInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class)), LazyKt.lazy(new Function0<GetSharedDataTimestamps>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.119
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetSharedDataTimestamps m1057invoke() {
                        return new AndroidGetSharedDataTimestamps();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class)), LazyKt.lazy(new Function0<GetUniversalRequestForPayLoad>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.120
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetUniversalRequestForPayLoad m1059invoke() {
                        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class)), LazyKt.lazy(new Function0<GetUniversalRequestSharedData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.121
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetUniversalRequestSharedData m1060invoke() {
                        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (DeveloperConsentRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetCachedAsset.class)), LazyKt.lazy(new Function0<GetCachedAsset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.122
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetCachedAsset m1061invoke() {
                        return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class)), LazyKt.lazy(new Function0<GetWebViewBridgeUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.123
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetWebViewBridgeUseCase m1062invoke() {
                        return new CommonGetWebViewBridgeUseCase((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.124
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetRequestPolicy m1063invoke() {
                        return new GetInitRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class)), LazyKt.lazy(new Function0<GetLatestWebViewConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.125
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetLatestWebViewConfiguration m1064invoke() {
                        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.126
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetRequestPolicy m1065invoke() {
                        return new GetOperativeEventRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.127
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetRequestPolicy m1066invoke() {
                        return new GetOtherRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0<GetPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.128
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetPrivacyUpdateRequest m1067invoke() {
                        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class)), LazyKt.lazy(new Function0<HandleGatewayInitializationResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.129
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleGatewayInitializationResponse m1068invoke() {
                        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class)), LazyKt.lazy(new Function0<HandleGatewayUniversalResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.130
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleGatewayUniversalResponse m1070invoke() {
                        return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeBoldSDK.class)), LazyKt.lazy(new Function0<InitializeBoldSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.131
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeBoldSDK m1071invoke() {
                        return new AndroidInitializeBoldSDK((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (InitializeOMSDK) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeOMSDK.class))), (GetInitializationRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (CleanAssets) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanAssets.class))), (HandleGatewayInitializationResponse) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (EventObservers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(EventObservers.class))), (TriggerInitializeListener) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (StorageManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StorageManager.class))), (ConfigurationReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigurationReader.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetGameId.class))), (AndroidHandleFocusCounters) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidHandleFocusCounters.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<LegacyShowUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.132
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LegacyShowUseCase m1072invoke() {
                        return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Show.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0<SendPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.133
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SendPrivacyUpdateRequest m1073invoke() {
                        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class)), LazyKt.lazy(new Function0<TriggerInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.134
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TriggerInitializationCompletedRequest m1074invoke() {
                        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class)), LazyKt.lazy(new Function0<TriggerInitializeListener>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.135
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TriggerInitializeListener m1075invoke() {
                        return new TriggerInitializeListener((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class)), LazyKt.lazy(new Function0<DiagnosticEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.136
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DiagnosticEventObserver m1076invoke() {
                        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(BackgroundWorker.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(EventObservers.class)), LazyKt.lazy(new Function0<EventObservers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.137
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final EventObservers m1077invoke() {
                        return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OperativeEventObserver.class))), (DiagnosticEventObserver) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class))), (TransactionEventObserver) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventObserver.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetTransactionData.class)), LazyKt.lazy(new Function0<GetTransactionData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.138
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetTransactionData m1078invoke() {
                        return new AndroidGetTransactionData((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetByteStringId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetTransactionRequest.class)), LazyKt.lazy(new Function0<GetTransactionRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.139
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetTransactionRequest m1079invoke() {
                        return new CommonGetTransactionRequest((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class)), LazyKt.lazy(new Function0<GetDiagnosticEventBatchRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.140
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetDiagnosticEventBatchRequest m1081invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class)), LazyKt.lazy(new Function0<GetDiagnosticEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.141
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetDiagnosticEventRequest m1082invoke() {
                        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class)), LazyKt.lazy(new Function0<GetOperativeEventApi>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.142
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetOperativeEventApi m1083invoke() {
                        return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (GetOperativeEventRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class)), LazyKt.lazy(new Function0<GetOperativeEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.143
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetOperativeEventRequest m1084invoke() {
                        return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class)), LazyKt.lazy(new Function0<HandleGatewayEventResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.144
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleGatewayEventResponse m1085invoke() {
                        return new AndroidHandleGatewayEventResponse();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OperativeEventObserver.class)), LazyKt.lazy(new Function0<OperativeEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.145
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OperativeEventObserver m1086invoke() {
                        return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(BackgroundWorker.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventObserver.class)), LazyKt.lazy(new Function0<TransactionEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.146
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TransactionEventObserver m1087invoke() {
                        return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class)), LazyKt.lazy(new Function0<UniversalRequestTtlValidator>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.147
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final UniversalRequestTtlValidator m1088invoke() {
                        return new CommonUniversalRequestTtlValidator();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class)), LazyKt.lazy(new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.148
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final UniversalRequestEventSender m1089invoke() {
                        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OmFinishSession.class)), LazyKt.lazy(new Function0<OmFinishSession>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.149
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OmFinishSession m1090invoke() {
                        return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class)), LazyKt.lazy(new Function0<OmImpressionOccurred>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.150
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OmImpressionOccurred m1092invoke() {
                        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class)), LazyKt.lazy(new Function0<AndroidOmInteraction>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.151
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidOmInteraction m1093invoke() {
                        return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOmData.class)), LazyKt.lazy(new Function0<GetOmData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.152
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetOmData m1094invoke() {
                        return new CommonGetOmData((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(IsOMActivated.class)), LazyKt.lazy(new Function0<IsOMActivated>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.153
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final IsOMActivated m1095invoke() {
                        return new CommonIsOMActivated((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeOMSDK.class)), LazyKt.lazy(new Function0<InitializeOMSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.154
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeOMSDK m1096invoke() {
                        return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.155
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FlattenerRulesUseCase m1097invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.156
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FlattenerRulesUseCase m1098invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(BackgroundWorker.class)), LazyKt.lazy(new Function0<BackgroundWorker>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.157
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BackgroundWorker m1099invoke() {
                        return new BackgroundWorker((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class)), LazyKt.lazy(new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.158
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DiagnosticEventRequestWorkModifier m1100invoke() {
                        return new DiagnosticEventRequestWorkModifier((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class)), LazyKt.lazy(new Function0<GatewayClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.159
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GatewayClient m1101invoke() {
                        return new CommonGatewayClient((HttpClient) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, Reflection.getOrCreateKotlinClass(HttpClient.class))), (HandleGatewayUniversalResponse) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class)), LazyKt.lazy(new Function0<CoroutineExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.160
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public final CoroutineExceptionHandler invoke() {
                        return new SDKErrorHandler((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TokenStorage.class)), LazyKt.lazy(new Function0<TokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.161
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TokenStorage m1104invoke() {
                        return new InMemoryTokenStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(VolumeChange.class)), LazyKt.lazy(new Function0<VolumeChange>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.162
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final VolumeChange m1105invoke() {
                        return new VolumeChangeContentObserver();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class)), LazyKt.lazy(new Function0<ConfigFileFromLocalStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.163
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ConfigFileFromLocalStorage m1106invoke() {
                        return new ConfigFileFromLocalStorage((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeSDK.class)), LazyKt.lazy(new Function0<InitializeSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.164
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeSDK m1107invoke() {
                        return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (InitializeStateReset) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateReset.class))), (InitializeStateError) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateError.class))), (InitializeStateConfig) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateConfig.class))), (InitializeStateCreate) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateCreate.class))), (InitializeStateLoadCache) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class))), (InitializeStateComplete) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateComplete.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateComplete.class)), LazyKt.lazy(new Function0<InitializeStateComplete>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.165
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateComplete m1108invoke() {
                        return new InitializeStateComplete((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateConfig.class)), LazyKt.lazy(new Function0<InitializeStateConfig>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.166
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateConfig m1109invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class)), LazyKt.lazy(new Function0<InitializeStateConfigWithLoader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.167
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateConfigWithLoader m1110invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (TokenStorage) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateCreate.class)), LazyKt.lazy(new Function0<InitializeStateCreate>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.168
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateCreate m1111invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateError.class)), LazyKt.lazy(new Function0<InitializeStateError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.169
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateError m1112invoke() {
                        return new InitializeStateError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class)), LazyKt.lazy(new Function0<InitializeStateLoadCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.170
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateLoadCache m1114invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class)), LazyKt.lazy(new Function0<InitializeStateLoadWeb>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.171
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateLoadWeb m1115invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (HttpClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HttpClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateReset.class)), LazyKt.lazy(new Function0<InitializeStateReset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.172
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateReset m1116invoke() {
                        return new InitializeStateReset((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreMonitor.class)), LazyKt.lazy(new Function0<StoreMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.173
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StoreMonitor m1117invoke() {
                        return new StoreMonitor((StoreExceptionHandler) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class)), LazyKt.lazy(new Function0<StoreWebViewEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.174
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StoreWebViewEventSender m1118invoke() {
                        return new StoreWebViewEventSender((IEventSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(IEventSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class)), LazyKt.lazy(new Function0<StoreExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.175
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StoreExceptionHandler m1119invoke() {
                        return new GatewayStoreExceptionHandler();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreEventListenerFactory.class)), LazyKt.lazy(new Function0<StoreEventListenerFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.176
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final StoreEventListenerFactory m1120invoke() {
                        return new StoreEventListenerFactory((StoreWebViewEventSender) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(StoreWebViewEventSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ConfigurationReader.class)), LazyKt.lazy(new Function0<ConfigurationReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.177
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ConfigurationReader m1121invoke() {
                        return new ConfigurationReader();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), LazyKt.lazy(new Function0<AndroidAttribution>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.178
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidAttribution m1122invoke() {
                        return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new Function0<AdPlayerScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.179
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AdPlayerScope m1123invoke() {
                        return new AdPlayerScope((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new Function0<AndroidWebViewClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.180
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidWebViewClient m1125invoke() {
                        return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetCachedAsset.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<AndroidGetWebViewContainerUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.181
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidGetWebViewContainerUseCase m1126invoke() {
                        return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))), (AndroidWebViewClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Load.class)), ServiceFactoryKt.factoryOf(new Function0<Load>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.182
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Load m1127invoke() {
                        return new AndroidLoad((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdRequest.class))), (GetAdPlayerConfigRequest) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GatewayClient.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new Function0<AwaitInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.183
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AwaitInitialization m1128invoke() {
                        return new CommonAwaitInitialization((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.184
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAsyncHeaderBiddingToken m1129invoke() {
                        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new Function0<GetAdPlayer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.185
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetAdPlayer m1130invoke() {
                        return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdPlayerScope.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class)), LazyKt.lazy(new Function0<CacheWebViewAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.186
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CacheWebViewAssets m1131invoke() {
                        return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new Function0<HandleGatewayAdResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.187
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleGatewayAdResponse m1132invoke() {
                        return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (AndroidGetWebViewContainerUseCase) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class))), (AdPlayerScope) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdPlayerScope.class))), (GetAdPlayer) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetAdPlayer.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new Function0<HandleInvocationsFromAdViewer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.188
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final HandleInvocationsFromAdViewer m1133invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<LegacyLoadUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.189
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LegacyLoadUseCase m1134invoke() {
                        return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Load.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AdRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class)), LazyKt.lazy(new Function0<SafeCallbackInvoke>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.190
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SafeCallbackInvoke m1136invoke() {
                        return new CommonSafeCallbackInvoke((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new Function0<InitializeStateNetworkError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.191
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InitializeStateNetworkError m1137invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineTimer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.192
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CoroutineTimer m1138invoke() {
                        return new CommonCoroutineTimer((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(IEventSender.class)), LazyKt.lazy(new Function0<IEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.193
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final IEventSender m1139invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SetGameId.class)), LazyKt.lazy(new Function0<SetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.194
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SetGameId m1140invoke() {
                        return new CommonSetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetGameId.class)), LazyKt.lazy(new Function0<GetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.195
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetGameId m1141invoke() {
                        return new CommonGetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ValidateGameId.class)), LazyKt.lazy(new Function0<ValidateGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.196
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ValidateGameId m1142invoke() {
                        return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetGameId.class))), (SetGameId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SetGameId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ShouldAllowInitialization.class)), LazyKt.lazy(new Function0<ShouldAllowInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.197
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ShouldAllowInitialization m1143invoke() {
                        return new CommonShouldAllowInitialization((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (SetInitializationState) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SetInitializationState.class))), (ValidateGameId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(ValidateGameId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class)), LazyKt.lazy(new Function0<CheckForGameIdAndTestModeChanges>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.198
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CheckForGameIdAndTestModeChanges m1144invoke() {
                        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetGameId.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(DownloadPriorityQueue.class)), LazyKt.lazy(new Function0<DownloadPriorityQueue>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.199
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final DownloadPriorityQueue m1145invoke() {
                        return new DownloadPriorityQueue();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanupDirectory.class)), LazyKt.lazy(new Function0<CleanupDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.200
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CleanupDirectory m1148invoke() {
                        return new CleanupDirectory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FocusRepository.class)), LazyKt.lazy(new Function0<FocusRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.201
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FocusRepository m1149invoke() {
                        return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetIsAdActivity.class)), LazyKt.lazy(new Function0<AndroidGetIsAdActivity>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.202
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidGetIsAdActivity m1150invoke() {
                        return new AndroidGetIsAdActivity((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class)), LazyKt.lazy(new Function0<AndroidGetLifecycleFlow>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.203
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidGetLifecycleFlow m1151invoke() {
                        return new AndroidGetLifecycleFlow((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidHandleFocusCounters.class)), LazyKt.lazy(new Function0<AndroidHandleFocusCounters>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.204
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AndroidHandleFocusCounters m1152invoke() {
                        return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(SessionRepository.class))), (FocusRepository) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FocusRepository.class))), (AndroidGetIsAdActivity) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(AndroidGetIsAdActivity.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (TimeSource.WithComparableMarks) null, 16, (DefaultConstructorMarker) null);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallAdapterBridge.class)), LazyKt.lazy(new Function0<OfferwallAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.205
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OfferwallAdapterBridge m1153invoke() {
                        return new OfferwallAdapterBridge((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class)), LazyKt.lazy(new Function0<OfferwallManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.206
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final OfferwallManager m1154invoke() {
                        return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallAdapterBridge.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(LoadOfferwallAd.class)), LazyKt.lazy(new Function0<LoadOfferwallAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.207
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final LoadOfferwallAd m1155invoke() {
                        return new LoadOfferwallAd((OfferwallManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)), LazyKt.lazy(new Function0<GetIsOfferwallAdReady>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.208
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GetIsOfferwallAdReady m1156invoke() {
                        return new GetIsOfferwallAdReady((OfferwallManager) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FIdDataSource.class)), LazyKt.lazy(new Function0<FIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.209
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FIdDataSource m1157invoke() {
                        return new AndroidFIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(FIdExistenceDataSource.class)), LazyKt.lazy(new Function0<FIdExistenceDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.210
                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final FIdExistenceDataSource m1159invoke() {
                        return new AndroidFIdExistenceDataSource("com.google.firebase.analytics.FirebaseAnalytics");
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(BuildConfig.FLAVOR, Reflection.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class)), LazyKt.lazy(new Function0<CleanUpWhenOpportunityExpires>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.211
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CleanUpWhenOpportunityExpires m1160invoke() {
                        return new CleanUpWhenOpportunityExpires((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
                    }
                }));
            }
        });
    }
}
