package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import com.ironsource.environment.StringUtils;
import com.ironsource.fg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.r8;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class qs {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";
    protected static final String d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";
    protected static final int w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";
    protected static final boolean z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";
    private eq a;
    private gq b;
    private r8 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private fg.a i;
    private boolean j;
    private jc k;

    public enum a {
        NOT_SET("0"),
        CACHE(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
        SERVER("2");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }
    }

    public qs(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = qm.M().m();
        try {
            this.f = TextUtils.isEmpty(str3) ? IronSourceNetworkBridge.jsonObjectInit() : IronSourceNetworkBridge.jsonObjectInit(str3);
            this.j = n();
            s();
            q();
            r();
            this.d = TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str;
            this.e = TextUtils.isEmpty(str2) ? BuildConfig.FLAVOR : str2;
            b(this.f);
        } catch (JSONException e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public qs(qs qsVar) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = qsVar.d();
            this.f = IronSourceNetworkBridge.jsonObjectInit(qsVar.f.toString());
            this.d = qsVar.d;
            this.e = qsVar.e;
            this.j = qsVar.j;
            this.a = qsVar.j();
            this.b = qsVar.k();
            this.c = qsVar.c();
            this.h = qsVar.h();
            this.i = qm.M().m();
            b(this.f);
        } catch (Exception e) {
            n9.d().a(e);
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long jOptLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return jOptLong == 0 ? j : jOptLong;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v3 com.ironsource.tp) = (r7v1 com.ironsource.tp), (r7v2 com.ironsource.tp) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.pp a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.pp$b r1 = new com.ironsource.pp$b
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.tp r7 = com.ironsource.tp.b
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.tp r7 = com.ironsource.tp.c
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.pp r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.qs.a(org.json.JSONObject):com.ironsource.pp");
    }

    public static a a(qs qsVar) {
        return qsVar != null ? qsVar.h() : a.NOT_SET;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f, Z), k2), str), "adUnits");
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    private void a() {
        this.f = IronSourceNetworkBridge.jsonObjectInit();
        this.d = BuildConfig.FLAVOR;
        this.e = BuildConfig.FLAVOR;
        this.a = new eq();
        this.b = gq.c();
        this.c = new r8.a().a();
        this.i = qm.M().m();
        b(this.f);
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z2) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            iArr[i] = jSONArrayOptJSONArray.optInt(i);
        }
        return iArr;
    }

    public static iv b(qs qsVar) {
        return (qsVar == null || !qsVar.p()) ? iv.a() : qsVar.c().b().j();
    }

    private String b() {
        return this.j ? k2 : "adUnits";
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private void b(JSONObject jSONObject) {
        this.k = new jc(jSONObject.optJSONObject("experiments"));
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, t0);
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt(u0, 0));
            new dk().b(jSONObjectC.optString(v0));
        }
        return aVar;
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private Context d() {
        return this.g;
    }

    private g7 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(e1, -1);
            String strOptString = jSONObject.optString(f1, BuildConfig.FLAVOR);
            boolean zOptBoolean = jSONObject.optBoolean(h1, false);
            pp ppVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                g7 g7Var = new g7(iOptInt, strOptString, zOptBoolean, ppVarA);
                if (ppVarA == null) {
                    return g7Var;
                }
                this.i.c(this.g, g7Var, IronSource.AD_UNIT.BANNER);
                return g7Var;
            }
        }
        return null;
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : IronSourceNetworkBridge.jsonObjectInit();
    }

    private InterstitialPlacement e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(e1, -1);
            String strOptString = jSONObject.optString(f1, BuildConfig.FLAVOR);
            boolean zOptBoolean = jSONObject.optBoolean(h1, false);
            pp ppVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                InterstitialPlacement interstitialPlacement = new InterstitialPlacement(iOptInt, strOptString, zOptBoolean, ppVarA);
                if (ppVarA == null) {
                    return interstitialPlacement;
                }
                this.i.c(this.g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
                return interstitialPlacement;
            }
        }
        return null;
    }

    private gn f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(e1, -1);
            String strOptString = jSONObject.optString(f1, BuildConfig.FLAVOR);
            boolean zOptBoolean = jSONObject.optBoolean(h1, false);
            pp ppVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                gn gnVar = new gn(iOptInt, strOptString, zOptBoolean, ppVarA);
                if (ppVarA == null) {
                    return gnVar;
                }
                this.i.c(this.g, gnVar, IronSource.AD_UNIT.NATIVE_AD);
                return gnVar;
            }
        }
        return null;
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(e1, -1);
            String strOptString = jSONObject.optString(f1, BuildConfig.FLAVOR);
            boolean zOptBoolean = jSONObject.optBoolean(h1, false);
            String strOptString2 = jSONObject.optString(o1, BuildConfig.FLAVOR);
            int iOptInt2 = jSONObject.optInt(p1, -1);
            pp ppVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt2 > 0) {
                Placement placement = new Placement(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, ppVarA);
                if (ppVarA == null) {
                    return placement;
                }
                this.i.c(this.g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
                return placement;
            }
        }
        return null;
    }

    private uu h(JSONObject jSONObject) {
        uu uuVar = new uu();
        JSONObject jSONObjectC = c(jSONObject, r0);
        if (jSONObjectC != null) {
            uuVar.b(jSONObjectC.optString(s0));
        }
        return uuVar;
    }

    private String l() {
        return this.j ? m2 : e0;
    }

    private boolean m() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f, X);
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f, Z), b());
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray(d1)) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int iOptInt;
        try {
            iOptInt = this.f.optInt(j2, 0);
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x093c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.qs.q():void");
    }

    private void r() {
        try {
            JSONObject jSONObjectC = c(this.f, X);
            JSONArray jSONArrayB = b(jSONObjectC, l());
            JSONArray jSONArrayB2 = b(jSONObjectC, f0);
            JSONArray jSONArrayB3 = b(jSONObjectC, g0);
            JSONArray jSONArrayB4 = b(jSONObjectC, h0);
            this.a = new eq();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i = 0; i < jSONArrayB.length(); i++) {
                    String strOptString = jSONArrayB.optString(i);
                    this.a.d(strOptString);
                    NetworkSettings networkSettingsB = gq.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < jSONArrayB2.length(); i3++) {
                    String strOptString2 = jSONArrayB2.optString(i3);
                    this.a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = gq.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i3);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i4 = 0; i4 < jSONArrayB3.length(); i4++) {
                    String strOptString3 = jSONArrayB3.optString(i4);
                    this.a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = gq.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i4);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i5 = 0; i5 < jSONArrayB4.length(); i5++) {
                    String strOptString4 = jSONArrayB4.optString(i5);
                    this.a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = gq.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void s() {
        JSONObject jSONObject;
        Iterator<String> it;
        qs qsVar;
        NetworkSettings networkSettings;
        qs qsVar2 = this;
        try {
            qsVar2.b = gq.c();
            JSONObject jSONObjectC = qsVar2.c(qsVar2.f, Y);
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean(C1, false);
                    String strOptString = jSONObjectOptJSONObject.optString(B1, "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString(z1, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(A1, null);
                    String strOptString4 = jSONObjectOptJSONObject.optString(c0, next);
                    String strOptString5 = jSONObjectOptJSONObject.optString(q0, strOptString4);
                    JSONObject jSONObjectC2 = qsVar2.c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = qsVar2.c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = qsVar2.c(jSONObjectC2, l());
                    JSONObject jSONObjectC5 = qsVar2.c(jSONObjectC2, f0);
                    JSONObject jSONObjectC6 = qsVar2.c(jSONObjectC2, g0);
                    JSONObject jSONObjectC7 = qsVar2.c(jSONObjectC2, h0);
                    JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectC7, jSONObjectC3);
                    if (qsVar2.b.a(next)) {
                        er.i().a(new wb(80074, (JSONObject) null));
                        NetworkSettings networkSettingsB = qsVar2.b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, jSONObjectMergeJsons));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, jSONObjectMergeJsons2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, jSONObjectMergeJsons3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, jSONObjectMergeJsons4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (qsVar2.b(strOptString4)) {
                            jSONObject = jSONObjectC;
                            NetworkSettings networkSettingsB2 = qsVar2.b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            it = itKeys;
                            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(rewardedVideoSettings2.toString());
                            JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit(interstitialSettings2.toString());
                            try {
                                networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.mergeJsons(jSONObjectJsonObjectInit, jSONObjectMergeJsons), IronSourceUtils.mergeJsons(jSONObjectJsonObjectInit2, jSONObjectMergeJsons2), IronSourceUtils.mergeJsons(IronSourceNetworkBridge.jsonObjectInit(bannerSettings2.toString()), jSONObjectMergeJsons3), IronSourceUtils.mergeJsons(IronSourceNetworkBridge.jsonObjectInit(nativeAdSettings2.toString()), jSONObjectMergeJsons4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                                qsVar = this;
                            } catch (Exception e) {
                                e = e;
                                n9.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            try {
                                jSONObject = jSONObjectC;
                                it = itKeys;
                                qsVar = qsVar2;
                                networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4);
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                            } catch (Exception e3) {
                                e = e3;
                                n9.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        }
                        qsVar.b.a(networkSettings);
                        qsVar2 = qsVar;
                        jSONObjectC = jSONObject;
                        itKeys = it;
                    }
                }
            }
            qsVar2.b.b();
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public r8 c() {
        return this.c;
    }

    public jc e() {
        return this.k;
    }

    public pi f() {
        return new pi(this.d, this.e);
    }

    public List<IronSource.AD_UNIT> g() {
        eq eqVar;
        eq eqVar2;
        eq eqVar3;
        eq eqVar4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (eqVar4 = this.a) != null && !eqVar4.d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (eqVar3 = this.a) != null && !eqVar3.b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.c.c() != null && (eqVar2 = this.a) != null && !eqVar2.a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.c.e() != null && (eqVar = this.a) != null && !eqVar.c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    public a h() {
        return this.h;
    }

    public JSONObject i() {
        return this.f;
    }

    public eq j() {
        return this.a;
    }

    public gq k() {
        return this.b;
    }

    public boolean o() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean p() {
        JSONObject jSONObject = this.f;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.a != null) && this.b != null) && this.c != null) && m();
    }

    public String toString() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(l, this.d);
            jSONObjectJsonObjectInit.put("userId", this.e);
            jSONObjectJsonObjectInit.put(n, this.f);
        } catch (JSONException e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }
}
