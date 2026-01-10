package com.devtodev.analytics.internal.backend.repository;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RemoteConfigSealedClass.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/devtodev/analytics/internal/backend/repository/UserProperties;", BuildConfig.FLAVOR, "country", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class UserProperties {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String country;

    /* compiled from: RemoteConfigSealedClass.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/devtodev/analytics/internal/backend/repository/UserProperties$Companion;", BuildConfig.FLAVOR, "()V", "fromJson", "Lcom/devtodev/analytics/internal/backend/repository/UserProperties;", "json", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserProperties fromJson(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                if (jSONObject.isNull("country")) {
                    return null;
                }
                return new UserProperties(jSONObject.getString("country"));
            } catch (JSONException e) {
                Logger.INSTANCE.error("When trying to get json string from \n\t[" + json + "] object\nan Error has occurred:", e);
                return null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserProperties() {
        String str = null;
        this(str, 1, str);
    }

    public UserProperties(String str) {
        this.country = str;
    }

    public static /* synthetic */ UserProperties copy$default(UserProperties userProperties, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProperties.country;
        }
        return userProperties.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final UserProperties copy(String country) {
        return new UserProperties(country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserProperties) && Intrinsics.areEqual(this.country, ((UserProperties) other).country);
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public String toString() {
        return "UserProperties(country=" + this.country + ")";
    }

    public /* synthetic */ UserProperties(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
