package com.bytedance.sdk.component.IlO;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.IlO.Bc;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class IlO {
    Bc Bc;
    protected String Cc;
    protected lEW EO;
    protected Context IlO;
    protected hp MY;
    protected Handler tV = new Handler(Looper.getMainLooper());
    protected volatile boolean vCE = false;
    private final Map<String, Bc> lEW = new HashMap();

    protected abstract Context IlO(NV nv);

    protected abstract String IlO();

    protected abstract void IlO(String str);

    protected abstract void MY(NV nv);

    protected IlO() {
    }

    protected void invokeMethod(final String str) {
        if (this.vCE) {
            return;
        }
        this.tV.post(new Runnable() { // from class: com.bytedance.sdk.component.IlO.IlO.1
            @Override // java.lang.Runnable
            public void run() {
                if (IlO.this.vCE) {
                    return;
                }
                zPa zpaIlO = null;
                try {
                    zpaIlO = IlO.this.IlO(PangleNetworkBridge.jsonObjectInit(str));
                } catch (Exception unused) {
                }
                if (zPa.IlO(zpaIlO)) {
                    new StringBuilder("By pass invalid call: ").append(zpaIlO);
                    if (zpaIlO != null) {
                        IlO.this.MY(pP.IlO(new es(zpaIlO.IlO, "Failed to parse invocation.")), zpaIlO);
                        return;
                    }
                    return;
                }
                IlO.this.IlO(zpaIlO);
            }
        });
    }

    protected void IlO(String str, zPa zpa) {
        IlO(str);
    }

    protected void MY() {
        this.Bc.IlO();
        Iterator<Bc> it = this.lEW.values().iterator();
        while (it.hasNext()) {
            it.next().IlO();
        }
        this.tV.removeCallbacksAndMessages(null);
        this.vCE = true;
    }

    protected final void IlO(zPa zpa) {
        String strIlO;
        if (this.vCE || (strIlO = IlO()) == null) {
            return;
        }
        Bc bcMY = MY(zpa.Bc);
        if (bcMY == null) {
            new StringBuilder("Received call with unknown namespace, ").append(zpa);
            if (this.MY != null) {
                IlO();
            }
            MY(pP.IlO(new es(-4, "Namespace " + zpa.Bc + " unknown.")), zpa);
            return;
        }
        vCE vce = new vCE();
        vce.MY = strIlO;
        vce.IlO = this.IlO;
        vce.EO = bcMY;
        try {
            Bc.IlO IlO = bcMY.IlO(zpa, vce);
            if (IlO == null) {
                new StringBuilder("Received call but not registered, ").append(zpa);
                if (this.MY != null) {
                    IlO();
                }
                MY(pP.IlO(new es(-2, "Function " + zpa.tV + " is not registered.")), zpa);
                return;
            }
            if (IlO.IlO) {
                MY(IlO.MY, zpa);
            }
            if (this.MY != null) {
                IlO();
            }
        } catch (Exception e) {
            new StringBuilder("call finished with error, ").append(zpa);
            MY(pP.IlO(e), zpa);
        }
    }

    final void IlO(NV nv, oeT oet) {
        this.IlO = IlO(nv);
        this.EO = nv.tV;
        this.MY = nv.DmF;
        this.Bc = new Bc(nv, this, oet);
        this.Cc = nv.EV;
        MY(nv);
    }

    final void MY(String str, zPa zpa) {
        JSONObject jSONObject;
        if (this.vCE || TextUtils.isEmpty(zpa.vCE)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            DmF.IlO(new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
        }
        new StringBuilder("Invoking js callback: ").append(zpa.vCE);
        try {
            jSONObject = PangleNetworkBridge.jsonObjectInit(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        IlO(ea.IlO().IlO("__msg_type", "callback").IlO("__callback_id", zpa.vCE).IlO("__params", jSONObject).MY(), zpa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zPa IlO(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.vCE) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (IlO() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = BuildConfig.FLAVOR;
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return zPa.IlO().IlO(string2).MY(string).EO(strOptString3).tV(strOptString).Cc(strOptString2).vCE(strOptString4).Bc(jSONObject.optString("__iframe_url")).IlO();
        } catch (JSONException unused2) {
            return zPa.IlO(strOptString2, -1);
        }
    }

    private Bc MY(String str) {
        if (TextUtils.equals(str, this.Cc) || TextUtils.isEmpty(str)) {
            return this.Bc;
        }
        return this.lEW.get(str);
    }
}
