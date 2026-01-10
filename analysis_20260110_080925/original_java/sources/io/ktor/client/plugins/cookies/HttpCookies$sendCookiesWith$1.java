package io.ktor.client.plugins.cookies;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {59}, m = "sendCookiesWith$ktor_client_core", n = {"builder"}, s = {"L$0"})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class HttpCookies$sendCookiesWith$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCookies$sendCookiesWith$1(HttpCookies httpCookies, Continuation<? super HttpCookies$sendCookiesWith$1> continuation) {
        super(continuation);
        this.this$0 = httpCookies;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
        return this.this$0.sendCookiesWith$ktor_client_core(null, (Continuation) this);
    }
}
