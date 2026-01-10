package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.SwitchView;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AppconsentV3ItemGeolocationDetailHeaderBinding implements ViewBinding {
    public final AppCompatImageView consentableLogo;
    public final AppCompatTextView consentableName;
    public final SwitchView consentableSwitch;
    private final LinearLayoutCompat rootView;

    private AppconsentV3ItemGeolocationDetailHeaderBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, SwitchView switchView) {
        this.rootView = linearLayoutCompat;
        this.consentableLogo = appCompatImageView;
        this.consentableName = appCompatTextView;
        this.consentableSwitch = switchView;
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_geolocation_detail_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding bind(View view) {
        AppCompatTextView appCompatTextViewFindChildViewById;
        SwitchView switchViewFindChildViewById;
        int i = R.id.consentable_logo;
        AppCompatImageView appCompatImageViewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (appCompatImageViewFindChildViewById != null && (appCompatTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.consentable_name))) != null && (switchViewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.consentable_switch))) != null) {
            return new AppconsentV3ItemGeolocationDetailHeaderBinding((LinearLayoutCompat) view, appCompatImageViewFindChildViewById, appCompatTextViewFindChildViewById, switchViewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
