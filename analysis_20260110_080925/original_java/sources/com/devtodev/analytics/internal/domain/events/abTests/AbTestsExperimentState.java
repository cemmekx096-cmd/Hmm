package com.devtodev.analytics.internal.domain.events.abTests;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.LevelResourceEntry;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: AbTestsExperimentState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cH\u0016J\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006$"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperimentState;", "Lcom/devtodev/analytics/internal/domain/DbModel;", "idKey", BuildConfig.FLAVOR, "userId", "experimentId", "runAbility", BuildConfig.FLAVOR, "involvement", "Lcom/devtodev/analytics/internal/domain/events/abTests/ExperimentMarker;", "(JJJZLcom/devtodev/analytics/internal/domain/events/abTests/ExperimentMarker;)V", "getExperimentId", "()J", "setExperimentId", "(J)V", "getIdKey", "setIdKey", "getInvolvement", "()Lcom/devtodev/analytics/internal/domain/events/abTests/ExperimentMarker;", "setInvolvement", "(Lcom/devtodev/analytics/internal/domain/events/abTests/ExperimentMarker;)V", "getRunAbility", "()Z", "setRunAbility", "(Z)V", "getUserId", "setUserId", "getModelColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "toList", "Lcom/devtodev/analytics/internal/storage/EventParam;", "updateData", BuildConfig.FLAVOR, "eventParams", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AbTestsExperimentState extends DbModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long experimentId;
    private long idKey;
    private ExperimentMarker involvement;
    private boolean runAbility;
    private long userId;

    /* compiled from: AbTestsExperimentState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperimentState$Companion;", BuildConfig.FLAVOR, "()V", "getColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "init", "Lcom/devtodev/analytics/internal/domain/DbModel;", "records", "Lcom/devtodev/analytics/internal/storage/sqlite/SelectRecords;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf(new SelectParameter[]{new SelectParameter(LevelResourceEntry.id, columnTypeLong), new SelectParameter("userId", columnTypeLong), new SelectParameter("experimentId", columnTypeLong), new SelectParameter("runAbility", ColumnTypeBoolean.INSTANCE), new SelectParameter("involvement", ColumnTypeStringOrNull.INSTANCE)});
        }

        public final DbModel init(SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue.Long eventValue = records.getEventValue(LevelResourceEntry.id);
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = eventValue.getALong();
            SqlValue.Long eventValue2 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = eventValue2.getALong();
            SqlValue.Long eventValue3 = records.getEventValue("experimentId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong3 = eventValue3.getALong();
            SqlValue.Boolean eventValue4 = records.getEventValue("runAbility");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = eventValue4.getABoolean();
            ExperimentMarker.Companion companion = ExperimentMarker.Companion;
            SqlValue.StringOrNull eventValue5 = records.getEventValue("involvement");
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            return new AbTestsExperimentState(aLong, aLong2, aLong3, aBoolean, companion.fromJson(eventValue5.getString()));
        }
    }

    public /* synthetic */ AbTestsExperimentState(long j, long j2, long j3, boolean z, ExperimentMarker experimentMarker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, j2, (i & 4) != 0 ? -1L : j3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : experimentMarker);
    }

    public final long getExperimentId() {
        return this.experimentId;
    }

    public long getIdKey() {
        return this.idKey;
    }

    public final ExperimentMarker getInvolvement() {
        return this.involvement;
    }

    public List<SelectParameter> getModelColumnsTypes() {
        return INSTANCE.getColumnsTypes();
    }

    public final boolean getRunAbility() {
        return this.runAbility;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setExperimentId(long j) {
        this.experimentId = j;
    }

    public void setIdKey(long j) {
        this.idKey = j;
    }

    public final void setInvolvement(ExperimentMarker experimentMarker) {
        this.involvement = experimentMarker;
    }

    public final void setRunAbility(boolean z) {
        this.runAbility = z;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public List<EventParam> toList() {
        JSONObject json;
        EventParam[] eventParamArr = new EventParam[4];
        eventParamArr[0] = new EventParam("userId", new SqlValue.Long(this.userId));
        eventParamArr[1] = new EventParam("experimentId", new SqlValue.Long(this.experimentId));
        eventParamArr[2] = new EventParam("runAbility", new SqlValue.Boolean(this.runAbility));
        ExperimentMarker experimentMarker = this.involvement;
        eventParamArr[3] = new EventParam("involvement", new SqlValue.StringOrNull((experimentMarker == null || (json = experimentMarker.toJson()) == null) ? null : json.toString()));
        return CollectionsKt.listOf(eventParamArr);
    }

    public void updateData(List<EventParam> eventParams) {
        Object next;
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        List<EventParam> list = toList();
        for (EventParam eventParam : eventParams) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EventParam eventParam2 = (EventParam) next;
                if (Intrinsics.areEqual(eventParam2.getName(), eventParam.getName()) && !Intrinsics.areEqual(eventParam2.getValue(), eventParam.getValue())) {
                    break;
                }
            }
            EventParam eventParam3 = (EventParam) next;
            if (eventParam3 != null) {
                eventParam3.setValue(eventParam.getValue());
            }
        }
        EventParam eventParamContainsName = EventParamKt.containsName(list, "userId");
        if (eventParamContainsName != null) {
            SqlValue.Long value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.userId = value.getALong();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "experimentId");
        if (eventParamContainsName2 != null) {
            SqlValue.Long value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.experimentId = value2.getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "runAbility");
        if (eventParamContainsName3 != null) {
            SqlValue.Boolean value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.runAbility = value3.getABoolean();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, "involvement");
        if (eventParamContainsName4 != null) {
            ExperimentMarker.Companion companion = ExperimentMarker.Companion;
            SqlValue.StringOrNull value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.involvement = companion.fromJson(value4.getString());
        }
    }

    public AbTestsExperimentState(long j, long j2, long j3, boolean z, ExperimentMarker experimentMarker) {
        this.idKey = j;
        this.userId = j2;
        this.experimentId = j3;
        this.runAbility = z;
        this.involvement = experimentMarker;
    }
}
