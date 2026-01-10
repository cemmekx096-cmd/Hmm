package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import android.view.MotionEvent;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new a();

    public boolean canBackPress() {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.mintegral.msdk", me);
        return super.dispatchTouchEvent(me);
    }

    public b getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    public i getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    public c getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }

    public d getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    public f getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    public g getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    public j getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (getJSCommon().a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().e();
                return;
            }
            return;
        }
        if (canBackPress()) {
            super/*android.app.Activity*/.onBackPressed();
        } else {
            o0.a(TAG, "onBackPressed can't excute");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.app.Activity*/.onConfigurationChanged(configuration);
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        super/*android.app.Activity*/.onPause();
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }
}
