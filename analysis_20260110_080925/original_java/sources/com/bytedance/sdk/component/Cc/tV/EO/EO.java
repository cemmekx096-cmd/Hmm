package com.bytedance.sdk.component.Cc.tV.EO;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.Cc.Bc;
import com.bytedance.sdk.component.Cc.DmF;
import com.bytedance.sdk.component.Cc.EV;
import com.bytedance.sdk.component.Cc.NV;
import com.bytedance.sdk.component.Cc.bWL;
import com.bytedance.sdk.component.Cc.lEW;
import com.bytedance.sdk.component.Cc.oeT;
import com.bytedance.sdk.component.Cc.tV.MY.Cc;
import com.bytedance.sdk.component.Cc.tV.MY.tV;
import com.bytedance.sdk.component.Cc.tV.MY.vCE;
import com.bytedance.sdk.component.Cc.xF;
import com.bytedance.sdk.component.Cc.zPa;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class EO implements DmF {
    private int AXM;
    private Bitmap.Config Bc;
    private zPa Cc;
    private int DmF;
    private String EO;
    private int EV;
    Future<?> IlO;
    private String MY;
    private lEW NV;
    private boolean OOq;
    private boolean bWL;
    private final Handler cL;
    private int cl;
    private boolean ea;
    private boolean es;
    private volatile boolean hp;
    private int kBB;
    private int lEW;
    private byte[] oc;
    private vCE oeT;
    private int pP;
    private WeakReference<ImageView> rp;
    private String tV;
    private ExecutorService tl;
    private com.bytedance.sdk.component.Cc.MY vAh;
    private ImageView.ScaleType vCE;
    private bWL wPn;
    private Bc xF;
    private xF zPa;

    private EO(MY my) {
        this.cL = new Handler(Looper.getMainLooper());
        this.es = true;
        this.oc = null;
        this.MY = my.tV;
        this.Cc = new IlO(my.IlO);
        this.rp = new WeakReference<>(my.MY);
        this.vCE = my.Cc;
        this.Bc = my.vCE;
        this.lEW = my.Bc;
        this.DmF = my.lEW;
        this.EV = my.DmF;
        this.cl = my.NV;
        this.zPa = my.EV;
        this.vAh = IlO(my);
        if (!TextUtils.isEmpty(my.EO)) {
            MY(my.EO);
            IlO(my.EO);
        }
        this.bWL = my.rp;
        this.ea = my.hp;
        this.oeT = my.zPa;
        this.NV = my.cl;
        this.pP = my.es;
        this.kBB = my.cL;
        this.tl = my.xF;
        this.OOq = my.AXM;
        this.wPn = my.oeT;
    }

    private com.bytedance.sdk.component.Cc.MY IlO(MY my) {
        if (my.ea != null) {
            return my.ea;
        }
        if (!TextUtils.isEmpty(my.bWL)) {
            return com.bytedance.sdk.component.Cc.tV.EO.IlO.MY.IlO(new File(my.bWL));
        }
        return com.bytedance.sdk.component.Cc.tV.EO.IlO.MY.NV();
    }

    public int vCE() {
        return this.kBB;
    }

    public int Bc() {
        return this.pP;
    }

    public String IlO() {
        return this.MY;
    }

    public zPa lEW() {
        return this.Cc;
    }

    public String DmF() {
        return this.tV;
    }

    public void IlO(String str) {
        this.tV = str;
    }

    public String NV() {
        return this.EO;
    }

    public Bitmap.Config Cc() {
        return this.Bc;
    }

    public void MY(String str) {
        WeakReference<ImageView> weakReference = this.rp;
        if (weakReference != null && weakReference.get() != null) {
            this.rp.get().setTag(1094453505, str);
        }
        this.EO = str;
    }

    public ImageView.ScaleType tV() {
        return this.vCE;
    }

    public Bitmap.Config EV() {
        return this.Bc;
    }

    public int MY() {
        return this.lEW;
    }

    public int EO() {
        return this.DmF;
    }

    public int rp() {
        return this.EV;
    }

    public void IlO(boolean z) {
        this.es = z;
    }

    public boolean hp() {
        return this.es;
    }

    public void IlO(byte[] bArr) {
        this.oc = bArr;
    }

    public byte[] bWL() {
        return this.oc;
    }

    public Bc ea() {
        return this.xF;
    }

    public int zPa() {
        return this.AXM;
    }

    public void IlO(int i) {
        this.AXM = i;
    }

    public vCE cl() {
        return this.oeT;
    }

    public com.bytedance.sdk.component.Cc.MY cL() {
        return this.vAh;
    }

    public bWL es() {
        return this.wPn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DmF AXM() {
        try {
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        if (this.oeT == null) {
            zPa zpa = this.Cc;
            if (zpa != null) {
                zpa.IlO(1005, "not init !", (Throwable) null);
            }
            return this;
        }
        String strIlO = IlO();
        if (TextUtils.isEmpty(strIlO)) {
            this.Cc.IlO(2000, "url is empty", (Throwable) null);
            return this;
        }
        oeT oetVCE = this.oeT.vCE();
        if (!strIlO.startsWith("http://") && !strIlO.startsWith("https://") && oetVCE != null) {
            oetVCE.IlO(1006, "url is not validate ".concat(String.valueOf(strIlO)));
        }
        ExecutorService executorServiceCc = this.tl == null ? this.oeT.Cc() : null;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.Cc.tV.EO.EO.1
            @Override // java.lang.Runnable
            public void run() {
                EO eo = EO.this;
                com.bytedance.sdk.component.Cc.tV.EO.IlO ilO = new com.bytedance.sdk.component.Cc.tV.EO.IlO(eo, eo.zPa);
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.bytedance.sdk.component.Cc.tV.MY.MY());
                    arrayList.add(new Cc());
                    arrayList.add(new com.bytedance.sdk.component.Cc.tV.MY.IlO());
                    arrayList.add(new com.bytedance.sdk.component.Cc.tV.MY.EO());
                    arrayList.add(new tV());
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (EO.this.hp) {
                            ilO.IlO(1003, "canceled", (Throwable) null);
                            return;
                        }
                        vCE vce = (vCE) arrayList.get(i);
                        if (EO.this.zPa != null && vce != null && !"data_intercept".equals(vce.IlO())) {
                            EO.this.zPa.IlO(vce.IlO(), EO.this);
                        }
                        EO eo2 = EO.this;
                        boolean zIlO = vce.IlO(eo2, eo2.zPa, ilO);
                        if (EO.this.zPa != null && !"data_intercept".equals(vce.IlO())) {
                            EO.this.zPa.MY(vce.IlO(), EO.this);
                        }
                        if (!zIlO) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    ilO.IlO(2000, th.getMessage(), th);
                }
            }
        };
        if (this.OOq) {
            runnable.run();
        } else {
            ExecutorService executorService = this.tl;
            if (executorService != null) {
                this.IlO = executorService.submit(runnable);
            } else if (executorServiceCc != null) {
                this.IlO = executorServiceCc.submit(runnable);
            }
        }
        return this;
    }

    public String xF() {
        return NV() + rp();
    }

    public static class MY implements NV {
        private boolean AXM;
        private int Bc;
        private ImageView.ScaleType Cc;
        private String EO;
        private xF EV;
        private zPa IlO;
        private ImageView MY;
        private String bWL;
        private int cL;
        private lEW cl;
        private com.bytedance.sdk.component.Cc.MY ea;
        private int es;
        private boolean hp;
        private int lEW;
        private bWL oeT;
        private boolean rp;
        private String tV;
        private Bitmap.Config vCE;
        private ExecutorService xF;
        private vCE zPa;
        private int DmF = 1;
        private int NV = 5;

        public MY(vCE vce) {
            this.zPa = vce;
        }

        public NV EO(String str) {
            this.tV = str;
            return this;
        }

        public NV IlO(String str) {
            this.EO = str;
            return this;
        }

        public NV IlO(ImageView.ScaleType scaleType) {
            this.Cc = scaleType;
            return this;
        }

        public NV IlO(Bitmap.Config config) {
            this.vCE = config;
            return this;
        }

        public NV IlO(int i) {
            this.Bc = i;
            return this;
        }

        public NV MY(int i) {
            this.lEW = i;
            return this;
        }

        public NV EO(int i) {
            this.DmF = i;
            return this;
        }

        public NV IlO(xF xFVar) {
            this.EV = xFVar;
            return this;
        }

        public NV IlO(boolean z) {
            this.hp = z;
            return this;
        }

        public NV MY(String str) {
            this.bWL = str;
            return this;
        }

        public DmF IlO(zPa zpa, int i) {
            this.NV = i;
            return IlO(zpa);
        }

        public DmF IlO(zPa zpa) {
            this.IlO = zpa;
            return new EO(this).AXM();
        }

        public DmF IlO(ImageView imageView) {
            this.MY = imageView;
            return new EO(this).AXM();
        }

        public NV IlO(lEW lew) {
            this.cl = lew;
            return this;
        }

        public NV tV(int i) {
            this.cL = i;
            return this;
        }

        public NV Cc(int i) {
            this.es = i;
            return this;
        }
    }

    private class IlO implements zPa {
        private zPa MY;

        public IlO(zPa zpa) {
            this.MY = zpa;
        }

        public void IlO(final EV ev) {
            final ImageView imageView = (ImageView) EO.this.rp.get();
            if (imageView != null && EO.this.EV != 3 && IlO(imageView)) {
                Object objMY = ev.MY();
                if (objMY instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) ev.MY();
                    EO.this.cL.post(new Runnable() { // from class: com.bytedance.sdk.component.Cc.tV.EO.EO.IlO.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objMY instanceof Drawable) {
                    final Drawable drawable = (Drawable) ev.MY();
                    EO.this.cL.post(new Runnable() { // from class: com.bytedance.sdk.component.Cc.tV.EO.EO.IlO.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (drawable2 instanceof AnimatedImageDrawable) {
                                    ((AnimatedImageDrawable) drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (EO.this.NV != null && (ev.MY() instanceof Bitmap)) {
                    lEW lew = EO.this.NV;
                    Bitmap bitmap2 = (Bitmap) ev.MY();
                    Bitmap bitmapIlO = lew.IlO(bitmap2);
                    if (bitmapIlO != null) {
                        ev.IlO(bitmapIlO);
                    }
                }
            } catch (Throwable unused) {
            }
            if (EO.this.cl == 5) {
                EO.this.cL.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.Cc.tV.EO.EO.IlO.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (IlO.this.MY != null) {
                            IlO.this.MY.IlO(ev);
                        }
                    }
                });
                return;
            }
            zPa zpa = this.MY;
            if (zpa != null) {
                zpa.IlO(ev);
            }
        }

        private boolean IlO(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(EO.this.EO)) ? false : true;
        }

        public void IlO(final int i, final String str, final Throwable th) {
            if (EO.this.cl == 5) {
                EO.this.cL.post(new Runnable() { // from class: com.bytedance.sdk.component.Cc.tV.EO.EO.IlO.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (IlO.this.MY != null) {
                            IlO.this.MY.IlO(i, str, th);
                        }
                    }
                });
                return;
            }
            zPa zpa = this.MY;
            if (zpa != null) {
                zpa.IlO(i, str, th);
            }
        }
    }
}
