package com.bytedance.sdk.openadsdk.tV.Cc.MY;

import com.bykv.vk.openvk.IlO.IlO.IlO.EO.EO;
import com.bytedance.sdk.openadsdk.core.model.oeT;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class ea {
    private oeT Cc;
    private int EO;
    private long IlO;
    private String MY;
    private EO tV;

    public ea(long j, String str, int i, EO eo, oeT oet) {
        this.IlO = j;
        this.MY = str;
        this.EO = i;
        this.tV = eo;
        this.Cc = oet;
    }

    public long IlO() {
        return this.IlO;
    }

    public String MY() {
        return this.MY;
    }

    public int EO() {
        return this.EO;
    }

    public EO tV() {
        return this.tV;
    }

    public oeT Cc() {
        return this.Cc;
    }

    public static class IlO {
        private int Bc;
        private int DmF;
        private int NV;
        private int lEW;
        private com.bykv.vk.openvk.IlO.IlO.IlO.EO.IlO rp;
        private int vCE;
        private long IlO = 0;
        private long MY = 0;
        private long EO = 0;
        private long tV = 0;
        private boolean Cc = false;
        private boolean EV = false;

        public long IlO() {
            return this.tV;
        }

        public void IlO(long j) {
            this.tV = j;
        }

        public long MY() {
            return this.IlO;
        }

        public void MY(long j) {
            this.IlO = j;
            bWL();
        }

        private void bWL() {
            long j = this.EO;
            if (j > 0) {
                long j2 = this.IlO;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.IlO = j3;
                    if (j3 == 0) {
                        this.IlO = j;
                    }
                }
            }
        }

        public long EO() {
            return this.MY;
        }

        public void EO(long j) {
            this.MY = j;
        }

        public long tV() {
            return this.EO;
        }

        public void tV(long j) {
            this.EO = j;
            bWL();
        }

        public int Cc() {
            return this.vCE;
        }

        public void IlO(int i) {
            this.vCE = i;
        }

        public int vCE() {
            return this.Bc;
        }

        public void MY(int i) {
            this.Bc = i;
        }

        public int Bc() {
            long j = this.EO;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.IlO * 100) / j), 100);
        }

        public int lEW() {
            return this.lEW;
        }

        public void EO(int i) {
            this.lEW = i;
        }

        public int DmF() {
            return this.DmF;
        }

        public int NV() {
            return this.NV;
        }

        public void tV(int i) {
            this.NV = i;
        }

        public boolean EV() {
            return this.EV;
        }

        public boolean rp() {
            return this.Cc;
        }

        public void IlO(boolean z) {
            this.Cc = z;
        }

        public void IlO(com.bykv.vk.openvk.IlO.IlO.IlO.EO.IlO ilO) {
            this.rp = ilO;
        }

        public com.bykv.vk.openvk.IlO.IlO.IlO.EO.IlO hp() {
            return this.rp;
        }
    }
}
