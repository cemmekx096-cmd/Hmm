package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.GeolocationBannerView;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AppconsentV3ActivityGeolocationBinding implements ViewBinding {
    public final GeolocationBannerView geolocationBanner;
    public final ConstraintLayout intLayout;
    public final RecyclerView recyclerGeolocation;
    private final ConstraintLayout rootView;

    private AppconsentV3ActivityGeolocationBinding(ConstraintLayout constraintLayout, GeolocationBannerView geolocationBannerView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.geolocationBanner = geolocationBannerView;
        this.intLayout = constraintLayout2;
        this.recyclerGeolocation = recyclerView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AppconsentV3ActivityGeolocationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityGeolocationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_geolocation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3ActivityGeolocationBinding bind(View view) {
        int i = R.id.geolocation_banner;
        GeolocationBannerView geolocationBannerViewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (geolocationBannerViewFindChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.recycler_geolocation;
            RecyclerView recyclerViewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (recyclerViewFindChildViewById != null) {
                return new AppconsentV3ActivityGeolocationBinding(constraintLayout, geolocationBannerViewFindChildViewById, constraintLayout, recyclerViewFindChildViewById);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
