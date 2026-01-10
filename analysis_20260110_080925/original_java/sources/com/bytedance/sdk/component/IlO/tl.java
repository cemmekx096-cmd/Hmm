package com.bytedance.sdk.component.IlO;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tl extends IlO {
    static final /* synthetic */ boolean NV = true;
    protected WebView DmF;
    protected String lEW;

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected Context IlO(NV nv) {
        if (nv.Cc != null) {
            return nv.Cc;
        }
        if (nv.IlO != null) {
            return nv.IlO.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected String IlO() {
        return this.DmF.getUrl();
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected void MY(NV nv) {
        this.DmF = nv.IlO;
        this.lEW = nv.EO;
        if (Build.VERSION.SDK_INT < 17 || nv.bWL) {
            return;
        }
        EO();
    }

    protected void EO() {
        if (!NV && this.DmF == null) {
            throw new AssertionError();
        }
        PangleNetworkBridge.onAddedJavascriptInterface(this.DmF, this, this.lEW);
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected void MY() {
        super.MY();
        tV();
    }

    protected void tV() {
        this.DmF.removeJavascriptInterface(this.lEW);
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected void IlO(String str, zPa zpa) {
        if (zpa != null && !TextUtils.isEmpty(zpa.lEW)) {
            String str2 = zpa.lEW;
            IlO(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.IlO(str, zpa);
    }

    @Override // com.bytedance.sdk.component.IlO.IlO
    protected void IlO(String str) {
        IlO(str, "javascript:" + this.lEW + "._handleMessageFromToutiao(" + str + ")");
    }

    private void IlO(String str, final String str2) {
        if (this.vCE || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.IlO.tl.1
            @Override // java.lang.Runnable
            public void run() {
                if (tl.this.vCE) {
                    return;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        new StringBuilder("Invoking Jsb using evaluateJavascript: ").append(str2);
                        tl.this.DmF.evaluateJavascript(str2, null);
                    } else {
                        new StringBuilder("Invoking Jsb using loadUrl: ").append(str2);
                        PangleNetworkBridge.webviewLoadUrl(tl.this.DmF, str2);
                    }
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.tV.post(runnable);
        } else {
            runnable.run();
        }
    }
}
