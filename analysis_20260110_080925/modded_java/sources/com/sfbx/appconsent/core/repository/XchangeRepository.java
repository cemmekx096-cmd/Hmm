package com.sfbx.appconsent.core.repository;

import ac.Xchange;
import android.content.Context;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.crashlytics.android.BuildConfig;
import com.ironsource.qs;
import com.sfbx.appconsent.core.api.AppConsentService;
import com.sfbx.appconsent.core.exception.ACException;
import com.sfbx.appconsent.core.provider.UserProvider;
import com.sfbx.appconsent.core.provider.XChangeProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: XchangeRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R$\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/sfbx/appconsent/core/repository/XchangeRepository;", BuildConfig.FLAVOR, "mContext", "Landroid/content/Context;", "mAppConsentService", "Lcom/sfbx/appconsent/core/api/AppConsentService;", "mXChangeProvider", "Lcom/sfbx/appconsent/core/provider/XChangeProvider;", "mUserProvider", "Lcom/sfbx/appconsent/core/provider/UserProvider;", "(Landroid/content/Context;Lcom/sfbx/appconsent/core/api/AppConsentService;Lcom/sfbx/appconsent/core/provider/XChangeProvider;Lcom/sfbx/appconsent/core/provider/UserProvider;)V", qs.l, BuildConfig.FLAVOR, "getAppKey$appconsent_core_prodPremiumRelease$annotations", "()V", "getAppKey$appconsent_core_prodPremiumRelease", "()Ljava/lang/String;", "setAppKey$appconsent_core_prodPremiumRelease", "(Ljava/lang/String;)V", "defineAppKey", BuildConfig.FLAVOR, "defineAppKey$appconsent_core_prodPremiumRelease", "postXChangeData", "Lkotlinx/coroutines/flow/Flow;", BuildConfig.FLAVOR, "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class XchangeRepository {
    private String appKey;
    private final AppConsentService mAppConsentService;
    private final Context mContext;
    private final UserProvider mUserProvider;
    private final XChangeProvider mXChangeProvider;

    public static /* synthetic */ void getAppKey$appconsent_core_prodPremiumRelease$annotations() {
    }

    public XchangeRepository(Context context, AppConsentService appConsentService, XChangeProvider xChangeProvider, UserProvider userProvider) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(appConsentService, "mAppConsentService");
        Intrinsics.checkNotNullParameter(xChangeProvider, "mXChangeProvider");
        Intrinsics.checkNotNullParameter(userProvider, "mUserProvider");
        this.mContext = context;
        this.mAppConsentService = appConsentService;
        this.mXChangeProvider = xChangeProvider;
        this.mUserProvider = userProvider;
        this.appKey = BuildConfig.FLAVOR;
    }

    /* renamed from: getAppKey$appconsent_core_prodPremiumRelease, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    public final void setAppKey$appconsent_core_prodPremiumRelease(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appKey = str;
    }

    public final void defineAppKey$appconsent_core_prodPremiumRelease(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, qs.l);
        this.appKey = appKey;
    }

    /* compiled from: XchangeRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lac/Xchange$ShipReply;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$1", f = "XchangeRepository.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Xchange.ShipReply>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> anonymousClass1 = XchangeRepository.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(FlowCollector<? super Xchange.ShipReply> flowCollector, Continuation<? super Unit> continuation) {
            return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws ACException.ACUnknownException, ACException.ACCertificationPathValidatorException, ACException.ACAppKeyNotFoundException {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Xchange.ShipRequest shipRequestBuild = Xchange.ShipRequest.newBuilder().setUuid(XchangeRepository.this.mUserProvider.getUserId()).setAppKey(XchangeRepository.this.getAppKey()).putAllData(XchangeRepository.this.mXChangeProvider.generateXChangeData(XchangeRepository.this.mContext)).build();
                AppConsentService appConsentService = XchangeRepository.this.mAppConsentService;
                Intrinsics.checkNotNullExpressionValue(shipRequestBuild, "shipRequest");
                this.L$0 = flowCollector;
                this.label = 1;
                obj = appConsentService.ship(shipRequestBuild, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(obj, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Boolean> postXChangeData() {
        final Flow flow = FlowKt.flow(new AnonymousClass1(null));
        return FlowKt.flowOn(FlowKt.catch(new Flow<Boolean>() { // from class: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2", f = "XchangeRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
                        return AnonymousClass2.this.emit(null, (Continuation) this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1 r0 = (com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1 r0 = new com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L55
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        ac.Xchange$ShipReply r5 = (ac.Xchange.ShipReply) r5
                        ac.AcError$ErrorResponse r5 = r5.getError()
                        ac.AcError$ErrorResponse r2 = ac.AcError.ErrorResponse.getDefaultInstance()
                        boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L55
                        return r1
                    L55:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new AnonymousClass3(null)), Dispatchers.getIO());
    }

    /* compiled from: XchangeRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$3", f = "XchangeRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsent.core.repository.XchangeRepository$postXChangeData$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
        }

        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = flowCollector;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((FlowCollector) this.L$0).emit(Boxing.boxBoolean(false), (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
