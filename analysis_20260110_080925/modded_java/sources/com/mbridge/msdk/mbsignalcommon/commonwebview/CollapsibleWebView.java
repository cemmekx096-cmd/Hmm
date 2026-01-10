package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class CollapsibleWebView extends CommonWebView {
    private CopyOnWriteArrayList<CommonWebView.h> v;
    private CopyOnWriteArrayList<CommonWebView.h> w;
    private CopyOnWriteArrayList<e> x;
    private String y;
    private String z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    class c implements CommonWebView.i {
        c() {
        }

        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b((View) ((CommonWebView) collapsibleWebView).j, str);
        }
    }

    class d extends WebViewClient {
        Boolean a = Boolean.FALSE;
        String b = BuildConfig.FLAVOR;

        d() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.mintegral.msdk", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CollapsibleWebView$d;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewPageFinished("com.mintegral.msdk", webView, str);
            safedk_CollapsibleWebView$d_onPageFinished_842a2dc0942cc93ddbf87fc74c1abde4(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CollapsibleWebView$d;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted("com.mintegral.msdk", webView, str);
            safedk_CollapsibleWebView$d_onPageStarted_e7c879e18bd7861874e689649fa92a89(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/commonwebview/CollapsibleWebView$d;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError("com.mintegral.msdk", webView, i, str, str2);
            safedk_CollapsibleWebView$d_onReceivedError_eaf314bdc31ccd558e59cdbf2dc67968(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap map = new HashMap();
            map.put("type", "ssl");
            map.put("url", sslError.getUrl());
            map.put("description", "ssl error");
            if (!this.a.booleanValue() && this.b.equals(sslError.getUrl() + BuildConfig.FLAVOR)) {
                this.a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            o0.b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }

        public void safedk_CollapsibleWebView$d_onPageFinished_842a2dc0942cc93ddbf87fc74c1abde4(WebView p0, String p1) {
            if (this.a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a(p0, p1);
            this.a = Boolean.FALSE;
        }

        public void safedk_CollapsibleWebView$d_onPageStarted_e7c879e18bd7861874e689649fa92a89(WebView p0, String p1, Bitmap p2) {
            if (TextUtils.isEmpty(p1)) {
                return;
            }
            this.b = p1;
        }

        public void safedk_CollapsibleWebView$d_onReceivedError_eaf314bdc31ccd558e59cdbf2dc67968(WebView p0, int p1, String p2, String p3) {
            HashMap map = new HashMap();
            map.put("type", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            map.put("url", p3);
            map.put("description", p2);
            if (!this.a.booleanValue()) {
                String p22 = this.b;
                if (p22.equals(p3)) {
                    this.a = Boolean.TRUE;
                    CollapsibleWebView.this.b(p0, map);
                }
            }
            CollapsibleWebView.this.a(p0, map);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.mintegral.msdk", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.mintegral.msdk", view, url, zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap map = new HashMap();
            map.put("type", "http");
            int i = Build.VERSION.SDK_INT;
            String str = BuildConfig.FLAVOR;
            if (i >= 21) {
                String str2 = webResourceRequest.getUrl() + BuildConfig.FLAVOR;
                map.put("url", str2);
                map.put("statusCode", webResourceResponse.getStatusCode() + BuildConfig.FLAVOR);
                str = str2;
            } else {
                map.put("url", "unknow_url");
                map.put("statusCode", "unknow_url");
            }
            map.put("description", "http error");
            if (!this.a.booleanValue() && (this.b.equals(str) || TextUtils.isEmpty(this.b))) {
                this.a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }
    }

    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.v.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("mbridge_arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("mbridge_arrow_up_black").a(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.mintegral.msdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    public String getCollapseIconName() {
        return this.y;
    }

    public String getExpandIconName() {
        return this.z;
    }

    public void init() {
        super.init();
        this.v = new CopyOnWriteArrayList<>();
        this.w = new CopyOnWriteArrayList<>();
        this.x = new CopyOnWriteArrayList<>();
        this.y = "mbridge_arrow_down_white_blackbg";
        this.z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList arrayList = new ArrayList();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setCollapseIconName(String str) {
        this.y = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.v.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((CommonWebView) this).c.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        ((CommonWebView) this).c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.z = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.w.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.x.add(eVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}
