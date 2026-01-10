package com.sfbx.appconsentv3.ui.ui.geolocation;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ActivityGeolocationBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity$;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationAdapter;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailActivity;
import com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter;
import com.sfbx.appconsentv3.ui.view.GeolocationBannerView;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import io.sfbx.appconsent.logger.ACLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: GeolocationActivity.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0018\u0010+\u001a\u00020\u001d2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\nH\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\fH\u0016J\u0018\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationActivity;", "Lcom/sfbx/appconsentv3/ui/AppConsentActivity;", "Lcom/sfbx/appconsentv3/ui/listener/ConsentableListener;", "()V", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ActivityGeolocationBinding;", "mConsentableAdapter", "Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter;", "mConsentableObserver", "Landroidx/lifecycle/Observer;", "Lcom/sfbx/appconsentv3/ui/model/Response;", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Consentable;", "mGeolocationConsentables", BuildConfig.FLAVOR, "mViewModel", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationViewModel;", "getMViewModel", "()Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "triggeredByUser", BuildConfig.FLAVOR, "checkThemeIsDialog", "consentableStatusChanged", BuildConfig.FLAVOR, "consentableId", BuildConfig.FLAVOR, "type", "Lcom/sfbx/appconsent/core/model/ConsentableType;", "newStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "isAllSelected", "loading", "isLoading", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveConsentsObserver", "it", "seeMore", "consentable", "sendTrackEvent", "Companion", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class GeolocationActivity extends AppConsentActivity implements ConsentableListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_TRIGGER_BY_USER = "extra_trigger_by_user";
    private static final String FULL_SCREEN_MODE = "FULL_SCREEN_MODE";
    private AppconsentV3ActivityGeolocationBinding binding;
    private final ConsentableAdapter mConsentableAdapter;
    private final Observer<Response<List<Consentable>>> mConsentableObserver;
    private final List<Consentable> mGeolocationConsentables;

    /* renamed from: mViewModel$delegate, reason: from kotlin metadata */
    private final Lazy mViewModel;
    private final ActivityResultLauncher<Intent> startForResult;
    private boolean triggeredByUser;

    /* compiled from: GeolocationActivity.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.PURPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final Intent getResultIntent(int i, ConsentStatus consentStatus) {
        return INSTANCE.getResultIntent(i, consentStatus);
    }

    /* compiled from: GeolocationActivity.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationActivity$Companion;", BuildConfig.FLAVOR, "()V", "EXTRA_ID", BuildConfig.FLAVOR, "EXTRA_STATUS", "EXTRA_TRIGGER_BY_USER", GeolocationActivity.FULL_SCREEN_MODE, "getResultIntent", "Landroid/content/Intent;", "id", BuildConfig.FLAVOR, SettingsJsonConstants.APP_STATUS_KEY, "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "getStartIntent", "context", "Landroid/content/Context;", "triggerByUser", BuildConfig.FLAVOR, "fullScreenMode", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getStartIntent(Context context, boolean triggerByUser, boolean fullScreenMode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) GeolocationActivity.class);
            intent.putExtra(GeolocationActivity.EXTRA_TRIGGER_BY_USER, triggerByUser);
            intent.putExtra(GeolocationActivity.FULL_SCREEN_MODE, fullScreenMode);
            intent.setFlags(268435456);
            return intent;
        }

        @JvmStatic
        public final Intent getResultIntent(int id, ConsentStatus status) {
            Intrinsics.checkNotNullParameter(status, SettingsJsonConstants.APP_STATUS_KEY);
            Intent intent = new Intent();
            intent.putExtra(GeolocationActivity.EXTRA_ID, id);
            intent.putExtra(GeolocationActivity.EXTRA_STATUS, (Serializable) status);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeolocationViewModel getMViewModel() {
        return (GeolocationViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mConsentableObserver$lambda$0(GeolocationActivity geolocationActivity, Response response) {
        Intrinsics.checkNotNullParameter(geolocationActivity, "this$0");
        if (response instanceof Response.Success) {
            geolocationActivity.loading(false);
            Response.Success success = (Response.Success) response;
            if (((List) success.getData()).isEmpty()) {
                geolocationActivity.finish();
                return;
            }
            geolocationActivity.mGeolocationConsentables.addAll((Collection) success.getData());
            geolocationActivity.mConsentableAdapter.submitList(geolocationActivity.mGeolocationConsentables);
            if (geolocationActivity.isAllSelected()) {
                AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = geolocationActivity.binding;
                if (appconsentV3ActivityGeolocationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    appconsentV3ActivityGeolocationBinding = null;
                }
                appconsentV3ActivityGeolocationBinding.geolocationBanner.updateBannerUI();
                return;
            }
            return;
        }
        if (response instanceof Response.Error) {
            geolocationActivity.loading(false);
            geolocationActivity.finish();
        } else if (response instanceof Response.Loading) {
            geolocationActivity.loading(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$3(GeolocationActivity geolocationActivity, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(geolocationActivity, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Object obj = null;
            Integer numValueOf = data != null ? Integer.valueOf(data.getIntExtra(EXTRA_ID, 0)) : null;
            Intent data2 = activityResult.getData();
            Serializable serializableExtra = data2 != null ? data2.getSerializableExtra(EXTRA_STATUS) : null;
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
            ConsentStatus consentStatus = (ConsentStatus) serializableExtra;
            List currentList = geolocationActivity.mConsentableAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "mConsentableAdapter.currentList");
            Iterator it = currentList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (numValueOf != null && ((Consentable) next).getId() == numValueOf.intValue()) {
                    obj = next;
                    break;
                }
            }
            Consentable consentable = (Consentable) obj;
            if (consentable != null) {
                consentable.setStatus(consentStatus);
                ConsentableAdapter consentableAdapter = geolocationActivity.mConsentableAdapter;
                consentableAdapter.notifyItemChanged(consentableAdapter.getCurrentList().indexOf(consentable));
            }
        }
    }

    private final boolean checkThemeIsDialog() {
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(getAppConsentTheme$appconsent_ui_v3_prodPremiumRelease().getTheme$appconsent_ui_v3_prodPremiumRelease(), new int[]{R.attr.windowCloseOnTouchOutside});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(a…onsentTheme.theme, attrs)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        super.onCreate(savedInstanceState);
        if (getIntent().getBooleanExtra(FULL_SCREEN_MODE, false)) {
            setTheme((getAppConsentTheme$appconsent_ui_v3_prodPremiumRelease().getTheme$appconsent_ui_v3_prodPremiumRelease() == 0 || checkThemeIsDialog()) ? com.sfbx.appconsentv3.ui.R.style.AppConsentV3Theme : getAppConsentTheme$appconsent_ui_v3_prodPremiumRelease().getTheme$appconsent_ui_v3_prodPremiumRelease());
        }
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBindingInflate = AppconsentV3ActivityGeolocationBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(appconsentV3ActivityGeolocationBindingInflate, "inflate(layoutInflater)");
        this.binding = appconsentV3ActivityGeolocationBindingInflate;
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = null;
        if (appconsentV3ActivityGeolocationBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBindingInflate = null;
        }
        setContentView((View) appconsentV3ActivityGeolocationBindingInflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = this.binding;
        if (appconsentV3ActivityGeolocationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding2 = null;
        }
        appconsentV3ActivityGeolocationBinding2.intLayout.setBackgroundColor(getAppConsentTheme$appconsent_ui_v3_prodPremiumRelease().getBannerBackgroundColor$appconsent_ui_v3_prodPremiumRelease());
        Intent intent = getIntent();
        this.triggeredByUser = (intent == null || (extras = intent.getExtras()) == null) ? false : extras.getBoolean(EXTRA_TRIGGER_BY_USER);
        GeolocationAdapter geolocationAdapter = new GeolocationAdapter();
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding3 = this.binding;
        if (appconsentV3ActivityGeolocationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding3 = null;
        }
        RecyclerView recyclerView = appconsentV3ActivityGeolocationBinding3.recyclerGeolocation;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{(RecyclerView.Adapter) new GeolocationAdapter.GeolocationHeaderAdapter(geolocationAdapter), (RecyclerView.Adapter) this.mConsentableAdapter, (RecyclerView.Adapter) new GeolocationAdapter.GeolocationFooterAdapter(geolocationAdapter)}));
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding4 = this.binding;
        if (appconsentV3ActivityGeolocationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityGeolocationBinding = appconsentV3ActivityGeolocationBinding4;
        }
        appconsentV3ActivityGeolocationBinding.geolocationBanner.setOnClickButtonListener(new GeolocationBannerView.OnClickGeolocButtonListener() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity.onCreate.2
            public void onClickSave() {
                GeolocationActivity.this.getMViewModel().save();
            }
        });
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this;
        getMViewModel().getConsentables().observe(lifecycleOwner, this.mConsentableObserver);
        getMViewModel().getSave().observe(lifecycleOwner, new GeolocationActivity$.ExternalSyntheticLambda0(new Function1<Response<? extends Boolean>, Unit>() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity.onCreate.3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Response<Boolean>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Response<Boolean> response) {
                GeolocationActivity.this.saveConsentsObserver(response);
            }
        }));
        getMViewModel().fetchConsentables();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public void onBackPressed() {
        if (this.triggeredByUser) {
            super.onBackPressed();
        }
    }

    public void consentableStatusChanged(int consentableId, ConsentableType type, ConsentStatus newStatus) {
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding;
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        if (type == ConsentableType.PURPOSE) {
            getMViewModel().sendSwitchPurposeIsOnOffTrackEvent(consentableId, newStatus == ConsentStatus.ALLOWED);
        } else if (type == ConsentableType.STACK) {
            getMViewModel().sendSwitchStackIsOnOffTrackEvent(consentableId, newStatus == ConsentStatus.ALLOWED);
        }
        Iterator<T> it = this.mGeolocationConsentables.iterator();
        while (true) {
            appconsentV3ActivityGeolocationBinding = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Consentable consentable = (Consentable) next;
            if (consentable.getId() == consentableId && consentable.getType() == type) {
                break;
            }
        }
        Consentable consentable2 = (Consentable) next;
        if (consentable2 != null) {
            consentable2.setStatus(newStatus);
        }
        if (isAllSelected()) {
            AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = this.binding;
            if (appconsentV3ActivityGeolocationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                appconsentV3ActivityGeolocationBinding = appconsentV3ActivityGeolocationBinding2;
            }
            appconsentV3ActivityGeolocationBinding.geolocationBanner.updateBannerUI();
        }
        getMViewModel().setConsentableStatus(consentableId, newStatus);
    }

    private final boolean isAllSelected() {
        List<Consentable> list = this.mGeolocationConsentables;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((Consentable) it.next()).getStatus() != ConsentStatus.PENDING)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void seeMore(Consentable consentable) {
        Object next;
        ConsentStatus status;
        Intrinsics.checkNotNullParameter(consentable, "consentable");
        sendTrackEvent(consentable.getId(), consentable.getType());
        ActivityResultLauncher<Intent> activityResultLauncher = this.startForResult;
        GeolocationDetailActivity.Companion companion = GeolocationDetailActivity.Companion;
        Context context = (Context) this;
        int id = consentable.getId();
        ConsentableType type = consentable.getType();
        Iterator<T> it = this.mGeolocationConsentables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Consentable consentable2 = (Consentable) next;
            if (consentable2.getId() == consentable.getId() && consentable2.getType() == consentable.getType()) {
                break;
            }
        }
        Consentable consentable3 = (Consentable) next;
        if (consentable3 == null || (status = consentable3.getStatus()) == null) {
            status = ConsentStatus.PENDING;
        }
        activityResultLauncher.launch(companion.getStartIntent(context, id, type, status));
    }

    private final void sendTrackEvent(int consentableId, ConsentableType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            getMViewModel().sendClickDetailPurposeTrackEvent(consentableId);
        } else {
            if (i != 2) {
                return;
            }
            getMViewModel().sendClickDetailSpecialPurposeTrackEvent(consentableId);
        }
    }

    private final void loading(boolean isLoading) {
        displaySpinner(isLoading);
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding = this.binding;
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding2 = null;
        if (appconsentV3ActivityGeolocationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            appconsentV3ActivityGeolocationBinding = null;
        }
        appconsentV3ActivityGeolocationBinding.recyclerGeolocation.setVisibility(isLoading ? 4 : 0);
        AppconsentV3ActivityGeolocationBinding appconsentV3ActivityGeolocationBinding3 = this.binding;
        if (appconsentV3ActivityGeolocationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            appconsentV3ActivityGeolocationBinding2 = appconsentV3ActivityGeolocationBinding3;
        }
        appconsentV3ActivityGeolocationBinding2.geolocationBanner.setVisibility(isLoading ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveConsentsObserver(Response<Boolean> it) {
        if (it instanceof Response.Success) {
            loading(false);
            finish();
        } else {
            if (it instanceof Response.Error) {
                loading(false);
                ACLogger aCLogger = ACLogger.INSTANCE;
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
                aCLogger.e(simpleName, ((Response.Error) it).getError());
                return;
            }
            if (it instanceof Response.Loading) {
                loading(true);
            }
        }
    }

    public GeolocationActivity() {
        super(false, 1, (DefaultConstructorMarker) null);
        final ComponentActivity componentActivity = (ComponentActivity) this;
        this.mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GeolocationViewModel.class), new Function0<ViewModelStore>() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity$special$$inlined$viewModels$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m1013invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationActivity$mViewModel$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m1014invoke() {
                return this.this$0.getViewModelFactory$appconsent_ui_v3_prodPremiumRelease();
            }
        });
        this.mConsentableAdapter = new ConsentableAdapter(this);
        this.mGeolocationConsentables = new ArrayList();
        this.mConsentableObserver = new GeolocationActivity$.ExternalSyntheticLambda1(this);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult((ActivityResultContract) new ActivityResultContracts.StartActivityForResult(), new GeolocationActivity$.ExternalSyntheticLambda2(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.startForResult = activityResultLauncherRegisterForActivityResult;
    }
}
