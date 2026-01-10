package com.devtodev.analytics.internal.platform.repository.playservice;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;

/* compiled from: IReferrerStateListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/devtodev/analytics/internal/platform/repository/playservice/IReferrerStateListener;", BuildConfig.FLAVOR, "onReferrerState", BuildConfig.FLAVOR, "referrerState", "Lcom/devtodev/analytics/internal/platform/repository/playservice/ReferrerState;", "onReferrerStateClose", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface IReferrerStateListener {
    void onReferrerState(ReferrerState referrerState);

    void onReferrerStateClose(ReferrerState referrerState);
}
