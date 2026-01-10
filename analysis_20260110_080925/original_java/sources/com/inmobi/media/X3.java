package com.inmobi.media;

import android.view.ViewParent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class X3 extends Lambda implements Function2 {
    public final /* synthetic */ Y3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(Y3 y3) {
        super(2);
        this.a = y3;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Map map = (Map) obj2;
        Intrinsics.checkNotNullParameter(str, "trackerName");
        Intrinsics.checkNotNullParameter(map, "macros");
        ViewParent parent = this.a.getParent();
        Q3 q3 = parent instanceof Q3 ? (Q3) parent : null;
        if (q3 != null) {
            Intrinsics.checkNotNullParameter(str, "trackerName");
            Intrinsics.checkNotNullParameter(map, "macros");
            O4 o4 = q3.d;
            if (o4 != null) {
                Intrinsics.checkNotNullParameter(str, "trackerName");
                Intrinsics.checkNotNullParameter(map, "macros");
                x xVar = o4.a.b;
                Ya ya = xVar instanceof Ya ? (Ya) xVar : null;
                if (ya != null) {
                    ya.a(str, map);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
