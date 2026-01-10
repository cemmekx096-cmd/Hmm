package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, n nVar) {
        super(0);
        this.a = context;
        this.b = nVar;
    }

    public final Object invoke() {
        this.a.unregisterReceiver(this.b);
        return Unit.INSTANCE;
    }
}
