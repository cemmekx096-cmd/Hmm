package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class Hb extends k8 {
    public RecyclerView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(Context context) {
        super(context, (byte) 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(H7 h7, l8 l8Var, int i, int i2, d8 d8Var) {
        Intrinsics.checkNotNullParameter(h7, "scrollableContainerAsset");
        Intrinsics.checkNotNullParameter(l8Var, "dataSource");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.b = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(l8Var instanceof NativeRecyclerViewAdapter ? (NativeRecyclerViewAdapter) l8Var : null);
        addView(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
