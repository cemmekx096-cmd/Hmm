package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Arrays;

/* compiled from: Settings.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class m {
    private int a;
    private final int[] b = new int[10];

    void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    int c(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    boolean d(int i) {
        return ((1 << i) & this.a) != 0;
    }

    int b(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    int c() {
        if ((this.a & RendererCapabilities.DECODER_SUPPORT_PRIMARY) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    int d() {
        return Integer.bitCount(this.a);
    }

    m a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    int a(int i) {
        return this.b[i];
    }

    void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.d(i)) {
                a(i, mVar.a(i));
            }
        }
    }
}
