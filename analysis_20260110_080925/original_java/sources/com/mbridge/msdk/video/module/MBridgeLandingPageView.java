package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.URLUtil;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MBridgeLandingPageView extends MBridgeH5EndCardView {

    private static final class b implements com.mbridge.msdk.mbsignalcommon.base.a {
        private b() {
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            s0.a(c.m().d(), str, (BaseTrackingListener) null);
            return true;
        }
    }

    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.mintegral.msdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    protected String getURL() {
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx != null) {
            return com.mbridge.msdk.click.c.a(campaignEx.getClickURL(), "-999", "-999");
        }
        return null;
    }

    public void init(Context context) {
        super.init(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (((MBridgeBaseView) this).e) {
            ((MBridgeH5EndCardView) this).p.setFilter(new b());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    public void webviewshow() {
        try {
            o0.a("MBridgeBaseView", "webviewshow");
            f.a().a(((MBridgeH5EndCardView) this).p, "webviewshow", BuildConfig.FLAVOR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
