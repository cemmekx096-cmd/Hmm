package com.sfbx.appconsent.core.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.exception.ACException;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.HttpStatusCodeKt;
import io.ktor.http.content.ByteArrayContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt;

/* compiled from: AppConsentService.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0086@ø\u0001\u0000¢\u0006\u0002\u00104JJ\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000608H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0012\u0010A\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0012\u0010D\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\f\u0010E\u001a\u00020\u001c*\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lcom/sfbx/appconsent/core/api/AppConsentService;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "assetsEndpointUrl", BuildConfig.FLAVOR, "client", "Lio/ktor/client/HttpClient;", "getClient$appconsent_core_prodPremiumRelease$annotations", "()V", "getClient$appconsent_core_prodPremiumRelease", "()Lio/ktor/client/HttpClient;", "setClient$appconsent_core_prodPremiumRelease", "(Lio/ktor/client/HttpClient;)V", "endpointUrl", "buildRequest", BuildConfig.FLAVOR, "httpRequestBuilder", "Lio/ktor/client/request/HttpRequestBuilder;", "bodeAsByteArray", BuildConfig.FLAVOR, "getVendorExpiration", "Lac/Api$TranslateVendorCookieRetentionReply;", AdActivity.REQUEST_KEY_EXTRA, "Lac/Api$TranslateVendorCookieRetentionRequest;", "(Lac/Api$TranslateVendorCookieRetentionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postContentAsByteArrayTo", "Lio/ktor/client/statement/HttpResponse;", "httpClient", "url", "content", "(Lio/ktor/client/HttpClient;Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveExternalIds", "Lac/Api$SaveExternalReply;", "saveExternalRequest", "Lac/Api$SaveExternalRequest;", "(Lac/Api$SaveExternalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFloatingPurposes", "Lac/Api$SaveFloatingExtraPurposeReply;", "saveFloatingRequest", "Lac/Api$SaveFloatingExtraPurposeRequest;", "(Lac/Api$SaveFloatingExtraPurposeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sayHello", "Lac/Api$HelloReply;", "helloRequest", "Lac/Api$HelloRequest;", "(Lac/Api$HelloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendConsents", "Lac/Api$SaveReply;", "saveRequest", "Lac/Api$SaveRequest;", "(Lac/Api$SaveRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDisplayMetric", "Lkotlin/Result;", "attributes", BuildConfig.FLAVOR, "header", "sendDisplayMetric-0E7RQCE", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ship", "Lac/Xchange$ShipReply;", "shipRequest", "Lac/Xchange$ShipRequest;", "(Lac/Xchange$ShipRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryToExtractAssetsEndpoint", "metaData", "Landroid/os/Bundle;", "tryToExtractEndpoint", "manageError", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AppConsentService {
    private static final String AC_ASSETS_ENDPOINT = "com.sfbx.appconsent.AC_ASSETS_ENDPOINT";
    private static final String AC_ASSETS_ENDPOINT_PATH = "/tcf2-clear/illustrations/v1.1.0/";
    private static final String AC_ENDPOINT = "com.sfbx.appconsent.AC_ENDPOINT";
    private static final String HELLO_PATH = "/hello";
    private static final String METRIC_DISPLAY_PATH = "/t2.gif";
    private static final String SAVE_EXTERNAL_IDS_PATH = "/save-external";
    private static final String SAVE_FLOATING_PATH = "/save-floating-ep";
    private static final String SAVE_PATH = "/save";
    private static final String SHIP_PATH = "/ship2";
    private static final String URL = "{URL}";
    private static final String VENDOR_EXPIRATION_PATH = "/translate-cookie-retention";
    private String assetsEndpointUrl;
    private HttpClient client;
    private String endpointUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String METRIC_DISPLAY_URL = "{URL}/t2.gif";
    private static String HELLO_URL = "{URL}/hello";
    private static String SAVE_URL = "{URL}/save";
    private static String SAVE_FLOATING_URL = "{URL}/save-floating-ep";
    private static String SHIP_URL = "{URL}/ship2";
    private static String SAVE_EXTERNAL_IDS_URL = "{URL}/save-external";
    private static String VENDOR_EXPIRATION_URL = "{URL}/translate-cookie-retention";
    private static String ILLUSTRATION_BASE_URL = BuildConfig.FLAVOR;

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {198, 199}, m = "getVendorExpiration", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.getVendorExpiration(null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {0}, l = {224}, m = "postContentAsByteArrayTo", n = {"this"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1, reason: invalid class name and case insensitive filesystem */
    static final class C00811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00811(Continuation<? super C00811> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.postContentAsByteArrayTo(null, null, null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {192, 194}, m = "saveExternalIds", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1, reason: invalid class name and case insensitive filesystem */
    static final class C00821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00821(Continuation<? super C00821> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.saveExternalIds(null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {182, 183}, m = "saveFloatingPurposes", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1, reason: invalid class name and case insensitive filesystem */
    static final class C00831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00831(Continuation<? super C00831> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.saveFloatingPurposes(null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {169, 170}, m = "sayHello", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$sayHello$1, reason: invalid class name and case insensitive filesystem */
    static final class C00841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00841(Continuation<? super C00841> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.sayHello(null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {176, 177}, m = "sendConsents", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1, reason: invalid class name and case insensitive filesystem */
    static final class C00851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00851(Continuation<? super C00851> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.sendConsents(null, (Continuation) this);
        }
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {}, l = {187, 188}, m = "ship", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.api.AppConsentService$ship$1, reason: invalid class name and case insensitive filesystem */
    static final class C00861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C00861(Continuation<? super C00861> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
            return AppConsentService.this.ship(null, (Continuation) this);
        }
    }

    public static /* synthetic */ void getClient$appconsent_core_prodPremiumRelease$annotations() {
    }

    public AppConsentService(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        this.client = AppConsentServiceFactory.INSTANCE.createClient(context);
        this.endpointUrl = "https://collector.appconsent.io";
        this.assetsEndpointUrl = "https://cdn.appconsent.io/tcf2-clear/illustrations/v1.1.0/";
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
        Bundle bundle = applicationInfo.metaData;
        tryToExtractEndpoint(bundle);
        tryToExtractAssetsEndpoint(bundle);
    }

    /* compiled from: AppConsentService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/sfbx/appconsent/core/api/AppConsentService$Companion;", BuildConfig.FLAVOR, "()V", "AC_ASSETS_ENDPOINT", BuildConfig.FLAVOR, "AC_ASSETS_ENDPOINT_PATH", "AC_ENDPOINT", "HELLO_PATH", "HELLO_URL", "ILLUSTRATION_BASE_URL", "METRIC_DISPLAY_PATH", "METRIC_DISPLAY_URL", "SAVE_EXTERNAL_IDS_PATH", "SAVE_EXTERNAL_IDS_URL", "SAVE_FLOATING_PATH", "SAVE_FLOATING_URL", "SAVE_PATH", "SAVE_URL", "SHIP_PATH", "SHIP_URL", "URL", "VENDOR_EXPIRATION_PATH", "VENDOR_EXPIRATION_URL", "provideIllustrationBaseUrl", "updateURLs", BuildConfig.FLAVOR, "newUrl", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String provideIllustrationBaseUrl() {
            String str = AppConsentService.ILLUSTRATION_BASE_URL;
            if (!(str.length() > 0)) {
                str = null;
            }
            return str == null ? "https://cdn.appconsent.io/tcf2-clear/illustrations/v1.1.0/" : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateURLs(String newUrl) {
            AppConsentService.METRIC_DISPLAY_URL = StringsKt.replace$default(AppConsentService.METRIC_DISPLAY_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.HELLO_URL = StringsKt.replace$default(AppConsentService.HELLO_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.SAVE_URL = StringsKt.replace$default(AppConsentService.SAVE_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.SAVE_FLOATING_URL = StringsKt.replace$default(AppConsentService.SAVE_FLOATING_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.SHIP_URL = StringsKt.replace$default(AppConsentService.SHIP_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.SAVE_EXTERNAL_IDS_URL = StringsKt.replace$default(AppConsentService.SAVE_EXTERNAL_IDS_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
            AppConsentService.VENDOR_EXPIRATION_URL = StringsKt.replace$default(AppConsentService.VENDOR_EXPIRATION_URL, AppConsentService.URL, newUrl, false, 4, (Object) null);
        }
    }

    /* renamed from: getClient$appconsent_core_prodPremiumRelease, reason: from getter */
    public final HttpClient getClient() {
        return this.client;
    }

    public final void setClient$appconsent_core_prodPremiumRelease(HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "<set-?>");
        this.client = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void tryToExtractAssetsEndpoint(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "https://cdn.appconsent.io/tcf2-clear/illustrations/v1.1.0/"
            r2 = 0
            if (r6 == 0) goto L25
            java.lang.String r3 = "com.sfbx.appconsent.AC_ASSETS_ENDPOINT"
            boolean r4 = r6.containsKey(r3)
            if (r4 == 0) goto L25
            java.lang.String r6 = r6.getString(r3)
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L20
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)
            if (r3 == 0) goto L1e
            goto L20
        L1e:
            r3 = r2
            goto L21
        L20:
            r3 = r0
        L21:
            if (r3 != 0) goto L25
            r1 = r6
            goto L26
        L25:
            r0 = r2
        L26:
            r5.assetsEndpointUrl = r1
            if (r0 == 0) goto L41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.assetsEndpointUrl
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "/tcf2-clear/illustrations/v1.1.0/"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.assetsEndpointUrl = r6
        L41:
            java.lang.String r6 = r5.assetsEndpointUrl
            com.sfbx.appconsent.core.api.AppConsentService.ILLUSTRATION_BASE_URL = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.tryToExtractAssetsEndpoint(android.os.Bundle):void");
    }

    private final void tryToExtractEndpoint(Bundle metaData) {
        String str = "https://collector.appconsent.io";
        if (metaData != null && metaData.containsKey(AC_ENDPOINT)) {
            String string = metaData.getString(AC_ENDPOINT);
            String str2 = string;
            if (!(!(str2 == null || StringsKt.isBlank(str2)))) {
                string = null;
            }
            if (string != null) {
                str = string;
            }
        }
        this.endpointUrl = str;
        INSTANCE.updateURLs(str);
    }

    private final void buildRequest(HttpRequestBuilder httpRequestBuilder, byte[] bodeAsByteArray) {
        UtilsKt.accept((HttpMessageBuilder) httpRequestBuilder, ContentType.Application.INSTANCE.getProtoBuf());
        ByteArrayContent byteArrayContent = new ByteArrayContent(bodeAsByteArray, ContentType.Application.INSTANCE.getProtoBuf(), (HttpStatusCode) null, 4, (DefaultConstructorMarker) null);
        if (byteArrayContent instanceof OutgoingContent) {
            httpRequestBuilder.setBody(byteArrayContent);
            httpRequestBuilder.setBodyType((TypeInfo) null);
        } else {
            httpRequestBuilder.setBody(byteArrayContent);
            KType kTypeTypeOf = Reflection.typeOf(ByteArrayContent.class);
            httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(ByteArrayContent.class), kTypeTypeOf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sfbx.appconsent.core.exception.ACException$ACCertificationPathValidatorException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sfbx.appconsent.core.exception.ACException$ACUnknownException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postContentAsByteArrayTo(io.ktor.client.HttpClient r5, java.lang.String r6, byte[] r7, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00811
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$postContentAsByteArrayTo$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            com.sfbx.appconsent.core.api.AppConsentService r5 = (com.sfbx.appconsent.core.api.AppConsentService) r5
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L64
            goto L5e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.request.HttpRequestBuilder r8 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.lang.Throwable -> L64
            r8.<init>()     // Catch: java.lang.Throwable -> L64
            io.ktor.client.request.HttpRequestKt.url(r8, r6)     // Catch: java.lang.Throwable -> L64
            r4.buildRequest(r8, r7)     // Catch: java.lang.Throwable -> L64
            io.ktor.http.HttpMethod$Companion r6 = io.ktor.http.HttpMethod.Companion     // Catch: java.lang.Throwable -> L64
            io.ktor.http.HttpMethod r6 = r6.getPost()     // Catch: java.lang.Throwable -> L64
            r8.setMethod(r6)     // Catch: java.lang.Throwable -> L64
            io.ktor.client.statement.HttpStatement r6 = new io.ktor.client.statement.HttpStatement     // Catch: java.lang.Throwable -> L64
            r6.<init>(r8, r5)     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L64
            r0.label = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r6.execute(r0)     // Catch: java.lang.Throwable -> L64
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r5 = r4
        L5e:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8     // Catch: java.lang.Throwable -> L64
            r5.manageError(r8)
            return r8
        L64:
            r5 = move-exception
            boolean r6 = r5 instanceof java.security.cert.CertPathValidatorException
            if (r6 == 0) goto L6a
            goto L6c
        L6a:
            boolean r3 = r5 instanceof javax.net.ssl.SSLHandshakeException
        L6c:
            if (r3 == 0) goto L74
            com.sfbx.appconsent.core.exception.ACException$ACCertificationPathValidatorException r6 = new com.sfbx.appconsent.core.exception.ACException$ACCertificationPathValidatorException
            r6.<init>(r5)
            throw r6
        L74:
            com.sfbx.appconsent.core.exception.ACException$ACUnknownException r6 = new com.sfbx.appconsent.core.exception.ACException$ACUnknownException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.postContentAsByteArrayTo(io.ktor.client.HttpClient, java.lang.String, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sfbx.appconsent.core.exception.ACException$ACAppKeyNotFoundException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sfbx.appconsent.core.exception.ACException$ACUnknownException */
    private final HttpResponse manageError(HttpResponse httpResponse) throws ACException.ACUnknownException, ACException.ACAppKeyNotFoundException {
        if (HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
            return httpResponse;
        }
        String description = httpResponse.getStatus().getDescription();
        if (StringsKt.contains(description, "Appkey", true) || StringsKt.contains(description, "not found", true)) {
            throw new ACException.ACAppKeyNotFoundException();
        }
        throw new ACException.ACUnknownException((Throwable) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sayHello(ac.Api.HelloRequest r7, kotlin.coroutines.Continuation<? super ac.Api.HelloReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00841
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$sayHello$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$sayHello$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sayHello$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.HELLO_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "helloRequest.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Api$HelloReply r7 = ac.Api.HelloReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…     helloReply\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.sayHello(ac.Api$HelloRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendConsents(ac.Api.SaveRequest r7, kotlin.coroutines.Continuation<? super ac.Api.SaveReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00851
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sendConsents$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveRequest.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveReply r7 = ac.Api.SaveReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.sendConsents(ac.Api$SaveRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveFloatingPurposes(ac.Api.SaveFloatingExtraPurposeRequest r7, kotlin.coroutines.Continuation<? super ac.Api.SaveFloatingExtraPurposeReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00831
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$saveFloatingPurposes$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_FLOATING_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveFloatingRequest.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveFloatingExtraPurposeReply r7 = ac.Api.SaveFloatingExtraPurposeReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.saveFloatingPurposes(ac.Api$SaveFloatingExtraPurposeRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ship(ac.Xchange.ShipRequest r7, kotlin.coroutines.Continuation<? super ac.Xchange.ShipReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00861
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$ship$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$ship$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$ship$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SHIP_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "shipRequest.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Xchange$ShipReply r7 = ac.Xchange.ShipReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.ship(ac.Xchange$ShipRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveExternalIds(ac.Api.SaveExternalRequest r7, kotlin.coroutines.Continuation<? super ac.Api.SaveExternalReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.C00821
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.C00821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$saveExternalIds$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.SAVE_EXTERNAL_IDS_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "saveExternalRequest.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Api$SaveExternalReply r7 = ac.Api.SaveExternalReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…eadBytes())\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.saveExternalIds(ac.Api$SaveExternalRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVendorExpiration(ac.Api.TranslateVendorCookieRetentionRequest r7, kotlin.coroutines.Continuation<? super ac.Api.TranslateVendorCookieRetentionReply> r8) throws com.sfbx.appconsent.core.exception.ACException.ACUnknownException, com.sfbx.appconsent.core.exception.ACException.ACCertificationPathValidatorException, com.sfbx.appconsent.core.exception.ACException.ACAppKeyNotFoundException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sfbx.appconsent.core.api.AppConsentService.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$getVendorExpiration$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            io.ktor.client.HttpClient r8 = r6.client
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.VENDOR_EXPIRATION_URL
            byte[] r7 = r7.toByteArray()
            java.lang.String r5 = "request.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.label = r4
            java.lang.Object r8 = r6.postContentAsByteArrayTo(r8, r2, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.statement.ReadersKt.readBytes(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            byte[] r8 = (byte[]) r8
            ac.Api$TranslateVendorCookieRetentionReply r7 = ac.Api.TranslateVendorCookieRetentionReply.parseFrom(r8)
            java.lang.String r8 = "postContentAsByteArrayTo…it.readBytes())\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.getVendorExpiration(ac.Api$TranslateVendorCookieRetentionRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: sendDisplayMetric-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m994sendDisplayMetric0E7RQCE(java.util.Map<java.lang.String, java.lang.String> r8, java.util.Map<java.lang.String, java.lang.String> r9, kotlin.coroutines.Continuation<? super kotlin.Result<? extends io.ktor.client.statement.HttpResponse>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1
            if (r0 == 0) goto L14
            r0 = r10
            com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1 r0 = (com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1 r0 = new com.sfbx.appconsent.core.api.AppConsentService$sendDisplayMetric$1
            r0.<init>(r7, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.L$0
            com.sfbx.appconsent.core.api.AppConsentService r8 = (com.sfbx.appconsent.core.api.AppConsentService) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> Lc6
            goto Lb9
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lc6
            r10 = r7
            com.sfbx.appconsent.core.api.AppConsentService r10 = (com.sfbx.appconsent.core.api.AppConsentService) r10     // Catch: java.lang.Throwable -> Lc6
            io.ktor.client.HttpClient r10 = r7.client     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = com.sfbx.appconsent.core.api.AppConsentService.METRIC_DISPLAY_URL     // Catch: java.lang.Throwable -> Lc6
            io.ktor.client.request.HttpRequestBuilder r4 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.lang.Throwable -> Lc6
            r4.<init>()     // Catch: java.lang.Throwable -> Lc6
            io.ktor.client.request.HttpRequestKt.url(r4, r2)     // Catch: java.lang.Throwable -> Lc6
            io.ktor.http.URLBuilder r2 = r4.getUrl()     // Catch: java.lang.Throwable -> Lc6
            io.ktor.http.ParametersBuilder r2 = r2.getParameters()     // Catch: java.lang.Throwable -> Lc6
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
        L5b:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r5 == 0) goto L77
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc6
            r2.append(r6, r5)     // Catch: java.lang.Throwable -> Lc6
            goto L5b
        L77:
            java.util.Set r8 = r9.entrySet()     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
        L7f:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> Lc6
            io.ktor.http.HeadersBuilder r2 = r4.getHeaders()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r5 = r9.getKey()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lc6
            r2.append(r5, r9)     // Catch: java.lang.Throwable -> Lc6
            goto L7f
        L9f:
            io.ktor.http.HttpMethod$Companion r8 = io.ktor.http.HttpMethod.Companion     // Catch: java.lang.Throwable -> Lc6
            io.ktor.http.HttpMethod r8 = r8.getGet()     // Catch: java.lang.Throwable -> Lc6
            r4.setMethod(r8)     // Catch: java.lang.Throwable -> Lc6
            io.ktor.client.statement.HttpStatement r8 = new io.ktor.client.statement.HttpStatement     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r4, r10)     // Catch: java.lang.Throwable -> Lc6
            r0.L$0 = r7     // Catch: java.lang.Throwable -> Lc6
            r0.label = r3     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r10 = r8.execute(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r10 != r1) goto Lb8
            return r1
        Lb8:
            r8 = r7
        Lb9:
            r9 = r10
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9     // Catch: java.lang.Throwable -> Lc6
            r8.manageError(r9)     // Catch: java.lang.Throwable -> Lc6
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r8 = kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Throwable -> Lc6
            goto Ld1
        Lc6:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        Ld1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.api.AppConsentService.m994sendDisplayMetric0E7RQCE(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
