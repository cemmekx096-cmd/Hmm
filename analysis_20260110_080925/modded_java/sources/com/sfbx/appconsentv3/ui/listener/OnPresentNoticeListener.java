package com.sfbx.appconsentv3.ui.listener;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* compiled from: OnPresentNoticeListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/sfbx/appconsentv3/ui/listener/OnPresentNoticeListener;", BuildConfig.FLAVOR, "presentConsentError", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR, "presentConsentGiven", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface OnPresentNoticeListener {
    void presentConsentError(Throwable error);

    void presentConsentGiven();
}
