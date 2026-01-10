package com.my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShareButtonData;
import com.my.target.fb;
import com.my.target.instreamads.InstreamAudioAd$;
import com.my.target.j1;
import com.my.target.k3;
import com.my.target.l3;
import com.my.target.m;
import com.my.target.o3;
import com.my.target.p1;
import com.my.target.r5;
import com.my.target.u5;
import com.my.target.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class InstreamAudioAd extends BaseAd {
    public final Context e;
    public final MenuFactory f;
    public o3 g;
    public k3 h;
    public InstreamAudioAdPlayer i;
    public InstreamAudioAdListener j;
    public int k;
    public float l;
    public float[] m;
    public float[] n;
    public float o;

    public static final class InstreamAdCompanionBanner {
        public final String adSlotID;
        public final String apiFramework;
        public final int assetHeight;
        public final int assetWidth;
        public final String bundleId;
        public final int expandedHeight;
        public final int expandedWidth;
        public final int height;
        public final String htmlResource;
        public final String iframeResource;
        public final boolean isClickable;
        public final String required;
        public final String staticResource;
        public final int width;

        public InstreamAdCompanionBanner(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.width = i;
            this.height = i2;
            this.assetWidth = i3;
            this.assetHeight = i4;
            this.expandedWidth = i5;
            this.expandedHeight = i6;
            this.isClickable = z;
            this.staticResource = str;
            this.iframeResource = str2;
            this.htmlResource = str3;
            this.apiFramework = str4;
            this.adSlotID = str5;
            this.required = str6;
            this.bundleId = str7;
        }

        public static InstreamAdCompanionBanner a(j1 j1Var) {
            return new InstreamAdCompanionBanner(j1Var.G(), j1Var.p(), j1Var.O(), j1Var.N(), j1Var.Q(), j1Var.P(), !TextUtils.isEmpty(j1Var.B()), j1Var.U(), j1Var.S(), j1Var.R(), j1Var.M(), j1Var.L(), j1Var.T(), j1Var.e());
        }

        public String toString() {
            return "InstreamAdCompanionBanner{width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", isClickable=" + this.isClickable + ", staticResource='" + this.staticResource + "', iframeResource='" + this.iframeResource + "', htmlResource='" + this.htmlResource + "', apiFramework='" + this.apiFramework + "', adSlotID='" + this.adSlotID + "', required='" + this.required + "', bundleId='" + this.bundleId + "'}";
        }
    }

    public static final class InstreamAudioAdBanner {
        public final ImageData adChoicesIcon;
        public final String adText;
        public final String advertisingLabel;
        public final boolean allowPause;
        public final boolean allowSeek;
        public final boolean allowSkip;
        public final boolean allowTrackChange;
        public final String bundleId;
        public final List<InstreamAdCompanionBanner> companionBanners;
        public final float duration;
        public final boolean hasAdChoices;
        public final ArrayList<ShareButtonData> shareButtonDatas;

        public InstreamAudioAdBanner(boolean z, boolean z2, boolean z3, float f, String str, boolean z4, ArrayList arrayList, List list, boolean z5, String str2, ImageData imageData, String str3) {
            this.allowSeek = z;
            this.allowSkip = z2;
            this.allowPause = z4;
            this.allowTrackChange = z3;
            this.duration = f;
            this.adText = str;
            this.shareButtonDatas = arrayList;
            this.companionBanners = list;
            this.hasAdChoices = z5;
            this.advertisingLabel = str2;
            this.adChoicesIcon = imageData;
            this.bundleId = str3;
        }

        public static InstreamAudioAdBanner a(r5 r5Var) {
            ArrayList arrayList = new ArrayList();
            Iterator it = r5Var.P().iterator();
            while (it.hasNext()) {
                arrayList.add(InstreamAdCompanionBanner.a((j1) it.next()));
            }
            boolean z = false;
            ImageData imageDataC = null;
            if (r5Var.a() != null) {
                z = true;
                imageDataC = r5Var.a().c();
            }
            ImageData imageData = imageDataC;
            return new InstreamAudioAdBanner(r5Var.d0(), r5Var.e0(), r5Var.f0(), r5Var.o(), r5Var.L(), r5Var.b0(), r5Var.X(), arrayList, z, r5Var.b(), imageData, r5Var.e());
        }

        public String toString() {
            return "InstreamAudioAdBanner{duration=" + this.duration + ", allowSeek=" + this.allowSeek + ", allowPause=" + this.allowPause + ", allowSkip=" + this.allowSkip + ", allowTrackChange=" + this.allowTrackChange + ", hasAdChoices=" + this.hasAdChoices + ", adChoicesIcon=" + this.adChoicesIcon + ", adText='" + this.adText + "', bundleId='" + this.bundleId + "', shareButtonDatas=" + this.shareButtonDatas + ", companionBanners=" + this.companionBanners + ", advertisingLabel='" + this.advertisingLabel + "'}";
        }
    }

    public interface InstreamAudioAdListener {
        void onBannerComplete(InstreamAudioAd instreamAudioAd, InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerShouldClose(InstreamAudioAd instreamAudioAd, InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerStart(InstreamAudioAd instreamAudioAd, InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerTimeLeftChange(float f, float f2, InstreamAudioAd instreamAudioAd);

        void onComplete(String str, InstreamAudioAd instreamAudioAd);

        void onError(String str, InstreamAudioAd instreamAudioAd);

        void onLoad(InstreamAudioAd instreamAudioAd);

        void onNoAd(IAdLoadingError iAdLoadingError, InstreamAudioAd instreamAudioAd);
    }

    public InstreamAudioAd(int i, Context context) {
        super(i, "instreamaudioads");
        this.k = 10;
        this.l = 1.0f;
        this.e = context;
        this.f = new p1();
        fb.c("Instream audio ad created. Version - " + MyTargetVersion.VERSION);
    }

    public final void a(o3 o3Var, IAdLoadingError iAdLoadingError) {
        InstreamAudioAdListener instreamAudioAdListener = this.j;
        if (instreamAudioAdListener == null) {
            return;
        }
        if (o3Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.o;
            }
            instreamAudioAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        if (!o3Var.d()) {
            InstreamAudioAdListener instreamAudioAdListener2 = this.j;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.r;
            }
            instreamAudioAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        this.g = o3Var;
        k3 k3VarA = k3.a(this, o3Var, ((BaseAd) this).a, ((BaseAd) this).b, this.f);
        this.h = k3VarA;
        k3VarA.a(this.k);
        this.h.a(this.l);
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.i;
        if (instreamAudioAdPlayer != null) {
            this.h.a(instreamAudioAdPlayer);
        }
        configureMidpoints(this.o, this.n);
        this.j.onLoad(this);
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, null);
    }

    public void configureMidpointsPercents(float f, float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f);
        } else {
            configureMidpoints(f, v5.a(f, fArr));
        }
    }

    public void destroy() {
        this.j = null;
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.a();
        }
    }

    public InstreamAudioAdBanner getCurrentBanner() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            return k3Var.b();
        }
        return null;
    }

    public InstreamAudioAdListener getListener() {
        return this.j;
    }

    public int getLoadingTimeout() {
        return this.k;
    }

    public float[] getMidPoints() {
        float[] fArr = this.m;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public InstreamAudioAdPlayer getPlayer() {
        return this.i;
    }

    public float getVolume() {
        k3 k3Var = this.h;
        return k3Var != null ? k3Var.d() : this.l;
    }

    public void handleAdChoicesClick(Context context) {
        k3 k3Var = this.h;
        if (k3Var == null) {
            return;
        }
        k3Var.a(context);
    }

    public void handleClick() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.e();
        }
    }

    public void handleCompanionClick(InstreamAdCompanionBanner instreamAdCompanionBanner) {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(InstreamAdCompanionBanner instreamAdCompanionBanner) {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.c(instreamAdCompanionBanner);
        }
    }

    public void load() {
        if (isLoadCalled()) {
            fb.a("InstreamAudioAd: Doesn't support multiple load");
            a(null, m.t);
        } else {
            l3.a(((BaseAd) this).a, ((BaseAd) this).b, this.k).a(new InstreamAudioAd$.ExternalSyntheticLambda0(this)).a(((BaseAd) this).b.a(), this.e);
        }
    }

    public void pause() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.f();
        }
    }

    public void resume() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.h();
        }
    }

    public void setListener(InstreamAudioAdListener instreamAudioAdListener) {
        this.j = instreamAudioAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            fb.a("InstreamAudioAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.k = 5;
        } else {
            fb.a("InstreamAudioAd: Ad loading timeout set to " + i + " seconds");
            this.k = i;
        }
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.a(this.k);
        }
    }

    public void setPlayer(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.i = instreamAudioAdPlayer;
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.a(instreamAudioAdPlayer);
        }
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            fb.a("InstreamAudioAd: Unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.l = f;
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.a(f);
        }
    }

    public void skip() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.i();
        }
    }

    public void skipBanner() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.j();
        }
    }

    public void startMidroll(float f) {
        k3 k3Var = this.h;
        if (k3Var == null) {
            fb.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (k3Var.c() == null) {
            fb.a("InstreamAudioAd: Unable to start ad – player has not set");
        } else {
            this.h.b(f);
        }
    }

    public void startPauseroll() {
        a("pauseroll");
    }

    public void startPostroll() {
        a("postroll");
    }

    public void startPreroll() {
        a("preroll");
    }

    public void stop() {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.k();
        }
    }

    public InstreamAudioAd(int i, MenuFactory menuFactory, Context context) {
        super(i, "instreamaudioads");
        this.k = 10;
        this.l = 1.0f;
        this.e = context;
        this.f = menuFactory;
        fb.c("Instream audio ad created. Version - " + MyTargetVersion.VERSION);
    }

    private void a(String str) {
        k3 k3Var = this.h;
        if (k3Var == null) {
            fb.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (k3Var.c() == null) {
            fb.a("InstreamAudioAd: Unable to start ad – player has not set");
        } else {
            this.h.a(str);
        }
    }

    public void configureMidpoints(float f, float[] fArr) {
        u5 u5VarA;
        String str;
        if (f <= 0.0f) {
            str = "InstreamAudioAd: Midpoints are not configured, duration is not set or <= zero";
        } else {
            if (this.m == null) {
                this.n = fArr;
                this.o = f;
                o3 o3Var = this.g;
                if (o3Var == null || (u5VarA = o3Var.a("midroll")) == null) {
                    return;
                }
                float[] fArrA = v5.a(u5VarA, this.n, f);
                this.m = fArrA;
                k3 k3Var = this.h;
                if (k3Var != null) {
                    k3Var.a(fArrA);
                    return;
                }
                return;
            }
            str = "InstreamAudioAd: Midpoints already configured";
        }
        fb.a(str);
    }

    public void handleCompanionClick(InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        k3 k3Var = this.h;
        if (k3Var != null) {
            k3Var.a(instreamAdCompanionBanner, context);
        }
    }
}
