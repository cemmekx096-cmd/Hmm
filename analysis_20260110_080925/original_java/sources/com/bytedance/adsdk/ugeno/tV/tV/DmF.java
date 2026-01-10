package com.bytedance.adsdk.ugeno.tV.tV;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.Bc.DmF;
import com.bytedance.adsdk.ugeno.Bc.EO;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class DmF extends IlO implements DmF.IlO {
    private int EV;
    private Handler hp;
    private boolean rp;

    public DmF(Context context) {
        super(context);
        this.EV = 500;
        this.hp = new com.bytedance.adsdk.ugeno.Bc.DmF(Looper.getMainLooper(), this);
    }

    public boolean IlO(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.EV = EO.IlO((String) this.Cc.get("delay"), 500);
        return IlO(this.MY, motionEvent);
    }

    private boolean IlO(com.bytedance.adsdk.ugeno.MY.EO eo, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hp.sendEmptyMessageDelayed(1102, this.EV);
        } else {
            if (action == 1) {
                if (this.rp && this.IlO != null) {
                    this.IlO.IlO(this.MY, this.vCE, this.EO.MY());
                    this.rp = false;
                    Handler handler = this.hp;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.hp;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.rp = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.hp;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.rp = false;
            }
        }
        return true;
    }

    public void IlO(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.rp = true;
        Handler handler = this.hp;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
