package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.DmF.vCE;
import com.bytedance.sdk.component.utils.MY;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.widget.IlO.vCE;
import com.bytedance.sdk.openadsdk.tV.EO;
import com.bytedance.sdk.openadsdk.tV.MY.IlO;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class zPa {
    private ImageView Bc;
    private final Context Cc;
    private final oeT EO;
    private final LinearLayout IlO;
    private final vCE MY;
    private vCE.IlO lEW;
    private final String tV;
    private ImageView vCE;

    public zPa(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.DmF.vCE vce, oeT oet, String str) {
        this.Cc = context;
        this.IlO = linearLayout;
        this.MY = vce;
        this.EO = oet;
        this.tV = str;
        EO();
    }

    private void EO() {
        this.vCE = (ImageView) this.IlO.findViewById(com.bytedance.sdk.openadsdk.utils.zPa.gm);
        this.Bc = (ImageView) this.IlO.findViewById(com.bytedance.sdk.openadsdk.utils.zPa.aa);
        ImageView imageView = (ImageView) this.IlO.findViewById(com.bytedance.sdk.openadsdk.utils.zPa.ED);
        ImageView imageView2 = (ImageView) this.IlO.findViewById(com.bytedance.sdk.openadsdk.utils.zPa.PTq);
        this.vCE.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zPa.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zPa$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_zPa$1_onClick_67d99a51c8131348ef7d0203527dca44(view);
            }

            public void safedk_zPa$1_onClick_67d99a51c8131348ef7d0203527dca44(View p0) throws JSONException {
                if (zPa.this.MY == null || !zPa.this.MY.DmF()) {
                    return;
                }
                if (zPa.this.lEW != null) {
                    zPa.this.lEW.IlO();
                }
                zPa.this.IlO(ToolBar.BACKWARD);
                zPa.this.MY.NV();
            }
        });
        this.Bc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zPa.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zPa$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_zPa$2_onClick_7e19cd8874aac842dba7e93e801b48a7(view);
            }

            public void safedk_zPa$2_onClick_7e19cd8874aac842dba7e93e801b48a7(View p0) throws JSONException {
                if (zPa.this.MY == null || !zPa.this.MY.EV()) {
                    return;
                }
                zPa.this.IlO(ToolBar.FORWARD);
                zPa.this.MY.rp();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zPa.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zPa$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_zPa$3_onClick_13b0b58e10751f5cdb68fb20dcdb5214(view);
            }

            public void safedk_zPa$3_onClick_13b0b58e10751f5cdb68fb20dcdb5214(View p0) throws JSONException {
                if (zPa.this.MY != null) {
                    zPa.this.MY(ToolBar.REFRESH);
                    zPa.this.MY.lEW();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zPa.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zPa$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_zPa$4_onClick_5d644c0449f9e8c1d8c0b216152493e0(view);
            }

            public void safedk_zPa$4_onClick_5d644c0449f9e8c1d8c0b216152493e0(View p0) throws JSONException {
                if (zPa.this.MY != null) {
                    zPa.this.MY("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = zPa.this.MY.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    MY.IlO(zPa.this.Cc, intent, (MY.MY) null);
                }
            }
        });
        this.IlO.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zPa.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zPa$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked("com.bytedance.sdk", view);
                safedk_zPa$5_onClick_b5c4e0a71696c622ebac836b54104575(view);
            }

            public void safedk_zPa$5_onClick_b5c4e0a71696c622ebac836b54104575(View p0) {
            }
        });
        this.vCE.setClickable(false);
        this.Bc.setClickable(false);
        this.vCE.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.Bc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void IlO(WebView webView, vCE.IlO ilO) {
        this.lEW = ilO;
        try {
            if (this.vCE != null) {
                if (webView.canGoBack()) {
                    this.vCE.setClickable(true);
                    this.vCE.clearColorFilter();
                } else {
                    this.vCE.setClickable(false);
                    this.vCE.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.Bc != null) {
                if (webView.canGoForward()) {
                    this.Bc.setClickable(true);
                    this.Bc.clearColorFilter();
                } else {
                    this.Bc.setClickable(false);
                    this.Bc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void IlO() {
        if (this.IlO.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.IlO, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public void MY() {
        if (this.IlO.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.IlO, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IlO(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.MY.getWebView() != null && (webBackForwardListCopyBackForwardList = this.MY.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.MY.getUrl();
                }
                String url2 = BuildConfig.FLAVOR;
                if (str.equals(ToolBar.BACKWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        EO.IlO(System.currentTimeMillis(), this.EO, this.tV, str, jSONObject, (com.bytedance.sdk.openadsdk.tV.Bc) null, (IlO) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MY(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.MY.getWebView() != null && (webBackForwardListCopyBackForwardList = this.MY.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.MY.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        EO.IlO(System.currentTimeMillis(), this.EO, this.tV, str, jSONObject, (com.bytedance.sdk.openadsdk.tV.Bc) null, (IlO) null);
    }
}
