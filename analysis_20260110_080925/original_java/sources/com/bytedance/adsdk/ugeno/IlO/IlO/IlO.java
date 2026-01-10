package com.bytedance.adsdk.ugeno.IlO.IlO;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import com.bytedance.adsdk.ugeno.MY.EO;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class IlO {
    private String EO;
    protected JSONObject IlO;
    protected EO MY;

    public abstract List<PropertyValuesHolder> EO();

    public abstract void IlO(int i, int i2);

    public abstract void IlO(Canvas canvas);

    public abstract void MY();

    public abstract void MY(Canvas canvas);

    public IlO(EO eo, JSONObject jSONObject) {
        this.IlO = jSONObject;
        this.MY = eo;
        IlO();
    }

    public void IlO() {
        this.EO = this.IlO.optString("type");
        MY();
    }

    public String tV() {
        return this.EO;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.IlO.IlO.IlO$IlO, reason: collision with other inner class name */
    public static class C0011IlO {
        public static IlO IlO(EO eo, JSONObject jSONObject) {
            if (eo == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.hashCode();
            switch (strOptString) {
                case "stretch":
                    return new Cc(eo, jSONObject);
                case "ripple":
                    return new MY(eo, jSONObject);
                case "rub_in":
                    return new EO(eo, jSONObject);
                case "shine":
                    return new tV(eo, jSONObject);
                default:
                    return null;
            }
        }
    }
}
