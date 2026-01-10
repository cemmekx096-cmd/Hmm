package io.sfbx.appconsent.core.gcm.internal.datasource;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;

/* compiled from: GCMConstant.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/sfbx/appconsent/core/gcm/internal/datasource/GCMConstant;", BuildConfig.FLAVOR, "()V", "AC_ADVERTISING_PERSONALIZATION", BuildConfig.FLAVOR, "AC_ADVERTISING_STORAGE", "AC_ADVERTISING_USER_DATA", "AC_ALL", BuildConfig.FLAVOR, "getAC_ALL", "()[Ljava/lang/String;", "[Ljava/lang/String;", "AC_ANALYTICS_STORAGE", "ADVERTISING_PERSONALIZATION", "ADVERTISING_STORAGE", "ADVERTISING_USER_DATA", "ANALYTICS_STORAGE", "appconsent-core-gcm_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class GCMConstant {
    public static final String ADVERTISING_PERSONALIZATION = "google_analytics_default_allow_ad_personalization_signals";
    public static final String ADVERTISING_STORAGE = "google_analytics_default_allow_ad_storage";
    public static final String ADVERTISING_USER_DATA = "google_analytics_default_allow_ad_user_data";
    public static final String ANALYTICS_STORAGE = "google_analytics_default_allow_analytics_storage";
    public static final GCMConstant INSTANCE = new GCMConstant();
    public static final String AC_ANALYTICS_STORAGE = "appconsent_analytics_storage";
    public static final String AC_ADVERTISING_STORAGE = "appconsent_ad_storage";
    public static final String AC_ADVERTISING_USER_DATA = "appconsent_ad_user_data";
    public static final String AC_ADVERTISING_PERSONALIZATION = "appconsent_ad_personalization_signals";
    private static final String[] AC_ALL = {AC_ANALYTICS_STORAGE, AC_ADVERTISING_STORAGE, AC_ADVERTISING_USER_DATA, AC_ADVERTISING_PERSONALIZATION};

    private GCMConstant() {
    }

    public final String[] getAC_ALL() {
        return AC_ALL;
    }
}
