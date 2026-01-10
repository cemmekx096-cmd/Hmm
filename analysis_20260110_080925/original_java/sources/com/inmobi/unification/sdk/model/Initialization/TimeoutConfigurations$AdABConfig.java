package com.inmobi.unification.sdk.model.Initialization;

import com.crashlytics.android.BuildConfig;
import com.inmobi.media.Cc;
import com.inmobi.media.Ec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"com/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdABConfig", BuildConfig.FLAVOR, "<init>", "()V", "Lorg/json/JSONObject;", "loadTimeout", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "getLoadTimeout", "()Lorg/json/JSONObject;", "getRetryInterval", "getMaxRetries", BuildConfig.FLAVOR, "isValid", "()Z", "Lorg/json/JSONObject;", "loadRetryInterval", "maxLoadRetries", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class TimeoutConfigurations$AdABConfig {
    private JSONObject loadRetryInterval;
    private JSONObject loadTimeout;
    private JSONObject maxLoadRetries;

    public TimeoutConfigurations$AdABConfig() {
        this.loadTimeout = new JSONObject();
        this.loadRetryInterval = new JSONObject();
        this.maxLoadRetries = new JSONObject();
    }

    public final JSONObject getLoadTimeout() {
        return this.loadTimeout;
    }

    /* renamed from: getMaxRetries, reason: from getter */
    public final JSONObject getMaxLoadRetries() {
        return this.maxLoadRetries;
    }

    /* renamed from: getRetryInterval, reason: from getter */
    public final JSONObject getLoadRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        Cc cc = Ec.Companion;
        cc.getClass();
        if (!((Boolean) Ec.W().invoke(this.loadTimeout, 0)).booleanValue()) {
            return false;
        }
        cc.getClass();
        if (!((Boolean) Ec.W().invoke(this.loadRetryInterval, 1)).booleanValue()) {
            return false;
        }
        cc.getClass();
        return ((Boolean) Ec.W().invoke(this.maxLoadRetries, 1)).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this();
        Intrinsics.checkNotNullParameter(jSONObject, "loadTimeout");
        Intrinsics.checkNotNullParameter(jSONObject2, "retryInterval");
        Intrinsics.checkNotNullParameter(jSONObject3, "maxRetries");
        this.loadTimeout = jSONObject;
        this.loadRetryInterval = jSONObject2;
        this.maxLoadRetries = jSONObject3;
    }
}
