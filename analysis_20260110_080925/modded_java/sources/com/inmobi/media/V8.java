package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class V8 extends R8 {
    public final /* synthetic */ d9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8(d9 d9Var) {
        super(d9Var);
        this.e = d9Var;
    }

    @Override // com.inmobi.media.R8
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageView(context.getApplicationContext());
    }

    @Override // com.inmobi.media.R8
    public final void a(View view, D7 d7, AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(d7, "asset");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, d7, adConfig);
        if (view instanceof ImageView) {
            d9.a(this.e, (ImageView) view, d7);
        }
    }

    @Override // com.inmobi.media.R8
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(null);
            super.a(view);
        }
    }
}
