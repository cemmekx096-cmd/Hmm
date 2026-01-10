package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.media3.common.MimeTypes;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.nativeAd.b$;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v5;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class b extends w4 implements a.InterfaceC0004a, AppLovinAdLoadListener {
    private final List A;
    private final List B;
    private final JSONObject g;
    private final JSONObject h;
    private final AppLovinNativeAdLoadListener i;
    private String j;
    private String k;
    private String l;
    private Double m;
    private String n;
    private Uri o;
    private Uri p;
    private b7 q;
    private Uri r;
    private Uri s;
    private Uri t;
    private Uri u;
    private final List v;
    private final List w;
    private final List x;
    private final List y;
    private final List z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.j = BuildConfig.FLAVOR;
        this.k = BuildConfig.FLAVOR;
        this.l = BuildConfig.FLAVOR;
        this.m = null;
        this.n = BuildConfig.FLAVOR;
        this.o = null;
        this.p = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.g = jSONObject;
        this.h = jSONObject2;
        this.i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.t = Uri.parse(string);
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Processed click destination URL: " + this.t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.u = Uri.parse(string2);
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Processed click destination backup URL: " + this.u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.g, "use_requests_for_native_ad_click_postbacks", (Boolean) ((w4) this).a.a(l4.I2)).booleanValue()) {
                try {
                    this.v.addAll(JsonUtils.toList(jSONArray));
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed click tracking URLs: " + this.v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.x.add(new e.a(((w4) this).a).f(str).i(false).g(false).h(f()).b());
                    }
                }
            }
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Processed click tracking requests: " + this.x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            ((w4) this).a.E().a(((w4) this).b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new b$.ExternalSyntheticLambda0(this, appLovinNativeAdImpl));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.h), ((w4) this).a).setTitle(this.j).setAdvertiser(this.k).setBody(this.l).setCallToAction(this.n).setStarRating(this.m).setIconUri(this.o).setMainImageUri(this.p).setPrivacyIconUri(this.r).setVastAd(this.q).setPrivacyDestinationUri(this.s).setClickDestinationUri(this.t).setClickDestinationBackupUri(this.u).setClickTrackingUrls(this.v).setJsTrackers(this.w).setClickTrackingRequests(this.x).setImpressionRequests(this.y).setViewableMRC50Requests(this.z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        ((w4) this).a.q0().a(new a(appLovinNativeAdImplBuild, ((w4) this).a, this), r5.b.a);
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.g, "fire_native_ad_postbacks_from_webview", (Boolean) ((w4) this).a.a(l4.H2)).booleanValue();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "VAST ad rendered successfully");
        }
        this.q = (b7) appLovinAd;
        e();
    }

    public void failedToReceiveAd(int i) {
        if (o.a()) {
            ((w4) this).c.b(((w4) this).b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String, org.json.JSONObject] */
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "No oRtb response provided: " + this.g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, JsonParser.EXCLUDE_VERSION, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to retrieve assets - failing ad load: " + this.g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = BuildConfig.FLAVOR;
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) r3);
            if (jSONObject4.has("title")) {
                this.j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r3), "text", r3);
                if (o.a()) {
                    ((w4) this).c.a(((w4) this).b, "Processed title: " + this.j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r3));
            } else if (jSONObject4.has("img")) {
                int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r3);
                int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r3);
                if (i3 == 1 || 3 == i2) {
                    this.o = Uri.parse(string4);
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed icon URL: " + this.o);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.p = Uri.parse(string4);
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed main image URL: " + this.p);
                    }
                } else {
                    if (o.a()) {
                        ((w4) this).c.k(((w4) this).b, "Unrecognized image: " + jSONObject4);
                    }
                    int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i4 <= 0 || i5 <= 0) {
                        if (o.a()) {
                            ((w4) this).c.k(((w4) this).b, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        if (o.a()) {
                            ((w4) this).c.a(((w4) this).b, "Inferring main image from " + i4 + "x" + i5 + "...");
                        }
                        this.p = Uri.parse(string4);
                    } else {
                        if (o.a()) {
                            ((w4) this).c.a(((w4) this).b, "Inferring icon image from " + i4 + "x" + i5 + "...");
                        }
                        this.o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed VAST video");
                    }
                } else if (o.a()) {
                    ((w4) this).c.k(((w4) this).b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                int i6 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (JSONObject) null);
                int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.k = string6;
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed advertiser: " + this.k);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.l = string6;
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed body: " + this.l);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.n = string6;
                    if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Processed cta: " + this.n);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double dA = a7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.m = Double.valueOf(dA);
                        if (o.a()) {
                            ((w4) this).c.a(((w4) this).b, "Processed star rating: " + this.m);
                        }
                    } else if (o.a()) {
                        ((w4) this).c.a(((w4) this).b, "Received invalid star rating: " + string6);
                    }
                } else if (o.a()) {
                    ((w4) this).c.k(((w4) this).b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unsupported asset object: " + jSONObject4);
            }
            i++;
            r3 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.w.add(string7);
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i8 = 0;
            while (i8 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.y.add(new e.a(((w4) this).a).f(str2).i(false).g(false).h(f()).b());
                        if (o.a()) {
                            ((w4) this).c.a(((w4) this).b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i8++;
                obj = null;
            }
        }
        ?? r32 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) r32);
                int i10 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r32);
                if (!TextUtils.isEmpty(string8)) {
                    if (i11 == 1 || i11 == 2) {
                        if (i11 == 2 && string8.startsWith("<script")) {
                            this.w.add(string8);
                        } else {
                            e eVarB = new e.a(((w4) this).a).f(string8).i(false).g(false).h(f() || i11 == 2).b();
                            if (i10 == 1) {
                                this.y.add(eVarB);
                                if (o.a()) {
                                    ((w4) this).c.a(((w4) this).b, "Processed impression URL: " + string8);
                                }
                            } else if (i10 == 2) {
                                this.z.add(eVarB);
                                if (o.a()) {
                                    ((w4) this).c.a(((w4) this).b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i10 == 3) {
                                this.A.add(eVarB);
                                if (o.a()) {
                                    ((w4) this).c.a(((w4) this).b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i10 == 4) {
                                this.B.add(eVarB);
                                if (o.a()) {
                                    ((w4) this).c.a(((w4) this).b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i10 == 555) {
                                if (o.a()) {
                                    ((w4) this).c.a(((w4) this).b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (o.a()) {
                                ((w4) this).c.b(((w4) this).b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (o.a()) {
                        ((w4) this).c.b(((w4) this).b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i9++;
                r32 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Processing VAST video...");
        }
        ((w4) this).a.q0().a(v5.a(str, JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.h), this, ((w4) this).a));
    }

    private void b(String str) {
        this.i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0004a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
