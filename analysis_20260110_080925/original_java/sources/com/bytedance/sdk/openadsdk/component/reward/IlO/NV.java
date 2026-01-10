package com.bytedance.sdk.openadsdk.component.reward.IlO;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.MY.Cc;
import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.rp.vCE;
import com.bytedance.sdk.openadsdk.utils.zPa;
import com.bytedance.sdk.openadsdk.xF.IlO.IlO;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NV {
    protected volatile boolean Bc;
    protected final oeT DmF;
    protected final IlO EV;
    protected final String NV;
    protected boolean bWL;
    protected AtomicBoolean cL = new AtomicBoolean(false);
    protected IlO cl;
    protected boolean ea;
    protected boolean hp;
    protected final Activity lEW;
    protected boolean rp;
    protected FrameLayout zPa;

    public boolean DmF() {
        return false;
    }

    public void IlO(int i) {
    }

    public void IlO(long j) {
    }

    public void lEW() {
    }

    public NV(IlO ilO) {
        this.EV = ilO;
        this.lEW = ilO.BS;
        this.NV = ilO.Cc;
        oeT oet = ilO.MY;
        this.DmF = oet;
        this.hp = OOq.Cc(oet);
    }

    public void IlO() {
        if (this.hp && !this.rp) {
            this.rp = true;
        }
    }

    public void MY(boolean z) {
        if (this.hp && this.EV.AK) {
            this.zPa = (FrameLayout) this.EV.zLG.findViewById(zPa.bYL);
            IlO(z);
        }
    }

    protected void IlO(boolean z) {
        if (this.zPa != null) {
            IlO ilO = new IlO(this.EV.gQ, this.DmF, this.EV.fdM, z, this.zPa);
            this.cl = ilO;
            ilO.IlO(this.EV.ssS);
            this.cl.IlO(true, MY());
        }
    }

    protected vCE MY() {
        return new vCE() { // from class: com.bytedance.sdk.openadsdk.component.reward.IlO.NV.1
            public void IlO() {
                NV.this.EV.ssS.IlO(false);
            }
        };
    }

    public void EO() {
        if (this.hp) {
            this.Bc = true;
            EO(this.EV.uvo);
            this.cl.IlO();
            Bc();
            if (OOq.NV(this.DmF)) {
                this.EV.lMM.vCE();
            }
        }
    }

    private void Bc() {
        int iIRy = this.DmF.IRy();
        boolean z = false;
        if (iIRy == -1) {
            if (OOq.DmF(this.DmF)) {
                IlO ilO = this.cl;
                if (ilO != null && ilO.Cc()) {
                    this.EV.es.set(true);
                    this.EV.qz.ea();
                } else {
                    this.EV.qz.kBB();
                }
            } else {
                this.EV.es.set(true);
                this.EV.qz.ea();
            }
            z = true;
        } else if (iIRy >= 0) {
            this.EV.YA.tV(false);
            if (OOq.DmF(this.DmF)) {
                IlO ilO2 = this.cl;
                if (ilO2 != null && ilO2.Cc()) {
                    this.EV.HSR.sendEmptyMessageDelayed(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT, iIRy);
                } else {
                    this.EV.HSR.sendEmptyMessageDelayed(1, iIRy);
                }
            } else {
                this.EV.HSR.sendEmptyMessageDelayed(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT, iIRy);
            }
            z = true;
        }
        if (!z || this.EV.ts == null) {
            return;
        }
        this.EV.ts.IlO(iIRy);
    }

    public void tV() {
        IlO ilO;
        if (!this.hp || this.cL.get() || (ilO = this.cl) == null) {
            return;
        }
        ilO.MY();
    }

    public void Cc() {
        IlO ilO;
        if (!this.hp || this.cL.get() || (ilO = this.cl) == null) {
            return;
        }
        ilO.EO();
    }

    public void vCE() {
        if (this.hp && !this.ea) {
            this.ea = true;
            IlO ilO = this.cl;
            if (ilO != null) {
                ilO.tV();
            }
            FrameLayout frameLayout = this.zPa;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public void IlO(Cc cc) {
        IlO ilO;
        if (this.hp && (ilO = this.cl) != null) {
            ilO.IlO(cc);
        }
    }

    public void EO(boolean z) {
        if (this.hp && this.cl != null && this.Bc) {
            this.cl.IlO(z);
        }
    }

    public boolean NV() {
        return this.Bc;
    }

    public void EV() {
        if (this.cL.compareAndSet(false, true)) {
            IlO ilO = this.cl;
            if (ilO != null) {
                ilO.IlO(true);
            }
            this.EV.lMM.Bc(true);
            this.EV.mmj.IlO(true, this.EV.qz);
            if (this.EV.mmj.Bc()) {
                this.EV.ts.IlO(this.EV.lEW);
                return;
            }
            this.EV.lMM.IlO(this.EV.uvo, true);
            this.EV.lMM.EO(true);
            this.EV.lMM.MY(true);
            this.EV.HSR.removeMessages(SettingsJsonConstants.ANALYTICS_FLUSH_INTERVAL_SECS_DEFAULT);
            return;
        }
        this.EV.lMM.DmF();
    }
}
