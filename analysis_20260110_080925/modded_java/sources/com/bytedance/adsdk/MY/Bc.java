package com.bytedance.adsdk.MY;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.MY.EO.EO.Cc;
import com.bytedance.adsdk.MY.EO.tV;
import com.bytedance.adsdk.MY.EO.vCE;
import com.crashlytics.android.BuildConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class Bc {
    private SparseArray<tV> Bc;
    private Map<String, com.bytedance.adsdk.MY.EO.EO> Cc;
    private List<Cc> DmF;
    private Map<String, List<Cc>> EO;
    private float EV;
    private Rect NV;
    private boolean bWL;
    private IlO cL;
    private MY es;
    private float hp;
    private LongSparseArray<Cc> lEW;
    private float rp;
    private Map<String, NV> tV;
    private List<vCE> vCE;
    private EO zPa;
    private final es IlO = new es();
    private final HashSet<String> MY = new HashSet<>();
    private int ea = 0;
    private String cl = BuildConfig.FLAVOR;

    public static class EO {
        public JSONArray Bc;
        public int[] Cc;
        public String EO;
        public int IlO;
        public String MY;
        public String tV;
        public String vCE;
    }

    public static class IlO {
        public JSONArray Bc;
        public int Cc;
        public Map<String, Object> EO;
        public int IlO;
        public Map<String, Object> MY;
        public int tV;
        public String vCE;
    }

    public static class MY {
        public JSONArray EO;
        public String IlO;
        public int[][] MY;
    }

    public void IlO(Rect rect, float f, float f2, float f3, List<Cc> list, LongSparseArray<Cc> longSparseArray, Map<String, List<Cc>> map, Map<String, NV> map2, SparseArray<tV> sparseArray, Map<String, com.bytedance.adsdk.MY.EO.EO> map3, List<vCE> list2, EO eo, String str, IlO ilO, MY my) {
        this.NV = rect;
        this.EV = f;
        this.rp = f2;
        this.hp = f3;
        this.DmF = list;
        this.lEW = longSparseArray;
        this.EO = map;
        this.tV = map2;
        this.Bc = sparseArray;
        this.Cc = map3;
        this.vCE = list2;
        this.zPa = eo;
        this.cl = str;
        this.cL = ilO;
        this.es = my;
    }

    public void IlO(String str) {
        this.MY.add(str);
    }

    public void IlO(boolean z) {
        this.bWL = z;
    }

    public void IlO(int i) {
        this.ea += i;
    }

    public boolean IlO() {
        return this.bWL;
    }

    public int MY() {
        return this.ea;
    }

    public void MY(boolean z) {
        this.IlO.IlO(z);
    }

    public es EO() {
        return this.IlO;
    }

    public Cc IlO(long j) {
        return this.lEW.get(j);
    }

    public Rect tV() {
        return this.NV;
    }

    public float Cc() {
        return (long) ((cl() / this.hp) * 1000.0f);
    }

    public float vCE() {
        return this.EV;
    }

    public float Bc() {
        return this.rp;
    }

    public float IlO(float f) {
        return com.bytedance.adsdk.MY.vCE.Cc.IlO(this.EV, this.rp, f);
    }

    public EO lEW() {
        return this.zPa;
    }

    public String DmF() {
        return this.cl;
    }

    public MY NV() {
        return this.es;
    }

    public IlO EV() {
        return this.cL;
    }

    public float rp() {
        return this.hp;
    }

    public List<Cc> hp() {
        return this.DmF;
    }

    public List<Cc> MY(String str) {
        return this.EO.get(str);
    }

    public SparseArray<tV> bWL() {
        return this.Bc;
    }

    public Map<String, com.bytedance.adsdk.MY.EO.EO> ea() {
        return this.Cc;
    }

    public vCE EO(String str) {
        int size = this.vCE.size();
        for (int i = 0; i < size; i++) {
            vCE vce = this.vCE.get(i);
            if (vce.IlO(str)) {
                return vce;
            }
        }
        return null;
    }

    public Map<String, NV> zPa() {
        return this.tV;
    }

    public float cl() {
        return this.rp - this.EV;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Cc> it = this.DmF.iterator();
        while (it.hasNext()) {
            sb.append(it.next().IlO("\t"));
        }
        return sb.toString();
    }
}
