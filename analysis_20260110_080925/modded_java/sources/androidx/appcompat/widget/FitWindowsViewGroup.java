package androidx.appcompat.widget;

import android.graphics.Rect;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface FitWindowsViewGroup {

    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(Rect insets);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener listener);
}
