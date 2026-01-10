package com.devtodev.analytics.internal.domain.events.currencyAccrual;

import com.crashlytics.android.BuildConfig;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LevelResourceType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "(Ljava/lang/String;IJ)V", "getValue", "()J", "Earned", "Bought", "Spent", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum LevelResourceType {
    Earned(0),
    Bought(1),
    Spent(2);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long value;

    /* compiled from: LevelResourceType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType$Companion;", BuildConfig.FLAVOR, "()V", "fromLong", "Lcom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType;", "value", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LevelResourceType fromLong(long value) {
            for (LevelResourceType levelResourceType : LevelResourceType.values()) {
                if (levelResourceType.getValue() == value) {
                    return levelResourceType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    LevelResourceType(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }
}
