package com.bytedance.sdk.openadsdk.core.EV;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.DmF;
import com.bytedance.sdk.openadsdk.core.EV.MY.EO;
import com.bytedance.sdk.openadsdk.core.EV.MY.IlO;
import com.bytedance.sdk.openadsdk.core.EV.MY.MY;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class tV {
    private String AXM;
    private boolean cL;
    private oeT cl;
    private boolean es;
    private final IlO hp;
    private boolean xF;
    private long zPa;
    public List<EO> IlO = new ArrayList();
    public List<EO> MY = new ArrayList();
    public List<EO> EO = new ArrayList();
    public List<EO> tV = new ArrayList();
    public List<EO> Cc = new ArrayList();
    public List<EO> vCE = new ArrayList();
    public List<EO> Bc = new ArrayList();
    public List<EO> lEW = new ArrayList();
    public List<EO> DmF = new ArrayList();
    public List<EO> NV = new ArrayList();
    public List<MY> EV = new ArrayList();
    public List<IlO> rp = new ArrayList();
    private final AtomicBoolean bWL = new AtomicBoolean(false);
    private final AtomicBoolean ea = new AtomicBoolean(false);

    public tV(IlO ilO) {
        this.hp = ilO;
    }

    public void IlO(com.bytedance.sdk.openadsdk.core.EV.IlO.IlO ilO) {
        IlO(-1L, this.IlO, ilO);
    }

    public void IlO(long j) {
        if (this.bWL.compareAndSet(false, true)) {
            IlO(j, this.MY, null, new EO.MY("show_impression", this.cl));
        }
    }

    public void MY(long j) {
        IlO(j, this.EO, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
    }

    public void EO(long j) {
        IlO(j, this.tV, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
    }

    public void tV(long j) {
        IlO(j, this.Cc, null, new EO.MY("video_progress", this.cl, 1.0f));
    }

    public void Cc(long j) {
        if (this.ea.compareAndSet(false, true)) {
            IlO(j, this.vCE, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
        }
    }

    public void vCE(long j) {
        IlO(j, this.Bc, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
    }

    public void Bc(long j) {
        IlO(j, this.lEW, null, new EO.MY("click", this.cl));
    }

    public void lEW(long j) {
        IlO(j, this.DmF, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
    }

    public void DmF(long j) {
        IlO(j, this.NV, (com.bytedance.sdk.openadsdk.core.EV.IlO.IlO) null);
    }

    public void IlO(long j, long j2, vCE vce) {
        if (System.currentTimeMillis() - this.zPa >= 1000 && j >= 0 && j2 > 0) {
            this.zPa = System.currentTimeMillis();
            float f = j / j2;
            List<EO> listIlO = IlO(j, f);
            if (f >= 0.25f && !this.cL) {
                MY("firstQuartile");
                this.cL = true;
                if (vce != null) {
                    IlO(vce, 6);
                }
                f = 0.25f;
            } else if (f >= 0.5f && !this.es) {
                MY("midpoint");
                this.es = true;
                if (vce != null) {
                    IlO(vce, 7);
                }
                f = 0.5f;
            } else if (f >= 0.75f && !this.xF) {
                MY("thirdQuartile");
                this.xF = true;
                if (vce != null) {
                    IlO(vce, 8);
                }
                f = 0.75f;
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            IlO(j, listIlO, null, new EO.MY("video_progress", this.cl, f));
        }
    }

    private void IlO(final vCE vce, final int i) {
        DmF.MY().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EV.tV.1
            @Override // java.lang.Runnable
            public void run() {
                vCE vce2 = vce;
                if (vce2 != null) {
                    vce2.IlO(i);
                }
            }
        });
    }

    private void MY(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            com.bytedance.sdk.openadsdk.tV.EO.MY(this.cl, this.AXM, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    private void IlO(long j, List<EO> list, com.bytedance.sdk.openadsdk.core.EV.IlO.IlO ilO, EO.MY my) {
        IlO ilO2 = this.hp;
        EO.IlO(list, ilO, j, ilO2 != null ? ilO2.Bc() : null, my);
    }

    private void IlO(long j, List<EO> list, com.bytedance.sdk.openadsdk.core.EV.IlO.IlO ilO) {
        IlO(j, list, ilO, null);
    }

    public List<EO> IlO(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.EV.size(); i++) {
            MY my = this.EV.get(i);
            if (my.IlO(f)) {
                arrayList.add(my);
            }
        }
        for (int i2 = 0; i2 < this.rp.size(); i2++) {
            IlO ilO = this.rp.get(i2);
            if (ilO.IlO(j)) {
                arrayList.add(ilO);
            }
        }
        return arrayList;
    }

    public void IlO(List<EO> list) {
        this.MY.addAll(list);
    }

    public void MY(List<EO> list) {
        this.EO.addAll(list);
    }

    public void EO(List<EO> list) {
        this.tV.addAll(list);
    }

    public void tV(List<EO> list) {
        this.Cc.addAll(list);
    }

    public void Cc(List<EO> list) {
        this.vCE.addAll(list);
    }

    public void vCE(List<EO> list) {
        this.Bc.addAll(list);
    }

    public void Bc(List<EO> list) {
        this.lEW.addAll(list);
    }

    public void lEW(List<MY> list) {
        this.EV.addAll(list);
        Collections.sort(this.EV);
    }

    public void DmF(List<IlO> list) {
        this.rp.addAll(list);
        Collections.sort(this.rp);
    }

    public void NV(List<EO> list) {
        this.IlO.addAll(list);
    }

    public void EV(List<EO> list) {
        this.DmF.addAll(list);
    }

    public void rp(List<EO> list) {
        this.NV.addAll(list);
    }

    public JSONObject IlO() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", EO.IlO(this.IlO));
        jSONObject.put("impressionTrackers", EO.IlO(this.MY));
        jSONObject.put("pauseTrackers", EO.IlO(this.EO));
        jSONObject.put("resumeTrackers", EO.IlO(this.tV));
        jSONObject.put("completeTrackers", EO.IlO(this.Cc));
        jSONObject.put("closeTrackers", EO.IlO(this.vCE));
        jSONObject.put("skipTrackers", EO.IlO(this.Bc));
        jSONObject.put("clickTrackers", EO.IlO(this.lEW));
        jSONObject.put("muteTrackers", EO.IlO(this.DmF));
        jSONObject.put("unMuteTrackers", EO.IlO(this.NV));
        jSONObject.put("fractionalTrackers", MY());
        jSONObject.put("absoluteTrackers", EO());
        return jSONObject;
    }

    private JSONArray MY() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<MY> it = this.EV.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().MY());
        }
        return jSONArray;
    }

    private JSONArray EO() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<IlO> it = this.rp.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().IlO());
        }
        return jSONArray;
    }

    public void IlO(JSONObject jSONObject) {
        NV(EO.IlO(jSONObject.optJSONArray("errorTrackers")));
        IlO(EO.IlO(jSONObject.optJSONArray("impressionTrackers")));
        MY(EO.IlO(jSONObject.optJSONArray("pauseTrackers"), true));
        EO(EO.IlO(jSONObject.optJSONArray("resumeTrackers"), true));
        tV(EO.IlO(jSONObject.optJSONArray("completeTrackers")));
        Cc(EO.IlO(jSONObject.optJSONArray("closeTrackers")));
        vCE(EO.IlO(jSONObject.optJSONArray("skipTrackers")));
        Bc(EO.IlO(jSONObject.optJSONArray("clickTrackers")));
        EV(EO.IlO(jSONObject.optJSONArray("muteTrackers"), true));
        rp(EO.IlO(jSONObject.optJSONArray("unMuteTrackers"), true));
        lEW(EO.MY(jSONObject.optJSONArray("fractionalTrackers")));
        DmF(EO.EO(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void IlO(oeT oet) {
        this.cl = oet;
    }

    public void IlO(String str) {
        this.AXM = str;
    }

    public void IlO(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        DmF(Collections.singletonList(new IlO.IlO(str, j).IlO()));
    }

    public void IlO(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        lEW(Collections.singletonList(new MY.IlO(str, f).IlO()));
    }

    public void IlO(tV tVVar) {
        NV(tVVar.IlO);
        IlO(tVVar.MY);
        MY(tVVar.EO);
        EO(tVVar.tV);
        tV(tVVar.Cc);
        Cc(tVVar.vCE);
        vCE(tVVar.Bc);
        Bc(tVVar.lEW);
        EV(tVVar.DmF);
        rp(tVVar.NV);
        lEW(tVVar.EV);
        DmF(tVVar.rp);
    }
}
