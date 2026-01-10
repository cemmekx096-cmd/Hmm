package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.MY.EO;
import com.google.firebase.messaging.Constants;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class NV {
    private final float Bc;
    private final float Cc;
    private final long DmF;
    private final int[] EO;
    private final int EV;
    private final int[] IlO;
    private final int[] MY;
    private final long NV;
    private final int bWL;
    private final String cL;
    private final JSONObject cl;
    private final SparseArray<EO.IlO> ea;
    private final JSONObject es;
    private final int hp;
    private final float lEW;
    private final int rp;
    private final int[] tV;
    private final float vCE;
    private final int zPa;

    private NV(IlO ilO) {
        this.IlO = ilO.EV;
        this.MY = ilO.rp;
        this.tV = ilO.hp;
        this.EO = ilO.NV;
        this.Cc = ilO.DmF;
        this.vCE = ilO.lEW;
        this.Bc = ilO.Bc;
        this.lEW = ilO.vCE;
        this.DmF = ilO.Cc;
        this.NV = ilO.tV;
        this.EV = ilO.bWL;
        this.rp = ilO.ea;
        this.hp = ilO.zPa;
        this.bWL = ilO.cL;
        this.ea = ilO.cl;
        this.cL = ilO.es;
        this.zPa = ilO.xF;
        this.cl = ilO.AXM;
        this.es = ilO.oeT;
    }

    public JSONObject IlO() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.es;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.es.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.IlO;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.IlO[1]));
            }
            int[] iArr2 = this.MY;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt(SettingsJsonConstants.ICON_WIDTH_KEY, Integer.valueOf(iArr2[0])).putOpt(SettingsJsonConstants.ICON_HEIGHT_KEY, Integer.valueOf(this.MY[1]));
            }
            int[] iArr3 = this.EO;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.EO[1]));
            }
            int[] iArr4 = this.tV;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.tV[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.Cc)).putOpt("down_y", Float.toString(this.vCE)).putOpt("up_x", Float.toString(this.Bc)).putOpt("up_y", Float.toString(this.lEW)).putOpt("down_time", Long.valueOf(this.DmF)).putOpt("up_time", Long.valueOf(this.NV)).putOpt("toolType", Integer.valueOf(this.EV)).putOpt("deviceId", Integer.valueOf(this.rp)).putOpt(Constants.ScionAnalytics.PARAM_SOURCE, Integer.valueOf(this.hp)).putOpt("ft", IlO(this.ea, this.bWL)).putOpt("click_area_type", this.cL);
            int i = this.zPa;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.cl;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject IlO(SparseArray<EO.IlO> sparseArray, int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    EO.IlO ilOValueAt = sparseArray.valueAt(i2);
                    if (ilOValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(ilOValueAt.EO)).putOpt("mr", Double.valueOf(ilOValueAt.MY)).putOpt("phase", Integer.valueOf(ilOValueAt.IlO)).putOpt("ts", Long.valueOf(ilOValueAt.tV));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static class IlO {
        private JSONObject AXM;
        private float Bc;
        private long Cc;
        private float DmF;
        float EO;
        private int[] EV;
        float IlO;
        int MY;
        private int[] NV;
        private int bWL;
        private int cL;
        private SparseArray<EO.IlO> cl;
        private int ea;
        private String es;
        private int[] hp;
        private float lEW;
        private JSONObject oeT;
        private int[] rp;
        private long tV;
        private float vCE;
        private int xF;
        private int zPa;

        public IlO IlO(int i) {
            this.xF = i;
            return this;
        }

        public IlO IlO(JSONObject jSONObject) {
            this.AXM = jSONObject;
            return this;
        }

        public IlO MY(JSONObject jSONObject) {
            this.oeT = jSONObject;
            return this;
        }

        public IlO MY(int i) {
            this.cL = i;
            return this;
        }

        public IlO IlO(SparseArray<EO.IlO> sparseArray) {
            this.cl = sparseArray;
            return this;
        }

        public IlO IlO(float f) {
            this.IlO = f;
            return this;
        }

        public IlO EO(int i) {
            this.MY = i;
            return this;
        }

        public IlO MY(float f) {
            this.EO = f;
            return this;
        }

        public IlO IlO(long j) {
            this.tV = j;
            return this;
        }

        public IlO MY(long j) {
            this.Cc = j;
            return this;
        }

        public IlO EO(float f) {
            this.vCE = f;
            return this;
        }

        public IlO tV(float f) {
            this.Bc = f;
            return this;
        }

        public IlO Cc(float f) {
            this.lEW = f;
            return this;
        }

        public IlO vCE(float f) {
            this.DmF = f;
            return this;
        }

        public IlO IlO(int[] iArr) {
            this.NV = iArr;
            return this;
        }

        public IlO MY(int[] iArr) {
            this.EV = iArr;
            return this;
        }

        public IlO EO(int[] iArr) {
            this.rp = iArr;
            return this;
        }

        public IlO tV(int[] iArr) {
            this.hp = iArr;
            return this;
        }

        public IlO tV(int i) {
            this.bWL = i;
            return this;
        }

        public IlO Cc(int i) {
            this.ea = i;
            return this;
        }

        public IlO vCE(int i) {
            this.zPa = i;
            return this;
        }

        public IlO IlO(String str) {
            this.es = str;
            return this;
        }

        public NV IlO() {
            return new NV(this);
        }
    }
}
