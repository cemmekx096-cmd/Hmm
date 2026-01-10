package com.safedk.android.analytics;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class StatsReporter implements AppLovinCommunicatorPublisher {
    private static final String a = "StatsReporter";
    private static StatsReporter b;
    private static final ExecutorService c = Executors.newSingleThreadExecutor();

    public String getCommunicatorId() {
        return "SafeDK";
    }

    public static synchronized void a() {
        b = new StatsReporter();
    }

    public static synchronized StatsReporter b() {
        return b;
    }

    public void a(final ArrayList<Bundle> arrayList) {
        try {
            c.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (arrayList.size() > 0) {
                            Logger.d(StatsReporter.a, "Starting report stats events!, isOnUiThread = " + n.c());
                            AppLovinBridge.a(arrayList, StatsReporter.this);
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsReporter.a, "Caught exception while creating json data", th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during report events: " + arrayList, th);
            new CrashReporter().caughtException(th);
        }
    }

    public ArrayList<Bundle> a(Set<StatsEvent> set) {
        StringBuilder sb = new StringBuilder();
        sb.append("filters reports and bundle started, events to send : ");
        sb.append(set == null ? "null" : Integer.valueOf(set.size()));
        sb.append(", isOnUiThread = ");
        sb.append(n.c());
        Logger.d(a, sb.toString());
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            for (StatsEvent statsEvent : set) {
                boolean z = false;
                if (SafeDK.b() && (statsEvent.a().equals(StatsCollector.EventType.h) || statsEvent.a().equals(StatsCollector.EventType.m))) {
                    z = true;
                }
                Logger.d(a, "filters reports and bundle Event type = " + statsEvent.a() + "; should report = " + z);
                Bundle bundleD = statsEvent.d();
                n.b(a, "filters reports and bundle " + statsEvent.a() + " event:" + n.a(bundleD));
                if (z) {
                    Set<String> setE = statsEvent.e();
                    if (setE != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : setE) {
                            if (!bundleD.containsKey(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (hashSet.size() > 0) {
                            Logger.d(a, "filters reports and bundle *** missing fields: " + hashSet);
                        }
                    }
                    arrayList.add(statsEvent.a(bundleD));
                    n.b(a, "filters reports and bundle event to be reported : " + bundleD.toString());
                }
            }
        } catch (Exception e) {
            Logger.e(a, "Exception filtering events for report", e);
        }
        return arrayList;
    }

    public synchronized boolean a(CreativeInfo creativeInfo, c cVar) {
        Bundle bundle = cVar.A;
        Logger.d(a, "notify Max started , CI = " + creativeInfo + ", applovin data = " + bundle + ", isOnUiThread = " + n.c());
        if (creativeInfo != null && creativeInfo.ad() != null && bundle != null) {
            String strZ = b.a(cVar, creativeInfo) ? cVar.z() : creativeInfo.ad();
            Logger.d(a, "Will notify Max about match, creative id = " + strZ);
            AppLovinBridge.reportMaxCreativeId(bundle, strZ, b());
            return true;
        }
        Logger.d(a, "Cannot notify Max about match");
        return false;
    }
}
