package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.EV;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class Bc extends Button {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public Bc(Context context) {
        super(context);
        IlO();
    }

    private void IlO() {
        setId(com.bytedance.sdk.openadsdk.utils.zPa.VH);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, BS.MY(context, 48.0f)));
        setBackground(EV.IlO(context, "tt_browser_download_selector"));
        setText(pP.IlO(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
