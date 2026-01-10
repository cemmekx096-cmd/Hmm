package com.bytedance.sdk.openadsdk.hp;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.DmF.vCE;
import com.bytedance.sdk.openadsdk.Bc.MY;
import com.bytedance.sdk.openadsdk.core.model.cl;
import com.bytedance.sdk.openadsdk.core.model.es;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.model.wPn;
import com.bytedance.sdk.openadsdk.core.widget.IlO.Cc;
import com.bytedance.sdk.openadsdk.core.widget.IlO.EO;
import com.bytedance.sdk.openadsdk.tV.EV;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.crashlytics.android.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO {
    private static int EO = 2;
    private static volatile IlO IlO = null;
    private static long tV = 3600000;
    private LinkedHashMap<Integer, SoftReference<vCE>> Cc;
    private final Handler MY;

    public static IlO IlO() {
        if (IlO == null) {
            synchronized (IlO.class) {
                if (IlO == null) {
                    IlO = new IlO();
                }
            }
        }
        return IlO;
    }

    public IlO() {
        EO = com.bytedance.sdk.openadsdk.AXM.IlO.IlO("pre_render_count", 2);
        long jIlO = com.bytedance.sdk.openadsdk.AXM.IlO.IlO("pre_render_duration", 3600000);
        tV = jIlO;
        if (EO <= 0) {
            EO = 2;
        }
        if (jIlO <= 0) {
            tV = 3600000L;
        }
        this.Cc = new LinkedHashMap<>();
        this.MY = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.hp.IlO.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i = message.what;
                if (IlO.this.Cc == null || (softReference = (SoftReference) IlO.this.Cc.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                vCE vce = (vCE) softReference.get();
                IlO.this.IlO(i, 2, (oeT) new wPn(), vce == null ? BuildConfig.FLAVOR : vce.getTag());
                return false;
            }
        });
    }

    public void IlO(final oeT oet) {
        final String str;
        if (oet == null || !EO(oet)) {
            return;
        }
        cl clVarZPa = oet.zPa();
        if (clVarZPa == null) {
            clVarZPa = new cl();
        }
        Object[] objArr = new Object[2];
        Boolean.valueOf(oet.CuC());
        if (oet.CuC()) {
            String strPFe = oet.pFe();
            if (TextUtils.isEmpty(strPFe)) {
                return;
            }
            final int iHashCode = strPFe.hashCode();
            if (es.MY(oet)) {
                str = "landingpage_split_screen";
            } else if (es.tV(oet)) {
                str = "landingpage_direct";
            } else {
                str = es.EO(oet) ? "landingpage_split_ceiling" : BuildConfig.FLAVOR;
            }
            LinkedHashMap<Integer, SoftReference<vCE>> linkedHashMap = this.Cc;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(oet.tU(), oet);
                if (clVarZPa.MY() == 2) {
                    MY.IlO().IlO(map, new MY.IlO() { // from class: com.bytedance.sdk.openadsdk.hp.IlO.2
                        public void IlO() {
                            IlO.this.IlO(iHashCode, oet, str, true);
                        }
                    }, true);
                    return;
                }
                if (clVarZPa.MY() == 1) {
                    MY.IlO().IlO(map, (MY.IlO) null, true);
                    IlO(iHashCode, oet, str, true);
                } else if (clVarZPa.MY() == 0) {
                    IlO(iHashCode, oet, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(final int i, final oeT oet, final String str, final boolean z) {
        Object[] objArr = new Object[2];
        Boolean.valueOf(z);
        mmj.IlO(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hp.IlO.3
            /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 383
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.hp.IlO.AnonymousClass3.run():void");
            }

            private Cc IlO(final vCE vce, EV ev) {
                Cc cc = new Cc(com.bytedance.sdk.openadsdk.core.cl.IlO(), null, oet.ED(), ev, true) { // from class: com.bytedance.sdk.openadsdk.hp.IlO.3.3
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded("com.bytedance.sdk", view, url);
                    }

                    public void onPageFinished(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/hp/IlO$3$3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                        BrandSafetyUtils.onWebViewPageFinished("com.bytedance.sdk", webView, str2);
                        safedk_IlO$3$3_onPageFinished_ed6ebb0354dbdb36134f6daba3e11276(webView, str2);
                    }

                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/hp/IlO$3$3;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                        BrandSafetyUtils.onWebViewPageStarted("com.bytedance.sdk", webView, str2);
                        safedk_IlO$3$3_onPageStarted_bae8a8cc0c3aa6dd6f1038214bb63258(webView, str2, bitmap);
                    }

                    public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/hp/IlO$3$3;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                        BrandSafetyUtils.onWebViewReceivedError("com.bytedance.sdk", webView, i2, str2, str3);
                        safedk_IlO$3$3_onReceivedError_3ea3ffd08163b0b936ccd6f96de4ea00(webView, i2, str2, str3);
                    }

                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/hp/IlO$3$3;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse("com.bytedance.sdk", webView, str2, safedk_IlO$3$3_shouldInterceptRequest_db3348edc659855240796a7dddd39a2d(webView, str2));
                    }

                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/hp/IlO$3$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                        boolean zSafedk_IlO$3$3_shouldOverrideUrlLoading_222097b7e549990d52872ead80b2c423 = safedk_IlO$3$3_shouldOverrideUrlLoading_222097b7e549990d52872ead80b2c423(webView, str2);
                        BrandSafetyUtils.onShouldOverrideUrlLoading("com.bytedance.sdk", webView, str2, zSafedk_IlO$3$3_shouldOverrideUrlLoading_222097b7e549990d52872ead80b2c423);
                        return zSafedk_IlO$3$3_shouldOverrideUrlLoading_222097b7e549990d52872ead80b2c423;
                    }

                    public boolean safedk_IlO$3$3_shouldOverrideUrlLoading_222097b7e549990d52872ead80b2c423(WebView p0, String p1) {
                        return super.shouldOverrideUrlLoading(p0, p1);
                    }

                    public void safedk_IlO$3$3_onPageFinished_ed6ebb0354dbdb36134f6daba3e11276(WebView p0, String p1) {
                        vCE vce2 = vce;
                        if (vce2 != null) {
                            vce2.setPreFinish(true);
                        }
                        super.onPageFinished(p0, p1);
                    }

                    public void safedk_IlO$3$3_onPageStarted_bae8a8cc0c3aa6dd6f1038214bb63258(WebView p0, String p1, Bitmap p2) {
                        vCE vce2 = vce;
                        if (vce2 != null) {
                            vce2.setPreStart(true);
                        }
                        super.onPageStarted(p0, p1, p2);
                    }

                    public void safedk_IlO$3$3_onReceivedError_3ea3ffd08163b0b936ccd6f96de4ea00(WebView p0, int p1, String p2, String p3) {
                        String strTV = tV(p3);
                        boolean z2 = strTV != null && strTV.startsWith(MimeTypes.BASE_TYPE_IMAGE);
                        boolean z3 = strTV != null && strTV.startsWith("mp4");
                        if (!z2 && !z3 && !vce.EO()) {
                            IlO.this.IlO(i, 4, oet, str);
                        }
                        super.onReceivedError(p0, p1, p2, p3);
                    }

                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            IlO.this.IlO(i, 4, oet, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    public WebResourceResponse safedk_IlO$3$3_shouldInterceptRequest_db3348edc659855240796a7dddd39a2d(WebView p0, String p1) {
                        try {
                            if (!z) {
                                return super.shouldInterceptRequest(p0, p1);
                            }
                            vCE vce2 = vce;
                            if (vce2 != null) {
                                vce2.IlO++;
                            }
                            WebResourceResponseModel webResourceResponseModelIlO = MY.IlO().IlO(MY.IlO().MY(), oet.tU(), p1);
                            if (webResourceResponseModelIlO != null && webResourceResponseModelIlO.getWebResourceResponse() != null) {
                                vCE vce3 = vce;
                                if (vce3 != null) {
                                    vce3.MY++;
                                }
                                return webResourceResponseModelIlO.getWebResourceResponse();
                            }
                            if (vce != null && webResourceResponseModelIlO != null && webResourceResponseModelIlO.getMsg() == 2) {
                                vce.EO++;
                            }
                            return super.shouldInterceptRequest(p0, p1);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(p0, p1);
                        }
                    }
                };
                cc.IlO(oet);
                cc.IlO(str);
                return cc;
            }
        });
    }

    public vCE MY(oeT oet) {
        if (oet == null || TextUtils.isEmpty(oet.pFe())) {
            return null;
        }
        String strPFe = oet.pFe();
        if (TextUtils.isEmpty(strPFe)) {
            return null;
        }
        int iHashCode = strPFe.hashCode();
        SoftReference<vCE> softReference = this.Cc.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        vCE vce = softReference.get();
        IlO(oet, vce.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - oet.ZUt()).floatValue(), "web_use_pre_render");
        IlO(iHashCode, 3, oet, vce.getTag());
        return vce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(int i, int i2, oeT oet, String str) {
        LinkedHashMap<Integer, SoftReference<vCE>> linkedHashMap = this.Cc;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.Cc.remove(Integer.valueOf(i));
        }
        Handler handler = this.MY;
        if (handler != null) {
            handler.removeMessages(i);
        }
        IlO(oet, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(vCE vce, String str) {
        if (vce == null) {
            return;
        }
        EO.IlO(com.bytedance.sdk.openadsdk.core.cl.IlO()).IlO(false).MY(false).IlO(vce.getWebView());
        if (Build.VERSION.SDK_INT >= 21) {
            vce.setMixedContentMode(0);
        }
        Object[] objArr = new Object[2];
        com.bytedance.sdk.openadsdk.utils.oeT.IlO(vce, str);
    }

    public static boolean EO(oeT oet) {
        return es.vCE(oet) || es.MY(oet) || es.EO(oet);
    }

    public static void IlO(oeT oet, String str, final float f, String str2) {
        com.bytedance.sdk.openadsdk.tV.EO.IlO(System.currentTimeMillis(), oet, str, str2, new com.bytedance.sdk.openadsdk.ea.EO.IlO() { // from class: com.bytedance.sdk.openadsdk.hp.IlO.4
            public JSONObject IlO() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f);
                } catch (Throwable unused) {
                }
                Object[] objArr = new Object[2];
                Float.valueOf(f);
                return jSONObject;
            }
        });
    }

    public static void IlO(oeT oet, final String str, final int i) {
        com.bytedance.sdk.openadsdk.tV.EO.IlO(System.currentTimeMillis(), oet, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.ea.EO.IlO() { // from class: com.bytedance.sdk.openadsdk.hp.IlO.5
            public JSONObject IlO() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(AdOperationMetric.REASON, i);
                    jSONObject2.put("pag_json_data", jSONObject3.toString());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                Object[] objArr = new Object[3];
                jSONObject2.toString();
                return jSONObject;
            }
        });
    }
}
