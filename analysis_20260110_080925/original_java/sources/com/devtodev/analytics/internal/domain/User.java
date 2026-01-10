package com.devtodev.analytics.internal.domain;

import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.a;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeInt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLongOrNull;
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

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 K2\u00020\u0001:\u0001KB}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0002\u0010\u0011J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010;\u001a\u00020\u000eHÆ\u0003J\u0086\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\t\u0010D\u001a\u00020\u0006HÖ\u0001J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020F0BH\u0016J\t\u0010G\u001a\u00020\tHÖ\u0001J\u0016\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020F0BH\u0016R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*¨\u0006L"}, d2 = {"Lcom/devtodev/analytics/internal/domain/User;", "Lcom/devtodev/analytics/internal/domain/DbModel;", "idKey", BuildConfig.FLAVOR, "projectId", "level", BuildConfig.FLAVOR, "sessionId", "userId", BuildConfig.FLAVOR, "previousUserId", "lastForegroundTime", "lastBackgroundTime", "isDefaultUser", BuildConfig.FLAVOR, "isResourceAggregationEnable", "balanceIsSent", "(JJILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZZ)V", "getBalanceIsSent", "()Z", "setBalanceIsSent", "(Z)V", "getIdKey", "()J", "setIdKey", "(J)V", "setDefaultUser", "setResourceAggregationEnable", "getLastBackgroundTime", "()Ljava/lang/Long;", "setLastBackgroundTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLastForegroundTime", "setLastForegroundTime", "getLevel", "()I", "setLevel", "(I)V", "getPreviousUserId", "()Ljava/lang/String;", "setPreviousUserId", "(Ljava/lang/String;)V", "getProjectId", "setProjectId", "getSessionId", "setSessionId", "getUserId", "setUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZZ)Lcom/devtodev/analytics/internal/domain/User;", "equals", "other", BuildConfig.FLAVOR, "getModelColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "hashCode", "toList", "Lcom/devtodev/analytics/internal/storage/EventParam;", "toString", "updateData", BuildConfig.FLAVOR, "eventParams", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* data */ class User extends DbModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean balanceIsSent;
    private long idKey;
    private boolean isDefaultUser;
    private boolean isResourceAggregationEnable;
    private Long lastBackgroundTime;
    private Long lastForegroundTime;
    private int level;
    private String previousUserId;
    private long projectId;
    private Long sessionId;
    private String userId;

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/devtodev/analytics/internal/domain/User$Companion;", BuildConfig.FLAVOR, "()V", "getColumnsTypes", BuildConfig.FLAVOR, "Lcom/devtodev/analytics/internal/storage/sqlite/SelectParameter;", "init", "Lcom/devtodev/analytics/internal/domain/DbModel;", "records", "Lcom/devtodev/analytics/internal/storage/sqlite/SelectRecords;", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            ColumnTypeLongOrNull columnTypeLongOrNull = ColumnTypeLongOrNull.INSTANCE;
            ColumnTypeStringOrNull columnTypeStringOrNull = ColumnTypeStringOrNull.INSTANCE;
            ColumnTypeBoolean columnTypeBoolean = ColumnTypeBoolean.INSTANCE;
            return CollectionsKt.listOf(new SelectParameter[]{new SelectParameter(LevelResourceEntry.id, columnTypeLong), new SelectParameter("projectId", columnTypeLong), new SelectParameter("level", ColumnTypeInt.INSTANCE), new SelectParameter("sessionId", columnTypeLongOrNull), new SelectParameter("userId", columnTypeStringOrNull), new SelectParameter("previousUserId", columnTypeStringOrNull), new SelectParameter("lastForegroundTime", columnTypeLongOrNull), new SelectParameter("lastBackgroundTime", columnTypeLongOrNull), new SelectParameter("isDefaultUser", columnTypeBoolean), new SelectParameter("isResourceAggregationEnable", columnTypeBoolean)});
        }

        public final DbModel init(SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue.Long eventValue = records.getEventValue(LevelResourceEntry.id);
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = eventValue.getALong();
            SqlValue.Long eventValue2 = records.getEventValue("projectId");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = eventValue2.getALong();
            SqlValue.Int eventValue3 = records.getEventValue("level");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
            int anInt = eventValue3.getAnInt();
            SqlValue.LongOrNull eventValue4 = records.getEventValue("sessionId");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong3 = eventValue4.getALong();
            SqlValue.StringOrNull eventValue5 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string = eventValue5.getString();
            SqlValue.StringOrNull eventValue6 = records.getEventValue("previousUserId");
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string2 = eventValue6.getString();
            SqlValue.LongOrNull eventValue7 = records.getEventValue("lastForegroundTime");
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong4 = eventValue7.getALong();
            SqlValue.LongOrNull eventValue8 = records.getEventValue("lastBackgroundTime");
            Intrinsics.checkNotNull(eventValue8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong5 = eventValue8.getALong();
            SqlValue.Boolean eventValue9 = records.getEventValue("isDefaultUser");
            Intrinsics.checkNotNull(eventValue9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = eventValue9.getABoolean();
            SqlValue.Boolean eventValue10 = records.getEventValue("isResourceAggregationEnable");
            Intrinsics.checkNotNull(eventValue10, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new User(aLong, aLong2, anInt, aLong3, string, string2, aLong4, aLong5, aBoolean, eventValue10.getABoolean(), false, RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED, null);
        }
    }

    public User() {
        this(0L, 0L, 0, null, null, null, null, null, false, false, false, 2047, null);
    }

    public /* synthetic */ User(long j, long j2, int i, Long l, String str, String str2, Long l2, Long l3, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) == 0 ? j2 : -1L, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : l2, (i2 & RendererCapabilities.DECODER_SUPPORT_PRIMARY) == 0 ? l3 : null, (i2 & 256) != 0 ? false : z, (i2 & RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED) == 0 ? z2 : true, (i2 & RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED) == 0 ? z3 : false);
    }

    public final long component1() {
        return getIdKey();
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsResourceAggregationEnable() {
        return this.isResourceAggregationEnable;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getBalanceIsSent() {
        return this.balanceIsSent;
    }

    /* renamed from: component2, reason: from getter */
    public final long getProjectId() {
        return this.projectId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPreviousUserId() {
        return this.previousUserId;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getLastForegroundTime() {
        return this.lastForegroundTime;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getLastBackgroundTime() {
        return this.lastBackgroundTime;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsDefaultUser() {
        return this.isDefaultUser;
    }

    public final User copy(long idKey, long projectId, int level, Long sessionId, String userId, String previousUserId, Long lastForegroundTime, Long lastBackgroundTime, boolean isDefaultUser, boolean isResourceAggregationEnable, boolean balanceIsSent) {
        return new User(idKey, projectId, level, sessionId, userId, previousUserId, lastForegroundTime, lastBackgroundTime, isDefaultUser, isResourceAggregationEnable, balanceIsSent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return getIdKey() == user.getIdKey() && this.projectId == user.projectId && this.level == user.level && Intrinsics.areEqual(this.sessionId, user.sessionId) && Intrinsics.areEqual(this.userId, user.userId) && Intrinsics.areEqual(this.previousUserId, user.previousUserId) && Intrinsics.areEqual(this.lastForegroundTime, user.lastForegroundTime) && Intrinsics.areEqual(this.lastBackgroundTime, user.lastBackgroundTime) && this.isDefaultUser == user.isDefaultUser && this.isResourceAggregationEnable == user.isResourceAggregationEnable && this.balanceIsSent == user.balanceIsSent;
    }

    public final boolean getBalanceIsSent() {
        return this.balanceIsSent;
    }

    public long getIdKey() {
        return this.idKey;
    }

    public final Long getLastBackgroundTime() {
        return this.lastBackgroundTime;
    }

    public final Long getLastForegroundTime() {
        return this.lastForegroundTime;
    }

    public final int getLevel() {
        return this.level;
    }

    public List<SelectParameter> getModelColumnsTypes() {
        return INSTANCE.getColumnsTypes();
    }

    public final String getPreviousUserId() {
        return this.previousUserId;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.level) + a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31)) * 31;
        Long l = this.sessionId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.userId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousUserId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.lastForegroundTime;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.lastBackgroundTime;
        int iHashCode6 = (iHashCode5 + (l3 != null ? l3.hashCode() : 0)) * 31;
        boolean z = this.isDefaultUser;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode6 + i) * 31;
        boolean z2 = this.isResourceAggregationEnable;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.balanceIsSent;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isDefaultUser() {
        return this.isDefaultUser;
    }

    public final boolean isResourceAggregationEnable() {
        return this.isResourceAggregationEnable;
    }

    public final void setBalanceIsSent(boolean z) {
        this.balanceIsSent = z;
    }

    public final void setDefaultUser(boolean z) {
        this.isDefaultUser = z;
    }

    public void setIdKey(long j) {
        this.idKey = j;
    }

    public final void setLastBackgroundTime(Long l) {
        this.lastBackgroundTime = l;
    }

    public final void setLastForegroundTime(Long l) {
        this.lastForegroundTime = l;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setPreviousUserId(String str) {
        this.previousUserId = str;
    }

    public final void setProjectId(long j) {
        this.projectId = j;
    }

    public final void setResourceAggregationEnable(boolean z) {
        this.isResourceAggregationEnable = z;
    }

    public final void setSessionId(Long l) {
        this.sessionId = l;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public List<EventParam> toList() {
        return CollectionsKt.listOf(new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam("level", new SqlValue.Int(this.level)), new EventParam("sessionId", new SqlValue.LongOrNull(this.sessionId)), new EventParam("userId", new SqlValue.StringOrNull(this.userId)), new EventParam("previousUserId", new SqlValue.StringOrNull(this.previousUserId)), new EventParam("lastForegroundTime", new SqlValue.LongOrNull(this.lastForegroundTime)), new EventParam("lastBackgroundTime", new SqlValue.LongOrNull(this.lastBackgroundTime)), new EventParam("isDefaultUser", new SqlValue.Boolean(this.isDefaultUser)), new EventParam("isResourceAggregationEnable", new SqlValue.Boolean(this.isResourceAggregationEnable))});
    }

    public String toString() {
        return "User(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", level=" + this.level + ", sessionId=" + this.sessionId + ", userId=" + this.userId + ", previousUserId=" + this.previousUserId + ", lastForegroundTime=" + this.lastForegroundTime + ", lastBackgroundTime=" + this.lastBackgroundTime + ", isDefaultUser=" + this.isDefaultUser + ", isResourceAggregationEnable=" + this.isResourceAggregationEnable + ", balanceIsSent=" + this.balanceIsSent + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "level");
        if (eventParamContainsName != null) {
            SqlValue.Int value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
            this.level = value.getAnInt();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "sessionId");
        if (eventParamContainsName2 != null) {
            SqlValue.LongOrNull value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.sessionId = value2.getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "userId");
        if (eventParamContainsName3 != null) {
            SqlValue.StringOrNull value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.userId = value3.getString();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, "previousUserId");
        if (eventParamContainsName4 != null) {
            SqlValue.StringOrNull value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.previousUserId = value4.getString();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, "lastForegroundTime");
        if (eventParamContainsName5 != null) {
            SqlValue.LongOrNull value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.lastForegroundTime = value5.getALong();
        }
        EventParam eventParamContainsName6 = EventParamKt.containsName(list, "lastBackgroundTime");
        if (eventParamContainsName6 != null) {
            SqlValue.LongOrNull value6 = eventParamContainsName6.getValue();
            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.lastBackgroundTime = value6.getALong();
        }
        EventParam eventParamContainsName7 = EventParamKt.containsName(list, "isDefaultUser");
        if (eventParamContainsName7 != null) {
            SqlValue.Boolean value7 = eventParamContainsName7.getValue();
            Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isDefaultUser = value7.getABoolean();
        }
        EventParam eventParamContainsName8 = EventParamKt.containsName(list, "isResourceAggregationEnable");
        if (eventParamContainsName8 != null) {
            SqlValue.Boolean value8 = eventParamContainsName8.getValue();
            Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isResourceAggregationEnable = value8.getABoolean();
        }
    }

    public User(long j, long j2, int i, Long l, String str, String str2, Long l2, Long l3, boolean z, boolean z2, boolean z3) {
        this.idKey = j;
        this.projectId = j2;
        this.level = i;
        this.sessionId = l;
        this.userId = str;
        this.previousUserId = str2;
        this.lastForegroundTime = l2;
        this.lastBackgroundTime = l3;
        this.isDefaultUser = z;
        this.isResourceAggregationEnable = z2;
        this.balanceIsSent = z3;
    }
}
