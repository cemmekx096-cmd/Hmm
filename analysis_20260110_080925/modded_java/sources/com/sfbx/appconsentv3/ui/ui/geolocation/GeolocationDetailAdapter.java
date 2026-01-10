package com.sfbx.appconsentv3.ui.ui.geolocation;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailVendorLitHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationDetailVendorHeaderBinding;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailAdapter$DescriptionHeaderViewHolder$;
import com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailAdapter$VendorLITHeaderViewHolder$;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GeolocationDetailAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\b\u001c\u001d\u001e\u001f !\"#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;", BuildConfig.FLAVOR, "consentable", "Lcom/sfbx/appconsent/core/model/Consentable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/sfbx/appconsentv3/ui/listener/SwitchViewListener;", "mIsLegitimateInterestMustBeDisplayed", BuildConfig.FLAVOR, "(Lcom/sfbx/appconsent/core/model/Consentable;Lcom/sfbx/appconsentv3/ui/listener/SwitchViewListener;Z)V", "description", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "descriptionLegal", "legIntStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "legVendors", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Vendor;", SettingsJsonConstants.APP_STATUS_KEY, "theme", "Lcom/sfbx/appconsentv3/ui/AppConsentTheme;", "getTheme", "()Lcom/sfbx/appconsentv3/ui/AppConsentTheme;", "theme$delegate", "Lkotlin/Lazy;", "type", "Lcom/sfbx/appconsent/core/model/ConsentableType;", "vendors", "DescriptionHeaderAdapter", "DescriptionHeaderViewHolder", "TitleHeaderAdapter", "TitleHeaderViewHolder", "VendorHeaderAdapter", "VendorHeaderViewHolder", "VendorLITHeaderAdapter", "VendorLITHeaderViewHolder", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class GeolocationDetailAdapter {
    private final Consentable consentable;
    private final Map<String, String> description;
    private final Map<String, String> descriptionLegal;
    private final ConsentStatus legIntStatus;
    private final List<Vendor> legVendors;
    private final SwitchViewListener listener;
    private final boolean mIsLegitimateInterestMustBeDisplayed;
    private final ConsentStatus status;

    /* renamed from: theme$delegate, reason: from kotlin metadata */
    private final Lazy theme;
    private final ConsentableType type;
    private final List<Vendor> vendors;

    public GeolocationDetailAdapter(Consentable consentable, SwitchViewListener switchViewListener, boolean z) {
        Intrinsics.checkNotNullParameter(consentable, "consentable");
        Intrinsics.checkNotNullParameter(switchViewListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.consentable = consentable;
        this.listener = switchViewListener;
        this.mIsLegitimateInterestMustBeDisplayed = z;
        this.descriptionLegal = consentable.getDescriptionLegal();
        this.description = consentable.getDescription();
        List vendors = consentable.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (!((Vendor) obj).isLegVendor()) {
                arrayList.add(obj);
            }
        }
        this.vendors = arrayList;
        List vendors2 = this.consentable.getVendors();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : vendors2) {
            if (((Vendor) obj2).isLegVendor()) {
                arrayList2.add(obj2);
            }
        }
        this.legVendors = arrayList2;
        this.theme = LazyKt.lazy(new Function0<AppConsentTheme>() { // from class: com.sfbx.appconsentv3.ui.ui.geolocation.GeolocationDetailAdapter$theme$2
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AppConsentTheme m1019invoke() {
                return UIInjector.INSTANCE.provideAppConsentTheme();
            }
        });
        this.type = this.consentable.getType();
        this.status = this.consentable.getStatus();
        this.legIntStatus = this.consentable.getLegIntStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme.getValue();
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$TitleHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$TitleHeaderViewHolder;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;)V", "getItemCount", BuildConfig.FLAVOR, "getItemViewType", "position", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class TitleHeaderAdapter extends RecyclerView.Adapter<TitleHeaderViewHolder> {
        public int getItemCount() {
            return 1;
        }

        public TitleHeaderAdapter() {
        }

        public TitleHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationDetailHeaderBinding appconsentV3ItemGeolocationDetailHeaderBindingInflate = AppconsentV3ItemGeolocationDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(appconsentV3ItemGeolocationDetailHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new TitleHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemGeolocationDetailHeaderBindingInflate);
        }

        public void onBindViewHolder(TitleHeaderViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(GeolocationDetailAdapter.this.listener);
        }

        public int getItemViewType(int position) {
            return R.layout.appconsent_v3_item_geolocation_detail_header;
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$DescriptionHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$DescriptionHeaderViewHolder;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;)V", "getItemCount", BuildConfig.FLAVOR, "getItemViewType", "position", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class DescriptionHeaderAdapter extends RecyclerView.Adapter<DescriptionHeaderViewHolder> {
        public int getItemCount() {
            return 1;
        }

        public DescriptionHeaderAdapter() {
        }

        public DescriptionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemConsentableDetailHeaderBinding appconsentV3ItemConsentableDetailHeaderBindingInflate = AppconsentV3ItemConsentableDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new DescriptionHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemConsentableDetailHeaderBindingInflate);
        }

        public void onBindViewHolder(DescriptionHeaderViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        public int getItemViewType(int position) {
            return R.layout.appconsent_v3_item_consentable_detail_header;
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorHeaderViewHolder;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;)V", "getItemCount", BuildConfig.FLAVOR, "getItemViewType", "position", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class VendorHeaderAdapter extends RecyclerView.Adapter<VendorHeaderViewHolder> {
        public VendorHeaderAdapter() {
        }

        public VendorHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationDetailVendorHeaderBinding appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate = AppconsentV3ItemGeolocationDetailVendorHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate, "inflate(\n               …      false\n            )");
            return new VendorHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate);
        }

        public int getItemCount() {
            return !GeolocationDetailAdapter.this.vendors.isEmpty() ? 1 : 0;
        }

        public void onBindViewHolder(VendorHeaderViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        public int getItemViewType(int position) {
            return R.layout.appconsent_v3_item_geolocation_detail_vendor_header;
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorLITHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorLITHeaderViewHolder;", "Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/sfbx/appconsentv3/ui/view/RejectButtonView$RejectButtonListener;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;Lcom/sfbx/appconsentv3/ui/view/RejectButtonView$RejectButtonListener;)V", "litStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "getItemCount", BuildConfig.FLAVOR, "getItemViewType", "position", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitStatus", "newStatus", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class VendorLITHeaderAdapter extends RecyclerView.Adapter<VendorLITHeaderViewHolder> {
        private final RejectButtonView.RejectButtonListener listener;
        private ConsentStatus litStatus;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* compiled from: GeolocationDetailAdapter.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConsentableType.FEATURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public VendorLITHeaderAdapter(GeolocationDetailAdapter geolocationDetailAdapter, RejectButtonView.RejectButtonListener rejectButtonListener) {
            Intrinsics.checkNotNullParameter(rejectButtonListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.this$0 = geolocationDetailAdapter;
            this.listener = rejectButtonListener;
            this.litStatus = geolocationDetailAdapter.legIntStatus;
        }

        public VendorLITHeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemConsentableDetailVendorLitHeaderBinding appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate = AppconsentV3ItemConsentableDetailVendorLitHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate, "inflate(\n               …  false\n                )");
            return new VendorLITHeaderViewHolder(this.this$0, appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate);
        }

        public int getItemCount() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.type.ordinal()];
            return (i == 1 || i == 2 || !(this.this$0.legVendors.isEmpty() ^ true) || true != this.this$0.mIsLegitimateInterestMustBeDisplayed) ? 0 : 1;
        }

        public void onBindViewHolder(VendorLITHeaderViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener, this.litStatus);
        }

        public int getItemViewType(int position) {
            return R.layout.appconsent_v3_item_consentable_detail_vendor_lit_header;
        }

        public final void submitStatus(ConsentStatus newStatus) {
            Intrinsics.checkNotNullParameter(newStatus, "newStatus");
            this.litStatus = newStatus;
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$TitleHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemGeolocationDetailHeaderBinding;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemGeolocationDetailHeaderBinding;)V", "bind", BuildConfig.FLAVOR, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/sfbx/appconsentv3/ui/listener/SwitchViewListener;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class TitleHeaderViewHolder extends RecyclerView.ViewHolder {
        private final AppconsentV3ItemGeolocationDetailHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemGeolocationDetailHeaderBinding appconsentV3ItemGeolocationDetailHeaderBinding) {
            super(appconsentV3ItemGeolocationDetailHeaderBinding.getRoot());
            Intrinsics.checkNotNullParameter(appconsentV3ItemGeolocationDetailHeaderBinding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = appconsentV3ItemGeolocationDetailHeaderBinding;
        }

        public final void bind(SwitchViewListener listener) {
            Intrinsics.checkNotNullParameter(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            String nameAsString = this.this$0.consentable.getNameAsString(this.this$0.getTheme().getLanguage$appconsent_ui_v3_prodPremiumRelease());
            this.binding.consentableSwitch.setStatus(this.this$0.status, false);
            this.binding.consentableSwitch.setSwitchListener(listener);
            this.binding.consentableName.setText(nameAsString);
            this.binding.consentableName.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodPremiumRelease());
            AppCompatImageView appCompatImageView = this.binding.consentableLogo;
            Consentable consentable = this.this$0.consentable;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            appCompatImageView.setImageDrawable(ExtensionKt.getConsentableLogo(consentable, context));
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$DescriptionHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemConsentableDetailHeaderBinding;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemConsentableDetailHeaderBinding;)V", "bind", BuildConfig.FLAVOR, "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class DescriptionHeaderViewHolder extends RecyclerView.ViewHolder {
        private final AppconsentV3ItemConsentableDetailHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemConsentableDetailHeaderBinding appconsentV3ItemConsentableDetailHeaderBinding) {
            super(appconsentV3ItemConsentableDetailHeaderBinding.getRoot());
            Intrinsics.checkNotNullParameter(appconsentV3ItemConsentableDetailHeaderBinding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = appconsentV3ItemConsentableDetailHeaderBinding;
        }

        public final void bind() {
            String language = Locale.getDefault().getLanguage();
            AppCompatTextView appCompatTextView = this.binding.textConsentableDetailHeader;
            GeolocationDetailAdapter geolocationDetailAdapter = this.this$0;
            String str = (String) geolocationDetailAdapter.description.get(language);
            String str2 = BuildConfig.FLAVOR;
            if (str == null && (str = (String) CollectionsKt.firstOrNull(geolocationDetailAdapter.description.values())) == null) {
                str = BuildConfig.FLAVOR;
            }
            appCompatTextView.setText(HtmlCompat.fromHtml(str, 63));
            appCompatTextView.setTextColor(geolocationDetailAdapter.getTheme().getTextColor$appconsent_ui_v3_prodPremiumRelease());
            appCompatTextView.setLinkTextColor(geolocationDetailAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodPremiumRelease());
            appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
            String str3 = (String) this.this$0.descriptionLegal.get(language);
            if (str3 == null) {
                str3 = (String) CollectionsKt.firstOrNull(this.this$0.descriptionLegal.values());
            }
            AppCompatTextView appCompatTextView2 = this.binding.textConsentableDetailAdditionnalText;
            if (str3 != null) {
                str2 = str3;
            }
            appCompatTextView2.setText(HtmlCompat.fromHtml(str2, 63));
            this.binding.textConsentableDetailAdditionnalText.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodPremiumRelease());
            this.binding.textConsentableDetailAdditionnalText.setLinkTextColor(this.this$0.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodPremiumRelease());
            this.binding.textConsentableDetailAdditionnalText.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView = this.binding.textConsentableDetailSeeMore;
            GeolocationDetailAdapter geolocationDetailAdapter2 = this.this$0;
            textView.setText(geolocationDetailAdapter2.getTheme().getButtonSeeMoreLegalText$appconsent_ui_v3_prodPremiumRelease());
            Intrinsics.checkNotNullExpressionValue(textView, "bind$lambda$2");
            ViewExtsKt.underline(textView, geolocationDetailAdapter2.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodPremiumRelease());
            textView.setVisibility(str3 != null && (StringsKt.isBlank(str3) ^ true) ? 0 : 8);
            this.binding.imageConsentableDetailApplicationExample.setVisibility(str3 != null && (StringsKt.isBlank(str3) ^ true) ? 0 : 8);
            textView.setOnClickListener(new GeolocationDetailAdapter$DescriptionHeaderViewHolder$.ExternalSyntheticLambda0(this, textView, geolocationDetailAdapter2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(DescriptionHeaderViewHolder descriptionHeaderViewHolder, AppCompatTextView appCompatTextView, GeolocationDetailAdapter geolocationDetailAdapter, View view) {
            int i;
            Intrinsics.checkNotNullParameter(descriptionHeaderViewHolder, "this$0");
            Intrinsics.checkNotNullParameter(appCompatTextView, "$this_apply");
            Intrinsics.checkNotNullParameter(geolocationDetailAdapter, "this$1");
            AppCompatTextView appCompatTextView2 = descriptionHeaderViewHolder.binding.textConsentableDetailAdditionnalText;
            if (descriptionHeaderViewHolder.binding.textConsentableDetailAdditionnalText.getVisibility() == 0) {
                appCompatTextView.setText(geolocationDetailAdapter.getTheme().getButtonSeeMoreLegalText$appconsent_ui_v3_prodPremiumRelease());
                i = 8;
            } else {
                appCompatTextView.setText(geolocationDetailAdapter.getTheme().getContextLocalized$appconsent_ui_v3_prodPremiumRelease().getString(R.string.appconsent_see_less_button));
                i = 0;
            }
            appCompatTextView2.setVisibility(i);
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemGeolocationDetailVendorHeaderBinding;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemGeolocationDetailVendorHeaderBinding;)V", "bind", BuildConfig.FLAVOR, "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class VendorHeaderViewHolder extends RecyclerView.ViewHolder {
        private final AppconsentV3ItemGeolocationDetailVendorHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemGeolocationDetailVendorHeaderBinding appconsentV3ItemGeolocationDetailVendorHeaderBinding) {
            super(appconsentV3ItemGeolocationDetailVendorHeaderBinding.getRoot());
            Intrinsics.checkNotNullParameter(appconsentV3ItemGeolocationDetailVendorHeaderBinding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = appconsentV3ItemGeolocationDetailVendorHeaderBinding;
        }

        public final void bind() {
            this.binding.textVendorHeader.setText(this.this$0.getTheme().getNoticeConsentableDetailLabel1$appconsent_ui_v3_prodPremiumRelease());
            this.binding.textVendorHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodPremiumRelease());
        }
    }

    /* compiled from: GeolocationDetailAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter$VendorLITHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemConsentableDetailVendorLitHeaderBinding;", "(Lcom/sfbx/appconsentv3/ui/ui/geolocation/GeolocationDetailAdapter;Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3ItemConsentableDetailVendorLitHeaderBinding;)V", "bind", BuildConfig.FLAVOR, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/sfbx/appconsentv3/ui/view/RejectButtonView$RejectButtonListener;", "litStatus", "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class VendorLITHeaderViewHolder extends RecyclerView.ViewHolder {
        private final AppconsentV3ItemConsentableDetailVendorLitHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorLITHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemConsentableDetailVendorLitHeaderBinding appconsentV3ItemConsentableDetailVendorLitHeaderBinding) {
            super(appconsentV3ItemConsentableDetailVendorLitHeaderBinding.getRoot());
            Intrinsics.checkNotNullParameter(appconsentV3ItemConsentableDetailVendorLitHeaderBinding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = appconsentV3ItemConsentableDetailVendorLitHeaderBinding;
        }

        public final void bind(RejectButtonView.RejectButtonListener listener, ConsentStatus litStatus) {
            Intrinsics.checkNotNullParameter(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            Intrinsics.checkNotNullParameter(litStatus, "litStatus");
            this.binding.textVendorLitHeader.setOnClickListener(new GeolocationDetailAdapter$VendorLITHeaderViewHolder$.ExternalSyntheticLambda0(this.this$0));
            this.binding.textVendorLitHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodPremiumRelease());
            this.binding.rejectButton.reject(litStatus == ConsentStatus.DISALLOWED);
            this.binding.rejectButton.setRejectButtonListener(listener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(GeolocationDetailAdapter geolocationDetailAdapter, View view) {
            Intrinsics.checkNotNullParameter(geolocationDetailAdapter, "this$0");
            String string = geolocationDetailAdapter.getTheme().getContextLocalized$appconsent_ui_v3_prodPremiumRelease().getString(R.string.appconsent_consentable_details_dialog_message);
            Intrinsics.checkNotNullExpressionValue(string, "theme.contextLocalized.g…e_details_dialog_message)");
            AlertDialogUtil alertDialogUtil = AlertDialogUtil.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "it.context");
            AlertDialog alertDialogBuildAlertDialog$appconsent_ui_v3_prodPremiumRelease = alertDialogUtil.buildAlertDialog$appconsent_ui_v3_prodPremiumRelease(context, geolocationDetailAdapter.getTheme(), string);
            if (alertDialogBuildAlertDialog$appconsent_ui_v3_prodPremiumRelease != null) {
                alertDialogBuildAlertDialog$appconsent_ui_v3_prodPremiumRelease.show();
            }
        }
    }
}
