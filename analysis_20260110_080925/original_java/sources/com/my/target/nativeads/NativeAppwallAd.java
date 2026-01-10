package com.my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import com.my.target.ab;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.d1;
import com.my.target.fb;
import com.my.target.h8;
import com.my.target.m;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.nativeads.views.AppwallAdView;
import com.my.target.r7;
import com.my.target.t;
import com.my.target.t7;
import com.my.target.u7;
import com.my.target.x7;
import com.my.target.z2;
import com.my.target.za;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class NativeAppwallAd extends BaseAd {
    public final Context e;
    public final d1 f;
    public final HashMap g;
    public final ArrayList h;
    public AppwallAdListener i;
    public x7 j;
    public t7 k;
    public WeakReference l;
    public String m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    public interface AppwallAdListener {
        void onClick(NativeAppwallBanner nativeAppwallBanner, NativeAppwallAd nativeAppwallAd);

        void onDismiss(NativeAppwallAd nativeAppwallAd);

        void onDisplay(NativeAppwallAd nativeAppwallAd);

        void onLoad(NativeAppwallAd nativeAppwallAd);

        void onNoAd(IAdLoadingError iAdLoadingError, NativeAppwallAd nativeAppwallAd);
    }

    public class a implements AppwallAdView.AppwallAdViewListener {
        public a() {
        }

        public void onBannerClick(NativeAppwallBanner nativeAppwallBanner) {
            AppwallAdView appwallAdView;
            NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
            WeakReference weakReference = NativeAppwallAd.this.l;
            if (weakReference == null || (appwallAdView = (AppwallAdView) weakReference.get()) == null) {
                return;
            }
            appwallAdView.notifyDataSetChanged();
        }

        public void onBannersShow(List list) {
            NativeAppwallAd.this.handleBannersShow(list);
        }
    }

    public NativeAppwallAd(int i, Context context) {
        super(i, "appwall");
        this.f = d1.a();
        this.g = new HashMap();
        this.h = new ArrayList();
        this.m = "Apps";
        this.n = -12232093;
        this.o = -13220531;
        this.p = -1;
        this.q = false;
        this.e = context;
        ((BaseAd) this).a.b(0);
        fb.c("Native appwall ad created. Version - " + MyTargetVersion.VERSION);
    }

    public static void loadImageToView(ImageData imageData, ImageView imageView) {
        z2.b(imageData, imageView);
    }

    public final void a(x7 x7Var, IAdLoadingError iAdLoadingError) {
        AppwallAdListener appwallAdListener = this.i;
        if (appwallAdListener == null) {
            return;
        }
        if (x7Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.i;
            }
            appwallAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        this.j = x7Var;
        for (r7 r7Var : x7Var.c()) {
            NativeAppwallBanner nativeAppwallBannerA = NativeAppwallBanner.a(r7Var);
            this.h.add(nativeAppwallBannerA);
            this.g.put(nativeAppwallBannerA, r7Var);
        }
        this.i.onLoad(this);
    }

    public void destroy() {
        unregisterAppwallAdView();
        t7 t7Var = this.k;
        if (t7Var != null) {
            t7Var.a();
            this.k = null;
        }
        this.i = null;
    }

    public void dismiss() {
        t7 t7Var = this.k;
        if (t7Var != null) {
            t7Var.b();
        }
    }

    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.h;
    }

    public long getCachePeriod() {
        return ((BaseAd) this).a.e();
    }

    public AppwallAdListener getListener() {
        return this.i;
    }

    public String getTitle() {
        return this.m;
    }

    public int getTitleBackgroundColor() {
        return this.n;
    }

    public int getTitleSupplementaryColor() {
        return this.o;
    }

    public int getTitleTextColor() {
        return this.p;
    }

    public void handleBannerClick(NativeAppwallBanner nativeAppwallBanner) {
        r7 r7Var = (r7) this.g.get(nativeAppwallBanner);
        if (r7Var == null) {
            fb.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
            return;
        }
        this.f.a(r7Var, 1, this.e);
        if (this.j != null) {
            nativeAppwallBanner.setHasNotification(false);
            h8.a(this.j, ((BaseAd) this).a).a(r7Var, false, this.e);
        }
        AppwallAdListener appwallAdListener = this.i;
        if (appwallAdListener != null) {
            appwallAdListener.onClick(nativeAppwallBanner, this);
        }
    }

    public void handleBannerShow(NativeAppwallBanner nativeAppwallBanner) {
        r7 r7Var = (r7) this.g.get(nativeAppwallBanner);
        if (r7Var != null) {
            ab.b(r7Var.x(), "playbackStarted", 2, this.e);
        } else {
            fb.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
        }
    }

    public void handleBannersShow(List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner nativeAppwallBanner : list) {
            r7 r7Var = (r7) this.g.get(nativeAppwallBanner);
            if (r7Var != null) {
                fb.a("NativeAppwallAd: Ad shown, banner Id = " + nativeAppwallBanner.getId());
                za zaVarB = r7Var.x().b("playbackStarted");
                if (!zaVarB.a.isEmpty()) {
                    arrayList.add(zaVarB);
                }
            } else {
                fb.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ab.a((za) it.next(), 2, this.e);
        }
    }

    public boolean hasNotifications() {
        Iterator it = this.g.keySet().iterator();
        while (it.hasNext()) {
            if (((NativeAppwallBanner) it.next()).isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int iF = ((BaseAd) this).a.f();
        return iF == 0 || iF == 1;
    }

    public boolean isHideStatusBarInDialog() {
        return this.q;
    }

    public void load() {
        if (isLoadCalled()) {
            fb.a("NativeAppwallAd: Appwall ad doesn't support multiple load");
            a(null, m.t);
        } else {
            u7.a(((BaseAd) this).a, ((BaseAd) this).b).a(new u7.b() { // from class: com.my.target.nativeads.NativeAppwallAd$$ExternalSyntheticLambda0
                public final void a(t tVar, m mVar) {
                    this.f$0.a((x7) tVar, mVar);
                }
            }).a(((BaseAd) this).b.a(), this.e);
        }
    }

    public String prepareBannerClickLink(NativeAppwallBanner nativeAppwallBanner) {
        r7 r7Var = (r7) this.g.get(nativeAppwallBanner);
        if (r7Var == null) {
            fb.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
            return null;
        }
        ab.b(r7Var.x(), "click", 3, this.e);
        x7 x7Var = this.j;
        if (x7Var != null) {
            h8.a(x7Var, ((BaseAd) this).a).a(r7Var, false, this.e);
        }
        return r7Var.B();
    }

    public void registerAppwallAdView(AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.l = new WeakReference(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new a());
    }

    public void setAutoLoadImages(boolean z) {
        ((BaseAd) this).a.b(0);
    }

    public void setCachePeriod(long j) {
        ((BaseAd) this).a.a(j);
    }

    public void setHideStatusBarInDialog(boolean z) {
        this.q = z;
    }

    public void setListener(AppwallAdListener appwallAdListener) {
        this.i = appwallAdListener;
    }

    public void setTitle(String str) {
        this.m = str;
    }

    public void setTitleBackgroundColor(int i) {
        this.n = i;
    }

    public void setTitleSupplementaryColor(int i) {
        this.o = i;
    }

    public void setTitleTextColor(int i) {
        this.p = i;
    }

    public void show() {
        if (this.j == null || this.h.size() <= 0) {
            fb.c("Native appwall ad show - no ad");
            return;
        }
        if (this.k == null) {
            this.k = t7.a(this);
        }
        this.k.a(this.e);
    }

    public void unregisterAppwallAdView() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            AppwallAdView appwallAdView = (AppwallAdView) weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener((AppwallAdView.AppwallAdViewListener) null);
            }
            this.l.clear();
            this.l = null;
        }
    }
}
