package com.bytedance.adsdk.ugeno.tV.tV;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.MY.EO;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class Bc extends IlO {
    private float EV;
    private boolean hp;
    private float rp;

    public Bc(Context context) {
        super(context);
    }

    public boolean IlO(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return IlO(this.MY, (MotionEvent) objArr[0]);
    }

    public boolean IlO(EO eo, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.EV = motionEvent.getRawX();
            this.rp = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(rawX - this.EV) >= 15.0f || Math.abs(rawY - this.rp) >= 15.0f) {
                    this.hp = true;
                }
            } else if (action == 3) {
                this.hp = false;
            }
        } else {
            if (this.hp) {
                this.hp = false;
                this.EV = 0.0f;
                this.rp = 0.0f;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.EV) >= 15.0f || Math.abs(rawY2 - this.rp) >= 15.0f) {
                this.hp = false;
            } else if (this.IlO != null) {
                this.IlO.IlO(eo, this.vCE, this.EO.MY());
                this.EV = 0.0f;
                this.rp = 0.0f;
                return true;
            }
        }
        return true;
    }
}
