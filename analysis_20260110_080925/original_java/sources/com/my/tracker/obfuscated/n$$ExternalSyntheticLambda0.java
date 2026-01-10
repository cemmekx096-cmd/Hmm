package com.my.tracker.obfuscated;

import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ MyTracker.AttributionListener f$0;
    public final /* synthetic */ MyTrackerAttribution f$1;

    public /* synthetic */ n$$ExternalSyntheticLambda0(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        this.f$0 = attributionListener;
        this.f$1 = myTrackerAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.$r8$lambda$SvAlO9FGIisJNuxmn34ZOnwFc00(this.f$0, this.f$1);
    }
}
