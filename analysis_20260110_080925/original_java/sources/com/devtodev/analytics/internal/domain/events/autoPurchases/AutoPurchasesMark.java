package com.devtodev.analytics.internal.domain.events.autoPurchases;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.a;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
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

/* compiled from: AutoPurchasesMark.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0016J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006&"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/autoPurchases/AutoPurchasesMark;", "Lcom/devtodev/analytics/internal/domain/DbModel;", "idKey", BuildConfig.FLAVOR, "projectId", "orderId", BuildConfig.FLAVOR, "(JJLjava/lang/String;)V", "getIdKey", "()J", "setIdKey", "(J)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getProjectId", "setProjectId", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "getModelColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "hashCode", BuildConfig.FLAVOR, "toList", "Lcom/devtodev/analytics/internal/storage/EventParam;", "toString", "updateData", BuildConfig.FLAVOR, "eventParams", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* data */ class AutoPurchasesMark extends DbModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long idKey;
    private String orderId;
    private long projectId;

    /* compiled from: AutoPurchasesMark.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/autoPurchases/AutoPurchasesMark$Companion;", BuildConfig.FLAVOR, "()V", "getColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "init", "Lcom/devtodev/analytics/internal/domain/DbModel;", "records", "Lcom/devtodev/analytics/internal/storage/sqlite/SelectRecords;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf(new SelectParameter[]{new SelectParameter(LevelResourceEntry.id, columnTypeLong), new SelectParameter("projectId", columnTypeLong), new SelectParameter("orderId", ColumnTypeString.INSTANCE)});
        }

        public final DbModel init(SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue.Long eventValue = records.getEventValue(LevelResourceEntry.id);
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = eventValue.getALong();
            SqlValue.Long eventValue2 = records.getEventValue("projectId");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = eventValue2.getALong();
            SqlValue.String eventValue3 = records.getEventValue("orderId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new AutoPurchasesMark(aLong, aLong2, eventValue3.getString());
        }
    }

    public /* synthetic */ AutoPurchasesMark(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, j2, str);
    }

    public static /* synthetic */ AutoPurchasesMark copy$default(AutoPurchasesMark autoPurchasesMark, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = autoPurchasesMark.getIdKey();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = autoPurchasesMark.projectId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = autoPurchasesMark.orderId;
        }
        return autoPurchasesMark.copy(j3, j4, str);
    }

    public final long component1() {
        return getIdKey();
    }

    /* renamed from: component2, reason: from getter */
    public final long getProjectId() {
        return this.projectId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final AutoPurchasesMark copy(long idKey, long projectId, String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new AutoPurchasesMark(idKey, projectId, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPurchasesMark)) {
            return false;
        }
        AutoPurchasesMark autoPurchasesMark = (AutoPurchasesMark) other;
        return getIdKey() == autoPurchasesMark.getIdKey() && this.projectId == autoPurchasesMark.projectId && Intrinsics.areEqual(this.orderId, autoPurchasesMark.orderId);
    }

    public long getIdKey() {
        return this.idKey;
    }

    public List<SelectParameter> getModelColumnsTypes() {
        return INSTANCE.getColumnsTypes();
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        return this.orderId.hashCode() + a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31);
    }

    public void setIdKey(long j) {
        this.idKey = j;
    }

    public final void setOrderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setProjectId(long j) {
        this.projectId = j;
    }

    public List<EventParam> toList() {
        return CollectionsKt.listOf(new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam("orderId", new SqlValue.String(this.orderId))});
    }

    public String toString() {
        return "AutoPurchasesMark(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", orderId=" + this.orderId + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "projectId");
        if (eventParamContainsName != null) {
            SqlValue.Long value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.projectId = value.getALong();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "orderId");
        if (eventParamContainsName2 != null) {
            SqlValue.String value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.orderId = value2.getString();
        }
    }

    public AutoPurchasesMark(long j, long j2, String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.idKey = j;
        this.projectId = j2;
        this.orderId = str;
    }
}
