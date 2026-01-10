package com.sfbx.appconsentv3.ui.domain;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SimpleUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00028\u0000H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/sfbx/appconsentv3/ui/domain/SimpleUseCase;", "T", BuildConfig.FLAVOR, "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface SimpleUseCase<T> {
    Object invoke(Continuation<? super T> continuation);
}
