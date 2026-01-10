package io.ktor.http;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CookieUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, BuildConfig.FLAVOR, AdOperationMetric.REASON, "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class InvalidCookieDateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCookieDateException(String str, String str2) {
        super("Failed to parse date string: \"" + str + "\". Reason: \"" + str2 + '\"');
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkNotNullParameter(str2, AdOperationMetric.REASON);
    }
}
