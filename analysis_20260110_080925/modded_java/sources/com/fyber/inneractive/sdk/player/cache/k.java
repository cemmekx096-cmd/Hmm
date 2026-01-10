package com.fyber.inneractive.sdk.player.cache;

import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class k {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName(HttpRequest.CHARSET_UTF8);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
