package com.bytedance.sdk.component.adexpress.IlO.EO;

import android.text.TextUtils;
import android.util.Pair;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class IlO {
    private Map<String, IlO> Bc = new ConcurrentHashMap();
    private MY Cc;
    private String EO;
    private String IlO;
    private String MY;
    private List<C0015IlO> tV;
    private String vCE;

    public Map<String, IlO> IlO() {
        return this.Bc;
    }

    public String MY() {
        return this.IlO;
    }

    public void IlO(String str) {
        this.IlO = str;
    }

    public String EO() {
        return this.MY;
    }

    public void MY(String str) {
        this.MY = str;
    }

    public String tV() {
        return this.EO;
    }

    public void EO(String str) {
        this.EO = str;
    }

    public void IlO(MY my) {
        this.Cc = my;
    }

    public MY Cc() {
        return this.Cc;
    }

    public List<C0015IlO> vCE() {
        if (this.tV == null) {
            this.tV = new ArrayList();
        }
        return this.tV;
    }

    public void IlO(List<C0015IlO> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.tV = list;
    }

    public void tV(String str) {
        this.vCE = str;
    }

    public String Bc() {
        return this.vCE;
    }

    public boolean lEW() {
        return (TextUtils.isEmpty(tV()) || TextUtils.isEmpty(EO()) || TextUtils.isEmpty(MY())) ? false : true;
    }

    public JSONObject DmF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", MY());
            jSONObject.putOpt(JsonParser.EXCLUDE_VERSION, EO());
            jSONObject.putOpt("main", tV());
            if (!TextUtils.isEmpty(this.vCE)) {
                jSONObject.put("template_fetch_url", this.vCE);
            }
            JSONArray jSONArray = new JSONArray();
            if (vCE() != null) {
                for (C0015IlO c0015IlO : vCE()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0015IlO.IlO());
                    jSONObject2.putOpt("md5", c0015IlO.MY());
                    jSONObject2.putOpt("level", Integer.valueOf(c0015IlO.EO()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.Bc.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.Bc.keySet()) {
                    IlO ilO = this.Bc.get(str);
                    if (ilO != null) {
                        jSONObject3.put(str, ilO.DmF());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            MY myCc = Cc();
            if (myCc != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", myCc.IlO);
                jSONObject4.put("md5", myCc.MY);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listMY = myCc.MY();
                if (listMY != null) {
                    for (Pair<String, String> pair : listMY) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String NV() {
        JSONObject jSONObjectDmF;
        if (!lEW() || (jSONObjectDmF = DmF()) == null) {
            return null;
        }
        return jSONObjectDmF.toString();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.IlO.EO.IlO$IlO, reason: collision with other inner class name */
    public static class C0015IlO {
        private int EO;
        private String IlO;
        private String MY;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0015IlO) {
                String str2 = this.IlO;
                if (str2 != null) {
                    C0015IlO c0015IlO = (C0015IlO) obj;
                    if (str2.equals(c0015IlO.IlO()) && (str = this.MY) != null && str.equals(c0015IlO.MY())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String IlO() {
            return this.IlO;
        }

        public void IlO(String str) {
            this.IlO = str;
        }

        public String MY() {
            return this.MY;
        }

        public void MY(String str) {
            this.MY = str;
        }

        public int EO() {
            return this.EO;
        }

        public void IlO(int i) {
            this.EO = i;
        }
    }

    public static class MY {
        private List<Pair<String, String>> EO;
        private String IlO;
        private String MY;

        public String IlO() {
            return this.IlO;
        }

        public void IlO(String str) {
            this.IlO = str;
        }

        public void MY(String str) {
            this.MY = str;
        }

        public void IlO(List<Pair<String, String>> list) {
            this.EO = list;
        }

        public List<Pair<String, String>> MY() {
            return this.EO;
        }
    }

    public static IlO Cc(String str) {
        if (str == null) {
            return null;
        }
        try {
            return IlO(PangleNetworkBridge.jsonObjectInit(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static IlO IlO(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        IlO ilO = new IlO();
        ilO.IlO(jSONObject.optString("name"));
        ilO.MY(jSONObject.optString(JsonParser.EXCLUDE_VERSION));
        ilO.EO(jSONObject.optString("main"));
        ilO.tV(jSONObject.optString("template_fetch_url", BuildConfig.FLAVOR));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0015IlO c0015IlO = new C0015IlO();
                c0015IlO.IlO(jSONObjectOptJSONObject2.optString("url"));
                c0015IlO.MY(jSONObjectOptJSONObject2.optString("md5"));
                c0015IlO.IlO(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0015IlO);
            }
        }
        ilO.IlO(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    IlO IlO = IlO(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (IlO != null) {
                        ilO.IlO().put(next, IlO);
                    }
                }
            }
        } catch (Exception e) {
            new StringBuilder("parse exception:").append(e.getMessage());
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            MY my = new MY();
            my.IlO(jSONObjectOptJSONObject.optString("url"));
            my.MY(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                my.IlO(arrayList2);
            }
            ilO.IlO(my);
        }
        if (ilO.lEW()) {
            return ilO;
        }
        return null;
    }
}
