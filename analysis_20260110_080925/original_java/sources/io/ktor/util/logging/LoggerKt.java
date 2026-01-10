package io.ktor.util.logging;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.slf4j.Logger;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR, "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "exception", BuildConfig.FLAVOR, "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class LoggerKt {
    public static final void error(Logger logger, Throwable th) {
        Intrinsics.checkNotNullParameter(logger, "<this>");
        Intrinsics.checkNotNullParameter(th, "exception");
        String message = th.getMessage();
        if (message == null) {
            message = "Exception of type " + Reflection.getOrCreateKotlinClass(th.getClass());
        }
        logger.error(message, th);
    }
}
