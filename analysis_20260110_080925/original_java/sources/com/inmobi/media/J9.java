package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class J9 {
    public static final I9 a(byte b) {
        return b == 1 ? I9.a : b == 2 ? I9.c : b == 3 ? I9.b : b == 4 ? I9.d : I9.a;
    }

    public static final boolean b(I9 i9) {
        Intrinsics.checkNotNullParameter(i9, "<this>");
        return i9 == I9.b || i9 == I9.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int a(I9 i9) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(i9, "<this>");
        int iOrdinal = i9.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
