package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class h$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ h f$0;
    public final /* synthetic */ MaxAdapter.OnCompletionListener f$1;
    public final /* synthetic */ MaxAdapterInitializationParameters f$2;
    public final /* synthetic */ Activity f$3;

    public /* synthetic */ h$$ExternalSyntheticLambda7(h hVar, MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        this.f$0 = hVar;
        this.f$1 = onCompletionListener;
        this.f$2 = maxAdapterInitializationParameters;
        this.f$3 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.$r8$lambda$09fU7VGRYL28mxpmEZwZQ9yLuPo(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
