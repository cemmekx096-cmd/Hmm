package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.crashlytics.android.BuildConfig;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFe1lSDK {
    public final List<AFe1qSDK> AFAdRevenueData;
    final List<AFe1sSDK<?>> areAllFieldsValid;
    final Set<AFe1sSDK<?>> component1;
    final NavigableSet<AFe1sSDK<?>> component2;
    final Set<AFe1mSDK> component3;
    final NavigableSet<AFe1sSDK<?>> component4;
    final Timer getCurrencyIso4217Code;
    final ExecutorService getMediationNetwork;
    final Set<AFe1mSDK> getMonetizationNetwork;
    public Executor getRevenue;

    public AFe1lSDK(ExecutorService executorService) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, BuildConfig.FLAVOR);
        this.getRevenue = executorServiceNewSingleThreadExecutor;
        this.getCurrencyIso4217Code = new Timer(true);
        this.AFAdRevenueData = new CopyOnWriteArrayList();
        this.getMonetizationNetwork = new CopyOnWriteArraySet();
        this.component3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component2 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.areAllFieldsValid = new ArrayList();
        this.component1 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getMediationNetwork = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1lSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFe1sSDK getMonetizationNetwork;

        public AnonymousClass5(AFe1sSDK aFe1sSDK) {
            this.getMonetizationNetwork = aFe1sSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1lSDK.this.component2) {
                if (AFe1lSDK.this.component1.contains(this.getMonetizationNetwork)) {
                    AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("tried to add already running task: ").append(this.getMonetizationNetwork).toString());
                    return;
                }
                if (!AFe1lSDK.this.component2.contains(this.getMonetizationNetwork) && !AFe1lSDK.this.component4.contains(this.getMonetizationNetwork)) {
                    AFe1lSDK aFe1lSDK = AFe1lSDK.this;
                    AFe1sSDK aFe1sSDK = this.getMonetizationNetwork;
                    for (AFe1mSDK aFe1mSDK : aFe1sSDK.AFAdRevenueData) {
                        if (aFe1lSDK.component3.contains(aFe1mSDK)) {
                            aFe1sSDK.getCurrencyIso4217Code.add(aFe1mSDK);
                        }
                    }
                    if (AFe1lSDK.this.AFAdRevenueData(this.getMonetizationNetwork)) {
                        zAdd = AFe1lSDK.this.component2.add(this.getMonetizationNetwork);
                    } else {
                        zAdd = AFe1lSDK.this.component4.add(this.getMonetizationNetwork);
                        if (zAdd) {
                            AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("new task was blocked: ").append(this.getMonetizationNetwork).toString());
                            this.getMonetizationNetwork.AFAdRevenueData();
                        }
                    }
                    if (zAdd) {
                        AFe1lSDK.this.component2.addAll(AFe1lSDK.this.areAllFieldsValid);
                        AFe1lSDK.this.areAllFieldsValid.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("task not added, it's already in the queue: ").append(this.getMonetizationNetwork).toString());
                    }
                    if (zAdd) {
                        AFe1lSDK.this.component3.add(this.getMonetizationNetwork.getMonetizationNetwork);
                        AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("new task added: ").append(this.getMonetizationNetwork).toString());
                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                        }
                        AFe1lSDK aFe1lSDK2 = AFe1lSDK.this;
                        aFe1lSDK2.getMediationNetwork.submit(aFe1lSDK2.new AnonymousClass4());
                        AFe1lSDK aFe1lSDK3 = AFe1lSDK.this;
                        synchronized (aFe1lSDK3.component2) {
                            for (int size = (aFe1lSDK3.component2.size() + aFe1lSDK3.component4.size()) - 40; size > 0; size--) {
                                boolean z = !aFe1lSDK3.component4.isEmpty();
                                boolean zIsEmpty = true ^ aFe1lSDK3.component2.isEmpty();
                                if (zIsEmpty && z) {
                                    if (aFe1lSDK3.component2.first().getCurrencyIso4217Code(aFe1lSDK3.component4.first()) > 0) {
                                        aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component2);
                                    } else {
                                        aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component4);
                                    }
                                } else if (zIsEmpty) {
                                    aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component2);
                                } else if (z) {
                                    aFe1lSDK3.getMediationNetwork(aFe1lSDK3.component4);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1cSDK.component1, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.getMonetizationNetwork).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("tried to add already scheduled task: ").append(this.getMonetizationNetwork).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1lSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1lSDK.this.component2) {
                final AFe1sSDK<?> aFe1sSDKPollFirst = AFe1lSDK.this.component2.pollFirst();
                if (aFe1sSDKPollFirst == null) {
                    return;
                }
                AFe1lSDK.this.component1.add(aFe1sSDKPollFirst);
                long monetizationNetwork = aFe1sSDKPollFirst.getMonetizationNetwork();
                AFe1pSDK aFe1pSDK = new AFe1pSDK(Thread.currentThread());
                if (monetizationNetwork > 0) {
                    AFe1lSDK.this.getCurrencyIso4217Code.schedule(aFe1pSDK, monetizationNetwork);
                }
                final AFe1lSDK aFe1lSDK = AFe1lSDK.this;
                aFe1lSDK.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                        while (it.hasNext()) {
                            it.next().getMonetizationNetwork(aFe1sSDKPollFirst);
                        }
                    }
                });
                if (!AFe1lSDK.this.component2.isEmpty()) {
                    AFe1lSDK aFe1lSDK2 = AFe1lSDK.this;
                    aFe1lSDK2.getMediationNetwork.submit(aFe1lSDK2.new AnonymousClass4());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1cSDK.component1, "starting task execution: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                    final AFe1rSDK aFe1rSDKComponent2 = aFe1sSDKPollFirst.component2();
                    aFe1pSDK.cancel();
                    final AFe1lSDK aFe1lSDK3 = AFe1lSDK.this;
                    aFe1lSDK3.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("execution finished for ").append(aFe1sSDKPollFirst).append(", result: ").append(aFe1rSDKComponent2).toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDKComponent2);
                            }
                            if (aFe1rSDKComponent2 == AFe1rSDK.AFAdRevenueData) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1cSDK.component1, "task was interrupted: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                    aFe1sSDKPollFirst.getMediationNetwork = AFe1rSDK.getRevenue;
                    final AFe1lSDK aFe1lSDK4 = AFe1lSDK.this;
                    final AFe1rSDK aFe1rSDK = AFe1rSDK.getRevenue;
                    aFe1lSDK4.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("execution finished for ").append(aFe1sSDKPollFirst).append(", result: ").append(aFe1rSDK).toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDK);
                            }
                            if (aFe1rSDK == AFe1rSDK.AFAdRevenueData) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                } catch (Throwable unused2) {
                    aFe1pSDK.cancel();
                    final AFe1lSDK aFe1lSDK5 = AFe1lSDK.this;
                    final AFe1rSDK aFe1rSDK2 = AFe1rSDK.getMediationNetwork;
                    aFe1lSDK5.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.component1, new StringBuilder("execution finished for ").append(aFe1sSDKPollFirst).append(", result: ").append(aFe1rSDK2).toString());
                            AFe1lSDK.this.component1.remove(aFe1sSDKPollFirst);
                            Iterator<AFe1qSDK> it = AFe1lSDK.this.AFAdRevenueData.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFe1sSDKPollFirst, aFe1rSDK2);
                            }
                            if (aFe1rSDK2 == AFe1rSDK.AFAdRevenueData) {
                                AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                                AFe1lSDK.this.getCurrencyIso4217Code();
                                return;
                            }
                            if (aFe1sSDKPollFirst.getMediationNetwork()) {
                                if (AFe1lSDK.getCurrencyIso4217Code(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1lSDK.this.component2) {
                                        AFe1lSDK.this.areAllFieldsValid.add(aFe1sSDKPollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1lSDK.this.AFAdRevenueData) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1lSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
                            AFe1lSDK.this.getCurrencyIso4217Code();
                        }
                    });
                }
            }
        }
    }

    final void getCurrencyIso4217Code() {
        synchronized (this.component2) {
            Iterator<AFe1sSDK<?>> it = this.component4.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1sSDK<?> next = it.next();
                if (AFAdRevenueData(next)) {
                    it.remove();
                    this.component2.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getMediationNetwork.submit(new AnonymousClass4());
            }
        }
    }

    final void getMediationNetwork(NavigableSet<AFe1sSDK<?>> navigableSet) {
        AFe1sSDK<?> aFe1sSDKPollFirst = navigableSet.pollFirst();
        this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMonetizationNetwork);
        Iterator<AFe1qSDK> it = this.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(aFe1sSDKPollFirst);
        }
    }

    final boolean AFAdRevenueData(AFe1sSDK<?> aFe1sSDK) {
        return this.getMonetizationNetwork.containsAll(aFe1sSDK.getCurrencyIso4217Code);
    }

    public static boolean getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK) {
        return ((aFe1sSDK instanceof AFf1vSDK) && aFe1sSDK.getMonetizationNetwork == AFe1mSDK.registerClient) ? false : true;
    }
}
