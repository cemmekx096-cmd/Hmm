package com.fyber.inneractive.sdk.protobuf;

import com.crashlytics.android.BuildConfig;
import java.io.Serializable;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public enum L1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(s.b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    L1(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
