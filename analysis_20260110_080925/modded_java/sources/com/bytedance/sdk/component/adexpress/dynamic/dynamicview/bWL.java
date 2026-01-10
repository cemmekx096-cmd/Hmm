package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.sdk.component.Cc.NV;
import com.bytedance.sdk.component.adexpress.IlO.IlO.IlO;
import com.bytedance.sdk.component.adexpress.dynamic.tV.lEW;
import com.bytedance.sdk.component.adexpress.tV;
import com.bytedance.sdk.component.utils.pP;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class bWL extends vCE {
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

    public bWL(Context context, DynamicRootView dynamicRootView, lEW lew) {
        super(context, dynamicRootView, lew);
        this.ea = new ImageView(context);
        this.ea.setTag(Integer.valueOf(getClickArea()));
        if (tV.MY()) {
            this.lEW = Math.max(dynamicRootView.getLogoUnionHeight(), this.lEW);
        }
        addView(this.ea, getWidgetLayoutParams());
    }

    public boolean DmF() {
        super.DmF();
        if (tV.MY()) {
            ((ImageView) this.ea).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        if (this.bWL != null && this.bWL.getRenderRequest() != null && !TextUtils.isEmpty(this.bWL.getRenderRequest().tl())) {
            String strTl = this.bWL.getRenderRequest().tl();
            if (strTl.equals("logo")) {
                ((ImageView) this.ea).setImageResource(pP.tV(getContext(), "tt_ad_logo"));
            } else {
                NV nvCc = IlO.IlO().Cc().IlO(strTl).IlO(this.Bc).MY(this.lEW).tV(this.Bc).Cc(this.lEW);
                String strBWL = this.bWL.getRenderRequest().bWL();
                if (!TextUtils.isEmpty(strBWL)) {
                    nvCc.MY(strBWL);
                }
                nvCc.IlO((ImageView) this.ea);
            }
        } else {
            setVisibility(8);
        }
        ((ImageView) this.ea).setColorFilter(this.rp.Bc(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
