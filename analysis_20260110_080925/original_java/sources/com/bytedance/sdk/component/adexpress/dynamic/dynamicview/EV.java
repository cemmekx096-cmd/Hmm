package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.Cc.ea;
import com.bytedance.sdk.component.Cc.zPa;
import com.bytedance.sdk.component.adexpress.IlO.IlO.EO;
import com.bytedance.sdk.component.adexpress.dynamic.tV.lEW;
import com.bytedance.sdk.component.adexpress.tV;
import com.bytedance.sdk.component.adexpress.tV.Bc;
import com.bytedance.sdk.component.adexpress.tV.DmF;
import com.bytedance.sdk.component.adexpress.vCE.NV;
import com.bytedance.sdk.component.adexpress.vCE.hp;
import com.bytedance.sdk.component.adexpress.vCE.tl;
import com.bytedance.sdk.component.utils.pP;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class EV extends vCE {
    private String IlO;

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public EV(Context context, DynamicRootView dynamicRootView, lEW lew) {
        super(context, dynamicRootView, lew);
        if (!TextUtils.isEmpty(this.rp.ts()) && lew.es()) {
            NV nv = new NV(context);
            nv.setAnimationsLoop(this.rp.BO());
            nv.setImageLottieTosPath(this.rp.ts());
            nv.setLottieAppNameMaxLength(this.rp.aa());
            nv.setLottieAdTitleMaxLength(this.rp.gm());
            nv.setLottieAdDescMaxLength(this.rp.dm());
            nv.setData(lew.xF());
            this.ea = nv;
        } else if (this.rp.ea() > 0.0f) {
            this.ea = new tl(context);
            this.ea.setXRound((int) Bc.IlO(context, this.rp.ea()));
            this.ea.setYRound((int) Bc.IlO(context, this.rp.ea()));
        } else if (!lEW() && "arrowButton".equals(lew.NV().MY())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.MY my = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.MY(context);
            my.setBrickNativeValue(this.rp);
            this.ea = my;
        } else if (DmF.MY(this.rp.EV())) {
            this.ea = new hp(context);
        } else {
            this.ea = new ImageView(context);
        }
        this.IlO = getImageKey();
        this.ea.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(lew.NV().MY())) {
            if (this.rp.MY() > 0 || this.rp.IlO() > 0) {
                this.Bc = Math.min(this.Bc, this.lEW);
                this.lEW = Math.min(this.Bc, this.lEW);
                this.DmF = (int) (this.DmF + Bc.IlO(context, this.rp.MY() + (this.rp.IlO() / 2) + 0.5f));
            } else {
                this.Bc = Math.max(this.Bc, this.lEW);
                this.lEW = Math.max(this.Bc, this.lEW);
            }
            this.rp.IlO(this.Bc / 2);
        }
        addView(this.ea, new FrameLayout.LayoutParams(this.Bc, this.lEW));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.ea).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).start();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.ea).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    public boolean DmF() throws NumberFormatException {
        int iZPa;
        super.DmF();
        if (!TextUtils.isEmpty(this.rp.ts())) {
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iEa = 0;
        if ("arrowButton".equals(this.hp.NV().MY())) {
            ((ImageView) this.ea).setImageResource(pP.tV(this.EV, "tt_white_righterbackicon_titlebar"));
            if (Build.VERSION.SDK_INT >= 19 && ((ImageView) this.ea).getDrawable() != null) {
                ((ImageView) this.ea).getDrawable().setAutoMirrored(true);
            }
            this.ea.setPadding(0, 0, 0, 0);
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.ea.setBackgroundColor(this.rp.wPn());
        String strEO = this.hp.NV().EO();
        if ("user".equals(strEO)) {
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.ea).setColorFilter(this.rp.Bc());
            ((ImageView) this.ea).setImageDrawable(pP.EO(getContext(), "tt_user"));
            ((ImageView) this.ea).setPadding(this.Bc / 10, this.lEW / 5, this.Bc / 10, 0);
        } else if (strEO != null && strEO.startsWith("@")) {
            try {
                ((ImageView) this.ea).setImageResource(Integer.parseInt(strEO.substring(1)));
            } catch (Exception unused) {
            }
        }
        ea eaVarCc = com.bytedance.sdk.component.adexpress.IlO.IlO.IlO.IlO().Cc();
        String strEV = this.rp.EV();
        if (!TextUtils.isEmpty(strEV) && !strEV.startsWith("http:") && !strEV.startsWith("https:")) {
            String strKBB = null;
            if (this.bWL != null && this.bWL.getRenderRequest() != null) {
                strKBB = this.bWL.getRenderRequest().kBB();
            }
            strEV = com.bytedance.sdk.component.adexpress.dynamic.Cc.DmF.MY(strEV, strKBB);
        }
        EO EO = com.bytedance.sdk.component.adexpress.IlO.IlO.IlO.IlO().EO();
        if (EO != null) {
            iEa = EO.ea();
            iZPa = EO.zPa();
        } else {
            iZPa = 0;
        }
        com.bytedance.sdk.component.Cc.NV nvCc = eaVarCc.IlO(strEV).IlO(this.IlO).IlO(this.Bc).MY(this.lEW).tV(iEa).Cc(iZPa);
        String strBWL = this.bWL.getRenderRequest().bWL();
        if (!TextUtils.isEmpty(strBWL)) {
            nvCc.MY(strBWL);
        }
        if (IlO() && Build.VERSION.SDK_INT >= 17) {
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.FIT_CENTER);
            nvCc.IlO(Bitmap.Config.ARGB_4444).EO(2).IlO(new IlO(this.EV)).IlO(new MY(this.ea, getResources()));
        } else {
            if (tV.MY()) {
                nvCc.EO(1).IlO((ImageView) this.ea);
            }
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.ea instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    private static class IlO implements com.bytedance.sdk.component.Cc.lEW {
        private final WeakReference<Context> IlO;

        public IlO(Context context) {
            this.IlO = new WeakReference<>(context);
        }

        public Bitmap IlO(Bitmap bitmap) {
            Context context = this.IlO.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.tV.IlO.IlO(context, bitmap, 25);
            }
            return null;
        }
    }

    private static class MY implements zPa {
        private WeakReference<View> IlO;
        private Resources MY;

        public void IlO(int i, String str, Throwable th) {
        }

        public MY(View view, Resources resources) {
            this.IlO = new WeakReference<>(view);
            this.MY = resources;
        }

        public void IlO(com.bytedance.sdk.component.Cc.EV ev) {
            Object objMY;
            View view = this.IlO.get();
            if (view == null || (objMY = ev.MY()) == null || ev.EO() == null) {
                return;
            }
            if (objMY instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.MY, (Bitmap) objMY));
            } else if (objMY instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (objMY instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) objMY).start();
                }
                view.setBackground((Drawable) objMY);
            }
        }
    }

    private boolean IlO() {
        String strRp = this.rp.rp();
        if (this.rp.xF()) {
            return true;
        }
        if (TextUtils.isEmpty(strRp)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strRp);
            return Math.abs((((float) this.Bc) / (((float) this.lEW) * 1.0f)) - (((float) jSONObjectJsonObjectInit.optInt(SettingsJsonConstants.ICON_WIDTH_KEY)) / (((float) jSONObjectJsonObjectInit.optInt(SettingsJsonConstants.ICON_HEIGHT_KEY)) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map mapEV = this.bWL.getRenderRequest().EV();
        if (mapEV == null || mapEV.size() <= 0) {
            return null;
        }
        return (String) mapEV.get(this.rp.EV());
    }
}
