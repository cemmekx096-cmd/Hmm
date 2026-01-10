package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.RendererCapabilities;
import com.bytedance.sdk.openadsdk.EO.NV;
import com.bytedance.sdk.openadsdk.core.EO.Bc;
import com.bytedance.sdk.openadsdk.core.rp.EO.EO;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.bytedance.sdk.openadsdk.multipro.MY;
import com.bytedance.sdk.openadsdk.multipro.tV.tV;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.bytedance.sdk.openadsdk.utils.rp;
import com.bytedance.sdk.openadsdk.utils.tl;
import com.bytedance.sdk.openadsdk.utils.zLG;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class DmF {
    public static hp IlO;
    public static final Set<String> MY = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.DmF.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean cl;
    private EO AXM;
    private int Bc;
    private String Cc;
    private String DmF;
    private boolean EO;
    private int EV;
    private String NV;
    private Bitmap bWL;
    private String cL;
    private Integer ea;
    private boolean es;
    private boolean hp;
    private boolean lEW;
    private volatile ConcurrentHashMap<String, Bc.IlO> oeT;
    private boolean rp;
    private String tV;
    private String vCE;
    private String xF;
    private int zPa;

    public boolean cl() {
        return true;
    }

    public static void IlO(hp hpVar) {
        IlO = hpVar;
    }

    public boolean IlO() {
        return this.es;
    }

    public void IlO(boolean z) {
        this.es = z;
    }

    private DmF() {
        this.EO = false;
        this.EV = 0;
        this.rp = true;
        this.hp = false;
        this.bWL = null;
        this.ea = null;
        this.zPa = -1;
        this.oeT = null;
    }

    public static DmF MY() {
        return IlO.IlO;
    }

    private static class IlO {
        private static final DmF IlO = new DmF();
    }

    public boolean EO() {
        return tV.IlO("sp_global_file", "sdk_activate_init", true);
    }

    public void MY(boolean z) {
        tV.IlO("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public String tV() throws JSONException {
        if (TextUtils.isEmpty(this.tV)) {
            String strIlO = IlO("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strIlO)) {
                this.tV = strIlO;
            }
        }
        return this.tV;
    }

    public static void IlO(int i) throws JSONException {
        if (i >= 0) {
            IlO("domain_index", String.valueOf(i));
        }
    }

    public static int Cc() {
        try {
            String strIlO = IlO("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strIlO)) {
                return 0;
            }
            return Integer.valueOf(strIlO).intValue();
        } catch (Throwable th) {
            Object[] objArr = new Object[2];
            th.getMessage();
            return 0;
        }
    }

    public static void MY(int i) throws JSONException {
        if (i >= 0) {
            IlO("config_fail_times", String.valueOf(i));
        }
    }

    public static int vCE() {
        try {
            String strIlO = IlO("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strIlO)) {
                return 0;
            }
            return Integer.valueOf(strIlO).intValue();
        } catch (Throwable th) {
            Object[] objArr = new Object[2];
            th.getMessage();
            return 0;
        }
    }

    public void IlO(String str) throws JSONException {
        NV(str);
        this.tV = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IlO("app_id", str);
        hp.aP().tV(7);
    }

    public String Bc() throws JSONException {
        String str = this.Cc;
        if (str != null) {
            return str;
        }
        String strIlO = IlO("mediation_info", Long.MAX_VALUE);
        this.Cc = strIlO;
        if (strIlO == null) {
            this.Cc = BuildConfig.FLAVOR;
        }
        return this.Cc;
    }

    public void MY(String str) throws JSONException {
        this.Cc = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IlO("mediation_info", str);
    }

    public String lEW() {
        if (TextUtils.isEmpty(this.vCE)) {
            this.vCE = IlO(cl.IlO());
        }
        return this.vCE;
    }

    private String IlO(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY));
        } catch (Throwable unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public void EO(int i) {
        if (MY.EO()) {
            tV.IlO("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.Bc = i;
    }

    public int DmF() {
        if (MY.EO()) {
            return tV.IlO("sp_global_icon_id", "icon_id", 0);
        }
        return this.Bc;
    }

    public int NV() {
        Integer num = this.ea;
        if (num != null) {
            return num.intValue();
        }
        return tV.IlO("sp_global_privacy", "tt_gdpr", -1);
    }

    public void tV(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.ea;
            if (num == null || num.intValue() != i) {
                this.ea = Integer.valueOf(i);
                if (!mmj.vCE()) {
                    IlO(num, i);
                } else {
                    bWL.MY().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.DmF.2
                        @Override // java.lang.Runnable
                        public void run() {
                            DmF.this.IlO(num, i);
                        }
                    });
                }
            }
        }
    }

    public void Cc(int i) {
        this.zPa = i;
    }

    public int EV() {
        return this.zPa;
    }

    public boolean rp() {
        int i = this.zPa;
        return i < -1 || i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(Integer num, int i) {
        if (num == null) {
            if (tV.IlO("sp_global_privacy", "tt_gdpr", -1) != i) {
                tV.IlO("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
                hp.aP().IlO(4, true);
                return;
            }
            return;
        }
        tV.IlO("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
        hp.aP().IlO(4, true);
    }

    public boolean hp() {
        if (MY.EO()) {
            return tV.IlO("sp_global_file", "is_paid", false);
        }
        return this.lEW;
    }

    public String bWL() {
        if (MY.EO()) {
            return tV.MY("sp_global_file", "keywords", (String) null);
        }
        return this.DmF;
    }

    public String ea() {
        if (MY.EO()) {
            return tV.MY("sp_global_file", "extra_data", (String) null);
        }
        return this.NV;
    }

    public void EO(final String str) {
        EV(str);
        if (mmj.vCE()) {
            bWL.MY().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.DmF.3
                @Override // java.lang.Runnable
                public void run() {
                    DmF.this.DmF(str);
                }
            });
        } else {
            DmF(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DmF(String str) {
        if (!TextUtils.isEmpty(this.NV)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.NV);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.NV = jSONArray3.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            this.NV = str;
        }
        if (MY.EO()) {
            tV.IlO("sp_global_file", "extra_data", this.NV);
        }
    }

    public void vCE(int i) {
        if (MY.EO()) {
            tV.IlO("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.EV = i;
    }

    private static void NV(String str) {
        hp hpVar;
        if (TextUtils.isEmpty(str) && (hpVar = IlO) != null) {
            hpVar.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void EV(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        hp hpVar = IlO;
        if (hpVar != null) {
            hpVar.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public EO zPa() {
        if (this.AXM == null) {
            this.AXM = new EO(10, 8);
        }
        return this.AXM;
    }

    public Bitmap cL() {
        if (MY.EO()) {
            return com.bytedance.sdk.component.utils.tV.IlO(tV.MY("sp_global_file", "pause_icon", (String) null));
        }
        return this.bWL;
    }

    public boolean es() {
        return MY.contains(this.tV);
    }

    public boolean xF() {
        return "5001121".contains(this.tV);
    }

    public boolean AXM() {
        return "com.union_test.internationad".equals(zLG.Cc());
    }

    public String oeT() {
        if (!TextUtils.isEmpty(this.xF)) {
            return this.xF;
        }
        String strIlO = rp.IlO();
        this.xF = strIlO;
        if (!TextUtils.isEmpty(strIlO)) {
            return this.xF;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        rp.IlO(strValueOf);
        this.xF = strValueOf;
        return strValueOf;
    }

    private static JSONObject rp(String str) {
        String strMY = tV.MY("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strMY)) {
            return null;
        }
        try {
            return PangleNetworkBridge.jsonObjectInit(strMY);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void IlO(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            tV.IlO("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String IlO(String str, long j) throws JSONException {
        JSONObject jSONObjectRp;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectRp = rp(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", e.getMessage());
        }
        if (jSONObjectRp == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectRp.getLong("time") <= j) {
            return jSONObjectRp.getString("value");
        }
        return null;
    }

    public static Pair<String, Long> tV(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRp = rp(str);
            if (jSONObjectRp == null) {
                return null;
            }
            return new Pair<>(jSONObjectRp.getString("value"), Long.valueOf(jSONObjectRp.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.oeT.EO("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public Bc.IlO Cc(String str) {
        try {
            if (this.oeT == null || str == null) {
                return null;
            }
            return this.oeT.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void IlO(String str, Bc.IlO ilO) {
        try {
            if (TextUtils.isEmpty(str) || ilO == null) {
                return;
            }
            if (MY.EO()) {
                NV.IlO(6, str, ilO);
                return;
            }
            if (this.oeT == null) {
                synchronized (DmF.class) {
                    if (this.oeT == null) {
                        this.oeT = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.oeT != null) {
                this.oeT.put(str, ilO);
            }
        } catch (Throwable unused) {
        }
    }

    public void vCE(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (MY.EO()) {
                NV.IlO(6, str);
            } else if (this.oeT != null) {
                this.oeT.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void vAh() {
        try {
            if (this.oeT == null || this.oeT.size() != 0) {
                return;
            }
            this.oeT = null;
        } catch (Throwable th) {
            Object[] objArr = new Object[2];
            th.getMessage();
        }
    }

    public void EO(boolean z) {
        this.EO = z;
    }

    public static boolean kBB() {
        return cl;
    }

    public static void pP() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            cl = true;
        }
    }

    public static boolean Bc(String str) {
        return (TextUtils.isEmpty(str) || !tl.IlO || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void lEW(String str) {
        if (MY.EO()) {
            tV.IlO("sp_global_file", "adx_id", str);
        }
        this.cL = str;
    }

    public String tl() {
        if (MY.EO()) {
            return tV.MY("sp_global_file", "adx_id", BuildConfig.FLAVOR);
        }
        return this.cL;
    }
}
