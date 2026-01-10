package com.inmobi.media;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class L3 implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final G3 q = new G3();
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public final Bd g;
    public BufferedWriter j;
    public int l;
    public long i = 0;
    public final LinkedHashMap k = new LinkedHashMap(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final F3 o = new F3(this);
    public final int e = 1;
    public final int h = 2;

    public L3(File file, long j, Bd bd) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
        this.g = bd;
    }

    public static void a(L3 l3, I3 i3, boolean z) {
        synchronized (l3) {
            J3 j3 = i3.a;
            if (j3.d != i3) {
                throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
            }
            if (z && !j3.c) {
                for (int i = 0; i < l3.h; i++) {
                    if (!i3.b[i]) {
                        a(i3.d, i3, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!j3.b(i).exists()) {
                        a(i3.d, i3, false);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < l3.h; i2++) {
                File fileB = j3.b(i2);
                if (z) {
                    if (fileB.exists()) {
                        File fileA = j3.a(i2);
                        fileB.renameTo(fileA);
                        long j = j3.b[i2];
                        long length = fileA.length();
                        j3.b[i2] = length;
                        l3.i = (l3.i - j) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            l3.l++;
            j3.d = null;
            if (j3.c || z) {
                j3.c = true;
                BufferedWriter bufferedWriter = l3.j;
                StringBuilder sbAppend = new StringBuilder("CLEAN ").append(j3.a);
                StringBuilder sb = new StringBuilder();
                for (long j2 : j3.b) {
                    sb.append(' ').append(j2);
                }
                bufferedWriter.write(sbAppend.append(sb.toString()).append('\n').toString());
                if (z) {
                    l3.m++;
                }
            } else {
                l3.k.remove(j3.a);
                l3.j.write("REMOVE " + j3.a + '\n');
            }
            l3.j.flush();
            if (l3.i > l3.f || l3.a()) {
                l3.n.submit((Callable) l3.o);
            }
        }
    }

    public final void b() throws IOException {
        File file = this.c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            J3 j3 = (J3) it.next();
            int i = 0;
            if (j3.d == null) {
                while (i < this.h) {
                    this.i += j3.b[i];
                    i++;
                }
            } else {
                j3.d = null;
                while (i < this.h) {
                    File fileA = j3.a(i);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = j3.b(i);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void c() throws IOException {
        Yb yb = new Yb(new FileInputStream(this.b), Wc.a);
        try {
            String strA = yb.a();
            String strA2 = yb.a();
            String strA3 = yb.a();
            String strA4 = yb.a();
            String strA5 = yb.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strA2) || !Integer.toString(this.e).equals(strA3) || !Integer.toString(this.h).equals(strA4) || !BuildConfig.FLAVOR.equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c(yb.a());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    Wc.a((Closeable) yb);
                    return;
                }
            }
        } catch (Throwable th) {
            Wc.a((Closeable) yb);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.j == null) {
            return;
        }
        Iterator it = new ArrayList(this.k.values()).iterator();
        while (it.hasNext()) {
            I3 i3 = ((J3) it.next()).d;
            if (i3 != null) {
                a(i3.d, i3, false);
            }
        }
        while (this.i > this.f) {
            d((String) ((Map.Entry) this.k.entrySet().iterator().next()).getKey());
        }
        this.j.close();
        this.j = null;
    }

    public final synchronized void d() {
        BufferedWriter bufferedWriter = this.j;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(InMobiFilesBridge.fileOutputStreamCtor(this.c), Wc.a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (J3 j3 : this.k.values()) {
                if (j3.d != null) {
                    bufferedWriter2.write("DIRTY " + j3.a + '\n');
                } else {
                    StringBuilder sbAppend = new StringBuilder().append("CLEAN ").append(j3.a);
                    StringBuilder sb = new StringBuilder();
                    for (long j : j3.b) {
                        sb.append(' ').append(j);
                    }
                    bufferedWriter2.write(sbAppend.append(sb.toString()).append('\n').toString());
                }
            }
            bufferedWriter2.close();
            if (this.b.exists()) {
                File file = this.b;
                File file2 = this.d;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.c.renameTo(this.b)) {
                throw new IOException();
            }
            this.d.delete();
            this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), Wc.a));
        } catch (Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    public final synchronized K3 b(String str) {
        InputStream inputStream;
        if (this.j != null) {
            if (p.matcher(str).matches()) {
                J3 j3 = (J3) this.k.get(str);
                if (j3 == null) {
                    return null;
                }
                if (!j3.c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.h];
                for (int i = 0; i < this.h; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(j3.a(i));
                    } catch (FileNotFoundException unused) {
                        if (this.g != null) {
                            Intrinsics.checkNotNullParameter(str, "key");
                            Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("urlKey", str)});
                            ic icVar = ic.a;
                            ic.b("ResourceDiskCacheFileMissing", mapMutableMapOf, mc.a);
                        }
                        for (int i2 = 0; i2 < this.h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            Wc.a(inputStream);
                        }
                        return null;
                    }
                }
                this.l++;
                this.j.append((CharSequence) ("READ " + str + '\n'));
                if (a()) {
                    this.n.submit((Callable) this.o);
                }
                return new K3(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.k.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i, iIndexOf2);
            }
            J3 j3 = (J3) this.k.get(strSubstring);
            if (j3 == null) {
                j3 = new J3(this, strSubstring);
                this.k.put(strSubstring, j3);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                j3.c = true;
                j3.d = null;
                if (strArrSplit.length == j3.e.h) {
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        try {
                            j3.b[i2] = Long.parseLong(strArrSplit[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                j3.d = new I3(this, j3);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void d(String str) {
        if (this.j != null) {
            if (p.matcher(str).matches()) {
                J3 j3 = (J3) this.k.get(str);
                if (j3 != null && j3.d == null) {
                    for (int i = 0; i < this.h; i++) {
                        File fileA = j3.a(i);
                        if (this.g != null) {
                            Intrinsics.checkNotNullParameter(fileA, "file");
                            if (str != null && i == 0) {
                                String str2 = BuildConfig.FLAVOR;
                                try {
                                    String strA = Wc.a(new InputStreamReader(new FileInputStream(fileA), Wc.b));
                                    Intrinsics.checkNotNullExpressionValue(strA, "readFully(...)");
                                    str2 = strA;
                                } catch (Exception unused) {
                                }
                                Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("urlKey", str), TuplesKt.to("url", str2)});
                                ic icVar = ic.a;
                                ic.b("ResourceDiskCacheFileEvicted", mapMutableMapOf, mc.a);
                            }
                        }
                        if (fileA.exists() && !fileA.delete()) {
                            throw new IOException("failed to delete " + fileA);
                        }
                        long j = this.i;
                        long[] jArr = j3.b;
                        this.i = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.l++;
                    this.j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.k.remove(str);
                    if (a()) {
                        this.n.submit((Callable) this.o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final I3 a(String str) {
        synchronized (this) {
            if (this.j != null) {
                if (p.matcher(str).matches()) {
                    J3 j3 = (J3) this.k.get(str);
                    if (j3 == null) {
                        j3 = new J3(this, str);
                        this.k.put(str, j3);
                    } else if (j3.d != null) {
                        return null;
                    }
                    I3 i3 = new I3(this, j3);
                    j3.d = i3;
                    this.j.write("DIRTY " + str + '\n');
                    this.j.flush();
                    return i3;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean a() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }
}
