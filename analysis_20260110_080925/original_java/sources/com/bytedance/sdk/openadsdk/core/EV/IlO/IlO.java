package com.bytedance.sdk.openadsdk.core.EV.IlO;

import io.fabric.sdk.android.services.settings.SettingsJsonConstants;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum IlO {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT),
    UNDEFINED_ERROR(900);

    private final int lEW;

    IlO(int i) {
        this.lEW = i;
    }

    public String IlO() {
        return String.valueOf(this.lEW);
    }
}
