package com.inmobi.media;

import androidx.media3.exoplayer.RendererCapabilities;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class Wc {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName(HttpRequest.CHARSET_UTF8);

    public static String a(InputStreamReader inputStreamReader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
