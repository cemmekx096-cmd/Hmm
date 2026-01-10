package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Y1 {
    public BitSet a;

    public final void a(String str) {
        byte[] bArrDecode;
        BitSet bitSetValueOf;
        Intrinsics.checkNotNullParameter(str, "b64String");
        try {
            bArrDecode = Base64.decode(str, 0);
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            bArrDecode = null;
        }
        if (bArrDecode != null) {
            Intrinsics.checkNotNullParameter(bArrDecode, "value");
            if (E3.a.F()) {
                bitSetValueOf = BitSet.valueOf(bArrDecode);
            } else {
                Intrinsics.checkNotNullParameter(bArrDecode, "<this>");
                BitSet bitSet = new BitSet(bArrDecode.length * 8);
                int i = 0;
                for (byte b : bArrDecode) {
                    int i2 = 0;
                    while (i2 < 8) {
                        boolean z = true;
                        int i3 = i + 1;
                        if (((b >> ((byte) i2)) & 1) != 1) {
                            z = false;
                        }
                        bitSet.set(i, z);
                        i2++;
                        i = i3;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.a = bitSetValueOf;
        }
    }
}
