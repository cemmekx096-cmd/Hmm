package com.devtodev.analytics.internal.platform.repository.playservice;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;

/* compiled from: IInstallReferrerConnectionListeners.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/playservice/IInstallReferrerStopConnectionListener;", BuildConfig.FLAVOR, "referrerConnectionClosed", BuildConfig.FLAVOR, "referrerObjectNotExist", "referrerServiceNoDefinition", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface IInstallReferrerStopConnectionListener {
    void referrerConnectionClosed();

    void referrerObjectNotExist();

    void referrerServiceNoDefinition();
}
