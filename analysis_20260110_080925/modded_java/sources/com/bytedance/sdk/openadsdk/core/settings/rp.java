package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.settings.Cc;
import com.bytedance.sdk.openadsdk.utils.hp;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class rp implements Cc {
    private final String Bc;
    private IlO NV;
    private final ConcurrentHashMap<String, Object> EO = new ConcurrentHashMap<>();
    private final Object tV = new Object();
    private final Object Cc = new Object();
    private final CountDownLatch vCE = new CountDownLatch(1);
    private Properties lEW = new Properties();
    private volatile boolean DmF = false;

    public interface IlO {
        void IlO();

        void MY();
    }

    public rp(String str, IlO ilO) {
        this.Bc = str;
        this.NV = ilO;
        mmj.IlO(new lEW("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.rp.1
            public void run() {
                rp.this.IlO(false);
            }
        });
    }

    public String IlO(String str, String str2) throws InterruptedException {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        Cc();
        return this.lEW.getProperty(str, str2);
    }

    private void Cc() throws InterruptedException {
        if (this.DmF) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.vCE.await(mmj.vCE() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            oeT.IlO("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public int IlO(String str, int i) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            Cc();
            try {
                return Integer.parseInt(this.lEW.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                oeT.IlO("SdkSettings.Prop", BuildConfig.FLAVOR, e);
            }
        }
        return i;
    }

    public long IlO(String str, long j) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            Cc();
            try {
                return Long.parseLong(this.lEW.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                oeT.IlO("SdkSettings.Prop", BuildConfig.FLAVOR, e);
            }
        }
        return j;
    }

    public float IlO(String str, float f) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            Cc();
            try {
                return Float.parseFloat(this.lEW.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                oeT.IlO("SdkSettings.Prop", BuildConfig.FLAVOR, e);
            }
        }
        return f;
    }

    public boolean IlO(String str, boolean z) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            Cc();
            try {
                return Boolean.parseBoolean(this.lEW.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                oeT.IlO("SdkSettings.Prop", BuildConfig.FLAVOR, e);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0103 A[Catch: all -> 0x0113, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000b, B:11:0x0016, B:17:0x004d, B:18:0x0052, B:60:0x00ff, B:62:0x0103, B:64:0x0107, B:65:0x010a, B:66:0x0111, B:26:0x0066, B:27:0x0069, B:39:0x0084, B:40:0x0087, B:41:0x008c, B:36:0x007c, B:37:0x007f, B:42:0x008d, B:44:0x0097, B:46:0x00a1, B:48:0x00b6, B:49:0x00c6, B:51:0x00cc, B:53:0x00de, B:56:0x00e6, B:58:0x00f1, B:59:0x00f4, B:24:0x005d, B:34:0x0073), top: B:77:0x0003, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void IlO(boolean r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.rp.IlO(boolean):void");
    }

    private File vCE() {
        return new File(cl.IlO().getFilesDir(), this.Bc);
    }

    public Cc.IlO IlO() {
        return new MY();
    }

    public <T> T IlO(String str, T t, Cc.MY<T> my) throws InterruptedException {
        T t2;
        if (str != null && !str.isEmpty()) {
            if (this.EO.containsKey(str)) {
                try {
                    return (T) this.EO.get(str);
                } catch (Exception e) {
                    oeT.IlO("SdkSettings.Prop", BuildConfig.FLAVOR, e);
                    return t;
                }
            }
            Cc();
            String property = this.lEW.getProperty(str, null);
            if (property != null && my != null && (t2 = (T) my.MY(property)) != null) {
                this.EO.put(str, t2);
                return t2;
            }
        }
        return t;
    }

    public boolean MY() {
        return this.DmF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(Properties properties) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        synchronized (this.Cc) {
            File fileVCE = vCE();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileVCE);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStreamFileOutputStreamCtor, (String) null);
                Object[] objArr = new Object[3];
                fileVCE.getAbsolutePath();
                hp.IlO(fileOutputStreamFileOutputStreamCtor);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                oeT.IlO("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream != null) {
                    hp.IlO(fileOutputStream);
                }
                hp.NST();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                if (fileOutputStream != null) {
                    hp.IlO(fileOutputStream);
                }
                throw th;
            }
        }
        hp.NST();
    }

    public void EO() {
        File fileVCE = vCE();
        if (fileVCE.exists()) {
            fileVCE.delete();
        }
    }

    public class MY implements Cc.IlO {
        private final Map<String, Object> MY = new HashMap();
        private final Object EO = new Object();

        public MY() {
        }

        public void IlO() {
            Object obj;
            Object[] objArr = new Object[2];
            Properties properties = new Properties();
            synchronized (this.EO) {
                properties.putAll(rp.this.lEW);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.MY.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                        properties.put(key, String.valueOf(value));
                        z = true;
                    }
                }
                this.MY.clear();
                if (z) {
                    rp.this.IlO(properties);
                    rp.this.lEW = properties;
                    rp.this.EO.clear();
                }
            }
        }

        public Cc.IlO IlO(String str, String str2) {
            synchronized (this.EO) {
                this.MY.put(str, str2);
            }
            return this;
        }

        public Cc.IlO IlO(String str, int i) {
            synchronized (this.EO) {
                this.MY.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public Cc.IlO IlO(String str, long j) {
            synchronized (this.EO) {
                this.MY.put(str, Long.valueOf(j));
            }
            return this;
        }

        public Cc.IlO IlO(String str) {
            synchronized (this.EO) {
                this.MY.put(str, this);
            }
            return this;
        }

        public Cc.IlO IlO(String str, float f) {
            synchronized (this.EO) {
                this.MY.put(str, Float.valueOf(f));
            }
            return this;
        }

        public Cc.IlO IlO(String str, boolean z) {
            synchronized (this.EO) {
                this.MY.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    protected void tV() {
        IlO ilO = this.NV;
        if (ilO != null) {
            ilO.MY();
        }
    }
}
