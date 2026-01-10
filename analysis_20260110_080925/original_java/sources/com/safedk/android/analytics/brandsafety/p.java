package com.safedk.android.analytics.brandsafety;

import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;
import java.util.Iterator;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class p {
    public static final int a = 50;
    public static final int b = 10;
    public static final int c = 30000;
    private static final String d = "MaxEventsManager";
    private static final Object e = new Object();
    private static p f;
    private MaxEvents g = new MaxEvents(50);
    private MaxEvents h = new MaxEvents(5);

    private p() {
    }

    public static p a() {
        p pVar;
        synchronized (e) {
            if (f == null) {
                f = new p();
            }
            pVar = f;
        }
        return pVar;
    }

    public synchronized void a(com.safedk.android.analytics.events.a aVar) {
        this.g.a(aVar);
    }

    public void b(com.safedk.android.analytics.events.a aVar) {
        Logger.d(d, "Adding MAX Will display event. #event is " + this.h.size() + ",  maxEvent=" + aVar.toString());
        this.h.a(aVar);
    }

    public MaxEvents b() {
        MaxEvents maxEventsD = d();
        if (maxEventsD.size() >= 10) {
            return maxEventsD;
        }
        return a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(d, BuildConfig.FLAVOR);
        maxEvents = new MaxEvents(50);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            com.safedk.android.analytics.events.a aVar = (com.safedk.android.analytics.events.a) it.next();
            if (jCurrentTimeMillis - (aVar.c() * 1000) < 30000) {
                Logger.d(d, "getEventFromLastInterval Adding max event ts = " + jCurrentTimeMillis + ", " + aVar.toString());
                maxEvents.a(aVar);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i);
        for (int size = this.g.size() < 10 ? 0 : this.g.size() - 10; size < this.g.size(); size++) {
            Logger.d(d, "getLastXEvents adding max event index " + size + " " + ((com.safedk.android.analytics.events.a) this.g.get(size)).toString());
            maxEvents.a(new com.safedk.android.analytics.events.a((com.safedk.android.analytics.events.a) this.g.get(size)));
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.h;
    }
}
