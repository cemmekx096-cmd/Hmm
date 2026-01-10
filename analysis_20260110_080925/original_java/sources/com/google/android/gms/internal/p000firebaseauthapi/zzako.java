package com.google.android.gms.internal.p000firebaseauthapi;

import com.crashlytics.android.BuildConfig;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum zzako {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(zzaiw.class, zzaiw.class, zzaiw.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> zzl;

    public final Class<?> zza() {
        return this.zzl;
    }

    zzako(Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }
}
