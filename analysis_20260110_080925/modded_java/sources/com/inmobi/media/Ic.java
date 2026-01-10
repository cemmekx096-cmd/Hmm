package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Ic$;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class Ic extends E1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(Q0 q0, byte b) {
        super(q0);
        Intrinsics.checkNotNullParameter(q0, "obj");
    }

    public static final void a(Ic ic, Object obj) {
        Intrinsics.checkNotNullParameter(ic, "this$0");
        ic.a(obj);
    }

    public abstract void a(Object obj);

    public final void b(Object obj) {
        new Handler(Looper.getMainLooper()).post(new Ic$.ExternalSyntheticLambda0(this, obj));
    }
}
