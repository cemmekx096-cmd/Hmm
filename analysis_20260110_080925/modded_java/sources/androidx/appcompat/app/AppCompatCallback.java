package androidx.appcompat.app;

import androidx.appcompat.view.ActionMode;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface AppCompatCallback {
    void onSupportActionModeFinished(ActionMode mode);

    void onSupportActionModeStarted(ActionMode mode);

    ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback);
}
