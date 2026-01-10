package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.sfbx.appconsentv3.ui.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AppconsentV3ItemVendorDetailCategoriesHeaderBinding implements ViewBinding {
    public final ChipGroup appconsentclearVendorDetailCategoriesGroup;
    public final AppCompatTextView appconsentclearVendorDetailCategoriesTitle;
    private final ConstraintLayout rootView;

    private AppconsentV3ItemVendorDetailCategoriesHeaderBinding(ConstraintLayout constraintLayout, ChipGroup chipGroup, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.appconsentclearVendorDetailCategoriesGroup = chipGroup;
        this.appconsentclearVendorDetailCategoriesTitle = appCompatTextView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AppconsentV3ItemVendorDetailCategoriesHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemVendorDetailCategoriesHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_vendor_detail_categories_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3ItemVendorDetailCategoriesHeaderBinding bind(View view) {
        AppCompatTextView appCompatTextViewFindChildViewById;
        int i = R.id.appconsentclear_vendor_detail_categories_group;
        ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
        if (chipGroup != null && (appCompatTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.appconsentclear_vendor_detail_categories_title))) != null) {
            return new AppconsentV3ItemVendorDetailCategoriesHeaderBinding((ConstraintLayout) view, chipGroup, appCompatTextViewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
