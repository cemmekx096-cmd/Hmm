package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.b0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.impl.i;
import com.mbridge.msdk.video.module.listener.impl.k;
import com.mbridge.msdk.video.module.listener.impl.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.h;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private com.mbridge.msdk.video.signal.factory.b Q;
    private boolean R;
    private boolean S;
    private List<CampaignEx> T;
    private MBridgePlayableView m;
    private MBridgeClickCTAView n;
    private MBridgeClickMiniCardView o;
    private MBridgeNativeEndCardView p;
    private MBridgeH5EndCardView q;
    private MBridgeVastEndCardView r;
    private MBridgeLandingPageView s;
    private MBridgeVideoEndCoverView t;
    private MBridgeAlertWebview u;
    private MBridgeOrderCampView v;
    private String w;
    private int x;
    private int y;
    private int z;

    class a implements Runnable {
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b a;

        a(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.a, Integer.valueOf(((MBridgeBaseView) mBridgeContainerView).b.getVideo_end_type()));
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b a;

        b(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.a, Integer.valueOf(((MBridgeBaseView) mBridgeContainerView).b.getVideo_end_type()));
        }
    }

    class c implements com.mbridge.msdk.video.dynview.listener.b {
        c() {
        }

        public void a() {
            com.mbridge.msdk.video.module.listener.a aVar = ((MBridgeBaseView) MBridgeContainerView.this).notifyListener;
            if (aVar != null) {
                aVar.a(R.styleable.AppCompatTheme_windowActionBar, BuildConfig.FLAVOR);
            }
        }

        public void b() {
            if (((MBridgeBaseView) MBridgeContainerView.this).b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(((MBridgeBaseView) mBridgeContainerView).b.getVideo_end_type());
            }
        }
    }

    class d extends i {
        d(com.mbridge.msdk.video.module.listener.a aVar) {
            super(aVar);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.mbridge.msdk.video.module.MBridgeContainerView] */
        public void a(int i, Object obj) {
            super.a(i, obj);
            if (i == 100) {
                MBridgeContainerView.this.webviewshow();
                ?? r2 = MBridgeContainerView.this;
                r2.onConfigurationChanged(r2.getResources().getConfiguration());
                m mVar = new m();
                mVar.n(((MBridgeBaseView) MBridgeContainerView.this).b.getRequestId());
                mVar.o(((MBridgeBaseView) MBridgeContainerView.this).b.getRequestIdNotice());
                mVar.b(((MBridgeBaseView) MBridgeContainerView.this).b.getId());
                mVar.b(((MBridgeBaseView) MBridgeContainerView.this).b.isMraid() ? m.N : m.O);
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                g.d(mVar, ((MBridgeBaseView) mBridgeContainerView).a, mBridgeContainerView.w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.y = 1;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void addCTAView() {
        if (this.n == null) {
            b(-1);
        }
        if (this.n != null) {
            CampaignEx campaignEx = ((MBridgeBaseView) this).b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.n, 0, layoutParams);
            }
        }
    }

    private void b(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        if (this.t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(((MBridgeBaseView) this).a);
            this.t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(((MBridgeBaseView) this).b);
            this.t.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
            this.t.preLoadData(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        if (this.u == null) {
            q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.u);
        }
        addView(this.u);
    }

    private void f() {
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zL = t0.l(((MBridgeBaseView) this).b.getendcard_url());
            if (zIsDynamicView && !zL && !((MBridgeBaseView) this).b.isMraid()) {
                j();
                return;
            }
        }
        if (this.y != 2 || this.I) {
            j();
        } else {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g() {
        if (this.q == null) {
            a(this.Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.q.setError(true);
            }
        } else {
            this.I = true;
            addView(this.q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.q.excuteTask();
            this.q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            m mVar = new m();
            mVar.n(((MBridgeBaseView) this).b.getRequestId());
            mVar.o(((MBridgeBaseView) this).b.getRequestIdNotice());
            mVar.b(((MBridgeBaseView) this).b.getId());
            mVar.b(((MBridgeBaseView) this).b.isMraid() ? m.N : m.O);
            g.d(mVar, ((MBridgeBaseView) this).a, this.w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.w);
        }
    }

    private void h() {
        if (this.s == null) {
            a(this.Q, (Integer) 4);
        }
        this.s.setUnitId(this.w);
        this.s.preLoadData(this.Q);
        addView(this.s);
    }

    private void i() {
        if (this.o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.o, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j() {
        this.y = 1;
        if (this.p == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.p);
        onConfigurationChanged(getResources().getConfiguration());
        this.p.notifyShowListener();
        this.S = true;
        bringToFront();
    }

    private void k() {
        if (this.m == null) {
            preLoadData(this.Q);
        }
        addView(this.m);
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.w);
            CampaignEx campaignEx = ((MBridgeBaseView) this).b;
            if (campaignEx != null && campaignEx.isMraid() && ((MBridgeBaseView) this).b.getPlayable_ads_without_video() == 2) {
                this.m.setCloseVisible(0);
            }
            this.m.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.r == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.r, layoutParams);
        this.r.notifyShowListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m() {
        if (this.t == null) {
            b(this.Q);
        }
        addView(this.t);
        onConfigurationChanged(getResources().getConfiguration());
        this.S = true;
        bringToFront();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o() {
        this.C = false;
        this.S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof MBridgeContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void p() {
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(z0.a(str, "ecid"));
            } catch (Throwable th) {
                o0.b("MBridgeBaseView", th.getMessage());
            }
        }
        this.p = new MBridgeNativeEndCardView(((MBridgeBaseView) this).a, (AttributeSet) null, true, i, ((MBridgeBaseView) this).b.getAdSpaceT() == 2, ((MBridgeBaseView) this).k, ((MBridgeBaseView) this).b.getMof_tplid());
        if (((MBridgeBaseView) this).b.getDynamicTempCode() != 5) {
            this.p.setCampaign(((MBridgeBaseView) this).b);
            return;
        }
        k kVar = ((MBridgeBaseView) this).notifyListener;
        if (kVar != null && (kVar instanceof k)) {
            kVar.a(((MBridgeBaseView) this).b);
        }
        this.p.setCampaign(((MBridgeBaseView) this).b);
    }

    private void q() {
        if (this.u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(((MBridgeBaseView) this).a);
            this.u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.w);
            this.u.setCampaign(((MBridgeBaseView) this).b);
        }
        this.u.preLoadData(this.Q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.T = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view) {
        if (view == null) {
            o0.b("MBridgeBaseView", "view is null");
        } else {
            a(view);
            super/*android.widget.RelativeLayout*/.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.o.resizeMiniCard(i, i2);
    }

    public void defaultShow() {
        super.defaultShow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.mintegral.msdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        return mBridgeH5EndCardView == null ? this.m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!((MBridgeBaseView) this).b.isDynamicView() || !TextUtils.isEmpty(((MBridgeBaseView) this).b.getendcard_url())) {
            return null;
        }
        int size = this.T.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.T.get(i2) != null && this.T.get(i2).getId() == ((MBridgeBaseView) this).b.getId()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.T.get(i) == null) {
            return null;
        }
        return this.T.get(i);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.w;
    }

    public int getVideoInteractiveType() {
        return this.x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView == null) {
            f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.I) {
            f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.R && !this.S) {
            o();
            this.R = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.u;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.u);
        MBridgeClickCTAView mBridgeClickCTAView = this.n;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        ((MBridgeBaseView) this).notifyListener.a(105, campaignEx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        ((MBridgeBaseView) this).notifyListener.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    public void onEndcardBackPress() {
        if (this.p != null || this.r != null) {
            ((MBridgeBaseView) this).notifyListener.a(104, BuildConfig.FLAVOR);
            try {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            } catch (Exception e) {
                o0.b("MBridgeBaseView", e.getMessage());
                return;
            }
        }
        if (this.s != null) {
            ((MBridgeBaseView) this).notifyListener.a(103, BuildConfig.FLAVOR);
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            ((MBridgeBaseView) this).notifyListener.a(107, BuildConfig.FLAVOR);
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        a(this.m, this.o, this.q, this.u);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                a(bVar);
            } else {
                b(this.x);
                if (((MBridgeBaseView) this).b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(((MBridgeBaseView) this).b.getVideo_end_type()));
                    } catch (Throwable th) {
                        o0.b("MBridgeBaseView", th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    if (!t0.l(((MBridgeBaseView) this).b.getendcard_url())) {
                        try {
                            String strA = z0.a(((MBridgeBaseView) this).b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(((MBridgeBaseView) this).b, 2);
                            }
                        } catch (Exception e) {
                            o0.b("MBridgeBaseView", e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.p.release();
        }
        if (((MBridgeBaseView) this).notifyListener != null) {
            ((MBridgeBaseView) this).notifyListener = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.o.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
        }
    }

    public void setCloseDelayTime(int i) {
        this.z = i;
    }

    public void setEndscreenType(int i) {
        this.y = i;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        o0.b("MBridgeBaseView", "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.O = i;
        this.K = i2;
        this.L = i3;
        this.M = i4;
        this.N = i5;
        this.P = b0.a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.p != null) {
            mBridgeH5EndCardView.setNotchValue(this.P, i2, i3, i4, i5);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.q.p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null && ((MBridgeH5EndCardView) mBridgePlayableView).p != null) {
            mBridgePlayableView.setNotchValue(this.P, i2, i3, i4, i5);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(((MBridgeH5EndCardView) this.m).p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    public void setNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.A = i;
    }

    public void setRewardStatus(boolean z) {
        this.J = z;
    }

    public void setShowingTransparent(boolean z) {
        this.D = z;
    }

    public void setUnitID(String str) {
        this.w = str;
    }

    public void setVideoInteractiveType(int i) {
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.x = i;
            return;
        }
        int iB = com.mbridge.msdk.video.dynview.util.a.b(((MBridgeBaseView) this).b);
        if (iB == 100) {
            this.x = i;
        } else {
            this.x = iB;
        }
    }

    public void setVideoSkipTime(int i) {
        this.H = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.S) {
            removeAllViews();
            bringToFront();
            this.R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        e();
        setBackgroundColor(0);
        this.u.webviewshow();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i) {
        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
        if (campaignEx != null) {
            if (i == 1) {
                ((MBridgeBaseView) this).notifyListener.a(104, BuildConfig.FLAVOR);
            } else if (i == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.G = true;
                }
                a((View) this.m);
                setMatchParent();
                j();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.S = true;
                bringToFront();
            } else if (i == 4) {
                ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_toolbarStyle, BuildConfig.FLAVOR);
                removeAllViews();
                setMatchParent();
                h();
                this.S = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.S = true;
                bringToFront();
                f();
                ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_windowActionBar, BuildConfig.FLAVOR);
            } else {
                ((MBridgeBaseView) this).notifyListener.a(106, BuildConfig.FLAVOR);
            }
        }
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.o.setRadius(i5);
            this.o.setCloseVisible(8);
            this.o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
            if (this.F) {
                return;
            }
            this.F = true;
            ((MBridgeBaseView) this).notifyListener.a(109, BuildConfig.FLAVOR);
            ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_windowActionBar, BuildConfig.FLAVOR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(((MBridgeBaseView) this).a);
        this.v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.T);
        k kVar = ((MBridgeBaseView) this).notifyListener;
        if (kVar != null && (kVar instanceof k)) {
            kVar.a(this.T);
        }
        this.v.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
        this.v.setRewarded(this.J);
        this.v.setNotchPadding(this.K, this.L, this.M, this.N);
        this.v.setCampOrderViewBuildCallback(new c());
        this.v.createView(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showPlayableView() {
        if (((MBridgeBaseView) this).b == null || this.G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.S = true;
        bringToFront();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i) {
        if (((MBridgeBaseView) this).b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i == 1) {
                if (this.B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = ((MBridgeBaseView) this).b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.S = true;
                            addCTAView();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = ((MBridgeBaseView) this).b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.q);
                }
                ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, BuildConfig.FLAVOR);
                CampaignEx campaignEx3 = ((MBridgeBaseView) this).b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    ((MBridgeBaseView) this).b.setHasReportAdTrackPause(true);
                    com.mbridge.msdk.video.module.report.b.c(((MBridgeBaseView) this).a, ((MBridgeBaseView) this).b);
                }
                if (this.D) {
                    ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_tooltipFrameBackground, BuildConfig.FLAVOR);
                } else {
                    this.S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.C = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", ((MBridgeBaseView) this).b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (((MBridgeBaseView) this).b != null) {
            ((MBridgeBaseView) this).notifyListener.a(R.styleable.AppCompatTheme_windowFixedWidthMajor, BuildConfig.FLAVOR);
            ((MBridgeBaseView) this).notifyListener.a(104, BuildConfig.FLAVOR);
        }
    }

    public void webviewshow() {
        try {
            e eVar = new e();
            eVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", ((MBridgeBaseView) this).b, eVar);
        } catch (Exception unused) {
        }
        b(this.m, this.o, this.q, this.u);
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                o0.b("MBridgeBaseView", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super/*android.widget.RelativeLayout*/.addView(view, layoutParams);
        } else {
            o0.b("MBridgeBaseView", "view is null");
        }
    }

    private void b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.n == null) {
                    this.n = new MBridgeClickCTAView(((MBridgeBaseView) this).a);
                }
                this.n.setCampaign(((MBridgeBaseView) this).b);
                this.n.setUnitId(this.w);
                this.n.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
                this.n.preLoadData(this.Q);
                return;
            }
            CampaignEx campaignEx = ((MBridgeBaseView) this).b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.o == null) {
                this.o = new MBridgeClickMiniCardView(((MBridgeBaseView) this).a);
            }
            this.o.setCampaign(((MBridgeBaseView) this).b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(mBridgeClickMiniCardView, ((MBridgeBaseView) this).notifyListener));
            this.o.preLoadData(this.Q);
            setMatchParent();
            i();
            o();
        }
    }

    private void a(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (this.m == null) {
            this.m = new MBridgePlayableView(((MBridgeBaseView) this).a);
        }
        this.m.setCloseDelayShowTime(this.z);
        this.m.setPlayCloseBtnTm(this.A);
        this.m.setCampaign(((MBridgeBaseView) this).b);
        this.m.setNotifyListener(new d(((MBridgeBaseView) this).notifyListener));
        this.m.preLoadData(bVar);
    }

    private void b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.signal.factory.b bVar, Integer num) {
        CampaignEx campaignEx;
        k kVar;
        CampaignEx campaignEx2;
        this.Q = bVar;
        CampaignEx campaignEx3 = ((MBridgeBaseView) this).b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.r == null) {
                        this.r = new MBridgeVastEndCardView(((MBridgeBaseView) this).a);
                    }
                    this.r.setCampaign(((MBridgeBaseView) this).b);
                    this.r.setNotifyListener(new l(((MBridgeBaseView) this).notifyListener));
                    this.r.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.s == null) {
                        this.s = new MBridgeLandingPageView(((MBridgeBaseView) this).a);
                    }
                    this.s.setCampaign(((MBridgeBaseView) this).b);
                    this.s.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.y == 2) {
                        boolean zIsDynamicView = ((MBridgeBaseView) this).b.isDynamicView();
                        boolean zL = t0.l(((MBridgeBaseView) this).b.getendcard_url());
                        if ((zIsDynamicView && !zL && (campaignEx2 = ((MBridgeBaseView) this).b) != null && !campaignEx2.isMraid()) || (campaignEx = ((MBridgeBaseView) this).b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.q == null) {
                            this.q = new MBridgeH5EndCardView(((MBridgeBaseView) this).a);
                            try {
                                e eVar = new e();
                                eVar.a("type", 3);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", ((MBridgeBaseView) this).b, eVar);
                            } catch (Throwable th) {
                                o0.b("MBridgeBaseView", th.getMessage());
                            }
                        }
                        if (((MBridgeBaseView) this).b.getDynamicTempCode() == 5 && (kVar = ((MBridgeBaseView) this).notifyListener) != null && (kVar instanceof k)) {
                            kVar.a(((MBridgeBaseView) this).b);
                        }
                        this.q.setCampaign(((MBridgeBaseView) this).b);
                        this.q.setCloseDelayShowTime(this.z);
                        this.q.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
                        this.q.setUnitId(this.w);
                        this.q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                        this.q.preLoadData(bVar);
                        if (this.D) {
                            return;
                        }
                        addView(this.q);
                        return;
                    }
                    CampaignEx campaignEx4 = ((MBridgeBaseView) this).b;
                    int iB = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : ((MBridgeBaseView) this).b.getRewardTemplateMode().b();
                    if (this.p == null) {
                        CampaignEx campaignEx5 = ((MBridgeBaseView) this).b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            p();
                        } else {
                            Context context = ((MBridgeBaseView) this).a;
                            CampaignEx campaignEx6 = ((MBridgeBaseView) this).b;
                            boolean z = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = ((MBridgeBaseView) this).b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, (AttributeSet) null, false, -1, z, iB, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(((MBridgeBaseView) this).b);
                        }
                    }
                    this.p.setLayout();
                    if (((MBridgeBaseView) this).b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().b(((MBridgeBaseView) this).b.getRequestId() + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + ((MBridgeBaseView) this).b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.p, ((MBridgeBaseView) this).b.getRequestId() + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + ((MBridgeBaseView) this).b.getId(), new i(((MBridgeBaseView) this).notifyListener));
                            } catch (Exception e) {
                                o0.b("MBridgeBaseView", e.getMessage());
                            }
                        } else {
                            try {
                                String strA = z0.a(((MBridgeBaseView) this).b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(((MBridgeBaseView) this).b, this.p, new i(((MBridgeBaseView) this).notifyListener), 2);
                                }
                            } catch (Exception e2) {
                                o0.b("MBridgeBaseView", e2.getMessage());
                            }
                        }
                    }
                    this.p.setUnitId(this.w);
                    this.p.setCloseBtnDelay(this.z);
                    this.p.setNotifyListener(new i(((MBridgeBaseView) this).notifyListener));
                    this.p.preLoadData(bVar);
                    this.p.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 1;
        this.z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void a(com.mbridge.msdk.video.module.listener.a aVar, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(this.o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}
