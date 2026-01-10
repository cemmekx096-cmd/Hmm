package com.bytedance.adsdk.MY.EO.EO;

import com.bytedance.adsdk.MY.EO.IlO.EV;
import com.bytedance.adsdk.MY.EO.IlO.rp;
import com.bytedance.adsdk.MY.EO.MY.EO;
import com.bytedance.adsdk.MY.EO.MY.lEW;
import com.crashlytics.android.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class Cc {
    private final MY AXM;
    private final String Bc;
    private final IlO Cc;
    private final rp DmF;
    private final String EO;
    private final int EV;
    private final List<EO> IlO;
    private final com.bytedance.adsdk.MY.Bc MY;
    private final int NV;
    private final float bWL;
    private final EV cL;
    private final com.bytedance.adsdk.MY.EO.IlO.NV cl;
    private final float ea;
    private final com.bytedance.adsdk.MY.EO.IlO.MY es;
    private final float hp;
    private final com.bytedance.adsdk.MY.Cc.NV kBB;
    private final List<lEW> lEW;
    private final boolean oeT;
    private final int rp;
    private final long tV;
    private final com.bytedance.adsdk.MY.EO.MY.IlO vAh;
    private final long vCE;
    private final List<com.bytedance.adsdk.MY.Bc.IlO<Float>> xF;
    private final float zPa;

    public enum IlO {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MY {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Cc(List<EO> list, com.bytedance.adsdk.MY.Bc bc, String str, long j, IlO ilO, long j2, String str2, List<lEW> list2, rp rpVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.MY.EO.IlO.NV nv, EV ev, List<com.bytedance.adsdk.MY.Bc.IlO<Float>> list3, MY my, com.bytedance.adsdk.MY.EO.IlO.MY my2, boolean z, com.bytedance.adsdk.MY.EO.MY.IlO ilO2, com.bytedance.adsdk.MY.Cc.NV nv2) {
        this.IlO = list;
        this.MY = bc;
        this.EO = str;
        this.tV = j;
        this.Cc = ilO;
        this.vCE = j2;
        this.Bc = str2;
        this.lEW = list2;
        this.DmF = rpVar;
        this.NV = i;
        this.EV = i2;
        this.rp = i3;
        this.hp = f;
        this.bWL = f2;
        this.ea = f3;
        this.zPa = f4;
        this.cl = nv;
        this.cL = ev;
        this.xF = list3;
        this.AXM = my;
        this.es = my2;
        this.oeT = z;
        this.vAh = ilO2;
        this.kBB = nv2;
    }

    com.bytedance.adsdk.MY.Bc IlO() {
        return this.MY;
    }

    float MY() {
        return this.hp;
    }

    float EO() {
        return this.bWL / this.MY.cl();
    }

    List<com.bytedance.adsdk.MY.Bc.IlO<Float>> tV() {
        return this.xF;
    }

    public long Cc() {
        return this.tV;
    }

    public String vCE() {
        return this.EO;
    }

    public String Bc() {
        return this.Bc;
    }

    float lEW() {
        return this.ea;
    }

    float DmF() {
        return this.zPa;
    }

    List<lEW> NV() {
        return this.lEW;
    }

    public IlO EV() {
        return this.Cc;
    }

    MY rp() {
        return this.AXM;
    }

    long hp() {
        return this.vCE;
    }

    List<EO> bWL() {
        return this.IlO;
    }

    rp ea() {
        return this.DmF;
    }

    int zPa() {
        return this.rp;
    }

    int cl() {
        return this.EV;
    }

    int cL() {
        return this.NV;
    }

    com.bytedance.adsdk.MY.EO.IlO.NV es() {
        return this.cl;
    }

    EV xF() {
        return this.cL;
    }

    com.bytedance.adsdk.MY.EO.IlO.MY AXM() {
        return this.es;
    }

    public String toString() {
        return IlO(BuildConfig.FLAVOR);
    }

    public boolean oeT() {
        return this.oeT;
    }

    public com.bytedance.adsdk.MY.EO.MY.IlO vAh() {
        return this.vAh;
    }

    public com.bytedance.adsdk.MY.Cc.NV kBB() {
        return this.kBB;
    }

    public String IlO(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(vCE()).append("\n");
        Cc ccIlO = this.MY.IlO(hp());
        if (ccIlO != null) {
            sb.append("\t\tParents: ").append(ccIlO.vCE());
            Cc ccIlO2 = this.MY.IlO(ccIlO.hp());
            while (ccIlO2 != null) {
                sb.append("->").append(ccIlO2.vCE());
                ccIlO2 = this.MY.IlO(ccIlO2.hp());
            }
            sb.append(str).append("\n");
        }
        if (!NV().isEmpty()) {
            sb.append(str).append("\tMasks: ").append(NV().size()).append("\n");
        }
        if (cL() != 0 && cl() != 0) {
            sb.append(str).append("\tBackground: ").append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(cL()), Integer.valueOf(cl()), Integer.valueOf(zPa())));
        }
        if (!this.IlO.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            Iterator<EO> it = this.IlO.iterator();
            while (it.hasNext()) {
                sb.append(str).append("\t\t").append(it.next()).append("\n");
            }
        }
        return sb.toString();
    }
}
