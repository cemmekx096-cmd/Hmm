package com.devtodev.analytics.internal.modues.people;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.events.people.CheaterMark;
import com.devtodev.analytics.internal.domain.events.people.People;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.TesterMark;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IEventsService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.IUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeopleLogic.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00120\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0%H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/devtodev/analytics/internal/modues/people/PeopleLogic;", "Lcom/devtodev/analytics/internal/modues/people/IPeopleLogic;", "serviceFactory", "Lcom/devtodev/analytics/internal/core/IServicesFactory;", "(Lcom/devtodev/analytics/internal/core/IServicesFactory;)V", "activityService", "Lcom/devtodev/analytics/internal/services/IActivityService;", "eventsService", "Lcom/devtodev/analytics/internal/services/IEventsService;", "peopleService", "Lcom/devtodev/analytics/internal/services/IPeopleService;", "projectService", "Lcom/devtodev/analytics/internal/services/IProjectService;", "reportService", "Lcom/devtodev/analytics/internal/services/IReportService;", "userService", "Lcom/devtodev/analytics/internal/services/IUserService;", "clearUser", BuildConfig.FLAVOR, "generateCheaterEvent", "flag", BuildConfig.FLAVOR, "generatePeopleEvent", "needFullCard", "generateTesterEvent", "getValue", "key", BuildConfig.FLAVOR, "completionHandler", "Lkotlin/Function1;", "Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;", "increment", "value", "prepareCallBacks", "setValue", "unset", "properties", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class PeopleLogic implements IPeopleLogic {
    private final IActivityService activityService;
    private final IEventsService eventsService;
    private final IPeopleService peopleService;
    private final IProjectService projectService;
    private final IReportService reportService;
    private final IUserService userService;

    /* compiled from: PeopleLogic.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogic$prepareCallBacks$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, PeopleLogic.class, "generatePeopleEvent", "generatePeopleEvent(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((PeopleLogic) ((FunctionReferenceImpl) this).receiver).generatePeopleEvent(z);
        }
    }

    public PeopleLogic(IServicesFactory iServicesFactory) {
        Intrinsics.checkNotNullParameter(iServicesFactory, "serviceFactory");
        this.activityService = iServicesFactory.getActivityService();
        this.userService = iServicesFactory.getUserService();
        this.peopleService = iServicesFactory.getPeopleService();
        this.eventsService = iServicesFactory.getEventsService();
        this.reportService = iServicesFactory.getReportService();
        this.projectService = iServicesFactory.getProjectService();
    }

    private final void generateCheaterEvent(boolean flag) {
        int userLevel = this.userService.getUserLevel();
        Long sessionId = this.activityService.getSessionId();
        if (sessionId == null) {
            Logger.error$default(Logger.INSTANCE, "Failed to generate cheater event, sessionId is lost", (Throwable) null, 2, (Object) null);
        } else {
            this.eventsService.addEvent(new CheaterMark(sessionId.longValue(), userLevel, flag));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void generatePeopleEvent(boolean needFullCard) {
        Long sessionId;
        Map map;
        if (this.projectService.getTrackingAvailable()) {
            if ((this.peopleService.isNeedToSend() || needFullCard) && (sessionId = this.activityService.getSessionId()) != null) {
                long jLongValue = sessionId.longValue();
                int userLevel = this.userService.getUserLevel();
                if (this.peopleService.isNeedToClear()) {
                    map = null;
                } else {
                    Map parameters = this.peopleService.getParameters(needFullCard);
                    this.peopleService.clearChangedKeys();
                    if (parameters.isEmpty()) {
                        return;
                    } else {
                        map = parameters;
                    }
                }
                this.eventsService.addEvent(new People(userLevel, jLongValue, map, this.userService.getInProgressData()));
                this.peopleService.removeNulls();
                this.peopleService.unmarkUpdated();
                this.peopleService.unmarkCleared();
            }
        }
    }

    private final void generateTesterEvent(boolean flag) {
        int userLevel = this.userService.getUserLevel();
        Long sessionId = this.activityService.getSessionId();
        if (sessionId == null) {
            Logger.error$default(Logger.INSTANCE, "Failed to generate tester event, sessionId is lost", (Throwable) null, 2, (Object) null);
        } else {
            this.eventsService.addEvent(new TesterMark(sessionId.longValue(), userLevel, flag));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void clearUser() {
        this.peopleService.clearUser();
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void getValue(String key, Function1<? super PeopleParameter, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        if (Intrinsics.areEqual(key, PeopleReservedKeys.Cheater.getValue())) {
            completionHandler.invoke((Object) null);
        } else if (Intrinsics.areEqual(key, PeopleReservedKeys.Tester.getValue())) {
            completionHandler.invoke((Object) null);
        } else {
            this.peopleService.getValue(key, completionHandler);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void increment(String key, PeopleParameter value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.peopleService.increment(key, value);
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void prepareCallBacks() {
        this.peopleService.setOnGeneratePeopleEvent(new AnonymousClass1(this));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void setValue(String key, PeopleParameter value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(key, PeopleReservedKeys.Cheater.getValue())) {
            generateCheaterEvent(((PeopleParameterBoolean) value).getValue());
            this.reportService.sendBufferedEvents();
        } else {
            if (Intrinsics.areEqual(key, PeopleReservedKeys.Tester.getValue())) {
                generateTesterEvent(((PeopleParameterBoolean) value).getValue());
                this.reportService.sendBufferedEvents();
                return;
            }
            this.peopleService.setValue(key, value);
            if (this.peopleService.getCustomKeyParamsCount() > this.projectService.getUserCardKeysCount()) {
                this.peopleService.sendPeopleCard();
                this.peopleService.clearCustomParams();
            }
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void unset(List<String> properties) {
        Object obj;
        Object next;
        boolean z;
        Intrinsics.checkNotNullParameter(properties, "properties");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(properties);
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual((String) next, PeopleReservedKeys.Cheater.getValue())) {
                    break;
                }
            }
        }
        String str = (String) next;
        boolean z2 = true;
        if (str != null) {
            generateCheaterEvent(false);
            arrayList.remove(str);
            z = true;
        } else {
            z = false;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual((String) next2, PeopleReservedKeys.Tester.getValue())) {
                obj = next2;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            generateTesterEvent(false);
            arrayList.remove(str2);
        } else {
            z2 = z;
        }
        if (z2) {
            this.reportService.sendBufferedEvents();
        }
        this.peopleService.unset(properties);
    }
}
