package com.helpshift.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class SharedPreferencesStore implements ISharedPreferencesStore {
    private final SharedPreferences preferences;

    public SharedPreferencesStore(Context context, String str, int i) {
        this.preferences = context.getSharedPreferences(str, i);
    }

    public String getString(String str) {
        return this.preferences.getString(str, BuildConfig.FLAVOR);
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(str, str2);
        if (editorEdit.commit()) {
            return;
        }
        editorEdit.commit();
    }

    public void remove(String str) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove(str);
        if (editorEdit.commit()) {
            return;
        }
        editorEdit.commit();
    }

    public void putLong(String str, long j) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putLong(str, j);
        if (editorEdit.commit()) {
            return;
        }
        editorEdit.commit();
    }

    public long getLong(String str) {
        return this.preferences.getLong(str, 0L);
    }

    public void putInt(String str, int i) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putInt(str, i);
        if (editorEdit.commit()) {
            return;
        }
        editorEdit.commit();
    }

    public int getInt(String str) {
        return this.preferences.getInt(str, 0);
    }

    public void putBoolean(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(str, z);
        if (editorEdit.commit()) {
            return;
        }
        editorEdit.commit();
    }

    public boolean getBoolean(String str) {
        return this.preferences.getBoolean(str, false);
    }

    public void clear() {
        this.preferences.edit().clear().commit();
    }
}
