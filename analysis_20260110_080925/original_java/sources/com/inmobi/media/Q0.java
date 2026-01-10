package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.media3.common.MimeTypes;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.Q0$;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class Q0 extends ab implements Z1, wc, id, Z {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public String B;
    public final A C;
    public N D;
    public K5 E;
    public Y6 F;
    public final Handler G;
    public final LinkedHashMap H;
    public final S0 I;
    public WatermarkData J;
    public final J0 K;
    public byte a;
    public AdConfig b;
    public WeakReference c;
    public Ec d;
    public A0 e;
    public WeakReference f;
    public ArrayList g;
    public t7 h;
    public HashMap i;
    public f5 j;
    public byte k;
    public Handler l;
    public boolean m;
    public Ya n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public w9 s;
    public Y t;
    public x0 u;
    public yc v;
    public int w;
    public int x;
    public long y;
    public TreeSet z;

    public Q0(Context context, Y y, E0 e0) {
        Boolean boolO;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(y, "adPlacement");
        this.g = new ArrayList();
        this.y = -1L;
        this.z = new TreeSet();
        this.C = A.a;
        this.G = new Handler(Looper.getMainLooper());
        this.H = new LinkedHashMap();
        this.I = new S0(this);
        this.K = new J0(this);
        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
        toString();
        this.c = new WeakReference(context);
        this.t = y;
        WeakReference weakReference = new WeakReference(e0);
        this.f = weakReference;
        String strQ = q();
        x0 x0Var = this.u;
        this.D = new N(weakReference, strQ, (x0Var == null || (boolO = x0Var.o()) == null) ? false : boolO.booleanValue());
        n0();
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void U() {
    }

    public static final /* synthetic */ String e() {
        return "Q0";
    }

    public final int A() {
        return this.x;
    }

    public long A0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "timeSincePodShow ", this));
        }
        if (this.A) {
            return System.currentTimeMillis() - this.y;
        }
        return -1L;
    }

    public final TreeSet<Integer> B() {
        return this.z;
    }

    public final jd B0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "trySetTheLocalVideoDescriptor ", this));
        }
        w8 w8VarM = m();
        if (w8VarM == null) {
            throw new IllegalStateException("No ad");
        }
        if (!(w8VarM instanceof w8)) {
            return null;
        }
        w8 w8Var = w8VarM;
        j jVarB = Db.a().b(w8Var.a);
        if (jVarB == null || !jVarB.a()) {
            throw new IllegalStateException("Asset not available in cache");
        }
        String str = jVarB.c;
        String str2 = w8Var.b;
        String str3 = w8Var.c;
        ArrayList arrayList = w8Var.d;
        ArrayList arrayList2 = w8Var.e;
        AdConfig adConfig = this.b;
        Intrinsics.checkNotNull(adConfig);
        return new jd(str, str2, str3, arrayList, arrayList2, adConfig.getVastVideo());
    }

    public final long C() {
        return this.y;
    }

    public final void C0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.b("Q0", "ad unloaded");
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.d("Q0", "AdUnit " + this + " state - UNLOADED");
        }
        d((byte) 8);
    }

    public final Handler D() {
        return this.l;
    }

    public final String E() {
        String strU;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "markupType getter ", this));
        }
        h hVarM = m();
        return (hVarM == null || (strU = hVarM.u()) == null) ? "unknown" : strU;
    }

    public Integer F() {
        return null;
    }

    public final t7 G() {
        return this.h;
    }

    public final w9 H() {
        return this.s;
    }

    public final Y I() {
        return this.t;
    }

    public abstract byte J();

    public String K() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getPodAdContext ", this));
        }
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final String L() {
        return c(0);
    }

    public final Map<String, String> M() {
        return this.t.f();
    }

    public JSONArray N() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getRenderableAdIndexes ", this));
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Intrinsics.checkNotNull(num);
            jSONArray.put(num.intValue());
        }
        return jSONArray;
    }

    public long O() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getShowTimeStamp ", this));
        }
        if (this.A) {
            return this.y;
        }
        return -1L;
    }

    public final Unit P() {
        E0 e0R = r();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a(e0R, jCurrentTimeMillis)) {
            return Unit.INSTANCE;
        }
        this.r = true;
        if (this.s == null) {
            this.s = new w9(this);
        }
        A a = this.C;
        int iHashCode = hashCode();
        u4 u4Var = new u4(this, jCurrentTimeMillis, this.j);
        a.getClass();
        A.a(iHashCode, u4Var);
        return Unit.INSTANCE;
    }

    public final byte Q() {
        return this.a;
    }

    public final String S() {
        LinkedList linkedListF;
        h hVar;
        String strW;
        x0 x0Var = this.u;
        return (x0Var == null || (linkedListF = x0Var.f()) == null || (hVar = (h) CollectionsKt.firstOrNull(linkedListF)) == null || (strW = hVar.w()) == null) ? BuildConfig.FLAVOR : strW;
    }

    public final byte T() {
        return this.k;
    }

    public final void V() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "handleInterActive ", this));
        }
        A a = this.C;
        int iHashCode = hashCode();
        I0 i0 = new I0(this);
        a.getClass();
        A.a(iHashCode, i0);
    }

    public final boolean W() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "hasAdExpired ", this));
        }
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        AdConfig adConfig = this.b;
        Intrinsics.checkNotNull(adConfig);
        return hVarM.a(adConfig.getCacheConfig(q()).getTimeToLive());
    }

    public final boolean X() {
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.b;
        return adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && Kb.o();
    }

    public final boolean Y() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.a));
        }
        if (!t4.a.a()) {
            g();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (f0()) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("Q0", j6.a("Q0", "TAG", "Some of the dependency libraries for ").append(q()).append(" not found").toString());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.a;
        if (b == 1) {
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.b("Q0", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var4.b("Q0", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public final boolean Z() {
        return this.o;
    }

    public abstract /* synthetic */ void a(int i, Ya ya);

    public void a(Ya ya, boolean z) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.a));
        }
        byte b = this.a;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            m0();
            ya.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            m0();
            b(s2);
            E0 e0R = r();
            if (e0R != null) {
                e0R.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            ya.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            m0();
            b(z ? (short) 2218 : (short) 2217);
            E0 e0R2 = r();
            if (e0R2 != null) {
                e0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        ya.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final boolean a0() {
        return this.m;
    }

    public abstract /* synthetic */ void b();

    public final boolean b0() {
        return this.A;
    }

    public final String c(int i) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getPubContent ", this));
        }
        if (i > 0 && !this.A) {
            return BuildConfig.FLAVOR;
        }
        h hVarA = a(i);
        if (hVarA != null) {
            return hVarA.x();
        }
        return null;
    }

    public void c0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "load  ", this));
        }
        S0 s0 = this.I;
        s0.getClass();
        s0.c = SystemClock.elapsedRealtime();
        a(new K0(this), new L0(this));
    }

    public final void d(byte b) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.d("Q0", j6.a("Q0", "TAG", "from ").append((int) this.a).append(" to ").append((int) b).append(' ').append(this).toString());
        }
        this.a = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0() throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.d0():void");
    }

    public final void e0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "makeUnitActive ", this));
        }
        this.o = false;
    }

    public final void f(E0 e0) {
        Intrinsics.checkNotNullParameter(e0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onLoadSuccess ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.b("Q0", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var3.a("Q0", "callback - onAdLoadSucceeded");
        }
        e0.c(adMetaInfoL);
    }

    public boolean f0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "missingPrerequisitesForAd ", this));
        }
        try {
            Reflection.getOrCreateKotlinClass(RecyclerView.class).getSimpleName();
            Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void g(int i) {
        this.w = i;
    }

    public void g0() {
        S0 s0 = this.I;
        s0.getClass();
        s0.h = SystemClock.elapsedRealtime();
    }

    public final void h(int i) {
        this.x = i;
    }

    public final S h0() {
        String string;
        Integer num;
        Integer num2;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "prepareAdRequest ", this));
        }
        Context contextT = t();
        r9 r9Var = null;
        t9 t9Var = contextT != null ? new t9(contextT, this.j) : null;
        AdConfig adConfig = this.b;
        String url = adConfig != null ? adConfig.getUrl() : null;
        AdConfig adConfig2 = this.b;
        Intrinsics.checkNotNull(adConfig2);
        Kc kc = new Kc(adConfig2.getIncludeIdParams());
        ArrayList arrayListA = Db.a().a();
        if (arrayListA.isEmpty()) {
            string = null;
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(URLEncoder.encode(((j) it.next()).b, HttpRequest.CHARSET_UTF8));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            string = jSONArray.toString();
        }
        Y y = this.t;
        if (t9Var != null) {
            if (t9Var.d) {
                r9Var = new r9(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("n-h-id", t9Var.c)}));
            } else {
                g5 g5Var2 = t9Var.b;
                if (g5Var2 != null) {
                    g5Var2.a("NovatiqDataHandler", "Novatiq disabled. skip");
                }
                r9Var = new r9(MapsKt.emptyMap());
            }
        }
        r9 r9Var2 = r9Var;
        f5 f5Var = this.j;
        AdConfig adConfig3 = this.b;
        S s = new S(url, kc, string, y, r9Var2, f5Var, adConfig3 != null ? adConfig3.getApplyGzipReq() : false);
        s.C = this.t.i();
        s.B = q();
        Intrinsics.checkNotNullParameter("unifiedSdkJson", "<set-?>");
        s.A = "unifiedSdkJson";
        s.D = o();
        Y6 y6 = this.F;
        int iIntValue = 15000;
        ((l9) s).p = (y6 == null || (num2 = y6.d) == null) ? 15000 : num2.intValue();
        Y6 y62 = this.F;
        if (y62 != null && (num = y62.d) != null) {
            iIntValue = num.intValue();
        }
        ((l9) s).q = iIntValue;
        ((l9) s).o = X();
        return s;
    }

    public final void i() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "fireAdServedBeacon ", this));
        }
        x xVarK = k();
        if (xVarK == null) {
            return;
        }
        xVarK.a((byte) 2, null);
    }

    public Ec i0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "provideTimeoutConfigurations ", this));
        }
        Ec ec = this.d;
        Intrinsics.checkNotNull(ec);
        return ec;
    }

    public final AdConfig j() {
        return this.b;
    }

    public abstract void j0();

    public final x k() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "adMarkupContainer getter ", this));
        }
        byte b = this.a;
        String strE = E();
        int iHashCode = strE.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && strE.equals("htmlUrl") && b != 0 && 1 != b && 3 != b && 8 != b) {
                    return w();
                }
            } else if (strE.equals("html") && b != 0 && 1 != b && 3 != b && 8 != b) {
                return w();
            }
        } else if (strE.equals("inmobiJson") && b != 0 && 1 != b && 3 != b && 2 != b) {
            return this.h;
        }
        return null;
    }

    public void k0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "resetContainersForNextAd ", this));
        }
        t7 t7Var = this.h;
        if (t7Var != null) {
            t7Var.b();
        }
        this.h = null;
        int size = this.g.size();
        int i = this.x;
        if (size <= i || this.g.get(i) == null) {
            return;
        }
        a(this.x, false);
    }

    public final AdMetaInfo l() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "adMetaInfo getter ", this));
        }
        h hVarM = m();
        if (hVarM != null) {
            return hVarM.d();
        }
        return null;
    }

    public final u6 l0() {
        String strT;
        Boolean boolO;
        String strW;
        String strP;
        String strS;
        long jL = this.t.l();
        h hVarU = u();
        String str = (hVarU == null || (strS = hVarU.s()) == null) ? BuildConfig.FLAVOR : strS;
        String strValueOf = String.valueOf(this.t.m());
        String strQ = q();
        String strE = E();
        h hVarU2 = u();
        String str2 = (hVarU2 == null || (strP = hVarU2.p()) == null) ? BuildConfig.FLAVOR : strP;
        h hVarU3 = u();
        String str3 = (hVarU3 == null || (strW = hVarU3.w()) == null) ? BuildConfig.FLAVOR : strW;
        x0 x0Var = this.u;
        boolean zBooleanValue = (x0Var == null || (boolO = x0Var.o()) == null) ? false : boolO.booleanValue();
        h hVarU4 = u();
        return new u6(jL, str, strValueOf, strQ, strE, str2, str3, zBooleanValue, (hVarU4 == null || (strT = hVarU4.t()) == null) ? BuildConfig.FLAVOR : strT);
    }

    public final h m() {
        return a(0);
    }

    public final void m0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.d("Q0", "AdUnit " + this + " state - FAILED");
        }
        d((byte) 3);
        b((byte) 1);
    }

    public final String n() {
        x0 x0Var = this.u;
        if (x0Var != null) {
            return x0Var.c();
        }
        return null;
    }

    public final void n0() {
        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
        toString();
        String strB = Kb.b();
        LinkedHashMap linkedHashMap = K2.a;
        Config configA = I2.a("ads", strB, null);
        this.b = configA instanceof AdConfig ? (AdConfig) configA : null;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "timeOutConfiguration getter ", this));
        }
        AdConfig adConfig = this.b;
        Intrinsics.checkNotNull(adConfig);
        this.d = adConfig.getTimeouts();
        d((byte) 0);
        this.e = new A0(this, this, this.t);
        this.i = new HashMap();
        this.k = (byte) -1;
        this.l = new Handler(Looper.getMainLooper());
        this.m = false;
        this.v = new yc(this);
    }

    public HashMap o() {
        return new HashMap();
    }

    public final boolean o0() {
        Unit unit;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "shouldBlockLoadAd ", this));
        }
        h hVarM = m();
        if (hVarM != null && 4 == this.a && !W()) {
            E0 e0R = r();
            if (e0R != null) {
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var2.a("Q0", "ad is ready - load success");
                }
                f(e0R);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                b((short) 2188);
            }
            return true;
        }
        if (hVarM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.b("Q0", "ad no longer available");
            }
            return true;
        }
        if (2 != this.a) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                g5Var4.b("Q0", j6.a("Q0", "TAG", "ad no longer available. state - ").append((int) this.a).toString());
            }
            return true;
        }
        if (!W()) {
            return false;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
        g5 g5Var5 = this.j;
        if (g5Var5 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var5.b("Q0", "ad is expired");
        }
        return true;
    }

    public final A0 p() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "adStore getter ", this));
        }
        if (this.e == null) {
            this.e = new A0(this, this, this.t);
        }
        A0 a0 = this.e;
        Intrinsics.checkNotNull(a0);
        return a0;
    }

    public final boolean p0() {
        AdConfig adConfig;
        return Intrinsics.areEqual(this.t.m(), "AB") && (adConfig = this.b) != null && adConfig.getSkipNetCheckHB();
    }

    public abstract String q();

    public void q0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "signalAvailabilityChange ", this));
        }
    }

    public final E0 r() {
        g5 g5Var;
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            g5Var2.c("Q0", C0.a("Q0", "TAG", "adUnitEventListener getter ", this));
        }
        E0 e0 = (E0) this.f.get();
        if (e0 == null && (g5Var = this.j) != null) {
            g5Var.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return e0;
    }

    public void r0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "signalSuccess ", this));
        }
    }

    public final S0 s() {
        return this.I;
    }

    public final void s0() {
        LinkedList linkedListF;
        h hVar;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "startLoadingHTMLAd ", this));
        }
        Ya ya = null;
        try {
            e(this.w);
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                StringBuilder sb = new StringBuilder("Loading ad with impressionId : ");
                x0 x0Var = this.u;
                g5Var2.a("Q0", sb.append((x0Var == null || (linkedListF = x0Var.f()) == null || (hVar = (h) linkedListF.get(this.w)) == null) ? null : hVar.s()).toString());
            }
            Ya ya2 = (Ya) this.g.get(this.w);
            String strE = E();
            if (Intrinsics.areEqual(strE, "html")) {
                g5 g5Var3 = this.j;
                if (g5Var3 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var3.a("Q0", "loading into weview for " + E());
                }
                if (ya2 != null) {
                    ya2.c(c(this.w));
                }
            } else if (Intrinsics.areEqual(strE, "htmlUrl")) {
                g5 g5Var4 = this.j;
                if (g5Var4 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var4.a("Q0", "loading into weview for " + E());
                }
                if (ya2 != null) {
                    ya2.d(c(this.w));
                }
            }
            a(true, ya2);
            if (ya2 == null || !Intrinsics.areEqual(E(), "htmlUrl")) {
                return;
            }
            k(ya2);
        } catch (Exception e) {
            g5 g5Var5 = this.j;
            if (g5Var5 != null) {
                g5Var5.a("Q0", Ed.a(e, j6.a("Q0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            int i = this.w;
            if (i >= 0 && i < this.g.size()) {
                ya = (Ya) this.g.get(this.w);
            }
            a(ya, (short) 2135);
        }
    }

    public final Context t() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void t0() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdLoadCalled ", this));
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final h u() {
        return this.A ? a(this.w) : m();
    }

    public final void u0() {
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", j6.a("Q0", "TAG", "submitAdLoadSuccessfulEvent ADunit markuptype : ").append(E()).append(' ').append(this).toString());
        }
        HashMap map = new HashMap();
        long j = this.I.c;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        h hVarU = u();
        if (hVarU != null && (strP = hVarU.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        K5 k5 = this.E;
        if (k5 != null) {
            map.put("retryCount", Integer.valueOf(k5.b));
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final A v() {
        return this.C;
    }

    public final void v0() {
        String strP;
        Boolean boolO;
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", E());
        long j = this.I.h;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("metadataBlob", S());
        K5 k5 = this.E;
        if (k5 != null) {
            map.put("retryCount", Integer.valueOf(k5.b));
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        h hVarU = u();
        if (hVarU != null && (strP = hVarU.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        c("ParseSuccess", map);
    }

    public Ya w() {
        if (this.g.size() <= 0 || this.x >= this.g.size()) {
            return null;
        }
        return (Ya) this.g.get(this.x);
    }

    public final void w0() {
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdShowCalled ", this));
        }
        S0 s0 = this.I;
        s0.getClass();
        s0.e = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", E());
        long j = this.I.i;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        h hVarA = this.A ? a(this.x) : m();
        if (hVarA != null && (strP = hVarA.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final Ya x() {
        return this.n;
    }

    public final void x0() {
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdShowSuccess ", this));
        }
        HashMap map = new HashMap();
        long j = this.I.e;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        h hVarA = this.A ? a(this.x) : m();
        if (hVarA != null && (strP = hVarA.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final x0 y() {
        return this.u;
    }

    public final void y0() {
        HashMap map = new HashMap();
        c(map);
        c("AdGetSignalsCalled", map);
    }

    public final int z() {
        return this.w;
    }

    public final void z0() {
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", j6.a("Q0", "TAG", "submitRenderSuccessEvent ADunit markuptype : ").append(E()).append(' ').append(this).toString());
        }
        HashMap map = new HashMap();
        long j = this.I.g;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("markupType", E());
        h hVarA = this.A ? a(this.x) : m();
        if (hVarA != null && (strP = hVarA.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        K5 k5 = this.E;
        if (k5 != null) {
            map.put("retryCount", Integer.valueOf(k5.b));
        }
        map.put("plType", Byte.valueOf(J()));
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("RenderSuccess", map);
    }

    public final void e(x0 x0Var) {
        this.u = x0Var;
    }

    public final void g(E0 e0) {
        Boolean boolO;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "adUnitEventListener setter ", this));
        }
        WeakReference weakReference = new WeakReference(e0);
        this.f = weakReference;
        String strQ = q();
        x0 x0Var = this.u;
        N n = new N(weakReference, strQ, (x0Var == null || (boolO = x0Var.o()) == null) ? false : boolO.booleanValue());
        this.D = n;
        f5 f5Var = this.j;
        if (f5Var != null) {
            Intrinsics.checkNotNullParameter(f5Var, "logger");
            n.f = f5Var;
        }
    }

    public void h(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onRenderViewSignaledAdReady ", this));
        }
        if (this.o || t() == null) {
            b((short) 2186);
            return;
        }
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new Q0$.ExternalSyntheticLambda0(this, ya));
        } else {
            b((short) 2187);
        }
    }

    public void j(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        byte b = this.a;
        if (b == 2) {
            C0();
            b((byte) 1);
            E0 e0R = r();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (e0R != null) {
                e0R.a(this, inMobiAdRequestStatus);
            } else {
                g5 g5Var = this.j;
                if (g5Var != null) {
                    g5Var.a();
                }
            }
            b((short) 2238);
            ya.b();
            return;
        }
        if (b == 4) {
            n(ya);
            ya.b();
            b((byte) 4);
        } else {
            if (b == 6 || b == 7) {
                o(ya);
                return;
            }
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("Q0", j6.a("Q0", "TAG", "onUnloadCalled - invalid state - ").append((int) this.a).toString());
            }
        }
    }

    public void m(Ya ya) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", j6.a("Q0", "TAG", "Render view signaled ad ready, for index ").append(this.g.indexOf(ya)).append(' ').append(this).toString());
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            g5Var3.b();
        }
    }

    public void n(Ya ya) {
        int iL;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "onAdUnloadedAfterLoadSuccess");
        }
        if (!this.A || (iL = l(ya)) <= this.x) {
            C0();
        } else {
            this.z.remove(Integer.valueOf(iL));
        }
    }

    public void o(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "onAdUnloadedAfterShowSuccess");
        }
        ya.a();
        b((byte) 4);
    }

    public final void b(boolean z) {
        this.m = z;
    }

    public final void e(int i) {
        String strT;
        String strU;
        Ya ya;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "initializeHtmlAdContainer ", this));
        }
        Context contextT = t();
        if (contextT == null) {
            return;
        }
        try {
            if (this.g.get(i) == null || ((ya = (Ya) this.g.get(i)) != null && ya.D.get())) {
                h hVarA = a(i);
                bb bbVarA = a(i, hVarA);
                byte bJ = J();
                HashMap map = this.i;
                Set set = map != null ? (Set) map.get(Integer.valueOf(i)) : null;
                h hVarA2 = a(i);
                String strS = hVarA2 != null ? hVarA2.s() : null;
                if (hVarA == null || (strT = hVarA.t()) == null) {
                    strT = "DEFAULT";
                }
                Ya ya2 = new Ya(contextT, bJ, set, strS, false, strT, 0L, bbVarA, this.j, 80);
                String strP = hVarA != null ? hVarA.p() : null;
                g5 g5Var2 = ya2.i;
                if (g5Var2 != null) {
                    String str = Ya.P0;
                    Intrinsics.checkNotNullExpressionValue(str, "TAG");
                    g5Var2.c(str, "creativeType " + ya2 + ' ' + strP);
                }
                ya2.q0 = strP;
                if (hVarA == null || (strU = hVarA.u()) == null) {
                    strU = "html";
                }
                ya2.setMarkupTypeAdUnit(strU);
                this.g.set(i, ya2);
                if (Intrinsics.areEqual(this.t.b(), "banner") || Intrinsics.areEqual(this.t.b(), MimeTypes.BASE_TYPE_AUDIO)) {
                    ya2.setAdSize(this.t.a());
                }
                ya2.setAdType(this.t.b());
                ya2.setImmersiveMode(b(hVarA));
                AdConfig adConfig = this.b;
                Intrinsics.checkNotNull(adConfig);
                ya2.a(this, adConfig);
                ya2.setAdPodHandler(this);
                ya2.setPlacementId(this.t.l());
                ya2.setAllowAutoRedirection(b(i));
                ya2.setContentURL(this.t.e());
                AdMetaInfo adMetaInfoL = l();
                if (adMetaInfoL != null) {
                    ya2.setCreativeId(adMetaInfoL.getCreativeID());
                }
                if (this.t.p()) {
                    ya2.e();
                }
                ya2.setTelemetryManagerMap(this.H);
                g5 g5Var3 = ya2.i;
                if (g5Var3 != null) {
                    String str2 = Ya.P0;
                    g5Var3.c(str2, Wa.a(ya2, str2, "TAG", "initContextualData "));
                }
                ya2.I0 = new Z2(hVarA, ya2.L);
                a(hVarA, ya2);
                WatermarkData watermarkData = this.J;
                if (watermarkData != null) {
                    ya2.setWatermark(watermarkData);
                }
            }
        } catch (Exception e) {
            a((Ya) this.g.get(this.w), (short) 2136);
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var4.a("Q0", "Exception while initializing WebView", e);
            }
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }

    public final boolean b(h hVar) {
        q0 q0VarQ;
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.b;
        boolean z = false;
        boolean enableImmersive = (adConfig == null || (rendering = adConfig.getRendering()) == null) ? false : rendering.getEnableImmersive();
        boolean z2 = N3.i;
        boolean zA = (hVar == null || (q0VarQ = hVar.q()) == null) ? false : q0VarQ.a(false);
        if (enableImmersive && z2 && zA) {
            z = true;
        }
        if (!z) {
            b(enableImmersive, z2, zA);
        }
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.a("Q0", "Immersive support - config, device, adResponse - (" + enableImmersive + ' ' + z2 + ' ' + zA + ')');
        }
        return z;
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        Pair<String, Short> pairA = a(z, z2, z3);
        String str = (String) pairA.component1();
        short sShortValue = ((Number) pairA.component2()).shortValue();
        HashMap map = new HashMap();
        map.put(AdOperationMetric.REASON, str);
        map.put("errorCode", Short.valueOf(sShortValue));
        c("ImmersiveNotSupported", map);
    }

    public final boolean b(int i) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        h hVarA = a(i);
        return hVarA != null && hVarA.i();
    }

    public final int b(String str) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "parseViewabilityResponseValue ", this));
        }
        if (StringsKt.startsWith$default(str, "track_", false, 2, (Object) null)) {
            str = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final void a(Context context, Q0 q0) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        H9 h9 = G9.a;
        AdConfig adConfig = q0.b;
        h9.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            } else {
                h9.a(adConfig);
            }
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }

    public static final /* synthetic */ void a(Q0 q0, h hVar, Ya ya) {
        q0.getClass();
        a(hVar, ya);
    }

    public final void a(AdConfig adConfig) {
        this.b = adConfig;
    }

    public final void a(Handler handler) {
        this.l = handler;
    }

    public final void a(w9 w9Var) {
        this.s = w9Var;
    }

    public final void a(long j) {
        this.y = j;
    }

    public final void a(TreeSet<Integer> treeSet) {
        Intrinsics.checkNotNullParameter(treeSet, "<set-?>");
        this.z = treeSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r13, com.inmobi.media.Y r14, com.inmobi.media.E0 r15) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.a(android.content.Context, com.inmobi.media.Y, com.inmobi.media.E0):void");
    }

    public final Set d(int i) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getViewabilityTrackers ", this));
        }
        HashMap map = this.i;
        if (map != null) {
            return (Set) map.get(Integer.valueOf(i));
        }
        return null;
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "setContext ", this));
        }
        this.c = new WeakReference(context);
    }

    public final void c(boolean z) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "setIsAssetReady ", this));
        }
        this.p = z;
    }

    public void g() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "clear ", this));
        }
        if (this.o) {
            return;
        }
        this.o = true;
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            g5Var2.a("Q0", C0.a("Q0", "TAG", "clearAdPods ", this));
        }
        if (this.A) {
            h();
            this.g.clear();
            this.w = 0;
            this.x = 0;
            this.z.clear();
        }
        K5 k5 = this.E;
        if (k5 != null) {
            k5.b = 0;
        }
        HashMap map = this.i;
        if (map != null) {
            map.clear();
        }
        k0();
        d((byte) 0);
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var3.d("Q0", "AdUnit " + this + " state - CREATED");
        }
        A a = this.C;
        int iHashCode = hashCode();
        a.getClass();
        SparseArray sparseArray = A.b;
        sparseArray.remove(iHashCode);
        Intrinsics.checkNotNullExpressionValue("A", "TAG");
        sparseArray.size();
        this.q = false;
        this.n = null;
        this.m = false;
        this.p = false;
        this.r = false;
        this.u = null;
        this.A = false;
    }

    public final void k(Ya ya) {
        List listC;
        int iIndexOf = this.g.indexOf(ya);
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.a("Q0", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + ' ' + this);
        }
        h hVarA = a(iIndexOf);
        if (hVarA == null || (listC = hVarA.c("load_ad_token_url")) == null) {
            return;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            u2.a.a((String) it.next(), true, this.j);
        }
    }

    public final void d(E0 e0) {
        Intrinsics.checkNotNullParameter(e0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAdDisplayed ", this));
        }
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.b("Q0", "callback onAdDisplayed failed. ad meta info is null");
            }
            a(e0, (short) 85);
            return;
        }
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var3.a("Q0", "callback - onAdDisplayed");
        }
        e0.a(adMetaInfoL);
    }

    public final void a(f5 f5Var) {
        Intrinsics.checkNotNullParameter(f5Var, "logger");
        this.j = f5Var;
        A0 a0P = p();
        a0P.getClass();
        Intrinsics.checkNotNullParameter(f5Var, "logger");
        a0P.f = f5Var;
        N n = this.D;
        n.getClass();
        Intrinsics.checkNotNullParameter(f5Var, "logger");
        n.f = f5Var;
    }

    public int l(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getCurrentRenderingPodAdIndex ", this));
        }
        if (!this.A) {
            return -1;
        }
        int iIndexOf = this.g.indexOf(ya);
        g5 g5Var2 = this.j;
        if (g5Var2 == null) {
            return iIndexOf;
        }
        g5Var2.c("Q0", x8.a("Q0", "TAG", "getCurrentRenderingPodAdIndex ", iIndexOf));
        return iIndexOf;
    }

    public void f(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", j6.a("Q0", "TAG", "RenderView completed loading ad content, for index ").append(this.g.indexOf(ya)).append(' ').append(this).toString());
        }
    }

    public final bb a(int i, h hVar) {
        String strP;
        String strO;
        Boolean boolO;
        String strW;
        LinkedHashMap linkedHashMap = K2.a;
        eb ebVar = new eb(V4.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null).getMaxTemplateEvents());
        Y y = this.t;
        String strE = E();
        String str = (hVar == null || (strW = hVar.w()) == null) ? BuildConfig.FLAVOR : strW;
        K5 k5 = this.E;
        int i2 = k5 != null ? k5.b : 0;
        h hVarU = u();
        if (hVarU == null || (strP = hVarU.p()) == null) {
            strP = BuildConfig.FLAVOR;
        }
        h hVarU2 = u();
        if (hVarU2 == null || (strO = hVarU2.o()) == null) {
            strO = BuildConfig.FLAVOR;
        }
        x0 x0Var = this.u;
        return new bb(y, strE, str, i2, strP, strO, (x0Var == null || (boolO = x0Var.o()) == null) ? false : boolO.booleanValue(), i, this.I.j, ebVar);
    }

    public final void c(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "adSet");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAdFetchSuccessful ", this));
        }
        if (this.a == 1) {
            this.u = x0Var;
        }
        if (!this.o && t() != null) {
            a(x0Var);
            return;
        }
        b((short) 2185);
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.b("Q0", "adUnit is destroyed");
        }
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "requestStatus");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.b("Q0", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.a == 1 && z) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("Q0", x8.a("Q0", "TAG", "load failed - ", s));
            }
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.d("Q0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.a(this, inMobiAdRequestStatus);
        } else {
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                g5Var4.a();
            }
        }
        if (s != 0) {
            b(s);
        }
    }

    public final Pair<String, Short> a(boolean z, boolean z2, boolean z3) {
        Short sh;
        StringBuilder sb = new StringBuilder("Immersive not supported on");
        BitSet bitSet = new BitSet(3);
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(" config");
            bitSet.set(0);
        }
        if (!z2) {
            arrayList.add(" device");
            bitSet.set(1);
        }
        if (!z3) {
            arrayList.add(" ad");
            bitSet.set(2);
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Intrinsics.checkNotNullParameter(bitSet, "bitSet");
        if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
            sh = (short) 2202;
        } else if (bitSet.get(0) && bitSet.get(1)) {
            sh = (short) 2200;
        } else if (bitSet.get(0) && bitSet.get(2)) {
            sh = (short) 2199;
        } else if (bitSet.get(1) && bitSet.get(2)) {
            sh = (short) 2201;
        } else if (bitSet.get(0)) {
            sh = (short) 2196;
        } else if (bitSet.get(1)) {
            sh = (short) 2197;
        } else {
            sh = bitSet.get(2) ? (short) 2198 : null;
        }
        short sShortValue = sh != null ? sh.shortValue() : (short) -1;
        if (sShortValue == -1) {
            return new Pair<>("Invalid Reason", (short) -1);
        }
        return new Pair<>(sb.toString(), Short.valueOf(sShortValue));
    }

    public final void d(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "adSet");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAuctionNotClosed ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            g5Var2.c("Q0", C0.a("Q0", "TAG", "handleAuctionNotClosed ", this));
        }
        if (this.a == 1) {
            this.u = x0Var;
            this.A = x0Var != null ? x0Var.n() : false;
            E0 e0R = r();
            if (e0R != null) {
                e0R.a(this.t, x0Var);
            }
        }
    }

    public static void a(h hVar, Ya ya) {
        AdQualityControl adQualityControlE;
        n0 adQualityManager;
        if (hVar == null || (adQualityControlE = hVar.e()) == null || ya == null || (adQualityManager = ya.getAdQualityManager()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(adQualityControlE, "adQualityControl");
        adQualityManager.a("adQuality session setup");
        if (!adQualityManager.a.getEnabled()) {
            adQualityManager.a("config kill switch - false. ad quality will skip");
            return;
        }
        if (adQualityManager.c.get()) {
            adQualityManager.a("session already started. skip");
            return;
        }
        adQualityManager.a("verifying control flags");
        String beacon = adQualityControlE.getBeacon();
        if (beacon != null && beacon.length() == 0) {
            adQualityManager.a("no beacon received. aborting...");
            ScheduledExecutorService scheduledExecutorService = e0.a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                try {
                    try {
                        scheduledExecutorService.shutdownNow();
                    } catch (Exception e) {
                        Intrinsics.checkNotNullParameter("AdQualityComponent", "tag");
                        Intrinsics.checkNotNullParameter("shutdown fail", SettingsJsonConstants.PROMPT_MESSAGE_KEY);
                        Log.e("AdQualityComponent", "shutdown fail", e);
                        Thread.currentThread().interrupt();
                        adQualityManager.a("session end - cleanup");
                        adQualityManager.g = null;
                        adQualityManager.f.clear();
                        adQualityManager.c.set(false);
                        adQualityManager.d.set(false);
                        adQualityManager.a("ad quality session is already in progress. skipping...");
                        return;
                    }
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    Thread.currentThread().interrupt();
                    adQualityManager.a("session end - cleanup");
                    adQualityManager.g = null;
                    adQualityManager.f.clear();
                    adQualityManager.c.set(false);
                    adQualityManager.d.set(false);
                    adQualityManager.a("ad quality session is already in progress. skipping...");
                    return;
                }
            }
            adQualityManager.a("session end - cleanup");
            adQualityManager.g = null;
            adQualityManager.f.clear();
            adQualityManager.c.set(false);
            adQualityManager.d.set(false);
            adQualityManager.a("ad quality session is already in progress. skipping...");
            return;
        }
        adQualityManager.g = adQualityControlE;
    }

    public void i(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", j6.a("Q0", "TAG", "RenderView visible, for index ").append(this.g.indexOf(ya)).append(' ').append(this).toString());
        }
    }

    public final void e(E0 e0) {
        Intrinsics.checkNotNullParameter(e0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onFetchSuccess ", this));
        }
        v0();
        AdMetaInfo adMetaInfoL = l();
        if (adMetaInfoL == null) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.b("Q0", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        g5 g5Var3 = this.j;
        if (g5Var3 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var3.a("Q0", "callback - onAdFetchSuccess");
        }
        e0.b(adMetaInfoL);
    }

    public void c(String str) {
        Intrinsics.checkNotNullParameter(str, "monetizationContext");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "setMonetizationContext ", this));
        }
        this.t.b(str);
    }

    public final h a(int i) {
        IntRange intRangeEmptyList;
        LinkedList linkedListF;
        LinkedList linkedListF2;
        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
        toString();
        x0 x0Var = this.u;
        if (x0Var == null || (linkedListF2 = x0Var.f()) == null || (intRangeEmptyList = CollectionsKt.getIndices(linkedListF2)) == null) {
            intRangeEmptyList = CollectionsKt.emptyList();
        }
        if (CollectionsKt.contains(intRangeEmptyList, Integer.valueOf(i))) {
            x0 x0Var2 = this.u;
            if (x0Var2 != null && (linkedListF = x0Var2.f()) != null) {
                return (h) linkedListF.get(i);
            }
        } else {
            x0 x0Var3 = this.u;
            if (x0Var3 != null) {
                return x0Var3.p();
            }
        }
        return null;
    }

    public final void a(E0 e0, short s) {
        Intrinsics.checkNotNullParameter(e0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onAdShowFailed ", this));
        }
        c(s);
        e0.d();
    }

    public final void h() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "destroyAllContainer ", this));
        }
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            a(this, i, false, 2, null);
        }
    }

    public final void b(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "adSet");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "loadResponse ", this));
        }
        c(x0Var);
    }

    public void g(Ya ya) {
        Handler handler;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onRenderViewSignaledAdFailed ", this));
        }
        if (this.o || t() == null || (handler = this.l) == null) {
            return;
        }
        handler.post(new Q0$.ExternalSyntheticLambda3(this, ya));
    }

    public void a(int i, Ya ya, Context context) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "Show pod ad with index : " + i + " from creative: " + this.g.indexOf(ya) + ' ' + this);
        }
        if (i >= 0) {
            this.x = i;
        } else {
            this.x++;
        }
    }

    public void d(String str) {
        Intrinsics.checkNotNullParameter(str, "podAdContext");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "setPodAdContext ", this));
        }
        if (this.A) {
            this.B = str;
        }
    }

    public void a(Ya ya, Context context) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "closeCurrentPodAd ", this));
        }
    }

    public final boolean e(byte b) {
        int iY;
        Integer num;
        long j;
        Integer num2;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "startTimer ", this));
        }
        if (b == 0) {
            Y6 y6 = this.F;
            if (y6 != null && (num2 = y6.d) != null) {
                iY = num2.intValue();
                j = iY;
            }
            j = 15000;
        } else if (b == 1) {
            Y6 y62 = this.F;
            if (y62 != null) {
                iY = y62.c;
                j = iY;
            }
            j = 15000;
        } else {
            if (b == 2) {
                Y6 y63 = this.F;
                if (y63 != null && (num = y63.e) != null) {
                    iY = num.intValue();
                }
                j = 15000;
            } else if (b == 4) {
                Ec ec = this.d;
                Intrinsics.checkNotNull(ec);
                iY = ec.Y();
            } else {
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var2.b("Q0", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = iY;
        }
        yc ycVar = this.v;
        if (ycVar == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue("yc", "TAG");
        if (ycVar.b.containsKey(Byte.valueOf(b))) {
            Intrinsics.checkNotNullExpressionValue("yc", "TAG");
            Timer timer = (Timer) ycVar.b.get(Byte.valueOf(b));
            if (timer != null) {
                timer.cancel();
                ycVar.b.remove(Byte.valueOf(b));
            }
        }
        try {
            Timer timer2 = new Timer("yc");
            ycVar.b.put(Byte.valueOf(b), timer2);
            timer2.schedule((TimerTask) new xc(ycVar, b), j);
            return true;
        } catch (InternalError e) {
            Intrinsics.checkNotNullExpressionValue("yc", "TAG");
            e.toString();
            return false;
        } catch (OutOfMemoryError unused) {
            Intrinsics.checkNotNullExpressionValue("yc", "TAG");
            I6.a((byte) 1, "yc", "Could not execute timer due to OutOfMemory.");
            ycVar.a.c(b);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.inmobi.media.h r27, int r28, boolean r29) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.a(com.inmobi.media.h, int, boolean):boolean");
    }

    public final void f() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "checkInteractiveAndSignal ", this));
        }
        if (this.m && this.p && this.q) {
            r0();
        }
    }

    public final HashMap a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "parseInMobiViewabilityParams ", this));
        }
        try {
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i++;
            }
            if (jSONObject == null) {
                return null;
            }
            HashMap map = new HashMap();
            String strOptString = jSONObject.optString("time");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            int iB = b(strOptString);
            if (iB != -1) {
                map.put("time", Integer.valueOf(iB));
            }
            String strOptString2 = jSONObject.optString("view");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            int iB2 = b(strOptString2);
            if (iB2 != -1) {
                map.put("view", Integer.valueOf(iB2));
            }
            String strOptString3 = jSONObject.optString("pixel");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            int iB3 = b(strOptString3);
            if (iB3 != -1) {
                map.put("pixel", Integer.valueOf(iB3));
            }
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt != -1) {
                map.put("type", Integer.valueOf(iOptInt));
                if (iOptInt == 2) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("frame");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("frame");
                        Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray2, "optJSONArray(...)");
                        map.put("frame", jSONArrayOptJSONArray2);
                    } else {
                        map.put("frame", new JSONArray("[0,0,0,0]"));
                    }
                }
            }
            return map;
        } catch (JSONException e) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("Q0", D0.a(e, j6.a("Q0", "TAG", "Exception while parsing MoatParams from response : ")));
            }
            w5 w5Var = w5.a;
            d2 d2Var = new d2(e);
            Intrinsics.checkNotNullParameter(d2Var, "event");
            w5.d.a(d2Var);
            return null;
        }
    }

    public static final void c(Q0 q0) {
        String str;
        g5 g5Var = q0.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "startAdFetchWorker ", q0));
        }
        S0 s0 = q0.I;
        s0.getClass();
        s0.d = SystemClock.elapsedRealtime();
        g5 g5Var2 = q0.j;
        if (g5Var2 != null) {
            g5Var2.a("Q0", C0.a("Q0", "TAG", "doAdLoadWork ", q0));
        }
        int i = 0;
        try {
            q0.d((byte) 1);
            g5 g5Var3 = q0.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.d("Q0", "AdUnit " + q0 + " state - LOADING");
            }
            g5 g5Var4 = q0.j;
            if (g5Var4 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var4.c("Q0", "printPublisherTestId " + q0);
            }
            Jc.a.d();
        } catch (Exception e) {
            g5 g5Var5 = q0.j;
            if (g5Var5 != null) {
                g5Var5.b("Q0", Ed.a(e, j6.a("Q0", "TAG", "Load failed with unexpected error: ")));
            }
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
            q0.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
        if (q0.e((byte) 0)) {
            A a = q0.C;
            int iHashCode = q0.hashCode();
            L l = new L(q0, q0.j);
            a.getClass();
            A.a(iHashCode, l);
        } else {
            i = -2;
        }
        if (i == -2) {
            str = "Loading an ad resulted in an unexpected error";
        } else if (i == -1) {
            str = "Ad request skipped as monetization is disabled";
        } else if (i == 0) {
            str = "Fresh ad requested";
        } else if (i != 1) {
            str = i != 2 ? "Unknown return value (" + i + ") from #doAdLoadWork()" : "Already Loading";
        } else {
            str = "Returning pre-cached ad";
        }
        g5 g5Var6 = q0.j;
        if (g5Var6 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var6.c("Q0", str);
        }
    }

    public void a(Y y, boolean z, short s) {
        Intrinsics.checkNotNullParameter(y, "placement");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onAssetAvailabilityChanged ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        if (s != 0) {
            b(s);
        }
        a(y, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short c(com.inmobi.media.E0 r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.c(com.inmobi.media.E0):short");
    }

    public void b(E0 e0) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "handleAdScreenDisplayed ", this));
        }
    }

    public void a(Y y, boolean z) {
        Intrinsics.checkNotNullParameter(y, "placement");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "handleAssetAvailabilityChanged ", this));
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "Asset availability changed (" + z + ") for placement ID (" + y + ')');
        }
    }

    public static final void d(Q0 q0) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        if (6 == q0.a) {
            q0.a(true, (short) 2158);
        }
    }

    public final void d(boolean z) {
        this.A = z;
    }

    public void a(x0 x0Var) {
        LinkedList<h> linkedListF;
        LinkedList linkedListF2;
        Intrinsics.checkNotNullParameter(x0Var, "adSet");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "handleAdFetchSuccessful ", this));
        }
        if (this.a == 1) {
            this.u = x0Var;
            int size = 0;
            this.A = x0Var != null ? x0Var.n() : false;
            x0 x0Var2 = this.u;
            if (x0Var2 != null && (linkedListF2 = x0Var2.f()) != null) {
                size = linkedListF2.size();
            }
            this.g = new ArrayList(size);
            x0 x0Var3 = this.u;
            if (x0Var3 != null && (linkedListF = x0Var3.f()) != null) {
                for (h hVar : linkedListF) {
                    this.g.add(null);
                }
            }
            h hVarP = x0Var.p();
            if (hVarP == null) {
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var2.b("Q0", "top ad is null. failed.");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2119);
                return;
            }
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.a("Q0", "starting executor. parsing ad response");
            }
            A a = this.C;
            int iHashCode = hashCode();
            N9 n9 = new N9(this, hVarP, x0Var, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.j);
            a.getClass();
            A.a(iHashCode, n9);
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            g5Var4.b("Q0", j6.a("Q0", "TAG", "incorrect state - ").append((int) this.a).toString());
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
    }

    public boolean a(Ya ya) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var == null) {
            return false;
        }
        g5Var.c("Q0", C0.a("Q0", "TAG", "hasNextAdInAdPod ", this));
        return false;
    }

    public static final void b(Q0 q0, Ya ya) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(ya, "$renderView");
        q0.a(ya, (short) 2137);
    }

    public void b(Ya ya, short s) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onRenderViewError ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        try {
            Handler handler = this.l;
            if (handler != null) {
                handler.post(new Q0$.ExternalSyntheticLambda6(this, ya, s));
            }
        } catch (Exception e) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.b("Q0", Ed.a(e, j6.a("Q0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
        }
    }

    public final void f(int i) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "resetCurrentRenderingIndex ", this));
        }
        this.x = i;
    }

    public static final void c(Q0 q0, Ya ya) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(ya, "$renderView");
        q0.m(ya);
    }

    public void c() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAdScreenDisplayFailed ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.b("Q0", "Ad failed to display");
        }
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new Q0$.ExternalSyntheticLambda4(this));
        }
    }

    public void a(byte b) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onTimeOut ", this));
        }
        if (b == 0) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.a("Q0", j6.a("Q0", "TAG", "AdRequestTimeOut by timer, Adstate=").append((int) this.a).toString());
            }
            if (this.a != 3) {
                a(this.t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            if (b == 4) {
                g5 g5Var3 = this.j;
                if (g5Var3 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var3.a("Q0", "Show RequestTimeOut by show timer");
                }
                E0 e0R = r();
                if (e0R != null) {
                    e0R.g();
                    return;
                }
                return;
            }
            if (b == 3) {
                g5 g5Var4 = this.j;
                if (g5Var4 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var4.a("Q0", "Bitmap TimeOut not handled here");
                    return;
                }
                return;
            }
            g5 g5Var5 = this.j;
            if (g5Var5 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var5.a("Q0", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        g5 g5Var6 = this.j;
        if (g5Var6 != null) {
            g5Var6.a("Q0", j6.a("Q0", "TAG", "Internal LoadTimeOut by timer, Adstate=").append((int) this.a).toString());
        }
        if (this.a != 3) {
            this.G.removeCallbacksAndMessages(null);
            g5 g5Var7 = this.j;
            if (g5Var7 != null) {
                g5Var7.a("Q0", j6.a("Q0", "TAG", "adUnitEventListener=").append(r()).append(", Adstate=").append((int) this.a).toString());
            }
            byte b2 = this.a;
            if (2 == b2) {
                m0();
                boolean z = p9.a;
                b(p9.a(false) == null ? (short) 2139 : (short) 2203);
                E0 e0R2 = r();
                if (e0R2 != null) {
                    e0R2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b2) {
                m0();
                b((short) 2138);
                E0 e0R3 = r();
                if (e0R3 != null) {
                    e0R3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void c(HashMap map) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "constructTelemetryPayload ", this));
        }
        map.put("adType", q());
        map.put("networkType", E3.q());
        map.put("plId", Long.valueOf(this.t.l()));
        String strM = this.t.m();
        if (strM != null) {
            map.put("plType", strM);
        }
    }

    public final void c(short s) {
        h hVarM;
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdShowFailed ", this));
        }
        HashMap map = new HashMap();
        long j = this.I.e;
        ScheduledExecutorService scheduledExecutorService = Xc.a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map.put("errorCode", Short.valueOf(s));
        map.put("markupType", E());
        if (this.A) {
            hVarM = a(this.x);
        } else {
            hVarM = m();
        }
        if (hVarM != null && (strP = hVarM.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("AdShowFailed", map);
    }

    public void b(HashMap<Object, Object> map) {
        Intrinsics.checkNotNullParameter(map, "rewards");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAdRewardActionCompleted ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "Ad reward action completed. Params:" + map);
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.b(map);
        }
    }

    public void a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onDidParseAfterFetch ", this));
        }
        if (z) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.a("Q0", "Ad fetch successful");
            }
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.d("Q0", "AdUnit " + this + " state - AVAILABLE");
            }
            d((byte) 2);
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var4.b("Q0", "onComplete parse success");
        }
        b(inMobiAdRequestStatus, true, (short) 0);
    }

    public final void a(Y y, InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        Intrinsics.checkNotNullParameter(y, "placement");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "requestStatus");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onAdFetchFailed ", this));
        }
        if (!this.o && t() != null && this.a != 3) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                g5Var2.c("Q0", C0.a("Q0", "TAG", "handleMarkupFetchFailure ", this));
            }
            try {
                if (Intrinsics.areEqual(this.t, y) && this.a == 1) {
                    g5 g5Var3 = this.j;
                    if (g5Var3 != null) {
                        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                        g5Var3.b("Q0", "Failed to fetch ad for placement id: " + y + ", reason - " + inMobiAdRequestStatus.getMessage());
                    }
                    String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                    g5 g5Var4 = this.j;
                    if (g5Var4 != null) {
                        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                        g5Var4.b("Q0", str);
                    }
                    g5 g5Var5 = this.j;
                    if (g5Var5 != null) {
                        Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                        g5Var5.d("Q0", "AdUnit " + this + " state - FAILED");
                    }
                    d((byte) 3);
                    b((byte) 1);
                    if (s != 0) {
                        a(s);
                    }
                    E0 e0R = r();
                    if (e0R != null) {
                        e0R.a(inMobiAdRequestStatus);
                        return;
                    }
                    g5 g5Var6 = this.j;
                    if (g5Var6 != null) {
                        g5Var6.a();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                g5 g5Var7 = this.j;
                if (g5Var7 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var7.a("Q0", "onAdFetchFailed with error: ", e);
                }
                w5 w5Var = w5.a;
                w5.d.a(c5.a(e, "event"));
                return;
            }
        }
        g5 g5Var8 = this.j;
        if (g5Var8 != null) {
            g5Var8.b("Q0", j6.a("Q0", "TAG", "callback ignored - isDestroyed - ").append(this.o).append(" context - ").append(t()).append(" state- ").append((int) this.a).toString());
        }
    }

    public final void c(Map map) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "updateIdsInTelemetryPayload ", this));
        }
        h hVarM = m();
        if (hVarM != null) {
            map.put("creativeId", "\"" + hVarM.o() + '\"');
            map.put("impressionId", "\"" + hVarM.s() + '\"');
        }
    }

    public final void b(short s) {
        long j;
        long jElapsedRealtime;
        Boolean boolO;
        String strP;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdLoadFailedEvent ", this));
        }
        HashMap map = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.I.d;
            ScheduledExecutorService scheduledExecutorService = Xc.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.I.g;
            ScheduledExecutorService scheduledExecutorService2 = Xc.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = this.I.c;
            ScheduledExecutorService scheduledExecutorService3 = Xc.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j));
        map.put("errorCode", Short.valueOf(s));
        map.put("markupType", E());
        h hVarU = u();
        if (hVarU != null && (strP = hVarU.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        K5 k5 = this.E;
        if (k5 != null) {
            map.put("retryCount", Integer.valueOf(k5.b));
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        if (S().length() > 0) {
            map.put("metadataBlob", S());
        }
        c(map);
        c((Map) map);
        c("AdLoadFailed", map);
    }

    public final void a(boolean z, short s) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.b("Q0", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        if (z) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.d("Q0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 4);
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.d();
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "requestStatus");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.b("Q0", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.a == 3 && z) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.d("Q0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.a(this, inMobiAdRequestStatus);
        }
        if (s != 0) {
            a(s);
        }
    }

    public final void a(Map<String, String> map) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.c("Q0", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.t.a(map);
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "responseJson");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAuctionClosed ", this));
        }
        new Handler(Looper.getMainLooper()).post(new Q0$.ExternalSyntheticLambda5(this, jSONObject));
    }

    public final void b(Map<String, Object> map) {
        Boolean boolO;
        String strP;
        Intrinsics.checkNotNullParameter(map, "payload");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitServerError ", this));
        }
        if (this.e == null) {
            return;
        }
        if (map.get(AdOperationMetric.REASON) == null) {
            map.put(AdOperationMetric.REASON, BuildConfig.FLAVOR);
        }
        h hVarU = u();
        if (hVarU != null && (strP = hVarU.p()) != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        K5 k5 = this.E;
        if (k5 != null) {
            map.put("retryCount", Integer.valueOf(k5.b));
        }
        x0 x0Var = this.u;
        if (x0Var != null && (boolO = x0Var.o()) != null) {
            map.put("isRewarded", boolO);
        }
        c(map);
        A0 a0 = this.e;
        Intrinsics.checkNotNull(a0);
        a0.a(map);
    }

    public final void c(String str, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "eventType");
        Intrinsics.checkNotNullParameter(map, "kv");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitTelemetryEvent ", this));
        }
        ic icVar = ic.a;
        ic.b(str, map, mc.a);
    }

    public static final void a(Q0 q0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(jSONObject, "$responseJson");
        A a = q0.C;
        int iHashCode = q0.hashCode();
        w1 w1Var = new w1(q0, jSONObject, q0.j);
        a.getClass();
        A.a(iHashCode, w1Var);
    }

    public final void a(Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(function0, "onSuccess");
        Intrinsics.checkNotNullParameter(function1, "onMaxRetryReached");
        g5 g5Var = this.j;
        M9 o6 = null;
        if (g5Var != null) {
            StringBuilder sbA = j6.a("Q0", "TAG", "loadWithRetry ");
            K5 k5 = this.E;
            g5Var.c("Q0", sbA.append(k5 != null ? Integer.valueOf(k5.b) : null).toString());
        }
        K5 k52 = this.E;
        if (k52 != null) {
            boolean z = p9.a;
            c4 c4VarA = p9.a(false);
            if (c4VarA == null) {
                o6 = M9.a;
            } else {
                int i = k52.b + 1;
                k52.b = i;
                if (i >= k52.a.b) {
                    o6 = new O6(c4VarA);
                } else {
                    o6 = ya.a;
                }
            }
        }
        if (o6 instanceof O6) {
            function1.invoke(((O6) o6).a);
            return;
        }
        if (o6 instanceof M9) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.c("Q0", "load with retry success");
            }
            function0.invoke();
            return;
        }
        if (!(o6 instanceof ya)) {
            if (o6 == null) {
                g5 g5Var3 = this.j;
                if (g5Var3 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var3.c("Q0", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                function0.invoke();
                return;
            }
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var4.c("Q0", "load failed, retrying");
        }
        this.G.postDelayed(new Q0$.ExternalSyntheticLambda1(this, function0, function1), this.F != null ? r7.a : 1000L);
    }

    public static final void a(Q0 q0, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(function0, "$onSuccess");
        Intrinsics.checkNotNullParameter(function1, "$onMaxRetryReached");
        g5 g5Var = q0.j;
        if (g5Var != null) {
            StringBuilder sbA = j6.a("Q0", "TAG", "Loading from retry Handler ");
            K5 k5 = q0.E;
            g5Var.c("Q0", sbA.append(k5 != null ? Integer.valueOf(k5.b) : null).toString());
        }
        q0.a(function0, function1);
    }

    public final void b(long j) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdGetSignalsSucceeded ", this));
        }
        this.r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        map.put("networkType", E3.q());
        c("AdGetSignalsSucceeded", map);
    }

    public void c(byte b) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.b("Q0", C0.a("Q0", "TAG", "onOOM ", this));
        }
        if (b == 0) {
            a(this.t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2110);
            return;
        }
        if (b == 2 || b == 1) {
            byte b2 = this.a;
            if (b2 == 0 || 1 == b2 || 2 == b2) {
                g5 g5Var2 = this.j;
                if (g5Var2 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var2.a("Q0", "onOOM INTERNAL_LOAD_TIME_OUT or PRE_LOAD_TIME_OUT");
                }
                this.G.removeCallbacksAndMessages(null);
                m0();
                b((short) 2112);
                E0 e0R = r();
                if (e0R != null) {
                    e0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
                    return;
                }
                return;
            }
            return;
        }
        if (b == 4) {
            E0 e0R2 = r();
            if (e0R2 != null) {
                e0R2.g();
                return;
            }
            return;
        }
        if (b == 3) {
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                g5Var3.a("Q0", x8.a("Q0", "TAG", "OOM Timeout scenario ignored for : ", b));
                return;
            }
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            g5Var4.a("Q0", x8.a("Q0", "TAG", "OOM Timeout scenario ignored for : ", b));
        }
    }

    public void a(byte[] bArr) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "load response ", this));
        }
        S0 s0 = this.I;
        s0.getClass();
        s0.c = SystemClock.elapsedRealtime();
        S0 s02 = this.I;
        s02.getClass();
        s02.h = SystemClock.elapsedRealtime();
        if (Y()) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.a("Q0", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            if (this.s == null) {
                this.s = new w9(this);
            }
            N0 n0 = new N0(this, bArr);
            if (p0()) {
                g5 g5Var3 = this.j;
                if (g5Var3 != null) {
                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                    g5Var3.a("Q0", "skipping internet check on load(byte[])");
                }
                n0.invoke();
                return;
            }
            g5 g5Var4 = this.j;
            if (g5Var4 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var4.a("Q0", "starting load with retry");
            }
            a((Function0) n0, (Function1) new M0(this));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        g5 g5Var5 = this.j;
        if (g5Var5 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var5.a("Q0", "null response. failing");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "kv"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.inmobi.media.f5 r0 = r5.j
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "Q0"
            if (r0 == 0) goto L35
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onTelemetryEvent "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " adState="
            java.lang.StringBuilder r3 = r3.append(r4)
            byte r4 = r5.a
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.g5 r0 = (com.inmobi.media.g5) r0
            r0.c(r2, r3)
        L35:
            byte r0 = r5.a
            r3 = 3
            if (r0 == r3) goto Lbb
            r3 = 8
            if (r0 == r3) goto Lbb
            com.inmobi.media.f5 r0 = r5.j
            if (r0 == 0) goto L4d
            java.lang.String r3 = "addRetryCountToTelemetryEvent event - "
            java.lang.String r1 = com.inmobi.media.k6.a(r2, r1, r3, r6)
            com.inmobi.media.g5 r0 = (com.inmobi.media.g5) r0
            r0.c(r2, r1)
        L4d:
            int r0 = r6.hashCode()
            java.lang.String r1 = "ServerError"
            java.lang.String r2 = "ServerFill"
            switch(r0) {
                case -1959333523: goto L82;
                case 167123846: goto L7b;
                case 885222501: goto L74;
                case 925075267: goto L6b;
                case 1881615718: goto L62;
                case 1925668903: goto L59;
                default: goto L58;
            }
        L58:
            goto L99
        L59:
            java.lang.String r0 = "ServerNoFill"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L8a
            goto L99
        L62:
            java.lang.String r0 = "AdLoadFailed"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L8a
            goto L99
        L6b:
            java.lang.String r0 = "AdLoadSuccessful"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L8a
            goto L99
        L74:
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L8a
            goto L99
        L7b:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L8a
            goto L99
        L82:
            java.lang.String r0 = "RenderSuccess"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L99
        L8a:
            com.inmobi.media.K5 r0 = r5.E
            if (r0 == 0) goto L99
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "retryCount"
            r7.put(r3, r0)
        L99:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            if (r0 == 0) goto La1
            r0 = 1
            goto La5
        La1:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
        La5:
            if (r0 == 0) goto Lb8
            com.inmobi.media.h r0 = r5.u()
            if (r0 == 0) goto Lb8
            java.lang.String r0 = r0.p()
            if (r0 == 0) goto Lb8
            java.lang.String r1 = "creativeType"
            r7.put(r1, r0)
        Lb8:
            r5.c(r6, r7)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.b(java.lang.String, java.util.Map):void");
    }

    public final void b(byte b) {
        yc ycVar;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "cancelTimer ", this));
        }
        if (b == 1 && (ycVar = this.v) != null) {
            Intrinsics.checkNotNullExpressionValue("yc", "TAG");
            Timer timer = (Timer) ycVar.b.get((byte) 2);
            if (timer != null) {
                timer.cancel();
                ycVar.b.remove((byte) 2);
            }
        }
        yc ycVar2 = this.v;
        if (ycVar2 != null) {
            Intrinsics.checkNotNullExpressionValue("yc", "TAG");
            Timer timer2 = (Timer) ycVar2.b.get(Byte.valueOf(b));
            if (timer2 != null) {
                timer2.cancel();
                ycVar2.b.remove(Byte.valueOf(b));
            }
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "requestStatus");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.b("Q0", "loadResponseFailed " + this + " errorCode - " + ((int) s));
        }
        b(inMobiAdRequestStatus, true, s);
    }

    public final boolean a(E0 e0, long j) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "isBlockingStateForGetSignals ", this));
        }
        if (this.r) {
            I6.a((byte) 2, "InMobi", "getSignals() call is already in progress. Please wait for its execution to get complete");
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.b("Q0", "getSignals() call is already in progress. Please wait for its execution to get complete");
            }
            return true;
        }
        if (!f0()) {
            return false;
        }
        if (e0 != null) {
            e0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
        }
        a(2007, j);
        return true;
    }

    public final void a(WeakReference<E0> weakReference, short s, InMobiAdRequestStatus inMobiAdRequestStatus) {
        Intrinsics.checkNotNullParameter(weakReference, "listenerWeakReference");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, SettingsJsonConstants.APP_STATUS_KEY);
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "onLoadAdMarkupFailed ", this));
        }
        d((byte) 3);
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.d("Q0", "AdUnit " + this + " state - FAILED");
        }
        b((byte) 1);
        if (this.o) {
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.b("Q0", "AdUnit destroyed while onLoadAdMarkupFailed");
                return;
            }
            return;
        }
        E0 e0 = weakReference.get();
        if (e0 != null) {
            if (Intrinsics.areEqual("int", q())) {
                a(e0, s);
                return;
            } else {
                b(s);
                e0.a(this, inMobiAdRequestStatus);
                return;
            }
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var4.b("Q0", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        this.J = watermarkData;
        Ya yaW = w();
        if (yaW != null) {
            yaW.setWatermark(watermarkData);
        }
    }

    public static /* synthetic */ void a(Q0 q0, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyContainer");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        q0.a(i, z);
    }

    public final void a(int i, boolean z) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.a("Q0", "Destroying container for index " + i + ' ' + this);
        }
        ArrayList arrayList = this.g;
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        Ya ya = (Ya) this.g.get(i);
        if (ya != null) {
            ya.t0.set(z);
            ya.stopLoading();
            ya.b();
        }
        this.g.set(i, null);
    }

    public void a(Ya ya, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        Intrinsics.checkNotNullParameter(str, "trackerName");
        Intrinsics.checkNotNullParameter(map, "macros");
        g5 g5Var = this.j;
        if (g5Var != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var.a("Q0", "fireLandingPageTracker " + str + ' ' + this);
        }
        h hVarA = a(this.g.indexOf(ya));
        if (hVarA != null) {
            List<String> listC = hVarA.c(str);
            if (listC == null) {
                return;
            }
            for (String str2 : listC) {
                String strReplace$default = str2;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    strReplace$default = StringsKt.replace$default(strReplace$default, entry.getKey(), entry.getValue(), false, 4, (Object) null);
                }
                u2.a.a(strReplace$default, true, this.j);
            }
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "fireLandingPageTracker failed");
        }
    }

    public void a(String str) {
        Intrinsics.checkNotNullParameter(str, "log");
        E0 e0R = r();
        if (e0R != null) {
            e0R.a(str);
        }
    }

    public final void a(Ya ya, int i) {
        Intrinsics.checkNotNullParameter(ya, "renderView");
        this.g.add(i, ya);
        this.z.add(Integer.valueOf(i));
    }

    public final void b(int i, boolean z) {
        Ya ya;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "fireAdPodShowResult ", this));
        }
        ArrayList arrayList = this.g;
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (i < 0 || i >= arrayList.size() || (ya = (Ya) this.g.get(i)) == null) {
            return;
        }
        ya.b(z);
    }

    public void a(E0 e0) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "handleAdScreenDismissed ", this));
        }
    }

    public void a(Ya ya, short s) {
        List listC;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.b("Q0", j6.a("Q0", "TAG", "Render view signaled ad failed, for index ").append(this.g.indexOf(ya)).append(' ').append(this).toString());
        }
        if (ya == null || !Intrinsics.areEqual(ya.getMarkupType(), "htmlUrl")) {
            return;
        }
        int iIndexOf = this.g.indexOf(ya);
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.b("Q0", "fireLoadAdTokenUrlFailed : " + iIndexOf + ' ' + this);
        }
        h hVarA = a(iIndexOf);
        if (hVarA == null || (listC = hVarA.c("load_ad_token_url_failure")) == null) {
            return;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            u2.a.a((String) it.next(), true, this.j);
        }
    }

    public void b(Ya ya) {
        List listC;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "fireClickTracker ", this));
        }
        Intrinsics.checkNotNullParameter(ya, "renderView");
        h hVarA = a(this.g.indexOf(ya));
        if (((hVarA != null ? hVarA.p() : null) != null && Intrinsics.areEqual(hVarA.p(), MimeTypes.BASE_TYPE_VIDEO)) || hVarA == null || (listC = hVarA.c("click")) == null) {
            return;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            u2.a.a((String) it.next(), true, this.j);
        }
    }

    public static final void a(Q0 q0, Ya ya, short s) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(ya, "$renderView");
        q0.a(ya, s);
    }

    public void a(HashMap<Object, Object> map) {
        Intrinsics.checkNotNullParameter(map, "params");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onAdInteraction ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "Ad interaction. Params: " + map);
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.a(map);
        }
    }

    public void c(Ya ya) {
        List<String> listC;
        Intrinsics.checkNotNullParameter(ya, "renderView");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "fireImpressionTracker ", this));
        }
        Intrinsics.checkNotNullParameter(ya, "renderView");
        h hVarA = a(this.g.indexOf(ya));
        if (((hVarA != null ? hVarA.p() : null) != null && Intrinsics.areEqual(hVarA.p(), MimeTypes.BASE_TYPE_VIDEO)) || hVarA == null || (listC = hVarA.c("impression")) == null) {
            return;
        }
        for (String str : listC) {
            rc telemetryOnAdImpression = ya.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.e = "adResponseTracker";
            u2.a.b(str, true, new M(this.D, telemetryOnAdImpression), this.j);
        }
    }

    public void a(rc rcVar) {
        Intrinsics.checkNotNullParameter(rcVar, "telemetryOnAdImpression");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onImpressionFiredFromTemplate ", this));
        }
        rcVar.getClass();
        Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        rcVar.e = "imraid_impressionFired";
        if (!this.o && t() != null) {
            g5 g5Var2 = this.j;
            if (g5Var2 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var2.a("Q0", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.l;
            if (handler != null) {
                handler.post(new Q0$.ExternalSyntheticLambda7(this, rcVar));
                return;
            }
            return;
        }
        rcVar.b();
    }

    public static final void a(Q0 q0, rc rcVar) {
        Intrinsics.checkNotNullParameter(q0, "this$0");
        Intrinsics.checkNotNullParameter(rcVar, "$telemetryOnAdImpression");
        q0.D.a(rcVar);
    }

    public void a() {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onUserLeaveApplication ", this));
        }
        if (this.o || t() == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
            g5Var2.a("Q0", "User left application");
        }
        E0 e0R = r();
        if (e0R != null) {
            e0R.h();
        }
    }

    public final void a(short s) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdLoadDroppedAtSDK ", this));
        }
        HashMap map = new HashMap();
        map.put("errorCode", Short.valueOf(s));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void a(int i, long j) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "submitAdGetSignalsFailed ", this));
        }
        this.r = false;
        HashMap map = new HashMap();
        map.put("adType", q());
        map.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        map.put("networkType", E3.q());
        map.put("errorCode", Integer.valueOf(i));
        c("AdGetSignalsFailed", map);
    }

    public void a(String str, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "eventType");
        Intrinsics.checkNotNullParameter(map, "kv");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onRenderViewRequestedAction ", this));
        }
        c(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.media.h r39) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q0.a(com.inmobi.media.h):void");
    }

    public final D7 a(P7 p7) {
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "isSkippableVideo ", this));
        }
        Iterator it = p7.c().iterator();
        while (it.hasNext()) {
            D7 d7 = (D7) p7.n((String) it.next()).get(0);
            if (2 == d7.k) {
                return d7;
            }
        }
        return null;
    }

    public final void a(boolean z, Ya ya) {
        Set<Hc> setD;
        AdConfig.ViewabilityConfig viewability;
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.a("Q0", C0.a("Q0", "TAG", "omidSessionForHtmlMarkup ", this));
        }
        AdConfig adConfig = this.b;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            G9.a.getClass();
            if (Omid.isActive() && (setD = d(this.g.indexOf(ya))) != null) {
                for (Hc hc : setD) {
                    if (3 == hc.a) {
                        try {
                            String str = (String) hc.a("creativeType", String.class);
                            String str2 = (String) hc.a("customReferenceData", String.class);
                            Boolean bool = (Boolean) hc.a("isolateVerificationScripts", Boolean.class);
                            Byte b = (Byte) hc.a("impressionType", Byte.class);
                            z9 z9VarA = (str == null || bool == null || b == null) ? null : C9.a(str, ya, bool.booleanValue(), this.t.e(), b.byteValue(), str2);
                            if (z9VarA != null) {
                                hc.b.put("omidAdSession", z9VarA);
                                hc.b.put("deferred", Boolean.valueOf(z));
                                g5 g5Var2 = this.j;
                                if (g5Var2 != null) {
                                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                                    g5Var2.a("Q0", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                g5 g5Var3 = this.j;
                                if (g5Var3 != null) {
                                    Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                                    g5Var3.a("Q0", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e) {
                            g5 g5Var4 = this.j;
                            if (g5Var4 != null) {
                                g5Var4.b("Q0", Ed.a(e, j6.a("Q0", "TAG", "Setting up impression tracking for IAB encountered an unexpected error: ")));
                            }
                            w5 w5Var = w5.a;
                            w5.d.a(c5.a(e, "event"));
                        }
                    }
                }
            }
        }
    }

    public static final void a(Q0 q0, h hVar, String str) {
        g5 g5Var = q0.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "updateAdForBlob ", q0));
        }
        hVar.e(str);
        g5 g5Var2 = q0.j;
        if (g5Var2 != null) {
            g5Var2.c("Q0", C0.a("Q0", "TAG", "updateAd ", q0));
        }
        x0 x0Var = q0.u;
        if (x0Var != null) {
            x0Var.a(hVar);
        }
    }

    public void a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "blob");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "saveBlob ", this));
        }
        A a = this.C;
        int iHashCode = hashCode();
        P0 p0 = new P0(this, str2, str);
        a.getClass();
        A.a(iHashCode, p0);
    }

    public void a(String str, String str2, a2 a2Var, String str3) {
        Intrinsics.checkNotNullParameter(str, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(str2, "callback");
        Intrinsics.checkNotNullParameter(a2Var, "receiver");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "getBlob ", this));
        }
        A a = this.C;
        int iHashCode = hashCode();
        H0 h0 = new H0(this, str3, a2Var, str, str2);
        a.getClass();
        A.a(iHashCode, h0);
    }

    public void a(h hVar, boolean z, short s) {
        x0 x0Var;
        Intrinsics.checkNotNullParameter(hVar, "ad");
        g5 g5Var = this.j;
        if (g5Var != null) {
            g5Var.c("Q0", C0.a("Q0", "TAG", "onVastProcessCompleted ", this));
        }
        h hVarM = m();
        if (hVarM == null || W()) {
            hVarM = null;
        }
        if (hVarM == null) {
            return;
        }
        g5 g5Var2 = this.j;
        if (g5Var2 != null) {
            g5Var2.c("Q0", j6.a("Q0", "TAG", "Vast processing completed for ad with impressionId : ").append(hVarM.s()).toString());
        }
        String strU = hVarM.u();
        int iHashCode = strU.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && strU.equals("htmlUrl")) {
                    return;
                }
            } else if (strU.equals("html")) {
                return;
            }
        } else if (strU.equals("inmobiJson")) {
            if (this.a == 2 && (x0Var = this.u) != null) {
                x0Var.a(hVar);
                A0 a0P = p();
                String strK = x0Var.k();
                a0P.getClass();
                Intrinsics.checkNotNullParameter(hVar, "primaryAd");
                Intrinsics.checkNotNullParameter(strK, "clientReqId");
                Set setY = hVar.y();
                if (setY.isEmpty()) {
                    a0P.a.a(a0P.c, true, (short) 0);
                    return;
                }
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                k kVar = new k(string, setY, a0P.g, (String) null, 16);
                String strF = hVar.f();
                if (strF != null) {
                    r1 r1Var = r1.a;
                    r1.a(kVar, strF);
                    return;
                }
                return;
            }
            g5 g5Var3 = this.j;
            if (g5Var3 != null) {
                Intrinsics.checkNotNullExpressionValue("Q0", "TAG");
                g5Var3.b("Q0", "Found inconsistent state after vast processing");
                return;
            }
            return;
        }
        g5 g5Var4 = this.j;
        if (g5Var4 != null) {
            g5Var4.b("Q0", j6.a("Q0", "TAG", "Can not handle fallback for").append(hVarM.u()).toString());
        }
        throw new IllegalStateException("Can not handle fallback for markup type: " + hVarM.u());
    }
}
