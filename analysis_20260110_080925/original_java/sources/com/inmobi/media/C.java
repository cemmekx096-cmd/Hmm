package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class C {
    public final RectF a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public C(RectF rectF, ArrayList arrayList, int i, int i2) {
        Intrinsics.checkNotNullParameter(rectF, "visibleRect");
        Intrinsics.checkNotNullParameter(arrayList, "obstructions");
        this.a = rectF;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return Intrinsics.areEqual(this.a, c.a) && Intrinsics.areEqual(this.b, c.b) && this.c == c.c && this.d == c.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.a + ", obstructions=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ')';
    }
}
