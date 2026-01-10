package com.sfbx.appconsent.core.api;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppConsentService.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {0}, l = {228}, m = "sendDisplayMetric-0E7RQCE", n = {"$this$sendDisplayMetric_0E7RQCE_u24lambda_u2414"}, s = {"L$0"})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class AppConsentService$sendDisplayMetric$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppConsentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppConsentService$sendDisplayMetric$1(AppConsentService appConsentService, Continuation<? super AppConsentService$sendDisplayMetric$1> continuation) {
        super(continuation);
        this.this$0 = appConsentService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
        Object objM994sendDisplayMetric0E7RQCE = this.this$0.m994sendDisplayMetric0E7RQCE(null, null, (Continuation) this);
        return objM994sendDisplayMetric0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM994sendDisplayMetric0E7RQCE : Result.box-impl(objM994sendDisplayMetric0E7RQCE);
    }
}
