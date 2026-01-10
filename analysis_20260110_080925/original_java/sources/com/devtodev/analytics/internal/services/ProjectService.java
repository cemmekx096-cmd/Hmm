package com.devtodev.analytics.internal.services;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.backend.ExcludeEvents;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.correncyPayment.Transaction;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.DTDPlatformOwner;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.platform.AdvertisingIdResult;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.platform.DeviceConstants;
import com.devtodev.analytics.internal.platform.DeviceResolution;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.utils.JsonPretty;
import com.devtodev.analytics.internal.utils.StringExtentionsKt;
import com.devtodev.analytics.internal.validator.Validator;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProjectService.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u001c\u0010'\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000e0)H\u0016J\b\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\bH\u0016J\b\u00102\u001a\u00020\u000eH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/devtodev/analytics/internal/services/ProjectService;", "Lcom/devtodev/analytics/internal/services/IProjectService;", "stateManager", "Lcom/devtodev/analytics/internal/managers/IStateManager;", "projectRepository", "Lcom/devtodev/analytics/internal/storage/IRepository;", "(Lcom/devtodev/analytics/internal/managers/IStateManager;Lcom/devtodev/analytics/internal/storage/IRepository;)V", "value", BuildConfig.FLAVOR, "isRefererSent", "()Z", "setRefererSent", "(Z)V", "applyConfig", BuildConfig.FLAVOR, "config", "Lcom/devtodev/analytics/internal/backend/ConfigEntry;", "checkIfNeedRemoveUsersData", "gerActualPurchaseList", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/domain/events/correncyPayment/Transaction;", "list", "Lorg/json/JSONObject;", "getAdvertisingId", "Lcom/devtodev/analytics/internal/platform/AdvertisingIdResult;", "getAppData", "Lcom/devtodev/analytics/internal/platform/ApplicationData;", "getDeviceConstants", "Lcom/devtodev/analytics/internal/platform/DeviceConstants;", "getDeviceIdentifiers", "Lcom/devtodev/analytics/internal/domain/DeviceIdentifiers;", "getDeviceResolution", "Lcom/devtodev/analytics/internal/platform/DeviceResolution;", "getDeviseOwner", "Lcom/devtodev/analytics/internal/managers/DTDPlatformOwner;", "getNumberOfCurrencies", BuildConfig.FLAVOR, "getObfuscatedAccountId", BuildConfig.FLAVOR, "getReferrerData", "installReferrer", "Lkotlin/Function1;", "getSDKVersion", "getTrackingAvailable", "getUserCardKeysCount", "isUserCounting", "paramsCount", BuildConfig.FLAVOR, "setTrackingAvailable", SettingsJsonConstants.APP_STATUS_KEY, "updateValidator", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ProjectService implements IProjectService {
    private final IRepository projectRepository;
    private final IStateManager stateManager;

    public ProjectService(IStateManager iStateManager, IRepository iRepository) {
        Intrinsics.checkNotNullParameter(iStateManager, "stateManager");
        Intrinsics.checkNotNullParameter(iRepository, "projectRepository");
        this.stateManager = iStateManager;
        this.projectRepository = iRepository;
    }

    public void applyConfig(ConfigEntry config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Project activeProject = this.stateManager.getActiveProject();
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        Long version = exclude != null ? exclude.getVersion() : null;
        ExcludeEvents exclude2 = config.getExclude();
        if (Intrinsics.areEqual(version, exclude2 != null ? exclude2.getVersion() : null)) {
            config.setExclude(activeProject.getConfiguration().getExclude());
        }
        activeProject.setConfiguration(config);
        this.projectRepository.update(CollectionsKt.listOf(new EventParam("applicationKey", new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        Logger.INSTANCE.debug("The SDK analytics configuration has been received: " + JsonPretty.INSTANCE.toPrettyJson(activeProject.getConfiguration().getJson()), (Throwable) null);
        updateValidator();
    }

    public boolean checkIfNeedRemoveUsersData() {
        return !this.stateManager.getActiveProject().getConfiguration().getUserCounting();
    }

    public List<Transaction> gerActualPurchaseList(List<? extends JSONObject> list) throws JSONException {
        Object next;
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        try {
            for (JSONObject jSONObject : list) {
                String string = jSONObject.getString("productId");
                Object obj = jSONObject.get("orderId");
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((Transaction) next).getProductID(), string)) {
                        break;
                    }
                }
                Transaction transaction = (Transaction) next;
                if (transaction == null) {
                    if (obj instanceof JSONArray) {
                        Intrinsics.checkNotNullExpressionValue(string, "productId");
                        Intrinsics.checkNotNullExpressionValue(obj, "orderId");
                        arrayList.add(new Transaction(string, (JSONArray) obj));
                    } else if (obj instanceof String) {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(obj);
                        Intrinsics.checkNotNullExpressionValue(string, "productId");
                        arrayList.add(new Transaction(string, jSONArray));
                    }
                } else if (obj instanceof JSONArray) {
                    int length = ((JSONArray) obj).length();
                    for (int i = 0; i < length; i++) {
                        transaction.getTransactionIds().put(((JSONArray) obj).get(i));
                    }
                } else if (obj instanceof String) {
                    transaction.getTransactionIds().put(obj);
                }
            }
        } catch (JSONException e) {
            Logger.INSTANCE.error("gerActualPurchaseList err:", e);
        }
        return arrayList;
    }

    public AdvertisingIdResult getAdvertisingId() {
        return this.stateManager.getAdvertisingId();
    }

    public ApplicationData getAppData() {
        return this.stateManager.getApplicationData();
    }

    public DeviceConstants getDeviceConstants() {
        return this.stateManager.getDeviceConstants();
    }

    public DeviceIdentifiers getDeviceIdentifiers() {
        return this.stateManager.getActiveDeviceIdentifiers();
    }

    public DeviceResolution getDeviceResolution() {
        return this.stateManager.getDeviceResolution();
    }

    public DTDPlatformOwner getDeviseOwner() {
        return this.stateManager.getDeviseOwner();
    }

    public long getNumberOfCurrencies() {
        return this.stateManager.getActiveProject().getConfiguration().getNumberOfCurrencies();
    }

    public String getObfuscatedAccountId() {
        String strOffsetCharacterByOne;
        Long devtodevId = this.stateManager.getActiveDeviceIdentifiers().getDevtodevId();
        if (devtodevId != null) {
            return "d:" + devtodevId;
        }
        User activeUser = this.stateManager.getActiveUser();
        if (activeUser.isDefaultUser()) {
            return StringExtentionsKt.offsetCharacterByOne(this.stateManager.getActiveDeviceIdentifiers().getDeviceIdentifier());
        }
        String userId = activeUser.getUserId();
        return (userId == null || (strOffsetCharacterByOne = StringExtentionsKt.offsetCharacterByOne(userId)) == null) ? BuildConfig.FLAVOR : strOffsetCharacterByOne;
    }

    public void getReferrerData(Function1<? super String, Unit> installReferrer) {
        Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
        this.stateManager.getReferrerData(installReferrer);
    }

    public String getSDKVersion() {
        return this.stateManager.getApplicationData().getSdkVersionName();
    }

    public boolean getTrackingAvailable() {
        return this.stateManager.getActiveProject().getTrackingAvailable();
    }

    public long getUserCardKeysCount() {
        return this.stateManager.getActiveProject().getConfiguration().getUserCardKeysCount();
    }

    public boolean isRefererSent() {
        return this.stateManager.getActiveProject().isReferralSent();
    }

    public boolean isUserCounting() {
        return this.stateManager.getActiveProject().getConfiguration().getUserCounting();
    }

    public int paramsCount() {
        return this.stateManager.getActiveProject().getConfiguration().getEventParamsCount();
    }

    public void setRefererSent(boolean z) {
        Project activeProject = this.stateManager.getActiveProject();
        if (activeProject.getTrackingAvailable()) {
            activeProject.setReferralSent(z);
            this.projectRepository.update(CollectionsKt.listOf(new EventParam("applicationKey", new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        }
    }

    public void setTrackingAvailable(boolean status) {
        Project activeProject = this.stateManager.getActiveProject();
        activeProject.setTrackingAvailable(status);
        this.projectRepository.update(CollectionsKt.listOf(new EventParam("applicationKey", new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
        Logger.info$default(Logger.INSTANCE, "Tracking status is " + (status ? "Enable" : "Disable"), (Throwable) null, 2, (Object) null);
    }

    public void updateValidator() {
        Project activeProject = this.stateManager.getActiveProject();
        Validator validator = Validator.INSTANCE;
        ExcludeEvents exclude = activeProject.getConfiguration().getExclude();
        validator.setExcludedOptions(exclude != null ? exclude.getExcludeEvents() : null);
        validator.setNumberOfCurrencies(Long.valueOf(activeProject.getConfiguration().getNumberOfCurrencies()));
    }
}
