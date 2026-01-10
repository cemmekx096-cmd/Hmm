package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.DM;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class vSq {
    private long Bc;
    private long Cc;
    private long DmF;
    private int EV;
    public boolean IlO;
    public long MY;
    private long NV;
    private long lEW;
    private long vCE;
    private DM EO = DM.EO();
    private DM tV = DM.EO();

    public void IlO(DM dm, DM dm2, int i, DM dm3) {
        this.Cc = dm.IlO(this.EO);
        this.vCE = dm2.IlO(dm);
        this.Bc = i;
        this.lEW = dm3.IlO(dm2);
    }

    public void IlO(DM dm) {
        this.EO = dm;
    }

    public void MY(DM dm) {
        this.tV = dm;
        this.DmF = dm.IlO(this.EO);
    }

    public DM IlO() {
        return this.EO;
    }

    public long MY() {
        return this.Cc;
    }

    public long EO() {
        return this.vCE;
    }

    public long tV() {
        return this.Bc;
    }

    public long Cc() {
        return this.lEW;
    }

    public long vCE() {
        return this.DmF;
    }

    public long Bc() {
        return this.NV;
    }

    public void IlO(long j) {
        this.NV = j;
    }

    public int lEW() {
        return this.EV;
    }

    public void IlO(int i) {
        this.EV = i;
    }
}
