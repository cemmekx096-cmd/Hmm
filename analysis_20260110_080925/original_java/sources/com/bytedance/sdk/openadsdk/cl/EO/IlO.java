package com.bytedance.sdk.openadsdk.cl.EO;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO {
    private final SharedPreferences IlO;

    public IlO(Context context) {
        this.IlO = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long IlO() {
        return this.IlO.getLong("last_upload_time", 0L);
    }

    public void IlO(long j) {
        SharedPreferences.Editor editorEdit = this.IlO.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
