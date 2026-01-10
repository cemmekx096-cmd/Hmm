package com.bytedance.sdk.component.Cc.tV.MY;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.Cc.MY;
import com.bytedance.sdk.component.Cc.tV.EO.EO;
import com.bytedance.sdk.component.Cc.tV.EO.IlO;
import com.bytedance.sdk.component.Cc.tV.EO.MY.IlO;
import com.bytedance.sdk.component.Cc.xF;
import com.bytedance.sdk.component.utils.EV;
import com.bytedance.sdk.component.utils.vCE;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class tV<T> implements vCE {
    public String IlO() {
        return "decode";
    }

    public boolean IlO(EO eo, xF xFVar, IlO ilO) {
        byte[] bArrBWL = eo.bWL();
        if (bArrBWL == null) {
            ilO.IlO(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iRp = eo.rp();
        eo.IlO(bArrBWL.length);
        if (iRp == 2) {
            boolean z = (vCE.MY(bArrBWL) || EV.IlO(bArrBWL, 0)) ? false : true;
            if (vCE.IlO(bArrBWL)) {
                IlO(eo, bArrBWL, z, ilO);
            } else {
                ilO.IlO(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iRp == 3) {
            ilO.IlO(new com.bytedance.sdk.component.Cc.tV.EO.tV().IlO(eo, bArrBWL, (Map) null, vCE.MY(bArrBWL)));
        } else if (vCE.MY(bArrBWL)) {
            MY(eo, bArrBWL, ilO);
        } else if (EV.IlO(bArrBWL, 0)) {
            IlO(eo, bArrBWL, ilO);
        } else if (vCE.IlO(bArrBWL)) {
            IlO(eo, bArrBWL, true, ilO);
        } else {
            ilO.IlO(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void IlO(final EO eo, final byte[] bArr, final IlO ilO) {
        try {
            new com.bytedance.sdk.component.Cc.tV.EO.MY.IlO().IlO(bArr, new IlO.IlO() { // from class: com.bytedance.sdk.component.Cc.tV.MY.tV.1
                public void IlO(Drawable drawable) {
                    ilO.IlO(new com.bytedance.sdk.component.Cc.tV.EO.tV().IlO(eo, drawable, (Map) null, false));
                }

                public void IlO() {
                    ilO.IlO(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                public void IlO(byte[] bArr2) {
                    if (vCE.IlO(bArr)) {
                        tV.this.IlO(eo, bArr, true, ilO);
                    } else {
                        ilO.IlO(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            ilO.IlO(2000, "decode webp animation error", th);
        }
    }

    private void MY(final EO eo, final byte[] bArr, final com.bytedance.sdk.component.Cc.tV.EO.IlO ilO) {
        try {
            new com.bytedance.sdk.component.Cc.tV.EO.MY.IlO().IlO(bArr, eo.cl(), new IlO.IlO() { // from class: com.bytedance.sdk.component.Cc.tV.MY.tV.2
                public void IlO(Drawable drawable) {
                    ilO.IlO(new com.bytedance.sdk.component.Cc.tV.EO.tV().IlO(eo, drawable, (Map) null, true));
                }

                public void IlO() {
                    ilO.IlO(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                public void IlO(byte[] bArr2) {
                    if (vCE.IlO(bArr)) {
                        tV.this.IlO(eo, bArr, true, ilO);
                    } else {
                        ilO.IlO(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            ilO.IlO(2000, "decode gif error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(EO eo, byte[] bArr, boolean z, com.bytedance.sdk.component.Cc.tV.EO.IlO ilO) {
        try {
            com.bytedance.sdk.component.Cc.tV.EO.vCE vceCl = eo.cl();
            Bitmap bitmapIlO = vceCl.IlO(eo).IlO(bArr);
            if (bitmapIlO != null) {
                new StringBuilder("step 5 decode success  image key is ").append(eo.NV()).append(" url is ").append(eo.IlO()).append(" bitmap is width = ").append(bitmapIlO.getWidth()).append(" height ").append(bitmapIlO.getHeight()).append(" size = ").append((bitmapIlO.getByteCount() * 1.0f) / 1024.0f);
                ilO.IlO(new com.bytedance.sdk.component.Cc.tV.EO.tV().IlO(eo, bitmapIlO, (Map) null, false));
                if (z) {
                    IlO(eo.cL(), vceCl, eo.NV(), bitmapIlO);
                    return;
                }
                return;
            }
            new StringBuilder("step 5 decode fail bitmap is null image key is ").append(eo.NV()).append(" url is ").append(eo.IlO());
            ilO.IlO(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            new StringBuilder("step 5 decode exception bitmap is null image key is ").append(eo.NV()).append(" url is ").append(eo.IlO());
            ilO.IlO(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    private void IlO(MY my, com.bytedance.sdk.component.Cc.tV.EO.vCE vce, String str, Bitmap bitmap) {
        if (my == null || vce == null || !my.Cc()) {
            return;
        }
        vce.IlO(my).IlO(str, bitmap);
    }
}
