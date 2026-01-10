package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.openadsdk.core.Cc.tV;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class vCE extends tV {
    private float IlO;
    private int MY;

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

    public vCE(Context context) {
        super(context);
        this.IlO = 2.25f;
        this.MY = 12;
        IlO();
    }

    public vCE(Context context, int i, float f) {
        super(context);
        this.IlO = f;
        this.MY = i;
        IlO();
    }

    private void IlO() {
        setBackground(tV.IlO());
        setImageResource(pP.tV(getContext(), "tt_close_btn"));
        int iMY = BS.MY(getContext(), this.IlO);
        setPadding(iMY, iMY, iMY, iMY);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iMY = BS.MY(getContext(), this.MY);
            layoutParams.width = iMY;
            layoutParams.height = iMY;
        }
        super.setLayoutParams(layoutParams);
    }

    public static tV IlO(Context context) {
        return new vCE(context);
    }

    public static tV MY(Context context) {
        return new vCE(context, 28, 5.0f);
    }
}
