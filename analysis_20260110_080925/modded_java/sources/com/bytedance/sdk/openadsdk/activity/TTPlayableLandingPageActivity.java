package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.RendererCapabilities;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.DmF.vCE;
import com.bytedance.sdk.component.adexpress.tV.DmF;
import com.bytedance.sdk.component.utils.pP;
import com.bytedance.sdk.component.utils.vSq;
import com.bytedance.sdk.openadsdk.Bc.MY;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.MY.EO;
import com.bytedance.sdk.openadsdk.core.MY.tV;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.model.OOq;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.nvX;
import com.bytedance.sdk.openadsdk.core.tl;
import com.bytedance.sdk.openadsdk.core.widget.DmF;
import com.bytedance.sdk.openadsdk.core.widget.NV;
import com.bytedance.sdk.openadsdk.core.widget.bWL;
import com.bytedance.sdk.openadsdk.core.widget.hp;
import com.bytedance.sdk.openadsdk.tV.EO;
import com.bytedance.sdk.openadsdk.tV.EV;
import com.bytedance.sdk.openadsdk.tV.tV.Cc;
import com.bytedance.sdk.openadsdk.utils.BS;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.xF;
import com.bytedance.sdk.openadsdk.xF.Bc;
import com.bytedance.sdk.openadsdk.xF.IlO.IlO;
import com.bytedance.sdk.openadsdk.xF.lEW;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.messaging.Constants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements vSq.IlO, tV {
    private static final Bc.IlO quf = new Bc.IlO() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
    };
    private EV AK;
    private com.bytedance.sdk.openadsdk.core.vSq AXM;
    private lEW BS;
    private vCE Cc;
    private int DM;
    private bWL EV;
    private IlO Ea;
    private Cc HSR;
    tl IlO;
    private boolean KC;
    TTAdDislikeToast MY;
    private RelativeLayout NV;
    private int bWL;
    private String cL;
    private DmF cl;
    private com.bytedance.sdk.openadsdk.core.Cc.vCE ea;
    private String es;
    private Context hp;
    private String kBB;
    private String lMM;
    private boolean oc;
    private int oeT;
    private hp rp;
    private ILoader ssS;
    private oeT tl;
    private String vAh;
    private com.bytedance.sdk.openadsdk.es.IlO.IlO.vCE vSq;
    private boolean wPn;
    private com.bytedance.sdk.openadsdk.core.vSq xF;
    private int zLG;
    private NV zPa;
    private boolean vCE = true;
    private boolean lEW = false;
    private boolean DmF = true;
    final AtomicBoolean EO = new AtomicBoolean(false);
    private final String pP = "embeded_ad";
    private final vSq OOq = new vSq(Looper.getMainLooper(), this);
    private final AtomicBoolean dY = new AtomicBoolean(false);
    private final AtomicInteger nvX = new AtomicInteger(0);
    private final AtomicInteger YA = new AtomicInteger(0);
    private final AtomicInteger mmj = new AtomicInteger(0);
    private boolean gQ = false;
    protected com.bytedance.sdk.openadsdk.rp.Cc tV = new com.bytedance.sdk.openadsdk.rp.Cc() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        public void IlO() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && OOq.bWL(TTPlayableLandingPageActivity.this.tl) && OOq.zPa(TTPlayableLandingPageActivity.this.tl)) {
                TTPlayableLandingPageActivity.this.OOq.removeMessages(2);
                TTPlayableLandingPageActivity.this.OOq.sendMessage(TTPlayableLandingPageActivity.this.IlO(1, 0));
            }
        }

        public void MY() {
            if (OOq.bWL(TTPlayableLandingPageActivity.this.tl) && OOq.ea(TTPlayableLandingPageActivity.this.tl)) {
                TTPlayableLandingPageActivity.this.OOq.sendMessageDelayed(TTPlayableLandingPageActivity.this.IlO(0, 0), 1000L);
            }
        }

        public void IlO(int i) {
            if (!OOq.bWL(TTPlayableLandingPageActivity.this.tl) || TTPlayableLandingPageActivity.this.zPa == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.zPa.setProgress(i);
        }
    };
    private int uvo = 1;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.bytedance.sdk", me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message IlO(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        IlO ilO;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.bWL.Cc()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED);
            getWindow().addFlags(ViewCompat.MEASURED_STATE_TOO_SMALL);
            cl.MY(this);
        } catch (Throwable unused) {
        }
        IlO(bundle);
        oeT oet = this.tl;
        if (oet == null) {
            return;
        }
        this.KC = oet.nt();
        int iCl = OOq.cl(this.tl);
        if (iCl != 0) {
            if (iCl == 1) {
                setRequestedOrientation(1);
            } else if (iCl == 2) {
                setRequestedOrientation(0);
                this.uvo = 2;
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            setRequestedOrientation(14);
        } else {
            setRequestedOrientation(1);
        }
        this.hp = this;
        try {
            setContentView(tV());
            DmF();
            vCE();
            if (this.KC) {
                bWL();
                this.Ea.IlO(false, (com.bytedance.sdk.openadsdk.rp.vCE) null);
            } else {
                IlO();
                EV();
                if (!TextUtils.isEmpty(this.lMM)) {
                    this.ssS = MY.IlO().MY();
                    int iIlO = MY.IlO().IlO(this.ssS, this.lMM);
                    this.DM = iIlO;
                    this.zLG = iIlO > 0 ? 2 : 0;
                }
                lEW();
                Cc cc = this.HSR;
                if (cc != null) {
                    cc.Bc();
                }
            }
            Bc();
            EO.IlO.IlO(SystemClock.elapsedRealtime() - jElapsedRealtime, this.tl, "embeded_ad", this.ssS, this.lMM);
            if (!this.KC || (ilO = this.Ea) == null) {
                return;
            }
            ilO.IlO();
        } catch (Throwable unused2) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View tV() {
        com.bytedance.sdk.openadsdk.core.Cc.EO eo = new com.bytedance.sdk.openadsdk.core.Cc.EO(this);
        eo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.KC) {
            this.Ea = new IlO(this.hp, this.tl, this.uvo, this.gQ, eo, true);
        } else {
            this.Cc = new vCE(this);
            this.Cc.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.Cc.setVisibility(4);
            this.ea = new com.bytedance.sdk.openadsdk.core.Cc.vCE(this, (AttributeSet) null, R.style.Widget.ProgressBar.Horizontal);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, BS.MY(this, 3.0f));
            layoutParams.gravity = 49;
            this.ea.setLayoutParams(layoutParams);
            this.ea.setProgress(1);
            this.ea.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.EV.IlO(this, "tt_browser_progress_style"));
            this.zPa = new NV(this);
            this.zPa.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.zPa.setClickable(true);
            this.zPa.setFocusable(true);
            this.cl = new DmF(this);
            this.cl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.rp = new hp(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(BS.MY(this, 28.0f), BS.MY(this, 28.0f));
        layoutParams2.leftMargin = BS.MY(this, 12.0f);
        layoutParams2.topMargin = BS.MY(this, 20.0f);
        this.rp.setLayoutParams(layoutParams2);
        this.rp.setScaleType(ImageView.ScaleType.CENTER);
        this.rp.setImageDrawable(com.bytedance.sdk.openadsdk.utils.EV.IlO(this, "tt_unmute_wrapper"));
        this.EV = new bWL(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, BS.MY(this, 28.0f));
        layoutParams3.gravity = BadgeDrawable.TOP_END;
        layoutParams3.leftMargin = BS.MY(this, 16.0f);
        layoutParams3.rightMargin = BS.MY(this, 80.0f);
        layoutParams3.topMargin = BS.MY(this, 20.0f);
        this.EV.setLayoutParams(layoutParams3);
        this.EV.setGravity(17);
        this.EV.setText(pP.IlO(this, "tt_reward_feedback"));
        this.EV.setTextColor(-1);
        this.EV.setTextSize(14.0f);
        this.NV = new com.bytedance.sdk.openadsdk.core.Cc.Bc(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(BS.MY(this, 28.0f), BS.MY(this, 28.0f));
        layoutParams4.gravity = BadgeDrawable.TOP_END;
        layoutParams4.topMargin = BS.MY(this, 20.0f);
        layoutParams4.rightMargin = BS.MY(this, 24.0f);
        this.NV.setLayoutParams(layoutParams4);
        this.NV.setBackground(com.bytedance.sdk.openadsdk.utils.EV.IlO(this, "tt_mute_btn_bg"));
        this.NV.setGravity(17);
        this.NV.setVisibility(8);
        View tVVar = new com.bytedance.sdk.openadsdk.core.Cc.tV(this);
        tVVar.setLayoutParams(new RelativeLayout.LayoutParams(BS.MY(this, 12.0f), BS.MY(this, 12.0f)));
        tVVar.setImageDrawable(pP.EO(this, "tt_video_close_drawable"));
        tVVar.setVisibility(0);
        this.NV.addView(tVVar);
        if (!this.KC) {
            eo.addView(this.Cc);
            eo.addView(this.ea);
            eo.addView(this.cl);
            eo.addView(this.zPa);
        }
        eo.addView(this.rp);
        eo.addView(this.EV);
        eo.addView(this.NV);
        return eo;
    }

    private void Cc() {
        if (this.BS != null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.DmF.MY().es()) {
            Bc.IlO(quf);
        }
        com.bytedance.sdk.openadsdk.xF.IlO ilO = new com.bytedance.sdk.openadsdk.xF.IlO() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            public void IlO(int i, String str) {
                super.IlO(i, str);
                if (OOq.vAh(TTPlayableLandingPageActivity.this.tl)) {
                    TTPlayableLandingPageActivity.this.OOq.sendMessage(TTPlayableLandingPageActivity.this.IlO(3, OOq.IlO(i)));
                    TTPlayableLandingPageActivity.this.NV();
                }
            }

            public com.bytedance.sdk.openadsdk.xF.tV IlO() {
                String strVCE = com.bytedance.sdk.openadsdk.common.MY.vCE();
                strVCE.hashCode();
                switch (strVCE) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.xF.tV.IlO;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.xF.tV.MY;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.xF.tV.EO;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.xF.tV.tV;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.xF.tV.Cc;
                    default:
                        return com.bytedance.sdk.openadsdk.xF.tV.Bc;
                }
            }

            public void IlO(JSONObject jSONObject) {
                EO.MY(TTPlayableLandingPageActivity.this.tl, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.xF.EO eo = new com.bytedance.sdk.openadsdk.xF.EO() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
            @Override // com.bytedance.sdk.openadsdk.xF.EO
            public void IlO(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.xF.IlO(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.cL);
            jSONObject.put("log_extra", this.es);
            this.BS = lEW.IlO(getApplicationContext(), this.Cc.getWebView(), eo, ilO).Bc(this.vAh).Cc(com.bytedance.sdk.openadsdk.common.MY.IlO(cl.IlO())).IlO(com.bytedance.sdk.openadsdk.common.MY.IlO()).EO(jSONObject).MY(com.bytedance.sdk.openadsdk.common.MY.Cc()).IlO("sdkEdition", com.bytedance.sdk.openadsdk.common.MY.EO()).tV(com.bytedance.sdk.openadsdk.common.MY.tV()).tV(false).IlO(this.gQ).IlO(OOq.xF(this.tl)).MY(OOq.xF(this.tl)).Cc(true);
        } catch (Throwable unused) {
        }
        if (this.BS == null) {
            return;
        }
        if (!TextUtils.isEmpty(OOq.EV(this.tl))) {
            this.BS.EO(OOq.EV(this.tl));
        }
        Set<String> setEV = this.BS.EV();
        final WeakReference weakReference = new WeakReference(this.BS);
        for (String str : setEV) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.xF.MY().IlO(str, new com.bytedance.sdk.component.IlO.Cc<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
                    public JSONObject IlO(JSONObject jSONObject2, com.bytedance.sdk.component.IlO.vCE vce) {
                        try {
                            lEW lew = (lEW) weakReference.get();
                            if (lew == null) {
                                return null;
                            }
                            return lew.tV(IlO(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void vCE() {
        if (this.tl.Jz() == 4) {
            this.vSq = com.bytedance.sdk.openadsdk.es.IlO.IlO.Bc.IlO(this.hp, this.tl, "interaction");
        }
    }

    private void Bc() {
        int i = cl.tV().tl(String.valueOf(this.tl.hFV())).cl;
        if (i >= 0) {
            this.OOq.sendEmptyMessageDelayed(1, i * 1000);
        } else {
            BS.IlO(this.NV, 0);
        }
    }

    private void IlO(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.bWL = intent.getIntExtra("sdk_version", 1);
            this.cL = intent.getStringExtra("adid");
            this.es = intent.getStringExtra("log_extra");
            this.oeT = intent.getIntExtra(Constants.ScionAnalytics.PARAM_SOURCE, -1);
            this.wPn = intent.getBooleanExtra("ad_pending_download", false);
            this.vAh = intent.getStringExtra("url");
            this.lMM = intent.getStringExtra("gecko_id");
            this.kBB = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.MY.EO()) {
                String stringExtra = intent.getStringExtra("multi_process_materialmeta");
                if (stringExtra != null) {
                    try {
                        this.tl = com.bytedance.sdk.openadsdk.core.MY.IlO(PangleNetworkBridge.jsonObjectInit(stringExtra));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.oeT.IlO("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.tl = com.bytedance.sdk.openadsdk.core.pP.IlO().MY();
                com.bytedance.sdk.openadsdk.core.pP.IlO().vCE();
            }
        }
        if (bundle != null) {
            try {
                this.bWL = bundle.getInt("sdk_version", 1);
                this.cL = bundle.getString("adid");
                this.es = bundle.getString("log_extra");
                this.oeT = bundle.getInt(Constants.ScionAnalytics.PARAM_SOURCE, -1);
                this.wPn = bundle.getBoolean("ad_pending_download", false);
                this.vAh = bundle.getString("url");
                this.kBB = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.tl = com.bytedance.sdk.openadsdk.core.MY.IlO(PangleNetworkBridge.jsonObjectInit(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.tl == null) {
            finish();
            return;
        }
        try {
            this.gQ = cl.tV().zPa(this.tl.ssS().getCodeId());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.oeT.EO("TTPWPActivity", th.getMessage());
        }
    }

    private void lEW() {
        vCE vce = this.Cc;
        if (vce == null) {
            return;
        }
        vce.setLandingPage(true);
        this.Cc.setTag("landingpage");
        this.Cc.setMaterialMeta(this.tl.Ct());
        EV evMY = new EV(this.tl, this.Cc.getWebView(), new com.bytedance.sdk.openadsdk.tV.NV() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.tV.NV
            public void IlO(int i) {
                EO.IlO.IlO(TTPlayableLandingPageActivity.this.DM, TTPlayableLandingPageActivity.this.mmj.get(), TTPlayableLandingPageActivity.this.YA.get(), TTPlayableLandingPageActivity.this.nvX.get() - TTPlayableLandingPageActivity.this.YA.get(), TTPlayableLandingPageActivity.this.tl, "embeded_ad", i);
            }
        }, this.zLG).MY(true);
        this.AK = evMY;
        evMY.IlO("embeded_ad");
        this.AK.IlO(this.HSR);
        this.AK.IlO(this.BS);
        this.Cc.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.IlO.Cc(this.hp, this.xF, this.cL, this.AK, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded("com.bytedance.sdk", view, url);
            }

            public void onPageFinished(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$13;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                BrandSafetyUtils.onWebViewPageFinished("com.bytedance.sdk", webView, str);
                safedk_TTPlayableLandingPageActivity$13_onPageFinished_c9ab2344cb52957c4d4365c705498690(webView, str);
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$13;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                BrandSafetyUtils.onWebViewPageStarted("com.bytedance.sdk", webView, str);
                safedk_TTPlayableLandingPageActivity$13_onPageStarted_f70d8ca07d41c0776b82f93108cfd8d9(webView, str, bitmap);
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$13;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                BrandSafetyUtils.onWebViewReceivedError("com.bytedance.sdk", webView, i, str, str2);
                safedk_TTPlayableLandingPageActivity$13_onReceivedError_9bfa27135f5f9d735bdbeb5a42e36f2c(webView, i, str, str2);
            }

            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$13;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                BrandSafetyUtils.onWebViewReceivedError("com.bytedance.sdk", webView, webResourceRequest, webResourceError);
                safedk_TTPlayableLandingPageActivity$13_onReceivedError_c1cbbb6cd137e888d0ff5013be67ae56(webView, webResourceRequest, webResourceError);
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$13;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse("com.bytedance.sdk", webView, str, safedk_TTPlayableLandingPageActivity$13_shouldInterceptRequest_76f9bf03be3039af52a7a5b3cfdb8fa3(webView, str));
            }

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading("com.bytedance.sdk", view, url, zShouldOverrideUrlLoading);
                return zShouldOverrideUrlLoading;
            }

            public void safedk_TTPlayableLandingPageActivity$13_onPageStarted_f70d8ca07d41c0776b82f93108cfd8d9(WebView p0, String p1, Bitmap p2) {
                super.onPageStarted(p0, p1, p2);
            }

            public void safedk_TTPlayableLandingPageActivity$13_onPageFinished_c9ab2344cb52957c4d4365c705498690(WebView p0, String p1) {
                super.onPageFinished(p0, p1);
                TTPlayableLandingPageActivity.this.lEW = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.BS != null) {
                    TTPlayableLandingPageActivity.this.BS.DmF(p1);
                }
                try {
                    TTPlayableLandingPageActivity.this.tV.MY();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.ea != null) {
                        TTPlayableLandingPageActivity.this.ea.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.vCE) {
                        TTPlayableLandingPageActivity.this.NV();
                        TTPlayableLandingPageActivity.this.IlO("py_loading_success");
                        if (this.EO != null) {
                            this.EO.MY(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.vAh != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.vAh.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.vCE = false;
                }
                if (TTPlayableLandingPageActivity.this.BS != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.BS.IlO(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            public void safedk_TTPlayableLandingPageActivity$13_onReceivedError_c1cbbb6cd137e888d0ff5013be67ae56(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                super.onReceivedError(p0, p1, p2);
                if (Build.VERSION.SDK_INT < 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.vCE = false;
                if (TTPlayableLandingPageActivity.this.BS == null || p2 == null || p1 == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.BS.IlO(p2.getErrorCode(), String.valueOf(p2.getDescription()), String.valueOf(p1.getUrl()));
            }

            public void safedk_TTPlayableLandingPageActivity$13_onReceivedError_9bfa27135f5f9d735bdbeb5a42e36f2c(WebView p0, int p1, String p2, String p3) {
                super.onReceivedError(p0, p1, p2, p3);
                if (Build.VERSION.SDK_INT >= 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.vCE = false;
                if (TTPlayableLandingPageActivity.this.BS != null) {
                    TTPlayableLandingPageActivity.this.BS.IlO(p1, p2, p3);
                }
            }

            public WebResourceResponse safedk_TTPlayableLandingPageActivity$13_shouldInterceptRequest_76f9bf03be3039af52a7a5b3cfdb8fa3(WebView p0, String p1) {
                try {
                    if (TTPlayableLandingPageActivity.this.BS != null) {
                        TTPlayableLandingPageActivity.this.BS.NV(p1);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.lMM)) {
                        TTPlayableLandingPageActivity.this.nvX.incrementAndGet();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel webResourceResponseModelIlO = MY.IlO().IlO(TTPlayableLandingPageActivity.this.ssS, TTPlayableLandingPageActivity.this.lMM, p1);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.HSR != null) {
                        DmF.IlO IlO = com.bytedance.sdk.component.adexpress.tV.DmF.IlO(p1);
                        int i = (webResourceResponseModelIlO == null || webResourceResponseModelIlO.getWebResourceResponse() == null) ? 2 : 1;
                        if (IlO == DmF.IlO.IlO) {
                            TTPlayableLandingPageActivity.this.HSR.IlO(p1, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (IlO == DmF.IlO.EO) {
                            TTPlayableLandingPageActivity.this.HSR.MY(p1, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    if (webResourceResponseModelIlO != null && webResourceResponseModelIlO.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.YA.incrementAndGet();
                        if (TTPlayableLandingPageActivity.this.BS != null) {
                            TTPlayableLandingPageActivity.this.BS.EV(p1);
                        }
                        return webResourceResponseModelIlO.getWebResourceResponse();
                    }
                    if (webResourceResponseModelIlO != null && webResourceResponseModelIlO.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.mmj.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(p0, p1);
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(p0, p1);
                }
            }
        });
        IlO(this.Cc);
        com.bytedance.sdk.openadsdk.utils.oeT.IlO(this.Cc, this.vAh);
        lEW lew = this.BS;
        if (lew != null) {
            lew.lEW(this.vAh);
        }
        this.Cc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.IlO.tV(this.xF, this.AK) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // com.bytedance.sdk.openadsdk.core.widget.IlO.tV, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.tV.IlO(i);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.ea != null) {
                    if (i == 100) {
                        TTPlayableLandingPageActivity.this.lEW = true;
                        TTPlayableLandingPageActivity.this.ea.setVisibility(8);
                        TTPlayableLandingPageActivity.this.NV();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.ea.setProgress(i);
                }
            }
        });
        this.Cc.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.15
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$15;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched("com.bytedance.sdk", view, motionEvent);
                return safedk_TTPlayableLandingPageActivity$15_onTouch_3a69aa6da5d92e5e30cb910cf00f4f72(view, motionEvent);
            }

            public boolean safedk_TTPlayableLandingPageActivity$15_onTouch_3a69aa6da5d92e5e30cb910cf00f4f72(View p0, MotionEvent p1) {
                if (TTPlayableLandingPageActivity.this.AK == null) {
                    return false;
                }
                TTPlayableLandingPageActivity.this.AK.IlO(p1);
                return false;
            }
        });
    }

    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            oeT oet = this.tl;
            bundle.putString("material_meta", oet != null ? oet.eDn().toString() : null);
            bundle.putInt("sdk_version", this.bWL);
            bundle.putString("adid", this.cL);
            bundle.putString("log_extra", this.es);
            bundle.putInt(Constants.ScionAnalytics.PARAM_SOURCE, this.oeT);
            bundle.putBoolean("ad_pending_download", this.wPn);
            bundle.putString("url", this.vAh);
            bundle.putString("web_title", this.kBB);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void DmF() {
        RelativeLayout relativeLayout = this.NV;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                    safedk_TTPlayableLandingPageActivity$2_onClick_e9e7a863d3f9c18cd26e77a33b62c341(view);
                }

                public void safedk_TTPlayableLandingPageActivity$2_onClick_e9e7a863d3f9c18cd26e77a33b62c341(View p0) {
                    if (TTPlayableLandingPageActivity.this.HSR != null) {
                        TTPlayableLandingPageActivity.this.HSR.lEW();
                    }
                    TTPlayableLandingPageActivity.this.OOq.sendMessage(TTPlayableLandingPageActivity.this.IlO(4, 0));
                    TTPlayableLandingPageActivity.this.IlO("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        bWL bwl = this.EV;
        if (bwl != null) {
            bwl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                    safedk_TTPlayableLandingPageActivity$3_onClick_3ea26895309c16e9185af3fa35f2af8a(view);
                }

                public void safedk_TTPlayableLandingPageActivity$3_onClick_3ea26895309c16e9185af3fa35f2af8a(View p0) {
                    TTPlayableLandingPageActivity.this.MY();
                }
            });
        }
        hp hpVar = this.rp;
        if (hpVar != null) {
            hpVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTPlayableLandingPageActivity$4;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                    safedk_TTPlayableLandingPageActivity$4_onClick_d18901dd313cf4399b61c94a6754d559(view);
                }

                public void safedk_TTPlayableLandingPageActivity$4_onClick_d18901dd313cf4399b61c94a6754d559(View p0) {
                    TTPlayableLandingPageActivity.this.gQ = !r2.gQ;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.EO(tTPlayableLandingPageActivity.gQ);
                    if (TTPlayableLandingPageActivity.this.BS != null) {
                        TTPlayableLandingPageActivity.this.BS.IlO(TTPlayableLandingPageActivity.this.gQ);
                    }
                }
            });
        }
        if (this.KC) {
            return;
        }
        this.Cc.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        BS.IlO(this.Cc, 4);
        this.zPa.MY(this.tl, this.uvo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void IlO() {
        if (this.zPa == null) {
            return;
        }
        oeT oet = this.tl;
        if (oet != null && !OOq.bWL(oet)) {
            this.zPa.EO();
            return;
        }
        this.zPa.MY(this.tl, this.uvo);
        if (this.zPa.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.MY.IlO ilO = new com.bytedance.sdk.openadsdk.core.MY.IlO(this, this.tl, "embeded_ad", this.oeT) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                public void IlO(View view, float f, float f2, float f3, float f4, SparseArray<EO.IlO> sparseArray, boolean z) throws JSONException {
                    if (this.vCE == null || this.vCE.tl() != 1 || z) {
                        super.IlO(view, f, f2, f3, f4, sparseArray, z);
                        TTPlayableLandingPageActivity.this.wPn = true;
                        TTPlayableLandingPageActivity.this.oc = true;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.vAh);
                        } catch (JSONException e) {
                            com.bytedance.sdk.component.utils.oeT.IlO("TTPWPActivity", "onClick JSON ERROR", e);
                        }
                        com.bytedance.sdk.openadsdk.tV.EO.MY(TTPlayableLandingPageActivity.this.tl, this.Bc, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            ilO.IlO(this.vSq);
            this.zPa.getDownloadButton().setOnClickListener(ilO);
        }
        if (OOq.zPa(this.tl)) {
            this.OOq.sendMessageDelayed(IlO(2, OOq.IlO(2)), OOq.AXM(this.tl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void NV() {
        if (this.dY.getAndSet(true)) {
            return;
        }
        if (OOq.vAh(this.tl) && (!this.lEW || !this.vCE)) {
            if (this.cl == null || this.zPa == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.MY.IlO ilO = new com.bytedance.sdk.openadsdk.core.MY.IlO(this, this.tl, "embeded_ad", this.oeT);
            ilO.IlO(this.vSq);
            this.cl.IlO(this.tl, "embeded_ad", ilO);
            BS.IlO(this.cl, 0);
            BS.IlO(this.zPa, 8);
            BS.IlO(this.rp, 8);
            return;
        }
        vCE vce = this.Cc;
        if (vce == null || this.zPa == null) {
            return;
        }
        BS.IlO(vce, 0);
        BS.IlO(this.zPa, 8);
    }

    private void IlO(vCE vce) {
        if (vce == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.IlO.EO.IlO(this.hp).IlO(false).MY(false).IlO(vce.getWebView());
        vce.setUserAgentString(xF.IlO(vce.getWebView(), this.bWL));
        if (Build.VERSION.SDK_INT >= 21) {
            vce.setMixedContentMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(String str) {
        com.bytedance.sdk.openadsdk.tV.EO.IlO(System.currentTimeMillis(), this.tl, "embeded_ad", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void EV() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.tl);
        this.HSR = new com.bytedance.sdk.openadsdk.tV.cl(3, "embeded_ad", this.tl);
        this.xF = new com.bytedance.sdk.openadsdk.core.vSq(this);
        this.xF.MY(this.Cc).IlO(this.tl).IlO(arrayList).EO(this.cL).tV(this.es).MY("embeded_ad").MY(this.oeT).IlO(this).IlO(this.HSR).IlO(this.tV).IlO(this.Cc).Cc(this.tl.tcT());
        Cc();
    }

    protected void onStart() {
        super.onStart();
        Cc cc = this.HSR;
        if (cc != null) {
            cc.NV();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity
    protected void onResume() throws JSONException {
        super.onResume();
        com.bytedance.sdk.openadsdk.core.vSq vsq = this.xF;
        if (vsq != null) {
            vsq.EV();
            vCE vce = this.Cc;
            if (vce != null) {
                this.xF.MY(vce.getVisibility() == 0);
            }
        }
        com.bytedance.sdk.openadsdk.core.vSq vsq2 = this.AXM;
        if (vsq2 != null) {
            vsq2.EV();
        }
        lEW lew = this.BS;
        if (lew != null) {
            lew.EO(true);
        }
        EV ev = this.AK;
        if (ev != null) {
            ev.Bc();
        }
        if (DeviceUtils.Bc() == 0) {
            this.gQ = true;
        }
        EO(this.gQ);
        IlO ilO = this.Ea;
        if (ilO != null) {
            ilO.MY();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity
    protected void onPause() throws JSONException {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.vSq vsq = this.xF;
        if (vsq != null) {
            vsq.MY(false);
        }
        lEW lew = this.BS;
        if (lew != null) {
            lew.IlO(true);
            this.BS.EO(false);
        }
        IlO ilO = this.Ea;
        if (ilO != null) {
            ilO.EO();
        }
    }

    protected void onStop() {
        super.onStop();
        Cc cc = this.HSR;
        if (cc != null) {
            cc.DmF();
        }
        EV ev = this.AK;
        if (ev != null) {
            ev.lEW();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        Cc cc = this.HSR;
        if (cc != null) {
            cc.lEW();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity
    protected void onDestroy() {
        super.onDestroy();
        IlO ilO = this.Ea;
        if (ilO != null) {
            ilO.tV();
        }
        Cc cc = this.HSR;
        if (cc != null) {
            cc.IlO(true);
            this.HSR.rp();
        }
        this.OOq.removeCallbacksAndMessages((Object) null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.lMM)) {
            EO.IlO.IlO(this.YA.get(), this.nvX.get(), this.tl);
        }
        MY.IlO().IlO(this.ssS);
        vCE vce = this.Cc;
        if (vce != null) {
            nvX.IlO(vce.getWebView());
            this.Cc.zPa();
        }
        this.Cc = null;
        com.bytedance.sdk.openadsdk.core.vSq vsq = this.xF;
        if (vsq != null) {
            vsq.rp();
        }
        com.bytedance.sdk.openadsdk.core.vSq vsq2 = this.AXM;
        if (vsq2 != null) {
            vsq2.rp();
        }
        lEW lew = this.BS;
        if (lew != null) {
            lew.YA();
        }
        EV ev = this.AK;
        if (ev != null) {
            ev.tV(true);
        }
        tl tlVar = this.IlO;
        if (tlVar != null) {
            tlVar.MY();
        }
    }

    public void IlO(Message message) throws JSONException {
        int i = message.what;
        if (i == 1) {
            BS.IlO(this.NV, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        NV nv = this.zPa;
        if (nv == null || !nv.tV()) {
            new StringBuilder("playable hidden loading , type:").append(message.arg1);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.vAh);
                NV nv2 = this.zPa;
                jSONObject.put("duration", nv2 != null ? nv2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.oeT.IlO("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.tV.EO.MY(this.tl, "embeded_ad", "remove_loading_page", jSONObject);
            this.OOq.removeMessages(2);
            NV nv3 = this.zPa;
            if (nv3 != null) {
                nv3.EO();
            }
        }
    }

    public void IlO(boolean z) {
        com.bytedance.sdk.openadsdk.es.IlO.IlO.vCE vce;
        this.wPn = true;
        this.oc = z;
        if (!z) {
            try {
                Toast.makeText(this.hp, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.oc || (vce = this.vSq) == null) {
            return;
        }
        vce.tV();
    }

    protected void MY() {
        if (this.tl == null || isFinishing()) {
            return;
        }
        if (this.EO.get()) {
            rp();
            return;
        }
        if (this.IlO == null) {
            EO();
        }
        this.IlO.IlO(new tl.IlO() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            public void IlO() {
            }

            public void IlO(int i, String str) {
                if (TTPlayableLandingPageActivity.this.EO.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.EO.set(true);
                TTPlayableLandingPageActivity.this.hp();
            }
        });
        tl tlVar = this.IlO;
        if (tlVar != null) {
            tlVar.IlO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void EO() {
        if (this.tl != null) {
            this.IlO = new com.bytedance.sdk.openadsdk.EO.EO(this, this.tl.KT(), this.tl.cJK(), this.tl.eDn().toString(), "playable");
        }
        if (this.MY == null) {
            this.MY = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.MY);
        }
    }

    private void rp() {
        TTAdDislikeToast tTAdDislikeToast = this.MY;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hp() {
        TTAdDislikeToast tTAdDislikeToast = this.MY;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void EO(boolean z) {
        Drawable drawableIlO;
        try {
            this.gQ = z;
            if (z) {
                drawableIlO = com.bytedance.sdk.openadsdk.utils.EV.IlO(this.hp, "tt_mute_wrapper");
            } else {
                drawableIlO = com.bytedance.sdk.openadsdk.utils.EV.IlO(this.hp, "tt_unmute_wrapper");
            }
            this.rp.setImageDrawable(drawableIlO);
            lEW lew = this.BS;
            if (lew != null) {
                lew.IlO(z);
            }
            IlO ilO = this.Ea;
            if (ilO != null) {
                ilO.IlO(z);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.oeT.EO("TTPWPActivity", e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void bWL() {
        com.bytedance.sdk.openadsdk.core.MY.IlO ilO = new com.bytedance.sdk.openadsdk.core.MY.IlO(this, this.tl, "embeded_ad", this.oeT) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            public void IlO(View view, float f, float f2, float f3, float f4, SparseArray<EO.IlO> sparseArray, boolean z) throws JSONException {
                if (this.vCE == null || this.vCE.tl() != 1 || z) {
                    super.IlO(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.wPn = true;
                    TTPlayableLandingPageActivity.this.oc = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.vAh);
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.oeT.IlO("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.tV.EO.MY(TTPlayableLandingPageActivity.this.tl, this.Bc, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        ilO.IlO(this.vSq);
        IlO ilO2 = this.Ea;
        if (ilO2 != null) {
            ilO2.IlO(ilO);
        }
    }
}
