package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.s$;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class s {
    public static AudioManager b;
    public static n c;
    public static ScheduledFuture f;
    public static q h;
    public static final s a = new s();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicReference e = new AtomicReference(null);
    public static final Set g = Collections.synchronizedSet(new LinkedHashSet());

    public static void a(f5 f5Var, Ka ka) {
        Intrinsics.checkNotNullParameter(ka, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((ScheduledThreadPoolExecutor) m4.c.getValue()).execute(new s$.ExternalSyntheticLambda3(f5Var, ka));
    }

    public static final void b(f5 f5Var, Ka ka) {
        Intrinsics.checkNotNullParameter(ka, "$listener");
        if (f5Var != null) {
            ((g5) f5Var).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + g.size());
        }
        Set<WeakReference> set = g;
        Intrinsics.checkNotNullExpressionValue(set, "listeners");
        for (WeakReference weakReference : set) {
            if (weakReference.get() == null) {
                g.remove(weakReference);
            }
        }
        Set set2 = g;
        boolean zIsEmpty = set2.isEmpty();
        set2.add(new WeakReference(ka));
        Float f2 = (Float) e.get();
        ka.a.b("window.mraidview.broadcastEvent('audioVolumeChange', " + (f2 != null ? Float.valueOf(y2.a(f2.floatValue() * 100.0f)) : null) + ");");
        if (!zIsEmpty) {
            if (f5Var != null) {
                ((g5) f5Var).c("AdAudioTracker", "Resuming audio volume change listener");
                return;
            }
            return;
        }
        if (f5Var != null) {
            ((g5) f5Var).c("AdAudioTracker", "Starting audio volume change listener");
        }
        Context contextD = Kb.d();
        if (contextD == null) {
            if (f5Var != null) {
                ((g5) f5Var).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        LinkedHashMap linkedHashMap = K2.a;
        Throwable th = Result.exceptionOrNull-impl(z2.a(new r(f5Var, contextD, V4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null).getMraid3Config().getMuteChangeInterval())));
        if (th != null) {
            if (f5Var != null) {
                ((g5) f5Var).b("AdAudioTracker", "Error starting audio volume tracking - " + th.getMessage());
            }
            a((Float) null);
        }
    }

    public static void c(f5 f5Var, Ka ka) {
        Intrinsics.checkNotNullParameter(ka, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((ScheduledThreadPoolExecutor) m4.c.getValue()).execute(new s$.ExternalSyntheticLambda0(f5Var, ka));
    }

    public static final void d(f5 f5Var, Ka ka) {
        Intrinsics.checkNotNullParameter(ka, "$listener");
        if (f5Var != null) {
            ((g5) f5Var).c("AdAudioTracker", "Removing audio volume change listener");
        }
        Set<WeakReference> set = g;
        Intrinsics.checkNotNullExpressionValue(set, "listeners");
        for (WeakReference weakReference : set) {
            if (Intrinsics.areEqual(weakReference.get(), ka)) {
                g.remove(weakReference);
            }
        }
        if (g.isEmpty()) {
            if (f5Var != null) {
                ((g5) f5Var).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            Context contextD = Kb.d();
            if (contextD == null) {
                if (f5Var != null) {
                    ((g5) f5Var).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                a((Float) null);
            } else {
                if (!d.compareAndSet(true, false)) {
                    if (f5Var != null) {
                        ((g5) f5Var).c("AdAudioTracker", "Audio volume tracking is already stopped");
                        return;
                    }
                    return;
                }
                if (f5Var != null) {
                    ((g5) f5Var).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                Throwable th = Result.exceptionOrNull-impl(z2.a(new p(contextD)));
                if (th == null || f5Var == null) {
                    return;
                }
                ((g5) f5Var).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + th.getMessage());
            }
        }
    }

    public static final void e() {
        if (d.get() && b()) {
            a(Float.valueOf(0.0f));
        }
    }

    public static void a(long j) {
        f = ((ScheduledThreadPoolExecutor) m4.c.getValue()).scheduleWithFixedDelay(new s$.ExternalSyntheticLambda2(), 0L, j, TimeUnit.MILLISECONDS);
    }

    public static void c() {
        if (!E3.a.H()) {
            a((Float) null);
        } else {
            ((ScheduledThreadPoolExecutor) m4.c.getValue()).execute(new s$.ExternalSyntheticLambda1());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized float a() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = b()     // Catch: java.lang.Throwable -> L2d
            android.media.AudioManager r1 = com.inmobi.media.s.b     // Catch: java.lang.Throwable -> L2d
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L10
            int r1 = r1.getStreamVolume(r2)     // Catch: java.lang.Throwable -> L2d
            goto L11
        L10:
            r1 = r3
        L11:
            android.media.AudioManager r4 = com.inmobi.media.s.b     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L19
            int r3 = r4.getStreamMaxVolume(r2)     // Catch: java.lang.Throwable -> L2d
        L19:
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            if (r1 >= 0) goto L1f
            goto L26
        L1f:
            if (r1 <= r3) goto L24
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L2b
        L24:
            if (r3 != 0) goto L28
        L26:
            r0 = 0
            goto L2b
        L28:
            float r0 = (float) r1
            float r1 = (float) r3
            float r0 = r0 / r1
        L2b:
            monitor-exit(r5)
            return r0
        L2d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.s.a():float");
    }

    public static void a(Float f2) {
        if (Intrinsics.areEqual((Float) e.getAndSet(f2), f2)) {
            return;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            Ka ka = (Ka) ((WeakReference) it.next()).get();
            if (ka != null) {
                ka.a.b("window.mraidview.broadcastEvent('audioVolumeChange', " + (f2 != null ? Float.valueOf(y2.a(f2.floatValue() * 100.0f)) : null) + ");");
            }
        }
    }

    public static final void d() {
        a(Float.valueOf(a.a()));
    }

    public static boolean b() {
        if (E3.a.H()) {
            AudioManager audioManager = b;
            if (audioManager != null && audioManager.isStreamMute(3)) {
                return true;
            }
        } else {
            AudioManager audioManager2 = b;
            if (audioManager2 != null && audioManager2.getStreamVolume(3) == 0) {
                return true;
            }
        }
        return Kb.o();
    }
}
