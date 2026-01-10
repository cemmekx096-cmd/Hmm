package com.bytedance.adsdk.MY.EO.MY;

import com.bytedance.adsdk.MY.Bc;
import com.bytedance.adsdk.MY.IlO.IlO.EO;
import com.bytedance.adsdk.MY.IlO.IlO.rp;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class DmF implements EO {
    private final boolean EO;
    private final String IlO;
    private final IlO MY;

    public enum IlO {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static IlO IlO(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public DmF(String str, IlO ilO, boolean z) {
        this.IlO = str;
        this.MY = ilO;
        this.EO = z;
    }

    public String IlO() {
        return this.IlO;
    }

    public IlO MY() {
        return this.MY;
    }

    public boolean EO() {
        return this.EO;
    }

    public EO IlO(com.bytedance.adsdk.MY.DmF dmF, Bc bc, com.bytedance.adsdk.MY.EO.EO.IlO ilO) {
        return new rp(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.MY + '}';
    }
}
