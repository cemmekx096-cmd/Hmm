package com.my.target;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class mb$$ExternalSyntheticLambda1 implements View.OnTouchListener {
    public final /* synthetic */ mb f$0;
    public final /* synthetic */ c1 f$1;
    public final /* synthetic */ View.OnClickListener f$2;

    public /* synthetic */ mb$$ExternalSyntheticLambda1(mb mbVar, c1 c1Var, View.OnClickListener onClickListener) {
        this.f$0 = mbVar;
        this.f$1 = c1Var;
        this.f$2 = onClickListener;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f$0.a(this.f$1, this.f$2, view, motionEvent);
    }
}
