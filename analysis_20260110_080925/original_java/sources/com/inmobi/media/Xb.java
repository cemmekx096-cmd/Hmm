package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Xb extends ByteArrayOutputStream {
    public final /* synthetic */ Yb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(Yb yb, int i) {
        super(i);
        this.a = yb;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i;
        i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
    }
}
