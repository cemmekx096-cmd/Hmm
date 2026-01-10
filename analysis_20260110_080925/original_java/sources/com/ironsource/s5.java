package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class s5 extends s7 {
    private static final s5 d = new s5();
    private LevelPlayBannerListener b = null;
    private LevelPlayBannerListener c = null;

    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdLeftApplication(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ AdInfo a;

        b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdClicked(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ AdInfo a;

        c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdClicked(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdLoaded(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdLoaded(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdScreenPresented(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdScreenPresented(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdScreenDismissed(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.b != null) {
                s5.this.b.onAdScreenDismissed(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s5.this.c != null) {
                s5.this.c.onAdLeftApplication(s5.this.a((s5) this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + s5.this.a((s5) this.a));
            }
        }
    }

    private s5() {
    }

    public static s5 a() {
        return d;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.b = levelPlayBannerListener;
    }

    public LevelPlayBannerListener b() {
        return this.b;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.c = levelPlayBannerListener;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }
}
