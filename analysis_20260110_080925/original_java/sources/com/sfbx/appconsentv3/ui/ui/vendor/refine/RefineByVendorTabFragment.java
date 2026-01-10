package com.sfbx.appconsentv3.ui.ui.vendor.refine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3FragmentDisplayByVendorTabBinding;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.listener.VendorListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: RefineByVendorTabFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0005¢\u0006\u0002\u0010\u0004J$\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000fH\u0002J\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J$\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020!H\u0016J\u001a\u00100\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J \u00101\u001a\u00020!2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000206H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/vendor/refine/RefineByVendorTabFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/sfbx/appconsentv3/ui/listener/VendorListener;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3FragmentDisplayByVendorTabBinding;", "binding", "getBinding", "()Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3FragmentDisplayByVendorTabBinding;", "isExtraVendor", BuildConfig.FLAVOR, "mVendorAdapter", "Lcom/sfbx/appconsentv3/ui/ui/vendor/refine/VendorAdapter;", "mVendors", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Vendor;", "mViewModel", "Lcom/sfbx/appconsentv3/ui/ui/vendor/VendorViewModel;", "getMViewModel", "()Lcom/sfbx/appconsentv3/ui/ui/vendor/VendorViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "mViewModelFactory", "Lcom/sfbx/appconsentv3/ui/viewmodel/ViewModelFactory;", "getMViewModelFactory", "()Lcom/sfbx/appconsentv3/ui/viewmodel/ViewModelFactory;", "mViewModelFactory$delegate", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "loadData", BuildConfig.FLAVOR, "vendors", "consentables", "Lcom/sfbx/appconsent/core/model/Consentable;", "onClick", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "vendorStatusChanged", "adapterPosition", BuildConfig.FLAVOR, "vendorId", "newStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "Companion", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class RefineByVendorTabFragment extends Fragment implements VendorListener, View.OnClickListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_VENDOR = "extra_vendor";
    private AppconsentV3FragmentDisplayByVendorTabBinding _binding;
    private boolean isExtraVendor;
    private final VendorAdapter mVendorAdapter;
    private List<Vendor> mVendors;

    /* renamed from: mViewModel$delegate, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* renamed from: mViewModelFactory$delegate, reason: from kotlin metadata */
    private final Lazy mViewModelFactory = LazyKt.lazy(new Function0<ViewModelFactory>() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$mViewModelFactory$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final ViewModelFactory m1027invoke() {
            return UIInjector.INSTANCE.provideViewModelFactory();
        }
    });
    private final ActivityResultLauncher<Intent> startForResult;

    @JvmStatic
    public static final Intent getResultIntent(int i, ConsentStatus consentStatus) {
        return INSTANCE.getResultIntent(i, consentStatus);
    }

    @JvmStatic
    public static final RefineByVendorTabFragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    public RefineByVendorTabFragment() {
        final RefineByVendorTabFragment refineByVendorTabFragment = this;
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$mViewModel$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m1026invoke() {
                return this.this$0.getMViewModelFactory();
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m1024invoke() {
                return refineByVendorTabFragment;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(refineByVendorTabFragment, Reflection.getOrCreateKotlinClass(VendorViewModel.class), new Function0<ViewModelStore>() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m1025invoke() {
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) function02.invoke()).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, function0);
        this.mVendors = CollectionsKt.emptyList();
        this.mVendorAdapter = new VendorAdapter();
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult((ActivityResultContract) new ActivityResultContracts.StartActivityForResult(), new RefineByVendorTabFragment$.ExternalSyntheticLambda0(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.startForResult = activityResultLauncherRegisterForActivityResult;
    }

    /* compiled from: RefineByVendorTabFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/vendor/refine/RefineByVendorTabFragment$Companion;", BuildConfig.FLAVOR, "()V", "EXTRA_ID", BuildConfig.FLAVOR, "EXTRA_STATUS", "EXTRA_VENDOR", "getResultIntent", "Landroid/content/Intent;", "id", BuildConfig.FLAVOR, SettingsJsonConstants.APP_STATUS_KEY, "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "newInstance", "Lcom/sfbx/appconsentv3/ui/ui/vendor/refine/RefineByVendorTabFragment;", "isExtraVendor", BuildConfig.FLAVOR, "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RefineByVendorTabFragment newInstance(boolean isExtraVendor) {
            RefineByVendorTabFragment refineByVendorTabFragment = new RefineByVendorTabFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(RefineByVendorTabFragment.EXTRA_VENDOR, isExtraVendor);
            refineByVendorTabFragment.setArguments(bundle);
            return refineByVendorTabFragment;
        }

        @JvmStatic
        public final Intent getResultIntent(int id, ConsentStatus status) {
            Intrinsics.checkNotNullParameter(status, SettingsJsonConstants.APP_STATUS_KEY);
            Intent intent = new Intent();
            intent.putExtra(RefineByVendorTabFragment.EXTRA_ID, id);
            intent.putExtra(RefineByVendorTabFragment.EXTRA_STATUS, (Serializable) status);
            return intent;
        }
    }

    private final AppconsentV3FragmentDisplayByVendorTabBinding getBinding() {
        AppconsentV3FragmentDisplayByVendorTabBinding appconsentV3FragmentDisplayByVendorTabBinding = this._binding;
        Intrinsics.checkNotNull(appconsentV3FragmentDisplayByVendorTabBinding);
        return appconsentV3FragmentDisplayByVendorTabBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewModelFactory getMViewModelFactory() {
        return (ViewModelFactory) this.mViewModelFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VendorViewModel getMViewModel() {
        return (VendorViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$2(RefineByVendorTabFragment refineByVendorTabFragment, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(refineByVendorTabFragment, "this$0");
        int i = -1;
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Object obj = null;
            Integer numValueOf = data != null ? Integer.valueOf(data.getIntExtra(EXTRA_ID, 0)) : null;
            Intent data2 = activityResult.getData();
            Serializable serializableExtra = data2 != null ? data2.getSerializableExtra(EXTRA_STATUS) : null;
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
            ConsentStatus consentStatus = (ConsentStatus) serializableExtra;
            Iterator<T> it = refineByVendorTabFragment.mVendors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (numValueOf != null && ((Vendor) next).getId() == numValueOf.intValue()) {
                    obj = next;
                    break;
                }
            }
            Vendor vendor = (Vendor) obj;
            if (vendor != null) {
                vendor.setStatus(consentStatus);
            }
            VendorAdapter vendorAdapter = refineByVendorTabFragment.mVendorAdapter;
            List currentList = vendorAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "mVendorAdapter.currentList");
            Iterator it2 = currentList.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (numValueOf != null && ((Vendor) it2.next()).getId() == numValueOf.intValue()) {
                    i = i2;
                    break;
                }
                i2++;
            }
            vendorAdapter.notifyItemChanged(i);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = AppconsentV3FragmentDisplayByVendorTabBinding.inflate(inflater, container, false);
        RelativeLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.isExtraVendor = arguments != null ? arguments.getBoolean(EXTRA_VENDOR) : false;
        VendorAdapter vendorAdapter = this.mVendorAdapter;
        vendorAdapter.setLearnMoreListener(this);
        vendorAdapter.setVendorListener(this);
        RecyclerView recyclerView = getBinding().recyclerVendors;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.mVendorAdapter);
        loadData(getMViewModel().getVendors(), getMViewModel().getConsentables());
    }

    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(List<Vendor> vendors, List<Consentable> consentables) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = vendors.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (this.isExtraVendor == ((Vendor) next2).isExtraVendor()) {
                arrayList.add(next2);
            }
        }
        ArrayList<Vendor> arrayList2 = arrayList;
        this.mVendors = arrayList2;
        for (Vendor vendor : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : consentables) {
                Consentable consentable = (Consentable) obj;
                Iterator it2 = consentable.getVendors().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Vendor) next).getId() == vendor.getId()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Vendor vendor2 = (Vendor) next;
                if ((vendor2 != null && !vendor2.isLegVendor()) && (consentable.getType() == ConsentableType.PURPOSE || consentable.getType() == ConsentableType.EXTRA_PURPOSE || consentable.getType() == ConsentableType.SPECIAL_FEATURE)) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.isEmpty()) {
                vendor.setStatus(ConsentStatus.UNDEFINED);
            }
        }
        this.mVendorAdapter.submitList(this.mVendors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vendorStatusChanged$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public void vendorStatusChanged(int adapterPosition, final int vendorId, ConsentStatus newStatus) {
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        getMViewModel().setVendorStatus(vendorId, newStatus).observe(getViewLifecycleOwner(), new RefineByVendorTabFragment$.ExternalSyntheticLambda1(new Function1<Response<? extends Boolean>, Unit>() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment.vendorStatusChanged.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Response<Boolean>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Response<Boolean> response) {
                if (response instanceof Response.Success) {
                    RefineByVendorTabFragment refineByVendorTabFragment = RefineByVendorTabFragment.this;
                    refineByVendorTabFragment.loadData(refineByVendorTabFragment.getMViewModel().getVendors(), RefineByVendorTabFragment.this.getMViewModel().getConsentables());
                    return;
                }
                if (response instanceof Response.Error) {
                    VendorAdapter vendorAdapter = RefineByVendorTabFragment.this.mVendorAdapter;
                    List currentList = RefineByVendorTabFragment.this.mVendorAdapter.getCurrentList();
                    Intrinsics.checkNotNullExpressionValue(currentList, "mVendorAdapter.currentList");
                    int i = vendorId;
                    Iterator it = currentList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else {
                            if (((Vendor) it.next()).getId() == i) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    vendorAdapter.notifyItemChanged(i2);
                    return;
                }
                boolean z = response instanceof Response.Loading;
            }
        }));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object next;
        Iterator<T> it = this.mVendors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Vendor vendor = (Vendor) next;
            boolean z = false;
            if (view != null) {
                int id = vendor.getId();
                Object tag = view.getTag();
                if ((tag instanceof Integer) && id == ((Number) tag).intValue()) {
                    z = true;
                }
            }
            if (z) {
                break;
            }
        }
        Vendor vendor2 = (Vendor) next;
        if (vendor2 != null) {
            ActivityResultLauncher<Intent> activityResultLauncher = this.startForResult;
            VendorDetailActivity.Companion companion = VendorDetailActivity.Companion;
            Context contextRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(contextRequireActivity, "requireActivity()");
            activityResultLauncher.launch(companion.getStartIntent(contextRequireActivity, vendor2.getId(), vendor2.getStatus()));
        }
    }
}
