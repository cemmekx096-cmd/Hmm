package com.devtodev.analytics.internal.services.abtests;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.helpfultools.ABTestInitialData;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.LevelResourceEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvolvedExperimentsService.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u000fH\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010$\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/devtodev/analytics/internal/services/abtests/InvolvedExperimentsService;", "Lcom/devtodev/analytics/internal/services/abtests/IInvolvedExperimentsService;", "stateManager", "Lcom/devtodev/analytics/internal/managers/IStateManager;", "abTestExperimentsStorage", "Lcom/devtodev/analytics/internal/storage/IRepository;", "abTestExperimentsStateStorage", "abTestInitialData", "Lcom/devtodev/analytics/internal/helpfultools/ABTestInitialData;", "(Lcom/devtodev/analytics/internal/managers/IStateManager;Lcom/devtodev/analytics/internal/storage/IRepository;Lcom/devtodev/analytics/internal/storage/IRepository;Lcom/devtodev/analytics/internal/helpfultools/ABTestInitialData;)V", "experimentMarker", "Lcom/devtodev/analytics/internal/domain/events/abTests/ExperimentMarker;", "isExperimentActivated", BuildConfig.FLAVOR, "activateExperimentMarker", BuildConfig.FLAVOR, "cacheExperimentMarker", "involvedExperiments", "clearExperimentMarker", "getAllExperiments", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperiment;", "getCacheExperimentMarker", "getExperimentStates", "Lcom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperimentState;", "user", "Lcom/devtodev/analytics/internal/domain/User;", "isActiveExperimentStarted", "isExperimentTesting", "idKey", BuildConfig.FLAVOR, "isMarkedExperimentFound", "isNeedCacheTestingExperiment", "isUserHasInvolvedGroup", "resetSearchInvolvedExperiment", "searchInvolvedExperimentState", "startActiveExperiment", "stopActiveExperiment", "tryLoadExperimentMarker", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class InvolvedExperimentsService implements IInvolvedExperimentsService {
    private final IRepository abTestExperimentsStateStorage;
    private final IRepository abTestExperimentsStorage;
    private final ABTestInitialData abTestInitialData;
    private ExperimentMarker experimentMarker;
    private boolean isExperimentActivated;
    private final IStateManager stateManager;

    public InvolvedExperimentsService(IStateManager iStateManager, IRepository iRepository, IRepository iRepository2, ABTestInitialData aBTestInitialData) {
        Intrinsics.checkNotNullParameter(iStateManager, "stateManager");
        Intrinsics.checkNotNullParameter(iRepository, "abTestExperimentsStorage");
        Intrinsics.checkNotNullParameter(iRepository2, "abTestExperimentsStateStorage");
        Intrinsics.checkNotNullParameter(aBTestInitialData, "abTestInitialData");
        this.stateManager = iStateManager;
        this.abTestExperimentsStorage = iRepository;
        this.abTestExperimentsStateStorage = iRepository2;
        this.abTestInitialData = aBTestInitialData;
    }

    private final List<AbTestsExperiment> getAllExperiments() {
        Project activeProject = this.stateManager.getActiveProject();
        List all = this.abTestExperimentsStorage.getAll(AbTestsExperiment.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((AbTestsExperiment) obj).getProjectId() == activeProject.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<AbTestsExperimentState> getExperimentStates(User user) {
        List all = this.abTestExperimentsStateStorage.getAll(AbTestsExperimentState.INSTANCE.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((AbTestsExperimentState) obj).getUserId() == user.getIdKey()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void resetSearchInvolvedExperiment() {
        AbTestsExperimentState abTestsExperimentStateSearchInvolvedExperimentState = searchInvolvedExperimentState();
        if (abTestsExperimentStateSearchInvolvedExperimentState != null) {
            abTestsExperimentStateSearchInvolvedExperimentState.setInvolvement(null);
            this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam(LevelResourceEntry.id, new SqlValue.Long(abTestsExperimentStateSearchInvolvedExperimentState.getIdKey()))), abTestsExperimentStateSearchInvolvedExperimentState);
        }
    }

    private final AbTestsExperimentState searchInvolvedExperimentState() {
        Object next;
        Iterator<T> it = getExperimentStates(this.stateManager.getActiveUser()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbTestsExperimentState) next).getInvolvement() != null) {
                break;
            }
        }
        return (AbTestsExperimentState) next;
    }

    public void activateExperimentMarker() {
        Object next;
        ExperimentMarker experimentMarker = this.experimentMarker;
        if (experimentMarker != null) {
            Iterator<T> it = getExperimentStates(this.stateManager.getActiveUser()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AbTestsExperimentState) next).getExperimentId() == experimentMarker.getIdKey()) {
                        break;
                    }
                }
            }
            AbTestsExperimentState abTestsExperimentState = (AbTestsExperimentState) next;
            if (abTestsExperimentState != null) {
                abTestsExperimentState.setInvolvement(experimentMarker);
                this.abTestExperimentsStateStorage.update(CollectionsKt.listOf(new EventParam(LevelResourceEntry.id, new SqlValue.Long(abTestsExperimentState.getIdKey()))), abTestsExperimentState);
            }
        }
    }

    public void cacheExperimentMarker(ExperimentMarker involvedExperiments) {
        this.experimentMarker = involvedExperiments;
    }

    public void clearExperimentMarker() {
        this.experimentMarker = null;
        resetSearchInvolvedExperiment();
    }

    /* renamed from: getCacheExperimentMarker, reason: from getter */
    public ExperimentMarker getExperimentMarker() {
        return this.experimentMarker;
    }

    /* renamed from: isActiveExperimentStarted, reason: from getter */
    public boolean getIsExperimentActivated() {
        return this.isExperimentActivated;
    }

    public boolean isExperimentTesting(long idKey) {
        Object next;
        Iterator<T> it = getAllExperiments().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbTestsExperiment) next).getExperimentId() == idKey) {
                break;
            }
        }
        AbTestsExperiment abTestsExperiment = (AbTestsExperiment) next;
        if (abTestsExperiment != null) {
            return abTestsExperiment.isTesting();
        }
        return false;
    }

    public boolean isMarkedExperimentFound() {
        return searchInvolvedExperimentState() != null;
    }

    public boolean isNeedCacheTestingExperiment() {
        return this.abTestInitialData.getCacheTestExperiment();
    }

    public boolean isUserHasInvolvedGroup(User user) {
        Object next;
        Intrinsics.checkNotNullParameter(user, "user");
        Iterator<T> it = getExperimentStates(user).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbTestsExperimentState) next).getInvolvement() != null) {
                break;
            }
        }
        return ((AbTestsExperimentState) next) != null;
    }

    public void startActiveExperiment() {
        this.isExperimentActivated = true;
    }

    public void stopActiveExperiment() {
        this.isExperimentActivated = false;
    }

    public ExperimentMarker tryLoadExperimentMarker() {
        if (this.experimentMarker == null) {
            AbTestsExperimentState abTestsExperimentStateSearchInvolvedExperimentState = searchInvolvedExperimentState();
            this.experimentMarker = abTestsExperimentStateSearchInvolvedExperimentState != null ? abTestsExperimentStateSearchInvolvedExperimentState.getInvolvement() : null;
        }
        return this.experimentMarker;
    }
}
