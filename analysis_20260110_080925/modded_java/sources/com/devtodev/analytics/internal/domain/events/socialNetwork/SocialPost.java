package com.devtodev.analytics.internal.domain.events.socialNetwork;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.a;
import com.devtodev.analytics.internal.backend.b;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SocialPost.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\b\u0010#\u001a\u00020\u0007H\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\b\u0010%\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, d2 = {"Lcom/devtodev/analytics/internal/domain/events/socialNetwork/SocialPost;", "Lcom/devtodev/analytics/internal/domain/events/IEncodable;", "level", BuildConfig.FLAVOR, "sessionId", BuildConfig.FLAVOR, "socialNetwork", BuildConfig.FLAVOR, "postReason", "inProgress", BuildConfig.FLAVOR, "(IJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "code", "getCode", "()Ljava/lang/String;", "getInProgress", "()Ljava/util/List;", "getLevel", "()I", "getPostReason", "getSessionId", "()J", "getSocialNetwork", "timestamp", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "getJson", "hashCode", "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class SocialPost implements IEncodable {
    private final String code;
    private final List<String> inProgress;
    private final int level;
    private final String postReason;
    private final long sessionId;
    private final String socialNetwork;
    private final long timestamp;

    public SocialPost(int i, long j, String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "socialNetwork");
        Intrinsics.checkNotNullParameter(str2, "postReason");
        this.level = i;
        this.sessionId = j;
        this.socialNetwork = str;
        this.postReason = str2;
        this.inProgress = list;
        this.code = "sp";
        this.timestamp = System.currentTimeMillis();
    }

    public static /* synthetic */ SocialPost copy$default(SocialPost socialPost, int i, long j, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = socialPost.level;
        }
        if ((i2 & 2) != 0) {
            j = socialPost.sessionId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = socialPost.socialNetwork;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = socialPost.postReason;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = socialPost.inProgress;
        }
        return socialPost.copy(i, j2, str3, str4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSocialNetwork() {
        return this.socialNetwork;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPostReason() {
        return this.postReason;
    }

    public final List<String> component5() {
        return this.inProgress;
    }

    public final SocialPost copy(int level, long sessionId, String socialNetwork, String postReason, List<String> inProgress) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(postReason, "postReason");
        return new SocialPost(level, sessionId, socialNetwork, postReason, inProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialPost)) {
            return false;
        }
        SocialPost socialPost = (SocialPost) other;
        return this.level == socialPost.level && this.sessionId == socialPost.sessionId && Intrinsics.areEqual(this.socialNetwork, socialPost.socialNetwork) && Intrinsics.areEqual(this.postReason, socialPost.postReason) && Intrinsics.areEqual(this.inProgress, socialPost.inProgress);
    }

    public String getCode() {
        return this.code;
    }

    public final List<String> getInProgress() {
        return this.inProgress;
    }

    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate("sessionId", Long.valueOf(this.sessionId));
        jSONObject.accumulate("socialNetwork", this.socialNetwork);
        jSONObject.accumulate("postReason", this.postReason);
        if (this.inProgress != null && (!r1.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.inProgress.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.accumulate("inProgress", jSONArray);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getPostReason() {
        return this.postReason;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final String getSocialNetwork() {
        return this.socialNetwork;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = b.a(this.postReason, b.a(this.socialNetwork, a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31), 31), 31);
        List<String> list = this.inProgress;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t socialNetwork: " + this.socialNetwork + "\n");
        stringBuffer.append("\t postReason: " + this.postReason + "\n");
        if (this.inProgress != null && (!r1.isEmpty())) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
