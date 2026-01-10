package com.ironsource;

import android.app.Activity;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.h1;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006!"}, d2 = {"Lcom/ironsource/dd;", "Lcom/ironsource/ld;", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "loadAd", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "placementName", "a", "Lcom/ironsource/h1;", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "Lcom/unity3d/mediation/LevelPlayAdError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "adInfo", "onAdLoaded", "onAdLoadFailed", "onAdInfoChanged", "b", "onAdClicked", "onAdClosed", "Lcom/ironsource/jl;", "Lcom/ironsource/jl;", "adInternal", "Lcom/ironsource/dd$a;", "Lcom/ironsource/dd$a;", SettingsJsonConstants.APP_STATUS_KEY, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/jl;Lcom/ironsource/dd$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dd implements ld {

    /* renamed from: a, reason: from kotlin metadata */
    private final jl adInternal;

    /* renamed from: b, reason: from kotlin metadata */
    private final a status;

    /* renamed from: c, reason: from kotlin metadata */
    private final LevelPlayAdInfo adInfo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ironsource/dd$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public dd(jl jlVar, a aVar) {
        Intrinsics.checkNotNullParameter(jlVar, "adInternal");
        Intrinsics.checkNotNullParameter(aVar, SettingsJsonConstants.APP_STATUS_KEY);
        this.adInternal = jlVar;
        this.status = aVar;
        String string = jlVar.f().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.adInfo = new LevelPlayAdInfo(string, jlVar.i(), jlVar.e().toString(), (ImpressionData) null, (em) null, (LevelPlayAdSize) null, (String) null, 120, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ dd(jl jlVar, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jlVar, (i & 2) != 0 ? a.Created : aVar);
    }

    private final boolean e() {
        jl jlVar;
        LevelPlayAdError levelPlayAdError;
        if (this.adInternal.i().length() == 0) {
            jlVar = this.adInternal;
            String string = this.adInternal.f().toString();
            Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string, this.adInternal.i(), 624, "Ad unit ID should be specified");
        } else if (this.adInternal.g().g()) {
            hl hlVarA = this.adInternal.m().t().a();
            if (hlVarA != null && hlVarA.a(this.adInternal.i(), this.adInternal.e())) {
                return true;
            }
            jlVar = this.adInternal;
            String string2 = this.adInternal.f().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adInternal.adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string2, this.adInternal.i(), 626, "Invalid ad unit id");
        } else {
            jlVar = this.adInternal;
            String string3 = this.adInternal.f().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adInternal.adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string3, this.adInternal.i(), 625, "Load must be called after init success callback");
        }
        jl.a(jlVar, levelPlayAdError, 0L, 2, (Object) null);
        return false;
    }

    public void a() {
        this.adInternal.a("onAdExpired on " + this.status + " state");
    }

    public void a(Activity activity, String placementName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.status == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.adInternal.f().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.adInternal.a(new LevelPlayAdError(string, this.adInternal.i(), 628, str), this.adInfo);
    }

    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.adInternal.a("onAdDisplayFailed on " + this.status + " state with error: " + error.getErrorMessage());
    }

    public void b() {
        this.adInternal.a("onAdDisplayed on " + this.status + " state");
    }

    /* renamed from: c, reason: from getter */
    public LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    public h1 d() {
        return new h1.a(this.status == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    public void loadAd() {
        if (e()) {
            this.adInternal.p();
        }
    }

    public void onAdClicked() {
        this.adInternal.a("onAdClicked on " + this.status + " state");
    }

    public void onAdClosed() {
        this.adInternal.a("onAdClosed on " + this.status + " state");
    }

    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adInternal.a("onAdInfoChanged on " + this.status + " state");
    }

    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.adInternal.a("onAdLoadFailed on " + this.status + " state with error: " + error.getErrorMessage());
    }

    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adInternal.a("onAdLoaded on " + this.status + " state");
    }
}
