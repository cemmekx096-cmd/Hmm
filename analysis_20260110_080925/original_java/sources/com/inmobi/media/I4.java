package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class I4 implements ud {
    public final /* synthetic */ M4 a;

    public I4(M4 m4) {
        this.a = m4;
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "visibleViews");
        Intrinsics.checkNotNullParameter(arrayList2, "invisibleViews");
        Intrinsics.checkNotNullExpressionValue(this.a.d, "access$getTAG$p(...)");
        Objects.toString(arrayList);
        Objects.toString(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            K4 k4 = (K4) this.a.a.get(view);
            if (k4 == null) {
                this.a.a(view);
            } else {
                K4 k42 = (K4) this.a.b.get(view);
                if (!Intrinsics.areEqual(k4.a, k42 != null ? k42.a : null)) {
                    k4.d = SystemClock.uptimeMillis();
                    this.a.b.put(view, k4);
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.a.b.remove((View) it2.next());
        }
        M4 m4 = this.a;
        if (m4.e.hasMessages(0)) {
            return;
        }
        m4.e.postDelayed(m4.f, m4.g);
    }
}
