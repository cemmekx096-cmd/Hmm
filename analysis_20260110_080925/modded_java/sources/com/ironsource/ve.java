package com.ironsource;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ve;", "Lcom/ironsource/re;", BuildConfig.FLAVOR, "c", "Lcom/ironsource/we;", "b", BuildConfig.FLAVOR, "a", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "flagData", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ve implements re {

    /* renamed from: a, reason: from kotlin metadata */
    private final JSONObject data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ironsource/ve$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Z", "DEFAULT_ENABLE", BuildConfig.FLAVOR, "c", "I", "a", "()I", "DEFAULT_RECOVERY_STRATEGY", "d", "DEFAULT_TIMEOUT_IN_SECONDS", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: b, reason: from kotlin metadata */
        public static final boolean DEFAULT_ENABLE = false;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int DEFAULT_TIMEOUT_IN_SECONDS = 24;
        public static final a a = new a();

        /* renamed from: c, reason: from kotlin metadata */
        private static final int DEFAULT_RECOVERY_STRATEGY = we.c.b();

        private a() {
        }

        public final int a() {
            return DEFAULT_RECOVERY_STRATEGY;
        }
    }

    public ve(JSONObject jSONObject) {
        this.data = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    public long a() {
        return this.data.optInt("timeout", 24) * 1000;
    }

    public we b() {
        return we.b.a(this.data.optInt("strategy", a.a.a()));
    }

    public boolean c() {
        return this.data.optBoolean("enable", false);
    }
}
