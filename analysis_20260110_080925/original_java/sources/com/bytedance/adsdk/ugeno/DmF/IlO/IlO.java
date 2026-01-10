package com.bytedance.adsdk.ugeno.DmF.IlO;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Bc.IlO;
import com.bytedance.adsdk.ugeno.Bc.lEW;
import com.bytedance.adsdk.ugeno.Bc.tV;
import com.bytedance.adsdk.ugeno.Cc;
import com.bytedance.adsdk.ugeno.DmF.vCE.MY;
import com.bytedance.adsdk.ugeno.IlO;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO extends MY {
    private String Aw;
    private String BES;
    private String La;
    private IlO.IlO NST;
    private boolean XvI;
    private int aP;
    private boolean ao;
    private int eDn;
    private String uF;

    public IlO(Context context) {
        super(context);
        this.La = "row";
    }

    public void MY() {
        super.MY();
        tV();
        this.Cc.setGravity(17);
    }

    protected void BS() {
        super.BS();
        if (this.ao) {
            this.Cc.setTextColor(this.aP);
        }
        if (this.XvI) {
            if (this.tf) {
                IlO(this.NST);
            } else {
                tV(this.eDn);
            }
        }
    }

    protected void ssS() {
        super.ssS();
        if (this.ao) {
            this.Cc.setTextColor(this.eeU);
        }
        if (this.XvI) {
            if (this.tf) {
                IlO(this.tN);
            } else {
                tV(this.DM);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void MY(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.La;
        char c = 65535;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c = 2;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 1;
                    break;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c = 0;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.Cc.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (c == 1) {
            this.Cc.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (c == 2) {
            this.Cc.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        } else {
            this.Cc.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private void tV() {
        if (TextUtils.isEmpty(this.BES)) {
            return;
        }
        this.Cc.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (this.BES.startsWith("local://")) {
            try {
                MY(lEW.IlO(this.MY, tV.IlO(this.MY, this.BES.replace("local://", BuildConfig.FLAVOR))));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        Cc.IlO().MY().IlO(this.DmF, this.BES, new IlO.IlO() { // from class: com.bytedance.adsdk.ugeno.DmF.IlO.IlO.1
            public void IlO(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                lEW.IlO(new Runnable() { // from class: com.bytedance.adsdk.ugeno.DmF.IlO.IlO.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IlO.this.MY(new BitmapDrawable(IlO.this.MY.getResources(), bitmap));
                    }
                });
            }
        });
    }

    public void IlO(String str, String str2) {
        super.IlO(str, str2);
        str.hashCode();
        switch (str) {
            case "direction":
                this.La = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.aP = com.bytedance.adsdk.ugeno.Bc.IlO.IlO(str2);
                this.ao = true;
                break;
            case "image":
                this.BES = str2;
                break;
            case "highlightImage":
                this.Aw = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.Bc.IlO.EO(str2)) {
                    this.tf = true;
                    this.NST = com.bytedance.adsdk.ugeno.Bc.IlO.MY(str2);
                } else {
                    this.eDn = com.bytedance.adsdk.ugeno.Bc.IlO.IlO(str2);
                    this.tf = false;
                }
                this.XvI = true;
                break;
            case "highlightBackgroundImage":
                this.uF = str2;
                break;
        }
    }
}
