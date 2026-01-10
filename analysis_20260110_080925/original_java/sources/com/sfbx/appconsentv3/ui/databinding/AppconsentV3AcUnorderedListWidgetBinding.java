package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.sfbx.appconsentv3.ui.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AppconsentV3AcUnorderedListWidgetBinding implements ViewBinding {
    public final LinearLayoutCompat acUnorderedListWidget;
    private final LinearLayoutCompat rootView;

    private AppconsentV3AcUnorderedListWidgetBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.acUnorderedListWidget = linearLayoutCompat2;
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static AppconsentV3AcUnorderedListWidgetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3AcUnorderedListWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_ac_unordered_list_widget, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3AcUnorderedListWidgetBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        return new AppconsentV3AcUnorderedListWidgetBinding(linearLayoutCompat, linearLayoutCompat);
    }
}
