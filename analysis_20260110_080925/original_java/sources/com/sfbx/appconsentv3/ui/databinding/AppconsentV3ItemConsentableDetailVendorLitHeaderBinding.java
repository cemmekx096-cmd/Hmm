package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AppconsentV3ItemConsentableDetailVendorLitHeaderBinding implements ViewBinding {
    public final RejectButtonView rejectButton;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textVendorLitHeader;

    private AppconsentV3ItemConsentableDetailVendorLitHeaderBinding(ConstraintLayout constraintLayout, RejectButtonView rejectButtonView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.rejectButton = rejectButtonView;
        this.textVendorLitHeader = appCompatTextView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_consentable_detail_vendor_lit_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding bind(View view) {
        AppCompatTextView appCompatTextViewFindChildViewById;
        int i = R.id.reject_button;
        RejectButtonView rejectButtonViewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (rejectButtonViewFindChildViewById != null && (appCompatTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.text_vendor_lit_header))) != null) {
            return new AppconsentV3ItemConsentableDetailVendorLitHeaderBinding((ConstraintLayout) view, rejectButtonViewFindChildViewById, appCompatTextViewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
