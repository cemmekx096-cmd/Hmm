package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import com.bykv.vk.openvk.IlO.IlO.IlO.tV.EO;
import com.bytedance.sdk.openadsdk.component.reward.MY.DmF;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.tV.Bc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    public boolean AXM() {
        return true;
    }

    protected void Bc() {
    }

    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.bytedance.sdk", me);
        return super.dispatchTouchEvent(me);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oeT();
    }

    public boolean IlO(long j, boolean z) {
        Bc bc;
        if (this.MY.tl != null && this.MY.tl.IlO() != null) {
            bc = this.MY.tl.IlO().getAdShowTime();
        } else {
            bc = new Bc();
        }
        if (this.EO != null && (this.EO instanceof DmF) && !this.MY.Dxv) {
            this.MY.vAh.IlO(this.EO.oc(), bc);
        } else {
            this.MY.vAh.IlO(this.MY.tl.MY(), bc);
        }
        HashMap map = new HashMap();
        if (this.MY.tl != null) {
            map.put("dynamic_show_type", Integer.valueOf(this.MY.tl.DmF()));
            JSONObject jSONObjectIlO = this.MY.tl.IlO((JSONObject) null);
            if (jSONObjectIlO != null) {
                Iterator<String> itKeys = jSONObjectIlO.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectIlO.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.MY.vAh.IlO(new EO.IlO() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            boolean IlO;

            @Override // com.bykv.vk.openvk.IlO.IlO.IlO.tV.EO.IlO
            public void IlO(long j2, int i) {
                if (this.IlO) {
                    return;
                }
                this.IlO = true;
                TTFullScreenExpressVideoActivity.this.tV.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.cL();
                TTFullScreenExpressVideoActivity.this.MY.vAh.IlO(j2, j2);
                TTFullScreenExpressVideoActivity.this.MY.tl.MY(true);
                if (TTFullScreenExpressVideoActivity.this.MY.MY.vAh() == 36 && TTFullScreenExpressVideoActivity.this.MY.EO) {
                    TTFullScreenExpressVideoActivity.this.MY.kBB.EO().tV();
                    ea.MY();
                }
                if (TTFullScreenExpressVideoActivity.this.MY.MY.vAh() == 21 && !TTFullScreenExpressVideoActivity.this.MY.MY.NV()) {
                    TTFullScreenExpressVideoActivity.this.MY.MY.MY(true);
                    TTFullScreenExpressVideoActivity.this.MY.DM.cl();
                }
                if (TTFullScreenExpressVideoActivity.this.MY.EO) {
                    if (TTFullScreenExpressVideoActivity.this.MY.MY.FNH()) {
                        if (TTFullScreenExpressVideoActivity.this.MY.tl.DmF() == 1) {
                            TTFullScreenExpressVideoActivity.this.MY.YA.EO();
                            return;
                        }
                        return;
                    } else {
                        TTFullScreenExpressVideoActivity.this.IlO(false, 5);
                        if (oeT.Cc(TTFullScreenExpressVideoActivity.this.MY.MY)) {
                            return;
                        }
                        TTFullScreenExpressVideoActivity.this.MY.vAh.IlO("skip", true);
                        return;
                    }
                }
                if (oeT.Cc(TTFullScreenExpressVideoActivity.this.MY.MY)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenExpressVideoActivity.this.MY.tl == null || TTFullScreenExpressVideoActivity.this.MY.tl.IlO() == null) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.MY.tl.IlO().setTime("0", 0, 0, false);
                if (TTFullScreenExpressVideoActivity.this.MY.tl.lEW()) {
                    TTFullScreenExpressVideoActivity.this.MY.YA.IlO("0", "X");
                    TTFullScreenExpressVideoActivity.this.MY.YA.Cc(true);
                    TTFullScreenExpressVideoActivity.this.MY.YA.EO();
                }
            }

            @Override // com.bykv.vk.openvk.IlO.IlO.IlO.tV.EO.IlO
            public void MY(long j2, int i) {
                TTFullScreenExpressVideoActivity.this.tV.removeMessages(300);
                if (TTFullScreenExpressVideoActivity.this.MY.DM.ea != null) {
                    TTFullScreenExpressVideoActivity.this.MY.DM.ea.NV();
                }
                if (TTFullScreenExpressVideoActivity.this.MY.vAh.vCE()) {
                    TTFullScreenExpressVideoActivity.this.cl();
                    return;
                }
                TTFullScreenExpressVideoActivity.this.MY.vAh.cL();
                Object[] objArr = new Object[2];
                TTFullScreenExpressVideoActivity.this.MY.tl.IlO(true);
                if (TTFullScreenExpressVideoActivity.this.MY.EO) {
                    TTFullScreenExpressVideoActivity.this.IlO(false, 3);
                    TTFullScreenExpressVideoActivity.this.MY.vAh.IlO(1 ^ (TTFullScreenExpressVideoActivity.this.MY.vAh.nvX() ? 1 : 0), 2);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.IlO.IlO.IlO.tV.EO.IlO
            public void IlO() {
                TTFullScreenExpressVideoActivity.this.tV.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.cL();
                Object[] objArr = new Object[2];
                if (TTFullScreenExpressVideoActivity.this.MY.EO) {
                    TTFullScreenExpressVideoActivity.this.IlO(false, 6);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.MY.vAh.IlO(!TTFullScreenExpressVideoActivity.this.MY.vAh.nvX() ? 1 : 0, !TTFullScreenExpressVideoActivity.this.MY.vAh.nvX() ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.MY.vAh.cL();
            }

            @Override // com.bykv.vk.openvk.IlO.IlO.IlO.tV.EO.IlO
            public void IlO(long j2, long j3) {
                if (!TTFullScreenExpressVideoActivity.this.MY.KC && TTFullScreenExpressVideoActivity.this.MY.vAh.vCE()) {
                    TTFullScreenExpressVideoActivity.this.MY.vAh.xF();
                }
                if (TTFullScreenExpressVideoActivity.this.MY.NV.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.tV.removeMessages(300);
                if (j2 != TTFullScreenExpressVideoActivity.this.MY.vAh.rp()) {
                    TTFullScreenExpressVideoActivity.this.cL();
                }
                if (TTFullScreenExpressVideoActivity.this.MY.vAh.vCE()) {
                    TTFullScreenExpressVideoActivity.this.MY.vAh.IlO(j2, j3);
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTFullScreenExpressVideoActivity.vCE = (int) (tTFullScreenExpressVideoActivity.MY.vAh.YA() - j4);
                    int i = (int) j4;
                    if ((TTFullScreenExpressVideoActivity.this.MY.xF.get() || TTFullScreenExpressVideoActivity.this.MY.EV.get()) && TTFullScreenExpressVideoActivity.this.MY.vAh.vCE()) {
                        TTFullScreenExpressVideoActivity.this.MY.vAh.xF();
                    }
                    if (TTFullScreenExpressVideoActivity.this.MY.vAh.tV()) {
                        if (TTFullScreenExpressVideoActivity.this.DmF != null) {
                            TTFullScreenExpressVideoActivity.this.DmF.IlO(j2);
                        }
                    } else if (TTFullScreenExpressVideoActivity.this.DmF == null || !TTFullScreenExpressVideoActivity.this.DmF.IlO()) {
                        if (TTFullScreenExpressVideoActivity.this.MY.tl != null && TTFullScreenExpressVideoActivity.this.MY.tl.IlO() != null) {
                            TTFullScreenExpressVideoActivity.this.MY.tl.IlO().setTime(String.valueOf(TTFullScreenExpressVideoActivity.this.vCE), i, 0, false);
                        }
                        if (TTFullScreenExpressVideoActivity.this.MY.tl.lEW() || TTFullScreenExpressVideoActivity.this.MY.MY.pS()) {
                            TTFullScreenExpressVideoActivity.this.EO(i);
                            if (TTFullScreenExpressVideoActivity.this.vCE >= 0) {
                                TTFullScreenExpressVideoActivity.this.MY.YA.tV(true);
                                TTFullScreenExpressVideoActivity.this.MY.YA.IlO(String.valueOf(TTFullScreenExpressVideoActivity.this.vCE), null);
                            }
                        }
                    }
                }
            }
        });
        return this.MY.vAh.IlO(j, z, map, this.EO);
    }
}
