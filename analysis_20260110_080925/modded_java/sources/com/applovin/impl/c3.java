package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a0;
import com.applovin.impl.c3$;
import com.applovin.impl.d;
import com.applovin.impl.e3;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class c3 extends d3 {
    private e3 a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private com.applovin.impl.a e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c3.this.a();
            c3 c3Var = c3.this;
            c3Var.b((Context) c3Var);
        }
    }

    class b implements k2.a {
        final /* synthetic */ com.applovin.impl.c a;

        class a implements d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(c3.this.a.t());
            }
        }

        /* renamed from: com.applovin.impl.c3$b$b, reason: collision with other inner class name */
        class C0003b implements d.b {
            C0003b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(c3.this.a.d(), c3.this.a.t());
            }
        }

        class c implements d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(c3.this.a.d(), c3.this.a.t());
            }
        }

        class d implements d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(c3.this.a.f(), false, c3.this.a.t());
            }
        }

        class e implements d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(c3.this.a.k(), c3.this.a.w(), c3.this.a.t());
            }
        }

        class f implements d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(c3.this.a.v(), c3.this.a.t());
            }
        }

        class g implements d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(c3.this.a.o(), true, c3.this.a.t());
            }
        }

        class h implements d.b {
            final /* synthetic */ j2 a;

            h(j2 j2Var) {
                this.a = j2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(this.a.r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.a = cVar;
        }

        public void a(d2 d2Var, j2 j2Var) {
            int iB = d2Var.b();
            if (iB == e3.e.APP_INFO.ordinal()) {
                a7.a(j2Var.c(), j2Var.b(), c3.this);
                return;
            }
            if (iB == e3.e.MAX.ordinal()) {
                if (c3.this.a.a(j2Var)) {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a());
                    return;
                } else {
                    a7.a(j2Var.c(), j2Var.b(), c3.this);
                    return;
                }
            }
            if (iB == e3.e.PRIVACY.ordinal()) {
                if (d2Var.a() != e3.d.CMP.ordinal()) {
                    if (d2Var.a() == e3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(c3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(c3.this.a.t().r0().j())) {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerTcfInfoListActivity.class, this.a, new C0003b());
                    return;
                } else {
                    a7.a(j2Var.c(), j2Var.b(), c3.this);
                    return;
                }
            }
            if (iB != e3.e.ADS.ordinal()) {
                if ((iB == e3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iB == e3.e.INCOMPLETE_NETWORKS.ordinal() || iB == e3.e.COMPLETED_NETWORKS.ordinal()) && (j2Var instanceof o3)) {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerDetailActivity.class, this.a, new h(j2Var));
                    return;
                }
                return;
            }
            if (d2Var.a() == e3.b.AD_UNITS.ordinal()) {
                if (c3.this.a.f().size() > 0) {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                    return;
                } else {
                    a7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", c3.this);
                    return;
                }
            }
            if (d2Var.a() == e3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (c3.this.a.k().size() <= 0 && c3.this.a.w().size() <= 0) {
                    a7.a("Complete Integrations", "Please complete integrations in order to access this.", c3.this);
                    return;
                } else if (c3.this.a.t().s0().c()) {
                    a7.a("Restart Required", j2Var.b(), c3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                    return;
                }
            }
            if (d2Var.a() != e3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (d2Var.a() == e3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(c3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                }
            } else if (!c3.this.a.t().s0().c()) {
                c3.this.getSdk().s0().a();
                a7.a("Restart Required", j2Var.b(), c3.this);
            } else if (c3.this.a.v().size() > 0) {
                com.applovin.impl.d.a(c3.this, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
            } else {
                a7.a("Complete Integrations", "Please complete integrations in order to access this.", c3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.e = aVar;
        aVar.setColor(-3355444);
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.e);
        this.e.a();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.applovin");
        p0.startActivity(p1);
    }

    @Override // com.applovin.impl.d3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.applovin", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.d3
    protected com.applovin.impl.sdk.k getSdk() {
        e3 e3Var = this.a;
        if (e3Var != null) {
            return e3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a0.a aVar = this.a;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.b);
            this.a.a((k2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        e3 e3Var = this.a;
        if (e3Var == null || e3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(e3 e3Var, c cVar) {
        DataSetObserver dataSetObserver;
        a0.a aVar = this.a;
        if (aVar != null && (dataSetObserver = this.b) != null) {
            aVar.unregisterDataSetObserver(dataSetObserver);
        }
        this.a = e3Var;
        this.b = new a();
        b((Context) this);
        this.a.registerDataSetObserver(this.b);
        this.a.a(new b(cVar));
    }

    private void b() {
        e3 e3Var = this.a;
        if (e3Var == null) {
            return;
        }
        String strP = e3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        a7.a(this.a.i(), this.a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.a.h()) || this.a.x()) {
            return;
        }
        this.a.b(true);
        runOnUiThread(new c3$.ExternalSyntheticLambda0(this, context));
    }
}
