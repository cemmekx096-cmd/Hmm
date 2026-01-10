package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class L7 extends n8 {
    public /* synthetic */ L7(String str, String str2, K7 k7, String str3, String str4) {
        this(str, str2, k7, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(String str, String str2, K7 k7, String str3, List list, String str4) {
        super(str, str2, "CTA", k7, str3);
        Intrinsics.checkNotNullParameter(str, "assetId");
        Intrinsics.checkNotNullParameter(str2, "assetName");
        Intrinsics.checkNotNullParameter(k7, "assetStyle");
        Intrinsics.checkNotNullParameter(list, "trackers");
        Intrinsics.checkNotNullParameter(str4, "interactionMode");
        Intrinsics.checkNotNullParameter(list, "trackers");
        ((D7) this).s.addAll(list);
        Intrinsics.checkNotNullParameter(str4, "<set-?>");
        ((D7) this).g = str4;
    }
}
