package com.bytedance.sdk.openadsdk.core.NV.Cc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.MY.EO;
import com.bytedance.adsdk.ugeno.core.EV;
import com.bytedance.sdk.openadsdk.core.es;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.widget.Cc;
import com.bytedance.sdk.openadsdk.utils.zLG;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class tV {
    private final Context Bc;
    private EO Cc;
    private final String DmF;
    private EO EO;
    private JSONObject EV;
    private Cc NV;
    private boolean bWL;
    private boolean ea;
    private boolean hp;
    private final oeT lEW;
    private final JSONObject rp;
    private EO tV;
    private JSONArray zPa;
    private int IlO = -1;
    private int MY = -1;
    private final String vCE = "UGenSwiperEvent";

    public tV(Context context, oeT oet, String str, JSONObject jSONObject) {
        this.Bc = context;
        this.lEW = oet;
        this.DmF = str;
        this.rp = jSONObject;
    }

    public void IlO(EO<View> eo) {
        EO EO = eo.EO("swiperLayout");
        this.Cc = EO;
        if (EO instanceof com.bytedance.adsdk.ugeno.EO) {
            this.zPa = this.rp.optJSONArray("dpa_data");
            this.EO = eo.EO("swiperLeftArrow");
            this.tV = eo.EO("swiperRightArrow");
            this.Cc.IlO(new com.bytedance.adsdk.ugeno.vCE.EO() { // from class: com.bytedance.sdk.openadsdk.core.NV.Cc.tV.1
                public void IlO(boolean z, int i) {
                }

                public void IlO(boolean z, int i, float f, int i2) {
                }

                public void IlO(boolean z, int i, int i2, boolean z2, boolean z3) {
                    tV.this.MY = i;
                    tV.this.IlO = i2;
                    tV.this.hp = z;
                    tV.this.bWL = z2;
                    tV.this.ea = z3;
                    tV.this.IlO(z, z2, z3);
                    tV.this.IlO(i);
                }
            });
        }
    }

    public void IlO() {
        IlO(this.hp, this.bWL, this.ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(boolean z, boolean z2, boolean z3) {
        EO eo = this.EO;
        if (eo == null || this.tV == null) {
            return;
        }
        View viewEV = eo.EV();
        View viewEV2 = this.tV.EV();
        JSONArray jSONArray = this.zPa;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewEV.setVisibility(8);
            viewEV2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (viewEV instanceof TextView) {
                IlO((TextView) viewEV, 90);
            }
            if (viewEV2 instanceof TextView) {
                IlO((TextView) viewEV2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (viewEV instanceof TextView) {
                IlO((TextView) viewEV, 255);
            }
            if (viewEV2 instanceof TextView) {
                IlO((TextView) viewEV2, 90);
                return;
            }
            return;
        }
        if (viewEV instanceof TextView) {
            IlO((TextView) viewEV, 255);
        }
        if (viewEV2 instanceof TextView) {
            IlO((TextView) viewEV2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.tV.EO.MY(this.lEW, this.DmF, "carousel_show", jSONObject);
    }

    private void IlO(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void MY() {
        int i;
        com.bytedance.adsdk.ugeno.EO eo = this.Cc;
        if (!(eo instanceof com.bytedance.adsdk.ugeno.EO) || (i = this.IlO) == -1) {
            return;
        }
        eo.IlO(i - 1);
    }

    public void EO() {
        int i;
        com.bytedance.adsdk.ugeno.EO eo = this.Cc;
        if (!(eo instanceof com.bytedance.adsdk.ugeno.EO) || (i = this.IlO) == -1) {
            return;
        }
        eo.IlO(i + 1);
    }

    public void IlO(Cc cc) {
        this.NV = cc;
    }

    public boolean IlO(EV ev) {
        JSONObject jSONObjectOptJSONObject;
        this.EV = null;
        int i = this.MY;
        if (i != -1 && i != 0) {
            try {
                JSONObject jSONObjectEO = ev.EO();
                if (jSONObjectEO != null && (jSONObjectOptJSONObject = jSONObjectEO.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.zPa != null) {
                            String strIlO = com.bytedance.adsdk.ugeno.EO.MY.IlO(jSONObjectOptJSONObject.optString("url"), this.zPa.optJSONObject(this.MY));
                            String strIlO2 = com.bytedance.adsdk.ugeno.EO.MY.IlO(jSONObjectOptJSONObject.optString("fallback_url"), this.zPa.optJSONObject(this.MY));
                            jSONObjectOptJSONObject.put("url", strIlO);
                            jSONObjectOptJSONObject.put("fallback_url", strIlO2);
                            IlO(jSONObjectOptJSONObject, this.zPa.optJSONObject(this.MY));
                        }
                        IlO(jSONObjectOptJSONObject, ev.IlO().EV());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.oeT.EO("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void IlO(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.EV = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.EV.putOpt(next, com.bytedance.adsdk.ugeno.EO.MY.IlO((String) this.EV.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.EV);
            } catch (Throwable unused2) {
            }
        }
    }

    public JSONObject tV() {
        return this.EV;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean IlO(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            goto L25
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.xF.IlO(r6)
            if (r4 != 0) goto L26
            goto L25
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.xF.IlO(r5)
            if (r4 != 0) goto L26
        L25:
            r0 = r1
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.NV.Cc.tV.IlO(int, java.lang.String, java.lang.String):boolean");
    }

    private void IlO(JSONObject jSONObject, View view) {
        if (IlO(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            es.IlO(IlO(view), this.Bc instanceof Activity, jSONObject, this.lEW, this.DmF, zLG.IlO(this.DmF), (WebView) null, this.NV);
        }
    }

    private Context IlO(View view) {
        Activity activityIlO = view != null ? com.bytedance.sdk.component.utils.MY.IlO(view) : null;
        return activityIlO == null ? this.Bc : activityIlO;
    }
}
