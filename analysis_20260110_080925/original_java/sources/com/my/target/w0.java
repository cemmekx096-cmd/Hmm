package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class w0 extends LinearLayoutManager {
    public final float a;
    public a b;

    public interface a {
        void a();
    }

    public w0(float f, Context context) {
        super(context, 0, false);
        this.a = d2.a(f, -1.0f) == 0 ? 0.75f : f;
    }

    public boolean a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        view.getLayoutParams().width = (int) (getWidth() * this.a);
        super.measureChildWithMargins(view, i, i2);
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }
}
