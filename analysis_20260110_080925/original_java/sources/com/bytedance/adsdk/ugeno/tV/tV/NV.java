package com.bytedance.adsdk.ugeno.tV.tV;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.Bc.DmF;
import com.bytedance.adsdk.ugeno.Bc.EO;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NV extends IlO implements DmF.IlO {
    private int EV;
    private Handler rp;

    public NV(Context context) {
        super(context);
        this.EV = 500;
        this.rp = new com.bytedance.adsdk.ugeno.Bc.DmF(Looper.getMainLooper(), this);
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
            this.rp.sendEmptyMessageDelayed(1101, this.EV);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.rp.removeMessages(1101);
        return false;
    }

    public void IlO(Message message) {
        if (message.what != 1101) {
            return;
        }
        if (this.IlO != null) {
            this.IlO.IlO(this.MY, this.vCE, this.EO.MY());
        }
        Handler handler = this.rp;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
