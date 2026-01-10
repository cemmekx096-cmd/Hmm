package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.j2;
import com.applovin.impl.p$;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class p extends d3 {
    private com.applovin.impl.sdk.k a;
    private k2 b;
    private List c;
    private boolean d;
    private ListView e;

    class a extends k2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        protected int b() {
            return 1;
        }

        protected List c(int i) {
            return p.this.c;
        }

        protected int d(int i) {
            return this.e.size();
        }

        protected j2 e(int i) {
            return new j4(BuildConfig.FLAVOR);
        }
    }

    @Override // com.applovin.impl.d3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.applovin", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.d3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List<m> list, boolean z, com.applovin.impl.sdk.k kVar) {
        this.d = z;
        this.a = kVar;
        this.c = a(list);
        a aVar = new a(this, list);
        this.b = aVar;
        aVar.a(new p$.ExternalSyntheticLambda2(this, list, kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.d ? "Selective Init " : BuildConfig.FLAVOR) + "Ad Units");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, com.applovin.impl.sdk.k kVar, d2 d2Var, j2 j2Var) {
        m mVar = (m) list.get(d2Var.a());
        if (mVar.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new p$.ExternalSyntheticLambda0(mVar, kVar));
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new p$.ExternalSyntheticLambda1(mVar, kVar));
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(mVar.c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(mVar.b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(j2.a(j2.c.e).b(StringUtils.createSpannedString(mVar.d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
