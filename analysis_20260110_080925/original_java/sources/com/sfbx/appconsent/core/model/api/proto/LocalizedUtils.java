package com.sfbx.appconsent.core.model.api.proto;

import com.crashlytics.android.BuildConfig;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalizedUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0000¢\u0006\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/proto/LocalizedUtils;", BuildConfig.FLAVOR, "()V", "getNameByAppConsentThemeLocal", BuildConfig.FLAVOR, "appconsentThemeLocal", "names", "Lcom/sfbx/appconsent/core/model/api/proto/I18NString;", "getNameByAppConsentThemeLocal$appconsent_core_prodPremiumRelease", BuildConfig.FLAVOR, "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class LocalizedUtils {
    public static final LocalizedUtils INSTANCE = new LocalizedUtils();

    private LocalizedUtils() {
    }

    public final String getNameByAppConsentThemeLocal$appconsent_core_prodPremiumRelease(String appconsentThemeLocal, I18NString names) {
        Intrinsics.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        Intrinsics.checkNotNullParameter(names, "names");
        return getNameByAppConsentThemeLocal$appconsent_core_prodPremiumRelease(appconsentThemeLocal, names.getValues());
    }

    public final String getNameByAppConsentThemeLocal$appconsent_core_prodPremiumRelease(String appconsentThemeLocal, Map<String, String> names) {
        String str;
        Intrinsics.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        Intrinsics.checkNotNullParameter(names, "names");
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (names.keySet().isEmpty() || names.values().isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        if (names.containsKey(appconsentThemeLocal)) {
            str = names.get(appconsentThemeLocal);
            if (str == null) {
                return BuildConfig.FLAVOR;
            }
        } else {
            String language2 = Locale.ENGLISH.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "ENGLISH.language");
            String lowerCase2 = language2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (names.containsKey(lowerCase)) {
                str = names.get(lowerCase);
                if (str == null) {
                    return BuildConfig.FLAVOR;
                }
            } else if (names.containsKey(lowerCase2)) {
                str = names.get(lowerCase2);
                if (str == null) {
                    return BuildConfig.FLAVOR;
                }
            } else {
                try {
                    str = (String) CollectionsKt.first(names.values());
                } catch (Exception unused) {
                    return BuildConfig.FLAVOR;
                }
            }
        }
        return str;
    }
}
