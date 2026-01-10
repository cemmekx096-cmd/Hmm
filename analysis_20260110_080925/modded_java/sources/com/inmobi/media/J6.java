package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class J6 {
    public static void a(Ca ca) {
        CopyOnWriteArrayList copyOnWriteArrayList = K6.a;
        Objects.toString(ca);
        if (ca == null) {
            return;
        }
        try {
            Iterator it = K6.a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), ca)) {
                    K6.a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }
}
