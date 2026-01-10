package com.bytedance.sdk.openadsdk.component.reward.IlO;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.tV;
import com.bytedance.sdk.openadsdk.component.reward.top.EO;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.zPa;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class bWL {
    private boolean Cc = false;
    private final Activity EO;
    EO IlO;
    tV MY;
    private final IlO tV;
    private boolean vCE;

    public bWL(IlO ilO) {
        this.EO = ilO.BS;
        this.tV = ilO;
    }

    public void IlO() {
        if (this.Cc) {
            return;
        }
        this.Cc = true;
        if (this.tV.aa != null) {
            this.IlO = this.tV.aa;
            this.vCE = true;
        } else {
            this.IlO = this.tV.zLG.findViewById(zPa.Kn);
        }
        EO eo = this.IlO;
        if (eo != null) {
            eo.IlO(this.tV.MY);
            if (this.tV.MY.xJ()) {
                IlO(false);
            } else {
                IlO(this.tV.MY.uF());
            }
        }
    }

    public void IlO(boolean z) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setShowDislike(z);
    }

    public void MY(boolean z) {
        EO eo = this.IlO;
        if (eo != null) {
            eo.setSoundMute(z);
        }
        tV tVVar = this.MY;
        if (tVVar != null) {
            tVVar.setSoundMute(z);
        }
    }

    public void EO(boolean z) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setShowSound(z);
    }

    public void tV(boolean z) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setShowSkip(z);
    }

    public void IlO(String str, CharSequence charSequence) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setTime(String.valueOf(str), charSequence);
    }

    public void IlO(CharSequence charSequence) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setSkipText(charSequence);
    }

    public void MY() {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.showCountDownText();
    }

    public void Cc(boolean z) {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setSkipEnable(z);
    }

    public void EO() {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.showSkipButton();
    }

    public void tV() {
        EO eo = this.IlO;
        if (eo != null) {
            eo.clickSkip();
        }
    }

    public void IlO(String str) {
        EO eo = this.IlO;
        if (eo != null) {
            eo.clickSound(str);
        }
    }

    public void Cc() {
        EO eo;
        if (this.vCE || (eo = this.IlO) == null) {
            return;
        }
        eo.setSkipInvisiable();
    }

    public void IlO(com.bytedance.sdk.openadsdk.component.reward.top.MY my) {
        EO eo = this.IlO;
        if (eo != null) {
            eo.setListener(my);
        }
    }

    public void IlO(tV tVVar) {
        this.MY = tVVar;
    }

    public void IlO(int i) {
        View viewFindViewById;
        EO eo = this.IlO;
        if (eo == null || eo.getITopLayout() == null || i == 0 || (viewFindViewById = this.IlO.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + viewFindViewById.getWidth());
        if (width < BS.MY(this.EO, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += BS.MY(this.EO, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }
}
