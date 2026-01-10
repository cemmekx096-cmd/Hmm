package com.inmobi.media;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class K7 extends m8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, String str5, ArrayList arrayList, p8 p8Var) {
        super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, 12, (byte) 0, "#ff000000", CollectionsKt.mutableListOf(new String[]{"none"}), p8Var);
        Intrinsics.checkNotNullParameter(str, "borderStrokeStyle");
        Intrinsics.checkNotNullParameter(str2, "borderCornerStyle");
        Intrinsics.checkNotNullParameter(str3, "borderColor");
        Intrinsics.checkNotNullParameter(str4, "backgroundColor");
        Intrinsics.checkNotNullParameter(str5, "textColor");
        Intrinsics.checkNotNullParameter(arrayList, "textStyles");
        Intrinsics.checkNotNullParameter(p8Var, "nativeAnimationTimer");
        ((m8) this).l = i9;
        String str6 = str5.length() == 0 ? "#ff000000" : str5;
        Intrinsics.checkNotNullParameter(str6, "<set-?>");
        ((m8) this).n = str6;
        int iMin = Math.min(arrayList.size(), 1);
        ArrayList arrayList2 = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList2, "<set-?>");
        ((m8) this).o = arrayList2;
        int i10 = 0;
        if (iMin < 0) {
            return;
        }
        while (true) {
            ((m8) this).o.add(arrayList.get(i10));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }
}
