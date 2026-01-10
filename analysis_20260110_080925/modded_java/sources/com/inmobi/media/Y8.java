package com.inmobi.media;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Y8 extends R8 {
    public final /* synthetic */ d9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(d9 d9Var) {
        super(d9Var);
        this.e = d9Var;
    }

    @Override // com.inmobi.media.R8
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new P8(context.getApplicationContext());
    }

    @Override // com.inmobi.media.R8
    public final void a(View view, D7 d7, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(d7, "asset");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, d7, adConfig);
        if (view instanceof TextView) {
            d9.a(this.e, (TextView) view, d7);
        }
    }

    @Override // com.inmobi.media.R8
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof TextView) {
            HashMap map = d9.c;
            TextView textView = (TextView) view;
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
            super.a(view);
        }
    }
}
