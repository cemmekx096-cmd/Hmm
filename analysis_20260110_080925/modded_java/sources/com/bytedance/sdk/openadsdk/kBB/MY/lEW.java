package com.bytedance.sdk.openadsdk.kBB.MY;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.kBB.MY.Cc;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class lEW extends MY {
    private int tV;

    public int vCE() {
        return ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    public lEW(Integer num, View view, oeT oet, Cc.IlO ilO) {
        super(num, view, oet, 2000, ilO);
        this.tV = 0;
    }

    protected boolean EO() {
        return vCE.IlO((View) this.IlO.get(), this.MY.fHv()) && this.tV == 1;
    }

    protected void tV() {
        super.tV();
    }

    public void IlO() {
        if (this.tV != 1) {
            return;
        }
        super.IlO();
    }

    protected void MY(int i) {
        if (DmF()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.tV = 0;
            lEW();
        }
        if (i == 3 || i == 2) {
            this.tV = 2;
            lEW();
        }
        if (this.tV == 1 || i != 0) {
            return;
        }
        this.tV = 1;
        IlO();
    }

    public boolean rp() {
        int i = this.tV;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.EO.set(false);
        }
        return !z || super.rp();
    }
}
