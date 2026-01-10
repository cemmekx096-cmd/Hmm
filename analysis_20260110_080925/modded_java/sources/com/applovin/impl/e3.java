package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a0;
import com.applovin.impl.a7$;
import com.applovin.impl.e3$;
import com.applovin.impl.j2;
import com.applovin.impl.n6;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class e3 extends k2 implements AppLovinCommunicatorSubscriber, a0.a {
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;
    private com.applovin.impl.sdk.k e;
    private List f;
    private List g;
    private List h;
    private List i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private final StringBuilder n;
    private final AtomicBoolean o;
    private boolean p;
    private List q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a0.b.values().length];
            a = iArr;
            try {
                iArr[a0.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a0.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a0.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a0.b.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a0.b.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public e3(Context context) {
        super(context);
        this.n = new StringBuilder(BuildConfig.FLAVOR);
        this.o = new AtomicBoolean();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    private List g() {
        boolean zC = this.e.s0().c();
        List listB = this.e.s0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = ((k2) this).a.getPackageManager().getPackageInfo(((k2) this).a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(j2.a().d("Package Name").c(((k2) this).a.getPackageName()).a());
        j2.b bVarD = j2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(j2.a().d("OS").c(a7.d()).a());
        arrayList.add(j2.a().d("Account").c(StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(j2.a().d("Mediation Provider").c(StringUtils.isValidString(this.e.V()) ? this.e.V() : "None").a());
        arrayList.add(j2.a().d("OM SDK Version").c(this.e.d0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.F0()));
        return arrayList;
    }

    private j2 l() {
        String strD = this.e.r0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.e.r0().j());
        j2.b bVarD = j2.a(j2.c.e).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        j2.b bVarC = bVarD.c(strD);
        if (this.m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(((k2) this).a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(i0.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, ((k2) this).a));
            }
        }
        return bVarC.a();
    }

    private j2 m() {
        return j2.a().d("MAX Terms and Privacy Policy Flow").a(((k2) this).a).a(true).a();
    }

    private j2 n() {
        boolean zHasSupportedCmp = this.e.t().hasSupportedCmp();
        return j2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(i0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, ((k2) this).a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(j2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.e.a(l4.B3);
        j2.b bVarD = j2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.e.H0()) {
            String strA = a7.a(this.e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.e.y().j()) {
            arrayList.add(m());
            arrayList.add(n());
        } else if (this.e.y().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private j2 r() {
        return j2.a().d("Network Consent Statuses").a(((k2) this).a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new f4(l0.b(), false, ((k2) this).a));
        }
        arrayList.add(new f4(l0.a(), true, ((k2) this).a));
        return arrayList;
    }

    private j2 u() {
        return j2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(i0.a(R.color.applovin_sdk_xmarkColor, ((k2) this).a)).b("Terms Flow has been replaced").a(this.e.y().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + a7.c(this.e));
        sb.append("\nTest Mode - " + (this.e.s0().c() ? "enabled" : "disabled"));
        sb.append("\nTarget SDK - " + this.e.B().D().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.e.a(l4.B3);
        String strB = i.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sbAppend = new StringBuilder().append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb.append(sbAppend.append(str2).toString());
        StringBuilder sbAppend2 = new StringBuilder().append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb.append(sbAppend2.append(strB).toString());
        if (this.e.H0()) {
            String strA = a7.a(this.e.n0());
            sb.append("\nUnity Version - " + (StringUtils.isValidString(strA) ? strA : "None"));
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(l0.a(((k2) this).a));
        sb.append(this.e.y().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.e.r0().i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb.append(((n6) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.r.iterator();
        while (it2.hasNext()) {
            a(sb, ((v2) it2.next()).j());
        }
        Iterator it3 = this.s.iterator();
        while (it3.hasNext()) {
            a(sb, ((v2) it3.next()).j());
        }
        Iterator it4 = this.q.iterator();
        while (it4.hasNext()) {
            a(sb, ((v2) it4.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it5 = this.g.iterator();
        while (it5.hasNext()) {
            a(sb, ((m) it5.next()).e());
        }
        sb.append("\n========== END ==========");
        o.g("MediationDebuggerListAdapter", sb.toString());
        this.n.append(sb.toString());
    }

    public boolean a(j2 j2Var) {
        if (j2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(j2Var.k().toString());
    }

    public void b(boolean z) {
        this.p = z;
    }

    protected List c(int i) {
        return i == e.APP_INFO.ordinal() ? this.x : i == e.MAX.ordinal() ? this.y : i == e.PRIVACY.ordinal() ? this.z : i == e.ADS.ordinal() ? this.A : i == e.INCOMPLETE_NETWORKS.ordinal() ? this.B : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? this.C : i == e.COMPLETED_NETWORKS.ordinal() ? this.D : this.E;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((v2) it.next()).t());
        }
        String strK = this.e.r0().k();
        if (strK != null) {
            String strC = this.e.r0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                n6 n6Var = (n6) it2.next();
                if (n6Var.f() == n6.a.a && n6Var.d() != null) {
                    n6Var.a(Boolean.valueOf(p6.a(strK, n6Var.d().intValue() - 1)));
                } else if (n6Var.f() == n6.a.b && n6Var.d() != null) {
                    n6Var.a(p6.a(n6Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((n6) it3.next()).a((Boolean) null);
            }
        }
        return arrayList;
    }

    protected j2 e(int i) {
        return i == e.APP_INFO.ordinal() ? new j4("APP INFO") : i == e.MAX.ordinal() ? new j4("MAX") : i == e.PRIVACY.ordinal() ? new j4("PRIVACY") : i == e.ADS.ordinal() ? new j4("ADS") : i == e.INCOMPLETE_NETWORKS.ordinal() ? new j4("INCOMPLETE SDK INTEGRATIONS") : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? new j4("APPLOVIN MICRO SDK PARTNERS") : i == e.COMPLETED_NETWORKS.ordinal() ? new j4("COMPLETED SDK INTEGRATIONS") : new j4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.g;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.j;
    }

    public List k() {
        return this.u;
    }

    public List o() {
        return this.h;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.q);
            this.C = a(this.r);
            this.D = a(this.s);
            c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.o.get() + "}";
    }

    public List v() {
        return this.w;
    }

    public List w() {
        return this.v;
    }

    public boolean x() {
        return this.p;
    }

    public boolean y() {
        return this.o.get();
    }

    protected int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVarF = ((m) it.next()).f();
            Iterator it2 = nVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((v7) it2.next()).b());
            }
            Iterator it3 = nVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((v7) it3.next()).b());
            }
        }
        this.u = new ArrayList(hashSet);
        this.v = new ArrayList(hashSet2);
        Collections.sort(this.u);
        Collections.sort(this.v);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z, com.applovin.impl.sdk.k kVar) {
        this.e = kVar;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = z;
        if (list != null && this.o.compareAndSet(false, true)) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.s);
            this.x.addAll(j());
            this.y.addAll(q());
            this.z.addAll(s());
            this.A.addAll(g());
            this.B = a(this.q);
            this.C = a(this.r);
            this.D = a(this.s);
            this.E = a(this.t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(((k2) this).a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new e3$.ExternalSyntheticLambda0(this));
    }

    private j2 b(String str, String str2) {
        j2.b bVarD = j2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(i0.a(R.color.applovin_sdk_xmarkColor, ((k2) this).a));
        }
        return bVarD.a();
    }

    protected int d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.x.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.y.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.z.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.A.size();
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.C.size();
        }
        if (i == e.COMPLETED_NETWORKS.ordinal()) {
            return this.D.size();
        }
        return this.E.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            if (!v2Var.H()) {
                if (v2Var.q() != v2.a.c && v2Var.q() != v2.a.d) {
                    if (v2Var.q() == v2.a.e) {
                        if (v2Var.z()) {
                            this.r.add(v2Var);
                        } else {
                            this.s.add(v2Var);
                        }
                    } else if (v2Var.q() == v2.a.b) {
                        this.t.add(v2Var);
                    }
                } else if (v2Var.z()) {
                    this.r.add(v2Var);
                } else {
                    this.q.add(v2Var);
                }
            }
        }
    }

    private j2 e() {
        String str;
        j2.b bVarD = j2.a().d("Ad Review Version");
        String strB = i.b();
        if (StringUtils.isValidString(strB)) {
            String strA = i.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.e.i0())) {
                str = null;
            } else {
                str = "MAX Ad Review integrated with wrong SDK key. Please check that your " + (this.e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated") + " from the correct account.";
            }
        } else {
            str = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (str != null) {
            bVarD.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(i0.a(R.color.applovin_sdk_xmarkColor, ((k2) this).a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private j2 b(String str) {
        j2.b bVarA = j2.a();
        if (this.e.s0().c()) {
            bVarA.a(((k2) this).a);
        }
        j2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? BuildConfig.FLAVOR : "Select ") + "Test Mode Network");
        if (!this.e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    public void a(y yVar, String str) {
        z zVar;
        String strA;
        c cVarA;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (z zVar2 : this.i) {
            List list = (List) yVar.a().get(zVar2.b());
            if (list == null || !list.contains(zVar2)) {
                this.e.O();
                if (o.a()) {
                    this.e.O().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + zVar2.d());
                }
                arrayList.add(zVar2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    zVar = (z) it.next();
                    if (zVar.g()) {
                        break;
                    }
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                a0.b bVar = a0.b.d;
                strA = a(bVar, str, zVar.d());
                cVarA = a(bVar);
            } else {
                a0.b bVar2 = a0.b.e;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.y.add(a(str2, cVar));
        c();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            if (v2Var.y() == v2.b.h) {
                this.w.add(v2Var);
            }
        }
    }

    public void a(a0.b bVar, String str) {
        if (bVar == a0.b.a) {
            this.e.O();
            if (o.a()) {
                this.e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (string.length() + str.length() >= ((Integer) this.e.a(l4.r)).intValue()) {
            o.g("MediationDebuggerListAdapter", string);
            this.n.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(j2.a().d("View Ad Units (" + this.g.size() + ")").a(((k2) this).a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.h.isEmpty()) {
            arrayList.add(j2.a().d("Selective Init Ad Units (" + this.h.size() + ")").a(((k2) this).a).a(true).a());
        }
        arrayList.add(j2.a().d("Test Mode Enabled").c(String.valueOf(this.e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o3((v2) it.next(), ((k2) this).a));
        }
        return arrayList;
    }

    private j2 a(String str) {
        j2.b bVarA = j2.a();
        if (!this.e.s0().c()) {
            bVarA.a(((k2) this).a);
        }
        j2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? BuildConfig.FLAVOR : "Select ") + "Live Network");
        if (this.e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private j2 a(boolean z) {
        return j2.a().d("Java 8").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(i0.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, ((k2) this).a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z).a();
    }

    private j2 a(String str, c cVar) {
        int i;
        int iA;
        if (cVar == c.SUCCESS) {
            i = R.drawable.applovin_ic_check_mark_bordered;
            iA = i0.a(R.color.applovin_sdk_checkmarkColor, ((k2) this).a);
        } else if (cVar == c.WARNING) {
            i = R.drawable.applovin_ic_warning;
            iA = i0.a(R.color.applovin_sdk_warningColor, ((k2) this).a);
        } else {
            i = R.drawable.applovin_ic_x_mark;
            iA = i0.a(R.color.applovin_sdk_xmarkColor, ((k2) this).a);
        }
        return j2.a().d("app-ads.txt").a(i).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(a0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 4) {
            return i != 5 ? BuildConfig.FLAVOR : "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(a0.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        if (i != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (m2 m2Var : this.u) {
                if (list.equals(m2Var.b())) {
                    return m2Var.a();
                }
            }
            for (m2 m2Var2 : this.v) {
                if (list.equals(m2Var2.b())) {
                    return m2Var2.a();
                }
            }
        } else {
            for (v2 v2Var : this.w) {
                if (list.equals(v2Var.u())) {
                    return v2Var.g();
                }
            }
        }
        return a7$.ExternalSyntheticBackport1.m(",", list);
    }
}
