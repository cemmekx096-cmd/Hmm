package com.sfbx.appconsentv3.ui.domain;

import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.AppConsentCore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsNeedToCallHelloWsUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/sfbx/appconsentv3/ui/domain/IsNeedToCallHelloWsUseCaseImpl;", "Lcom/sfbx/appconsentv3/ui/domain/IsNeedToCallHelloWsUseCase;", "appConsentCore", "Lcom/sfbx/appconsent/core/AppConsentCore;", "(Lcom/sfbx/appconsent/core/AppConsentCore;)V", "invoke", BuildConfig.FLAVOR, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class IsNeedToCallHelloWsUseCaseImpl implements IsNeedToCallHelloWsUseCase {
    private final AppConsentCore appConsentCore;

    public IsNeedToCallHelloWsUseCaseImpl(AppConsentCore appConsentCore) {
        Intrinsics.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
    }

    public Object invoke(Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.appConsentCore.isNeedToCallHelloWs());
    }
}
