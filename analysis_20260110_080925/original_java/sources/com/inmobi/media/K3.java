package com.inmobi.media;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class K3 implements Closeable {
    public final InputStream[] a;

    public K3(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InputStream inputStream : this.a) {
            Wc.a(inputStream);
        }
    }
}
