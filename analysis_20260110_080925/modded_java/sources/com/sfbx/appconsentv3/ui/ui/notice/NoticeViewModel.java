package com.sfbx.appconsentv3.ui.ui.notice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.AppConsentCoreContract;
import com.sfbx.appconsent.core.model.BannerType;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Notice;
import com.sfbx.appconsent.core.model.Stack;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.util.SfbxErrorThrowable;
import com.sfbx.appconsentv3.ui.util.SfbxIABWebViewThrowable;
import com.sfbx.appconsentv3.ui.viewmodel.AbstractTrackingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NoticeViewModel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010$\u001a\u00020%H\u0002J\u0006\u0010\u0016\u001a\u00020!J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u0010\u0010\u0017\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\bJ\u0006\u0010'\u001a\u00020!J\u0006\u0010\u0019\u001a\u00020!J\u001e\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/notice/NoticeViewModel;", "Lcom/sfbx/appconsentv3/ui/viewmodel/AbstractTrackingViewModel;", "appConsentCore", "Lcom/sfbx/appconsent/core/AppConsentCore;", "(Lcom/sfbx/appconsent/core/AppConsentCore;)V", "_acceptAll", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR, "_consentableStatus", "Lcom/sfbx/appconsent/core/model/Consentable;", "_consentables", BuildConfig.FLAVOR, "_refuseAll", "_saveConsents", "acceptAll", "Landroidx/lifecycle/LiveData;", "getAcceptAll", "()Landroidx/lifecycle/LiveData;", "consentableStatus", "getConsentableStatus", "consentables", "getConsentables", "refuseAll", "getRefuseAll", "saveConsents", "getSaveConsents", "vendors", BuildConfig.FLAVOR, "getVendors", "()I", "setVendors", "(I)V", BuildConfig.FLAVOR, "excludeGeoloc", "filterConsentables", "notice", "Lcom/sfbx/appconsent/core/model/Notice;", "getConsentablesInCache", "resetLastModification", "setConsentableStatus", "consentableId", "type", "Lcom/sfbx/appconsent/core/model/ConsentableType;", "newStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class NoticeViewModel extends AbstractTrackingViewModel {
    private final MutableLiveData<Response<Boolean>> _acceptAll;
    private final MutableLiveData<Response<Consentable>> _consentableStatus;
    private final MutableLiveData<Response<List<Consentable>>> _consentables;
    private final MutableLiveData<Response<Boolean>> _refuseAll;
    private final MutableLiveData<Response<Boolean>> _saveConsents;
    private final LiveData<Response<Boolean>> acceptAll;
    private final LiveData<Response<Consentable>> consentableStatus;
    private final LiveData<Response<List<Consentable>>> consentables;
    private final LiveData<Response<Boolean>> refuseAll;
    private final LiveData<Response<Boolean>> saveConsents;
    private int vendors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeViewModel(AppConsentCore appConsentCore) {
        super(appConsentCore);
        Intrinsics.checkNotNullParameter(appConsentCore, "appConsentCore");
        LiveData<Response<List<Consentable>>> mutableLiveData = new MutableLiveData<>();
        this._consentables = mutableLiveData;
        this.consentables = mutableLiveData;
        LiveData<Response<Consentable>> mutableLiveData2 = new MutableLiveData<>();
        this._consentableStatus = mutableLiveData2;
        this.consentableStatus = mutableLiveData2;
        LiveData<Response<Boolean>> mutableLiveData3 = new MutableLiveData<>();
        this._acceptAll = mutableLiveData3;
        this.acceptAll = mutableLiveData3;
        LiveData<Response<Boolean>> mutableLiveData4 = new MutableLiveData<>();
        this._refuseAll = mutableLiveData4;
        this.refuseAll = mutableLiveData4;
        LiveData<Response<Boolean>> mutableLiveData5 = new MutableLiveData<>();
        this._saveConsents = mutableLiveData5;
        this.saveConsents = mutableLiveData5;
    }

    public final LiveData<Response<List<Consentable>>> getConsentables() {
        return this.consentables;
    }

    public final int getVendors() {
        return this.vendors;
    }

    public final void setVendors(int i) {
        this.vendors = i;
    }

    /* compiled from: NoticeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1", f = "NoticeViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1, reason: invalid class name and case insensitive filesystem */
    static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C00871(Continuation<? super C00871> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeViewModel.this.new C00871(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeViewModel.this._consentables.setValue(new Response.Loading());
                Flow flowCatch = FlowKt.catch(NoticeViewModel.this.getAppConsentCore().getNotice(true), new C00521(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                this.label = 1;
                if (flowCatch.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.getConsentables.1.2
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Notice) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Notice notice, Continuation<? super Unit> continuation) {
                        if (!notice.getConsentables().isEmpty() || !notice.getVendors().isEmpty() || !notice.getStacks().isEmpty()) {
                            List listFilterConsentables = noticeViewModel.filterConsentables(notice);
                            noticeViewModel.setVendors(notice.getVendors().size());
                            noticeViewModel._consentables.setValue(new Response.Success(listFilterConsentables));
                        } else {
                            noticeViewModel._consentables.setValue(new Response.Error(new SfbxErrorThrowable("No data received by IAB script, from Webview component system", new SfbxIABWebViewThrowable()), null, 2, null));
                        }
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
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

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/sfbx/appconsent/core/model/Notice;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$getConsentables$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00521 extends SuspendLambda implements Function3<FlowCollector<? super Notice>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00521(NoticeViewModel noticeViewModel, Continuation<? super C00521> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Notice> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00521 c00521 = new C00521(this.this$0, continuation);
                c00521.L$0 = th;
                return c00521.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0._consentables.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* renamed from: getConsentables, reason: collision with other method in class */
    public final void m1022getConsentables() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new C00871(null), 3, (Object) null);
    }

    public final List<Consentable> getConsentablesInCache() {
        return filterConsentables(getAppConsentCore().getConsentInCache());
    }

    public final LiveData<Response<Consentable>> getConsentableStatus() {
        return this.consentableStatus;
    }

    /* compiled from: NoticeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1", f = "NoticeViewModel.kt", i = {}, l = {65, 76}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1, reason: invalid class name and case insensitive filesystem */
    static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $consentableId;
        final /* synthetic */ ConsentStatus $newStatus;
        final /* synthetic */ ConsentableType $type;
        int label;

        /* compiled from: NoticeViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.STACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00901(ConsentableType consentableType, int i, ConsentStatus consentStatus, Continuation<? super C00901> continuation) {
            super(2, continuation);
            this.$type = consentableType;
            this.$consentableId = i;
            this.$newStatus = consentStatus;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeViewModel.this.new C00901(this.$type, this.$consentableId, this.$newStatus, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeViewModel.this._consentableStatus.setValue(new Response.Loading());
                if (WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()] == 1) {
                    Flow flowCatch = FlowKt.catch(AppConsentCoreContract.DefaultImpls.setStackStatus$default(NoticeViewModel.this.getAppConsentCore(), this.$consentableId, this.$newStatus, false, 4, (Object) null), new C00551(NoticeViewModel.this, null));
                    final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                    final int i2 = this.$consentableId;
                    final ConsentableType consentableType = this.$type;
                    final ConsentStatus consentStatus = this.$newStatus;
                    this.label = 1;
                    if (flowCatch.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.setConsentableStatus.1.2
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            noticeViewModel._consentableStatus.setValue(new Response.Success(new Consentable(i2, (Integer) null, (String) null, (Map) null, (Map) null, (Map) null, (Map) null, consentableType, (BannerType) null, (List) null, consentStatus, (ConsentStatus) null, (Integer) null, 7038, (DefaultConstructorMarker) null)));
                            return Unit.INSTANCE;
                        }
                    }, (Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Flow flowCatch2 = FlowKt.catch(AppConsentCoreContract.DefaultImpls.setConsentableStatus$default(NoticeViewModel.this.getAppConsentCore(), this.$consentableId, this.$newStatus, false, 4, (Object) null), new AnonymousClass3(NoticeViewModel.this, null));
                    final NoticeViewModel noticeViewModel2 = NoticeViewModel.this;
                    final int i3 = this.$consentableId;
                    final ConsentableType consentableType2 = this.$type;
                    final ConsentStatus consentStatus2 = this.$newStatus;
                    this.label = 2;
                    if (flowCatch2.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.setConsentableStatus.1.4
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            noticeViewModel2._consentableStatus.setValue(new Response.Success(new Consentable(i3, (Integer) null, (String) null, (Map) null, (Map) null, (Map) null, (Map) null, consentableType2, (BannerType) null, (List) null, consentStatus2, (ConsentStatus) null, (Integer) null, 7038, (DefaultConstructorMarker) null)));
                            return Unit.INSTANCE;
                        }
                    }, (Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00551 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00551(NoticeViewModel noticeViewModel, Continuation<? super C00551> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00551 c00551 = new C00551(this.this$0, continuation);
                c00551.L$0 = th;
                return c00551.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0._consentableStatus.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$setConsentableStatus$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(NoticeViewModel noticeViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0._consentableStatus.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void setConsentableStatus(int consentableId, ConsentableType type, ConsentStatus newStatus) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new C00901(type, consentableId, newStatus, null), 3, (Object) null);
    }

    public final LiveData<Response<Boolean>> getAcceptAll() {
        return this.acceptAll;
    }

    /* compiled from: NoticeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1", f = "NoticeViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $excludeGeoloc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$excludeGeoloc = z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeViewModel.this.new AnonymousClass1(this.$excludeGeoloc, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeViewModel.this._acceptAll.setValue(new Response.Loading());
                Flow flowCatch = FlowKt.catch(NoticeViewModel.this.getAppConsentCore().acceptAll(this.$excludeGeoloc), new C00511(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                this.label = 1;
                if (flowCatch.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.acceptAll.1.2
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        noticeViewModel._acceptAll.setValue(new Response.Success(Boxing.boxBoolean(z)));
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
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

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$acceptAll$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00511 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00511(NoticeViewModel noticeViewModel, Continuation<? super C00511> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00511 c00511 = new C00511(this.this$0, continuation);
                c00511.L$0 = th;
                return c00511.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0._acceptAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void acceptAll$default(NoticeViewModel noticeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        noticeViewModel.acceptAll(z);
    }

    public final void acceptAll(boolean excludeGeoloc) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(excludeGeoloc, null), 3, (Object) null);
    }

    public final LiveData<Response<Boolean>> getRefuseAll() {
        return this.refuseAll;
    }

    /* compiled from: NoticeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1", f = "NoticeViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1, reason: invalid class name and case insensitive filesystem */
    static final class C00881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $excludeGeoloc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00881(boolean z, Continuation<? super C00881> continuation) {
            super(2, continuation);
            this.$excludeGeoloc = z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeViewModel.this.new C00881(this.$excludeGeoloc, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeViewModel.this._refuseAll.setValue(new Response.Loading());
                Flow flowCatch = FlowKt.catch(AppConsentCoreContract.DefaultImpls.refuseAll$default(NoticeViewModel.this.getAppConsentCore(), this.$excludeGeoloc, false, 2, (Object) null), new C00531(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                this.label = 1;
                if (flowCatch.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.refuseAll.1.2
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        noticeViewModel._refuseAll.setValue(new Response.Success(Boxing.boxBoolean(z)));
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
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

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$refuseAll$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00531 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00531(NoticeViewModel noticeViewModel, Continuation<? super C00531> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00531 c00531 = new C00531(this.this$0, continuation);
                c00531.L$0 = th;
                return c00531.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0._refuseAll.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                return Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void refuseAll$default(NoticeViewModel noticeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        noticeViewModel.refuseAll(z);
    }

    public final void refuseAll(boolean excludeGeoloc) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new C00881(excludeGeoloc, null), 3, (Object) null);
    }

    public final LiveData<Response<Boolean>> getSaveConsents() {
        return this.saveConsents;
    }

    /* compiled from: NoticeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1", f = "NoticeViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1, reason: invalid class name and case insensitive filesystem */
    static final class C00891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C00891(Continuation<? super C00891> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NoticeViewModel.this.new C00891(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoticeViewModel.this._saveConsents.setValue(new Response.Loading());
                Flow flowCatch = FlowKt.catch(NoticeViewModel.this.getAppConsentCore().saveConsents(), new C00541(NoticeViewModel.this, null));
                final NoticeViewModel noticeViewModel = NoticeViewModel.this;
                this.label = 1;
                if (flowCatch.collect(new FlowCollector() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel.saveConsents.1.2
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        noticeViewModel._saveConsents.setValue(new Response.Success(Boxing.boxBoolean(z)));
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
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

        /* compiled from: NoticeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", BuildConfig.FLAVOR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, BuildConfig.FLAVOR}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1$1", f = "NoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.sfbx.appconsentv3.ui.ui.notice.NoticeViewModel$saveConsents$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00541 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NoticeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00541(NoticeViewModel noticeViewModel, Continuation<? super C00541> continuation) {
                super(3, continuation);
                this.this$0 = noticeViewModel;
            }

            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00541 c00541 = new C00541(this.this$0, continuation);
                c00541.L$0 = th;
                return c00541.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0._saveConsents.setValue(new Response.Error((Throwable) this.L$0, null, 2, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void saveConsents() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new C00891(null), 3, (Object) null);
    }

    public final void resetLastModification() {
        getAppConsentCore().rollbackToInitialValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Consentable> filterConsentables(Notice notice) {
        List listEmptyList;
        Object next;
        List<Stack> stacks = notice.getStacks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stacks, 10));
        Iterator<T> it = stacks.iterator();
        while (it.hasNext()) {
            List<Consentable> consentables = ((Stack) it.next()).getConsentables();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(consentables, 10));
            Iterator<T> it2 = consentables.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Consentable) it2.next()).getId()));
            }
            arrayList.add(CollectionsKt.distinct(arrayList2));
        }
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it3.next();
            while (it3.hasNext()) {
                next2 = CollectionsKt.distinct(CollectionsKt.plus((List) next2, (List) it3.next()));
            }
            listEmptyList = (List) next2;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Consentable> consentables2 = notice.getConsentables();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : consentables2) {
            if (!listEmptyList.contains(Integer.valueOf(((Consentable) obj).getId()))) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = arrayList4;
        List<Stack> stacks2 = notice.getStacks();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(stacks2, 10));
        for (Stack stack : stacks2) {
            List<Consentable> consentables3 = stack.getConsentables();
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(consentables3, 10));
            Iterator<T> it4 = consentables3.iterator();
            while (it4.hasNext()) {
                arrayList7.add(CollectionsKt.distinct(((Consentable) it4.next()).getVendors()));
            }
            List listDistinct = CollectionsKt.distinct(CollectionsKt.flatten(arrayList7));
            ArrayList arrayList8 = new ArrayList();
            for (Object obj2 : listDistinct) {
                Vendor vendor = (Vendor) obj2;
                if ((vendor.getIabId() == null || vendor.isLegVendor() || vendor.isExtraVendor()) ? false : true) {
                    arrayList8.add(obj2);
                }
            }
            arrayList6.add(new Consentable(stack.getId(), stack.getIabId(), (String) null, stack.getName(), stack.getDescription(), MapsKt.emptyMap(), (Map) null, ConsentableType.STACK, (BannerType) null, arrayList8, stack.getStatus(), stack.getLegIntStatus(), (Integer) null, 4420, (DefaultConstructorMarker) null));
        }
        ArrayList arrayList9 = arrayList6;
        ArrayList arrayList10 = arrayList5;
        Iterator it5 = arrayList10.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == 1 && consentable.getType() == ConsentableType.PURPOSE) {
                break;
            }
        }
        Consentable consentable2 = (Consentable) next;
        if (consentable2 == null) {
            return CollectionsKt.plus(arrayList9, arrayList10);
        }
        List listPlus = CollectionsKt.plus(CollectionsKt.listOf(consentable2), arrayList9);
        ArrayList arrayList11 = new ArrayList();
        boolean z = false;
        for (Object obj3 : arrayList10) {
            if (z) {
                arrayList11.add(obj3);
            } else if (!(((Consentable) obj3).getId() == 1)) {
                arrayList11.add(obj3);
                z = true;
            }
        }
        return CollectionsKt.plus(listPlus, arrayList11);
    }
}
