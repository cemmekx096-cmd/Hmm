package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sfbx.appconsentv3.ui.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AppconsentV3CardCopyrightBinding implements ViewBinding {
    public final AppCompatTextView cardCopyrightText;
    private final LinearLayoutCompat rootView;

    private AppconsentV3CardCopyrightBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.cardCopyrightText = appCompatTextView;
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static AppconsentV3CardCopyrightBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardCopyrightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_copyright, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AppconsentV3CardCopyrightBinding bind(View view) {
        int i = R.id.card_copyright_text;
        AppCompatTextView appCompatTextViewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (appCompatTextViewFindChildViewById != null) {
            return new AppconsentV3CardCopyrightBinding((LinearLayoutCompat) view, appCompatTextViewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
