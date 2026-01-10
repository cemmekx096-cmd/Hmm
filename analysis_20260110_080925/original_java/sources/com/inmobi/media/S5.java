package com.inmobi.media;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.S5$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J1\u0010\r\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\r\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u0013\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b\r\u0010*J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0003R*\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b\r\u00101R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0016R\u0011\u0010<\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010\u0016¨\u0006="}, d2 = {"Lcom/inmobi/media/S5;", "Lcom/inmobi/media/Mc;", "<init>", "()V", "Lcom/inmobi/ads/AdMetaInfo;", "info", BuildConfig.FLAVOR, "e", "(Lcom/inmobi/ads/AdMetaInfo;)V", BuildConfig.FLAVOR, "shouldResetPubState", BuildConfig.FLAVOR, "errorCode", "a", "(ZS)V", "Lcom/inmobi/media/Q0;", "adUnit", "Lcom/inmobi/ads/InMobiAdRequestStatus;", SettingsJsonConstants.APP_STATUS_KEY, "c", "(Lcom/inmobi/media/Q0;Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "x", "()Z", "y", "Lcom/inmobi/media/Y9;", "pubSettings", "Landroid/content/Context;", "context", "sendLoadCalledTelemetry", BuildConfig.FLAVOR, "logType", "(Lcom/inmobi/media/Y9;Landroid/content/Context;ZLjava/lang/String;)V", "b", "D", "d", "Lcom/inmobi/ads/controllers/PublisherCallbacks;", "callbacks", "(Lcom/inmobi/ads/controllers/PublisherCallbacks;)V", "F", "g", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "E", "Lcom/inmobi/media/Q5;", "o", "Lcom/inmobi/media/Q5;", "z", "()Lcom/inmobi/media/Q5;", "(Lcom/inmobi/media/Q5;)V", "A", "interstitialAdUnit", "p", "Z", "showRequested", "j", "()Lcom/inmobi/media/Q0;", "C", "isInitialised", "B", "isAdInReadyState", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class S5 extends Mc {

    /* renamed from: o, reason: from kotlin metadata */
    private Q5 interstitialAdUnit;

    /* renamed from: p, reason: from kotlin metadata */
    private boolean showRequested;

    public static /* synthetic */ void A() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(S5 s5, AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(s5, "this$0");
        Intrinsics.checkNotNullParameter(adMetaInfo, "$info");
        g5 g5VarP = s5.p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = s5.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(adMetaInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(S5 s5) {
        Intrinsics.checkNotNullParameter(s5, "this$0");
        g5 g5VarP = s5.p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = s5.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        g5 g5VarP2 = s5.p();
        if (g5VarP2 != null) {
            g5VarP2.a();
        }
        s5.y();
    }

    private final void e(AdMetaInfo info) {
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.c("InterstitialUnifiedAdManager", "onLoadSuccess");
        }
        super.c(info);
        g5 g5VarP2 = p();
        if (g5VarP2 != null) {
            g5VarP2.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        a((byte) 2);
        s().post(new S5$.ExternalSyntheticLambda2(this, info));
    }

    private final boolean x() {
        byte bQ = q();
        if (bQ == 1) {
            g5 g5VarP = p();
            if (g5VarP != null) {
                g5VarP.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            I6.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
        } else if (bQ == 7) {
            I6.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
        } else {
            if (bQ != 5) {
                if (!this.showRequested) {
                    return true;
                }
                Q5 q5 = this.interstitialAdUnit;
                if (q5 != null) {
                    q5.c((short) 2149);
                }
                I6.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
                g5 g5VarP3 = p();
                if (g5VarP3 != null) {
                    g5VarP3.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
                }
                return false;
            }
            if (this.interstitialAdUnit != null) {
                StringBuilder sb = new StringBuilder("An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ");
                Q5 q52 = this.interstitialAdUnit;
                I6.a((byte) 1, "InMobi", sb.append(q52 != null ? q52.I() : null).toString());
                g5 g5VarP4 = p();
                if (g5VarP4 != null) {
                    StringBuilder sb2 = new StringBuilder("An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ");
                    Q5 q53 = this.interstitialAdUnit;
                    g5VarP4.b("InMobi", sb2.append(q53 != null ? q53.I() : null).toString());
                }
                a(false, (short) 2148);
            }
        }
        return false;
    }

    private final void y() {
        Q5 q5 = this.interstitialAdUnit;
        if (q5 != null) {
            q5.b((byte) 4);
        }
    }

    public final boolean B() {
        Q5 q5 = this.interstitialAdUnit;
        if (q5 != null && 2 == q()) {
            return q5.H0();
        }
        return false;
    }

    public boolean C() {
        return this.interstitialAdUnit != null;
    }

    public final void D() throws IllegalStateException {
        Q0 q0J;
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "render");
        }
        Q5 q5 = this.interstitialAdUnit;
        if (q5 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (q5.H0() && n() != null) {
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfoN = n();
            Intrinsics.checkNotNull(adMetaInfoN);
            e(adMetaInfoN);
            return;
        }
        if (this.showRequested) {
            g5 g5VarP3 = p();
            if (g5VarP3 != null) {
                g5VarP3.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            I6.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Q5 q52 = this.interstitialAdUnit;
            if (q52 != null) {
                q52.b((short) 2128);
                return;
            }
            return;
        }
        Q5 q53 = this.interstitialAdUnit;
        h hVarM = q53 != null ? q53.m() : null;
        Q5 q54 = this.interstitialAdUnit;
        boolean zA = a("InMobi", String.valueOf(q54 != null ? q54.I() : null));
        if (hVarM == null) {
            g5 g5VarP4 = p();
            if (g5VarP4 != null) {
                g5VarP4.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Q5 q55 = this.interstitialAdUnit;
            if (q55 != null) {
                q55.a((short) 2166);
            }
        }
        if (n() == null) {
            g5 g5VarP5 = p();
            if (g5VarP5 != null) {
                g5VarP5.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Q5 q56 = this.interstitialAdUnit;
            if (q56 != null) {
                q56.a((short) 2167);
            }
        }
        if (hVarM == null || !zA) {
            return;
        }
        if (v() && (q0J = j()) != null) {
            q0J.e((byte) 1);
        }
        g5 g5VarP6 = p();
        if (g5VarP6 != null) {
            g5VarP6.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        a((byte) 8);
        Q5 q57 = this.interstitialAdUnit;
        if (q57 != null) {
            q57.j0();
        }
    }

    public final void E() {
        Q5 q5;
        gc gcVarG0;
        Q5 q52 = this.interstitialAdUnit;
        if ((q52 == null || (gcVarG0 = q52.G0()) == null || !gcVarG0.b) && (q5 = this.interstitialAdUnit) != null) {
            q5.K0();
        }
    }

    public final void F() {
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "show");
        }
        Q5 q5 = this.interstitialAdUnit;
        gc gcVarG0 = q5 != null ? q5.G0() : null;
        if (gcVarG0 != null) {
            gcVarG0.b = true;
        }
        Q5 q52 = this.interstitialAdUnit;
        if (q52 != null) {
            q52.w0();
        }
        if (x()) {
            if (!t4.a.a()) {
                if (this.interstitialAdUnit != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            Q5 q53 = this.interstitialAdUnit;
            if (q53 == null || !q53.e((byte) 4)) {
                return;
            }
            this.showRequested = true;
            Q5 q54 = this.interstitialAdUnit;
            if (q54 != null) {
                q54.j((E0) this);
            }
        }
    }

    public final void a(Q5 q5) {
        this.interstitialAdUnit = q5;
    }

    public void d() {
        s().post(new S5$.ExternalSyntheticLambda1(this));
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        a((byte) 6);
        Q5 q5 = this.interstitialAdUnit;
        if (q5 != null) {
            q5.g();
        }
        g5 g5VarP2 = p();
        if (g5VarP2 != null) {
            g5VarP2.a();
        }
    }

    public void g() {
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        Q0 q0J = j();
        if (q0J != null) {
            if (q0J.Q() == 6 || q0J.Q() == 7) {
                q0J.a((E0) this);
            } else {
                a(true, (short) 2159);
            }
        }
    }

    public Q0 j() {
        return this.interstitialAdUnit;
    }

    /* renamed from: z, reason: from getter */
    public final Q5 getInterstitialAdUnit() {
        return this.interstitialAdUnit;
    }

    private final void a(boolean shouldResetPubState, short errorCode) {
        Q5 q5;
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (errorCode != 0 && (q5 = this.interstitialAdUnit) != null) {
            q5.c(errorCode);
        }
        s().post(new S5$.ExternalSyntheticLambda4(this));
        if (shouldResetPubState) {
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            a((byte) 6);
            Q5 q52 = this.interstitialAdUnit;
            if (q52 != null) {
                q52.g();
            }
        }
        g5 g5VarP3 = p();
        if (g5VarP3 != null) {
            g5VarP3.a();
        }
    }

    public void b(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        d(info);
        if (this.interstitialAdUnit == null) {
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((Q0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        s().post(new S5$.ExternalSyntheticLambda3(this, info));
    }

    public void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.interstitialAdUnit == null) {
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.b("InterstitialUnifiedAdManager", "adUnit is null");
            }
            c(null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        e(info);
    }

    public final void c(PublisherCallbacks callbacks) {
        Q5 q5;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (l() == null) {
            b(callbacks);
        }
        if (Intrinsics.areEqual(u(), Boolean.FALSE)) {
            Q5 q52 = this.interstitialAdUnit;
            if (q52 != null) {
                q52.a((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            g5 g5VarP = p();
            if (g5VarP != null) {
                g5VarP.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            I6.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.showRequested) {
            Q5 q53 = this.interstitialAdUnit;
            if (q53 != null) {
                q53.a((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            I6.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        a(Boolean.TRUE);
        Q5 q54 = this.interstitialAdUnit;
        if (q54 == null || !a("InMobi", String.valueOf(q54.I()), callbacks) || (q5 = this.interstitialAdUnit) == null || !q5.e(o())) {
            return;
        }
        a((byte) 1);
        g5 g5VarP3 = p();
        if (g5VarP3 != null) {
            StringBuilder sb = new StringBuilder("Fetching an Interstitial ad for placement id: ");
            Q5 q55 = this.interstitialAdUnit;
            g5VarP3.c("InterstitialUnifiedAdManager", sb.append(q55 != null ? q55.I() : null).toString());
        }
        StringBuilder sb2 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
        Q5 q56 = this.interstitialAdUnit;
        I6.a((byte) 2, "InterstitialUnifiedAdManager", sb2.append(q56 != null ? q56.I() : null).toString());
        Q5 q57 = this.interstitialAdUnit;
        if (q57 != null) {
            q57.g((E0) this);
        }
        Q5 q58 = this.interstitialAdUnit;
        if (q58 != null) {
            q58.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(S5 s5) {
        Intrinsics.checkNotNullParameter(s5, "this$0");
        g5 g5VarP = s5.p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = s5.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        s5.y();
    }

    public void b() {
        s().post(new S5$.ExternalSyntheticLambda0(this));
        g5 g5VarP = p();
        if (g5VarP != null) {
            g5VarP.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        a((byte) 0);
        a((Boolean) null);
        Q5 q5 = this.interstitialAdUnit;
        if (q5 != null) {
            q5.g();
        }
        g5 g5VarP2 = p();
        if (g5VarP2 != null) {
            g5VarP2.a();
        }
    }

    public static /* synthetic */ void a(S5 s5, Y9 y9, Context context, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str = "intHtml";
        }
        s5.a(y9, context, z, str);
    }

    public final void a(Y9 pubSettings, Context context, boolean sendLoadCalledTelemetry, String logType) {
        Q5 q5;
        Q5 q52;
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.interstitialAdUnit == null) {
            this.interstitialAdUnit = new Q5(context, new W("int").a(pubSettings.a).c(pubSettings.b).a(pubSettings.c).e(pubSettings.e).b(pubSettings.f).a(), this);
        }
        if (sendLoadCalledTelemetry) {
            w();
        }
        String str = pubSettings.e;
        if (str != null) {
            g5 g5VarP = p();
            if (g5VarP != null) {
                g5VarP.a();
            }
            B6 b6 = Ea.a;
            a(Ea.a(logType, str, false));
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            f5 f5VarP = p();
            if (f5VarP != null && (q52 = this.interstitialAdUnit) != null) {
                q52.a(f5VarP);
            }
            g5 g5VarP3 = p();
            if (g5VarP3 != null) {
                g5VarP3.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            Q5 q53 = this.interstitialAdUnit;
            Intrinsics.checkNotNull(q53);
            Ea.a(q53, p());
        }
        Q5 q54 = this.interstitialAdUnit;
        if (q54 != null) {
            q54.a(context);
        }
        Q5 q55 = this.interstitialAdUnit;
        if (q55 != null) {
            q55.a(pubSettings.c);
        }
        Q5 q56 = this.interstitialAdUnit;
        if (q56 != null) {
            q56.c("activity");
        }
        if (pubSettings.d && (q5 = this.interstitialAdUnit) != null) {
            q5.F0();
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            Q5 q57 = this.interstitialAdUnit;
            if (q57 != null) {
                q57.a(watermarkDataT);
            }
            g5 g5VarP4 = p();
            if (g5VarP4 != null) {
                g5VarP4.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(S5 s5, AdMetaInfo adMetaInfo) {
        Intrinsics.checkNotNullParameter(s5, "this$0");
        Intrinsics.checkNotNullParameter(adMetaInfo, "$info");
        g5 g5VarP = s5.p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = s5.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(adMetaInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(S5 s5) {
        Intrinsics.checkNotNullParameter(s5, "this$0");
        g5 g5VarP = s5.p();
        if (g5VarP != null) {
            g5VarP.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacksL = s5.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDismissed();
        }
    }

    public void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        Q0 q0J = j();
        if (q0J != null) {
            q0J.x0();
        }
        this.showRequested = false;
    }

    private final void c(Q0 adUnit, InMobiAdRequestStatus status) {
        byte bQ = q();
        if (bQ == 8 || bQ == 1) {
            b(adUnit, status);
            return;
        }
        if (bQ == 2) {
            I6.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            g5 g5VarP = p();
            if (g5VarP != null) {
                g5VarP.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (bQ == 5) {
            I6.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
            g5 g5VarP2 = p();
            if (g5VarP2 != null) {
                g5VarP2.b("InMobi", "Ad will be dismissed, Internal error");
            }
            y();
            b();
            return;
        }
        I6.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
        g5 g5VarP3 = p();
        if (g5VarP3 != null) {
            g5VarP3.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        Q5 q5 = this.interstitialAdUnit;
        if (q5 != null) {
            q5.a(watermarkData);
        }
    }
}
