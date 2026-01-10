package com.bytedance.sdk.openadsdk.core.rp.tV;

import com.bykv.vk.openvk.IlO.IlO.IlO.IlO;
import com.bykv.vk.openvk.IlO.IlO.MY.EO.tV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class EO extends tV {
    private final IlO tV;
    private final List<MY> IlO = Collections.synchronizedList(new ArrayList());
    private int MY = 1;
    private int EO = 1;

    public interface MY extends IlO.IlO {
        void IlO(int i, int i2);
    }

    static /* synthetic */ int IlO(EO eo) {
        int i = eo.EO;
        eo.EO = i + 1;
        return i;
    }

    public EO() {
        IlO ilO = new IlO();
        this.tV = ilO;
        super.IlO(ilO);
        IlO(500);
    }

    public long zPa() {
        return super.zPa() * this.MY;
    }

    public long cl() {
        return super.cl() + ((this.EO - 1) * super.zPa());
    }

    public void EO(int i) {
        this.MY = Math.max(1, i);
    }

    public void IlO(IlO.IlO ilO) {
        if (ilO instanceof MY) {
            if (this.IlO.contains(ilO)) {
                return;
            }
            this.IlO.add((MY) ilO);
            return;
        }
        super.IlO(ilO);
    }

    public int xF() {
        return this.EO;
    }

    private class IlO implements IlO.IlO {
        private IlO() {
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO) {
            EO.IlO(EO.this);
            if (EO.this.EO <= EO.this.MY) {
                Iterator it = EO.this.IlO.iterator();
                while (it.hasNext()) {
                    ((MY) it.next()).IlO(EO.this.EO, EO.this.MY);
                }
                EO.this.DmF();
                return;
            }
            Iterator it2 = EO.this.IlO.iterator();
            while (it2.hasNext()) {
                ((MY) it2.next()).IlO(ilO);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, long j) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, j);
            }
        }

        public void MY(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).MY(ilO);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, com.bykv.vk.openvk.IlO.IlO.IlO.EO.IlO ilO2) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, ilO2);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, boolean z) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, z);
            }
        }

        public void EO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).EO(ilO);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, int i, int i2) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, i, i2);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, int i, int i2, int i3) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, i, i2, i3);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, int i) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, i);
            }
        }

        public void MY(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, int i) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).MY(ilO, i);
            }
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO, long j, long j2) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).IlO(ilO, j, j2);
            }
        }

        public void tV(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).tV(ilO);
            }
        }

        public void Cc(com.bykv.vk.openvk.IlO.IlO.IlO.IlO ilO) {
            Iterator it = EO.this.IlO.iterator();
            while (it.hasNext()) {
                ((MY) it.next()).Cc(ilO);
            }
        }
    }
}
