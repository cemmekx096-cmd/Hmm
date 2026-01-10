package com.bytedance.sdk.openadsdk.xF;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class lEW {
    private int AK;
    private String AXM;
    private float Aw;
    private int BC;
    private String BES;
    private String BK;
    private IlO BO;
    private String BS;
    private final String Bc;
    private String CQo;
    public final String Cc;
    private String Ct;
    private long DM;
    private boolean DYs;
    private Runnable DmF;
    private int Dxv;
    private vCE ED;
    public final String EO;
    private Runnable EV;
    private int Ea;
    private boolean Fv;
    private String HSR;
    private int HTA;
    private long Hg;
    private String IK;
    private int IRy;
    public final String IlO;
    private String Jz;
    private int KC;
    private int KS;
    private int KT;
    private ViewTreeObserver.OnGlobalLayoutListener LO;
    private List<JSONObject> LT;
    private JSONObject La;
    public final String MY;
    private boolean NI;
    private int NST;
    private Runnable NV;
    private long OOq;
    private String OW;
    private int Os;
    private com.bytedance.sdk.openadsdk.xF.IlO PTq;
    private volatile boolean Pbh;
    private boolean QLG;
    private int QfH;
    private boolean TU;
    private int Tx;
    private int VFH;
    private EO VH;
    private String XfO;
    private int XvI;
    private long YA;
    private int aP;
    private WeakReference<View> aa;
    private int ao;
    private Runnable bWL;
    private String cJK;
    private boolean cL;
    private boolean cl;
    private boolean ct;
    private boolean dM;
    private long dY;
    private Context dm;
    private float eDn;
    private MY ea;
    private String eeU;
    private Set<String> es;
    private int fdM;
    private String gQ;
    private WebView gm;
    private boolean hHv;
    private int hL;
    private Runnable hp;
    private int ii;
    private String jM;
    private boolean kBB;
    private final Handler lEW;
    private long lMM;
    private long mmj;
    private int nm;
    private long nvX;
    private long oc;
    private boolean oeT;
    private long pFe;
    private String pP;
    private volatile boolean qIK;
    private int quf;
    private int qvT;
    private boolean qyG;
    private JSONObject qz;
    private final Handler rp;
    private String ssS;
    private JSONObject tN;
    private String tU;
    public final String tV;
    private Map<String, String> tf;
    private long tl;
    private int ts;
    private float uF;
    private JSONObject uI;
    private boolean uvo;
    private boolean vAh;
    private final String vCE;
    private long vSq;
    private String vZk;
    private boolean wD;
    private int wPn;
    private String xF;
    private int xJ;
    private long zLG;
    private boolean zPa;
    private int zTS;

    public enum IlO {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public String DM() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    static /* synthetic */ int hp(lEW lew) {
        int i = lew.quf;
        lew.quf = i + 1;
        return i;
    }

    static /* synthetic */ int rp(lEW lew) {
        int i = lew.AK;
        lew.AK = i + 1;
        return i;
    }

    private lEW(Context context, WebView webView, EO eo, com.bytedance.sdk.openadsdk.xF.IlO ilO, IlO ilO2) {
        this.vCE = "playable_stuck_check_ping";
        this.Bc = "playable_apply_media_permission_callback";
        this.lEW = new Handler(Looper.getMainLooper());
        this.rp = new Handler(Looper.getMainLooper());
        this.zPa = true;
        this.cl = true;
        this.cL = true;
        this.IlO = "PL_sdk_playable_global_viewable";
        this.MY = "PL_sdk_page_screen_blank";
        this.EO = "PL_sdk_playable_destroy_analyze_summary";
        this.tV = "PL_sdk_playable_hardware_dialog_cancel";
        this.Cc = "PL_sdk_playable_hardware_dialog_setting";
        this.es = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.xF = null;
        this.AXM = "embeded_ad";
        this.oeT = true;
        this.vAh = true;
        this.kBB = false;
        this.pP = BuildConfig.FLAVOR;
        this.tl = 10L;
        this.OOq = 10L;
        this.wPn = 700;
        this.oc = 0L;
        this.vSq = 0L;
        this.dY = -1L;
        this.lMM = -1L;
        this.nvX = -1L;
        this.YA = -1L;
        this.mmj = -1L;
        this.DM = -1L;
        this.zLG = -1L;
        this.BS = BuildConfig.FLAVOR;
        this.ssS = BuildConfig.FLAVOR;
        this.gQ = BuildConfig.FLAVOR;
        this.HSR = BuildConfig.FLAVOR;
        this.AK = 0;
        this.quf = 0;
        this.uvo = false;
        this.KC = 0;
        this.Ea = -1;
        this.Dxv = 0;
        this.fdM = 0;
        this.hL = 0;
        this.Jz = null;
        this.wD = false;
        this.nm = 0;
        this.ii = 0;
        this.HTA = 0;
        this.Tx = 0;
        this.pFe = 0L;
        this.Hg = 0L;
        this.qvT = -2;
        this.ts = 0;
        this.zTS = 0;
        this.KT = 0;
        this.uI = new JSONObject();
        this.tf = new HashMap();
        this.tN = new JSONObject();
        this.BES = BuildConfig.FLAVOR;
        this.Aw = 0.0f;
        this.uF = 0.0f;
        this.ct = false;
        this.TU = false;
        this.hHv = false;
        this.LT = new ArrayList();
        this.QLG = true;
        this.Pbh = true;
        this.qIK = true;
        this.LO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) lEW.this.aa.get();
                    if (view == null) {
                        return;
                    }
                    lEW.this.MY(view);
                } catch (Throwable th) {
                    Bc.IlO("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.VFH = -1;
        this.qvT = 0;
        this.BO = ilO2;
        this.gm = webView;
        DmF.IlO(webView);
        IlO(webView);
        IlO(context, eo, ilO);
    }

    private lEW(Context context, int i, EO eo, com.bytedance.sdk.openadsdk.xF.IlO ilO) {
        this.vCE = "playable_stuck_check_ping";
        this.Bc = "playable_apply_media_permission_callback";
        this.lEW = new Handler(Looper.getMainLooper());
        this.rp = new Handler(Looper.getMainLooper());
        this.zPa = true;
        this.cl = true;
        this.cL = true;
        this.IlO = "PL_sdk_playable_global_viewable";
        this.MY = "PL_sdk_page_screen_blank";
        this.EO = "PL_sdk_playable_destroy_analyze_summary";
        this.tV = "PL_sdk_playable_hardware_dialog_cancel";
        this.Cc = "PL_sdk_playable_hardware_dialog_setting";
        this.es = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.xF = null;
        this.AXM = "embeded_ad";
        this.oeT = true;
        this.vAh = true;
        this.kBB = false;
        this.pP = BuildConfig.FLAVOR;
        this.tl = 10L;
        this.OOq = 10L;
        this.wPn = 700;
        this.oc = 0L;
        this.vSq = 0L;
        this.dY = -1L;
        this.lMM = -1L;
        this.nvX = -1L;
        this.YA = -1L;
        this.mmj = -1L;
        this.DM = -1L;
        this.zLG = -1L;
        this.BS = BuildConfig.FLAVOR;
        this.ssS = BuildConfig.FLAVOR;
        this.gQ = BuildConfig.FLAVOR;
        this.HSR = BuildConfig.FLAVOR;
        this.AK = 0;
        this.quf = 0;
        this.uvo = false;
        this.KC = 0;
        this.Ea = -1;
        this.Dxv = 0;
        this.fdM = 0;
        this.hL = 0;
        this.Jz = null;
        this.wD = false;
        this.nm = 0;
        this.ii = 0;
        this.HTA = 0;
        this.Tx = 0;
        this.pFe = 0L;
        this.Hg = 0L;
        this.qvT = -2;
        this.ts = 0;
        this.zTS = 0;
        this.KT = 0;
        this.uI = new JSONObject();
        this.tf = new HashMap();
        this.tN = new JSONObject();
        this.BES = BuildConfig.FLAVOR;
        this.Aw = 0.0f;
        this.uF = 0.0f;
        this.ct = false;
        this.TU = false;
        this.hHv = false;
        this.LT = new ArrayList();
        this.QLG = true;
        this.Pbh = true;
        this.qIK = true;
        this.LO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) lEW.this.aa.get();
                    if (view == null) {
                        return;
                    }
                    lEW.this.MY(view);
                } catch (Throwable th) {
                    Bc.IlO("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.VFH = -1;
        this.qvT = i;
        this.BO = IlO.LAND_PAGE;
        IlO(context, eo, ilO);
    }

    private void IlO(Context context, EO eo, com.bytedance.sdk.openadsdk.xF.IlO ilO) {
        this.xF = UUID.randomUUID().toString();
        this.dm = context;
        this.PTq = ilO;
        this.VH = eo;
        NV.IlO(ilO);
        this.ED = new vCE(this);
        BS();
        if (this.gm == null) {
            this.VFH = 4;
            this.lEW.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.4
                @Override // java.lang.Runnable
                public void run() {
                    lEW.this.IlO(5, "webview is null");
                }
            });
        }
    }

    private void BS() {
        this.ea = new MY(this, this.wPn);
        this.DmF = new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.5
            @Override // java.lang.Runnable
            public void run() {
                if (lEW.this.oeT) {
                    lEW.this.oeT = false;
                    lEW.this.lEW.removeCallbacks(lEW.this.NV);
                    lEW.this.IlO(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.NV = new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.6
            @Override // java.lang.Runnable
            public void run() {
                if (lEW.this.oeT) {
                    lEW.this.oeT = false;
                    lEW.this.Pbh = false;
                    lEW.this.lEW.removeCallbacks(lEW.this.DmF);
                    lEW.this.IlO(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.hp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.7
            @Override // java.lang.Runnable
            public void run() {
                new StringBuilder(" ====Scheduled Task=== ").append(System.currentTimeMillis());
                if (Build.VERSION.SDK_INT >= 19 && lEW.this.gm != null) {
                    lEW.this.gm.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: IlO, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (lEW.this.ea != null) {
                                lEW.this.ea.IlO(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (lEW.this.rp != null) {
                    lEW.this.rp.postDelayed(this, 500L);
                }
            }
        };
        this.bWL = new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.8
            @Override // java.lang.Runnable
            public void run() {
                new StringBuilder(" ====Lynx detect scheduled tasks=== ").append(System.currentTimeMillis());
                lEW.this.IlO("playable_stuck_check_ping", new JSONObject());
                if (lEW.this.rp != null) {
                    lEW.this.rp.postDelayed(this, 500L);
                }
            }
        };
        this.EV = new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.9
            @Override // java.lang.Runnable
            public void run() {
                if (lEW.this.Hg <= 0) {
                    lEW.this.MY(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (lEW.this.Hg - lEW.this.pFe <= lEW.this.wPn) {
                        lEW.this.dY();
                        lEW.this.pFe = 0L;
                        lEW.this.Hg = 0L;
                        return;
                    }
                    lEW.this.MY(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean rp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void IlO(View view) {
        if (view == null) {
            return;
        }
        try {
            this.aa = new WeakReference<>(view);
            MY(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.LO);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MY(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.zTS == view.getWidth() && this.KT == view.getHeight()) {
                return;
            }
            this.zTS = view.getWidth();
            this.KT = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SettingsJsonConstants.ICON_WIDTH_KEY, this.zTS);
            jSONObject.put(SettingsJsonConstants.ICON_HEIGHT_KEY, this.KT);
            IlO("resize", jSONObject);
            this.uI = jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public Context IlO() {
        return this.dm;
    }

    public lEW IlO(String str, String str2) {
        this.tf.put(str, str2);
        return this;
    }

    public Map<String, String> MY() {
        return this.tf;
    }

    public lEW IlO(String str) {
        this.cJK = str;
        return this;
    }

    public lEW MY(String str) {
        this.tU = str;
        return this;
    }

    public JSONObject EO() {
        return this.La;
    }

    public lEW EO(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.La = jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public String tV() {
        return this.tU;
    }

    public String Cc() {
        return this.cJK;
    }

    public lEW tV(String str) {
        this.OW = str;
        return this;
    }

    public String vCE() {
        return this.OW;
    }

    public lEW Cc(String str) {
        this.CQo = str;
        return this;
    }

    public String Bc() {
        return this.CQo;
    }

    public lEW IlO(boolean z) {
        this.qyG = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.qyG);
            IlO("volumeChange", jSONObject);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean lEW() {
        return this.qyG;
    }

    public lEW MY(boolean z) {
        this.dM = z;
        return this;
    }

    public lEW IlO(long j) {
        if (j <= 0) {
            this.tl = 10L;
        } else {
            this.tl = j;
        }
        return this;
    }

    public lEW MY(long j) {
        if (j <= 0) {
            this.OOq = 10L;
        } else {
            this.OOq = j;
        }
        return this;
    }

    public void IlO(int i) {
        this.VFH = i;
    }

    public lEW EO(boolean z) throws JSONException {
        if (this.VFH == -1 || this.Fv == z) {
            return this;
        }
        this.Fv = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.Fv) {
                jSONObject.put("playable_background_show_type", this.ii);
            }
        } catch (JSONException unused) {
        }
        EO(this.Fv ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.lMM == -1 && this.Fv) {
            this.lMM = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.VFH == 1 ? 1 : 2);
                int i = this.VFH;
                if (i != -1) {
                    jSONObject2.put("webview_state", i);
                }
            } catch (JSONException unused2) {
            }
            EO("PL_sdk_page_show", jSONObject2);
        }
        if (this.lMM != -1 && !this.Fv && !this.ct) {
            this.ct = true;
        }
        if (this.Fv) {
            this.dY = System.currentTimeMillis();
        } else if (this.dY != -1) {
            this.oc += System.currentTimeMillis() - this.dY;
            this.dY = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.Fv);
            IlO("viewableChange", jSONObject3);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "setViewable error", th);
        }
        if (this.Fv) {
            dY();
        } else {
            lMM();
        }
        return this;
    }

    public boolean DmF() {
        return this.Fv;
    }

    public lEW tV(boolean z) {
        this.NI = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.NI);
            IlO("change_playable_click", jSONObject);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public JSONObject NV() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.NI);
            return jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> EV() {
        return this.ED.IlO();
    }

    public JSONObject rp() {
        try {
            boolean zIlO = Cc.IlO(this.dm, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zIlO);
            return jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject hp() {
        try {
            boolean zIlO = Cc.IlO(this.dm, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zIlO);
            return jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject bWL() {
        boolean zIlO;
        boolean zIlO2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zIlO = Cc.IlO(this.dm, "android.permission.READ_MEDIA_IMAGES");
                zIlO2 = true;
            } else {
                zIlO = Cc.IlO(this.dm, "android.permission.READ_EXTERNAL_STORAGE");
                zIlO2 = Cc.IlO(this.dm, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zIlO);
            jSONObject.put("isHasWrite", zIlO2);
            if (!zIlO || !zIlO2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void IlO(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.xF.IlO ilO = this.PTq;
        if (ilO == null || ilO.MY(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            MY(strOptString2, strOptString);
        }
    }

    public void MY(JSONObject jSONObject) {
        if (this.PTq != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject ea() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.BO.ordinal());
            jSONObject.put("safe_area_top_height", this.Aw);
            jSONObject.put("safe_area_bottom_height", this.uF);
            jSONObject.put("playable_enter_from", this.fdM);
            jSONObject.put("playable_retry_count", this.Dxv);
            jSONObject.put("playable_card_session", this.BS);
            jSONObject.put("playable_video_session", this.ssS);
            jSONObject.put("playable_network_type", zPa());
            jSONObject.put("aweme_id", this.HSR);
            return jSONObject;
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void IlO(String str, JSONObject jSONObject) {
        if (Bc.IlO()) {
            new StringBuilder("CALL JS [").append(str).append("] ").append(jSONObject != null ? jSONObject.toString() : BuildConfig.FLAVOR);
        }
        EO eo = this.VH;
        if (eo != null) {
            eo.IlO(str, jSONObject);
        }
    }

    public void MY(String str, String str2) {
        Bitmap bitmapIlO;
        if (TextUtils.isEmpty(str2) || (bitmapIlO = Cc.IlO(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.dm.getContentResolver(), bitmapIlO, str, BuildConfig.FLAVOR);
    }

    public String zPa() {
        com.bytedance.sdk.openadsdk.xF.IlO ilO;
        if (TextUtils.isEmpty(this.gQ) && (ilO = this.PTq) != null) {
            this.gQ = ilO.IlO().toString();
        }
        return this.gQ;
    }

    public com.bytedance.sdk.openadsdk.xF.IlO cl() {
        return this.PTq;
    }

    public JSONObject cL() {
        if (this.uI.isNull(SettingsJsonConstants.ICON_WIDTH_KEY)) {
            View view = this.aa.get();
            if (view == null) {
                return this.uI;
            }
            MY(view);
        }
        return this.uI;
    }

    public JSONObject es() {
        return this.tN;
    }

    public lEW EO(JSONObject jSONObject) {
        this.tN = jSONObject;
        return this;
    }

    public lEW vCE(String str) {
        this.AXM = str;
        return this;
    }

    public lEW Bc(String str) {
        int iIndexOf;
        String strDecode;
        this.BES = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                MY(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            } else {
                String host = uri.getHost();
                if ("webview".equalsIgnoreCase(host) || (host != null && host.contains("webview"))) {
                    MY(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                } else if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.qvT == -1) {
                        MY(2);
                    } else {
                        MY(1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.vZk = str;
        return this;
    }

    public lEW MY(int i) {
        this.qvT = i;
        return this;
    }

    public lEW IlO(float f) {
        this.eDn = f;
        return this;
    }

    public JSONObject xF() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.eDn);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SettingsJsonConstants.ICON_WIDTH_KEY, this.NST);
            jSONObject2.put(SettingsJsonConstants.ICON_HEIGHT_KEY, this.aP);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.XvI);
            jSONObject3.put("y", this.ao);
            jSONObject3.put(SettingsJsonConstants.ICON_WIDTH_KEY, this.IRy);
            jSONObject3.put(SettingsJsonConstants.ICON_HEIGHT_KEY, this.BC);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.QfH);
            jSONObject4.put("y", this.xJ);
            jSONObject4.put(SettingsJsonConstants.ICON_WIDTH_KEY, this.Os);
            jSONObject4.put(SettingsJsonConstants.ICON_HEIGHT_KEY, this.KS);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void AXM() {
        com.bytedance.sdk.openadsdk.xF.IlO ilO = this.PTq;
        if (ilO != null) {
            ilO.MY();
        }
    }

    public void oeT() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.mmj > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.mmj);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.nvX > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.nvX;
                this.zLG = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            EO("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void tV(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.Jz = jSONObject.optString("section");
        }
    }

    public void vAh() {
        this.Ea = 2;
    }

    public void kBB() {
        this.wD = true;
    }

    public void pP() {
        if (this.PTq != null) {
            IlO ilO = IlO.FEED_AWEME;
        }
    }

    public void tl() {
        if (this.PTq != null) {
            IlO ilO = IlO.FEED_AWEME;
        }
    }

    public void Cc(JSONObject jSONObject) {
        WebView webView;
        this.qz = jSONObject;
        this.hL++;
        lMM();
        this.lEW.removeCallbacks(this.EV);
        if (this.vAh) {
            this.DM = System.currentTimeMillis();
            this.pFe = System.currentTimeMillis();
            this.Hg = 0L;
            int i = this.qvT;
            if (i == 0) {
                if (Build.VERSION.SDK_INT >= 19 && (webView = this.gm) != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: IlO, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            lEW.this.Hg = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                IlO("playable_stuck_check_ping", new JSONObject());
            }
            this.lEW.postDelayed(this.EV, this.wPn);
        }
    }

    public void OOq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.mmj > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.mmj);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.nvX > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.nvX);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            EO("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void vCE(JSONObject jSONObject) {
        MY(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void wPn() {
        MY my;
        this.Hg = System.currentTimeMillis();
        int i = this.qvT;
        if ((i == 1 || i == 2) && (my = this.ea) != null) {
            my.IlO(System.currentTimeMillis());
        }
    }

    public JSONObject Bc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return rp();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : bWL();
        }
        return hp();
    }

    public JSONObject lEW(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt != 1) {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        jSONObject2.put("result", Cc.IlO(this.dm));
                    } else {
                        jSONObject2.put("result", false);
                    }
                }
                return jSONObject2;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject2.put("result", Cc.MY(this.dm, "android.permission.CAMERA"));
            } else {
                jSONObject2.put("result", false);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            jSONObject2.put("result", Cc.MY(this.dm, "android.permission.RECORD_AUDIO"));
        } else {
            jSONObject2.put("result", false);
        }
        return jSONObject2;
    }

    public void lEW(String str) {
        this.ts = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.nvX = jCurrentTimeMillis;
            long j = this.lMM;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        EO("PL_sdk_html_load_start", jSONObject);
        this.Pbh = true;
        this.qIK = true;
        if (this.QLG) {
            oc();
            this.Pbh = false;
            this.qIK = false;
        }
        if (this.cl) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (Cc.IlO(this.dm, Cc.rp)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    if (Cc.MY(this.dm, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Cc.IlO(this.dm, Cc.EV)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Cc.IlO(this.dm, Cc.NV)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Cc.IlO(this.dm, Cc.DmF)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Cc.IlO(this.dm, Cc.lEW)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    if (Cc.MY(this.dm, "android.permission.CAMERA")) {
                        stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (Cc.IlO(this.dm, Cc.Bc)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    if (Cc.IlO(this.dm)) {
                        stringBuffer3.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                EO("PL_sdk_hardware_detect", jSONObject2);
                this.cl = false;
            } catch (Throwable th2) {
                Bc.IlO("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void oc() {
        int i;
        int i2 = this.qvT;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.Pbh) {
                this.lEW.postDelayed(this.DmF, this.tl * 1000);
            }
            if ((this.qIK && rp(this.vZk)) || (i = this.qvT) == 1 || i == 2) {
                this.lEW.postDelayed(this.NV, this.OOq * 1000);
            }
        }
    }

    public void DmF(String str) {
        WebView webView;
        boolean z = this.ts == -1;
        this.ts = 2;
        if (!z) {
            this.jM = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.YA = jCurrentTimeMillis;
                long j = this.nvX;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", mmj());
            } catch (Throwable th) {
                Bc.IlO("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            EO("PL_sdk_html_load_finish", jSONObject);
        }
        this.Pbh = false;
        this.lEW.removeCallbacks(this.DmF);
        try {
            if (this.qvT == 0) {
                if (Build.VERSION.SDK_INT >= 19 && this.zPa && (webView = this.gm) != null) {
                    this.zPa = false;
                    webView.evaluateJavascript(DM(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                dY();
            }
        } catch (Throwable th2) {
            Bc.IlO("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void vSq() throws JSONException {
        this.qIK = false;
        this.lEW.removeCallbacks(this.NV);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.nvX > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.nvX);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            EO("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void DmF(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.ts = 3;
                dY();
            } else {
                this.ts = -2;
            }
            if (zOptBoolean || !this.oeT) {
                return;
            }
            this.oeT = false;
            this.Pbh = false;
            this.qIK = false;
            this.lEW.removeCallbacks(this.DmF);
            this.lEW.removeCallbacks(this.NV);
            IlO(4, "CaseRenderFail");
        }
    }

    private void EO(int i, String str) {
        com.bytedance.sdk.openadsdk.xF.IlO ilO = this.PTq;
        if (ilO != null) {
            ilO.IlO(i, str);
        }
    }

    protected void IlO(int i, String str) {
        lMM();
        EO(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "reportRenderFatal error", th);
        }
        EO("PL_sdk_global_faild", jSONObject);
    }

    public void MY(int i, String str) {
        this.Ea = i;
        if (this.qz == null) {
            this.qz = new JSONObject();
        }
        try {
            this.qz.put("playable_stuck_type", i);
            this.qz.put("playable_stuck_reason", str);
            if (this.DM > 0) {
                this.qz.put("playable_stuck_duration", System.currentTimeMillis() - this.DM);
            } else {
                this.qz.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        EO("PL_sdk_page_stuck", this.qz);
        lMM();
        if (this.PTq == null || i != 2) {
            return;
        }
        this.qz = new JSONObject();
    }

    protected void MY(String str, JSONObject jSONObject) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Cc(str, jSONObject);
    }

    private String EO(String str, String str2) {
        String queryParameter;
        if (TextUtils.isEmpty(this.eeU) && !TextUtils.isEmpty(this.BES)) {
            Uri uri = Uri.parse(this.BES);
            String host = uri.getHost();
            boolean zEqualsIgnoreCase = "lynxview".equalsIgnoreCase(host);
            String queryParameter2 = BuildConfig.FLAVOR;
            if (zEqualsIgnoreCase || (host != null && host.contains("lynxview"))) {
                queryParameter2 = uri.getQueryParameter("surl");
                queryParameter = uri.getQueryParameter("playable_hash");
            } else {
                queryParameter = BuildConfig.FLAVOR;
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter2);
            if (!TextUtils.isEmpty(queryParameter)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter);
            }
            this.eeU = builderAppendQueryParameter.toString();
        }
        return this.eeU;
    }

    private String tV(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.vZk = str3;
        return str3;
    }

    private void ssS() {
        String str;
        if (this.tN == null || (str = this.vZk) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.tN.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.vZk).getHost();
        if (TextUtils.isEmpty(host)) {
            this.vZk += "/cid_" + strOptString;
        } else {
            this.vZk = this.vZk.replace(host, host + "/cid_" + strOptString);
        }
    }

    private void Cc(String str, JSONObject jSONObject) throws JSONException {
        try {
            int i = this.qvT;
            if (i == 0) {
                if (this.BO != IlO.LAND_PAGE && !rp(this.vZk)) {
                    ssS();
                }
                jSONObject.put("playable_url", this.vZk);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", tV(this.IK, this.Ct));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", EO(this.BK, this.XfO));
            }
            jSONObject.put("playable_render_type", this.qvT);
            if (this.PTq != null) {
                if (this.qvT == 0 && (this.BO != IlO.LAND_PAGE || rp(this.vZk))) {
                    this.PTq.IlO(jSONObject);
                } else if (this.qvT != 0) {
                    this.PTq.IlO(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void EO(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.uvo && this.quf > 0) {
                this.uvo = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.DYs ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.Fv);
            jSONObject.put("playable_session_id", this.xF);
            int i = this.qvT;
            if (i == 0) {
                if (this.BO != IlO.LAND_PAGE && !rp(this.vZk)) {
                    ssS();
                }
                jSONObject.put("playable_url", this.vZk);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", tV(this.IK, this.Ct));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", EO(this.BK, this.XfO));
            }
            jSONObject.put("playable_full_url", this.BES);
            jSONObject.put("playable_replay_count", this.KC);
            jSONObject.put("playable_is_prerender", this.dM);
            jSONObject.put("playable_is_preload", this.uvo);
            jSONObject.put("playable_render_type", this.qvT);
            jSONObject.put("playable_scenes_type", this.BO.ordinal());
            boolean zIsEmpty = TextUtils.isEmpty(this.BK);
            String str2 = BuildConfig.FLAVOR;
            jSONObject.put("playable_gecko_key", zIsEmpty ? BuildConfig.FLAVOR : this.BK);
            if (!TextUtils.isEmpty(this.XfO)) {
                str2 = this.XfO;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.IK);
            jSONObject.put("playable_minigamelite_schema", this.Ct);
            jSONObject.put("playable_is_debug", this.TU);
            jSONObject.put("playable_retry_count", this.Dxv);
            jSONObject.put("playable_enter_from", this.fdM);
            jSONObject.put("playable_sequence", this.hL);
            jSONObject.put("playable_current_section", this.Jz);
            jSONObject.put("is_playable_finish", this.wD);
            jSONObject.put("playable_card_session", this.BS);
            jSONObject.put("playable_video_session", this.ssS);
            jSONObject.put("playable_network_type", zPa());
            jSONObject.put("playable_lynx_version", this.pP);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.AXM);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.tN.opt("cid"));
            jSONObject2.put("log_extra", this.tN.opt("log_extra"));
            int i2 = this.qvT;
            if (i2 != -1 && i2 != -2) {
                if (this.PTq != null) {
                    List<JSONObject> list = this.LT;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.LT.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.qvT);
                                jSONObjectOptJSONObject.put("playable_url", this.vZk);
                            }
                            this.PTq.IlO(jSONObjectOptJSONObject);
                        }
                        this.LT.clear();
                    }
                    if (this.qvT == 0 && (this.BO != IlO.LAND_PAGE || rp(this.vZk))) {
                        this.PTq.IlO(jSONObject);
                        return;
                    } else {
                        if (this.qvT != 0) {
                            this.PTq.IlO(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.LT == null) {
                this.LT = new ArrayList();
            }
            this.LT.add(jSONObject2);
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void NV(String str) {
        this.lEW.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.2
            @Override // java.lang.Runnable
            public void run() {
                lEW.rp(lEW.this);
            }
        });
    }

    public void EV(String str) {
        this.lEW.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.xF.lEW.3
            @Override // java.lang.Runnable
            public void run() {
                lEW.hp(lEW.this);
            }
        });
    }

    public void dY() {
        if (this.vAh) {
            this.DM = System.currentTimeMillis();
            if (this.BO == IlO.FEED_AWEME) {
                if (this.Fv && this.ts == 3) {
                    MY my = this.ea;
                    if (my != null && my.MY()) {
                        gQ();
                        return;
                    } else {
                        if (this.ea == null) {
                            this.ea = new MY(this, this.wPn);
                            gQ();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.Fv && this.ts == 2) {
                MY my2 = this.ea;
                if (my2 != null && my2.MY()) {
                    gQ();
                } else if (this.ea == null) {
                    this.ea = new MY(this, this.wPn);
                    gQ();
                }
            }
        }
    }

    private void gQ() {
        Runnable runnable;
        Runnable runnable2;
        this.ea.IlO(System.currentTimeMillis());
        Handler handler = this.rp;
        if (handler != null) {
            int i = this.qvT;
            if (i == 0 && (runnable2 = this.hp) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.bWL) != null) {
                handler.post(runnable);
            }
            this.ea.IlO(500);
        }
    }

    public void lMM() {
        try {
            MY my = this.ea;
            if (my != null) {
                my.IlO();
            }
            Handler handler = this.rp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("The stuttering detection has been paused due to a crash.-- ").append(th);
        }
    }

    public void nvX() {
        this.zTS = 0;
        this.KT = 0;
        this.eDn = 0.0f;
        this.NST = 0;
        this.aP = 0;
        this.ao = 0;
        this.XvI = 0;
        this.IRy = 0;
        this.BC = 0;
        this.xJ = 0;
        this.QfH = 0;
        this.Os = 0;
        this.KS = 0;
    }

    public void YA() {
        if (this.hHv) {
            return;
        }
        this.hHv = true;
        this.vSq = 0L;
        this.cl = true;
        nvX();
        try {
            View view = this.aa.get();
            if (view != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this.LO);
                } else {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this.LO);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            this.ED.MY();
        } catch (Throwable unused2) {
        }
        try {
            MY my = this.ea;
            if (my != null) {
                my.IlO();
                this.ea = null;
            }
            Handler handler = this.rp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("crash -- ").append(th);
        }
        try {
            if (!TextUtils.isEmpty(this.vZk)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.AK);
                jSONObject.put("playable_hit_times", this.quf);
                int i = this.AK;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.quf / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                EO("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.vZk)) {
                if (this.dY != -1) {
                    this.oc += System.currentTimeMillis() - this.dY;
                    this.dY = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.oc);
                EO("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.Pbh = false;
        this.qIK = false;
        this.lEW.removeCallbacks(this.DmF);
        this.lEW.removeCallbacks(this.NV);
        this.lEW.removeCallbacksAndMessages(null);
    }

    public void IlO(int i, String str, String str2) {
        this.ts = -1;
        this.jM = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", mmj());
        } catch (Throwable th) {
            Bc.IlO("PlayablePlugin", "onWebReceivedError error", th);
        }
        EO("PL_sdk_html_load_error", jSONObject);
        if (this.oeT) {
            this.oeT = false;
            this.Pbh = false;
            this.qIK = false;
            this.lEW.removeCallbacks(this.DmF);
            this.lEW.removeCallbacks(this.NV);
            IlO(1, "ContainerLoadFail");
        }
    }

    public int mmj() {
        return (this.lMM == -1 || !this.Fv) ? 1 : 2;
    }

    public void IlO(boolean z, String str, int i) {
        if (z) {
            this.ts = -1;
            this.jM = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", mmj());
            } catch (Throwable th) {
                Bc.IlO("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            EO("PL_sdk_html_load_error", jSONObject);
            if (this.oeT) {
                this.oeT = false;
                this.Pbh = false;
                this.qIK = false;
                this.lEW.removeCallbacks(this.DmF);
                this.lEW.removeCallbacks(this.NV);
                IlO(1, "ContainerLoadFail");
            }
        }
    }

    public int zLG() {
        return this.VFH;
    }

    public JSONObject tV(String str, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIlO = Bc.IlO();
        String string = BuildConfig.FLAVOR;
        if (zIlO) {
            new StringBuilder("PlayablePlugin JSB-REQ [").append(str).append("] ").append(jSONObject != null ? jSONObject.toString() : BuildConfig.FLAVOR);
        }
        JSONObject jSONObjectIlO = this.ED.IlO(str, jSONObject);
        if (Bc.IlO()) {
            StringBuilder sbAppend = new StringBuilder("PlayablePlugin JSB-RSP [").append(str).append("] time:").append(System.currentTimeMillis() - jCurrentTimeMillis).append(" ");
            if (jSONObjectIlO != null) {
                string = jSONObjectIlO.toString();
            }
            sbAppend.append(string);
        }
        return jSONObjectIlO;
    }

    public lEW Cc(boolean z) {
        this.QLG = z;
        return this;
    }

    public void vCE(boolean z) {
        this.DYs = z;
    }

    public static lEW IlO(Context context, WebView webView, EO eo, com.bytedance.sdk.openadsdk.xF.IlO ilO) {
        if (eo == null || ilO == null) {
            return null;
        }
        if (webView == null) {
            return new lEW(context, 0, eo, ilO);
        }
        return new lEW(context, webView, eo, ilO, IlO.LAND_PAGE);
    }
}
