package com.devtodev.analytics.internal.services;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResourceType;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IResourceRepository;
import com.devtodev.analytics.internal.storage.sqlite.LevelResourceEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LevelResourceService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J(\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/devtodev/analytics/internal/services/LevelResourceService;", "Lcom/devtodev/analytics/internal/services/ILevelResourceService;", "stateManager", "Lcom/devtodev/analytics/internal/managers/IStateManager;", "levelResourcesRepository", "Lcom/devtodev/analytics/internal/storage/IResourceRepository;", "(Lcom/devtodev/analytics/internal/managers/IStateManager;Lcom/devtodev/analytics/internal/storage/IResourceRepository;)V", "addLevelResource", BuildConfig.FLAVOR, "resource", "Lcom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResource;", "getBoughtResources", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/domain/events/Resources;", "numberOfCurrencies", "getEarnedResources", "getResources", "type", "Lcom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType;", "getSpendResources", "removeAllResources", "removeInactiveUsers", "users", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/domain/User;", "removeResourcesForActiveUser", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class LevelResourceService implements ILevelResourceService {
    private final IResourceRepository levelResourcesRepository;
    private final IStateManager stateManager;

    public LevelResourceService(IStateManager iStateManager, IResourceRepository iResourceRepository) {
        Intrinsics.checkNotNullParameter(iStateManager, "stateManager");
        Intrinsics.checkNotNullParameter(iResourceRepository, "levelResourcesRepository");
        this.stateManager = iStateManager;
        this.levelResourcesRepository = iResourceRepository;
    }

    private final Map<String, Long> getResources(LevelResourceType type, long numberOfCurrencies) {
        User activeUser = this.stateManager.getActiveUser();
        List listTake = CollectionsKt.take(this.levelResourcesRepository.getAll(LevelResource.Companion.getColumnsTypes()), (int) numberOfCurrencies);
        Intrinsics.checkNotNull(listTake, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource>");
        ArrayList<LevelResource> arrayList = new ArrayList();
        for (Object obj : listTake) {
            LevelResource levelResource = (LevelResource) obj;
            if (levelResource.getUserId() == activeUser.getIdKey() && levelResource.getType() == type) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LevelResource levelResource2 : arrayList) {
            linkedHashMap.put(levelResource2.getName(), Long.valueOf(levelResource2.getAmount()));
        }
        return linkedHashMap;
    }

    public void addLevelResource(LevelResource resource) {
        Object next;
        Intrinsics.checkNotNullParameter(resource, "resource");
        User activeUser = this.stateManager.getActiveUser();
        if (activeUser.isResourceAggregationEnable() && this.stateManager.getActiveProject().getTrackingAvailable()) {
            resource.setUserId(activeUser.getIdKey());
            List all = this.levelResourcesRepository.getAll(LevelResource.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource>");
            Iterator it = all.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                LevelResource levelResource = (LevelResource) next;
                if (levelResource.getUserId() == activeUser.getIdKey() && levelResource.getType() == resource.getType() && Intrinsics.areEqual(levelResource.getName(), resource.getName())) {
                    break;
                }
            }
            LevelResource levelResource2 = (LevelResource) next;
            if (levelResource2 == null) {
                this.levelResourcesRepository.insert(resource);
                Logger.debug$default(Logger.INSTANCE, "Insert LU resources: " + resource, (Throwable) null, 2, (Object) null);
                return;
            }
            if (levelResource2.getAmount() > 0) {
                if (resource.getAmount() <= Integer.MAX_VALUE - levelResource2.getAmount()) {
                    levelResource2.setAmount(resource.getAmount() + levelResource2.getAmount());
                } else {
                    levelResource2.setAmount(2147483647L);
                    Logger.error$default(Logger.INSTANCE, "LU resource: " + resource.getName() + " is overflow", (Throwable) null, 2, (Object) null);
                }
            } else {
                if (resource.getAmount() >= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN - levelResource2.getAmount()) {
                    levelResource2.setAmount(resource.getAmount() + levelResource2.getAmount());
                } else {
                    levelResource2.setAmount(-2147483648L);
                    Logger.error$default(Logger.INSTANCE, "LU resource: " + resource.getName() + " is overflow", (Throwable) null, 2, (Object) null);
                }
            }
            this.levelResourcesRepository.update(CollectionsKt.listOf(new EventParam(LevelResourceEntry.id, new SqlValue.Long(levelResource2.getIdKey()))), levelResource2);
            Logger.debug$default(Logger.INSTANCE, "Update LU resources: " + levelResource2, (Throwable) null, 2, (Object) null);
        }
    }

    public Map<String, Long> getBoughtResources(long numberOfCurrencies) {
        return getResources(LevelResourceType.Bought, numberOfCurrencies);
    }

    public Map<String, Long> getEarnedResources(long numberOfCurrencies) {
        return getResources(LevelResourceType.Earned, numberOfCurrencies);
    }

    public Map<String, Long> getSpendResources(long numberOfCurrencies) {
        return getResources(LevelResourceType.Spent, numberOfCurrencies);
    }

    public void removeAllResources() {
        this.levelResourcesRepository.deleteAll();
    }

    public void removeInactiveUsers(List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        this.levelResourcesRepository.deleteByUser(LevelResourceEntry.tableName, "userId", arrayList);
    }

    public void removeResourcesForActiveUser() {
        this.levelResourcesRepository.deleteByUser(LevelResourceEntry.tableName, "userId", CollectionsKt.listOf(Long.valueOf(this.stateManager.getActiveUser().getIdKey())));
    }
}
