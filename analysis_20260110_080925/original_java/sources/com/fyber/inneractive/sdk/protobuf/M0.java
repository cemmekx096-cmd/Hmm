package com.fyber.inneractive.sdk.protobuf;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class M0 {
    public static final L0 a;
    public static final L0 b;

    static {
        L0 l0 = null;
        try {
            l0 = (L0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = l0;
        b = new L0();
    }
}
