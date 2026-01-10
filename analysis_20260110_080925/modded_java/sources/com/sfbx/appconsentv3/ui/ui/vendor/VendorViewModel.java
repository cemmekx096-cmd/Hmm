package com.sfbx.appconsentv3.ui.ui.vendor;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.domain.GetVendorDetailsUseCase;
import com.sfbx.appconsentv3.ui.domain.IsNeedToDisplayLegitimateInterestUseCase;
import com.sfbx.appconsentv3.ui.domain.model.VendorDetailsDomain;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: VendorViewModel.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\nJ\u0006\u0010\u001a\u001a\u00020\u0017J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u00112\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/vendor/VendorViewModel;", "Lcom/sfbx/appconsentv3/ui/viewmodel/AbstractTrackingViewModel;", "appConsentCore", "Lcom/sfbx/appconsent/core/AppConsentCore;", "isNeedToDisplayLegitimateInterestUseCase", "Lcom/sfbx/appconsentv3/ui/domain/IsNeedToDisplayLegitimateInterestUseCase;", "getVendorDetailsUseCase", "Lcom/sfbx/appconsentv3/ui/domain/GetVendorDetailsUseCase;", "(Lcom/sfbx/appconsent/core/AppConsentCore;Lcom/sfbx/appconsentv3/ui/domain/IsNeedToDisplayLegitimateInterestUseCase;Lcom/sfbx/appconsentv3/ui/domain/GetVendorDetailsUseCase;)V", "getConsentables", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Consentable;", "getVendorDetails", "Lcom/sfbx/appconsentv3/ui/domain/model/VendorDetailsDomain;", "vendorId", BuildConfig.FLAVOR, "getVendorExpiration", "Landroidx/lifecycle/LiveData;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR, "cookieMaxAgeSeconds", BuildConfig.FLAVOR, "useNonCookieAccess", BuildConfig.FLAVOR, "getVendors", "Lcom/sfbx/appconsent/core/model/Vendor;", "isNeedToDisplayLegitimateInterest", "rejectLITVendors", "rejected", "setVendorStatus", "newStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class VendorViewModel extends AbstractTrackingViewModel {
    private final GetVendorDetailsUseCase getVendorDetailsUseCase;
    private final IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorViewModel(AppConsentCore appConsentCore, IsNeedToDisplayLegitimateInterestUseCase isNeedToDisplayLegitimateInterestUseCase, GetVendorDetailsUseCase getVendorDetailsUseCase) {
        super(appConsentCore);
        Intrinsics.checkNotNullParameter(appConsentCore, "appConsentCore");
        Intrinsics.checkNotNullParameter(isNeedToDisplayLegitimateInterestUseCase, "isNeedToDisplayLegitimateInterestUseCase");
        Intrinsics.checkNotNullParameter(getVendorDetailsUseCase, "getVendorDetailsUseCase");
        this.isNeedToDisplayLegitimateInterestUseCase = isNeedToDisplayLegitimateInterestUseCase;
        this.getVendorDetailsUseCase = getVendorDetailsUseCase;
    }

    public final VendorDetailsDomain getVendorDetails(int vendorId) {
        return (VendorDetailsDomain) this.getVendorDetailsUseCase.get(Integer.valueOf(vendorId));
    }

    public final List<Vendor> getVendors() {
        return getAppConsentCore().getVendors();
    }

    public final List<Consentable> getConsentables() {
        return getAppConsentCore().getConsentablesInCache();
    }

    /* compiled from: VendorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Landroidx/lifecycle/LiveDataScope;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1", f = "VendorViewModel.kt", i = {0}, l = {27, 30}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1, reason: invalid class name and case insensitive filesystem */
    static final class C00911 extends SuspendLambda implements Function2<LiveDataScope<Response<? extends Boolean>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $rejected;
        final /* synthetic */ int $vendorId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00911(int i, boolean z, Continuation<? super C00911> continuation) {
            super(2, continuation);
            this.$vendorId = i;
            this.$rejected = z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00911 = VendorViewModel.this.new C00911(this.$vendorId, this.$rejected, continuation);
            c00911.L$0 = obj;
            return c00911;
        }

        public final Object invoke(LiveDataScope<Response<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return create(liveDataScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                this.L$0 = liveDataScope;
                this.label = 1;
                if (liveDataScope.emit(new Response.Loading(), (Continuation) this) == coroutine_suspended) {
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
                liveDataScope = (LiveDataScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            AppConsentCore appConsentCore = VendorViewModel.this.getAppConsentCore();
            int i2 = this.$vendorId;
            ConsentStatus consentStatus = this.$rejected ? ConsentStatus.DISALLOWED : ConsentStatus.ALLOWED;
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.catch(appConsentCore.setVendorStatus(i2, consentStatus, true), new C00571(liveDataScope, null)).collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.rejectLITVendors.1.2
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    Object objEmit = liveDataScope.emit(new Response.Success(Boxing.boxBoolean(z)), continuation);
                    return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            }, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: VendorViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1", f = "VendorViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$rejectLITVendors$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00571 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveDataScope<Response<Boolean>> $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00571(LiveDataScope<Response<Boolean>> liveDataScope, Continuation<? super C00571> continuation) {
                super(3, continuation);
                this.$$this$liveData = liveDataScope;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00571 c00571 = new C00571(this.$$this$liveData, continuation);
                c00571.L$0 = th;
                return c00571.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    this.label = 1;
                    if (this.$$this$liveData.emit(new Response.Error(th, null, 2, null), (Continuation) this) == coroutine_suspended) {
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

    public final LiveData<Response<Boolean>> rejectLITVendors(boolean rejected, int vendorId) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C00911(vendorId, rejected, null), 3, (Object) null);
    }

    /* compiled from: VendorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Landroidx/lifecycle/LiveDataScope;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1", f = "VendorViewModel.kt", i = {0}, l = {34, 36}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1, reason: invalid class name and case insensitive filesystem */
    static final class C00921 extends SuspendLambda implements Function2<LiveDataScope<Response<? extends Boolean>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConsentStatus $newStatus;
        final /* synthetic */ int $vendorId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00921(int i, ConsentStatus consentStatus, Continuation<? super C00921> continuation) {
            super(2, continuation);
            this.$vendorId = i;
            this.$newStatus = consentStatus;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00921 = VendorViewModel.this.new C00921(this.$vendorId, this.$newStatus, continuation);
            c00921.L$0 = obj;
            return c00921;
        }

        public final Object invoke(LiveDataScope<Response<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return create(liveDataScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                this.L$0 = liveDataScope;
                this.label = 1;
                if (liveDataScope.emit(new Response.Loading(), (Continuation) this) == coroutine_suspended) {
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
                liveDataScope = (LiveDataScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.catch(AppConsentCoreContract.DefaultImpls.setVendorStatus$default(VendorViewModel.this.getAppConsentCore(), this.$vendorId, this.$newStatus, false, 4, (Object) null), new C00581(liveDataScope, null)).collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.setVendorStatus.1.2
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    Object objEmit = liveDataScope.emit(new Response.Success(Boxing.boxBoolean(z)), continuation);
                    return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            }, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: VendorViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1", f = "VendorViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$setVendorStatus$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00581 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveDataScope<Response<Boolean>> $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00581(LiveDataScope<Response<Boolean>> liveDataScope, Continuation<? super C00581> continuation) {
                super(3, continuation);
                this.$$this$liveData = liveDataScope;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00581 c00581 = new C00581(this.$$this$liveData, continuation);
                c00581.L$0 = th;
                return c00581.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    this.label = 1;
                    if (this.$$this$liveData.emit(new Response.Error(th, null, 2, null), (Continuation) this) == coroutine_suspended) {
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

    public final LiveData<Response<Boolean>> setVendorStatus(int vendorId, ConsentStatus newStatus) {
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C00921(vendorId, newStatus, null), 3, (Object) null);
    }

    /* compiled from: VendorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Landroidx/lifecycle/LiveDataScope;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1", f = "VendorViewModel.kt", i = {0}, l = {41, 44}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Response<? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $cookieMaxAgeSeconds;
        final /* synthetic */ boolean $useNonCookieAccess;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cookieMaxAgeSeconds = j;
            this.$useNonCookieAccess = z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> anonymousClass1 = VendorViewModel.this.new AnonymousClass1(this.$cookieMaxAgeSeconds, this.$useNonCookieAccess, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(LiveDataScope<Response<String>> liveDataScope, Continuation<? super Unit> continuation) {
            return create(liveDataScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                this.L$0 = liveDataScope;
                this.label = 1;
                if (liveDataScope.emit(new Response.Loading(), (Continuation) this) == coroutine_suspended) {
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
                liveDataScope = (LiveDataScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.catch(VendorViewModel.this.getAppConsentCore().getVendorExpiration(this.$cookieMaxAgeSeconds, this.$useNonCookieAccess), new C00561(liveDataScope, null)).collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel.getVendorExpiration.1.2
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    Object objEmit = liveDataScope.emit(new Response.Success(str), continuation);
                    return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            }, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: VendorViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1", f = "VendorViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel$getVendorExpiration$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00561 extends SuspendLambda implements Function3<FlowCollector<? super String>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveDataScope<Response<String>> $$this$liveData;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00561(LiveDataScope<Response<String>> liveDataScope, Continuation<? super C00561> continuation) {
                super(3, continuation);
                this.$$this$liveData = liveDataScope;
            }

            public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00561 c00561 = new C00561(this.$$this$liveData, continuation);
                c00561.L$0 = th;
                return c00561.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    this.label = 1;
                    if (this.$$this$liveData.emit(new Response.Error(th, null, 2, null), (Continuation) this) == coroutine_suspended) {
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

    public final LiveData<Response<String>> getVendorExpiration(long cookieMaxAgeSeconds, boolean useNonCookieAccess) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(cookieMaxAgeSeconds, useNonCookieAccess, null), 3, (Object) null);
    }

    public final boolean isNeedToDisplayLegitimateInterest() {
        return ((Boolean) this.isNeedToDisplayLegitimateInterestUseCase.get()).booleanValue();
    }
}
