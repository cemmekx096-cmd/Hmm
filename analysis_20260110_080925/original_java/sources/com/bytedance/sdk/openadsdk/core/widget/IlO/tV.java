package com.bytedance.sdk.openadsdk.core.widget.IlO;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.bWL;
import com.bytedance.sdk.openadsdk.core.vSq;
import com.bytedance.sdk.openadsdk.tV.EV;
import com.bytedance.sdk.openadsdk.utils.xF;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tV extends WebChromeClient {
    private static final String IlO = WebChromeClient.class.getSimpleName();
    private EV EO;
    private final vSq MY;
    private com.bytedance.sdk.openadsdk.common.tV tV;

    public tV(vSq vsq) {
        this.MY = vsq;
    }

    public tV(vSq vsq, EV ev, com.bytedance.sdk.openadsdk.common.tV tVVar) {
        this(vsq, ev);
        this.tV = tVVar;
    }

    public tV(vSq vsq, EV ev) {
        this.MY = vsq;
        this.EO = ev;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            IlO(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !IlO(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    private boolean IlO(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                bWL.EO().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.IlO.tV.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xF.IlO(Uri.parse(str), tV.this.MY);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        EV ev = this.EO;
        if (ev != null) {
            ev.IlO(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.tV tVVar = this.tV;
        if (tVVar != null) {
            tVVar.IlO(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
