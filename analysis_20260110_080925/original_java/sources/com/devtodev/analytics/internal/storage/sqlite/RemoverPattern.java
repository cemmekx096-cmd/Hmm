package com.devtodev.analytics.internal.storage.sqlite;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;

/* compiled from: SqlCommand.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/devtodev/analytics/internal/storage/sqlite/RemoverPattern;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JEST_ONE", "EXCEPT_ONE", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum RemoverPattern {
    JEST_ONE("=?"),
    EXCEPT_ONE("!=?");

    private final String value;

    RemoverPattern(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
