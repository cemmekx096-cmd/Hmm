package com.sfbx.appconsentv3.ui.ui.notice;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardConsentableBinding;
import com.sfbx.appconsentv3.ui.di.UIInjector;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.view.ConsentableCardView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentableAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/sfbx/appconsent/core/model/Consentable;", "Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter$ConsentableViewHolder;", "consentableListener", "Lcom/sfbx/appconsentv3/ui/listener/ConsentableListener;", "(Lcom/sfbx/appconsentv3/ui/listener/ConsentableListener;)V", "appTheme", "Lcom/sfbx/appconsentv3/ui/AppConsentTheme;", "getAppTheme", "()Lcom/sfbx/appconsentv3/ui/AppConsentTheme;", "appTheme$delegate", "Lkotlin/Lazy;", "getItemViewType", BuildConfig.FLAVOR, "position", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ConsentableDiffCallback", "ConsentableViewHolder", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ConsentableAdapter extends ListAdapter<Consentable, ConsentableViewHolder> {

    /* renamed from: appTheme$delegate, reason: from kotlin metadata */
    private final Lazy appTheme;
    private final ConsentableListener consentableListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableAdapter(ConsentableListener consentableListener) {
        super(new ConsentableDiffCallback());
        Intrinsics.checkNotNullParameter(consentableListener, "consentableListener");
        this.consentableListener = consentableListener;
        this.appTheme = LazyKt.lazy(new Function0<AppConsentTheme>() { // from class: com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter$appTheme$2
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AppConsentTheme m1021invoke() {
                return UIInjector.INSTANCE.provideAppConsentTheme();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppTheme() {
        return (AppConsentTheme) this.appTheme.getValue();
    }

    public ConsentableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppconsentV3CardConsentableBinding appconsentV3CardConsentableBindingInflate = AppconsentV3CardConsentableBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(appconsentV3CardConsentableBindingInflate, "inflate(layoutInflater, parent, false)");
        return new ConsentableViewHolder(this, appconsentV3CardConsentableBindingInflate);
    }

    public void onBindViewHolder(ConsentableViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Consentable consentable = (Consentable) getItem(position);
        Intrinsics.checkNotNullExpressionValue(consentable, "consentable");
        holder.bind(consentable);
    }

    public int getItemViewType(int position) {
        return R.layout.appconsent_v3_card_consentable;
    }

    /* compiled from: ConsentableAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter$ConsentableDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/sfbx/appconsent/core/model/Consentable;", "()V", "areContentsTheSame", BuildConfig.FLAVOR, "oldItem", "newItem", "areItemsTheSame", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class ConsentableDiffCallback extends DiffUtil.ItemCallback<Consentable> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Consentable oldItem, Consentable newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId() && oldItem.getType() == newItem.getType();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Consentable oldItem, Consentable newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getType() == newItem.getType() && oldItem.getStatus() == newItem.getStatus() && oldItem.getName().values().containsAll(newItem.getName().values()) && oldItem.getName().keySet().containsAll(newItem.getName().keySet());
        }
    }

    /* compiled from: ConsentableAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter$ConsentableViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3CardConsentableBinding;", "(Lcom/sfbx/appconsentv3/ui/ui/notice/ConsentableAdapter;Lcom/sfbx/appconsentv3/ui/databinding/AppconsentV3CardConsentableBinding;)V", "aConsentable", "Lcom/sfbx/appconsent/core/model/Consentable;", "getAConsentable", "()Lcom/sfbx/appconsent/core/model/Consentable;", "setAConsentable", "(Lcom/sfbx/appconsent/core/model/Consentable;)V", "bind", BuildConfig.FLAVOR, "consentable", "appconsent-ui-v3_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ConsentableViewHolder extends RecyclerView.ViewHolder {
        public Consentable aConsentable;
        private final AppconsentV3CardConsentableBinding binding;
        final /* synthetic */ ConsentableAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableViewHolder(ConsentableAdapter consentableAdapter, AppconsentV3CardConsentableBinding appconsentV3CardConsentableBinding) {
            super(appconsentV3CardConsentableBinding.getRoot());
            Intrinsics.checkNotNullParameter(appconsentV3CardConsentableBinding, "binding");
            this.this$0 = consentableAdapter;
            this.binding = appconsentV3CardConsentableBinding;
        }

        public final Consentable getAConsentable() {
            Consentable consentable = this.aConsentable;
            if (consentable != null) {
                return consentable;
            }
            Intrinsics.throwUninitializedPropertyAccessException("aConsentable");
            return null;
        }

        public final void setAConsentable(Consentable consentable) {
            Intrinsics.checkNotNullParameter(consentable, "<set-?>");
            this.aConsentable = consentable;
        }

        public final void bind(Consentable consentable) {
            Intrinsics.checkNotNullParameter(consentable, "consentable");
            setAConsentable(consentable);
            final ConsentableCardView consentableCardView = this.binding.cpConsentable;
            ConsentableAdapter consentableAdapter = this.this$0;
            consentableCardView.setVisibility(0);
            consentableCardView.setConsentable(consentable);
            ExtensionKt.notNull(consentableAdapter.consentableListener, new Function1<ConsentableListener, Unit>() { // from class: com.sfbx.appconsentv3.ui.ui.notice.ConsentableAdapter$ConsentableViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ConsentableListener) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(ConsentableListener consentableListener) {
                    Intrinsics.checkNotNullParameter(consentableListener, "it");
                    consentableCardView.setConsentableListener(consentableListener);
                }
            });
            this.binding.configCustomConsentableSeparator.setBackgroundColor(this.this$0.getAppTheme().getSeparatorColor$appconsent_ui_v3_prodPremiumRelease());
        }
    }
}
