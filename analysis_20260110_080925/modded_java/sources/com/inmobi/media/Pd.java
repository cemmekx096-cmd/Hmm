package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Pd implements Kd {
    public static final WeakHashMap g = new WeakHashMap();
    public final Md a;
    public final f5 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public I9 f;

    public Pd(Activity activity, Md md, f5 f5Var) {
        Window window;
        Intrinsics.checkNotNullParameter(md, "windowInsetListener");
        this.a = md;
        this.b = f5Var;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        if (!E3.a.F()) {
            if (f5Var != null) {
                ((g5) f5Var).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (f5Var != null) {
                ((g5) f5Var).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object ld = weakHashMap.get(decorView);
            if (ld == null) {
                ld = new Ld(decorView);
                weakHashMap.put(decorView, ld);
            }
            Intrinsics.checkNotNullParameter(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ((Ld) ld).a.add(this);
            if (f5Var != null) {
                ((g5) f5Var).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(Nd nd, int i) {
        I9 i9A = J9.a(N3.g());
        Od od = (Od) this.d.get(Integer.valueOf(i));
        if (od == null) {
            od = new Od();
            this.d.put(Integer.valueOf(i), od);
        }
        Intrinsics.checkNotNullParameter(i9A, "orientation");
        Nd nd2 = (Nd) od.a.get(i9A);
        if (nd2 == null || !Intrinsics.areEqual(nd, nd2)) {
            g5 g5Var = this.b;
            if (g5Var != null) {
                g5Var.a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.checkNotNullParameter(i9A, "orientation");
            Intrinsics.checkNotNullParameter(nd, "insets");
            od.a.put(i9A, nd);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Od) entry.getValue()).a());
            }
            N3.a(linkedHashMap);
        } else {
            g5 g5Var2 = this.b;
            if (g5Var2 != null) {
                g5Var2.a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        }
        if (this.f != i9A) {
            this.f = i9A;
            Md md = this.a;
            Object obj = this.d.get(Integer.valueOf(i));
            Intrinsics.checkNotNull(obj);
            md.a(i9A, (Od) obj);
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            Ld ld = (Ld) weakHashMap.get(view);
            if (ld != null) {
                Intrinsics.checkNotNullParameter(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                ld.a.remove(this);
                if (ld.a.isEmpty()) {
                    ld.a();
                    weakHashMap.remove(view);
                }
            }
            g5 g5Var = this.b;
            if (g5Var != null) {
                g5Var.a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
    }
}
