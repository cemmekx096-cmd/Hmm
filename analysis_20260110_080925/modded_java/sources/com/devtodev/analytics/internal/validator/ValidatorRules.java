package com.devtodev.analytics.internal.validator;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.applovin.sdk.AppLovinMediationProvider;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.external.analytics.DTDFinishProgressionEventParameters;
import com.devtodev.analytics.external.analytics.DTDReferralProperty;
import com.devtodev.analytics.external.analytics.DTDStartProgressionEventParameters;
import com.devtodev.analytics.internal.backend.b;
import com.devtodev.analytics.internal.logger.Logger;
import com.google.firebase.messaging.Constants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ValidatorRules.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005`abcdB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ,\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ \u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ2\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001cJ$\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u001bJ\u0018\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020$J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&J\u0010\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u000bJ:\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0006\u0010+\u001a\u00020,2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001cJ0\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bJ(\u00104\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000b0\u001bJ \u00107\u001a\u0004\u0018\u0001082\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000bJ\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u000bH\u0002Jb\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H@0\u001b\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H@0\u001b2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u0018H\u0002J\u0010\u0010H\u001a\u0004\u0018\u00010\u000b2\u0006\u0010I\u001a\u00020\u000bJ\u0018\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000bJ\u0018\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020NJ\u001c\u0010O\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0PJ\u0015\u0010S\u001a\u0004\u0018\u00010,2\u0006\u0010T\u001a\u00020,¢\u0006\u0002\u0010UJ\u0018\u0010V\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000bJ4\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020,2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0\u001bJ)\u0010\\\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u0011H\u0000¢\u0006\u0004\b^\u0010_R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules;", BuildConfig.FLAVOR, "()V", "currentBalanceValidator", "Lcom/devtodev/analytics/internal/validator/CurrencyValidator;", "finishProgressionValidator", "levelUpValidator", "virtualCurrencyValidator", "notifyThatMethodExecutionHasEmptyMap", BuildConfig.FLAVOR, "method", BuildConfig.FLAVOR, "notifyThatMethodExecutionWasCanceled", "validateAdImpression", "Lcom/devtodev/analytics/internal/validator/ValidateAdImpressionData;", "network", "revenue", BuildConfig.FLAVOR, "placement", "unit", "validateCurrencyAccrual", "Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidCurrencyAccrual;", "currencyName", "currencyAmount", BuildConfig.FLAVOR, Constants.ScionAnalytics.PARAM_SOURCE, "validateCurrentBalance", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/domain/events/Resources;", "balances", "validateCustomEvent", "Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidCustomEvent;", "eventName", "parameters", "validateFinishProgressionEvent", "Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidFinishProgressionEvent;", "Lcom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters;", "validateInitialize", "Lcom/devtodev/analytics/external/analytics/DTDAnalyticsConfiguration;", "configuration", "validateInitializeKey", "applicationKey", "validateLevelUp", "level", BuildConfig.FLAVOR, "validatePayment", "Lcom/devtodev/analytics/internal/validator/PaymentData;", "methodName", "orderId", "price", "productId", "currencyCode", "validateReferrer", "Lcom/devtodev/analytics/external/analytics/DTDReferralProperty;", "utmData", "validateReplaceUserId", "Lcom/devtodev/analytics/internal/validator/ValidatorRules$UsersId;", "prevUserName", "userName", "validateResourceKey", BuildConfig.FLAVOR, "validator", "boundedKey", "validateResources", "T", BuildConfig.FLAVOR, "resourcesName", "resources", "currencyValidator", "keyLength", "min", AppLovinMediationProvider.MAX, "validateSocialNetworkConnect", "socialNetwork", "validateSocialNetworkPost", "Lcom/devtodev/analytics/internal/validator/SocialNetworkPostData;", AdOperationMetric.REASON, "validateStartProgressionEvent", "Lcom/devtodev/analytics/external/analytics/DTDStartProgressionEventParameters;", "validateSubscriptionHistory", BuildConfig.FLAVOR, "Lorg/json/JSONObject;", "purchaseList", "validateTutorial", "step", "(I)Ljava/lang/Integer;", "validateUserId", "validateVirtualCurrencyPayment", "Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidVirtualCurrencyPayment;", "purchaseId", "purchaseType", "purchaseAmount", "validateWaitingValue", "value", "validateWaitingValue$DTDAnalytics_unityRelease", "(Ljava/lang/String;DD)Ljava/lang/Double;", "UsersId", "ValidCurrencyAccrual", "ValidCustomEvent", "ValidFinishProgressionEvent", "ValidVirtualCurrencyPayment", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ValidatorRules {
    public static final ValidatorRules INSTANCE = new ValidatorRules();
    private static final CurrencyValidator virtualCurrencyValidator = new CurrencyValidator();
    private static final CurrencyValidator levelUpValidator = new CurrencyValidator();
    private static final CurrencyValidator currentBalanceValidator = new CurrencyValidator();
    private static final CurrencyValidator finishProgressionValidator = new CurrencyValidator();

    /* compiled from: ValidatorRules.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules$UsersId;", BuildConfig.FLAVOR, "prevUserName", BuildConfig.FLAVOR, "userName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrevUserName", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class UsersId {
        private final String prevUserName;
        private final String userName;

        public UsersId(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "prevUserName");
            Intrinsics.checkNotNullParameter(str2, "userName");
            this.prevUserName = str;
            this.userName = str2;
        }

        public static /* synthetic */ UsersId copy$default(UsersId usersId, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usersId.prevUserName;
            }
            if ((i & 2) != 0) {
                str2 = usersId.userName;
            }
            return usersId.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrevUserName() {
            return this.prevUserName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        public final UsersId copy(String prevUserName, String userName) {
            Intrinsics.checkNotNullParameter(prevUserName, "prevUserName");
            Intrinsics.checkNotNullParameter(userName, "userName");
            return new UsersId(prevUserName, userName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsersId)) {
                return false;
            }
            UsersId usersId = (UsersId) other;
            return Intrinsics.areEqual(this.prevUserName, usersId.prevUserName) && Intrinsics.areEqual(this.userName, usersId.userName);
        }

        public final String getPrevUserName() {
            return this.prevUserName;
        }

        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            return this.userName.hashCode() + (this.prevUserName.hashCode() * 31);
        }

        public String toString() {
            return "UsersId(prevUserName=" + this.prevUserName + ", userName=" + this.userName + ")";
        }
    }

    /* compiled from: ValidatorRules.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidCurrencyAccrual;", BuildConfig.FLAVOR, "currencyName", BuildConfig.FLAVOR, Constants.ScionAnalytics.PARAM_SOURCE, "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyName", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidCurrencyAccrual {
        private final String currencyName;
        private final String source;

        public ValidCurrencyAccrual(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "currencyName");
            Intrinsics.checkNotNullParameter(str2, Constants.ScionAnalytics.PARAM_SOURCE);
            this.currencyName = str;
            this.source = str2;
        }

        public static /* synthetic */ ValidCurrencyAccrual copy$default(ValidCurrencyAccrual validCurrencyAccrual, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validCurrencyAccrual.currencyName;
            }
            if ((i & 2) != 0) {
                str2 = validCurrencyAccrual.source;
            }
            return validCurrencyAccrual.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrencyName() {
            return this.currencyName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final ValidCurrencyAccrual copy(String currencyName, String source) {
            Intrinsics.checkNotNullParameter(currencyName, "currencyName");
            Intrinsics.checkNotNullParameter(source, Constants.ScionAnalytics.PARAM_SOURCE);
            return new ValidCurrencyAccrual(currencyName, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidCurrencyAccrual)) {
                return false;
            }
            ValidCurrencyAccrual validCurrencyAccrual = (ValidCurrencyAccrual) other;
            return Intrinsics.areEqual(this.currencyName, validCurrencyAccrual.currencyName) && Intrinsics.areEqual(this.source, validCurrencyAccrual.source);
        }

        public final String getCurrencyName() {
            return this.currencyName;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.currencyName.hashCode() * 31);
        }

        public String toString() {
            return "ValidCurrencyAccrual(currencyName=" + this.currencyName + ", source=" + this.source + ")";
        }
    }

    /* compiled from: ValidatorRules.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidCustomEvent;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "params", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidCustomEvent {
        private final String name;
        private final Map<String, Object> params;

        public ValidCustomEvent(String str, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(map, "params");
            this.name = str;
            this.params = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidCustomEvent copy$default(ValidCustomEvent validCustomEvent, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validCustomEvent.name;
            }
            if ((i & 2) != 0) {
                map = validCustomEvent.params;
            }
            return validCustomEvent.copy(str, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.params;
        }

        public final ValidCustomEvent copy(String name, Map<String, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            return new ValidCustomEvent(name, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidCustomEvent)) {
                return false;
            }
            ValidCustomEvent validCustomEvent = (ValidCustomEvent) other;
            return Intrinsics.areEqual(this.name, validCustomEvent.name) && Intrinsics.areEqual(this.params, validCustomEvent.params);
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "ValidCustomEvent(name=" + this.name + ", params=" + this.params + ")";
        }
    }

    /* compiled from: ValidatorRules.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidFinishProgressionEvent;", BuildConfig.FLAVOR, "eventName", BuildConfig.FLAVOR, "parameters", "Lcom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters;", "(Ljava/lang/String;Lcom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters;)V", "getEventName", "()Ljava/lang/String;", "getParameters", "()Lcom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidFinishProgressionEvent {
        private final String eventName;
        private final DTDFinishProgressionEventParameters parameters;

        public ValidFinishProgressionEvent(String str, DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters) {
            Intrinsics.checkNotNullParameter(str, "eventName");
            Intrinsics.checkNotNullParameter(dTDFinishProgressionEventParameters, "parameters");
            this.eventName = str;
            this.parameters = dTDFinishProgressionEventParameters;
        }

        public static /* synthetic */ ValidFinishProgressionEvent copy$default(ValidFinishProgressionEvent validFinishProgressionEvent, String str, DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validFinishProgressionEvent.eventName;
            }
            if ((i & 2) != 0) {
                dTDFinishProgressionEventParameters = validFinishProgressionEvent.parameters;
            }
            return validFinishProgressionEvent.copy(str, dTDFinishProgressionEventParameters);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* renamed from: component2, reason: from getter */
        public final DTDFinishProgressionEventParameters getParameters() {
            return this.parameters;
        }

        public final ValidFinishProgressionEvent copy(String eventName, DTDFinishProgressionEventParameters parameters) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            return new ValidFinishProgressionEvent(eventName, parameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidFinishProgressionEvent)) {
                return false;
            }
            ValidFinishProgressionEvent validFinishProgressionEvent = (ValidFinishProgressionEvent) other;
            return Intrinsics.areEqual(this.eventName, validFinishProgressionEvent.eventName) && Intrinsics.areEqual(this.parameters, validFinishProgressionEvent.parameters);
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final DTDFinishProgressionEventParameters getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return "ValidFinishProgressionEvent(eventName=" + this.eventName + ", parameters=" + this.parameters + ")";
        }
    }

    /* compiled from: ValidatorRules.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/devtodev/analytics/internal/validator/ValidatorRules$ValidVirtualCurrencyPayment;", BuildConfig.FLAVOR, "purchaseId", BuildConfig.FLAVOR, "purchaseType", "boundedResources", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBoundedResources", "()Ljava/util/Map;", "getPurchaseId", "()Ljava/lang/String;", "getPurchaseType", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidVirtualCurrencyPayment {
        private final Map<String, Integer> boundedResources;
        private final String purchaseId;
        private final String purchaseType;

        public ValidVirtualCurrencyPayment(String str, String str2, Map<String, Integer> map) {
            Intrinsics.checkNotNullParameter(str, "purchaseId");
            Intrinsics.checkNotNullParameter(str2, "purchaseType");
            Intrinsics.checkNotNullParameter(map, "boundedResources");
            this.purchaseId = str;
            this.purchaseType = str2;
            this.boundedResources = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidVirtualCurrencyPayment copy$default(ValidVirtualCurrencyPayment validVirtualCurrencyPayment, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validVirtualCurrencyPayment.purchaseId;
            }
            if ((i & 2) != 0) {
                str2 = validVirtualCurrencyPayment.purchaseType;
            }
            if ((i & 4) != 0) {
                map = validVirtualCurrencyPayment.boundedResources;
            }
            return validVirtualCurrencyPayment.copy(str, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPurchaseType() {
            return this.purchaseType;
        }

        public final Map<String, Integer> component3() {
            return this.boundedResources;
        }

        public final ValidVirtualCurrencyPayment copy(String purchaseId, String purchaseType, Map<String, Integer> boundedResources) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            Intrinsics.checkNotNullParameter(boundedResources, "boundedResources");
            return new ValidVirtualCurrencyPayment(purchaseId, purchaseType, boundedResources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidVirtualCurrencyPayment)) {
                return false;
            }
            ValidVirtualCurrencyPayment validVirtualCurrencyPayment = (ValidVirtualCurrencyPayment) other;
            return Intrinsics.areEqual(this.purchaseId, validVirtualCurrencyPayment.purchaseId) && Intrinsics.areEqual(this.purchaseType, validVirtualCurrencyPayment.purchaseType) && Intrinsics.areEqual(this.boundedResources, validVirtualCurrencyPayment.boundedResources);
        }

        public final Map<String, Integer> getBoundedResources() {
            return this.boundedResources;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final String getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            return this.boundedResources.hashCode() + b.a(this.purchaseType, this.purchaseId.hashCode() * 31, 31);
        }

        public String toString() {
            return "ValidVirtualCurrencyPayment(purchaseId=" + this.purchaseId + ", purchaseType=" + this.purchaseType + ", boundedResources=" + this.boundedResources + ")";
        }
    }

    private ValidatorRules() {
    }

    private final void notifyThatMethodExecutionHasEmptyMap(String method) {
        Logger.error$default(Logger.INSTANCE, "Execution of the [" + method + "] method was canceled!\n\tMap is empty!", (Throwable) null, 2, (Object) null);
    }

    private final boolean validateResourceKey(CurrencyValidator validator, String boundedKey) {
        Long numberOfCurrencies = Validator.INSTANCE.getNumberOfCurrencies();
        if (numberOfCurrencies == null) {
            return true;
        }
        long jLongValue = numberOfCurrencies.longValue();
        if (validator.getValidCurrencies().contains(boundedKey)) {
            return true;
        }
        if (validator.getValidCurrencies().size() >= jLongValue) {
            return false;
        }
        validator.getValidCurrencies().add(boundedKey);
        return true;
    }

    private final <T extends Number> Map<String, T> validateResources(String method, String resourcesName, Map<String, ? extends T> resources, CurrencyValidator currencyValidator, int keyLength, long min, long max) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends T> entry : resources.entrySet()) {
            String key = entry.getKey();
            T value = entry.getValue();
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(key);
            String str = "The [" + strDeleteNonPrintCharacters + "] key of the " + resourcesName;
            String strMaxStringLength = bounder.maxStringLength(method, str, strDeleteNonPrintCharacters, keyLength);
            Validator validator = Validator.INSTANCE;
            boolean zNotNullOrEmpty = validator.notNullOrEmpty(method, str, strMaxStringLength);
            boolean zInInterval = validator.inInterval(method, "The value of the " + resourcesName, value, Long.valueOf(min), Long.valueOf(max));
            if (zNotNullOrEmpty && zInInterval && strMaxStringLength != null) {
                if (validateResourceKey(currencyValidator, strMaxStringLength)) {
                    linkedHashMap.put(strMaxStringLength, value);
                }
            }
        }
        return linkedHashMap;
    }

    public final void notifyThatMethodExecutionWasCanceled(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        Logger.error$default(Logger.INSTANCE, "Execution of the [" + method + "] method was canceled!", (Throwable) null, 2, (Object) null);
    }

    public final UsersId validateReplaceUserId(String method, String prevUserName, String userName) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(prevUserName, "prevUserName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(prevUserName), 64);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty(method, "The user id argument value", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(userName), 64);
        boolean zNotNullOrEmpty2 = validator.notNullOrEmpty(method, "The user id argument value", strMaxStringLength2);
        if (!zNotNullOrEmpty || !zNotNullOrEmpty2) {
            return null;
        }
        Intrinsics.checkNotNull(strMaxStringLength);
        Intrinsics.checkNotNull(strMaxStringLength2);
        return new UsersId(strMaxStringLength, strMaxStringLength2);
    }

    public final Double validateWaitingValue$DTDAnalytics_unityRelease(String method, double min, double value) {
        Intrinsics.checkNotNullParameter(method, "method");
        Validator validator = Validator.INSTANCE;
        if (validator.inInterval(method, "newValue", Double.valueOf(value), Double.valueOf(min), Double.valueOf(Double.MAX_VALUE)) && validator.validateDoubleNAN(method, "newValue", value)) {
            return Double.valueOf(value);
        }
        notifyThatMethodExecutionWasCanceled(method);
        return null;
    }

    public final Map<DTDReferralProperty, String> validateReferrer(Map<DTDReferralProperty, String> utmData) {
        Intrinsics.checkNotNullParameter(utmData, "utmData");
        Map<DTDReferralProperty, String> mapEmptyMap = MapsKt.emptyMap();
        for (Map.Entry<DTDReferralProperty, String> entry : utmData.entrySet()) {
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(entry.getValue());
            String str = "The [" + strDeleteNonPrintCharacters + "] value of the utm data dictionary by [" + entry.getKey().name() + "] key";
            String strMaxStringLength = bounder.maxStringLength("Referrer", str, strDeleteNonPrintCharacters, 255);
            if (Validator.INSTANCE.notNullOrEmpty("Referrer", str, strMaxStringLength) && strMaxStringLength != null) {
                mapEmptyMap = MapsKt.toMutableMap(mapEmptyMap);
                mapEmptyMap.put(entry.getKey(), strMaxStringLength);
            }
        }
        if (!mapEmptyMap.isEmpty()) {
            return mapEmptyMap;
        }
        notifyThatMethodExecutionHasEmptyMap("Referrer");
        return null;
    }

    public final String validateUserId(String method, String userName) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (Intrinsics.areEqual(userName, BuildConfig.FLAVOR)) {
            return userName;
        }
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(method, "The user id argument value", bounder.deleteNonPrintCharacters(userName), 64);
        if (Validator.INSTANCE.notNullOrEmpty(method, "The user id argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        return null;
    }

    public final ValidCustomEvent validateCustomEvent(String eventName, Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("CustomEvent", "The custom event name", bounder.deleteNonPrintCharacters(eventName), 72);
        boolean zNotNullOrEmpty = Validator.INSTANCE.notNullOrEmpty("CustomEvent", "The custom event name", strMaxStringLength);
        Map mapEmptyMap = MapsKt.emptyMap();
        Map mutableMap = mapEmptyMap;
        for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
            Bounder bounder2 = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder2.deleteNonPrintCharacters(entry.getKey());
            if (strDeleteNonPrintCharacters == null) {
                Logger.error$default(Logger.INSTANCE, "The key of the parameters dictionary is empty!", (Throwable) null, 2, (Object) null);
            }
            String str = "The value of the parameters dictionary by [" + strDeleteNonPrintCharacters + "] key";
            String strMaxStringLength2 = bounder2.maxStringLength("CustomEvent", "The key of the parameters dictionary", strDeleteNonPrintCharacters, 32);
            if (strMaxStringLength2 != null) {
                Validator validator = Validator.INSTANCE;
                boolean zNotNullOrEmpty2 = validator.notNullOrEmpty("CustomEvent", "The key of the parameters dictionary", strMaxStringLength2);
                boolean zValidType = validator.validType("CustomEvent", str, entry.getValue());
                if (zNotNullOrEmpty2 && zValidType) {
                    Object value = entry.getValue();
                    if (value instanceof Long) {
                        if (validator.inInterval("CustomEvent", str, (Number) value, Long.MIN_VALUE, Long.MAX_VALUE)) {
                            mutableMap = MapsKt.toMutableMap(mutableMap);
                            mutableMap.put(strMaxStringLength2, value);
                        }
                    } else if (value instanceof String) {
                        String strMaxStringLength3 = bounder2.maxStringLength("CustomEvent", str, bounder2.deleteNonPrintCharacters((String) value), 255);
                        if (validator.notNullOrEmpty("CustomEvent", str, strMaxStringLength3)) {
                            mutableMap = MapsKt.toMutableMap(mutableMap);
                            Intrinsics.checkNotNull(strMaxStringLength3);
                            mutableMap.put(strMaxStringLength2, strMaxStringLength3);
                        }
                    } else if (value instanceof Double) {
                        if (validator.inInterval("CustomEvent", str, (Number) value, Double.valueOf(-1.7976931348623157E308d), Double.valueOf(Double.MAX_VALUE))) {
                            mutableMap = MapsKt.toMutableMap(mutableMap);
                            mutableMap.put(strMaxStringLength2, value);
                        }
                    } else if (value instanceof Boolean) {
                        mutableMap = MapsKt.toMutableMap(mutableMap);
                        mutableMap.put(strMaxStringLength2, value);
                    }
                }
            }
        }
        if (zNotNullOrEmpty && strMaxStringLength != null) {
            return new ValidCustomEvent(strMaxStringLength, mutableMap);
        }
        notifyThatMethodExecutionWasCanceled("CustomEvent");
        return null;
    }

    public final DTDAnalyticsConfiguration validateInitialize(DTDAnalyticsConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        DTDAnalyticsConfiguration dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease = configuration.clone$DTDAnalytics_unityRelease();
        String userId = dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease.getUserId();
        if (userId != null) {
            dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease.setUserId(INSTANCE.validateUserId("Initialize", userId));
        }
        Integer currentLevel = dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease.getCurrentLevel();
        if (currentLevel != null) {
            if (!Validator.INSTANCE.inInterval("Initialize", "The current level argument value", Integer.valueOf(currentLevel.intValue()), 1, 2147483646)) {
                dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease.setCurrentLevel((Integer) null);
            }
        }
        return dTDAnalyticsConfigurationClone$DTDAnalytics_unityRelease;
    }

    public final String validateInitializeKey(String applicationKey) {
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("Initialize", "The application key argument value", bounder.deleteNonPrintCharacters(applicationKey), 255);
        if (Validator.INSTANCE.notNullOrEmpty("Initialize", "The application key argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        notifyThatMethodExecutionWasCanceled("Initialize");
        return null;
    }

    public final Integer validateTutorial(int step) {
        if (Validator.INSTANCE.inInterval("Tutorial", "The step argument value", Integer.valueOf(step), -2, Integer.MAX_VALUE)) {
            return Integer.valueOf(step);
        }
        notifyThatMethodExecutionWasCanceled("Tutorial");
        return null;
    }

    public final Map<String, Long> validateLevelUp(int level, Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        boolean zInInterval = Validator.INSTANCE.inInterval("LevelUp", "The level argument value", Integer.valueOf(level), 1, 2147483646);
        Map<String, Long> mapValidateResources = validateResources("LevelUp", "balances dictionary", balances, levelUpValidator, 24, Long.MIN_VALUE, Long.MAX_VALUE);
        if (zInInterval) {
            return mapValidateResources;
        }
        notifyThatMethodExecutionWasCanceled("LevelUp");
        return null;
    }

    public final String validateSocialNetworkConnect(String socialNetwork) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("SocialNetworkConnect", "The social network name argument value", bounder.deleteNonPrintCharacters(socialNetwork), 24);
        if (Validator.INSTANCE.notNullOrEmpty("SocialNetworkConnect", "The social network name argument value", strMaxStringLength)) {
            return strMaxStringLength;
        }
        notifyThatMethodExecutionWasCanceled("SocialNetworkConnect");
        return null;
    }

    public final ValidFinishProgressionEvent validateFinishProgressionEvent(String eventName, DTDFinishProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("FinishProgressionEvent", "The event name argument value", bounder.deleteNonPrintCharacters(eventName), 40);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("FinishProgressionEvent", "The event name argument value", strMaxStringLength);
        boolean z = false;
        if (validator.inInterval("FinishProgressionEvent", "The duration parameter value", Integer.valueOf(parameters.getDuration()), 0, Integer.MAX_VALUE) && zNotNullOrEmpty) {
            z = true;
        }
        boolean z2 = z;
        Map spent = parameters.getSpent();
        CurrencyValidator currencyValidator = finishProgressionValidator;
        Map mapValidateResources = validateResources("FinishProgressionEvent", "spent dictionary", spent, currencyValidator, 24, 1L, Long.MAX_VALUE);
        Map mapValidateResources2 = validateResources("FinishProgressionEvent", "earned dictionary", parameters.getEarned(), currencyValidator, 24, 1L, Long.MAX_VALUE);
        if (z2) {
            DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters = new DTDFinishProgressionEventParameters();
            dTDFinishProgressionEventParameters.setSuccessfulCompletion(parameters.getSuccessfulCompletion());
            dTDFinishProgressionEventParameters.setSpent(mapValidateResources);
            dTDFinishProgressionEventParameters.setEarned(mapValidateResources2);
            dTDFinishProgressionEventParameters.setDuration(parameters.getDuration());
            Intrinsics.checkNotNull(strMaxStringLength);
            return new ValidFinishProgressionEvent(strMaxStringLength, dTDFinishProgressionEventParameters);
        }
        notifyThatMethodExecutionWasCanceled("FinishProgressionEvent");
        return null;
    }

    public final SocialNetworkPostData validateSocialNetworkPost(String socialNetwork, String reason) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(reason, AdOperationMetric.REASON);
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("SocialNetworkPost", "The social network name argument value", bounder.deleteNonPrintCharacters(socialNetwork), 24);
        String strMaxStringLength2 = bounder.maxStringLength("SocialNetworkPost", "The post reason argument value", bounder.deleteNonPrintCharacters(reason), 32);
        Validator validator = Validator.INSTANCE;
        boolean z = validator.notNullOrEmpty("SocialNetworkPost", "The post reason argument value", strMaxStringLength2) && validator.notNullOrEmpty("SocialNetworkPost", "The social network name argument value", strMaxStringLength);
        if (strMaxStringLength != null && strMaxStringLength2 != null && z) {
            return new SocialNetworkPostData(strMaxStringLength, strMaxStringLength2);
        }
        notifyThatMethodExecutionWasCanceled("SocialNetworkPost");
        return null;
    }

    public final ValidCurrencyAccrual validateCurrencyAccrual(String currencyName, long currencyAmount, String source) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(source, Constants.ScionAnalytics.PARAM_SOURCE);
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("CurrencyAccrual", "The currency name", bounder.deleteNonPrintCharacters(currencyName), 24);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("CurrencyAccrual", "The currency name", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength("CurrencyAccrual", "The currency name", bounder.deleteNonPrintCharacters(source), 32);
        if ((validator.inInterval("CurrencyAccrual", "The currency amount", Long.valueOf(currencyAmount), 1L, Long.MAX_VALUE) && (validator.notNullOrEmpty("CurrencyAccrual", "The source", strMaxStringLength2) && zNotNullOrEmpty)) && strMaxStringLength != null && strMaxStringLength2 != null) {
            return new ValidCurrencyAccrual(strMaxStringLength, strMaxStringLength2);
        }
        notifyThatMethodExecutionWasCanceled("CurrencyAccrual");
        return null;
    }

    public final PaymentData validatePayment(String methodName, String orderId, double price, String productId, String currencyCode) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength(methodName, "The order id argument value", bounder.deleteNonPrintCharacters(orderId), 65);
        String strMaxStringLength2 = bounder.maxStringLength(methodName, "The product id parameter value", bounder.deleteNonPrintCharacters(productId), 255);
        String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(currencyCode);
        Validator validator = Validator.INSTANCE;
        boolean z = validator.notNullOrEmpty(methodName, "The product id parameter value", strMaxStringLength2) && (validator.notNullOrEmpty(methodName, "The order id argument value", strMaxStringLength) && (validator.inInterval(methodName, "The price argument value", Double.valueOf(price), Double.valueOf(-1.7976931348623157E308d), Double.valueOf(Double.MAX_VALUE)) && validator.equalStringLength(methodName, "The currency code parameter value", strDeleteNonPrintCharacters, 3)));
        if (strMaxStringLength != null && strMaxStringLength2 != null && z) {
            Intrinsics.checkNotNull(strDeleteNonPrintCharacters);
            return new PaymentData(strMaxStringLength, price, strMaxStringLength2, strDeleteNonPrintCharacters);
        }
        notifyThatMethodExecutionWasCanceled(methodName);
        return null;
    }

    public final DTDStartProgressionEventParameters validateStartProgressionEvent(String eventName, DTDStartProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("StartProgressionEvent", "The event name argument value", bounder.deleteNonPrintCharacters(eventName), 40);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty("StartProgressionEvent", "The event name argument value", strMaxStringLength);
        String strMaxStringLength2 = bounder.maxStringLength("StartProgressionEvent", "The source parameter value", bounder.deleteNonPrintCharacters(parameters.getSource()), 40);
        Integer difficulty$DTDAnalytics_unityRelease = parameters.getDifficulty$DTDAnalytics_unityRelease();
        if (difficulty$DTDAnalytics_unityRelease != null) {
            zNotNullOrEmpty = validator.inInterval("StartProgressionEvent", "The difficulty parameter value", Integer.valueOf(difficulty$DTDAnalytics_unityRelease.intValue()), Integer.valueOf(ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN), Integer.MAX_VALUE) && zNotNullOrEmpty;
        }
        if (zNotNullOrEmpty) {
            DTDStartProgressionEventParameters dTDStartProgressionEventParameters = new DTDStartProgressionEventParameters();
            dTDStartProgressionEventParameters.setSource(strMaxStringLength2);
            dTDStartProgressionEventParameters.setDifficulty$DTDAnalytics_unityRelease(parameters.getDifficulty$DTDAnalytics_unityRelease());
            return dTDStartProgressionEventParameters;
        }
        notifyThatMethodExecutionWasCanceled("StartProgressionEvent");
        return null;
    }

    public final List<JSONObject> validateSubscriptionHistory(List<String> purchaseList) throws JSONException {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        ArrayList arrayList = new ArrayList();
        if (purchaseList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Iterator<T> it = purchaseList.iterator();
        while (it.hasNext()) {
            String strDeleteNonPrintCharacters = Bounder.INSTANCE.deleteNonPrintCharacters((String) it.next());
            if (strDeleteNonPrintCharacters != null) {
                arrayList.add(strDeleteNonPrintCharacters);
            }
        }
        List<JSONObject> listConvertToJsonList = ValidatorKt.convertToJsonList(arrayList, "SubscriptionHistory");
        if (listConvertToJsonList == null) {
            notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
            return null;
        }
        if (ValidatorKt.hasEmptyObj(listConvertToJsonList)) {
            return null;
        }
        if (!ValidatorKt.containsOnlyStringValues(listConvertToJsonList, "SubscriptionHistory")) {
            notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
            return null;
        }
        for (JSONObject jSONObject : listConvertToJsonList) {
            for (String str : CollectionsKt.listOf(new String[]{"orderId", "productId"})) {
                if (!ValidatorKt.hasRequiredKeys(jSONObject, "SubscriptionHistory", str)) {
                    INSTANCE.notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
                    return null;
                }
                if (!ValidatorKt.notNullOrEmpty(jSONObject, "SubscriptionHistory", str)) {
                    INSTANCE.notifyThatMethodExecutionWasCanceled("SubscriptionHistory");
                    return null;
                }
            }
        }
        for (JSONObject jSONObject2 : listConvertToJsonList) {
            String string = jSONObject2.get("productId").toString();
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters2 = bounder.deleteNonPrintCharacters(string);
            if (strDeleteNonPrintCharacters2 == null) {
                return null;
            }
            Validator validator = Validator.INSTANCE;
            if (!validator.notNullOrEmpty("SubscriptionHistory", "The product id parameter value", strDeleteNonPrintCharacters2)) {
                return null;
            }
            jSONObject2.put("productId", bounder.maxNotNullStringLength("SubscriptionHistory", "The product id parameter value", strDeleteNonPrintCharacters2, 255));
            Object obj = jSONObject2.get("orderId");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = (JSONArray) obj;
                int length = jSONArray2.length();
                for (int i = 0; i < length; i++) {
                    Bounder bounder2 = Bounder.INSTANCE;
                    String strDeleteNonPrintCharacters3 = bounder2.deleteNonPrintCharacters(jSONArray2.get(i).toString());
                    if (strDeleteNonPrintCharacters3 == null || !Validator.INSTANCE.notNullOrEmpty("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters3)) {
                        return null;
                    }
                    jSONArray.put(bounder2.maxNotNullStringLength("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters3, 65));
                }
                jSONObject2.put("orderId", jSONArray);
            } else if (obj instanceof String) {
                String strDeleteNonPrintCharacters4 = bounder.deleteNonPrintCharacters(jSONObject2.get("orderId").toString());
                if (strDeleteNonPrintCharacters4 == null || !validator.notNullOrEmpty("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters4)) {
                    return null;
                }
                jSONObject2.put("orderId", bounder.maxNotNullStringLength("SubscriptionHistory", "The order id argument value", strDeleteNonPrintCharacters4, 65));
            } else {
                continue;
            }
        }
        return listConvertToJsonList;
    }

    public final ValidVirtualCurrencyPayment validateVirtualCurrencyPayment(String purchaseId, String purchaseType, int purchaseAmount, Map<String, Integer> resources) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Validator validator = Validator.INSTANCE;
        boolean zInInterval = validator.inInterval("VirtualCurrencyPayment", "The purchase amount", Integer.valueOf(purchaseAmount), 1L, Integer.MAX_VALUE);
        Map mapValidateResources = validateResources("VirtualCurrencyPayment", "resources dictionary", resources, virtualCurrencyValidator, 24, 1L, Long.MAX_VALUE);
        boolean z = false;
        if (mapValidateResources.isEmpty()) {
            Logger.error$default(Logger.INSTANCE, "VirtualCurrencyPayment has empty Resources dictionary!", (Throwable) null, 2, (Object) null);
            zInInterval = false;
        }
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength = bounder.maxStringLength("VirtualCurrencyPayment", "The purchase identifier", bounder.deleteNonPrintCharacters(purchaseId), 32);
        boolean z2 = validator.notNullOrEmpty("VirtualCurrencyPayment", "The purchase identifier", strMaxStringLength) && zInInterval;
        String strMaxStringLength2 = bounder.maxStringLength("VirtualCurrencyPayment", "The purchase type", bounder.deleteNonPrintCharacters(purchaseType), 96);
        if (validator.notNullOrEmpty("VirtualCurrencyPayment", "The purchase type", strMaxStringLength2) && z2) {
            z = true;
        }
        if (!z || strMaxStringLength == null || strMaxStringLength2 == null) {
            return null;
        }
        return new ValidVirtualCurrencyPayment(strMaxStringLength, strMaxStringLength2, mapValidateResources);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.devtodev.analytics.internal.validator.ValidateAdImpressionData validateAdImpression(java.lang.String r16, double r17, java.lang.String r19, java.lang.String r20) {
        /*
            r15 = this;
            r0 = r16
            java.lang.String r1 = "network"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.devtodev.analytics.internal.validator.Bounder r1 = com.devtodev.analytics.internal.validator.Bounder.INSTANCE
            java.lang.String r0 = r1.deleteNonPrintCharacters(r0)
            java.lang.String r8 = "AdImpression"
            java.lang.String r2 = "The network argument value"
            r3 = 100
            java.lang.String r10 = r1.maxStringLength(r8, r2, r0, r3)
            r0 = r19
            java.lang.String r0 = r1.deleteNonPrintCharacters(r0)
            java.lang.String r4 = "The placement argument value"
            java.lang.String r0 = r1.maxStringLength(r8, r4, r0, r3)
            r9 = 1
            r11 = 0
            if (r0 == 0) goto L34
            int r4 = r0.length()
            if (r4 != 0) goto L2f
            r4 = r9
            goto L30
        L2f:
            r4 = r11
        L30:
            if (r4 != 0) goto L34
            r4 = r9
            goto L35
        L34:
            r4 = r11
        L35:
            r12 = 0
            if (r4 != 0) goto L3c
            r0 = r20
            r13 = r12
            goto L3f
        L3c:
            r13 = r0
            r0 = r20
        L3f:
            java.lang.String r0 = r1.deleteNonPrintCharacters(r0)
            java.lang.String r4 = "The unit argument value"
            java.lang.String r0 = r1.maxStringLength(r8, r4, r0, r3)
            if (r0 == 0) goto L58
            int r1 = r0.length()
            if (r1 != 0) goto L53
            r1 = r9
            goto L54
        L53:
            r1 = r11
        L54:
            if (r1 != 0) goto L58
            r1 = r9
            goto L59
        L58:
            r1 = r11
        L59:
            if (r1 != 0) goto L5d
            r14 = r12
            goto L5e
        L5d:
            r14 = r0
        L5e:
            com.devtodev.analytics.internal.validator.Validator r0 = com.devtodev.analytics.internal.validator.Validator.INSTANCE
            boolean r1 = r0.notNullOrEmpty(r8, r2, r10)
            java.lang.Double r5 = java.lang.Double.valueOf(r17)
            r2 = 0
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r7 = java.lang.Double.valueOf(r2)
            java.lang.String r4 = "The revenue argument value"
            r2 = r0
            r3 = r8
            boolean r0 = r2.inInterval(r3, r4, r5, r6, r7)
            if (r0 == 0) goto L84
            if (r1 == 0) goto L84
            goto L85
        L84:
            r9 = r11
        L85:
            if (r10 == 0) goto L94
            if (r9 == 0) goto L94
            com.devtodev.analytics.internal.validator.ValidateAdImpressionData r0 = new com.devtodev.analytics.internal.validator.ValidateAdImpressionData
            r9 = r0
            r11 = r17
            r9.<init>(r10, r11, r13, r14)
            r12 = r0
            r0 = r15
            goto L98
        L94:
            r0 = r15
            r15.notifyThatMethodExecutionWasCanceled(r8)
        L98:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.internal.validator.ValidatorRules.validateAdImpression(java.lang.String, double, java.lang.String, java.lang.String):com.devtodev.analytics.internal.validator.ValidateAdImpressionData");
    }

    public final Map<String, Long> validateCurrentBalance(Map<String, Long> balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Map<String, Long> mapValidateResources = validateResources("CurrentBalance", "balances dictionary", balances, currentBalanceValidator, 24, Long.MIN_VALUE, Long.MAX_VALUE);
        if (Validator.INSTANCE.notNullOrEmpty("CurrentBalance", "The balance parameter value", mapValidateResources)) {
            return mapValidateResources;
        }
        notifyThatMethodExecutionWasCanceled("CurrentBalance");
        return null;
    }
}
