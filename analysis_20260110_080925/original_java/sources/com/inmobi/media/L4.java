package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class L4 implements Runnable {
    public final String a;
    public final ArrayList b;
    public final WeakReference c;

    public L4(M4 m4) {
        Intrinsics.checkNotNullParameter(m4, "impressionTracker");
        this.a = "L4";
        this.b = new ArrayList();
        this.c = new WeakReference(m4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intrinsics.checkNotNull(this.a);
        M4 m4 = (M4) this.c.get();
        if (m4 != null) {
            for (Map.Entry entry : m4.b.entrySet()) {
                View view = (View) entry.getKey();
                K4 k4 = (K4) entry.getValue();
                Intrinsics.checkNotNull(this.a);
                Objects.toString(k4);
                if (SystemClock.uptimeMillis() - k4.d >= k4.c) {
                    Intrinsics.checkNotNull(this.a);
                    m4.h.a(view, k4.a);
                    this.b.add(view);
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                m4.a((View) it.next());
            }
            this.b.clear();
            if (m4.b.isEmpty() || m4.e.hasMessages(0)) {
                return;
            }
            m4.e.postDelayed(m4.f, m4.g);
        }
    }
}
